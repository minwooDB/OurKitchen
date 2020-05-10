import csv
from decouple import config
import urllib.request
import requests
import json


# 도로명주소 API
token = config('CONFM_KEY')

header=[]
rownum=0
with open('data/sales_new3.csv',"r",encoding="utf-8") as f:
    csv_data = csv.reader(f)
    with open('data/output.csv', 'w',encoding='utf-8', newline='') as csvoutput:
        writer = csv.writer(csvoutput)
        for row in csv_data:
            if rownum == 0:
                header = row
                # emdNm='emdNm'
            else:
                all=[]
                url = f'http://www.juso.go.kr/addrlink/addrLinkApi.do?currentPage=1&countPerPage=10&keyword={row[1]}&confmKey={token}&resultType=json'
                res = requests.get(url).json()
                if res["results"]["juso"][0]["emdNm"]:
                    emdNm=res["results"]["juso"][0]["emdNm"]
                    for i in row:
                            all.append(i)
                    all.append(emdNm)
                    print(all)
                    writer.writerow(all)
            rownum=rownum+1