package com.uptodown.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import b4.d;
import c4.a;
import c4.b;
import c4.c;
import c4.k0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import l7.u;
import o7.c0;
import o7.m0;
import q6.l;
import r7.o0;
import t7.n;
import u4.z1;
import v7.e;
import x4.d0;
import x4.e0;
import x4.f0;
import x4.g;
import x4.g0;
import x4.h0;
import x4.i0;
import x4.j;
import x4.r;
import x4.u0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class AppDetailActivity extends k0 {
    public static final /* synthetic */ int X = 0;
    public j O;
    public final o0 P;
    public final o0 Q;
    public final ActivityResultLauncher R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final ActivityResultLauncher V;
    public final b W;

    public AppDetailActivity() {
        Boolean bool = Boolean.FALSE;
        this.P = r7.k0.b(bool);
        this.Q = r7.k0.b(bool);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 1));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.R = activityResultLauncherRegisterForActivityResult;
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 2));
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.V = activityResultLauncherRegisterForActivityResult2;
        this.W = new b(this, 0);
    }

    public final void A0(j jVar) {
        jVar.getClass();
        z1 z1Var = new z1();
        z1Var.f10684m = jVar;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        float f = UptodownApp.I;
        d.C(fragmentTransactionBeginTransaction, this);
        fragmentTransactionBeginTransaction.add(R.id.fl_main_app_detail_activity, z1Var, (String) null).addToBackStack(String.valueOf(jVar.f11225a)).commit();
        this.T.add(z1Var);
    }

    @Override // c4.k0
    public final void b0(d0 d0Var) {
        d0Var.getClass();
        z0(d0Var.c(), d0Var.a());
    }

    @Override // c4.k0
    public final void c0(i0 i0Var) {
        i0Var.getClass();
        if (i0Var instanceof f0) {
            z0(201, ((f0) i0Var).f11151a);
            return;
        }
        if (i0Var instanceof h0) {
            z0(211, ((h0) i0Var).f11210a);
        } else {
            if (i0Var.equals(g0.f11199a) || i0Var.equals(e0.f11138a)) {
                return;
            }
            com.google.gson.internal.a.b();
        }
    }

    @Override // c4.k0
    public final void d0(u0 u0Var) {
        u0Var.getClass();
        z0(u0Var.c(), u0Var.a());
    }

    @Override // c4.k0
    public final void e0(String str) {
        n5.d dVar;
        n5.d dVar2 = this.L;
        if (dVar2 != null) {
            dVar2.getClass();
            if (!u.m0(dVar2.f8070a.F, str, true) || (dVar = this.L) == null) {
                return;
            }
            dVar.b(this);
        }
    }

    @Override // c4.k0
    public final void f0(String str, String str2) {
        n5.d dVar;
        if (str != null) {
            ArrayList arrayList = this.S;
            u4.f0 f0Var = !arrayList.isEmpty() ? (u4.f0) l.y0(arrayList) : null;
            if (f0Var != null && f0Var.isResumed()) {
                f0Var.v0(str);
            }
            n5.d dVar2 = this.L;
            if (dVar2 == null || !u.m0(dVar2.f8070a.F, str, true) || (dVar = this.L) == null) {
                return;
            }
            dVar.b(this);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        o0 o0Var = this.P;
        boolean zBooleanValue = ((Boolean) o0Var.getValue()).booleanValue();
        o0 o0Var2 = this.Q;
        if (zBooleanValue || ((Boolean) o0Var2.getValue()).booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("wishlistChanged", ((Boolean) o0Var.getValue()).booleanValue());
            intent.putExtra("recommendedAppsChanged", ((Boolean) o0Var2.getValue()).booleanValue());
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // c4.k0
    public final void i0(long j) {
        if (T()) {
            if (j <= 0) {
                k0();
                return;
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = m0.f8289a;
            c0.s(lifecycleScope, n.f10349a, null, new c(this, j, null, 0), 2);
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        Bundle extras;
        super.onCreate(bundle);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.app_detail_activity, (ViewGroup) null);
        viewInflate.getClass();
        setContentView(viewInflate);
        Intent intent = getIntent();
        this.M = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        if (intent == null || (extras = intent.getExtras()) == null) {
            gVar = null;
        } else {
            if (extras.containsKey("appInfo")) {
                gVar = (g) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("appInfo", g.class) : extras.getParcelable("appInfo"));
            } else {
                gVar = null;
            }
            if (extras.containsKey("viewCategory")) {
                this.O = (j) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("viewCategory", j.class) : extras.getParcelable("viewCategory"));
            }
        }
        u4.f0 f0Var = new u4.f0();
        Bundle bundle2 = new Bundle();
        if (gVar != null) {
            bundle2.putParcelable("appInfo", gVar);
        }
        f0Var.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().add(R.id.fl_main_app_detail_activity, f0Var, (String) null).commit();
        getOnBackPressedDispatcher().addCallback(this, this.W);
        this.K = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 0));
        this.S.add(f0Var);
        j jVar = this.O;
        if (jVar != null) {
            A0(jVar);
        }
    }

    @Override // c4.k0
    public final void x0(g gVar) {
        gVar.getClass();
        if (T()) {
            u4.f0 f0Var = new u4.f0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("appInfo", gVar);
            f0Var.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.fl_main_app_detail_activity, f0Var, (String) null).addToBackStack(String.valueOf(gVar.f11159a)).commit();
            this.S.add(f0Var);
        }
    }

    public final void y0(g gVar) {
        gVar.getClass();
        if (isFinishing()) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
        intent.putExtra("appInfo", gVar);
        float f = UptodownApp.I;
        this.R.launch(intent, d.b(this));
    }

    public final void z0(int i, r rVar) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = m0.f8289a;
        c0.s(lifecycleScope, n.f10349a, null, new b.n(rVar, this, i, null, 7), 2);
    }
}
