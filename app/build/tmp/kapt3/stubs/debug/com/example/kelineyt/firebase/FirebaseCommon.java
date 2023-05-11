package com.example.kelineyt.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\"\u0010\r\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\n0\u000eJ2\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\r\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\n0\u000eJ2\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\r\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\n0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kelineyt/firebase/FirebaseCommon;", "", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "cartCollection", "Lcom/google/firebase/firestore/CollectionReference;", "addProductToCart", "", "cartProduct", "Lcom/example/kelineyt/data/CartProduct;", "onResult", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "decreaseQuantity", "documentId", "", "increaseQuantity", "QuantityChanging", "app_debug"})
public final class FirebaseCommon {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private final com.google.firebase.firestore.CollectionReference cartCollection = null;
    
    public FirebaseCommon(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    public final void addProductToCart(@org.jetbrains.annotations.NotNull()
    com.example.kelineyt.data.CartProduct cartProduct, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.kelineyt.data.CartProduct, ? super java.lang.Exception, kotlin.Unit> onResult) {
    }
    
    public final void increaseQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String documentId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Exception, kotlin.Unit> onResult) {
    }
    
    public final void decreaseQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String documentId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Exception, kotlin.Unit> onResult) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kelineyt/firebase/FirebaseCommon$QuantityChanging;", "", "(Ljava/lang/String;I)V", "INCREASE", "DECREASE", "app_debug"})
    public static enum QuantityChanging {
        /*public static final*/ INCREASE /* = new INCREASE() */,
        /*public static final*/ DECREASE /* = new DECREASE() */;
        
        QuantityChanging() {
        }
    }
}