package com.google.mlkit.vision.demo.databinding;
import com.google.mlkit.vision.demo.R;
import com.google.mlkit.vision.demo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bb, 1);
        sViewsWithIds.put(R.id.menuy, 2);
        sViewsWithIds.put(R.id.notificationbellllll, 3);
        sViewsWithIds.put(R.id.welcometxt, 4);
        sViewsWithIds.put(R.id.stucked, 5);
        sViewsWithIds.put(R.id.stucktxt, 6);
        sViewsWithIds.put(R.id.locatenow, 7);
        sViewsWithIds.put(R.id.loc1, 8);
        sViewsWithIds.put(R.id.help, 9);
        sViewsWithIds.put(R.id.help1, 10);
        sViewsWithIds.put(R.id.nearrr, 11);
        sViewsWithIds.put(R.id.mallcard, 12);
        sViewsWithIds.put(R.id.mall, 13);
        sViewsWithIds.put(R.id.hospitalscard, 14);
        sViewsWithIds.put(R.id.hospital, 15);
        sViewsWithIds.put(R.id.bankscard, 16);
        sViewsWithIds.put(R.id.bank, 17);
        sViewsWithIds.put(R.id.librarycard, 18);
        sViewsWithIds.put(R.id.library, 19);
        sViewsWithIds.put(R.id.restaurantcard, 20);
        sViewsWithIds.put(R.id.restaurant, 21);
        sViewsWithIds.put(R.id.toiletcard, 22);
        sViewsWithIds.put(R.id.toilety, 23);
        sViewsWithIds.put(R.id.donatecard, 24);
        sViewsWithIds.put(R.id.xyzq, 25);
        sViewsWithIds.put(R.id.lottiee, 26);
        sViewsWithIds.put(R.id.ss, 27);
        sViewsWithIds.put(R.id.bookaservicetxt, 28);
        sViewsWithIds.put(R.id.wheely, 29);
        sViewsWithIds.put(R.id.wheelchairimg, 30);
        sViewsWithIds.put(R.id.crutchy, 31);
        sViewsWithIds.put(R.id.crutches, 32);
        sViewsWithIds.put(R.id.helpuuu, 33);
        sViewsWithIds.put(R.id.helper, 34);
        sViewsWithIds.put(R.id.goi_explore, 35);
        sViewsWithIds.put(R.id.xyz, 36);
        sViewsWithIds.put(R.id.pp, 37);
        sViewsWithIds.put(R.id.text_to_speech, 38);
        sViewsWithIds.put(R.id.tt1, 39);
        sViewsWithIds.put(R.id.actions_text_to_speech, 40);
        sViewsWithIds.put(R.id.tt2, 41);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[40]
            , (android.widget.ImageView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[28]
            , (android.widget.ImageView) bindings[32]
            , (androidx.cardview.widget.CardView) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[35]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[34]
            , (androidx.cardview.widget.CardView) bindings[33]
            , (android.widget.ImageView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (android.widget.ImageView) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (android.widget.ImageView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.airbnb.lottie.LottieAnimationView) bindings[26]
            , (android.widget.ImageView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[37]
            , (android.widget.ImageView) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[20]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[38]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[30]
            , (androidx.cardview.widget.CardView) bindings[29]
            , (android.widget.RelativeLayout) bindings[36]
            , (android.widget.RelativeLayout) bindings[25]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}