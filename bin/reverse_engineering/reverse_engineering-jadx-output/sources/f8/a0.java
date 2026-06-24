package f8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.PreRegisterWorker;
import java.io.Serializable;
import o7.m0;
import x4.j0;
import x4.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class a0 implements o5.e, a4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4930b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Serializable f4932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f4933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4934o;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.Object[]] */
    public a0(String str) {
        this.f4929a = 0;
        str.getClass();
        o oVar = new o();
        oVar.f4960b = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        oVar.f4962d = iArr;
        oVar.f4961c = -1;
        this.f4931l = oVar;
        this.f4934o = new StringBuilder();
        this.f4933n = str;
    }

    public static /* synthetic */ void p(a0 a0Var, String str, int i, String str2, int i6) {
        if ((i6 & 2) != 0) {
            i = a0Var.f4930b;
        }
        if ((i6 & 4) != 0) {
            str2 = "";
        }
        a0Var.o(i, str, str2);
        throw null;
    }

    @Override // o5.e
    public void a(long j) {
        ((kotlin.jvm.internal.w) this.f4931l).f7023a = j;
    }

    @Override // o5.e
    public void b(long j) {
        ((kotlin.jvm.internal.w) this.f4932m).f7023a = j;
    }

    public int c(int i, CharSequence charSequence) {
        int i6 = i + 4;
        if (i6 < charSequence.length()) {
            ((StringBuilder) this.f4934o).append((char) (r(i + 3, charSequence) + (r(i, charSequence) << 12) + (r(i + 1, charSequence) << 8) + (r(i + 2, charSequence) << 4)));
            return i6;
        }
        this.f4930b = i;
        if (i6 < charSequence.length()) {
            return c(this.f4930b, charSequence);
        }
        p(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean d() {
        int i = this.f4930b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f4933n;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f4930b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f4930b = i;
        return false;
    }

    @Override // o5.e
    public void e() {
        Bundle bundleE = k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "reconnected");
        DownloadApkWorker downloadApkWorker = (DownloadApkWorker) this.f4933n;
        downloadApkWorker.r(bundleE, downloadApkWorker.f3476c, (j0) ((x4.r) this.f4934o).F.get(this.f4930b));
    }

    public void f(int i, String str) {
        String str2 = (String) this.f4933n;
        if (str2.length() - i < str.length()) {
            p(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) != (str2.charAt(i + i6) | ' ')) {
                p(this, "Expected valid boolean literal prefix, but had '" + n() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f4930b = str.length() + i;
    }

    public String g() {
        String string;
        StringBuilder sb = (StringBuilder) this.f4934o;
        String str = (String) this.f4933n;
        k('\"');
        int i = this.f4930b;
        int iX0 = l7.m.x0('\"', i, 4, str);
        if (iX0 == -1) {
            n();
            q((byte) 1, false);
            throw null;
        }
        int i6 = i;
        while (i6 < iX0) {
            if (str.charAt(i6) == '\\') {
                int iV = this.f4930b;
                char cCharAt = str.charAt(i6);
                boolean z9 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iV, i6);
                        int iV2 = v(i6 + 1);
                        if (iV2 == -1) {
                            p(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iC = iV2 + 1;
                        char cCharAt2 = str.charAt(iV2);
                        if (cCharAt2 == 'u') {
                            iC = c(iC, str);
                        } else {
                            char c9 = cCharAt2 < 'u' ? d.f4949a[cCharAt2] : (char) 0;
                            if (c9 == 0) {
                                p(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c9);
                        }
                        iV = v(iC);
                        if (iV == -1) {
                            p(this, "Unexpected EOF", iV, null, 4);
                            throw null;
                        }
                    } else {
                        i6++;
                        if (i6 >= str.length()) {
                            sb.append((CharSequence) str, iV, i6);
                            iV = v(i6);
                            if (iV == -1) {
                                p(this, "Unexpected EOF", iV, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i6);
                        }
                    }
                    i6 = iV;
                    z9 = true;
                    cCharAt = str.charAt(i6);
                }
                if (z9) {
                    sb.append((CharSequence) str, iV, i6);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iV, i6).toString();
                }
                this.f4930b = i6 + 1;
                return string;
            }
            i6++;
        }
        this.f4930b = iX0 + 1;
        return str.substring(i, iX0);
    }

    @Override // a4.i
    public void h(Exception exc) {
        j5.o.e(((PreRegisterWorker) this.f4931l).f3487a, (x4.g) this.f4934o, this.f4930b, null, (x1) this.f4933n);
    }

    public byte i() {
        String str = (String) this.f4933n;
        int i = this.f4930b;
        while (i != -1 && i < str.length()) {
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f4930b = i6;
                return m.g(cCharAt);
            }
            i = i6;
        }
        this.f4930b = str.length();
        return (byte) 10;
    }

    public byte j(byte b7) {
        byte bI = i();
        if (bI == b7) {
            return bI;
        }
        q(b7, true);
        throw null;
    }

    public void k(char c9) {
        int i = this.f4930b;
        if (i == -1) {
            y(c9);
            throw null;
        }
        String str = (String) this.f4933n;
        while (i < str.length()) {
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f4930b = i6;
                if (cCharAt == c9) {
                    return;
                }
                y(c9);
                throw null;
            }
            i = i6;
        }
        this.f4930b = -1;
        y(c9);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        com.google.gson.internal.a.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        p(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        p(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        p(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        p(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        p(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        r21.f4930b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        p(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        p(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l() {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.a0.l():long");
    }

    public String m() {
        String str = (String) this.f4932m;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.f4932m = null;
        return str;
    }

    public String n() {
        String string;
        StringBuilder sb = (StringBuilder) this.f4934o;
        String str = (String) this.f4933n;
        String str2 = (String) this.f4932m;
        if (str2 != null) {
            str2.getClass();
            this.f4932m = null;
            return str2;
        }
        int iW = w();
        if (iW >= str.length() || iW == -1) {
            p(this, "EOF", iW, null, 4);
            throw null;
        }
        byte bG = m.g(str.charAt(iW));
        if (bG == 1) {
            return m();
        }
        if (bG != 0) {
            p(this, "Expected beginning of the string, but got " + str.charAt(iW), 0, null, 6);
            throw null;
        }
        boolean z9 = false;
        while (m.g(str.charAt(iW)) == 0) {
            iW++;
            if (iW >= str.length()) {
                sb.append((CharSequence) str, this.f4930b, iW);
                int iV = v(iW);
                if (iV == -1) {
                    this.f4930b = iW;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iW = iV;
                z9 = true;
            }
        }
        int i = this.f4930b;
        if (z9) {
            sb.append((CharSequence) str, i, iW);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iW).toString();
        }
        this.f4930b = iW;
        return string;
    }

    public void o(int i, String str, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbU = a4.x.u(str, " at path: ");
        sbU.append(((o) this.f4931l).c());
        sbU.append(strConcat);
        throw m.e(sbU.toString(), (String) this.f4933n, i);
    }

    @Override // a4.i
    public void onSuccess() {
        v7.e eVar = m0.f8288a;
        t7.c cVarB = o7.c0.b(v7.d.f10884a);
        PreRegisterWorker preRegisterWorker = (PreRegisterWorker) this.f4931l;
        String str = (String) this.f4932m;
        x1 x1Var = (x1) this.f4933n;
        o7.c0.s(cVarB, null, null, new o5.m(this.f4930b, preRegisterWorker, str, null, (x4.g) this.f4934o, x1Var), 3);
    }

    public void q(byte b7, boolean z9) {
        String str = (String) this.f4933n;
        String strP = m.p(b7);
        int i = this.f4930b;
        int i6 = z9 ? i - 1 : i;
        p(this, "Expected " + strP + ", but had '" + ((i == str.length() || i6 < 0) ? "EOF" : String.valueOf(str.charAt(i6))) + "' instead", i6, null, 4);
        throw null;
    }

    public int r(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        p(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String s(String str) {
        str.getClass();
        int i = this.f4930b;
        try {
            if (i() == 6 && kotlin.jvm.internal.l.a(u(), str)) {
                this.f4932m = null;
                if (i() == 5) {
                    return u();
                }
            }
            return null;
        } finally {
            this.f4930b = i;
            this.f4932m = null;
        }
    }

    public byte t() {
        String str = (String) this.f4933n;
        int i = this.f4930b;
        while (true) {
            int iV = v(i);
            if (iV == -1) {
                this.f4930b = iV;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iV);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f4930b = iV;
                return m.g(cCharAt);
            }
            i = iV + 1;
        }
    }

    public String toString() {
        switch (this.f4929a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f4933n);
                sb.append("', currentPosition=");
                sb.append(this.f4930b);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String u() {
        if (t() != 1) {
            return null;
        }
        String strM = m();
        this.f4932m = strM;
        return strM;
    }

    public int v(int i) {
        if (i < ((String) this.f4933n).length()) {
            return i;
        }
        return -1;
    }

    public int w() {
        char cCharAt;
        int i = this.f4930b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f4933n;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f4930b = i;
        return i;
    }

    public boolean x() {
        int iW = w();
        String str = (String) this.f4933n;
        if (iW >= str.length() || iW == -1 || str.charAt(iW) != ',') {
            return false;
        }
        this.f4930b++;
        return true;
    }

    public void y(char c9) {
        int i = this.f4930b;
        if (i > 0 && c9 == '\"') {
            try {
                this.f4930b = i - 1;
                String strN = n();
                this.f4930b = i;
                if (kotlin.jvm.internal.l.a(strN, "null")) {
                    o(this.f4930b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f4930b = i;
                throw th;
            }
        }
        q(m.g(c9), true);
        throw null;
    }

    public /* synthetic */ a0(Object obj, Serializable serializable, Object obj2, Parcelable parcelable, int i, int i6) {
        this.f4929a = i6;
        this.f4931l = obj;
        this.f4932m = serializable;
        this.f4933n = obj2;
        this.f4934o = parcelable;
        this.f4930b = i;
    }
}
