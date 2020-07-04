from django.db import models
from django.conf import settings
from django.contrib.auth.models import (BaseUserManager, AbstractBaseUser)

class UserManager(BaseUserManager):
    def create_user(self, email, name, phone, classification, password=None):
        if not email:
            raise ValueError('Users must have an email')
        user = self.model(
            email = UserManager.normalize_email(email),
            name = name,
            phone = phone,
            classification = classification,
        )
        user.set_password(password)
        user.save(using=self._db)
        return user
    
    def create_superuser(self, email, name, phone, classification, password = None):
        user = self.create_superuser(
            email = email,
            name = name, 
            phone = phone,
            classification = classification,
            password = password,
        )
        user.is_admin = True
        user.save(using = self._db)
        return user

CLASSIFICATION_CHOICES = [
    ('p', 'parter'),
    ('u', 'user'),
]

class User(AbstractBaseUser):
    email = models.EmailField(
        verbose_name = 'email',
        max_length = 255,
        unique = True
    )
    name = models.CharField(
        verbose_name = 'name',
        max_length = 20,
        blank = False,
    )
    password = models.CharField(
        verbose_name = 'password',
        max_length = 12,
        blank = False,
    )
    re_password = models.CharField(
        verbose_name = 're_password',
        max_length = 12,
        blank = False,
    )
    classification = models.CharField(
        verbose_name = 'classification',
        choices = CLASSIFICATION_CHOICES,
        max_length = 3, 
    )
    phone = models.CharField(
        verbose_name = 'phone',
        max_length = 30,
        blank=False
    )
    is_active = models.BooleanField(default = True)
    is_admin = models.BooleanField(default=False)

    objects = UserManager()

    USERNAME_FIELD = 'email'
    REQUIRED_FIELDS = [ 'name', 'phone', 'name']

    def __str__(self):
        return self.email
    
    def has_perm(self, perm, obj = None):
        "Does the user have a specific permission?"
        return True
    
    def has_module_perms(self, app_label):
        "Does the user have permissions to view the app `app_label`?"
        return True

    @property
    def is_staff(self):
        "Is the user a member of staff?"
        return self.is_admin