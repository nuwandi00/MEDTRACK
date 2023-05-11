package com.example.kelineyt.data.order;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\rH\u00c6\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\"H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006."}, d2 = {"Lcom/example/kelineyt/data/order/Order;", "Landroid/os/Parcelable;", "orderStatus", "", "totalPrice", "", "products", "", "Lcom/example/kelineyt/data/CartProduct;", "address", "Lcom/example/kelineyt/data/Address;", "date", "orderId", "", "(Ljava/lang/String;FLjava/util/List;Lcom/example/kelineyt/data/Address;Ljava/lang/String;J)V", "getAddress", "()Lcom/example/kelineyt/data/Address;", "getDate", "()Ljava/lang/String;", "getOrderId", "()J", "getOrderStatus", "getProducts", "()Ljava/util/List;", "getTotalPrice", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Order implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderStatus = null;
    private final float totalPrice = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kelineyt.data.CartProduct> products = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kelineyt.data.Address address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    private final long orderId = 0L;
    public static final android.os.Parcelable.Creator<com.example.kelineyt.data.order.Order> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kelineyt.data.order.Order copy(@org.jetbrains.annotations.NotNull()
    java.lang.String orderStatus, float totalPrice, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kelineyt.data.CartProduct> products, @org.jetbrains.annotations.NotNull()
    com.example.kelineyt.data.Address address, @org.jetbrains.annotations.NotNull()
    java.lang.String date, long orderId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Order() {
        super();
    }
    
    public Order(@org.jetbrains.annotations.NotNull()
    java.lang.String orderStatus, float totalPrice, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kelineyt.data.CartProduct> products, @org.jetbrains.annotations.NotNull()
    com.example.kelineyt.data.Address address, @org.jetbrains.annotations.NotNull()
    java.lang.String date, long orderId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderStatus() {
        return null;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getTotalPrice() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kelineyt.data.CartProduct> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kelineyt.data.CartProduct> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kelineyt.data.Address component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kelineyt.data.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.kelineyt.data.order.Order> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kelineyt.data.order.Order createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.kelineyt.data.order.Order[] newArray(int size) {
            return null;
        }
    }
}