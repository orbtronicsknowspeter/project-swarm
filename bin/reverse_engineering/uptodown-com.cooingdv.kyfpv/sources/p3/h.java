package p3;

import java.util.regex.Pattern;
import k0.k;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8429a = Pattern.compile("^[0-1]*$", 2);

    public static String a(long j) {
        String strConcat = "";
        while (j > 0) {
            strConcat = (j & 1) == 1 ? "1".concat(strConcat) : "0".concat(strConcat);
            j >>= 1;
        }
        if (strConcat.length() > 36) {
            throw new a1.b(k.g(j, "Numeric value '", "' is too large for a bit string length of '36'"));
        }
        while (strConcat.length() < 36) {
            strConcat = "0".concat(strConcat);
        }
        return strConcat;
    }
}
