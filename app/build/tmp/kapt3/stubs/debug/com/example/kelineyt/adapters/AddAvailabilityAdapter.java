package com.example.kelineyt.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kelineyt/adapters/AddAvailabilityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kelineyt/adapters/AddAvailabilityAdapter$MyViewHolder;", "addAvailabilityList", "Ljava/util/ArrayList;", "Lcom/example/kelineyt/data/Scheduling;", "(Ljava/util/ArrayList;)V", "mListener", "Lcom/example/kelineyt/adapters/AddAvailabilityAdapter$onItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "MyViewHolder", "onItemClickListener", "app_debug"})
public final class AddAvailabilityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kelineyt.adapters.AddAvailabilityAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.example.kelineyt.data.Scheduling> addAvailabilityList = null;
    private com.example.kelineyt.adapters.AddAvailabilityAdapter.onItemClickListener mListener;
    
    public AddAvailabilityAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kelineyt.data.Scheduling> addAvailabilityList) {
        super();
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.kelineyt.adapters.AddAvailabilityAdapter.onItemClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kelineyt.adapters.AddAvailabilityAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kelineyt.adapters.AddAvailabilityAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kelineyt/adapters/AddAvailabilityAdapter$onItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface onItemClickListener {
        
        public abstract void onItemClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/kelineyt/adapters/AddAvailabilityAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/example/kelineyt/adapters/AddAvailabilityAdapter$onItemClickListener;", "(Landroid/view/View;Lcom/example/kelineyt/adapters/AddAvailabilityAdapter$onItemClickListener;)V", "saddress", "Landroid/widget/TextView;", "getSaddress", "()Landroid/widget/TextView;", "setSaddress", "(Landroid/widget/TextView;)V", "sdate", "getSdate", "setSdate", "sdname", "getSdname", "setSdname", "sfrom", "getSfrom", "setSfrom", "sspeciality", "getSspeciality", "setSspeciality", "sto", "getSto", "setSto", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView sdname;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView sspeciality;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView saddress;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView sdate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView sfrom;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView sto;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.example.kelineyt.adapters.AddAvailabilityAdapter.onItemClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSdname() {
            return null;
        }
        
        public final void setSdname(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSspeciality() {
            return null;
        }
        
        public final void setSspeciality(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSaddress() {
            return null;
        }
        
        public final void setSaddress(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSdate() {
            return null;
        }
        
        public final void setSdate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSfrom() {
            return null;
        }
        
        public final void setSfrom(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSto() {
            return null;
        }
        
        public final void setSto(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}