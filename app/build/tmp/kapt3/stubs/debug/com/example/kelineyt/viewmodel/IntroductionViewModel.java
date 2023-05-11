package com.example.kelineyt.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kelineyt/viewmodel/IntroductionViewModel;", "Landroidx/lifecycle/ViewModel;", "sharedPreferences", "Landroid/content/SharedPreferences;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Landroid/content/SharedPreferences;Lcom/google/firebase/auth/FirebaseAuth;)V", "_navigate", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "navigate", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigate", "()Lkotlinx/coroutines/flow/StateFlow;", "startButtonClick", "", "Companion", "app_debug"})
public final class IntroductionViewModel extends androidx.lifecycle.ViewModel {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _navigate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> navigate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kelineyt.viewmodel.IntroductionViewModel.Companion Companion = null;
    public static final int SHOPPING_ACTIVITY = 23;
    public static final int ACCOUNT_OPTIONS_FRAGMENT = com.example.kelineyt.R.id.action_introductionFragment_to_accountOptionsFragment;
    
    @javax.inject.Inject()
    public IntroductionViewModel(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getNavigate() {
        return null;
    }
    
    public final void startButtonClick() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kelineyt/viewmodel/IntroductionViewModel$Companion;", "", "()V", "ACCOUNT_OPTIONS_FRAGMENT", "", "SHOPPING_ACTIVITY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}