package dev.redfox.networkaccessstorage.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Ldev/redfox/networkaccessstorage/networking/NasRepository;", "", "nasApiInterface", "Ldev/redfox/networkaccessstorage/networking/NasApiInterface;", "(Ldev/redfox/networkaccessstorage/networking/NasApiInterface;)V", "login", "Lretrofit2/Response;", "", "Ldev/redfox/networkaccessstorage/models/LoginResponseData;", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upload", "Ldev/redfox/networkaccessstorage/models/WriteResponseData;", "file", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NasRepository {
    private final dev.redfox.networkaccessstorage.networking.NasApiInterface nasApiInterface = null;
    
    @javax.inject.Inject
    public NasRepository(@org.jetbrains.annotations.NotNull
    dev.redfox.networkaccessstorage.networking.NasApiInterface nasApiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.LoginResponseData>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object upload(@org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WriteResponseData>>> continuation) {
        return null;
    }
}