package com.uptodown.tv.ui.fragment;

import a2.s;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.l;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import b4.d;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import e5.p;
import g5.e0;
import g5.x;
import j5.a;
import java.util.Arrays;
import o7.c0;
import o7.m0;
import t6.c;
import x4.e;
import x4.g;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TvOldVersionsFragment extends VerticalGridSupportFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f3441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f3442b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AlertDialog f3443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f3444m;

    public static final void a(TvOldVersionsFragment tvOldVersionsFragment, r rVar) {
        Context contextRequireContext = tvOldVersionsFragment.requireContext();
        contextRequireContext.getClass();
        int iR = rVar.r(contextRequireContext);
        if (iR < 0) {
            Toast.makeText(tvOldVersionsFragment.getContext(), tvOldVersionsFragment.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
            return;
        }
        Context contextRequireContext2 = tvOldVersionsFragment.requireContext();
        contextRequireContext2.getClass();
        float f = UptodownApp.I;
        if (!d.p(contextRequireContext2, "downloadApkWorker")) {
            WorkManager.Companion.getInstance(contextRequireContext2).enqueue(((OneTimeWorkRequest.Builder) l.t(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", iR).build()).build());
            return;
        }
        Context context = tvOldVersionsFragment.getContext();
        String string = tvOldVersionsFragment.getString(R.string.msg_added_to_downlads_queue);
        string.getClass();
        g gVar = tvOldVersionsFragment.f3441a;
        gVar.getClass();
        Toast.makeText(context, String.format(string, Arrays.copyOf(new Object[]{gVar.f11160b}, 1)), 1).show();
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("app")) {
                this.f3442b = (e) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("app", e.class) : extras.getParcelable("app"));
            }
            if (extras.containsKey("appInfo")) {
                this.f3441a = (g) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("appInfo", g.class) : extras.getParcelable("appInfo"));
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                g gVar = this.f3441a;
                gVar.getClass();
                this.f3442b = a.h(contextRequireContext, gVar.F);
            }
        }
        e eVar = this.f3442b;
        if (eVar != null) {
            p pVar = new p();
            pVar.f4753a = eVar.f11124l;
            pVar.f4754b = eVar;
            this.f3444m = new x(pVar);
        } else {
            g gVar2 = this.f3441a;
            if (gVar2 != null) {
                String str = gVar2.F;
                p pVar2 = new p();
                pVar2.f4753a = str;
                this.f3444m = new x(pVar2);
            }
        }
        setAdapter(this.f3444m);
        setTitle(getString(R.string.rollback_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new s(this, 14), 500L);
        setOnItemViewClickedListener(new e0(this));
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        v7.e eVar = m0.f8289a;
        c0.s(lifecycleScope, v7.d.f10885a, null, new b.s(this, (c) null, 22), 2);
    }
}
