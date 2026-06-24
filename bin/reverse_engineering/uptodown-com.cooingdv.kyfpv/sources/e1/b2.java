package e1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f3806b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3809n;

    public b2(b3 b3Var, AtomicReference atomicReference, String str, String str2) {
        this.f3805a = 3;
        this.f3807l = atomicReference;
        this.f3806b = str;
        this.f3808m = str2;
        Objects.requireNonNull(b3Var);
        this.f3809n = b3Var;
    }

    private final void a() {
        i0 i0Var;
        w3 w3Var = (w3) this.f3807l;
        AtomicReference atomicReference = (AtomicReference) this.f3806b;
        c5 c5Var = (c5) this.f3809n;
        n4 n4Var = (n4) this.f3808m;
        synchronized (atomicReference) {
            try {
                i0Var = w3Var.f4360m;
            } catch (RemoteException e10) {
                w0 w0Var = w3Var.f3876a.f4265o;
                t1.m(w0Var);
                w0Var.f4340o.c(e10, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (i0Var != null) {
                i0Var.g(c5Var, n4Var, new p3(w3Var, atomicReference));
                w3Var.t();
            } else {
                w0 w0Var2 = w3Var.f3876a.f4265o;
                t1.m(w0Var2);
                w0Var2.f4340o.b("[sgtm] Failed to get upload batches; not connected to service");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x035d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b2.run():void");
    }

    public /* synthetic */ b2(c2 c2Var, Bundle bundle, String str, c5 c5Var) {
        this.f3805a = 2;
        this.f3807l = c2Var;
        this.f3808m = bundle;
        this.f3806b = str;
        this.f3809n = c5Var;
    }

    public /* synthetic */ b2(w3 w3Var, AtomicReference atomicReference, c5 c5Var, n4 n4Var) {
        this.f3805a = 7;
        this.f3807l = w3Var;
        this.f3806b = atomicReference;
        this.f3809n = c5Var;
        this.f3808m = n4Var;
    }

    public /* synthetic */ b2(Object obj, Serializable serializable, l0.a aVar, Object obj2, int i) {
        this.f3805a = i;
        this.f3807l = obj;
        this.f3806b = serializable;
        this.f3808m = aVar;
        this.f3809n = obj2;
    }

    public b2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.m0 m0Var, u uVar, String str) {
        this.f3805a = 1;
        this.f3807l = m0Var;
        this.f3808m = uVar;
        this.f3806b = str;
        this.f3809n = appMeasurementDynamiteService;
    }

    public /* synthetic */ b2(int i, Object obj, Object obj2, Object obj3, String str) {
        this.f3805a = i;
        this.f3807l = obj2;
        this.f3806b = str;
        this.f3808m = obj3;
        this.f3809n = obj;
    }

    public b2(f0.i iVar, String str, String str2, Bundle bundle) {
        this.f3805a = 8;
        this.f3806b = str;
        this.f3807l = str2;
        this.f3808m = bundle;
        this.f3809n = iVar;
    }
}
