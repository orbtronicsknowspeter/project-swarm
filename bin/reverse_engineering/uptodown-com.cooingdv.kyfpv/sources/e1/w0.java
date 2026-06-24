package e1;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends e2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public char f4337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f4339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u0 f4340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f4341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0 f4342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u0 f4343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u0 f4344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u0 f4345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u0 f4346u;
    public final u0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u0 f4347w;

    public w0(t1 t1Var) {
        super(t1Var);
        this.f4337l = (char) 0;
        this.f4338m = -1L;
        this.f4340o = new u0(this, 6, false, false);
        this.f4341p = new u0(this, 6, true, false);
        this.f4342q = new u0(this, 6, false, true);
        this.f4343r = new u0(this, 5, false, false);
        this.f4344s = new u0(this, 5, true, false);
        this.f4345t = new u0(this, 5, false, true);
        this.f4346u = new u0(this, 4, false, false);
        this.v = new u0(this, 3, false, false);
        this.f4347w = new u0(this, 2, false, false);
    }

    public static v0 o(String str) {
        if (str == null) {
            return null;
        }
        return new v0(str);
    }

    public static String r(boolean z9, String str, Object obj, Object obj2, Object obj3) {
        String strS = s(obj, z9);
        String strS2 = s(obj2, z9);
        String strS3 = s(obj3, z9);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strS)) {
            sb.append(str2);
            sb.append(strS);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strS2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strS2);
        }
        if (!TextUtils.isEmpty(strS3)) {
            sb.append(str3);
            sb.append(strS3);
        }
        return sb.toString();
    }

    public static String s(Object obj, boolean z9) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z9) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof v0 ? ((v0) obj).f4322a : z9 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z9 ? th.getClass().getName() : th.toString());
        String canonicalName = t1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // e1.e2
    public final boolean h() {
        return false;
    }

    public final u0 k() {
        return this.f4340o;
    }

    public final u0 l() {
        return this.f4343r;
    }

    public final u0 m() {
        return this.v;
    }

    public final u0 n() {
        return this.f4347w;
    }

    public final void p(int i, boolean z9, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z9 && Log.isLoggable(q(), i)) {
            Log.println(i, q(), r(false, str, obj, obj2, obj3));
        }
        if (z10 || i < 5) {
            return;
        }
        k0.y.g(str);
        q1 q1Var = this.f3876a.f4266p;
        if (q1Var == null) {
            Log.println(6, q(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!q1Var.f3904b) {
                Log.println(6, q(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            q1Var.p(new t0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String q() {
        String str;
        synchronized (this) {
            try {
                if (this.f4339n == null) {
                    this.f3876a.f4263m.f3876a.getClass();
                    this.f4339n = "FA";
                }
                k0.y.g(this.f4339n);
                str = this.f4339n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
