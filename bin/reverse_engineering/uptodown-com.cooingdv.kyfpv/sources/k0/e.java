package k0;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final h0.d[] G = new h0.d[0];
    public final String A;
    public volatile String B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0.a f6841b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f6842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k0 f6843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0.f f6844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f6845o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f6848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f6849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IInterface f6850t;
    public d0 v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f6853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f6854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f6855z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f6840a = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f6846p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f6847q = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f6851u = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6852w = 1;
    public h0.b C = null;
    public boolean D = false;
    public volatile g0 E = null;
    public final AtomicInteger F = new AtomicInteger(0);

    public e(Context context, Looper looper, k0 k0Var, h0.f fVar, int i, b bVar, c cVar, String str) {
        y.h(context, "Context must not be null");
        this.f6842l = context;
        y.h(looper, "Looper must not be null");
        y.h(k0Var, "Supervisor must not be null");
        this.f6843m = k0Var;
        y.h(fVar, "API availability must not be null");
        this.f6844n = fVar;
        this.f6845o = new b0(this, looper);
        this.f6855z = i;
        this.f6853x = bVar;
        this.f6854y = cVar;
        this.A = str;
    }

    public final void b(String str) {
        this.f6840a = str;
        o();
    }

    public final void c(d dVar) {
        this.f6849s = dVar;
        z(null, 2);
    }

    public final boolean d() {
        boolean z9;
        synchronized (this.f6846p) {
            int i = this.f6852w;
            z9 = true;
            if (i != 2 && i != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public final void e() {
        if (!g() || this.f6841b == null) {
            a3.b.n("Failed to connect when checking package");
        }
    }

    public final void f(g5.f fVar) {
        ((j0.m) fVar.f5310b).f6517t.v.post(new a4.f(fVar, 16));
    }

    public final boolean g() {
        boolean z9;
        synchronized (this.f6846p) {
            z9 = this.f6852w == 4;
        }
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(i iVar, Set set) {
        Bundle bundleR = r();
        String str = this.B;
        int i = this.f6855z;
        int i6 = h0.f.f5409a;
        Scope[] scopeArr = g.f6862x;
        Bundle bundle = new Bundle();
        h0.d[] dVarArr = g.f6863y;
        g gVar = new g(6, i, i6, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f6867m = this.f6842l.getPackageName();
        gVar.f6870p = bundleR;
        if (set != null) {
            gVar.f6869o = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            gVar.f6871q = accountP;
            if (iVar != 0) {
                gVar.f6868n = ((com.google.android.gms.internal.measurement.x) iVar).j;
            }
        }
        gVar.f6872r = G;
        gVar.f6873s = q();
        if (this instanceof v0.a) {
            gVar.v = true;
        }
        try {
            synchronized (this.f6847q) {
                try {
                    u uVar = this.f6848r;
                    if (uVar != null) {
                        uVar.a(new c0(this, this.F.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i10 = this.F.get();
            b0 b0Var = this.f6845o;
            b0Var.sendMessage(b0Var.obtainMessage(6, i10, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i11 = this.F.get();
            e0 e0Var = new e0(this, 8, null, null);
            b0 b0Var2 = this.f6845o;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i11, -1, e0Var));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i112 = this.F.get();
            e0 e0Var2 = new e0(this, 8, null, null);
            b0 b0Var22 = this.f6845o;
            b0Var22.sendMessage(b0Var22.obtainMessage(1, i112, -1, e0Var2));
        }
    }

    public abstract int i();

    public final h0.d[] j() {
        g0 g0Var = this.E;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f6878b;
    }

    public final String k() {
        return this.f6840a;
    }

    public boolean l() {
        return false;
    }

    public final void m() {
        int iB = this.f6844n.b(this.f6842l, i());
        if (iB == 0) {
            c(new l(this));
            return;
        }
        z(null, 1);
        this.f6849s = new l(this);
        int i = this.F.get();
        b0 b0Var = this.f6845o;
        b0Var.sendMessage(b0Var.obtainMessage(3, i, iB, null));
    }

    public abstract IInterface n(IBinder iBinder);

    public final void o() {
        this.F.incrementAndGet();
        ArrayList arrayList = this.f6851u;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((t) arrayList.get(i)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6847q) {
            this.f6848r = null;
        }
        z(null, 1);
    }

    public Account p() {
        return null;
    }

    public h0.d[] q() {
        return G;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f6846p) {
            try {
                if (this.f6852w == 5) {
                    throw new DeadObjectException();
                }
                if (!g()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f6850t;
                y.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return i() >= 211700000;
    }

    public final /* synthetic */ boolean x(int i, int i6, IInterface iInterface) {
        synchronized (this.f6846p) {
            try {
                if (this.f6852w != i) {
                    return false;
                }
                z(iInterface, i6);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void y() {
        int i;
        int i6;
        synchronized (this.f6846p) {
            i = this.f6852w;
        }
        if (i == 3) {
            this.D = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        b0 b0Var = this.f6845o;
        b0Var.sendMessage(b0Var.obtainMessage(i6, this.F.get(), 16));
    }

    public final void z(IInterface iInterface, int i) {
        c0.a aVar;
        y.b((i == 4) == (iInterface != null));
        synchronized (this.f6846p) {
            try {
                this.f6852w = i;
                this.f6850t = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    d0 d0Var = this.v;
                    if (d0Var != null) {
                        k0 k0Var = this.f6843m;
                        String str = this.f6841b.f1167b;
                        y.g(str);
                        this.f6841b.getClass();
                        if (this.A == null) {
                            this.f6842l.getClass();
                        }
                        k0Var.d(str, d0Var, this.f6841b.f1168c);
                        this.v = null;
                    }
                } else if (i == 2 || i == 3) {
                    d0 d0Var2 = this.v;
                    if (d0Var2 != null && (aVar = this.f6841b) != null) {
                        String str2 = aVar.f1167b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        k0 k0Var2 = this.f6843m;
                        String str3 = this.f6841b.f1167b;
                        y.g(str3);
                        this.f6841b.getClass();
                        if (this.A == null) {
                            this.f6842l.getClass();
                        }
                        k0Var2.d(str3, d0Var2, this.f6841b.f1168c);
                        this.F.incrementAndGet();
                    }
                    d0 d0Var3 = new d0(this, this.F.get());
                    this.v = d0Var3;
                    String strV = v();
                    boolean zW = w();
                    this.f6841b = new c0.a(1, strV, zW);
                    if (zW && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f6841b.f1167b)));
                    }
                    k0 k0Var3 = this.f6843m;
                    String str4 = this.f6841b.f1167b;
                    y.g(str4);
                    this.f6841b.getClass();
                    String name = this.A;
                    if (name == null) {
                        name = this.f6842l.getClass().getName();
                    }
                    h0.b bVarC = k0Var3.c(new h0(str4, this.f6841b.f1168c), d0Var3, name, null);
                    if (!(bVarC.f5396b == 0)) {
                        String str5 = this.f6841b.f1167b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i6 = bVarC.f5396b;
                        if (i6 == -1) {
                            i6 = 16;
                        }
                        if (bVarC.f5397l != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarC.f5397l);
                        }
                        int i10 = this.F.get();
                        f0 f0Var = new f0(this, i6, bundle);
                        b0 b0Var = this.f6845o;
                        b0Var.sendMessage(b0Var.obtainMessage(7, i10, -1, f0Var));
                    }
                } else if (i == 4) {
                    y.g(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
