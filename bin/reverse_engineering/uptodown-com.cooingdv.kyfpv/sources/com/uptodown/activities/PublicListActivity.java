package com.uptodown.activities;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.s;
import b6.a;
import c4.d;
import c4.f7;
import c4.g7;
import c4.h7;
import c4.i7;
import c4.w4;
import c4.w6;
import com.uptodown.R;
import e4.e1;
import f0.i;
import kotlin.jvm.internal.y;
import l5.f;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r7.o0;
import t4.k0;
import t6.c;
import t7.n;
import v7.e;
import x4.d0;
import x4.u0;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class PublicListActivity extends w4 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f3335e0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e1 f3337c0;
    public final String Z = "PublicListActivity";
    public final m a0 = new m(new w6(this, 1));

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f3336b0 = new ViewModelLazy(y.a(i7.class), new h7(this, 0), new g7(this), new h7(this, 1));

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final i f3338d0 = new i(this, 11);

    @Override // c4.w4
    public final String F0() {
        return this.Z;
    }

    public final k0 N0() {
        return (k0) this.a0.getValue();
    }

    public final i7 O0() {
        return (i7) this.f3336b0.getValue();
    }

    public final void P0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = m0.f8289a;
        c0.s(lifecycleScope, n.f10349a, null, new a(this, str, null, 23), 2);
    }

    @Override // c4.k0
    public final void b0(d0 d0Var) {
        d0Var.getClass();
        P0(d0Var.b());
    }

    @Override // c4.k0
    public final void d0(u0 u0Var) {
        u0Var.getClass();
        P0(u0Var.b());
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        c cVar = null;
        w2 w2Var = (getIntent() == null || (extras = getIntent().getExtras()) == null || !extras.containsKey("user")) ? null : (w2) extras.getParcelable("user");
        if (w2Var != null && (str = w2Var.f11432a) != null && str.length() != 0) {
            RelativeLayout relativeLayout = N0().f9943a;
            relativeLayout.getClass();
            setContentView(relativeLayout);
            N0().f9946m.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
            N0().f9946m.setNavigationContentDescription(getString(R.string.back));
            N0().f9946m.setNavigationOnClickListener(new d(this, 12));
            N0().f9948o.setTypeface(f4.c.f4883w);
            N0().f9947n.setTypeface(f4.c.f4884x);
            N0().f9948o.setText(getString(R.string.user_recommended_apps, w2Var.f11435m));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
            N0().f9945l.setLayoutManager(linearLayoutManager);
            N0().f9945l.setItemAnimator(new DefaultItemAnimator());
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            int dimension = (int) getResources().getDimension(R.dimen.margin_m);
            N0().f9945l.addItemDecoration(new f(dimension, dimension));
            N0().f9945l.setItemAnimator(defaultItemAnimator);
            N0().f9945l.addOnScrollListener(new f7(linearLayoutManager, this));
            o0 o0Var = O0().f1722c;
            String str2 = w2Var.f11432a;
            str2.getClass();
            o0Var.getClass();
            o0Var.g(null, str2);
            i7 i7VarO0 = O0();
            i7VarO0.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(i7VarO0);
            e eVar = m0.f8289a;
            c0.s(viewModelScope, v7.d.f10885a, null, new b.n(i7VarO0, this, cVar, 24), 2);
        }
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), n.f10349a, null, new s(this, cVar, 14), 2);
    }
}
