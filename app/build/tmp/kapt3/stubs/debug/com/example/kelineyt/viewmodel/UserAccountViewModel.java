package com.example.kelineyt.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/example/kelineyt/viewmodel/UserAccountViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "storage", "Lcom/google/firebase/storage/StorageReference;", "app", "Landroid/app/Application;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/storage/StorageReference;Landroid/app/Application;)V", "_updateInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/kelineyt/util/Resource;", "Lcom/example/kelineyt/data/User;", "_user", "updateInfo", "Lkotlinx/coroutines/flow/StateFlow;", "getUpdateInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "user", "getUser", "", "saveUserInformation", "shouldRetrievedOldImage", "", "saveUserInformationWithNewImage", "imageUri", "Landroid/net/Uri;", "updateUser", "app_debug"})
public final class UserAccountViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private final com.google.firebase.storage.StorageReference storage = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> _user = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> user = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> _updateInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> updateInfo = null;
    
    @javax.inject.Inject()
    public UserAccountViewModel(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference storage, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> getUpdateInfo() {
        return null;
    }
    
    public final void getUser() {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    com.example.kelineyt.data.User user, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri) {
    }
    
    private final void saveUserInformationWithNewImage(com.example.kelineyt.data.User user, android.net.Uri imageUri) {
    }
    
    private final void saveUserInformation(com.example.kelineyt.data.User user, boolean shouldRetrievedOldImage) {
    }
}