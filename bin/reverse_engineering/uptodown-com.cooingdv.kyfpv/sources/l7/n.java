package l7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends a.a {
    public static String c0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        g gVar = new g(str);
        int i = 0;
        while (gVar.hasNext()) {
            String strConcat = (String) gVar.next();
            strConcat.getClass();
            if (!m.z0(strConcat)) {
                strConcat = "    ".concat(strConcat);
            } else if (strConcat.length() < 4) {
                strConcat = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            a.a.i(sb, strConcat, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String d0(String str) {
        Comparable comparable;
        List listB0 = m.B0(str);
        List list = listB0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!m.z0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q6.n.i0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!d0.b.L(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listB0.size();
        int size2 = listB0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            int i10 = i + 1;
            if (i < 0) {
                q6.m.h0();
                throw null;
            }
            String str3 = (String) obj3;
            String strT0 = ((i == 0 || i == size2) && m.z0(str3)) ? null : m.t0(iIntValue, str3);
            if (strT0 != null) {
                arrayList3.add(strT0);
            }
            i = i10;
        }
        StringBuilder sb = new StringBuilder(length3);
        q6.l.v0(arrayList3, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String e0(String str) {
        if (m.z0("|")) {
            com.google.gson.internal.a.p("marginPrefix must be non-blank string.");
            return null;
        }
        List listB0 = m.B0(str);
        int length = str.length();
        listB0.size();
        int size = listB0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listB0) {
            int i6 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                q6.m.h0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != size) || !m.z0(str2)) {
                int length2 = str2.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!d0.b.L(str2.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && str2.startsWith("|", i10)) {
                    strSubstring = str2.substring("|".length() + i10);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i6;
        }
        StringBuilder sb = new StringBuilder(length);
        q6.l.v0(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
