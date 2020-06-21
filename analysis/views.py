from django.shortcuts import render, redirect
from .models import Kitchen_info, Startup, Floatingpop, Residentpop, Sales, IndustryCode
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
    pk = list()
    lng = list()
    lat = list()
    for kitchen in kitchens:
        name.append(kitchen.name)
        pk.append(kitchen.pk)
        lng.append(kitchen.lng)
        lat.append(kitchen.lat)
    return render(request, 'analysis/index.html', {'name': name, "lng": lng, "lat": lat, "pk": pk})


# 맵 생성
def radius(request, lat, lng, genre):
    # 지도에 표시할 store 정보
    store_id = list()
    store_code = list()
    store_name = list()
    store_lon = list()
    store_lat = list()
    store_dong = list()

    # 인근점표현황
    all_stores =list()
    all_rdnm = list()

    # 맵 생성
    map = folium.Map(location=[lat,lng], zoom_start=14)

    #
    pageNo = 1
    while pageNo>0 :
        url = f'http://apis.data.go.kr/B553077/api/open/sdsc/storeListInRadius?radius=500&cx={lng}&cy={lat}&ServiceKey={token}&type=json&indsLclsCd=Q&pageNo={pageNo}'
        res = requests.get(url).json()
        if res["header"]["resultCode"] != '00':
            break
        times = len(res["body"]["items"])
        for i in range(times):
            all_stores.append(res["body"]["items"][i]["indsMclsNm"])
            

            # 상권업종 분류코드 필터링
            if (res["body"]["items"][i]["indsMclsNm"]) == genre :
                store_id.append(res["body"]["items"][i]["bizesId"]) # 상가업소번호
                # store_code.append(res["body"]["items"][i]["indsMclsNm"]) # 상권업종중분류코드
                store_name.append(res["body"]["items"][i]["bizesNm"]) # 상호명
                store_lon.append(res["body"]["items"][i]["lon"])
                store_lat.append(res["body"]["items"][i]["lat"])
                
                dong =  res["body"]["items"][i]["ldongNm"]
                if dong not in store_dong :
                    store_dong.append(dong)
                    print(dong)

                    # 
                 
                   

        ### mychar1
        if Startup: # 창업지수
            area_name = res["body"]["items"][0]["signguNm"] # 지역구명
            startup = Startup.objects.get(signgunm = area_name)
            close = startup.close
            remain_term = startup.remain_term
            plma = startup.plma
            danger = startup.danger

        pageNo = pageNo +1

    #     street_names_unique = pd.unique(street_names)
    #     times2 = len(street_names_unique)
    #     for k in range(times2):
    #         move_info = Floatingpop.objects.filter(rdnm = street_names_unique[k]).values()
    #         stay_info = Residentpop.objects.filter(rdnm = street_names_unique[k]).values()
    #         if move_info:
    #             break
    # sales_info = Sales.objects.filter(rdnm = move_info[0]['rdnm'], store_code = genre).values()
    # sales_info = sales_info[0].values()
    for i in store_dong:
        move_info = Floatingpop.objects.filter(dong=i).values()
    # stay_info = stay_info[0].values()

    # store_code_unique = pd.unique(store_code)


    # 지역구 소속 도로명 찾기
    # floating = Floatingpop.objects.get(gu=area_name)
    # for i in floating :
    #     all_rdnm.append(floating.rdnm)
    
    # 업종별로 카운트
    piechart_value = Counter(all_stores)
    ### mychar2
    pie_keys = list(piechart_value.keys())
    pie_values = piechart_value.values()

    # print(move_info[0])

    return render(request, 'analysis/radius.html',{'pie_keys':pie_keys,'pie_values':pie_values,'danger':danger,'lat':lat,'lng':lng,
        'store_id':store_id,'store_code':store_code,'store_name':store_name,'store_lon':store_lon,'store_lat':store_lat, 'close':close,
        'remain_term':remain_term, 'plma':plma })
