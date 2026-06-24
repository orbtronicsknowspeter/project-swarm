package e1;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4253a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4254b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f4257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f4259p;

    public /* synthetic */ t0(String str, y0 y0Var, int i, IOException iOException, byte[] bArr, Map map) {
        k0.y.g(y0Var);
        this.f4256m = y0Var;
        this.f4254b = i;
        this.f4257n = iOException;
        this.f4258o = bArr;
        this.f4255l = str;
        this.f4259p = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4253a) {
            case 0:
                w0 w0Var = (w0) this.f4259p;
                g1 g1Var = w0Var.f3876a.f4264n;
                t1.k(g1Var);
                if (!g1Var.f3904b) {
                    Log.println(6, w0Var.q(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (w0Var.f4337l == 0) {
                    g gVar = w0Var.f3876a.f4263m;
                    if (gVar.f3981n == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f3981n == null) {
                                    t1 t1Var = gVar.f3876a;
                                    ApplicationInfo applicationInfo = t1Var.f4260a.getApplicationInfo();
                                    String strA = p0.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.f3981n = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.f3981n == null) {
                                        gVar.f3981n = Boolean.TRUE;
                                        w0 w0Var2 = t1Var.f4265o;
                                        t1.m(w0Var2);
                                        w0Var2.f4340o.b("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (gVar.f3981n.booleanValue()) {
                        w0Var.f4337l = 'C';
                    } else {
                        w0Var.f4337l = 'c';
                    }
                    break;
                }
                if (w0Var.f4338m < 0) {
                    w0Var.f3876a.f4263m.l();
                    w0Var.f4338m = 133005L;
                }
                int i = this.f4254b;
                char c9 = w0Var.f4337l;
                long j = w0Var.f4338m;
                String str2 = this.f4255l;
                Object obj = this.f4256m;
                Object obj2 = this.f4257n;
                Object obj3 = this.f4258o;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strR = w0.r(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c9).length() + String.valueOf(j).length() + 1 + strR.length());
                sb.append(ExifInterface.GPS_MEASUREMENT_2D);
                sb.append(cCharAt);
                sb.append(c9);
                sb.append(j);
                sb.append(":");
                sb.append(strR);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                f1 f1Var = g1Var.f3984n;
                if (f1Var != null) {
                    String str3 = (String) f1Var.f3971d;
                    g1 g1Var2 = (g1) f1Var.f3972e;
                    g1Var2.g();
                    if (((g1) f1Var.f3972e).k().getLong((String) f1Var.f3969b, 0L) == 0) {
                        f1Var.b();
                    }
                    SharedPreferences sharedPreferencesK = g1Var2.k();
                    String str4 = (String) f1Var.f3970c;
                    long j6 = sharedPreferencesK.getLong(str4, 0L);
                    if (j6 <= 0) {
                        SharedPreferences.Editor editorEdit = g1Var2.k().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    a5 a5Var = g1Var2.f3876a.f4268r;
                    t1.k(a5Var);
                    long jNextLong = a5Var.e0().nextLong() & LocationRequestCompat.PASSIVE_INTERVAL;
                    long j10 = j6 + 1;
                    long j11 = LocationRequestCompat.PASSIVE_INTERVAL / j10;
                    SharedPreferences.Editor editorEdit2 = g1Var2.k().edit();
                    if (jNextLong < j11) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j10);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((y0) this.f4256m).c(this.f4255l, this.f4254b, (Throwable) this.f4257n, (byte[]) this.f4258o, (Map) this.f4259p);
                return;
        }
    }

    public t0(w0 w0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f4254b = i;
        this.f4255l = str;
        this.f4256m = obj;
        this.f4257n = obj2;
        this.f4258o = obj3;
        this.f4259p = w0Var;
    }
}
