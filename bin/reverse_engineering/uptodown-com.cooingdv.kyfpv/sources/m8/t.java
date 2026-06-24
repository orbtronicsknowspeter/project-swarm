package m8;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7788a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7791d;
    public final ArrayList f;
    public ArrayList g;
    public String h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7789b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7790c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7792e = -1;

    public t() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final u a() {
        if (this.f7788a == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("scheme == null");
            return null;
        }
        if (this.f7791d != null) {
            return new u(this);
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("host == null");
        return null;
    }

    public final int b(u uVar, String str) throws EOFException {
        char cCharAt;
        int i;
        char c9;
        int iG;
        ArrayList arrayList;
        String str2;
        int i6;
        ArrayList arrayList2;
        int i10;
        String str3;
        char c10;
        ArrayList arrayList3;
        char cCharAt2;
        String str4 = str;
        int iQ = n8.c.q(0, str4.length(), str4);
        int iR = n8.c.r(iQ, str4.length(), str4);
        if (iR - iQ >= 2 && (((cCharAt = str4.charAt(iQ)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
            i = iQ + 1;
            while (true) {
                if (i >= iR) {
                    break;
                }
                char cCharAt3 = str4.charAt(i);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i++;
                } else if (cCharAt3 != ':') {
                    break;
                }
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            if (str4.regionMatches(true, iQ, "https:", 0, 6)) {
                this.f7788a = "https";
                iQ += 6;
                str4 = str;
            } else {
                str4 = str;
                if (!str4.regionMatches(true, iQ, "http:", 0, 5)) {
                    return 3;
                }
                this.f7788a = "http";
                iQ += 5;
            }
        } else {
            if (uVar == null) {
                return 2;
            }
            this.f7788a = uVar.f7793a;
        }
        int i11 = iQ;
        int i12 = 0;
        while (true) {
            c9 = '\\';
            if (i11 >= iR || !((cCharAt2 = str4.charAt(i11)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i12++;
            i11++;
        }
        char c11 = '?';
        ArrayList arrayList4 = this.f;
        char c12 = '#';
        if (i12 >= 2 || uVar == null || !uVar.f7793a.equals(this.f7788a)) {
            int i13 = iQ + i12;
            boolean z9 = false;
            boolean z10 = false;
            while (true) {
                iG = n8.c.g(i13, iR, str4, "@/\\?#");
                byte bCharAt = iG != iR ? str4.charAt(iG) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c12 || bCharAt == 47 || bCharAt == c9 || bCharAt == c11) {
                    break;
                }
                if (bCharAt != 64) {
                    str3 = str4;
                    arrayList2 = arrayList4;
                } else {
                    if (z9) {
                        arrayList2 = arrayList4;
                        i10 = iG;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f7790c);
                        sb.append("%40");
                        str3 = str;
                        sb.append(u.a(str3, i13, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                        this.f7790c = sb.toString();
                    } else {
                        ArrayList arrayList5 = arrayList4;
                        int iH = n8.c.h(str4, i13, iG, ':');
                        arrayList2 = arrayList5;
                        String strA = u.a(str, i13, iH, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z10) {
                            strA = a4.x.o(new StringBuilder(), this.f7789b, "%40", strA);
                        }
                        this.f7789b = strA;
                        if (iH != iG) {
                            int i14 = iH + 1;
                            i10 = iG;
                            this.f7790c = u.a(str, i14, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z9 = true;
                        } else {
                            i10 = iG;
                        }
                        str3 = str;
                        z10 = true;
                    }
                    i13 = i10 + 1;
                }
                arrayList4 = arrayList2;
                str4 = str3;
                c12 = '#';
                c9 = '\\';
                c11 = '?';
            }
            arrayList = arrayList4;
            str2 = str4;
            int i15 = i13;
            int i16 = i15;
            while (true) {
                if (i16 < iG) {
                    char cCharAt4 = str2.charAt(i16);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i16++;
                            if (i16 < iG) {
                            }
                        } while (str2.charAt(i16) != ']');
                    }
                    i16++;
                } else {
                    i16 = iG;
                    break;
                }
            }
            int i17 = i16 + 1;
            if (i17 < iG) {
                this.f7791d = n8.c.b(u.h(str2, i15, i16, false));
                try {
                    i6 = Integer.parseInt(u.a(str2, i17, iG, "", false, false, false, true));
                } catch (NumberFormatException unused) {
                }
                if (i6 <= 0 || i6 > 65535) {
                    i6 = -1;
                }
                this.f7792e = i6;
                if (i6 == -1) {
                    return 4;
                }
            } else {
                this.f7791d = n8.c.b(u.h(str2, i15, i16, false));
                this.f7792e = u.b(this.f7788a);
            }
            if (this.f7791d == null) {
                return 5;
            }
            iQ = iG;
        } else {
            this.f7789b = uVar.f();
            this.f7790c = uVar.c();
            this.f7791d = uVar.f7796d;
            this.f7792e = uVar.f7797e;
            arrayList4.clear();
            arrayList4.addAll(uVar.d());
            if (iQ == iR || str4.charAt(iQ) == '#') {
                String strE = uVar.e();
                this.g = strE != null ? u.k(u.a(strE, 0, strE.length(), " \"'<>#", true, false, true, true)) : null;
            }
            str2 = str4;
            arrayList = arrayList4;
        }
        int iG2 = n8.c.g(iQ, iR, str2, "?#");
        if (iQ != iG2) {
            char cCharAt5 = str2.charAt(iQ);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList3 = arrayList;
                arrayList3.clear();
                arrayList3.add("");
                iQ++;
            } else {
                arrayList3 = arrayList;
                arrayList3.set(arrayList.size() - 1, "");
            }
            int i18 = iQ;
            while (i18 < iG2) {
                int iG3 = n8.c.g(i18, iG2, str2, "/\\");
                boolean z11 = iG3 < iG2;
                String strA2 = u.a(str2, i18, iG3, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                    if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                        if (((String) arrayList3.get(arrayList3.size() - 1)).isEmpty()) {
                            arrayList3.set(arrayList3.size() - 1, strA2);
                        } else {
                            arrayList3.add(strA2);
                        }
                        if (z11) {
                            arrayList3.add("");
                        }
                    } else if (!((String) arrayList3.remove(arrayList3.size() - 1)).isEmpty() || arrayList3.isEmpty()) {
                        arrayList3.add("");
                    } else {
                        arrayList3.set(arrayList3.size() - 1, "");
                    }
                }
                if (z11) {
                    iG3++;
                }
                i18 = iG3;
            }
        }
        if (iG2 >= iR || str2.charAt(iG2) != '?') {
            c10 = '#';
        } else {
            c10 = '#';
            int iH2 = n8.c.h(str2, iG2, iR, '#');
            this.g = u.k(u.a(str2, iG2 + 1, iH2, " \"'<>#", true, false, true, true));
            iG2 = iH2;
        }
        if (iG2 < iR && str2.charAt(iG2) == c10) {
            this.h = u.a(str2, iG2 + 1, iR, "", true, false, false, false);
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7788a);
        sb.append("://");
        if (!this.f7789b.isEmpty() || !this.f7790c.isEmpty()) {
            sb.append(this.f7789b);
            if (!this.f7790c.isEmpty()) {
                sb.append(':');
                sb.append(this.f7790c);
            }
            sb.append('@');
        }
        if (this.f7791d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f7791d);
            sb.append(']');
        } else {
            sb.append(this.f7791d);
        }
        int iB = this.f7792e;
        if (iB == -1) {
            iB = u.b(this.f7788a);
        }
        if (iB != u.b(this.f7788a)) {
            sb.append(':');
            sb.append(iB);
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.g != null) {
            sb.append('?');
            u.g(sb, this.g);
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
