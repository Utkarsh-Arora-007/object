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

public abstract class FragmentToiletsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView h1;

  @NonNull
  public final TextView title;

  @NonNull
  public final RecyclerView toiletsRecyclerView;

  protected FragmentToiletsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView h1, TextView title, RecyclerView toiletsRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.h1 = h1;
    this.title = title;
    this.toiletsRecyclerView = toiletsRecyclerView;
  }

  @NonNull
  public static FragmentToiletsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_toilets, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentToiletsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentToiletsBinding>inflateInternal(inflater, R.layout.fragment_toilets, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentToiletsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_toilets, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentToiletsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentToiletsBinding>inflateInternal(inflater, R.layout.fragment_toilets, null, false, component);
  }

  public static FragmentToiletsBinding bind(@NonNull View view) {
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
  public static FragmentToiletsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentToiletsBinding)bind(component, view, R.layout.fragment_toilets);
  }
}
