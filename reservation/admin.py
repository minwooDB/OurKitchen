from django.contrib import admin
from .models import Kitchen_info, Reservation


class Kitchen_info_Admin(admin.ModelAdmin):
    list_display = ('pk', 'kitchen_name', 'lat', 'lng', 'capacity')


class Reservation_Admin(admin.ModelAdmin):
    list_display = ('pk', 'start_date', 'end_date', 'time')


admin.site.register(Kitchen_info, Kitchen_info_Admin)
admin.site.register(Reservation, Reservation_Admin)