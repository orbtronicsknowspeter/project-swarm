package e1;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends p4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f4419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1 f4420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e1 f4421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e1 f4422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e1 f4423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1 f4424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e1 f4425s;

    public y3(u4 u4Var) {
        super(u4Var);
        this.f4419m = new HashMap();
        g1 g1Var = this.f3876a.f4264n;
        t1.k(g1Var);
        this.f4420n = new e1(g1Var, "last_delete_stale", 0L);
        g1 g1Var2 = this.f3876a.f4264n;
        t1.k(g1Var2);
        this.f4421o = new e1(g1Var2, "last_delete_stale_batch", 0L);
        g1 g1Var3 = this.f3876a.f4264n;
        t1.k(g1Var3);
        this.f4422p = new e1(g1Var3, "backoff", 0L);
        g1 g1Var4 = this.f3876a.f4264n;
        t1.k(g1Var4);
        this.f4423q = new e1(g1Var4, "last_upload", 0L);
        g1 g1Var5 = this.f3876a.f4264n;
        t1.k(g1Var5);
        this.f4424r = new e1(g1Var5, "last_upload_attempt", 0L);
        g1 g1Var6 = this.f3876a.f4264n;
        t1.k(g1Var6);
        this.f4425s = new e1(g1Var6, "midnight_offset", 0L);
    }

    public final Pair k(String str) {
        c0.a aVarA;
        x3 x3Var;
        g();
        t1 t1Var = this.f3876a;
        p0.a aVar = t1Var.f4270t;
        g gVar = t1Var.f4263m;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f4419m;
        x3 x3Var2 = (x3) map.get(str);
        if (x3Var2 != null && jElapsedRealtime < x3Var2.f4401c) {
            return new Pair(x3Var2.f4399a, Boolean.valueOf(x3Var2.f4400b));
        }
        long jN = gVar.n(str, f0.f3916b) + jElapsedRealtime;
        try {
            try {
                aVarA = c0.b.a(t1Var.f4260a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (x3Var2 != null && jElapsedRealtime < x3Var2.f4401c + gVar.n(str, f0.f3918c)) {
                    return new Pair(x3Var2.f4399a, Boolean.valueOf(x3Var2.f4400b));
                }
                aVarA = null;
            }
        } catch (Exception e10) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.v.c(e10, "Unable to get advertising id");
            x3Var = new x3("", false, jN);
        }
        if (aVarA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVarA.f1167b;
        x3Var = str2 != null ? new x3(str2, aVarA.f1168c, jN) : new x3("", aVarA.f1168c, jN);
        map.put(str, x3Var);
        return new Pair(x3Var.f4399a, Boolean.valueOf(x3Var.f4400b));
    }

    public final String l(String str, boolean z9) {
        g();
        String str2 = z9 ? (String) k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestX = a5.x();
        if (messageDigestX == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestX.digest(str2.getBytes())));
    }

    @Override // e1.p4
    public final void j() {
    }
}
