// Generated by data binding compiler. Do not edit!
package com.google.mlkit.vision.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.mlkit.vision.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentWannaHelpBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText amountEdit;

  @NonNull
  public final TextInputLayout filledTextField;

  @NonNull
  public final LottieAnimationView lottieOtp;

  @NonNull
  public final Button payBtn;

  protected FragmentWannaHelpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText amountEdit, TextInputLayout filledTextField, LottieAnimationView lottieOtp,
      Button payBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amountEdit = amountEdit;
    this.filledTextField = filledTextField;
    this.lottieOtp = lottieOtp;
    this.payBtn = payBtn;
  }

  @NonNull
  public static FragmentWannaHelpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_wanna_help, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWannaHelpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWannaHelpBinding>inflateInternal(inflater, R.layout.fragment_wanna_help, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWannaHelpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_wanna_help, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWannaHelpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWannaHelpBinding>inflateInternal(inflater, R.layout.fragment_wanna_help, null, false, component);
  }

  public static FragmentWannaHelpBinding bind(@NonNull View view) {
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
  public static FragmentWannaHelpBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWannaHelpBinding)bind(component, view, R.layout.fragment_wanna_help);
  }
}
