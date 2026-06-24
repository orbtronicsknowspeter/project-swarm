package p3;

import a4.x;
import androidx.lifecycle.l;
import com.google.android.gms.internal.measurement.i5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f8421a = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8422b = Pattern.compile("^[0-1]*$", 2);

    public static ArrayList a(String str) {
        if (f8422b.matcher(str).matches()) {
            int iIndexOf = 12;
            if (str.length() >= 12) {
                ArrayList arrayList = new ArrayList();
                int iA = e.a(str.substring(0, 12));
                int i = 0;
                for (int i6 = 0; i6 < iA; i6++) {
                    int i10 = iIndexOf + 1;
                    boolean zK = i5.k(str.substring(iIndexOf, i10));
                    Logger logger = f8421a;
                    if (zK) {
                        int iIndexOf2 = str.indexOf("11", i10) + 2;
                        int iA2 = b.a(str.substring(i10, iIndexOf2)) + i;
                        int iIndexOf3 = str.indexOf("11", iIndexOf2) + 2;
                        int iA3 = b.a(str.substring(iIndexOf2, iIndexOf3)) + iA2;
                        if ((iA3 - iA2) + arrayList.size() > 8192) {
                            logger.warning("FibonacciIntegerRange has too many values");
                            return arrayList;
                        }
                        while (iA2 <= iA3) {
                            arrayList.add(Integer.valueOf(iA2));
                            iA2++;
                        }
                        i = iA3;
                        iIndexOf = iIndexOf3;
                    } else {
                        iIndexOf = str.indexOf("11", i10) + 2;
                        int iA4 = b.a(str.substring(i10, iIndexOf)) + i;
                        if (arrayList.size() == 8192) {
                            logger.warning("FibonacciIntegerRange has too many values");
                            return arrayList;
                        }
                        arrayList.add(Integer.valueOf(iA4));
                        i = iA4;
                    }
                }
                return arrayList;
            }
        }
        throw new q3.a(l.w("Undecodable FibonacciIntegerRange '", str, "'"));
    }

    public static String b(List list) {
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            int i6 = i;
            while (i6 < list.size() - 1) {
                int i10 = i6 + 1;
                if (((Integer) list.get(i6)).intValue() + 1 == ((Integer) list.get(i10)).intValue()) {
                    i6 = i10;
                }
            }
            int i11 = i6 + 1;
            arrayList.add(list.subList(i, i11));
            i = i11;
        }
        String strB = e.b(arrayList.size(), 12);
        int iIntValue = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((List) arrayList.get(i12)).size() == 1) {
                int iIntValue2 = ((Integer) ((List) arrayList.get(i12)).get(0)).intValue() - iIntValue;
                iIntValue = ((Integer) ((List) arrayList.get(i12)).get(0)).intValue();
                StringBuilder sbU = x.u(strB, "0");
                sbU.append(b.b(iIntValue2));
                strB = sbU.toString();
            } else {
                int iIntValue3 = ((Integer) ((List) arrayList.get(i12)).get(0)).intValue() - iIntValue;
                int iIntValue4 = ((Integer) ((List) arrayList.get(i12)).get(((List) arrayList.get(i12)).size() - 1)).intValue() - ((Integer) ((List) arrayList.get(i12)).get(0)).intValue();
                iIntValue = ((Integer) ((List) arrayList.get(i12)).get(((List) arrayList.get(i12)).size() - 1)).intValue();
                StringBuilder sbU2 = x.u(strB, "1");
                sbU2.append(b.b(iIntValue3));
                sbU2.append(b.b(iIntValue4));
                strB = sbU2.toString();
            }
        }
        return strB;
    }
}
