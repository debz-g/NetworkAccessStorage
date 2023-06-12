package dev.redfox.networkaccessstorage.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0016R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Ldev/redfox/networkaccessstorage/viewmodels/NasViewModel;", "Landroidx/lifecycle/ViewModel;", "nasRepository", "Ldev/redfox/networkaccessstorage/networking/NasRepository;", "(Ldev/redfox/networkaccessstorage/networking/NasRepository;)V", "_loginResponse", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "", "Ldev/redfox/networkaccessstorage/models/LoginResponseData;", "_uploadResponse", "Ldev/redfox/networkaccessstorage/models/WriteResponseData;", "_webUrlResponse", "Ldev/redfox/networkaccessstorage/models/WebUrlResponse;", "loginResponse", "getLoginResponse", "()Landroidx/lifecycle/MutableLiveData;", "uploadResponse", "getUploadResponse", "webUrlResponse", "getWebUrlResponse", "login", "", "email", "", "password", "upload", "file", "Lokhttp3/MultipartBody$Part;", "webUrl", "app_debug"})
public final class NasViewModel extends androidx.lifecycle.ViewModel {
    private final dev.redfox.networkaccessstorage.networking.NasRepository nasRepository = null;
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.LoginResponseData>>> _loginResponse = null;
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WriteResponseData>>> _uploadResponse = null;
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WebUrlResponse>>> _webUrlResponse = null;
    
    @javax.inject.Inject
    public NasViewModel(@org.jetbrains.annotations.NotNull
    dev.redfox.networkaccessstorage.networking.NasRepository nasRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.LoginResponseData>>> getLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WriteResponseData>>> getUploadResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<dev.redfox.networkaccessstorage.models.WebUrlResponse>>> getWebUrlResponse() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void upload(@org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part file) {
    }
    
    public final void webUrl() {
    }
}