package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.g;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.customaudience.a;
import androidx.work.WorkRequest;
import b5.m;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u0;
import e1.a5;
import e1.b2;
import e1.b3;
import e1.b5;
import e1.f3;
import e1.h3;
import e1.j3;
import e1.l2;
import e1.m3;
import e1.m4;
import e1.n0;
import e1.o4;
import e1.q1;
import e1.q2;
import e1.r1;
import e1.r2;
import e1.s2;
import e1.t;
import e1.t1;
import e1.u;
import e1.u2;
import e1.v2;
import e1.w0;
import e1.x2;
import e1.y;
import e1.z0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import q2.e;
import s0.b;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends j0 {
    public t1 i;
    public final ArrayMap j;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.i = null;
        this.j = new ArrayMap();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        c();
        y yVar = this.i.f4272w;
        t1.j(yVar);
        yVar.h(j, str);
    }

    public final void c() {
        if (this.i != null) {
            return;
        }
        a.i("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.u(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.h();
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new m1.a(b3Var, null, 8, false));
    }

    public final void d(String str, m0 m0Var) {
        c();
        a5 a5Var = this.i.f4268r;
        t1.k(a5Var);
        a5Var.P(str, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        c();
        y yVar = this.i.f4272w;
        t1.j(yVar);
        yVar.i(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void generateEventId(m0 m0Var) throws RemoteException {
        c();
        a5 a5Var = this.i.f4268r;
        t1.k(a5Var);
        long jD0 = a5Var.d0();
        c();
        a5 a5Var2 = this.i.f4268r;
        t1.k(a5Var2);
        a5Var2.Q(m0Var, jD0);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getAppInstanceId(m0 m0Var) throws RemoteException {
        c();
        q1 q1Var = this.i.f4266p;
        t1.m(q1Var);
        q1Var.p(new r1(this, m0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCachedAppInstanceId(m0 m0Var) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        d((String) b3Var.f3814p.get(), m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getConditionalUserProperties(String str, String str2, m0 m0Var) throws RemoteException {
        c();
        q1 q1Var = this.i.f4266p;
        t1.m(q1Var);
        q1Var.p(new b2(4, this, m0Var, str2, str));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCurrentScreenClass(m0 m0Var) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        m3 m3Var = b3Var.f3876a.f4271u;
        t1.l(m3Var);
        j3 j3Var = m3Var.f4121l;
        d(j3Var != null ? j3Var.f4059b : null, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCurrentScreenName(m0 m0Var) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        m3 m3Var = b3Var.f3876a.f4271u;
        t1.l(m3Var);
        j3 j3Var = m3Var.f4121l;
        d(j3Var != null ? j3Var.f4058a : null, m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getGmpAppId(m0 m0Var) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        d(b3Var.v(), m0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getMaxUserProperties(String str, m0 m0Var) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        k0.y.d(str);
        b3Var.f3876a.getClass();
        c();
        a5 a5Var = this.i.f4268r;
        t1.k(a5Var);
        a5Var.R(m0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getSessionId(m0 m0Var) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new m1.a(b3Var, m0Var));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getTestFlag(m0 m0Var, int i) throws RemoteException {
        c();
        if (i == 0) {
            a5 a5Var = this.i.f4268r;
            t1.k(a5Var);
            b3 b3Var = this.i.v;
            t1.l(b3Var);
            AtomicReference atomicReference = new AtomicReference();
            q1 q1Var = b3Var.f3876a.f4266p;
            t1.m(q1Var);
            a5Var.P((String) q1Var.q(atomicReference, 15000L, "String test flag value", new u2(b3Var, atomicReference, 1)), m0Var);
            return;
        }
        if (i == 1) {
            a5 a5Var2 = this.i.f4268r;
            t1.k(a5Var2);
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            q1 q1Var2 = b3Var2.f3876a.f4266p;
            t1.m(q1Var2);
            a5Var2.Q(m0Var, ((Long) q1Var2.q(atomicReference2, 15000L, "long test flag value", new u2(b3Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            a5 a5Var3 = this.i.f4268r;
            t1.k(a5Var3);
            b3 b3Var3 = this.i.v;
            t1.l(b3Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            q1 q1Var3 = b3Var3.f3876a.f4266p;
            t1.m(q1Var3);
            double dDoubleValue = ((Double) q1Var3.q(atomicReference3, 15000L, "double test flag value", new u2(b3Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                m0Var.t(bundle);
                return;
            } catch (RemoteException e10) {
                w0 w0Var = a5Var3.f3876a.f4265o;
                t1.m(w0Var);
                w0Var.f4343r.c(e10, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            a5 a5Var4 = this.i.f4268r;
            t1.k(a5Var4);
            b3 b3Var4 = this.i.v;
            t1.l(b3Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            q1 q1Var4 = b3Var4.f3876a.f4266p;
            t1.m(q1Var4);
            a5Var4.R(m0Var, ((Integer) q1Var4.q(atomicReference4, 15000L, "int test flag value", new u2(b3Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        a5 a5Var5 = this.i.f4268r;
        t1.k(a5Var5);
        b3 b3Var5 = this.i.v;
        t1.l(b3Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        q1 q1Var5 = b3Var5.f3876a.f4266p;
        t1.m(q1Var5);
        a5Var5.T(m0Var, ((Boolean) q1Var5.q(atomicReference5, 15000L, "boolean test flag value", new u2(b3Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getUserProperties(String str, String str2, boolean z9, m0 m0Var) throws RemoteException {
        c();
        q1 q1Var = this.i.f4266p;
        t1.m(q1Var);
        q1Var.p(new r2(this, m0Var, str, str2, z9));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void initForTests(@NonNull Map map) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void initialize(s0.a aVar, u0 u0Var, long j) throws RemoteException {
        t1 t1Var = this.i;
        if (t1Var == null) {
            Context context = (Context) b.J(aVar);
            k0.y.g(context);
            this.i = t1.s(context, u0Var, Long.valueOf(j));
        } else {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4343r.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void isDataCollectionEnabled(m0 m0Var) throws RemoteException {
        c();
        q1 q1Var = this.i.f4266p;
        t1.m(q1Var);
        q1Var.p(new r1(this, m0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z9, boolean z10, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.l(str, str2, bundle, z9, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logEventAndBundle(String str, String str2, Bundle bundle, m0 m0Var, long j) throws RemoteException {
        c();
        k0.y.d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        u uVar = new u(str2, new t(bundle), "app", j);
        q1 q1Var = this.i.f4266p;
        t1.m(q1Var);
        q1Var.p(new b2(this, m0Var, uVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logHealthData(int i, @NonNull String str, @NonNull s0.a aVar, @NonNull s0.a aVar2, @NonNull s0.a aVar3) throws RemoteException {
        c();
        Object objJ = aVar == null ? null : b.J(aVar);
        Object objJ2 = aVar2 == null ? null : b.J(aVar2);
        Object objJ3 = aVar3 != null ? b.J(aVar3) : null;
        w0 w0Var = this.i.f4265o;
        t1.m(w0Var);
        w0Var.p(i, true, false, str, objJ, objJ2, objJ3);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityCreated(@NonNull s0.a aVar, @NonNull Bundle bundle, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle, long j) {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        x2 x2Var = b3Var.f3810l;
        if (x2Var != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
            x2Var.j(w0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityDestroyed(@NonNull s0.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        x2 x2Var = b3Var.f3810l;
        if (x2Var != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
            x2Var.k(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityPaused(@NonNull s0.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        x2 x2Var = b3Var.f3810l;
        if (x2Var != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
            x2Var.l(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityResumed(@NonNull s0.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        x2 x2Var = b3Var.f3810l;
        if (x2Var != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
            x2Var.m(w0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivitySaveInstanceState(s0.a aVar, m0 m0Var, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), m0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, m0 m0Var, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        x2 x2Var = b3Var.f3810l;
        Bundle bundle = new Bundle();
        if (x2Var != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
            x2Var.n(w0Var, bundle);
        }
        try {
            m0Var.t(bundle);
        } catch (RemoteException e10) {
            w0 w0Var2 = this.i.f4265o;
            t1.m(w0Var2);
            w0Var2.f4343r.c(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStarted(@NonNull s0.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        if (b3Var.f3810l != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStopped(@NonNull s0.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.w0 w0Var, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        if (b3Var.f3810l != null) {
            b3 b3Var2 = this.i.v;
            t1.l(b3Var2);
            b3Var2.z();
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void performAction(Bundle bundle, m0 m0Var, long j) throws RemoteException {
        c();
        m0Var.t(null);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void registerOnMeasurementEventListener(r0 r0Var) throws RemoteException {
        Object b5Var;
        c();
        ArrayMap arrayMap = this.j;
        synchronized (arrayMap) {
            try {
                b5Var = (l2) arrayMap.get(Integer.valueOf(r0Var.b()));
                if (b5Var == null) {
                    b5Var = new b5(this, r0Var);
                    arrayMap.put(Integer.valueOf(r0Var.b()), b5Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.h();
        if (b3Var.f3812n.add(b5Var)) {
            return;
        }
        w0 w0Var = b3Var.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4343r.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void resetAnalyticsData(long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.f3814p.set(null);
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new s2(b3Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void retrieveAndUploadBatches(o0 o0Var) {
        h3 h3Var;
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.h();
        t1 t1Var = b3Var.f3876a;
        q1 q1Var = t1Var.f4266p;
        t1.m(q1Var);
        if (q1Var.m()) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.b("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        q1 q1Var2 = t1Var.f4266p;
        t1.m(q1Var2);
        if (Thread.currentThread() == q1Var2.f4205m) {
            w0 w0Var2 = t1Var.f4265o;
            t1.m(w0Var2);
            w0Var2.f4340o.b("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zG = e.g();
        w0 w0Var3 = t1Var.f4265o;
        if (zG) {
            t1.m(w0Var3);
            w0Var3.f4340o.b("Cannot retrieve and upload batches from main thread");
            return;
        }
        t1.m(w0Var3);
        w0Var3.f4347w.b("[sgtm] Started client-side batch upload work.");
        boolean z9 = false;
        int size = 0;
        int i = 0;
        while (!z9) {
            w0 w0Var4 = t1Var.f4265o;
            t1.m(w0Var4);
            w0Var4.f4347w.b("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            q1 q1Var3 = t1Var.f4266p;
            t1.m(q1Var3);
            q1Var3.q(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "[sgtm] Getting upload batches", new u2(b3Var, atomicReference, 6, false));
            o4 o4Var = (o4) atomicReference.get();
            if (o4Var == null) {
                break;
            }
            List list = o4Var.f4181a;
            if (list.isEmpty()) {
                break;
            }
            w0 w0Var5 = t1Var.f4265o;
            t1.m(w0Var5);
            w0Var5.f4347w.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z9 = false;
                    break;
                }
                m4 m4Var = (m4) it.next();
                try {
                    URL url = new URI(m4Var.f4133l).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    n0 n0VarR = b3Var.f3876a.r();
                    n0VarR.h();
                    k0.y.g(n0VarR.f4146p);
                    String str = n0VarR.f4146p;
                    t1 t1Var2 = b3Var.f3876a;
                    w0 w0Var6 = t1Var2.f4265o;
                    t1.m(w0Var6);
                    e1.u0 u0Var = w0Var6.f4347w;
                    Long lValueOf = Long.valueOf(m4Var.f4131a);
                    u0Var.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, m4Var.f4133l, Integer.valueOf(m4Var.f4132b.length));
                    if (!TextUtils.isEmpty(m4Var.f4137p)) {
                        w0 w0Var7 = t1Var2.f4265o;
                        t1.m(w0Var7);
                        w0Var7.f4347w.d(lValueOf, "[sgtm] Uploading data from app. row_id", m4Var.f4137p);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = m4Var.f4134m;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    f3 f3Var = t1Var2.f4273x;
                    t1.m(f3Var);
                    byte[] bArr = m4Var.f4132b;
                    m mVar = new m(b3Var, atomicReference2, m4Var, 9);
                    f3Var.i();
                    k0.y.g(url);
                    k0.y.g(bArr);
                    q1 q1Var4 = f3Var.f3876a.f4266p;
                    t1.m(q1Var4);
                    q1Var4.s(new z0(f3Var, str, url, bArr, map, mVar));
                    try {
                        a5 a5Var = t1Var2.f4268r;
                        t1.k(a5Var);
                        t1 t1Var3 = a5Var.f3876a;
                        t1Var3.f4270t.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    t1Var3.f4270t.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        w0 w0Var8 = b3Var.f3876a.f4265o;
                        t1.m(w0Var8);
                        w0Var8.f4343r.b("[sgtm] Interrupted waiting for uploading batch");
                    }
                    h3Var = atomicReference2.get() == null ? h3.UNKNOWN : (h3) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e10) {
                    w0 w0Var9 = b3Var.f3876a.f4265o;
                    t1.m(w0Var9);
                    w0Var9.f4340o.e("[sgtm] Bad upload url for row_id", m4Var.f4133l, Long.valueOf(m4Var.f4131a), e10);
                    h3Var = h3.FAILURE;
                }
                if (h3Var != h3.SUCCESS) {
                    if (h3Var == h3.BACKOFF) {
                        z9 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        w0 w0Var10 = t1Var.f4265o;
        t1.m(w0Var10);
        w0Var10.f4347w.d(Integer.valueOf(size), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i));
        try {
            o0Var.e();
        } catch (RemoteException e11) {
            t1 t1Var4 = this.i;
            k0.y.g(t1Var4);
            w0 w0Var11 = t1Var4.f4265o;
            t1.m(w0Var11);
            w0Var11.f4343r.c(e11, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        c();
        t1 t1Var = this.i;
        if (bundle == null) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.b("Conditional user property must not be null");
        } else {
            b3 b3Var = t1Var.v;
            t1.l(b3Var);
            b3Var.t(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.A(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setCurrentScreen(@NonNull s0.a aVar, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        k0.y.g(activity);
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0.c(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r3 <= 500) goto L31;
     */
    @Override // com.google.android.gms.internal.measurement.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0 r6, java.lang.String r7, java.lang.String r8, long r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.w0, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setDataCollectionEnabled(boolean z9) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.h();
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new q2(b3Var, z9));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new v2(b3Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setEventInterceptor(r0 r0Var) throws RemoteException {
        c();
        g gVar = new g(this, r0Var, 9, false);
        q1 q1Var = this.i.f4266p;
        t1.m(q1Var);
        boolean zM = q1Var.m();
        t1 t1Var = this.i;
        if (!zM) {
            q1 q1Var2 = t1Var.f4266p;
            t1.m(q1Var2);
            q1Var2.p(new m1.a(this, gVar, 10, false));
            return;
        }
        b3 b3Var = t1Var.v;
        t1.l(b3Var);
        b3Var.g();
        b3Var.h();
        g gVar2 = b3Var.f3811m;
        if (gVar != gVar2) {
            k0.y.i(gVar2 == null, "EventInterceptor already set.");
        }
        b3Var.f3811m = gVar;
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setInstanceIdProvider(t0 t0Var) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setMeasurementEnabled(boolean z9, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        Boolean boolValueOf = Boolean.valueOf(z9);
        b3Var.h();
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new m1.a(b3Var, boolValueOf, 8, false));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        q1 q1Var = b3Var.f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new s2(b3Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        t1 t1Var = b3Var.f3876a;
        Uri data = intent.getData();
        if (data == null) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4346u.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            w0 w0Var2 = t1Var.f4265o;
            t1.m(w0Var2);
            w0Var2.f4346u.b("[sgtm] Preview Mode was not enabled.");
            t1Var.f4263m.f3979l = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        w0 w0Var3 = t1Var.f4265o;
        t1.m(w0Var3);
        w0Var3.f4346u.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        t1Var.f4263m.f3979l = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        c();
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        t1 t1Var = b3Var.f3876a;
        if (str != null && TextUtils.isEmpty(str)) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4343r.b("User ID must be non-empty or null");
        } else {
            q1 q1Var = t1Var.f4266p;
            t1.m(q1Var);
            q1Var.p(new m1.a(11, b3Var, str));
            b3Var.q(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull s0.a aVar, boolean z9, long j) throws RemoteException {
        c();
        Object objJ = b.J(aVar);
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.q(str, str2, objJ, z9, j);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void unregisterOnMeasurementEventListener(r0 r0Var) throws RemoteException {
        Object b5Var;
        c();
        ArrayMap arrayMap = this.j;
        synchronized (arrayMap) {
            b5Var = (l2) arrayMap.remove(Integer.valueOf(r0Var.b()));
        }
        if (b5Var == null) {
            b5Var = new b5(this, r0Var);
        }
        b3 b3Var = this.i.v;
        t1.l(b3Var);
        b3Var.h();
        if (b3Var.f3812n.remove(b5Var)) {
            return;
        }
        w0 w0Var = b3Var.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4343r.b("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
    }
}
