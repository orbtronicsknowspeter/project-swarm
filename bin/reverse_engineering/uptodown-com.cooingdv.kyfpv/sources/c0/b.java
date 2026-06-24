package c0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g0.m;
import h0.f;
import java.io.IOException;
import java.util.HashMap;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0.a f1169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0.d f1170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1172d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f1173e;
    public final Context f;
    public final long g;

    public b(Context context) {
        y.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.f1171c = false;
        this.g = -1L;
    }

    public static a a(Context context) {
        b bVar = new b(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bVar.c();
            a aVarE = bVar.e();
            d(aVarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return aVarE;
        } finally {
        }
    }

    public static void d(a aVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.f1168c ? "0" : "1");
                String str = aVar.f1167b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new c(map, 0).start();
        }
    }

    public final void b() {
        y.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.f1169a == null) {
                    return;
                }
                try {
                    if (this.f1171c) {
                        o0.a.b().c(this.f, this.f1169a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f1171c = false;
                this.f1170b = null;
                this.f1169a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        y.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1171c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.f5410b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    h0.a aVar = new h0.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!o0.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f1169a = aVar;
                        try {
                            IBinder iBinderA = aVar.a();
                            int i = u0.c.i;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f1170b = iInterfaceQueryLocalInterface instanceof u0.d ? (u0.d) iInterfaceQueryLocalInterface : new u0.b(iBinderA);
                            this.f1171c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a e() {
        a aVar;
        y.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f1171c) {
                    synchronized (this.f1172d) {
                        d dVar = this.f1173e;
                        if (dVar == null || !dVar.f1179m) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f1171c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                y.g(this.f1169a);
                y.g(this.f1170b);
                try {
                    u0.b bVar = (u0.b) this.f1170b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z9 = true;
                    Parcel parcelA = bVar.a(parcelObtain, 1);
                    String string = parcelA.readString();
                    parcelA.recycle();
                    u0.b bVar2 = (u0.b) this.f1170b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = u0.a.f10394a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelA2 = bVar2.a(parcelObtain2, 2);
                    if (parcelA2.readInt() == 0) {
                        z9 = false;
                    }
                    parcelA2.recycle();
                    aVar = new a(0, string, z9);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return aVar;
    }

    public final void f() {
        synchronized (this.f1172d) {
            d dVar = this.f1173e;
            if (dVar != null) {
                dVar.f1178l.countDown();
                try {
                    this.f1173e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f1173e = new d(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
