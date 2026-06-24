package p3;

import androidx.lifecycle.l;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8421a = Pattern.compile("^[0-1]*$", 2);

    public static int a(String str) {
        if (str.length() > 24) {
            throw new q3.a("FibonacciInteger too long");
        }
        if (!f8421a.matcher(str).matches() || str.length() < 2 || str.indexOf("11") != str.length() - 2) {
            throw new q3.a(l.w("Undecodable FibonacciInteger '", str, "'"));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == 0) {
                arrayList.add(1);
            } else if (i == 1) {
                arrayList.add(2);
            } else {
                arrayList.add(Integer.valueOf(((Integer) arrayList.get(i - 2)).intValue() + ((Integer) arrayList.get(i - 1)).intValue()));
            }
        }
        int iIntValue = 0;
        for (int i6 = 0; i6 < str.length() - 1; i6++) {
            if (str.charAt(i6) == '1') {
                iIntValue = ((Integer) arrayList.get(i6)).intValue() + iIntValue;
            }
        }
        return iIntValue;
    }

    public static String b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 1) {
            arrayList.add(1);
            int i6 = 2;
            if (i >= 2) {
                arrayList.add(2);
                while (true) {
                    int i10 = i6 - 1;
                    int i11 = i6 - 2;
                    if (i < ((Integer) arrayList.get(i11)).intValue() + ((Integer) arrayList.get(i10)).intValue()) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(((Integer) arrayList.get(i11)).intValue() + ((Integer) arrayList.get(i10)).intValue()));
                    i6++;
                }
            }
        }
        String strConcat = "1";
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int iIntValue = ((Integer) arrayList.get(size)).intValue();
            if (i >= iIntValue) {
                strConcat = "1".concat(strConcat);
                i -= iIntValue;
            } else {
                strConcat = "0".concat(strConcat);
            }
        }
        return strConcat;
    }
}
