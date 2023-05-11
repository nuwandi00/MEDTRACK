package com.example.kelineyt.fragments.shopping;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020.H\u0002J\b\u00102\u001a\u00020.H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010#\u00a8\u00063"}, d2 = {"Lcom/example/kelineyt/fragments/shopping/ProductDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/kelineyt/fragments/shopping/ProductDetailsFragmentArgs;", "getArgs", "()Lcom/example/kelineyt/fragments/shopping/ProductDetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/kelineyt/databinding/FragmentProductDetailsBinding;", "colorsAdapter", "Lcom/example/kelineyt/adapters/ColorsAdapter;", "getColorsAdapter", "()Lcom/example/kelineyt/adapters/ColorsAdapter;", "colorsAdapter$delegate", "Lkotlin/Lazy;", "selectedColor", "", "Ljava/lang/Integer;", "selectedSize", "", "sizesAdapter", "Lcom/example/kelineyt/adapters/SizesAdapter;", "getSizesAdapter", "()Lcom/example/kelineyt/adapters/SizesAdapter;", "sizesAdapter$delegate", "viewModel", "Lcom/example/kelineyt/viewmodel/DetailsViewModel;", "getViewModel", "()Lcom/example/kelineyt/viewmodel/DetailsViewModel;", "viewModel$delegate", "viewPagerAdapter", "Lcom/example/kelineyt/adapters/ViewPager2Images;", "getViewPagerAdapter", "()Lcom/example/kelineyt/adapters/ViewPager2Images;", "viewPagerAdapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setupColorsRv", "setupSizesRv", "setupViewpager", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductDetailsFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.kelineyt.databinding.FragmentProductDetailsBinding binding;
    private final kotlin.Lazy viewPagerAdapter$delegate = null;
    private final kotlin.Lazy sizesAdapter$delegate = null;
    private final kotlin.Lazy colorsAdapter$delegate = null;
    private java.lang.Integer selectedColor;
    private java.lang.String selectedSize;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ProductDetailsFragment() {
        super();
    }
    
    private final com.example.kelineyt.fragments.shopping.ProductDetailsFragmentArgs getArgs() {
        return null;
    }
    
    private final com.example.kelineyt.adapters.ViewPager2Images getViewPagerAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.adapters.SizesAdapter getSizesAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.adapters.ColorsAdapter getColorsAdapter() {
        return null;
    }
    
    private final com.example.kelineyt.viewmodel.DetailsViewModel getViewModel() {
        return null;
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
    
    private final void setupViewpager() {
    }
    
    private final void setupColorsRv() {
    }
    
    private final void setupSizesRv() {
    }
}