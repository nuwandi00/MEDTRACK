// Generated by view binder compiler. Do not edit!
package com.example.kelineyt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class EditFeedbackBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button editfdbtnupdate;

  @NonNull
  public final EditText editfeedbackComment;

  @NonNull
  public final EditText editfeedbackName;

  @NonNull
  public final Button fdeditbtndelete;

  @NonNull
  public final ImageView fdimageView3;

  @NonNull
  public final ImageView fdimageView6;

  @NonNull
  public final ImageView fdimageView7;

  @NonNull
  public final TextView fdtextView36;

  private EditFeedbackBinding(@NonNull ConstraintLayout rootView, @NonNull Button editfdbtnupdate,
      @NonNull EditText editfeedbackComment, @NonNull EditText editfeedbackName,
      @NonNull Button fdeditbtndelete, @NonNull ImageView fdimageView3,
      @NonNull ImageView fdimageView6, @NonNull ImageView fdimageView7,
      @NonNull TextView fdtextView36) {
    this.rootView = rootView;
    this.editfdbtnupdate = editfdbtnupdate;
    this.editfeedbackComment = editfeedbackComment;
    this.editfeedbackName = editfeedbackName;
    this.fdeditbtndelete = fdeditbtndelete;
    this.fdimageView3 = fdimageView3;
    this.fdimageView6 = fdimageView6;
    this.fdimageView7 = fdimageView7;
    this.fdtextView36 = fdtextView36;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditFeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editfdbtnupdate;
      Button editfdbtnupdate = ViewBindings.findChildViewById(rootView, id);
      if (editfdbtnupdate == null) {
        break missingId;
      }

      id = R.id.editfeedbackComment;
      EditText editfeedbackComment = ViewBindings.findChildViewById(rootView, id);
      if (editfeedbackComment == null) {
        break missingId;
      }

      id = R.id.editfeedbackName;
      EditText editfeedbackName = ViewBindings.findChildViewById(rootView, id);
      if (editfeedbackName == null) {
        break missingId;
      }

      id = R.id.fdeditbtndelete;
      Button fdeditbtndelete = ViewBindings.findChildViewById(rootView, id);
      if (fdeditbtndelete == null) {
        break missingId;
      }

      id = R.id.fdimageView3;
      ImageView fdimageView3 = ViewBindings.findChildViewById(rootView, id);
      if (fdimageView3 == null) {
        break missingId;
      }

      id = R.id.fdimageView6;
      ImageView fdimageView6 = ViewBindings.findChildViewById(rootView, id);
      if (fdimageView6 == null) {
        break missingId;
      }

      id = R.id.fdimageView7;
      ImageView fdimageView7 = ViewBindings.findChildViewById(rootView, id);
      if (fdimageView7 == null) {
        break missingId;
      }

      id = R.id.fdtextView36;
      TextView fdtextView36 = ViewBindings.findChildViewById(rootView, id);
      if (fdtextView36 == null) {
        break missingId;
      }

      return new EditFeedbackBinding((ConstraintLayout) rootView, editfdbtnupdate,
          editfeedbackComment, editfeedbackName, fdeditbtndelete, fdimageView3, fdimageView6,
          fdimageView7, fdtextView36);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
