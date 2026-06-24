package com.uptodown.tv.ui.fragment;

import a2.s;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import e5.n;
import g5.a0;
import g5.x;
import g5.y;
import o7.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TvMyAppsFragment extends VerticalGridSupportFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f3433b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AlertDialog f3434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3436n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleCoroutineScope f3432a = LifecycleOwnerKt.getLifecycleScope(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3437o = 5;

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        n nVar = new n();
        nVar.f4747a = -1;
        nVar.f4748b = -1;
        nVar.f4749l = -1;
        nVar.f4750m = -1;
        x xVar = new x(nVar);
        this.f3433b = xVar;
        setAdapter(xVar);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("updates")) {
                this.f3435m = extras.getBoolean("updates");
            }
            if (extras.containsKey("rollback")) {
                this.f3436n = extras.getBoolean("rollback");
            }
        }
        if (this.f3435m) {
            setTitle(getString(R.string.updates));
        } else if (this.f3436n) {
            setTitle(getString(R.string.rollback_title));
        } else {
            setTitle(getString(R.string.installed));
        }
        if (bundle == null) {
            prepareEntranceTransition();
        }
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(this.f3437o);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new s(this, 13), 500L);
        setOnItemViewClickedListener(new y(this));
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c0.s(this.f3432a, null, null, new a0(this, null, 0), 3);
    }
}
