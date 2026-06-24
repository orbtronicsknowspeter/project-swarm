package p3;

import a4.x;
import androidx.lifecycle.l;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8430a = Pattern.compile("^[0-1]*$", 2);

    public static String a(String str) {
        if (!f8430a.matcher(str).matches() || str.length() % 6 != 0) {
            throw new q3.a(l.w("Undecodable FixedString '", str, "'"));
        }
        String string = "";
        int i = 0;
        while (i < str.length()) {
            int i6 = i + 6;
            int iA = e.a(str.substring(i, i6));
            if (iA == 63) {
                string = string.concat(" ");
            } else {
                StringBuilder sbT = x.t(string);
                sbT.append((char) (iA + 65));
                string = sbT.toString();
            }
            i = i6;
        }
        return string.trim();
    }

    public static String b(String str) {
        while (str.length() < 2) {
            str = str.concat(" ");
        }
        String strConcat = "";
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ') {
                strConcat = strConcat.concat(e.b(63, 6));
            } else {
                if (cCharAt < 'A') {
                    throw new a1.b(l.w("Unencodable FixedString '", str, "'"));
                }
                strConcat = strConcat.concat(e.b(str.charAt(i) - 'A', 6));
            }
        }
        return strConcat;
    }
}
