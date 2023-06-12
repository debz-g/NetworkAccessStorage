package dev.redfox.networkaccessstorage.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/redfox/networkaccessstorage/di/AppModule;", "Ldev/redfox/networkaccessstorage/utils/Constant;", "()V", "baseUrl", "", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "mClient", "getRetofitInstance", "Lretrofit2/Retrofit;", "getRetrofitService", "Ldev/redfox/networkaccessstorage/networking/NasApiInterface;", "retrofit", "provideBaseUrl", "setBaseUrl", "", "app_debug"})
@dagger.Module
public final class AppModule implements dev.redfox.networkaccessstorage.utils.Constant {
    @org.jetbrains.annotations.NotNull
    public static final dev.redfox.networkaccessstorage.di.AppModule INSTANCE = null;
    private static okhttp3.OkHttpClient mClient;
    private static java.lang.String baseUrl = "";
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.redfox.networkaccessstorage.networking.NasApiInterface getRetrofitService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final retrofit2.Retrofit getRetofitInstance() {
        return null;
    }
    
    public final void setBaseUrl(@org.jetbrains.annotations.NotNull
    java.lang.String baseUrl) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getBseUrl() {
        return null;
    }
}