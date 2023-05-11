package com.example.kelineyt.data.order;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus;", "", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "Canceled", "Confirmed", "Delivered", "Ordered", "Returned", "Shipped", "Lcom/example/kelineyt/data/order/OrderStatus$Ordered;", "Lcom/example/kelineyt/data/order/OrderStatus$Canceled;", "Lcom/example/kelineyt/data/order/OrderStatus$Confirmed;", "Lcom/example/kelineyt/data/order/OrderStatus$Shipped;", "Lcom/example/kelineyt/data/order/OrderStatus$Delivered;", "Lcom/example/kelineyt/data/order/OrderStatus$Returned;", "app_debug"})
public abstract class OrderStatus {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    
    private OrderStatus(java.lang.String status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus$Ordered;", "Lcom/example/kelineyt/data/order/OrderStatus;", "()V", "app_debug"})
    public static final class Ordered extends com.example.kelineyt.data.order.OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.order.OrderStatus.Ordered INSTANCE = null;
        
        private Ordered() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus$Canceled;", "Lcom/example/kelineyt/data/order/OrderStatus;", "()V", "app_debug"})
    public static final class Canceled extends com.example.kelineyt.data.order.OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.order.OrderStatus.Canceled INSTANCE = null;
        
        private Canceled() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus$Confirmed;", "Lcom/example/kelineyt/data/order/OrderStatus;", "()V", "app_debug"})
    public static final class Confirmed extends com.example.kelineyt.data.order.OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.order.OrderStatus.Confirmed INSTANCE = null;
        
        private Confirmed() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus$Shipped;", "Lcom/example/kelineyt/data/order/OrderStatus;", "()V", "app_debug"})
    public static final class Shipped extends com.example.kelineyt.data.order.OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.order.OrderStatus.Shipped INSTANCE = null;
        
        private Shipped() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus$Delivered;", "Lcom/example/kelineyt/data/order/OrderStatus;", "()V", "app_debug"})
    public static final class Delivered extends com.example.kelineyt.data.order.OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.order.OrderStatus.Delivered INSTANCE = null;
        
        private Delivered() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/order/OrderStatus$Returned;", "Lcom/example/kelineyt/data/order/OrderStatus;", "()V", "app_debug"})
    public static final class Returned extends com.example.kelineyt.data.order.OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.order.OrderStatus.Returned INSTANCE = null;
        
        private Returned() {
            super(null);
        }
    }
}