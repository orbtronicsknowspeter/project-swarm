package e1;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements f2 {
    public static volatile t1 N;
    public w3 A;
    public p B;
    public n0 C;
    public g3 D;
    public Boolean F;
    public long G;
    public volatile Boolean H;
    public volatile boolean I;
    public int J;
    public int K;
    public final long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4260b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q2.e f4261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f4262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f4263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0 f4264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1 f4265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f4 f4266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a5 f4267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0 f4268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0.a f4269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m3 f4270u;
    public final b3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f4271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f3 f4272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f4273y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p0 f4274z;
    public boolean E = false;
    public final AtomicInteger L = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t1(e1.m2 r11) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.t1.<init>(e1.m2):void");
    }

    public static final void j(b0 b0Var) {
        if (b0Var != null) {
            return;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not created");
    }

    public static final void k(d2 d2Var) {
        if (d2Var != null) {
            return;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not created");
    }

    public static final void l(h0 h0Var) {
        if (h0Var == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not created");
        } else {
            if (h0Var.f4014b) {
                return;
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not initialized: ".concat(String.valueOf(h0Var.getClass())));
        }
    }

    public static final void m(e2 e2Var) {
        if (e2Var == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not created");
        } else {
            if (e2Var.f3903b) {
                return;
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not initialized: ".concat(String.valueOf(e2Var.getClass())));
        }
    }

    public static t1 s(Context context, com.google.android.gms.internal.measurement.u0 u0Var, Long l10) {
        Bundle bundle;
        if (u0Var != null) {
            Bundle bundle2 = u0Var.f2817m;
            u0Var = new com.google.android.gms.internal.measurement.u0(u0Var.f2814a, u0Var.f2815b, u0Var.f2816l, bundle2, null);
        }
        k0.y.g(context);
        k0.y.g(context.getApplicationContext());
        if (N == null) {
            synchronized (t1.class) {
                try {
                    if (N == null) {
                        N = new t1(new m2(context, u0Var, l10));
                    }
                } finally {
                }
            }
        } else if (u0Var != null && (bundle = u0Var.f2817m) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            k0.y.g(N);
            N.H = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        k0.y.g(N);
        return N;
    }

    @Override // e1.f2
    public final w0 a() {
        w0 w0Var = this.f4264o;
        m(w0Var);
        return w0Var;
    }

    @Override // e1.f2
    public final q1 b() {
        q1 q1Var = this.f4265p;
        m(q1Var);
        return q1Var;
    }

    @Override // e1.f2
    public final q2.e c() {
        return this.f4261l;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // e1.f2
    public final Context e() {
        return this.f4259a;
    }

    @Override // e1.f2
    public final p0.a f() {
        return this.f4269t;
    }

    public final int g() {
        q1 q1Var = this.f4265p;
        m(q1Var);
        q1Var.g();
        g gVar = this.f4262m;
        if (gVar.t()) {
            return 1;
        }
        m(q1Var);
        q1Var.g();
        if (!this.I) {
            return 8;
        }
        g1 g1Var = this.f4263n;
        k(g1Var);
        g1Var.g();
        Boolean boolValueOf = g1Var.k().contains("measurement_enabled") ? Boolean.valueOf(g1Var.k().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        q2.e eVar = gVar.f3875a.f4261l;
        Boolean boolS = gVar.s("firebase_analytics_collection_enabled");
        return boolS != null ? boolS.booleanValue() ? 0 : 4 : (this.H == null || this.H.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.E
            if (r0 == 0) goto L96
            e1.q1 r0 = r6.f4265p
            m(r0)
            r0.g()
            java.lang.Boolean r0 = r6.F
            p0.a r1 = r6.f4269t
            if (r0 == 0) goto L34
            long r2 = r6.G
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.G
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.G = r0
            e1.a5 r0 = r6.f4267r
            k(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.E(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f4259a
            r0.b r3 = r0.c.a(r1)
            boolean r3 = r3.c()
            r4 = 1
            if (r3 != 0) goto L74
            e1.g r3 = r6.f4262m
            boolean r3 = r3.j()
            if (r3 != 0) goto L74
            boolean r3 = e1.a5.X(r1)
            if (r3 == 0) goto L75
            boolean r1 = e1.a5.z(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.F = r1
            if (r2 == 0) goto L8f
            e1.n0 r1 = r6.r()
            java.lang.String r1 = r1.n()
            boolean r0 = r0.k(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.F = r0
        L8f:
            java.lang.Boolean r0 = r6.F
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.String r0 = "AppMeasurement is not initialized"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.t1.h():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r20, java.lang.Throwable r21, byte[] r22) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.t1.i(int, java.lang.Throwable, byte[]):void");
    }

    public final q0 n() {
        return this.f4268s;
    }

    public final p0 o() {
        l(this.f4274z);
        return this.f4274z;
    }

    public final w3 p() {
        l(this.A);
        return this.A;
    }

    public final p q() {
        m(this.B);
        return this.B;
    }

    public final n0 r() {
        l(this.C);
        return this.C;
    }
}
