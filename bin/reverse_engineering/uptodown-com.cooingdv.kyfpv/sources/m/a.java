package m;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.uptodown.R;
import h9.d;
import m9.c;
import o6.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f7264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n9.a f7265b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n9.a f7266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n9.a f7267m;

    public final void a() {
        FragmentActivity activity;
        if (!isAdded() || (activity = getActivity()) == null) {
            return;
        }
        activity.isFinishing();
    }

    public abstract void b(ViewStub viewStub);

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.SheetDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.base_bottom_sheet, viewGroup, false);
        viewInflate.getClass();
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(R.id.container_vs);
        if (viewStub == null) {
            return viewInflate;
        }
        b(viewStub);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Resources resources;
        DisplayMetrics displayMetrics;
        super.onResume();
        View view = getView();
        if (view == null) {
            return;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(view2);
        bottomSheetBehaviorFrom.getClass();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorFrom.setPeekHeight(i);
        ViewStub viewStub = (ViewStub) view2.findViewById(R.id.container_vs);
        if (viewStub == null) {
            return;
        }
        viewStub.inflate().setMinimumHeight((int) (((double) i) * 0.25d));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.f7264a = c.f7861d;
        this.f7265b = e.f8226b;
        this.f7266l = e.f8229e;
        this.f7267m = e.f8228d;
    }
}
