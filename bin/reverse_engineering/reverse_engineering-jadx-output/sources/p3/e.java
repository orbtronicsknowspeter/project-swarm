package p3;

import androidx.lifecycle.l;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8424a = Pattern.compile("^[0-1]*$", 2);

    public static int a(String str) {
        if (!f8424a.matcher(str).matches()) {
            throw new q3.a(l.w("Undecodable FixedInteger '", str, "'"));
        }
        int i = 0;
        int i6 = 0;
        while (i < str.length()) {
            int i10 = i + 1;
            if (str.charAt(str.length() - i10) == '1') {
                i6 += 1 << i;
            }
            i = i10;
        }
        return i6;
    }

    public static String b(int i, int i6) {
        String strConcat = "";
        while (i > 0) {
            strConcat = (i & 1) == 1 ? "1".concat(strConcat) : "0".concat(strConcat);
            i >>= 1;
        }
        if (strConcat.length() <= i6) {
            while (strConcat.length() < i6) {
                strConcat = "0".concat(strConcat);
            }
            return strConcat;
        }
        throw new a1.b("Numeric value '" + i + "' is too large for a bit string length of '" + i6 + "'");
    }
}
