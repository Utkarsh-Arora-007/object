package com.google.mlkit.vision.demo.databinding;
import com.google.mlkit.vision.demo.R;
import com.google.mlkit.vision.demo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentActionBindingImpl extends FragmentActionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hea, 1);
        sViewsWithIds.put(R.id.c1, 2);
        sViewsWithIds.put(R.id.I1, 3);
        sViewsWithIds.put(R.id.T1, 4);
        sViewsWithIds.put(R.id.c2, 5);
        sViewsWithIds.put(R.id.I2, 6);
        sViewsWithIds.put(R.id.T2, 7);
        sViewsWithIds.put(R.id.c3, 8);
        sViewsWithIds.put(R.id.I3, 9);
        sViewsWithIds.put(R.id.c4, 10);
        sViewsWithIds.put(R.id.I4, 11);
        sViewsWithIds.put(R.id.c5, 12);
        sViewsWithIds.put(R.id.I5, 13);
        sViewsWithIds.put(R.id.c6, 14);
        sViewsWithIds.put(R.id.I6, 15);
        sViewsWithIds.put(R.id.c7, 16);
        sViewsWithIds.put(R.id.I7, 17);
        sViewsWithIds.put(R.id.c8, 18);
        sViewsWithIds.put(R.id.I8, 19);
        sViewsWithIds.put(R.id.c9, 20);
        sViewsWithIds.put(R.id.I9, 21);
        sViewsWithIds.put(R.id.c10, 22);
        sViewsWithIds.put(R.id.I10, 23);
        sViewsWithIds.put(R.id.c11, 24);
        sViewsWithIds.put(R.id.I11, 25);
        sViewsWithIds.put(R.id.c12, 26);
        sViewsWithIds.put(R.id.I12, 27);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentActionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FragmentActionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[26]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.cardview.widget.CardView) bindings[20]
            , (android.widget.TextView) bindings[1]
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