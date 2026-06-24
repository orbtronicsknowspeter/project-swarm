package q8;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import m8.c0;
import m8.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8785a = 0;

    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(c0 c0Var) {
        String strA = c0Var.f7697o.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(c0 c0Var) {
        if (c0Var.f7692a.f7674b.equals("HEAD")) {
            return false;
        }
        int i = c0Var.f7694l;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && a(c0Var) == -1 && !"chunked".equalsIgnoreCase(c0Var.c("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i, String str) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        r19 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b5, code lost:
    
        r0 = r36.f7795d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b9, code lost:
    
        if (r15 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bb, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        if (r0.equals(r15) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
    
        if (r0.endsWith(r15) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01db, code lost:
    
        if (r0.charAt((r0.length() - r15.length()) - 1) != '.') goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e7, code lost:
    
        if (n8.c.g.matcher(r0).matches() != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f1, code lost:
    
        if (r0.length() == r15.length()) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f3, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.h;
        r3.getClass();
        r6 = java.net.IDN.toUnicode(r15).split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0208, code lost:
    
        if (r3.f8386a.get() != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0212, code lost:
    
        if (r3.f8386a.compareAndSet(false, true) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0214, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023c, code lost:
    
        r3.f8387b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0186, code lost:
    
        r17 = r2;
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018c, code lost:
    
        if (r20 != Long.MIN_VALUE) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        r19 = Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0193, code lost:
    
        if (r20 == (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
    
        if (r20 > 9223372036854775L) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        r29 = r20 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        r29 = r10 + r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a6, code lost:
    
        if (r29 < r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01aa, code lost:
    
        if (r29 <= 253402300799999L) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r19 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b0, code lost:
    
        r19 = 253402300799999L;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0309 A[LOOP:9: B:194:0x0306->B:196:0x0309, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(m8.b r35, m8.u r36, m8.s r37) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.c.d(m8.b, m8.u, m8.s):void");
    }

    public static int e(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static Set f(s sVar) {
        Set treeSet = Collections.EMPTY_SET;
        int iD = sVar.d();
        for (int i = 0; i < iD; i++) {
            if ("Vary".equalsIgnoreCase(sVar.b(i))) {
                String strE = sVar.e(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strE.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }
}
