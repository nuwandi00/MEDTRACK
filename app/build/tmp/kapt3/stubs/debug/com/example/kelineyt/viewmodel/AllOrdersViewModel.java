package com.example.kelineyt.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u0010R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kelineyt/viewmodel/AllOrdersViewModel;", "Landroidx/lifecycle/ViewModel;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "_allOrders", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/kelineyt/util/Resource;", "", "Lcom/example/kelineyt/data/order/Order;", "allOrders", "Lkotlinx/coroutines/flow/StateFlow;", "getAllOrders", "()Lkotlinx/coroutines/flow/StateFlow;", "", "app_debug"})
public final class AllOrdersViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.order.Order>>> _allOrders = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.order.Order>>> allOrders = null;
    
    @javax.inject.Inject()
    public AllOrdersViewModel(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.kelineyt.util.Resource<java.util.List<com.example.kelineyt.data.order.Order>>> getAllOrders() {
        return null;
    }
    
    public final void getAllOrders() {
    }
}