package com.example.kelineyt.fragments.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kelineyt/fragments/categories/MedDevicesFragment;", "Lcom/example/kelineyt/fragments/categories/BaseCategoryFragment;", "()V", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setFirestore", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "viewModel", "Lcom/example/kelineyt/viewmodel/CategoryViewModel;", "getViewModel", "()Lcom/example/kelineyt/viewmodel/CategoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onBestProductsPagingRequest", "", "onOfferPagingRequest", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MedDevicesFragment extends com.example.kelineyt.fragments.categories.BaseCategoryFragment {
    @javax.inject.Inject()
    public com.google.firebase.firestore.FirebaseFirestore firestore;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MedDevicesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getFirestore() {
        return null;
    }
    
    public final void setFirestore(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kelineyt.viewmodel.CategoryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBestProductsPagingRequest() {
    }
    
    @java.lang.Override()
    public void onOfferPagingRequest() {
    }
}