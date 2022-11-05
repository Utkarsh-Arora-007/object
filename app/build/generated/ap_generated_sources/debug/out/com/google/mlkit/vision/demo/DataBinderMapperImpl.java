package com.google.mlkit.vision.demo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.mlkit.vision.demo.databinding.FragmentActionBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHelpDeskBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHomeBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHospitalsBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentLibraryBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentMallsBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentMapBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentTextWriterBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTACTION = 1;

  private static final int LAYOUT_FRAGMENTHELPDESK = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTHOSPITALS = 4;

  private static final int LAYOUT_FRAGMENTLIBRARY = 5;

  private static final int LAYOUT_FRAGMENTMALLS = 6;

  private static final int LAYOUT_FRAGMENTMAP = 7;

  private static final int LAYOUT_FRAGMENTTEXTWRITER = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_action, LAYOUT_FRAGMENTACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_help_desk, LAYOUT_FRAGMENTHELPDESK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_hospitals, LAYOUT_FRAGMENTHOSPITALS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_library, LAYOUT_FRAGMENTLIBRARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_malls, LAYOUT_FRAGMENTMALLS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_text_writer, LAYOUT_FRAGMENTTEXTWRITER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTACTION: {
          if ("layout/fragment_action_0".equals(tag)) {
            return new FragmentActionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_action is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHELPDESK: {
          if ("layout/fragment_help_desk_0".equals(tag)) {
            return new FragmentHelpDeskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_help_desk is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOSPITALS: {
          if ("layout/fragment_hospitals_0".equals(tag)) {
            return new FragmentHospitalsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_hospitals is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIBRARY: {
          if ("layout/fragment_library_0".equals(tag)) {
            return new FragmentLibraryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_library is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMALLS: {
          if ("layout/fragment_malls_0".equals(tag)) {
            return new FragmentMallsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_malls is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEXTWRITER: {
          if ("layout/fragment_text_writer_0".equals(tag)) {
            return new FragmentTextWriterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_text_writer is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/fragment_action_0", com.google.mlkit.vision.demo.R.layout.fragment_action);
      sKeys.put("layout/fragment_help_desk_0", com.google.mlkit.vision.demo.R.layout.fragment_help_desk);
      sKeys.put("layout/fragment_home_0", com.google.mlkit.vision.demo.R.layout.fragment_home);
      sKeys.put("layout/fragment_hospitals_0", com.google.mlkit.vision.demo.R.layout.fragment_hospitals);
      sKeys.put("layout/fragment_library_0", com.google.mlkit.vision.demo.R.layout.fragment_library);
      sKeys.put("layout/fragment_malls_0", com.google.mlkit.vision.demo.R.layout.fragment_malls);
      sKeys.put("layout/fragment_map_0", com.google.mlkit.vision.demo.R.layout.fragment_map);
      sKeys.put("layout/fragment_text_writer_0", com.google.mlkit.vision.demo.R.layout.fragment_text_writer);
    }
  }
}
