package dev.redfox.networkaccessstorage.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Ldev/redfox/networkaccessstorage/networking/NasApiInterface;", "", "getWebUrl", "Lretrofit2/Response;", "", "Ldev/redfox/networkaccessstorage/models/WebUrlResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginApi", "Ldev/redfox/networkaccessstorage/models/LoginResponseData;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "", "upload", "Ldev/redfox/networkaccessstorage/models/WriteResponseData;", "productImage", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
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
    @retrofit2.http.GET(value = "readByMobile")
    public abstract java.lang.Object getWebUrl(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WebUrlResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "write")
    @retrofit2.http.Multipart
    public abstract java.lang.Object upload(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part productImage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WriteResponseData>>> continuation);
}