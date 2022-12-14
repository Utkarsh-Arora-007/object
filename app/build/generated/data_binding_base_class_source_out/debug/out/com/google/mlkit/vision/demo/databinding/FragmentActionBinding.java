// Generated by data binding compiler. Do not edit!
package com.google.mlkit.vision.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.mlkit.vision.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentActionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView I1;

  @NonNull
  public final ImageView I10;

  @NonNull
  public final ImageView I11;

  @NonNull
  public final ImageView I12;

  @NonNull
  public final ImageView I2;

  @NonNull
  public final ImageView I3;

  @NonNull
  public final ImageView I4;

  @NonNull
  public final ImageView I5;

  @NonNull
  public final ImageView I6;

  @NonNull
  public final ImageView I7;

  @NonNull
  public final ImageView I8;

  @NonNull
  public final ImageView I9;

  @NonNull
  public final TextView T1;

  @NonNull
  public final TextView T2;

  @NonNull
  public final CardView c1;

  @NonNull
  public final CardView c10;

  @NonNull
  public final CardView c11;

  @NonNull
  public final CardView c12;

  @NonNull
  public final CardView c2;

  @NonNull
  public final CardView c3;

  @NonNull
  public final CardView c4;

  @NonNull
  public final CardView c5;

  @NonNull
  public final CardView c6;

  @NonNull
  public final CardView c7;

  @NonNull
  public final CardView c8;

  @NonNull
  public final CardView c9;

  @NonNull
  public final TextView hea;

  protected FragmentActionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView I1, ImageView I10, ImageView I11, ImageView I12, ImageView I2, ImageView I3,
      ImageView I4, ImageView I5, ImageView I6, ImageView I7, ImageView I8, ImageView I9,
      TextView T1, TextView T2, CardView c1, CardView c10, CardView c11, CardView c12, CardView c2,
      CardView c3, CardView c4, CardView c5, CardView c6, CardView c7, CardView c8, CardView c9,
      TextView hea) {
    super(_bindingComponent, _root, _localFieldCount);
    this.I1 = I1;
    this.I10 = I10;
    this.I11 = I11;
    this.I12 = I12;
    this.I2 = I2;
    this.I3 = I3;
    this.I4 = I4;
    this.I5 = I5;
    this.I6 = I6;
    this.I7 = I7;
    this.I8 = I8;
    this.I9 = I9;
    this.T1 = T1;
    this.T2 = T2;
    this.c1 = c1;
    this.c10 = c10;
    this.c11 = c11;
    this.c12 = c12;
    this.c2 = c2;
    this.c3 = c3;
    this.c4 = c4;
    this.c5 = c5;
    this.c6 = c6;
    this.c7 = c7;
    this.c8 = c8;
    this.c9 = c9;
    this.hea = hea;
  }

  @NonNull
  public static FragmentActionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_action, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentActionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentActionBinding>inflateInternal(inflater, R.layout.fragment_action, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentActionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_action, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentActionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentActionBinding>inflateInternal(inflater, R.layout.fragment_action, null, false, component);
  }

  public static FragmentActionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentActionBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentActionBinding)bind(component, view, R.layout.fragment_action);
  }
}
