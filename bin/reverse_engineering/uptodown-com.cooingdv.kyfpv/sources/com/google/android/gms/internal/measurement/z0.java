package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends g1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2926q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, Activity activity, h0 h0Var) {
        super(j1Var.f2667a, true);
        this.f2923n = 3;
        this.f2925p = activity;
        this.f2926q = h0Var;
        this.f2924o = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f2923n) {
            case 0:
                try {
                    Context context = (Context) this.f2925p;
                    k0.y.g(context);
                    String strA = e1.k2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = e1.k2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    k0 k0VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    k1 k1Var = (k1) this.f2924o;
                    boolean z9 = boolValueOf == null || !boolValueOf.booleanValue();
                    k1Var.getClass();
                    try {
                        k0VarAsInterface = j0.asInterface(t0.e.c(context, z9 ? t0.e.f9491c : t0.e.f9490b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (t0.b e10) {
                        k1Var.b(e10, true, false);
                    }
                    k1Var.f = k0VarAsInterface;
                    if (k1Var.f != null) {
                        int iA = t0.e.a(context, ModuleDescriptor.MODULE_ID);
                        u0 u0Var = new u0(133005L, Math.max(iA, r6), Boolean.TRUE.equals(boolValueOf) || t0.e.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.f2926q, e1.k2.a(context));
                        k0 k0Var = k1Var.f;
                        k0.y.g(k0Var);
                        k0Var.initialize(new s0.b(context), u0Var, this.f2592a);
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e11) {
                    ((k1) this.f2924o).b(e11, true, false);
                    return;
                }
                break;
            case 1:
                k0 k0Var2 = ((k1) this.f2924o).f;
                k0.y.g(k0Var2);
                k0Var2.getMaxUserProperties((String) this.f2925p, (h0) this.f2926q);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f2926q;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                k0 k0Var3 = ((j1) this.f2924o).f2667a.f;
                k0.y.g(k0Var3);
                k0Var3.onActivityCreatedByScionActivityInfo(w0.c((Activity) this.f2925p), bundle, this.f2593b);
                break;
            default:
                k0 k0Var4 = ((j1) this.f2924o).f2667a.f;
                k0.y.g(k0Var4);
                k0Var4.onActivitySaveInstanceStateByScionActivityInfo(w0.c((Activity) this.f2925p), (h0) this.f2926q, this.f2593b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.f2923n) {
            case 1:
                ((h0) this.f2926q).t(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(k1 k1Var, Object obj, Object obj2, int i) {
        super(k1Var, true);
        this.f2923n = i;
        this.f2925p = obj;
        this.f2926q = obj2;
        this.f2924o = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, Bundle bundle, Activity activity) {
        super(j1Var.f2667a, true);
        this.f2923n = 2;
        this.f2926q = bundle;
        this.f2925p = activity;
        this.f2924o = j1Var;
    }
}
