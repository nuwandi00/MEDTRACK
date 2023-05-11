// Generated by view binder compiler. Do not edit!
package com.example.kelineyt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kelineyt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UpdateAvailabilityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText AddressUpdate;

  @NonNull
  public final TextView AddressUpdatetext;

  @NonNull
  public final EditText DateUpdate;

  @NonNull
  public final Button Delete;

  @NonNull
  public final EditText FromUpdate;

  @NonNull
  public final EditText SpecilityUpdate;

  @NonNull
  public final TextView SpecilitytextUpdate;

  @NonNull
  public final Button Update;

  @NonNull
  public final CheckBox checkBox1;

  @NonNull
  public final EditText docNameUpdate;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView textView10Update;

  @NonNull
  public final TextView textView11Update;

  @NonNull
  public final TextView textView7Update;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textViewUpdate;

  @NonNull
  public final TextView textViewnew;

  @NonNull
  public final TextView textViewnewq;

  @NonNull
  public final EditText toUpdate;

  @NonNull
  public final TextView updateName;

  private UpdateAvailabilityBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText AddressUpdate, @NonNull TextView AddressUpdatetext,
      @NonNull EditText DateUpdate, @NonNull Button Delete, @NonNull EditText FromUpdate,
      @NonNull EditText SpecilityUpdate, @NonNull TextView SpecilitytextUpdate,
      @NonNull Button Update, @NonNull CheckBox checkBox1, @NonNull EditText docNameUpdate,
      @NonNull ImageView imageView2, @NonNull ImageView imageView4,
      @NonNull TextView textView10Update, @NonNull TextView textView11Update,
      @NonNull TextView textView7Update, @NonNull TextView textView8,
      @NonNull TextView textViewUpdate, @NonNull TextView textViewnew,
      @NonNull TextView textViewnewq, @NonNull EditText toUpdate, @NonNull TextView updateName) {
    this.rootView = rootView;
    this.AddressUpdate = AddressUpdate;
    this.AddressUpdatetext = AddressUpdatetext;
    this.DateUpdate = DateUpdate;
    this.Delete = Delete;
    this.FromUpdate = FromUpdate;
    this.SpecilityUpdate = SpecilityUpdate;
    this.SpecilitytextUpdate = SpecilitytextUpdate;
    this.Update = Update;
    this.checkBox1 = checkBox1;
    this.docNameUpdate = docNameUpdate;
    this.imageView2 = imageView2;
    this.imageView4 = imageView4;
    this.textView10Update = textView10Update;
    this.textView11Update = textView11Update;
    this.textView7Update = textView7Update;
    this.textView8 = textView8;
    this.textViewUpdate = textViewUpdate;
    this.textViewnew = textViewnew;
    this.textViewnewq = textViewnewq;
    this.toUpdate = toUpdate;
    this.updateName = updateName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UpdateAvailabilityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UpdateAvailabilityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.update_availability, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UpdateAvailabilityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddressUpdate;
      EditText AddressUpdate = ViewBindings.findChildViewById(rootView, id);
      if (AddressUpdate == null) {
        break missingId;
      }

      id = R.id.AddressUpdatetext;
      TextView AddressUpdatetext = ViewBindings.findChildViewById(rootView, id);
      if (AddressUpdatetext == null) {
        break missingId;
      }

      id = R.id.DateUpdate;
      EditText DateUpdate = ViewBindings.findChildViewById(rootView, id);
      if (DateUpdate == null) {
        break missingId;
      }

      id = R.id.Delete;
      Button Delete = ViewBindings.findChildViewById(rootView, id);
      if (Delete == null) {
        break missingId;
      }

      id = R.id.FromUpdate;
      EditText FromUpdate = ViewBindings.findChildViewById(rootView, id);
      if (FromUpdate == null) {
        break missingId;
      }

      id = R.id.SpecilityUpdate;
      EditText SpecilityUpdate = ViewBindings.findChildViewById(rootView, id);
      if (SpecilityUpdate == null) {
        break missingId;
      }

      id = R.id.SpecilitytextUpdate;
      TextView SpecilitytextUpdate = ViewBindings.findChildViewById(rootView, id);
      if (SpecilitytextUpdate == null) {
        break missingId;
      }

      id = R.id.Update;
      Button Update = ViewBindings.findChildViewById(rootView, id);
      if (Update == null) {
        break missingId;
      }

      id = R.id.checkBox1;
      CheckBox checkBox1 = ViewBindings.findChildViewById(rootView, id);
      if (checkBox1 == null) {
        break missingId;
      }

      id = R.id.docNameUpdate;
      EditText docNameUpdate = ViewBindings.findChildViewById(rootView, id);
      if (docNameUpdate == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.textView10Update;
      TextView textView10Update = ViewBindings.findChildViewById(rootView, id);
      if (textView10Update == null) {
        break missingId;
      }

      id = R.id.textView11Update;
      TextView textView11Update = ViewBindings.findChildViewById(rootView, id);
      if (textView11Update == null) {
        break missingId;
      }

      id = R.id.textView7Update;
      TextView textView7Update = ViewBindings.findChildViewById(rootView, id);
      if (textView7Update == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textViewUpdate;
      TextView textViewUpdate = ViewBindings.findChildViewById(rootView, id);
      if (textViewUpdate == null) {
        break missingId;
      }

      id = R.id.textViewnew;
      TextView textViewnew = ViewBindings.findChildViewById(rootView, id);
      if (textViewnew == null) {
        break missingId;
      }

      id = R.id.textViewnewq;
      TextView textViewnewq = ViewBindings.findChildViewById(rootView, id);
      if (textViewnewq == null) {
        break missingId;
      }

      id = R.id.toUpdate;
      EditText toUpdate = ViewBindings.findChildViewById(rootView, id);
      if (toUpdate == null) {
        break missingId;
      }

      id = R.id.updateName;
      TextView updateName = ViewBindings.findChildViewById(rootView, id);
      if (updateName == null) {
        break missingId;
      }

      return new UpdateAvailabilityBinding((ConstraintLayout) rootView, AddressUpdate,
          AddressUpdatetext, DateUpdate, Delete, FromUpdate, SpecilityUpdate, SpecilitytextUpdate,
          Update, checkBox1, docNameUpdate, imageView2, imageView4, textView10Update,
          textView11Update, textView7Update, textView8, textViewUpdate, textViewnew, textViewnewq,
          toUpdate, updateName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
