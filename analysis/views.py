from django.shortcuts import render, redirect
from .models import Kitchen_info, Start_up, Movepop, stay_pop, Sales
import urllib.request
import requests
import pandas as pd
import folium
from decouple import config
from collections import Counter
import json

# 소상공인 API
token = config('TOKEN')

# 실제 기본 상권분석 페이지
def kitchen_map(request):
    kitchens = Kitchen_info.objects.all()
    name = list()
    lng = list()
    lat = list()
    for kitchen in kitchens:
        name.append(kitchen.kitchen_name)
        lng.append(kitchen.lng)
        lat.append(kitchen.lat)
    return render(request, 'analysis/map.html', {'name': name, "lng": lng, "lat": lat})


# 맵 생성
def radius(request, lat, lng, genre):
    store_id = list()
    store_code = list()
    store_lon = list()
    store_lat = list()
    street_names = list()
    map = folium.Map(location=[lat,lng], zoom_start=14)
    for j in range(1, 30):
        url = f'http://apis.data.go.kr/B553077/api/open/sdsc/storeListInRadius?radius=500&cx={lng}&cy={lat}&ServiceKey={token}&type=json&indsLclsCd=Q&pageNo={j}'
        res = requests.get(url).json()
        if res["header"]["resultCode"] != '00':
            break
        times = len(res["body"]["items"])
        for i in range(times):
            store_id.append(res["body"]["items"][i]["bizesId"])
            store_code.append(res["body"]["items"][i]["indsMclsNm"])
            store_lon.append(res["body"]["items"][i]["lon"])
            store_lat.append(res["body"]["items"][i]["lat"])
            street_name = res["body"]["items"][i]["rdnm"]
            street_name1 = street_name.split(' ')[2]
            street_names.append(street_name1)
        if Start_up:
            area_name = res["body"]["items"][0]["signguNm"]
            start_up = Start_up.objects.get(signgunm = area_name)
            close = start_up.close
            remain_term = start_up.remain_term 
            plma = start_up.plma
            danger = start_up.danger
        street_names_unique = pd.unique(street_names)
        times2 = len(street_names_unique)
        for k in range(times2):
            move_info = Movepop.objects.filter(rdnm = street_names_unique[k]).values()
            stay_info = stay_pop.objects.filter(rdnm = street_names_unique[k]).values()
            if move_info:
                break
    sales_info = Sales.objects.filter(rdnm = move_info[0]['rdnm'], store_code = genre).values()
    sales_info = sales_info[0].values()
    move_info = move_info[0].values()
    stay_info = stay_info[0].values()

    store_code_unique = pd.unique(store_code)
    piechart_value = Counter(store_code)
    pie_keys = list(piechart_value.keys())
    pie_values = piechart_value.values()
    return render(request, 'analysis/radius.html',{'sales_info':sales_info,'move_info':move_info,'stay_info':stay_info,'pie_keys':pie_keys,'pie_values':pie_values,'danger':danger,'lat':lat,'lng':lng,'store_id':store_id,'store_code':store_code,'store_lon':store_lon,'store_lat':store_lat, 'close':close, 'remain_term':remain_term, 'plma':plma })
