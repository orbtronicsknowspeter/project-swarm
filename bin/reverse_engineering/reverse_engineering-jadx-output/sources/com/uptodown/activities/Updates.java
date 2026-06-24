package com.uptodown.activities;

import a5.d;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.l;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import c4.b;
import c4.db;
import c4.e;
import c4.eb;
import c4.ka;
import c4.la;
import c4.ma;
import c4.n4;
import c4.oa;
import c4.qa;
import c4.ra;
import c4.ta;
import c4.ua;
import c4.w;
import c4.w4;
import c4.wa;
import c4.xa;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Updates;
import com.uptodown.workers.DownloadUpdatesWorker;
import e4.v0;
import e4.x0;
import f4.c;
import j5.a;
import j5.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.y;
import l5.f;
import l7.u;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r7.o0;
import t4.y0;
import t7.n;
import x4.d0;
import x4.j0;
import x4.o1;
import x4.p0;
import x4.q2;
import x4.r;
import x4.u0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class Updates extends w4 {
    public static final /* synthetic */ int n0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f3355b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public x0 f3356c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f3358e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f3359f0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ActivityResultLauncher f3365l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final b f3366m0;
    public final m Z = new m(new ka(this, 0));
    public final ViewModelLazy a0 = new ViewModelLazy(y.a(eb.class), new xa(this, 0), new wa(this), new xa(this, 1));

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ArrayList f3357d0 = new ArrayList();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f3360g0 = "panel_actualizaciones_individual";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final oa f3361h0 = new oa(this, 1);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final oa f3362i0 = new oa(this, 0);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ra f3363j0 = new ra(this);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ra f3364k0 = new ra(this);

    public Updates() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new la(this));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f3365l0 = activityResultLauncherRegisterForActivityResult;
        this.f3366m0 = new b(this, 5);
    }

    public static final void N0(Updates updates, String str) {
        q2 q2VarY;
        if (updates.f3357d0.isEmpty()) {
            return;
        }
        g gVarL = g.D.l(updates);
        gVarL.b();
        r rVarA = null;
        if (str != null && (q2VarY = gVarL.Y(str)) != null) {
            rVarA = q2VarY.a(updates);
        }
        gVarL.c();
        updates.T0().f10250o.setOnClickListener(new e(23));
        updates.T0().f10255t.setText(updates.getString(2131951943, String.valueOf(updates.f3357d0.size() - 1)));
        if (rVarA != null) {
            updates.T0().f10247l.setIndeterminate(false);
            updates.T0().f10247l.setProgress(rVarA.i());
        }
    }

    @Override // c4.w4
    public final void A0(String str, ArrayList arrayList) {
        str.getClass();
        String string = getString(2131952292);
        string.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = m0.f8288a;
        c0.s(lifecycleScope, n.f10348a, null, new w(this, str, string, arrayList, null, 6), 2);
    }

    @Override // c4.w4
    public final String F0() {
        return this.f3360g0;
    }

    @Override // c4.w4
    public final void H0() {
        P0();
        a1();
    }

    @Override // c4.w4
    public final void J0() {
        X0(false);
    }

    @Override // c4.w4
    public final void K0() {
        X0(false);
    }

    public final void O0(int i) {
        if (W0(i)) {
            x0 x0Var = this.f3356c0;
            x0Var.getClass();
            Object obj = x0Var.a().get(i);
            obj.getClass();
            x4.e eVar = ((v0) obj).f4708a;
            Q0(eVar.f11123l);
            G0(eVar);
            x0 x0Var2 = this.f3356c0;
            if (x0Var2 != null) {
                x0Var2.notifyItemChanged(i);
            }
        }
    }

    public final void P0() {
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.h = false;
        }
        float f = UptodownApp.I;
        synchronized (UptodownApp.f3294h0) {
            UptodownApp.f3295i0 = null;
        }
        V0();
        x0 x0Var2 = this.f3356c0;
        Integer numValueOf = x0Var2 != null ? Integer.valueOf(x0Var2.a().size()) : null;
        if (numValueOf != null && numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            for (int i = 0; i < iIntValue; i++) {
                O0(i);
            }
        }
        this.f3357d0 = new ArrayList();
    }

    public final void Q0(String str) {
        if (str != null) {
            Iterator it = this.f3357d0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i6 = i + 1;
                if (u.m0(((x4.e) it.next()).f11123l, str, true)) {
                    break;
                } else {
                    i = i6;
                }
            }
            if (i >= 0) {
                this.f3357d0.remove(i);
            }
        }
    }

    public final void R0() {
        File fileG;
        if (!z3.f2928c) {
            P0();
            return;
        }
        if (!this.f3357d0.isEmpty()) {
            o0 o0Var = d.f201a;
            if (!(o0Var.getValue() instanceof o1)) {
                float f = UptodownApp.I;
                if (!b4.d.p(this, "GenerateQueueWorker") && !b4.d.p(this, "downloadApkWorker")) {
                    Object obj = this.f3357d0.get(0);
                    obj.getClass();
                    e1.c0 c0Var = g.D;
                    g gVarL = c0Var.l(this);
                    gVarL.b();
                    String str = ((x4.e) obj).f11123l;
                    str.getClass();
                    q2 q2VarY = gVarL.Y(str);
                    r rVarA = q2VarY != null ? q2VarY.a(this) : null;
                    gVarL.c();
                    Z0(this.f3357d0.size() - 1);
                    if (rVarA == null || !rVarA.c()) {
                        boolean z9 = this.f3358e0;
                        if (b4.d.p(this, "DownloadUpdatesWorker")) {
                            return;
                        }
                        WorkManager.Companion.getInstance(this).enqueue(((OneTimeWorkRequest.Builder) l.t(DownloadUpdatesWorker.class, "DownloadUpdatesWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", z9).build()).build());
                        return;
                    }
                    if (o0Var.getValue() instanceof o1) {
                        a1();
                        return;
                    }
                    if (this.f3357d0.isEmpty()) {
                        a1();
                        return;
                    }
                    Object objRemove = this.f3357d0.remove(0);
                    objRemove.getClass();
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    g gVarL2 = c0Var.l(applicationContext);
                    gVarL2.b();
                    String str2 = ((x4.e) objRemove).f11123l;
                    str2.getClass();
                    q2 q2VarY2 = gVarL2.Y(str2);
                    r rVarA2 = q2VarY2 != null ? q2VarY2.a(this) : null;
                    gVarL2.c();
                    Z0(this.f3357d0.size());
                    if (rVarA2 == null || !rVarA2.c() || (fileG = rVarA2.g()) == null) {
                        R0();
                        return;
                    }
                    if (q2VarY2.f11349p == 1) {
                        S(q2VarY2, fileG);
                    } else {
                        W(fileG, null);
                    }
                    if (this.f3357d0.isEmpty()) {
                        if (b4.d.p(this, "DownloadUpdatesWorker")) {
                            a1();
                            return;
                        } else {
                            V0();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.h = false;
        }
        a1();
    }

    public final int S0(String str) {
        x0 x0Var;
        if (str == null || (x0Var = this.f3356c0) == null) {
            return -1;
        }
        ArrayList arrayListA = x0Var.a();
        Iterator it = arrayListA.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i6 = i + 1;
            if (it.next() instanceof v0) {
                Object obj = arrayListA.get(i);
                obj.getClass();
                if (u.m0(((v0) obj).f4708a.f11123l, str, true)) {
                    return i;
                }
            }
            i = i6;
        }
        return -1;
    }

    public final y0 T0() {
        return (y0) this.Z.getValue();
    }

    public final eb U0() {
        return (eb) this.a0.getValue();
    }

    public final void V0() {
        SharedPreferences sharedPreferences;
        int i = 0;
        T0().f10256u.setVisibility(0);
        T0().f10250o.setVisibility(8);
        if (T0().f10248m.getVisibility() == 0) {
            RelativeLayout relativeLayout = T0().f10248m;
            qa qaVar = new qa(this, i);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, 2130772034);
            float f = UptodownApp.I;
            boolean z9 = true;
            try {
                sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            boolean z10 = sharedPreferences.contains("animations") ? sharedPreferences.getBoolean("animations", true) : true;
            if (z10) {
                float f10 = UptodownApp.I;
                animationLoadAnimation.setAnimationListener(qaVar);
                relativeLayout.startAnimation(animationLoadAnimation);
            }
            RelativeLayout relativeLayout2 = T0().f10249n;
            float f11 = UptodownApp.I;
            try {
                SharedPreferences sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences2.contains("animations")) {
                    z9 = sharedPreferences2.getBoolean("animations", true);
                }
            } catch (Exception unused2) {
            }
            if (z9) {
                float f12 = UptodownApp.I;
                relativeLayout2.startAnimation(AnimationUtils.loadAnimation(this, 2130772034));
                relativeLayout2.setVisibility(8);
            } else {
                relativeLayout2.setVisibility(8);
            }
            T0().f10248m.setVisibility(8);
        }
    }

    public final boolean W0(int i) {
        x0 x0Var = this.f3356c0;
        if (x0Var == null || i < 0) {
            return false;
        }
        x0Var.getClass();
        if (i >= x0Var.getItemCount()) {
            return false;
        }
        x0 x0Var2 = this.f3356c0;
        ArrayList arrayListA = x0Var2 != null ? x0Var2.a() : null;
        if (arrayListA == null || arrayListA.isEmpty()) {
            return false;
        }
        x0 x0Var3 = this.f3356c0;
        ArrayList arrayListA2 = x0Var3 != null ? x0Var3.a() : null;
        arrayListA2.getClass();
        if (arrayListA2.size() <= i) {
            return false;
        }
        x0 x0Var4 = this.f3356c0;
        ArrayList arrayListA3 = x0Var4 != null ? x0Var4.a() : null;
        arrayListA3.getClass();
        return arrayListA3.get(i) instanceof v0;
    }

    public final void X0(boolean z9) {
        eb ebVarU0 = U0();
        ebVarU0.getClass();
        a0 viewModelScope = ViewModelKt.getViewModelScope(ebVarU0);
        v7.e eVar = m0.f8288a;
        c0.s(viewModelScope, v7.d.f10884a, null, new db(z9, ebVarU0, this, null), 2);
    }

    @Override // c4.k0
    public final void Y(String str) {
        this.f3359f0 = null;
        X0(false);
    }

    public final void Y0() {
        float f = UptodownApp.I;
        int i = 0;
        if (b4.d.p(this, "downloadApkWorker")) {
            x0 x0Var = this.f3356c0;
            if (x0Var != null) {
                x0Var.h = false;
                return;
            }
            return;
        }
        this.f3357d0 = new ArrayList();
        ArrayList arrayList = this.f3355b0;
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            this.f3357d0.add(((v0) next).f4708a);
        }
        Iterator it2 = this.f3357d0.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            x4.e eVar = (x4.e) next2;
            String str = eVar.f11123l;
            if (str != null) {
                a5.e.b(str, "panel_actualizaciones_actualizar_todo");
            }
            w4.D0(eVar);
        }
        x0 x0Var2 = this.f3356c0;
        if (x0Var2 != null) {
            x0Var2.h = true;
            Iterator it3 = x0Var2.a().iterator();
            int i6 = 0;
            int i10 = -1;
            while (it3.hasNext()) {
                int i11 = i + 1;
                if (it3.next() instanceof v0) {
                    if (i10 == -1) {
                        i10 = i;
                    } else {
                        i6++;
                    }
                } else if (i10 != -1) {
                    break;
                }
                i = i11;
            }
            if (i10 >= 0) {
                x0Var2.notifyItemRangeChanged(i10, i6);
            } else {
                x0Var2.notifyDataSetChanged();
            }
        }
        a1();
        R0();
    }

    @Override // c4.k0
    public final void Z(String str) {
        Q0(str);
        X0(false);
    }

    public final void Z0(int i) {
        if (!this.f3357d0.isEmpty() || i >= 0) {
            T0().f10255t.setText(getString(2131951943, String.valueOf(i)));
            T0().f10247l.setIndeterminate(true);
        }
    }

    @Override // c4.k0
    public final void a0(String str) {
        this.f3359f0 = null;
        Q0(str);
        x0 x0Var = this.f3356c0;
        if (x0Var != null && str != null) {
            Iterator it = x0Var.a().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i6 = i + 1;
                Object next = it.next();
                if ((next instanceof v0) && u.m0(((v0) next).f4709b.f11344b, str, true)) {
                    break;
                } else {
                    i = i6;
                }
            }
            x0 x0Var2 = this.f3356c0;
            if (x0Var2 != null && i >= 0 && i < x0Var2.a().size()) {
                Object objRemove = x0Var2.a().remove(i);
                objRemove.getClass();
                x4.e eVar = ((v0) objRemove).f4708a;
                eVar.f11127p = x4.d.f11088b;
                x0Var2.notifyItemRemoved(i);
                int iIndexOf = x0Var2.a().indexOf("title_recent_updates") + 1;
                x0Var2.a().add(iIndexOf, eVar);
                x0Var2.notifyItemInserted(iIndexOf);
            }
        }
        X0(false);
        R0();
    }

    public final void a1() {
        SharedPreferences sharedPreferences;
        ArrayList arrayList = this.f3355b0;
        if (arrayList != null) {
            boolean z9 = true;
            z9 = true;
            if (arrayList.size() > 1) {
                if (this.f3357d0.isEmpty()) {
                    T0().f10256u.setVisibility(0);
                    T0().f10250o.setVisibility(8);
                } else {
                    T0().f10256u.setVisibility(8);
                    T0().f10250o.setVisibility(0);
                }
                if (z3.f2928c) {
                    T0().f10256u.setAlpha(1.0f);
                } else {
                    T0().f10256u.setAlpha(0.4f);
                }
                if (T0().f10248m.getVisibility() == 8) {
                    RelativeLayout relativeLayout = T0().f10248m;
                    qa qaVar = new qa(this, z9 ? 1 : 0);
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, 2130772030);
                    float f = UptodownApp.I;
                    try {
                        sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused) {
                    }
                    boolean z10 = sharedPreferences.contains("animations") ? sharedPreferences.getBoolean("animations", true) : true;
                    if (z10) {
                        float f10 = UptodownApp.I;
                        animationLoadAnimation.setAnimationListener(qaVar);
                        relativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        qaVar.onAnimationEnd(animationLoadAnimation);
                    }
                    RelativeLayout relativeLayout2 = T0().f10249n;
                    float f11 = UptodownApp.I;
                    try {
                        SharedPreferences sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences2.contains("animations")) {
                            z9 = sharedPreferences2.getBoolean("animations", true);
                        }
                    } catch (Exception unused2) {
                    }
                    if (z9) {
                        float f12 = UptodownApp.I;
                        relativeLayout2.startAnimation(AnimationUtils.loadAnimation(this, 2130772030));
                        relativeLayout2.setVisibility(0);
                    } else {
                        relativeLayout2.setVisibility(0);
                    }
                    T0().f10248m.setVisibility(0);
                    return;
                }
                return;
            }
        }
        V0();
    }

    @Override // c4.k0
    public final void b0(d0 d0Var) {
        d0Var.getClass();
        int iC = d0Var.c();
        String strB = d0Var.b();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = m0.f8288a;
        c0.s(lifecycleScope, n.f10348a, null, new n4(iC, null, this, strB, null, 1), 2);
    }

    @Override // c4.k0
    public final void d0(u0 u0Var) {
        Bundle bundle;
        u0Var.getClass();
        int iC = u0Var.c();
        String strB = u0Var.b();
        if (u0Var instanceof p0) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("apps_parcelable", ((p0) u0Var).f11328a);
            bundle = bundle2;
        } else {
            bundle = null;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = m0.f8288a;
        c0.s(lifecycleScope, n.f10348a, null, new n4(iC, bundle, this, strB, null, 1), 2);
    }

    @Override // c4.k0
    public final void e0(String str) {
        if (str != null) {
            int iS0 = S0(str);
            if (W0(iS0)) {
                x0 x0Var = this.f3356c0;
                x0Var.getClass();
                Object obj = x0Var.a().get(iS0);
                obj.getClass();
                x4.e eVar = ((v0) obj).f4708a;
                Q0(eVar.f11123l);
                G0(eVar);
                x0 x0Var2 = this.f3356c0;
                if (x0Var2 != null) {
                    x0Var2.notifyItemChanged(iS0);
                }
            }
        }
        x0 x0Var3 = this.f3356c0;
        if (x0Var3 != null) {
            x0Var3.g = -1;
        }
        R0();
    }

    @Override // c4.k0
    public final void f0(String str, String str2) {
        String str3;
        x4.e eVar;
        String str4;
        this.f3359f0 = null;
        ArrayList arrayList = this.f3355b0;
        int i = 0;
        if (arrayList != null) {
            q6.r.m0(arrayList, new ma(str, i));
        }
        x0 x0Var = this.f3356c0;
        int i6 = -1;
        if (x0Var != null) {
            x0Var.g = -1;
        }
        if (x0Var != null && str != null && str.length() != 0) {
            int i10 = 0;
            for (Object obj : x0Var.a()) {
                int i11 = i10 + 1;
                if (((obj instanceof x4.e) && (str4 = (eVar = (x4.e) obj).f11123l) != null && str4.length() != 0 && u.m0(eVar.f11123l, str, true)) || ((obj instanceof v0) && u.m0(((v0) obj).f4709b.f11344b, str, true))) {
                    i6 = i10;
                    break;
                }
                i10 = i11;
            }
            if (i6 >= 0) {
                g gVarL = g.D.l(this);
                gVarL.b();
                q2 q2VarY = gVarL.Y(str);
                gVarL.c();
                if (q2VarY == null || !q2VarY.c()) {
                    x0Var.notifyItemChanged(i6);
                } else {
                    x0Var.a().remove(i6);
                    x0Var.notifyItemRemoved(i6);
                }
            }
        }
        R0();
        x4.e eVarH = a.h(this, str);
        if (eVarH == null || (str3 = eVarH.f11122b) == null || str3.length() == 0) {
            return;
        }
        String string = getString(2131952081, eVarH.f11122b);
        string.getClass();
        A(string);
    }

    @Override // c4.k0
    public final void g0() {
        String str = this.f3359f0;
        this.f3359f0 = null;
        if (str != null) {
            Q0(str);
        }
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.notifyDataSetChanged();
        }
        R0();
    }

    @Override // c4.k0
    public final void h0(String str) {
        this.f3359f0 = str;
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.notifyDataSetChanged();
        }
    }

    @Override // c4.k0
    public final void n0() {
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.g = -1;
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = T0().f10245a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, 2131230922);
        if (drawable != null) {
            T0().f10253r.setNavigationIcon(drawable);
            T0().f10253r.setNavigationContentDescription(getString(2131951735));
        }
        final int i = 0;
        T0().f10253r.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c4.na

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Updates f1916b;

            {
                this.f1916b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i;
                Updates updates = this.f1916b;
                switch (i6) {
                    case 0:
                        int i10 = Updates.n0;
                        updates.finish();
                        break;
                    case 1:
                        int i11 = Updates.n0;
                        float f = UptodownApp.I;
                        if (b4.d.t()) {
                            if (!com.google.android.gms.internal.measurement.z3.f2928c) {
                                String string = updates.getString(2131952001);
                                string.getClass();
                                updates.N(string);
                            } else if (com.google.android.gms.internal.measurement.z3.f || updates.f3358e0) {
                                updates.Y0();
                            } else {
                                updates.L0(new ka(updates, 1));
                            }
                        }
                        break;
                    default:
                        int i12 = Updates.n0;
                        float f10 = UptodownApp.I;
                        if (b4.d.t()) {
                            updates.P0();
                            updates.a1();
                        }
                        break;
                }
            }
        });
        T0().v.setTypeface(c.f4882w);
        T0().f10253r.inflateMenu(2131689480);
        Drawable drawable2 = ContextCompat.getDrawable(this, 2131231365);
        if (drawable2 != null) {
            T0().f10253r.setOverflowIcon(drawable2);
        }
        try {
            sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences2.contains("show_system_apps") ? sharedPreferences2.getBoolean("show_system_apps", false) : false;
        T0().f10253r.getMenu().findItem(2131361894).setChecked(z9);
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused2) {
        }
        boolean z10 = sharedPreferences.contains("show_system_services") ? sharedPreferences.getBoolean("show_system_services", false) : false;
        T0().f10253r.getMenu().findItem(2131361895).setChecked(z10);
        w4.C0(T0().f10253r, z9);
        T0().f10253r.setOnMenuItemClickListener(new la(this));
        final int i6 = 1;
        T0().f10251p.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(2131166251);
        T0().f10251p.addItemDecoration(new f(dimension, dimension));
        T0().f10251p.setItemAnimator(defaultItemAnimator);
        T0().f10246b.setOnClickListener(new e(23));
        T0().f10256u.setTypeface(c.f4882w);
        T0().f10256u.setOnClickListener(new View.OnClickListener(this) { // from class: c4.na

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Updates f1916b;

            {
                this.f1916b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                Updates updates = this.f1916b;
                switch (i62) {
                    case 0:
                        int i10 = Updates.n0;
                        updates.finish();
                        break;
                    case 1:
                        int i11 = Updates.n0;
                        float f = UptodownApp.I;
                        if (b4.d.t()) {
                            if (!com.google.android.gms.internal.measurement.z3.f2928c) {
                                String string = updates.getString(2131952001);
                                string.getClass();
                                updates.N(string);
                            } else if (com.google.android.gms.internal.measurement.z3.f || updates.f3358e0) {
                                updates.Y0();
                            } else {
                                updates.L0(new ka(updates, 1));
                            }
                        }
                        break;
                    default:
                        int i12 = Updates.n0;
                        float f10 = UptodownApp.I;
                        if (b4.d.t()) {
                            updates.P0();
                            updates.a1();
                        }
                        break;
                }
            }
        });
        T0().f10255t.setTypeface(c.f4883x);
        T0().f10254s.setTypeface(c.f4882w);
        final int i10 = 2;
        T0().f10254s.setOnClickListener(new View.OnClickListener(this) { // from class: c4.na

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Updates f1916b;

            {
                this.f1916b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i10;
                Updates updates = this.f1916b;
                switch (i62) {
                    case 0:
                        int i102 = Updates.n0;
                        updates.finish();
                        break;
                    case 1:
                        int i11 = Updates.n0;
                        float f = UptodownApp.I;
                        if (b4.d.t()) {
                            if (!com.google.android.gms.internal.measurement.z3.f2928c) {
                                String string = updates.getString(2131952001);
                                string.getClass();
                                updates.N(string);
                            } else if (com.google.android.gms.internal.measurement.z3.f || updates.f3358e0) {
                                updates.Y0();
                            } else {
                                updates.L0(new ka(updates, 1));
                            }
                        }
                        break;
                    default:
                        int i12 = Updates.n0;
                        float f10 = UptodownApp.I;
                        if (b4.d.t()) {
                            updates.P0();
                            updates.a1();
                        }
                        break;
                }
            }
        });
        T0().f10252q.setColorSchemeColors(ContextCompat.getColor(this, 2131100500), ContextCompat.getColor(this, 2131100502));
        T0().f10252q.setOnRefreshListener(new la(this));
        T0().f10248m.setOnClickListener(new e(23));
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        try {
            SharedPreferences sharedPreferences3 = applicationContext.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences3.contains("install_apk_rooted")) {
                sharedPreferences3.getBoolean("install_apk_rooted", false);
            }
        } catch (Exception unused3) {
        }
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ua(this, null), 3);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), n.f10348a, null, new ta(this, (t6.c) null, i6), 2);
        getOnBackPressedDispatcher().addCallback(this, this.f3366m0);
        X0(true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (a5.b.d()) {
            WorkManager.Companion.getInstance(this).cancelAllWorkByTag("DownloadUpdatesWorker");
            float f = UptodownApp.I;
            synchronized (UptodownApp.f3294h0) {
                UptodownApp.f3295i0 = null;
            }
        }
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.notifyDataSetChanged();
        }
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
        R0();
    }

    @Override // c4.k0
    public final void p0(File file) {
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.g = -1;
        }
        if (x0Var != null) {
            x0Var.b(this, file);
        }
    }

    @Override // c4.k0
    public final void q0(File file) {
        file.getClass();
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            x0Var.b(this, file);
        }
    }

    @Override // c4.k0
    public final void r0(File file) {
        x4.e eVar;
        String str;
        x0 x0Var = this.f3356c0;
        if (x0Var != null) {
            g gVarL = g.D.l(this);
            gVarL.b();
            int i = 0;
            for (Object obj : x0Var.a()) {
                int i6 = i + 1;
                if ((obj instanceof x4.e) && (str = (eVar = (x4.e) obj).f11123l) != null && str.length() != 0) {
                    String str2 = eVar.f11123l;
                    str2.getClass();
                    q2 q2VarY = gVarL.Y(str2);
                    r rVarA = q2VarY != null ? q2VarY.a(this) : null;
                    if (rVarA != null && rVarA.F.size() > 0) {
                        Iterator it = rVarA.F.iterator();
                        it.getClass();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                if (u.m0(((j0) next).f11240q, file.getAbsolutePath(), true)) {
                                    x0Var.g = i;
                                    break;
                                }
                            }
                        }
                    }
                } else if (obj instanceof v0) {
                    q2 q2Var = ((v0) obj).f4709b;
                    r rVar = q2Var.f11352s;
                    if ((rVar != null ? rVar.F : null) != null) {
                        rVar.getClass();
                        if (rVar.F.size() > 0) {
                            r rVar2 = q2Var.f11352s;
                            rVar2.getClass();
                            Iterator it2 = rVar2.F.iterator();
                            it2.getClass();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    if (u.m0(((j0) next2).f11240q, file.getAbsolutePath(), true)) {
                                        x0Var.g = i;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                i = i6;
            }
            gVarL.c();
            int i10 = x0Var.g;
            if (i10 >= 0) {
                x0Var.notifyItemChanged(i10);
            }
        }
    }

    @Override // c4.k0
    public final boolean s0() {
        return false;
    }
}
