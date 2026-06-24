package h0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import k0.v;
import k0.w;
import k0.x;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile x f5436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f5437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f5438e;

    static {
        new k(l.K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new k(l.K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new k(l.K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new k(l.K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        f5434a = new k(l.K("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        f5435b = new k(l.K("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        f5437d = new Object();
    }

    public static synchronized void a(Context context) {
        if (f5438e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f5438e = context.getApplicationContext();
        }
    }

    public static void b() {
        x vVar;
        if (f5436c != null) {
            return;
        }
        y.g(f5438e);
        synchronized (f5437d) {
            try {
                if (f5436c == null) {
                    IBinder iBinderB = t0.e.c(f5438e, t0.e.f9492d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = w.j;
                    if (iBinderB == null) {
                        vVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        vVar = iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    f5436c = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static s c(String str, m mVar, boolean z9, boolean z10) {
        try {
            b();
            y.g(f5438e);
            try {
                x xVar = f5436c;
                s0.b bVar = new s0.b(f5438e.getPackageManager());
                v vVar = (v) xVar;
                Parcel parcelG = vVar.G();
                int i = z0.g.f11902a;
                boolean z11 = true;
                parcelG.writeInt(1);
                int iY = a.a.Y(parcelG, 20293);
                a.a.T(parcelG, 1, str);
                a.a.R(parcelG, 2, mVar);
                a.a.X(parcelG, 3, 4);
                parcelG.writeInt(z9 ? 1 : 0);
                a.a.X(parcelG, 4, 4);
                parcelG.writeInt(z10 ? 1 : 0);
                a.a.a0(parcelG, iY);
                z0.g.b(parcelG, bVar);
                Parcel parcelC = vVar.c(parcelG, 5);
                if (parcelC.readInt() == 0) {
                    z11 = false;
                }
                parcelC.recycle();
                return z11 ? s.f5445d : new r(new n(z9, str, mVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return s.c("module call", e10);
            }
        } catch (t0.b e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return s.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
