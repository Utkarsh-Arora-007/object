// Generated by data binding compiler. Do not edit!
package com.google.mlkit.vision.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMallsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView h1;

  @NonNull
  public final RecyclerView mallsRecyclerView;

  @NonNull
  public final TextView title;

  protected FragmentMallsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView h1, RecyclerView mallsRecyclerView, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.h1 = h1;
    this.mallsRecyclerView = mallsRecyclerView;
    this.title = title;
  }

  @NonNull
  public static FragmentMallsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_malls, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMallsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMallsBinding>inflateInternal(inflater, R.layout.fragment_malls, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMallsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_malls, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMallsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMallsBinding>inflateInternal(inflater, R.layout.fragment_malls, null, false, component);
  }

  public static FragmentMallsBinding bind(@NonNull View view) {
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
  public static FragmentMallsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMallsBinding)bind(component, view, R.layout.fragment_malls);
  }
}
