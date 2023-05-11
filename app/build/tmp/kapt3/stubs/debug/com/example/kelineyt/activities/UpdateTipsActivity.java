package com.example.kelineyt.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/kelineyt/activities/UpdateTipsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "HealthTipsID", "", "getHealthTipsID", "()Ljava/lang/String;", "setHealthTipsID", "(Ljava/lang/String;)V", "TipDocname", "Landroid/widget/EditText;", "TipsEditText", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "btnTipsDelete", "Landroid/widget/Button;", "btnTipsUpdate", "database", "Lcom/google/firebase/database/DatabaseReference;", "userDoctorNameTIP", "getUserDoctorNameTIP", "setUserDoctorNameTIP", "userTipsComment", "getUserTipsComment", "setUserTipsComment", "deleteHealthTip", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateHealthTip", "app_debug"})
public final class UpdateTipsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.database.DatabaseReference database;
    private android.widget.EditText TipDocname;
    private android.widget.EditText TipsEditText;
    private android.widget.Button btnTipsUpdate;
    private android.widget.Button btnTipsDelete;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userDoctorNameTIP;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userTipsComment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String HealthTipsID;
    
    public UpdateTipsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserDoctorNameTIP() {
        return null;
    }
    
    public final void setUserDoctorNameTIP(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserTipsComment() {
        return null;
    }
    
    public final void setUserTipsComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHealthTipsID() {
        return null;
    }
    
    public final void setHealthTipsID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void deleteHealthTip() {
    }
    
    private final void updateHealthTip() {
    }
}