// Generated by view binder compiler. Do not edit!
package com.example.NourishConnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.NourishConnect.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChangePasswordBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatButton Authentication;

  @NonNull
  public final TextInputLayout id15PasswordTwo;

  @NonNull
  public final LinearLayout linearLayoutTextViewYouAreNotAuthorized;

  @NonNull
  public final TextInputLayout oldpasswordLayout;

  @NonNull
  public final TextInputLayout passwordLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextInputEditText regOldpassword;

  @NonNull
  public final TextInputEditText regPassword;

  @NonNull
  public final TextInputEditText regPasswordTwo;

  @NonNull
  public final TextView textViewYouAreNotAuthorized;

  @NonNull
  public final AppCompatButton updateEmail;

  private ActivityChangePasswordBinding(@NonNull ScrollView rootView,
      @NonNull AppCompatButton Authentication, @NonNull TextInputLayout id15PasswordTwo,
      @NonNull LinearLayout linearLayoutTextViewYouAreNotAuthorized,
      @NonNull TextInputLayout oldpasswordLayout, @NonNull TextInputLayout passwordLayout,
      @NonNull ProgressBar progressBar, @NonNull TextInputEditText regOldpassword,
      @NonNull TextInputEditText regPassword, @NonNull TextInputEditText regPasswordTwo,
      @NonNull TextView textViewYouAreNotAuthorized, @NonNull AppCompatButton updateEmail) {
    this.rootView = rootView;
    this.Authentication = Authentication;
    this.id15PasswordTwo = id15PasswordTwo;
    this.linearLayoutTextViewYouAreNotAuthorized = linearLayoutTextViewYouAreNotAuthorized;
    this.oldpasswordLayout = oldpasswordLayout;
    this.passwordLayout = passwordLayout;
    this.progressBar = progressBar;
    this.regOldpassword = regOldpassword;
    this.regPassword = regPassword;
    this.regPasswordTwo = regPasswordTwo;
    this.textViewYouAreNotAuthorized = textViewYouAreNotAuthorized;
    this.updateEmail = updateEmail;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_change_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChangePasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Authentication;
      AppCompatButton Authentication = ViewBindings.findChildViewById(rootView, id);
      if (Authentication == null) {
        break missingId;
      }

      id = R.id.id15_password_two;
      TextInputLayout id15PasswordTwo = ViewBindings.findChildViewById(rootView, id);
      if (id15PasswordTwo == null) {
        break missingId;
      }

      id = R.id.linearLayoutTextViewYouAreNotAuthorized;
      LinearLayout linearLayoutTextViewYouAreNotAuthorized = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutTextViewYouAreNotAuthorized == null) {
        break missingId;
      }

      id = R.id.oldpasswordLayout;
      TextInputLayout oldpasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (oldpasswordLayout == null) {
        break missingId;
      }

      id = R.id.passwordLayout;
      TextInputLayout passwordLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordLayout == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.reg_oldpassword;
      TextInputEditText regOldpassword = ViewBindings.findChildViewById(rootView, id);
      if (regOldpassword == null) {
        break missingId;
      }

      id = R.id.reg_password;
      TextInputEditText regPassword = ViewBindings.findChildViewById(rootView, id);
      if (regPassword == null) {
        break missingId;
      }

      id = R.id.reg_password_two;
      TextInputEditText regPasswordTwo = ViewBindings.findChildViewById(rootView, id);
      if (regPasswordTwo == null) {
        break missingId;
      }

      id = R.id.textViewYouAreNotAuthorized;
      TextView textViewYouAreNotAuthorized = ViewBindings.findChildViewById(rootView, id);
      if (textViewYouAreNotAuthorized == null) {
        break missingId;
      }

      id = R.id.updateEmail;
      AppCompatButton updateEmail = ViewBindings.findChildViewById(rootView, id);
      if (updateEmail == null) {
        break missingId;
      }

      return new ActivityChangePasswordBinding((ScrollView) rootView, Authentication,
          id15PasswordTwo, linearLayoutTextViewYouAreNotAuthorized, oldpasswordLayout,
          passwordLayout, progressBar, regOldpassword, regPassword, regPasswordTwo,
          textViewYouAreNotAuthorized, updateEmail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
