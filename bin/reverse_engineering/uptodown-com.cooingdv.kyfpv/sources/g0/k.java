package g0;

import a4.c0;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5087a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f5088b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.support.v4.media.g f5089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f5090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f5091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f5092o;

    public k(n nVar) {
        this.f5092o = nVar;
        c0 c0Var = new c0(Looper.getMainLooper(), new Handler.Callback() { // from class: g0.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                k kVar = this.f5086a;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.f5091n.get(i);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        kVar.f5091n.remove(i);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new m("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.f5097e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.c(null);
                                    return true;
                                }
                                lVar.b(new m("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        }, 5);
        Looper.getMainLooper();
        this.f5088b = new Messenger(c0Var);
        this.f5090m = new ArrayDeque();
        this.f5091n = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f5087a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f5087a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f5087a = 4;
            o0.a.b().c(this.f5092o.f5099a, this);
            m mVar = new m(str, securityException);
            Iterator it = this.f5090m.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(mVar);
            }
            this.f5090m.clear();
            int i6 = 0;
            while (true) {
                int size = this.f5091n.size();
                SparseArray sparseArray = this.f5091n;
                if (i6 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((l) sparseArray.valueAt(i6)).b(mVar);
                    i6++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f5087a == 2 && this.f5090m.isEmpty() && this.f5091n.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f5087a = 3;
                o0.a.b().c(this.f5092o.f5099a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l lVar) {
        int i = this.f5087a;
        if (i != 0) {
            if (i == 1) {
                this.f5090m.add(lVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f5090m.add(lVar);
            this.f5092o.f5100b.execute(new i(this, 0));
            return true;
        }
        this.f5090m.add(lVar);
        if (this.f5087a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f5087a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (o0.a.b().a(this.f5092o.f5099a, intent, this, 1)) {
                this.f5092o.f5100b.schedule(new i(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b("Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f5092o.f5100b.execute(new m1.a(18, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f5092o.f5100b.execute(new i(this, 2));
    }
}
