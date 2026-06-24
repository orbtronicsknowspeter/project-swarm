package e1;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r4 extends l4 {
    public static final boolean j(String str) {
        String str2 = (String) f0.f3955t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.D().o()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e1.q4 h(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.r4.h(java.lang.String):e1.q4");
    }

    public final String i(String str) {
        m1 m1Var = this.f4093b.f4306a;
        u4.U(m1Var);
        String strT = m1Var.t(str);
        if (TextUtils.isEmpty(strT)) {
            return (String) f0.f3951r.a(null);
        }
        Uri uri = Uri.parse((String) f0.f3951r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(authority).length());
        sb.append(strT);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
