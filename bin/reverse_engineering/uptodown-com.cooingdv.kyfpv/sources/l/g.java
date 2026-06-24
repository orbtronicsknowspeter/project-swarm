package l;

import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Vector f7046b = new Vector(null, 1, null);

    public static GoogleBasicConsents a() {
        return new GoogleBasicConsents(b("adStorage"), b("adUserData"), b("adPersonalization"), b("analyticsStorage"));
    }

    public static GBCConsentValue b(String str) {
        int iD = d(str);
        Vector vector = f7046b;
        return (vector.contains(iD) && l.a(vector.get(iD), Boolean.TRUE)) ? GBCConsentValue.GRANTED : GBCConsentValue.DENIED;
    }

    public static String c(l9.a aVar) {
        aVar.getClass();
        if (!f7045a) {
            return null;
        }
        String strJ = aVar.j(93);
        return strJ.length() == 0 ? aVar.f7263a.getBoolean("GBCShown", false) ? "Bounce" : "NA" : strJ;
    }

    public static int d(String str) {
        if (str.equals("adStorage")) {
            return 1;
        }
        if (str.equals("adUserData")) {
            return 2;
        }
        if (str.equals("adPersonalization")) {
            return 3;
        }
        return str.equals("analyticsStorage") ? 4 : 0;
    }

    public static String e() {
        if (!f7045a) {
            return null;
        }
        u uVar = new u();
        uVar.f7022a = true;
        f fVar = new f(uVar, 0);
        Vector vector = f7046b;
        vector.forEach(fVar);
        if (uVar.f7022a) {
            return "All";
        }
        u uVar2 = new u();
        uVar2.f7022a = true;
        vector.forEach(new f(uVar2, 1));
        return uVar2.f7022a ? "Reject" : "Partial";
    }
}
