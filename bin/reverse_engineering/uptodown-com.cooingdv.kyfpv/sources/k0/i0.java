package k0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6884a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6885b = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IBinder f6887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f6888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ComponentName f6889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k0 f6890p;

    public i0(k0 k0Var, h0 h0Var) {
        this.f6890p = k0Var;
        this.f6888n = h0Var;
    }

    public final h0.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = a0.a(this.f6890p.f6902b, this.f6888n);
            this.f6885b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(p0.f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = this.f6890p;
                o0.a aVar = k0Var.f6904d;
                Context context = k0Var.f6902b;
                h0 h0Var = this.f6888n;
                try {
                    boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                    this.f6886l = zD;
                    if (zD) {
                        k0Var.f6903c.sendMessageDelayed(k0Var.f6903c.obtainMessage(1, h0Var), k0Var.f);
                        h0.b bVar = h0.b.f5394o;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f6885b = 2;
                    try {
                        k0Var.f6904d.c(k0Var.f6902b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    h0.b bVar2 = new h0.b(null, null, 16);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (z e10) {
            return e10.f6940a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k0 k0Var = this.f6890p;
        synchronized (k0Var.f6901a) {
            try {
                k0Var.f6903c.removeMessages(1, this.f6888n);
                this.f6887m = iBinder;
                this.f6889o = componentName;
                Iterator it = this.f6884a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6885b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k0 k0Var = this.f6890p;
        synchronized (k0Var.f6901a) {
            try {
                k0Var.f6903c.removeMessages(1, this.f6888n);
                this.f6887m = null;
                this.f6889o = componentName;
                Iterator it = this.f6884a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6885b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
