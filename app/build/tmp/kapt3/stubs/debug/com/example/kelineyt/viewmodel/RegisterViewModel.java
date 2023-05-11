package com.example.kelineyt.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\nH\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/example/kelineyt/viewmodel/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "_register", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/kelineyt/util/Resource;", "Lcom/example/kelineyt/data/User;", "_validation", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/kelineyt/util/RegisterFieldsState;", "register", "Lkotlinx/coroutines/flow/Flow;", "getRegister", "()Lkotlinx/coroutines/flow/Flow;", "validation", "getValidation", "checkValidation", "", "user", "password", "", "createAccountWithEmailAndPassword", "", "saveUserInfo", "userUid", "app_debug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> _register = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> register = null;
    private final kotlinx.coroutines.channels.Channel<com.example.kelineyt.util.RegisterFieldsState> _validation = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.kelineyt.util.RegisterFieldsState> validation = null;
    
    @javax.inject.Inject()
    public RegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.kelineyt.util.Resource<com.example.kelineyt.data.User>> getRegister() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.kelineyt.util.RegisterFieldsState> getValidation() {
        return null;
    }
    
    public final void createAccountWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    com.example.kelineyt.data.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void saveUserInfo(java.lang.String userUid, com.example.kelineyt.data.User user) {
    }
    
    private final boolean checkValidation(com.example.kelineyt.data.User user, java.lang.String password) {
        return false;
    }
}