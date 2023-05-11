package com.example.kelineyt.fragments.shopping;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\"H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/example/kelineyt/fragments/shopping/BillingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addressAdapter", "Lcom/example/kelineyt/adapters/AddressAdapter;", "getAddressAdapter", "()Lcom/example/kelineyt/adapters/AddressAdapter;", "addressAdapter$delegate", "Lkotlin/Lazy;", "billingProductsAdapter", "Lcom/example/kelineyt/adapters/BillingProductsAdapter;", "getBillingProductsAdapter", "()Lcom/example/kelineyt/adapters/BillingProductsAdapter;", "billingProductsAdapter$delegate", "billingViewModel", "Lcom/example/kelineyt/viewmodel/BillingViewModel;", "getBillingViewModel", "()Lcom/example/kelineyt/viewmodel/BillingViewModel;", "billingViewModel$delegate", "binding", "Lcom/example/kelineyt/databinding/FragmentBillingBinding;", "orderViewModel", "Lcom/example/kelineyt/viewmodel/OrderViewModel;", "getOrderViewModel", "()Lcom/example/kelineyt/viewmodel/OrderViewModel;", "orderViewModel$delegate", "products", "", "Lcom/example/kelineyt/data/CartProduct;", "selectedAddress", "Lcom/example/kelineyt/data/Address;", "totalPrice", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupAddressRv", "setupBillingProductsRv", "showOrderConfirmationDialog", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BillingFragment extends androidx.fragment.app.Fragment {
    private com.example.kelineyt.databinding.FragmentBillingBinding binding;
    private final kotlin.Lazy addressAdapter$delegate = null;
    private final kotlin.Lazy billingProductsAdapter$delegate = null;
    private final kotlin.Lazy billingViewModel$delegate = null;
    private java.util.List<com.example.kelineyt.data.CartProduct> products;
    private float totalPrice = 0.0F;
    private com.example.kelineyt.data.Address selectedAddress;
    private final kotlin.Lazy orderViewModel$delegate = null;
    
    public BillingFragment() {
        super();
    }
    
    private final com.example.kelineyt.adapters.AddressAdapter getAddressAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.adapters.BillingProductsAdapter getBillingProductsAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.viewmodel.BillingViewModel getBillingViewModel() {
        return null;
    }
    
    private final com.example.kelineyt.viewmodel.OrderViewModel getOrderViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showOrderConfirmationDialog() {
    }
    
    private final void setupAddressRv() {
    }
    
    private final void setupBillingProductsRv() {
    }
}