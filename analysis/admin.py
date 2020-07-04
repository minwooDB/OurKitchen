from django.contrib import admin
from .models import Kitchen_info, IndustryCode


class Kitchen_info_Admin(admin.ModelAdmin):
    list_display = ('pk', 'name', 'lat', 'lng', 'address', 'capacity')

class IndustryCode_Admin(admin.ModelAdmin):
    list_display = ('pk', 'name', 'code')

admin.site.register(Kitchen_info, Kitchen_info_Admin)
admin.site.register(IndustryCode, IndustryCode_Admin)
