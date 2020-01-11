from django.contrib import admin
from django.urls import path
from . import views

app_name = 'analysis'

urlpatterns = [
    path('<str:lat>/<str:lng>/<str:genre>', views.radius, name='radius'),
    path('', views.kitchen_map, name='kitchen_map'),
]
