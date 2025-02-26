// Generated by view binder compiler. Do not edit!
package com.example.NourishConnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.NourishConnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAboutBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView facebook;

  @NonNull
  public final CardView instagram;

  @NonNull
  public final CardView twitter;

  @NonNull
  public final CardView version;

  private ActivityAboutBinding(@NonNull ScrollView rootView, @NonNull CardView facebook,
      @NonNull CardView instagram, @NonNull CardView twitter, @NonNull CardView version) {
    this.rootView = rootView;
    this.facebook = facebook;
    this.instagram = instagram;
    this.twitter = twitter;
    this.version = version;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.facebook;
      CardView facebook = ViewBindings.findChildViewById(rootView, id);
      if (facebook == null) {
        break missingId;
      }

      id = R.id.instagram;
      CardView instagram = ViewBindings.findChildViewById(rootView, id);
      if (instagram == null) {
        break missingId;
      }

      id = R.id.twitter;
      CardView twitter = ViewBindings.findChildViewById(rootView, id);
      if (twitter == null) {
        break missingId;
      }

      id = R.id.version;
      CardView version = ViewBindings.findChildViewById(rootView, id);
      if (version == null) {
        break missingId;
      }

      return new ActivityAboutBinding((ScrollView) rootView, facebook, instagram, twitter, version);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
