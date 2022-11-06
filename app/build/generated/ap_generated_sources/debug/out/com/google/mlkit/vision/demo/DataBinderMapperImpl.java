package com.google.mlkit.vision.demo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.mlkit.vision.demo.databinding.FragmentActionBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentAddHelpBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentBanksBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentCrutchBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHelpDeskBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHelperBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHomeBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentHospitalsBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentLibraryBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentMallsBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentMapBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentMinistryOfDisabledWebViewBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentRestroBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentTextWriterBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentToiletsBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentWannaHelpBindingImpl;
import com.google.mlkit.vision.demo.databinding.FragmentWheelChairBindingImpl;
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

  private static final int LAYOUT_FRAGMENTADDHELP = 2;

  private static final int LAYOUT_FRAGMENTBANKS = 3;

  private static final int LAYOUT_FRAGMENTCRUTCH = 4;

  private static final int LAYOUT_FRAGMENTHELPDESK = 5;

  private static final int LAYOUT_FRAGMENTHELPER = 6;

  private static final int LAYOUT_FRAGMENTHOME = 7;

  private static final int LAYOUT_FRAGMENTHOSPITALS = 8;

  private static final int LAYOUT_FRAGMENTLIBRARY = 9;

  private static final int LAYOUT_FRAGMENTMALLS = 10;

  private static final int LAYOUT_FRAGMENTMAP = 11;

  private static final int LAYOUT_FRAGMENTMINISTRYOFDISABLEDWEBVIEW = 12;

  private static final int LAYOUT_FRAGMENTRESTRO = 13;

  private static final int LAYOUT_FRAGMENTTEXTWRITER = 14;

  private static final int LAYOUT_FRAGMENTTOILETS = 15;

  private static final int LAYOUT_FRAGMENTWANNAHELP = 16;

  private static final int LAYOUT_FRAGMENTWHEELCHAIR = 17;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(17);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_action, LAYOUT_FRAGMENTACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_add_help, LAYOUT_FRAGMENTADDHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_banks, LAYOUT_FRAGMENTBANKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_crutch, LAYOUT_FRAGMENTCRUTCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_help_desk, LAYOUT_FRAGMENTHELPDESK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_helper, LAYOUT_FRAGMENTHELPER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_hospitals, LAYOUT_FRAGMENTHOSPITALS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_library, LAYOUT_FRAGMENTLIBRARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_malls, LAYOUT_FRAGMENTMALLS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_ministry_of_disabled_web_view, LAYOUT_FRAGMENTMINISTRYOFDISABLEDWEBVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_restro, LAYOUT_FRAGMENTRESTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_text_writer, LAYOUT_FRAGMENTTEXTWRITER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_toilets, LAYOUT_FRAGMENTTOILETS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_wanna_help, LAYOUT_FRAGMENTWANNAHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.vision.demo.R.layout.fragment_wheel_chair, LAYOUT_FRAGMENTWHEELCHAIR);
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
        case  LAYOUT_FRAGMENTADDHELP: {
          if ("layout/fragment_add_help_0".equals(tag)) {
            return new FragmentAddHelpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_help is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBANKS: {
          if ("layout/fragment_banks_0".equals(tag)) {
            return new FragmentBanksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_banks is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCRUTCH: {
          if ("layout/fragment_crutch_0".equals(tag)) {
            return new FragmentCrutchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_crutch is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHELPDESK: {
          if ("layout/fragment_help_desk_0".equals(tag)) {
            return new FragmentHelpDeskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_help_desk is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHELPER: {
          if ("layout/fragment_helper_0".equals(tag)) {
            return new FragmentHelperBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_helper is invalid. Received: " + tag);
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
        case  LAYOUT_FRAGMENTMINISTRYOFDISABLEDWEBVIEW: {
          if ("layout/fragment_ministry_of_disabled_web_view_0".equals(tag)) {
            return new FragmentMinistryOfDisabledWebViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_ministry_of_disabled_web_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESTRO: {
          if ("layout/fragment_restro_0".equals(tag)) {
            return new FragmentRestroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_restro is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEXTWRITER: {
          if ("layout/fragment_text_writer_0".equals(tag)) {
            return new FragmentTextWriterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_text_writer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOILETS: {
          if ("layout/fragment_toilets_0".equals(tag)) {
            return new FragmentToiletsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_toilets is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWANNAHELP: {
          if ("layout/fragment_wanna_help_0".equals(tag)) {
            return new FragmentWannaHelpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_wanna_help is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWHEELCHAIR: {
          if ("layout/fragment_wheel_chair_0".equals(tag)) {
            return new FragmentWheelChairBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_wheel_chair is invalid. Received: " + tag);
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(17);

    static {
      sKeys.put("layout/fragment_action_0", com.google.mlkit.vision.demo.R.layout.fragment_action);
      sKeys.put("layout/fragment_add_help_0", com.google.mlkit.vision.demo.R.layout.fragment_add_help);
      sKeys.put("layout/fragment_banks_0", com.google.mlkit.vision.demo.R.layout.fragment_banks);
      sKeys.put("layout/fragment_crutch_0", com.google.mlkit.vision.demo.R.layout.fragment_crutch);
      sKeys.put("layout/fragment_help_desk_0", com.google.mlkit.vision.demo.R.layout.fragment_help_desk);
      sKeys.put("layout/fragment_helper_0", com.google.mlkit.vision.demo.R.layout.fragment_helper);
      sKeys.put("layout/fragment_home_0", com.google.mlkit.vision.demo.R.layout.fragment_home);
      sKeys.put("layout/fragment_hospitals_0", com.google.mlkit.vision.demo.R.layout.fragment_hospitals);
      sKeys.put("layout/fragment_library_0", com.google.mlkit.vision.demo.R.layout.fragment_library);
      sKeys.put("layout/fragment_malls_0", com.google.mlkit.vision.demo.R.layout.fragment_malls);
      sKeys.put("layout/fragment_map_0", com.google.mlkit.vision.demo.R.layout.fragment_map);
      sKeys.put("layout/fragment_ministry_of_disabled_web_view_0", com.google.mlkit.vision.demo.R.layout.fragment_ministry_of_disabled_web_view);
      sKeys.put("layout/fragment_restro_0", com.google.mlkit.vision.demo.R.layout.fragment_restro);
      sKeys.put("layout/fragment_text_writer_0", com.google.mlkit.vision.demo.R.layout.fragment_text_writer);
      sKeys.put("layout/fragment_toilets_0", com.google.mlkit.vision.demo.R.layout.fragment_toilets);
      sKeys.put("layout/fragment_wanna_help_0", com.google.mlkit.vision.demo.R.layout.fragment_wanna_help);
      sKeys.put("layout/fragment_wheel_chair_0", com.google.mlkit.vision.demo.R.layout.fragment_wheel_chair);
    }
  }
}
