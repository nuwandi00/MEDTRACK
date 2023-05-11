package com.example.kelineyt.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kelineyt/viewmodel/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "category", "Lcom/example/kelineyt/data/Category;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/example/kelineyt/data/Category;)V", "_bestProducts", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/kelineyt/util/Resource;", "", "Lcom/example/kelineyt/data/Product;", "_offerProducts", "bestProducts", "Lkotlinx/coroutines/flow/StateFlow;", "getBestProducts", "()Lkotlinx/coroutines/flow/StateFlow;", "offerProducts", "getOfferProducts", "fetchBestProducts", "", "fetchOfferProducts", "app_debug"})
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.example.kelineyt.data.Category category = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.Product>>> _offerProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.Product>>> offerProducts = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.Product>>> _bestProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.Product>>> bestProducts = null;
    
    public CategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.example.kelineyt.data.Category category) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.Product>>> getOfferProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.Product>>> getBestProducts() {
        return null;
    }
    
    public final void fetchOfferProducts() {
    }
    
    public final void fetchBestProducts() {
    }
}