package dev.redfox.networkaccessstorage.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006-"}, d2 = {"Ldev/redfox/networkaccessstorage/ui/UploadFileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "REQUEST_PICK_FILE", "", "_binding", "Ldev/redfox/networkaccessstorage/databinding/FragmentUploadFileBinding;", "binding", "getBinding", "()Ldev/redfox/networkaccessstorage/databinding/FragmentUploadFileBinding;", "contract", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "imageUri", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "nasViewModel", "Ldev/redfox/networkaccessstorage/viewmodels/NasViewModel;", "getNasViewModel", "()Ldev/redfox/networkaccessstorage/viewmodels/NasViewModel;", "nasViewModel$delegate", "Lkotlin/Lazy;", "getRealPathFromUri", "uri", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "pickFile", "uploadFile", "filePath", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class UploadFileFragment extends androidx.fragment.app.Fragment {
    private dev.redfox.networkaccessstorage.databinding.FragmentUploadFileBinding _binding;
    private final int REQUEST_PICK_FILE = 1;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri imageUri;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> contract = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy nasViewModel$delegate = null;
    
    public UploadFileFragment() {
        super();
    }
    
    private final dev.redfox.networkaccessstorage.databinding.FragmentUploadFileBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getImageUri() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.Nullable
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.redfox.networkaccessstorage.viewmodels.NasViewModel getNasViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void pickFile() {
    }
    
    private final java.lang.String getRealPathFromUri(android.net.Uri uri) {
        return null;
    }
    
    private final void uploadFile(java.lang.String filePath) {
    }
    
    @java.lang.Override
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
}