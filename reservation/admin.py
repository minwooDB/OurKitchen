from django.contrib import admin
from .models import Kitchen_info, Reservation


class ReservationAdmin(admin.ModelAdmin):
    list_display = ('pk', 'start_date', 'end_date', 'time')


admin.site.register(Reservation, ReservationAdmin)
