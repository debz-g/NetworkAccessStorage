package dev.redfox.networkaccessstorage.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/redfox/networkaccessstorage/di/AppModule;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "mClient", "getRetofitInstance", "Lretrofit2/Retrofit;", "getRetrofitService", "Ldev/redfox/networkaccessstorage/networking/NasApiInterface;", "retrofit", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final dev.redfox.networkaccessstorage.di.AppModule INSTANCE = null;
    private static okhttp3.OkHttpClient mClient;
    
    private AppModule() {
        super();
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
}