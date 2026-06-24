package m8;

import j$.util.DesugarCollections;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7796e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    public u(t tVar) {
        this.f7792a = tVar.f7787a;
        String str = tVar.f7788b;
        this.f7793b = h(str, 0, str.length(), false);
        String str2 = tVar.f7789c;
        this.f7794c = h(str2, 0, str2.length(), false);
        this.f7795d = tVar.f7790d;
        int i = tVar.f7791e;
        this.f7796e = i == -1 ? b(tVar.f7787a) : i;
        this.f = i(tVar.f, false);
        ArrayList arrayList = tVar.g;
        this.g = arrayList != null ? i(arrayList, true) : null;
        String str3 = tVar.h;
        this.h = str3 != null ? h(str3, 0, str3.length(), false) : null;
        this.i = tVar.toString();
    }

    public static String a(String str, int i, int i6, String str2, boolean z9, boolean z10, boolean z11, boolean z12) throws EOFException {
        int iCharCount = i;
        while (iCharCount < i6) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z12) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z9 || (z10 && !j(iCharCount, i6, str)))) || (iCodePointAt == 43 && z11)))) {
                w8.h hVar = new w8.h();
                hVar.F(i, iCharCount, str);
                w8.h hVar2 = null;
                while (iCharCount < i6) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z9 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z11) {
                            hVar.G(z9 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z12) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z9 || (z10 && !j(iCharCount, i6, str)))))) {
                            if (hVar2 == null) {
                                hVar2 = new w8.h();
                            }
                            hVar2.H(iCodePointAt2);
                            while (!hVar2.c()) {
                                byte b7 = hVar2.readByte();
                                hVar.A(37);
                                char[] cArr = j;
                                hVar.A(cArr[((b7 & 255) >> 4) & 15]);
                                hVar.A(cArr[b7 & 15]);
                            }
                        } else {
                            hVar.H(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return hVar.r(hVar.f10961b, l7.a.f7151a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i6);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void g(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(java.lang.String r8, int r9, int r10, boolean r11) {
        /*
            r0 = r9
        L1:
            if (r0 >= r10) goto L64
            char r1 = r8.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r11 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            w8.h r1 = new w8.h
            r1.<init>()
            r1.F(r9, r0, r8)
        L1d:
            if (r0 >= r10) goto L5b
            int r9 = r8.codePointAt(r0)
            if (r9 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r10) goto L48
            int r5 = r0 + 1
            char r5 = r8.charAt(r5)
            int r5 = n8.c.e(r5)
            char r6 = r8.charAt(r4)
            int r6 = n8.c.e(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.A(r0)
            r0 = r4
            goto L55
        L48:
            if (r9 != r2) goto L52
            if (r11 == 0) goto L52
            r4 = 32
            r1.A(r4)
            goto L55
        L52:
            r1.H(r9)
        L55:
            int r9 = java.lang.Character.charCount(r9)
            int r0 = r0 + r9
            goto L1d
        L5b:
            long r8 = r1.f10961b
            java.nio.charset.Charset r10 = l7.a.f7151a
            java.lang.String r8 = r1.r(r8, r10)
            return r8
        L64:
            java.lang.String r8 = r8.substring(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.u.h(java.lang.String, int, int, boolean):java.lang.String");
    }

    public static List i(ArrayList arrayList, boolean z9) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? h(str, 0, str.length(), z9) : null);
        }
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    public static boolean j(int i, int i6, String str) {
        int i10 = i + 2;
        return i10 < i6 && str.charAt(i) == '%' && n8.c.e(str.charAt(i + 1)) != -1 && n8.c.e(str.charAt(i10)) != -1;
    }

    public static ArrayList k(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f7794c.isEmpty()) {
            return "";
        }
        int length = this.f7792a.length() + 3;
        String str = this.i;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        int length = this.f7792a.length() + 3;
        String str = this.i;
        int iIndexOf = str.indexOf(47, length);
        int iG = n8.c.g(iIndexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iG) {
            int i = iIndexOf + 1;
            int iH = n8.c.h(str, i, iG, '/');
            arrayList.add(str.substring(i, iH));
            iIndexOf = iH;
        }
        return arrayList;
    }

    public final String e() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, n8.c.h(str, iIndexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).i.equals(this.i);
    }

    public final String f() {
        if (this.f7793b.isEmpty()) {
            return "";
        }
        int length = this.f7792a.length() + 3;
        String str = this.i;
        return str.substring(length, n8.c.g(length, str.length(), str, ":@"));
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI l() {
        t tVar = new t();
        String str = this.f7792a;
        tVar.f7787a = str;
        tVar.f7788b = f();
        tVar.f7789c = c();
        tVar.f7790d = this.f7795d;
        int iB = b(str);
        int i = this.f7796e;
        if (i == iB) {
            i = -1;
        }
        tVar.f7791e = i;
        ArrayList arrayList = tVar.f;
        arrayList.clear();
        arrayList.addAll(d());
        String strE = e();
        String strSubstring = null;
        tVar.g = strE != null ? k(a(strE, 0, strE.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        tVar.h = strSubstring;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            String str3 = (String) arrayList.get(i6);
            arrayList.set(i6, a(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = tVar.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) tVar.g.get(i10);
                if (str4 != null) {
                    tVar.g.set(i10, a(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = tVar.h;
        if (str5 != null) {
            tVar.h = a(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = tVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                com.google.gson.internal.a.k(e10);
                return null;
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
