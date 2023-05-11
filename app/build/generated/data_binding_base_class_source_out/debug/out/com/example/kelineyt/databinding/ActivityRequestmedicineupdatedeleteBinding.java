// Generated by view binder compiler. Do not edit!
package com.example.kelineyt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.simplepass.loadingbutton.customViews.CircularProgressButton;
import com.example.kelineyt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRequestmedicineupdatedeleteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircularProgressButton btnDeletemed;

  @NonNull
  public final CircularProgressButton btnEditmed;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final EditText medcontactEdtdelete;

  @NonNull
  public final EditText medemailEdtdelete;

  @NonNull
  public final EditText mednameDetdelete;

  @NonNull
  public final ConstraintLayout medreqeditdelete;

  @NonNull
  public final TextView medtrackSlogan;

  @NonNull
  public final TextView medtrackTopic;

  @NonNull
  public final TextView requestmedcineTop;

  private ActivityRequestmedicineupdatedeleteBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircularProgressButton btnDeletemed, @NonNull CircularProgressButton btnEditmed,
      @NonNull ImageView imageView3, @NonNull EditText medcontactEdtdelete,
      @NonNull EditText medemailEdtdelete, @NonNull EditText mednameDetdelete,
      @NonNull ConstraintLayout medreqeditdelete, @NonNull TextView medtrackSlogan,
      @NonNull TextView medtrackTopic, @NonNull TextView requestmedcineTop) {
    this.rootView = rootView;
    this.btnDeletemed = btnDeletemed;
    this.btnEditmed = btnEditmed;
    this.imageView3 = imageView3;
    this.medcontactEdtdelete = medcontactEdtdelete;
    this.medemailEdtdelete = medemailEdtdelete;
    this.mednameDetdelete = mednameDetdelete;
    this.medreqeditdelete = medreqeditdelete;
    this.medtrackSlogan = medtrackSlogan;
    this.medtrackTopic = medtrackTopic;
    this.requestmedcineTop = requestmedcineTop;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRequestmedicineupdatedeleteBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRequestmedicineupdatedeleteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_requestmedicineupdatedelete, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRequestmedicineupdatedeleteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_deletemed;
      CircularProgressButton btnDeletemed = ViewBindings.findChildViewById(rootView, id);
      if (btnDeletemed == null) {
        break missingId;
      }

      id = R.id.btn_editmed;
      CircularProgressButton btnEditmed = ViewBindings.findChildViewById(rootView, id);
      if (btnEditmed == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.medcontact_edtdelete;
      EditText medcontactEdtdelete = ViewBindings.findChildViewById(rootView, id);
      if (medcontactEdtdelete == null) {
        break missingId;
      }

      id = R.id.medemail_edtdelete;
      EditText medemailEdtdelete = ViewBindings.findChildViewById(rootView, id);
      if (medemailEdtdelete == null) {
        break missingId;
      }

      id = R.id.medname_detdelete;
      EditText mednameDetdelete = ViewBindings.findChildViewById(rootView, id);
      if (mednameDetdelete == null) {
        break missingId;
      }

      ConstraintLayout medreqeditdelete = (ConstraintLayout) rootView;

      id = R.id.medtrack_slogan;
      TextView medtrackSlogan = ViewBindings.findChildViewById(rootView, id);
      if (medtrackSlogan == null) {
        break missingId;
      }

      id = R.id.medtrack_topic;
      TextView medtrackTopic = ViewBindings.findChildViewById(rootView, id);
      if (medtrackTopic == null) {
        break missingId;
      }

      id = R.id.requestmedcine_top;
      TextView requestmedcineTop = ViewBindings.findChildViewById(rootView, id);
      if (requestmedcineTop == null) {
        break missingId;
      }

      return new ActivityRequestmedicineupdatedeleteBinding((ConstraintLayout) rootView,
          btnDeletemed, btnEditmed, imageView3, medcontactEdtdelete, medemailEdtdelete,
          mednameDetdelete, medreqeditdelete, medtrackSlogan, medtrackTopic, requestmedcineTop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
