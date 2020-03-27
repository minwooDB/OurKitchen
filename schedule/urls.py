from django.contrib import admin
from django.urls import path
from . import views


app_name = 'schedule'

urlpatterns = [
    path('', index, name='index'),
    path('all_events/', all_events, name='all_events'),
]