from django.contrib import admin
from django.contrib.auth.admin import UserAdmin as BaseUserAdmin
from .forms import SignupForm
from .models import User

class UserAdmin(BaseUserAdmin):
    add_form = SignupForm

    list_display = ('email', 'name', 'is_admin',)
    list_filter = ('is_admin',)
    fieldsets = (
        (None, {'fields' : ('email', 'password',)}),
        ('Personal info', {'fields' : ('name', 'phone', 'classification',)}),
        ('Permissions', {'fields' : ('is_admin',)}),
    )

    add_fieldsets = (
        (None, {
            'classes' : ('wide',),
            'fields' : ('email', 'name', 'classification', 'phone', 'password',)
        }),
    )
    
    search_fields = ('email',)
    ordering = ('email',)
    filter_horizontal = ()

admin.site.register(User, UserAdmin)