package j0;

import a4.c0;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import c4.f5;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements i0.e, i0.f {
    public final i0.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f6508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.support.v4.media.g f6509l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f6513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6514q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f6517t;
    public final LinkedList i = new LinkedList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f6510m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f6511n = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f6515r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h0.b f6516s = null;

    /* JADX WARN: Multi-variable type inference failed */
    public m(e eVar, i0.d dVar) {
        this.f6517t = eVar;
        Looper looper = eVar.v.getLooper();
        b5.m mVarA = dVar.a();
        g4.v vVar = new g4.v((String) mVarA.f1062l, (ArraySet) mVarA.f1061b, (String) mVarA.f1063m);
        d0.b bVar = (d0.b) dVar.f5617c.f247b;
        y.g(bVar);
        i0.b bVarR = bVar.r(dVar.f5615a, looper, vVar, dVar.f5618d, this, this);
        String str = dVar.f5616b;
        if (str != null && (bVarR instanceof k0.e)) {
            ((k0.e) bVarR).B = str;
        }
        if (str != null && (bVarR instanceof h)) {
            androidx.lifecycle.l.C(bVarR);
            throw null;
        }
        this.j = bVarR;
        this.f6508k = dVar.f5619e;
        this.f6509l = new android.support.v4.media.g(18);
        this.f6512o = dVar.g;
        if (!bVarR.l()) {
            this.f6513p = null;
            return;
        }
        Context context = eVar.f6495n;
        c0 c0Var = eVar.v;
        b5.m mVarA2 = dVar.a();
        this.f6513p = new t(context, c0Var, new g4.v((String) mVarA2.f1062l, (ArraySet) mVarA2.f1061b, (String) mVarA2.f1063m));
    }

    @Override // i0.f
    public final void a(h0.b bVar) {
        o(bVar, null);
    }

    public final void b(h0.b bVar) {
        HashSet hashSet = this.f6510m;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            com.google.gson.internal.a.o();
        } else {
            if (y.j(bVar, h0.b.f5394o)) {
                this.j.e();
            }
            throw null;
        }
    }

    @Override // i0.e
    public final void c(int i) {
        Looper looperMyLooper = Looper.myLooper();
        c0 c0Var = this.f6517t.v;
        if (looperMyLooper == c0Var.getLooper()) {
            i(i);
        } else {
            c0Var.post(new f5(this, i, 3));
        }
    }

    @Override // i0.e
    public final void d() {
        Looper looperMyLooper = Looper.myLooper();
        c0 c0Var = this.f6517t.v;
        if (looperMyLooper == c0Var.getLooper()) {
            h();
        } else {
            c0Var.post(new a4.f(this, 15));
        }
    }

    public final void e(Status status) {
        y.c(this.f6517t.v);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z9) {
        y.c(this.f6517t.v);
        if ((status == null) == (exc == null)) {
            com.google.gson.internal.a.p("Status XOR exception should be null");
            return;
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (!z9 || xVar.f6539a == 2) {
                if (status != null) {
                    xVar.a(status);
                } else {
                    xVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.i;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x xVar = (x) arrayList.get(i);
            if (!this.j.g()) {
                return;
            }
            if (k(xVar)) {
                linkedList.remove(xVar);
            }
        }
    }

    public final void h() {
        e eVar = this.f6517t;
        y.c(eVar.v);
        this.f6516s = null;
        b(h0.b.f5394o);
        c0 c0Var = eVar.v;
        if (this.f6514q) {
            a aVar = this.f6508k;
            c0Var.removeMessages(11, aVar);
            c0Var.removeMessages(9, aVar);
            this.f6514q = false;
        }
        Iterator it = this.f6511n.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            com.google.gson.internal.a.o();
        } else {
            g();
            j();
        }
    }

    public final void i(int i) {
        e eVar = this.f6517t;
        c0 c0Var = eVar.v;
        y.c(eVar.v);
        this.f6516s = null;
        this.f6514q = true;
        String strK = this.j.k();
        android.support.v4.media.g gVar = this.f6509l;
        gVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        gVar.I(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f6508k;
        c0Var.sendMessageDelayed(Message.obtain(c0Var, 9, aVar), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        c0Var.sendMessageDelayed(Message.obtain(c0Var, 11, aVar), 120000L);
        ((SparseIntArray) eVar.f6497p.f247b).clear();
        Iterator it = this.f6511n.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            com.google.gson.internal.a.o();
        }
    }

    public final void j() {
        e eVar = this.f6517t;
        c0 c0Var = eVar.v;
        a aVar = this.f6508k;
        c0Var.removeMessages(12, aVar);
        c0Var.sendMessageDelayed(c0Var.obtainMessage(12, aVar), eVar.f6491a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(x xVar) {
        h0.d dVar;
        if (!(xVar instanceof q)) {
            android.support.v4.media.g gVar = this.f6509l;
            i0.b bVar = this.j;
            xVar.d(gVar, bVar.l());
            try {
                xVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                c(1);
                bVar.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        q qVar = (q) xVar;
        h0.d[] dVarArrG = qVar.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
        } else {
            h0.d[] dVarArrJ = this.j.j();
            if (dVarArrJ == null) {
                dVarArrJ = new h0.d[0];
            }
            ArrayMap arrayMap = new ArrayMap(dVarArrJ.length);
            for (h0.d dVar2 : dVarArrJ) {
                arrayMap.put(dVar2.f5403a, Long.valueOf(dVar2.c()));
            }
            int length = dVarArrG.length;
            for (int i = 0; i < length; i++) {
                dVar = dVarArrG[i];
                Long l10 = (Long) arrayMap.get(dVar.f5403a);
                if (l10 == null || l10.longValue() < dVar.c()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            android.support.v4.media.g gVar2 = this.f6509l;
            i0.b bVar2 = this.j;
            xVar.d(gVar2, bVar2.l());
            try {
                xVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                c(1);
                bVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.j.getClass().getName() + " could not execute call because it requires feature (" + dVar.f5403a + ", " + dVar.c() + ").");
        if (!this.f6517t.f6503w || !qVar.f(this)) {
            qVar.b(new i0.j(dVar));
            return true;
        }
        n nVar = new n(this.f6508k, dVar);
        int iIndexOf = this.f6515r.indexOf(nVar);
        ArrayList arrayList = this.f6515r;
        if (iIndexOf >= 0) {
            n nVar2 = (n) arrayList.get(iIndexOf);
            this.f6517t.v.removeMessages(15, nVar2);
            c0 c0Var = this.f6517t.v;
            c0Var.sendMessageDelayed(Message.obtain(c0Var, 15, nVar2), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            return false;
        }
        arrayList.add(nVar);
        c0 c0Var2 = this.f6517t.v;
        c0Var2.sendMessageDelayed(Message.obtain(c0Var2, 15, nVar), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        c0 c0Var3 = this.f6517t.v;
        c0Var3.sendMessageDelayed(Message.obtain(c0Var3, 16, nVar), 120000L);
        h0.b bVar3 = new h0.b(null, null, 2);
        if (!l(bVar3)) {
            this.f6517t.a(bVar3, this.f6512o);
        }
        return false;
    }

    public final boolean l(h0.b bVar) {
        synchronized (e.f6490z) {
        }
        return false;
    }

    public final void m() {
        e eVar = this.f6517t;
        y.c(eVar.v);
        i0.b bVar = this.j;
        if (bVar.g() || bVar.d()) {
            return;
        }
        try {
            android.support.v4.media.g gVar = eVar.f6497p;
            Context context = eVar.f6495n;
            SparseIntArray sparseIntArray = (SparseIntArray) gVar.f247b;
            y.g(context);
            int i = bVar.i();
            int iB = ((SparseIntArray) gVar.f247b).get(i, -1);
            if (iB == -1) {
                iB = 0;
                int i6 = 0;
                while (true) {
                    if (i6 >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i6);
                    if (iKeyAt > i && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (iB == -1) {
                    iB = ((h0.e) gVar.f248l).b(context, i);
                }
                sparseIntArray.put(i, iB);
            }
            if (iB != 0) {
                h0.b bVar2 = new h0.b(null, null, iB);
                Log.w("GoogleApiManager", "The service for " + bVar.getClass().getName() + " is not available: " + bVar2.toString());
                o(bVar2, null);
                return;
            }
            g8.g gVar2 = new g8.g();
            gVar2.f5387o = eVar;
            gVar2.f5385m = null;
            gVar2.f5386n = null;
            gVar2.f5382a = false;
            gVar2.f5383b = bVar;
            gVar2.f5384l = this.f6508k;
            if (bVar.l()) {
                t tVar = this.f6513p;
                y.g(tVar);
                Handler handler = tVar.f6528k;
                g4.v vVar = tVar.f6531n;
                h1.a aVar = tVar.f6532o;
                if (aVar != null) {
                    aVar.o();
                }
                vVar.f5281p = Integer.valueOf(System.identityHashCode(tVar));
                tVar.f6532o = (h1.a) tVar.f6529l.r(tVar.j, handler.getLooper(), vVar, (g1.a) vVar.f5280o, tVar, tVar);
                tVar.f6533p = gVar2;
                Set set = tVar.f6530m;
                if (set == null || set.isEmpty()) {
                    handler.post(new a4.f(tVar, 17));
                } else {
                    h1.a aVar2 = tVar.f6532o;
                    aVar2.getClass();
                    aVar2.c(new k0.l((k0.e) aVar2));
                }
            }
            try {
                bVar.c(gVar2);
            } catch (SecurityException e10) {
                o(new h0.b(null, null, 10), e10);
            }
        } catch (IllegalStateException e11) {
            o(new h0.b(null, null, 10), e11);
        }
    }

    public final void n(x xVar) {
        y.c(this.f6517t.v);
        boolean zG = this.j.g();
        LinkedList linkedList = this.i;
        if (zG) {
            if (k(xVar)) {
                j();
                return;
            } else {
                linkedList.add(xVar);
                return;
            }
        }
        linkedList.add(xVar);
        h0.b bVar = this.f6516s;
        if (bVar == null || bVar.f5396b == 0 || bVar.f5397l == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(h0.b bVar, RuntimeException runtimeException) {
        h1.a aVar;
        y.c(this.f6517t.v);
        t tVar = this.f6513p;
        if (tVar != null && (aVar = tVar.f6532o) != null) {
            aVar.o();
        }
        y.c(this.f6517t.v);
        this.f6516s = null;
        ((SparseIntArray) this.f6517t.f6497p.f247b).clear();
        b(bVar);
        if ((this.j instanceof m0.c) && bVar.f5396b != 24) {
            e eVar = this.f6517t;
            eVar.f6492b = true;
            c0 c0Var = eVar.v;
            c0Var.sendMessageDelayed(c0Var.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (bVar.f5396b == 4) {
            e(e.f6489y);
            return;
        }
        if (this.i.isEmpty()) {
            this.f6516s = bVar;
            return;
        }
        e eVar2 = this.f6517t;
        if (runtimeException != null) {
            y.c(eVar2.v);
            f(null, runtimeException, false);
            return;
        }
        boolean z9 = eVar2.f6503w;
        a aVar2 = this.f6508k;
        if (!z9) {
            e(e.b(aVar2, bVar));
            return;
        }
        f(e.b(aVar2, bVar), null, true);
        if (this.i.isEmpty() || l(bVar) || this.f6517t.a(bVar, this.f6512o)) {
            return;
        }
        if (bVar.f5396b == 18) {
            this.f6514q = true;
        }
        if (!this.f6514q) {
            e(e.b(this.f6508k, bVar));
            return;
        }
        e eVar3 = this.f6517t;
        a aVar3 = this.f6508k;
        c0 c0Var2 = eVar3.v;
        c0Var2.sendMessageDelayed(Message.obtain(c0Var2, 9, aVar3), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    public final void p(h0.b bVar) {
        y.c(this.f6517t.v);
        i0.b bVar2 = this.j;
        bVar2.b("onSignInFailed for " + bVar2.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        y.c(this.f6517t.v);
        Status status = e.f6488x;
        e(status);
        this.f6509l.I(false, status);
        for (g gVar : (g[]) this.f6511n.keySet().toArray(new g[0])) {
            n(new w(new j1.i()));
        }
        b(new h0.b(null, null, 4));
        i0.b bVar = this.j;
        if (bVar.g()) {
            bVar.f(new g5.f(this, 2));
        }
    }
}
