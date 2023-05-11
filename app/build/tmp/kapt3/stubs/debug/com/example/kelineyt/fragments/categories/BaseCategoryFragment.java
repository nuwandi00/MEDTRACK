package com.example.kelineyt.fragments.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u000fR\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\""}, d2 = {"Lcom/example/kelineyt/fragments/categories/BaseCategoryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bestProductsAdapter", "Lcom/example/kelineyt/adapters/BestProductsAdapter;", "getBestProductsAdapter", "()Lcom/example/kelineyt/adapters/BestProductsAdapter;", "bestProductsAdapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/kelineyt/databinding/FragmentBaseCategoryBinding;", "offerAdapter", "getOfferAdapter", "offerAdapter$delegate", "hideBestProductsLoading", "", "hideOfferLoading", "onBestProductsPagingRequest", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOfferPagingRequest", "onResume", "onViewCreated", "view", "setupBestProductsRv", "setupOfferRv", "showBestProductsLoading", "showOfferLoading", "app_debug"})
public class BaseCategoryFragment extends androidx.fragment.app.Fragment {
    private com.example.kelineyt.databinding.FragmentBaseCategoryBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy offerAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bestProductsAdapter$delegate = null;
    
    public BaseCategoryFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.example.kelineyt.adapters.BestProductsAdapter getOfferAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.example.kelineyt.adapters.BestProductsAdapter getBestProductsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    public final void showOfferLoading() {
    }
    
    public final void hideOfferLoading() {
    }
    
    public final void showBestProductsLoading() {
    }
    
    public final void hideBestProductsLoading() {
    }
    
    public void onOfferPagingRequest() {
    }
    
    public void onBestProductsPagingRequest() {
    }
    
    private final void setupBestProductsRv() {
    }
    
    private final void setupOfferRv() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}