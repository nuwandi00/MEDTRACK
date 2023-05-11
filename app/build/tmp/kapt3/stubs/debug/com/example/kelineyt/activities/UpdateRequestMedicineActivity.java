package com.example.kelineyt.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001eH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b\u00a8\u0006#"}, d2 = {"Lcom/example/kelineyt/activities/UpdateRequestMedicineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "RequestMedicineID", "", "getRequestMedicineID", "()Ljava/lang/String;", "setRequestMedicineID", "(Ljava/lang/String;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "btn_cancelmed", "Landroid/widget/Button;", "btn_updatemed", "database", "Lcom/google/firebase/database/DatabaseReference;", "edt_Email", "Landroid/widget/EditText;", "edt_medContact", "edt_medName", "userEmail", "getUserEmail", "setUserEmail", "userMedicine", "getUserMedicine", "setUserMedicine", "userNumber", "getUserNumber", "setUserNumber", "deleteRequest", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateRequest", "app_debug"})
public final class UpdateRequestMedicineActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.database.DatabaseReference database;
    private android.widget.EditText edt_medName;
    private android.widget.EditText edt_medContact;
    private android.widget.EditText edt_Email;
    private android.widget.Button btn_updatemed;
    private android.widget.Button btn_cancelmed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userMedicine;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userEmail;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String RequestMedicineID;
    
    public UpdateRequestMedicineActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserMedicine() {
        return null;
    }
    
    public final void setUserMedicine(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserNumber() {
        return null;
    }
    
    public final void setUserNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRequestMedicineID() {
        return null;
    }
    
    public final void setRequestMedicineID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void deleteRequest() {
    }
    
    private final void updateRequest() {
    }
}