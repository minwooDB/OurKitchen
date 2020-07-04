from django.shortcuts import render, redirect
from django.http import JsonResponse
from django.contrib.auth.forms import UserCreationForm, AuthenticationForm, UserChangeForm, PasswordChangeForm
from .forms import SignupForm, LoginForm
from django.contrib.auth import update_session_auth_hash    # 비밀번호 변경시 session_auth_hash 정보를 update
from django.contrib.auth import login as auth_login
from django.contrib.auth import logout as auth_logout
from django.contrib.auth import authenticate
from .models import User

def signup(request, classification):
    if request.user.is_authenticated:   # 인증된 유저가 요청을 보낸 경우, 회원가입 페이지를 보여주지 않고 목록 페이지로 redirect
        return redirect('index')
    if request.method == 'POST':
        form = SignupForm(request.POST)
        if form.is_valid():
            email = form.cleaned_data['email']
            name = form.cleaned_data['name']
            phone = form.cleaned_data['phone']
            password = form.cleaned_data['re_password']
            user = User.objects.create_user(email=email, name=name, phone=phone, classification=classification, password=password)
            auth_login(request, user)
            return redirect('index')
    elif request.method == "GET":
        form = SignupForm()
    return render(request, 'accounts/signup_form.html', {'form':form, 'classification':classification})

def check_signup(request):
    email = request.POST.get('email')
    name =  request.POST.get('name')
    phone = request.POST.get('phone')
    check_result = 0
    users = User.objects.all()[::-1]
    if request.method == 'POST':
        if email == '' or name == '' or phone == '':
            check_result = -1
        else:
            for user in users:
                if user.email == email:
                    check_result = -1
                    break
                if user.phone == phone:
                    check_result = -1
                    break
    data = {'check_result':check_result,}
    return JsonResponse(data)

def login(request):
    if request.user.is_authenticated:   # 인증된 유저가 요청을 보낸 경우, 로그인 페이지를 보여주지 않고 목록 페이지로 redirect
        return redirect('index')
    if request.method == 'POST':
        email = request.POST.get('email')
        password = request.POST.get('password')
        user = authenticate(email = email, password = password)
        if user is not None:
            auth_login(request, user)
            return redirect('index')
        else:
            form = LoginForm()
            return render(request, 'accounts/login_form.html', {'form':form, 'error_message':'아이디나 비밀번호가 일치하지 않습니다.'})
    else:
        form = LoginForm()
        return render(request, 'accounts/login_form.html', {'form':form, })
    

def logout(request):
    if request.method == 'POST':
        auth_logout(request)
    return redirect('index')

# def edit(request):
#     if request.method == 'POST':
#         form = UserCustomChangeForm(request.POST, instance=request.user)
#         if form.is_valid():
#             form.save()
#             return redirect('articles:index')
#     else:
#         form = UserCustomChangeForm(instance=request.user)
#         return render(request, 'accounts/auth_form.html', {'form':form})




