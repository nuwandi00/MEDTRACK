package com.example.kelineyt.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020*H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\b\u00a8\u0006/"}, d2 = {"Lcom/example/kelineyt/activities/UpdateAddAvailabilityActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addAvailabilityID", "", "getAddAvailabilityID", "()Ljava/lang/String;", "setAddAvailabilityID", "(Ljava/lang/String;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "btnDelete", "Landroid/widget/Button;", "btnnUpdate", "database", "Lcom/google/firebase/database/DatabaseReference;", "saddress", "Landroid/widget/EditText;", "sdate", "sdname", "sfrom", "sspeciality", "sto", "usersAddress", "getUsersAddress", "setUsersAddress", "usersDate", "getUsersDate", "setUsersDate", "usersFrom", "getUsersFrom", "setUsersFrom", "usersSpeciality", "getUsersSpeciality", "setUsersSpeciality", "usersTo", "getUsersTo", "setUsersTo", "usersdName", "getUsersdName", "setUsersdName", "deleteAddAvailability", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateAddAvailability", "app_debug"})
public final class UpdateAddAvailabilityActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.database.DatabaseReference database;
    private android.widget.EditText sdname;
    private android.widget.EditText sspeciality;
    private android.widget.EditText saddress;
    private android.widget.EditText sdate;
    private android.widget.EditText sfrom;
    private android.widget.EditText sto;
    private android.widget.Button btnDelete;
    private android.widget.Button btnnUpdate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersdName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersSpeciality;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersAddress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersFrom;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersTo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addAvailabilityID;
    
    public UpdateAddAvailabilityActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersdName() {
        return null;
    }
    
    public final void setUsersdName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersSpeciality() {
        return null;
    }
    
    public final void setUsersSpeciality(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersAddress() {
        return null;
    }
    
    public final void setUsersAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersDate() {
        return null;
    }
    
    public final void setUsersDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersFrom() {
        return null;
    }
    
    public final void setUsersFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersTo() {
        return null;
    }
    
    public final void setUsersTo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddAvailabilityID() {
        return null;
    }
    
    public final void setAddAvailabilityID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void deleteAddAvailability() {
    }
    
    private final void updateAddAvailability() {
    }
}