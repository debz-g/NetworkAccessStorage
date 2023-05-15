package dev.redfox.networkaccessstorage.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Ldev/redfox/networkaccessstorage/networking/NasApiInterface;", "", "loginApi", "Lretrofit2/Response;", "", "Ldev/redfox/networkaccessstorage/models/LoginResponseData;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upload", "Ldev/redfox/networkaccessstorage/models/WriteResponseData;", "productImage", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NasApiInterface {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded
    public abstract java.lang.Object loginApi(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.LoginResponseData>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "read")
    public abstract java.lang.Object read(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "write")
    @retrofit2.http.Multipart
    public abstract java.lang.Object upload(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part productImage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WriteResponseData>>> continuation);
}