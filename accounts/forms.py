from django.contrib.auth.forms import AuthenticationForm
from django.forms import ModelForm
from accounts.models import User
from django import forms

class SignupForm(ModelForm):
    class Meta: 
        model = User
        fields = ['email', 'name', 'phone', 'password', 're_password']
        widgets = {
            'email':forms.EmailInput(
                attrs={
                    'label':'이메일',
                    'class':'form-control input-lg',
                    'id':'email',
                    'placeholder':'아이디로 사용할 이메일을 입력해주세요',
                    'required':'True'
                }
            ),
            'name':forms.TextInput(
                attrs={
                    'label':'이름',
                    'class':'form-control input-lg',
                    'id':'name',
                    'placeholder':'이름을 입력해주세요',
                    'required':'True'
                }
            ),
            'password':forms.PasswordInput(
                attrs={
                    'label':'비밀번호',
                    'class':'form-control input-lg',
                    'id':'password',
                    'placeholder':'비밀번호를 입력해주세요',
                    'required':'True',
                }
            ),
            're_password':forms.PasswordInput(
                attrs={
                    'label':'비밀번호 확인',
                    'class':'form-control input-lg',
                    'id':'re_password',
                    'placeholder':'비밀번호를 다시 한 번 입력해주세요',
                    'required':'True',
                }
            ),
            'phone':forms.TextInput(
                attrs={
                    'label':'전화번호',
                    'class':'form-control input-lg',
                    'id':'re_password',
                    'placeholder':"전화번호를 '-'없이 입력해주세요",
                    'required':'True',
                }
            )
        }
 
    def clean_re_password(self):
        cd = self.cleaned_data
        if cd['password'] and cd['re_password'] and cd['password'] != cd['re_password']:
            raise forms.ValidationError('비밀번호가 일치하지 않습니다.')
        return cd['re_password']

    def save(self, commit=True):
        user = super().save(commit=False)
        user.set_password(self.cleaned_data['re_password'])
        if commit:
            user.save()
        return user

class LoginForm(AuthenticationForm):
    email = forms.CharField(
        max_length=30,
        widget=forms.TextInput(
            attrs={
                'class': 'form-control input-lg',
                'id':'login_email_input',
                'required': 'True',
            }
        )
    )
    password = forms.CharField(
        widget=forms.PasswordInput(
            attrs={
                'class': 'form-control input-lg',
                'id':'login_password_input',
                'required': 'True',
            }
        )
    )