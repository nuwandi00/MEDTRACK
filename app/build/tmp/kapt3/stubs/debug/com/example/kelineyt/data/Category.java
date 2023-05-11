package com.example.kelineyt.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kelineyt/data/Category;", "", "category", "", "(Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "Care", "Devices", "Medicine", "Nutrition", "Other", "Lcom/example/kelineyt/data/Category$Medicine;", "Lcom/example/kelineyt/data/Category$Devices;", "Lcom/example/kelineyt/data/Category$Nutrition;", "Lcom/example/kelineyt/data/Category$Care;", "Lcom/example/kelineyt/data/Category$Other;", "app_debug"})
public abstract class Category {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category = null;
    
    private Category(java.lang.String category) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/Category$Medicine;", "Lcom/example/kelineyt/data/Category;", "()V", "app_debug"})
    public static final class Medicine extends com.example.kelineyt.data.Category {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.Category.Medicine INSTANCE = null;
        
        private Medicine() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/Category$Devices;", "Lcom/example/kelineyt/data/Category;", "()V", "app_debug"})
    public static final class Devices extends com.example.kelineyt.data.Category {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.Category.Devices INSTANCE = null;
        
        private Devices() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/Category$Nutrition;", "Lcom/example/kelineyt/data/Category;", "()V", "app_debug"})
    public static final class Nutrition extends com.example.kelineyt.data.Category {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.Category.Nutrition INSTANCE = null;
        
        private Nutrition() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/Category$Care;", "Lcom/example/kelineyt/data/Category;", "()V", "app_debug"})
    public static final class Care extends com.example.kelineyt.data.Category {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.Category.Care INSTANCE = null;
        
        private Care() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/kelineyt/data/Category$Other;", "Lcom/example/kelineyt/data/Category;", "()V", "app_debug"})
    public static final class Other extends com.example.kelineyt.data.Category {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.kelineyt.data.Category.Other INSTANCE = null;
        
        private Other() {
            super(null);
        }
    }
}