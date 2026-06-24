package k3;

import a4.x;
import androidx.lifecycle.l;
import e1.c0;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import k0.k;
import s1.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringReader f6950a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f6960t;
    public String[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f6962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6963x = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f6951b = new char[1024];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6952l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6953m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6954n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6955o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6956p = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6961u = 1;

    static {
        c0.f3841r = new c0(22);
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f6960t = iArr;
        iArr[0] = 6;
        this.v = new String[32];
        this.f6962w = new int[32];
        this.f6950a = stringReader;
    }

    public final long A() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f6956p = 0;
            int[] iArr = this.f6962w;
            int i = this.f6961u - 1;
            iArr[i] = iArr[i] + 1;
            return this.f6957q;
        }
        if (iE == 16) {
            this.f6959s = new String(this.f6951b, this.f6952l, this.f6958r);
            this.f6952l += this.f6958r;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw P("a long");
            }
            if (iE == 10) {
                this.f6959s = G();
            } else {
                this.f6959s = E(iE == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f6959s);
                this.f6956p = 0;
                int[] iArr2 = this.f6962w;
                int i6 = this.f6961u - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6956p = 11;
        double d10 = Double.parseDouble(this.f6959s);
        long j6 = (long) d10;
        if (j6 == d10) {
            this.f6959s = null;
            this.f6956p = 0;
            int[] iArr3 = this.f6962w;
            int i10 = this.f6961u - 1;
            iArr3[i10] = iArr3[i10] + 1;
            return j6;
        }
        throw new NumberFormatException("Expected a long but was " + this.f6959s + s());
    }

    public final String B() throws IOException {
        String strE;
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 14) {
            strE = G();
        } else if (iE == 12) {
            strE = E('\'');
        } else {
            if (iE != 13) {
                throw P("a name");
            }
            strE = E('\"');
        }
        this.f6956p = 0;
        this.v[this.f6961u - 1] = strE;
        return strE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.C(boolean):int");
    }

    public final void D() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 7) {
            throw P("null");
        }
        this.f6956p = 0;
        int[] iArr = this.f6962w;
        int i = this.f6961u - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f6952l = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f6952l = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E(char r12) throws k3.c {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f6952l
            int r3 = r11.f6953m
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f6951b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f6963x
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.O(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f6952l = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f6952l = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.J()
            r1.append(r2)
            int r2 = r11.f6952l
            int r3 = r11.f6953m
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f6954n
            int r2 = r2 + r6
            r11.f6954n = r2
            r11.f6955o = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f6952l = r2
            boolean r2 = r11.i(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.O(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.E(char):java.lang.String");
    }

    public final String F() {
        String str;
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 10) {
            str = G();
        } else if (iE == 8) {
            str = E('\'');
        } else if (iE == 9) {
            str = E('\"');
        } else if (iE == 11) {
            str = this.f6959s;
            this.f6959s = null;
        } else if (iE == 15) {
            str = Long.toString(this.f6957q);
        } else {
            if (iE != 16) {
                throw P("a string");
            }
            str = new String(this.f6951b, this.f6952l, this.f6958r);
            this.f6952l += this.f6958r;
        }
        this.f6956p = 0;
        int[] iArr = this.f6962w;
        int i = this.f6961u - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G() throws k3.c {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f6952l
            int r3 = r3 + r2
            int r4 = r6.f6953m
            char[] r5 = r6.f6951b
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.d()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.i(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.f6952l
            r0.append(r5, r3, r2)
            int r3 = r6.f6952l
            int r3 = r3 + r2
            r6.f6952l = r3
            r2 = 1
            boolean r2 = r6.i(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.f6952l
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.f6952l
            int r2 = r2 + r1
            r6.f6952l = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.G():java.lang.String");
    }

    public final int H() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void I(int i) throws c {
        int i6 = this.f6961u;
        if (i6 - 1 >= 255) {
            throw new c("Nesting limit 255 reached".concat(s()));
        }
        int[] iArr = this.f6960t;
        if (i6 == iArr.length) {
            int i10 = i6 * 2;
            this.f6960t = Arrays.copyOf(iArr, i10);
            this.f6962w = Arrays.copyOf(this.f6962w, i10);
            this.v = (String[]) Arrays.copyOf(this.v, i10);
        }
        int[] iArr2 = this.f6960t;
        int i11 = this.f6961u;
        this.f6961u = i11 + 1;
        iArr2[i11] = i;
    }

    public final char J() throws c {
        int i;
        if (this.f6952l == this.f6953m && !i(1)) {
            O("Unterminated escape sequence");
            throw null;
        }
        int i6 = this.f6952l;
        int i10 = i6 + 1;
        this.f6952l = i10;
        char[] cArr = this.f6951b;
        char c9 = cArr[i6];
        if (c9 != '\n') {
            if (c9 != '\"') {
                if (c9 != '\'') {
                    if (c9 != '/' && c9 != '\\') {
                        if (c9 == 'b') {
                            return '\b';
                        }
                        if (c9 == 'f') {
                            return '\f';
                        }
                        if (c9 == 'n') {
                            return '\n';
                        }
                        if (c9 == 'r') {
                            return '\r';
                        }
                        if (c9 == 't') {
                            return '\t';
                        }
                        if (c9 != 'u') {
                            O("Invalid escape sequence");
                            throw null;
                        }
                        if (i6 + 5 > this.f6953m && !i(4)) {
                            O("Unterminated escape sequence");
                            throw null;
                        }
                        int i11 = this.f6952l;
                        int i12 = i11 + 4;
                        int i13 = 0;
                        while (i11 < i12) {
                            char c10 = cArr[i11];
                            int i14 = i13 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    O("Malformed Unicode escape \\u".concat(new String(cArr, this.f6952l, 4)));
                                    throw null;
                                }
                                i = c10 - '7';
                            }
                            i13 = i + i14;
                            i11++;
                        }
                        this.f6952l += 4;
                        return (char) i13;
                    }
                }
            }
            return c9;
        }
        if (this.f6963x == 3) {
            O("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f6954n++;
        this.f6955o = i10;
        if (this.f6963x == 3) {
            O("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c9;
    }

    public final void K(char c9) throws c {
        do {
            int i = this.f6952l;
            int i6 = this.f6953m;
            while (i < i6) {
                int i10 = i + 1;
                char c10 = this.f6951b[i];
                if (c10 == c9) {
                    this.f6952l = i10;
                    return;
                }
                if (c10 == '\\') {
                    this.f6952l = i10;
                    J();
                    i = this.f6952l;
                    i6 = this.f6953m;
                } else {
                    if (c10 == '\n') {
                        this.f6954n++;
                        this.f6955o = i10;
                    }
                    i = i10;
                }
            }
            this.f6952l = i;
        } while (i(1));
        O("Unterminated string");
        throw null;
    }

    public final void L() {
        char c9;
        do {
            if (this.f6952l >= this.f6953m && !i(1)) {
                return;
            }
            int i = this.f6952l;
            int i6 = i + 1;
            this.f6952l = i6;
            c9 = this.f6951b[i];
            if (c9 == '\n') {
                this.f6954n++;
                this.f6955o = i6;
                return;
            }
        } while (c9 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() throws k3.c {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.f6952l
            int r1 = r1 + r0
            int r2 = r3.f6953m
            if (r1 >= r2) goto L4f
            char[] r2 = r3.f6951b
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.d()
        L49:
            int r1 = r3.f6952l
            int r1 = r1 + r0
            r3.f6952l = r1
            return
        L4f:
            r3.f6952l = r1
            r0 = 1
            boolean r0 = r3.i(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.M():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void N() throws IOException {
        int i = 0;
        do {
            int iE = this.f6956p;
            if (iE == 0) {
                iE = e();
            }
            switch (iE) {
                case 1:
                    I(3);
                    i++;
                    this.f6956p = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.v[this.f6961u - 1] = null;
                    }
                    this.f6961u--;
                    i--;
                    this.f6956p = 0;
                    break;
                case 3:
                    I(1);
                    i++;
                    this.f6956p = 0;
                    break;
                case 4:
                    this.f6961u--;
                    i--;
                    this.f6956p = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f6956p = 0;
                    break;
                case 8:
                    K('\'');
                    this.f6956p = 0;
                    break;
                case 9:
                    K('\"');
                    this.f6956p = 0;
                    break;
                case 10:
                    M();
                    this.f6956p = 0;
                    break;
                case 12:
                    K('\'');
                    if (i == 0) {
                        this.v[this.f6961u - 1] = "<skipped>";
                    }
                    this.f6956p = 0;
                    break;
                case 13:
                    K('\"');
                    if (i == 0) {
                        this.v[this.f6961u - 1] = "<skipped>";
                    }
                    this.f6956p = 0;
                    break;
                case 14:
                    M();
                    if (i == 0) {
                        this.v[this.f6961u - 1] = "<skipped>";
                    }
                    this.f6956p = 0;
                    break;
                case 16:
                    this.f6952l += this.f6958r;
                    this.f6956p = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f6962w;
        int i6 = this.f6961u - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    public final void O(String str) throws c {
        StringBuilder sbT = x.t(str);
        sbT.append(s());
        sbT.append("\nSee ");
        sbT.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(sbT.toString());
    }

    public final IllegalStateException P(String str) {
        String str2 = H() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbV = x.v("Expected ", str, " but was ");
        sbV.append(k.m(H()));
        sbV.append(s());
        sbV.append("\nSee ");
        sbV.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbV.toString());
    }

    public final void b() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 3) {
            throw P("BEGIN_ARRAY");
        }
        I(1);
        this.f6962w[this.f6961u - 1] = 0;
        this.f6956p = 0;
    }

    public final void c() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 1) {
            throw P("BEGIN_OBJECT");
        }
        I(3);
        this.f6956p = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6956p = 0;
        this.f6960t[0] = 8;
        this.f6961u = 1;
        this.f6950a.close();
    }

    public final void d() throws c {
        if (this.f6963x == 1) {
            return;
        }
        O("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a5, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0214, code lost:
    
        if (r(r12) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0217, code lost:
    
        if (r5 != 2) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0219, code lost:
    
        if (r10 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x021f, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0221, code lost:
    
        if (r17 == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0224, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0228, code lost:
    
        if (r1 != 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x022a, code lost:
    
        if (r17 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x022c, code lost:
    
        if (r17 == 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x022f, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0230, code lost:
    
        r24.f6957q = r1;
        r24.f6952l += r7;
        r9 = 15;
        r24.f6956p = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x023c, code lost:
    
        if (r5 == r13) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x023f, code lost:
    
        if (r5 == 4) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0242, code lost:
    
        if (r5 != 7) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0244, code lost:
    
        r24.f6958r = r7;
        r9 = 16;
        r24.f6956p = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.e():int");
    }

    public final void f() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 4) {
            throw P("END_ARRAY");
        }
        int i = this.f6961u;
        this.f6961u = i - 1;
        int[] iArr = this.f6962w;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f6956p = 0;
    }

    public final void h() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 2) {
            throw P("END_OBJECT");
        }
        int i = this.f6961u;
        int i6 = i - 1;
        this.f6961u = i6;
        this.v[i6] = null;
        int[] iArr = this.f6962w;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f6956p = 0;
    }

    public final boolean i(int i) throws IOException {
        int i6;
        int i10;
        int i11 = this.f6955o;
        int i12 = this.f6952l;
        this.f6955o = i11 - i12;
        int i13 = this.f6953m;
        char[] cArr = this.f6951b;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f6953m = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f6953m = 0;
        }
        this.f6952l = 0;
        do {
            int i15 = this.f6953m;
            int i16 = this.f6950a.read(cArr, i15, cArr.length - i15);
            if (i16 == -1) {
                return false;
            }
            i6 = this.f6953m + i16;
            this.f6953m = i6;
            if (this.f6954n == 0 && (i10 = this.f6955o) == 0 && i6 > 0 && cArr[0] == 65279) {
                this.f6952l++;
                this.f6955o = i10 + 1;
                i++;
            }
        } while (i6 < i);
        return true;
    }

    public final String j(boolean z9) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i6 = this.f6961u;
            if (i >= i6) {
                return sb.toString();
            }
            int i10 = this.f6960t[i];
            switch (i10) {
                case 1:
                case 2:
                    int i11 = this.f6962w[i];
                    if (z9 && i11 > 0 && i == i6 - 1) {
                        i11--;
                    }
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.v[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    o.j(l.u(i10, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public final boolean n() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4 || iE == 17) ? false : true;
    }

    public final boolean r(char c9) throws c {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public final String s() {
        return " at line " + (this.f6954n + 1) + " column " + ((this.f6952l - this.f6955o) + 1) + " path " + j(false);
    }

    public final String toString() {
        return a.class.getSimpleName().concat(s());
    }

    public final boolean u() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 5) {
            this.f6956p = 0;
            int[] iArr = this.f6962w;
            int i = this.f6961u - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iE != 6) {
            throw P("a boolean");
        }
        this.f6956p = 0;
        int[] iArr2 = this.f6962w;
        int i6 = this.f6961u - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return false;
    }

    public final double y() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f6956p = 0;
            int[] iArr = this.f6962w;
            int i = this.f6961u - 1;
            iArr[i] = iArr[i] + 1;
            return this.f6957q;
        }
        if (iE == 16) {
            this.f6959s = new String(this.f6951b, this.f6952l, this.f6958r);
            this.f6952l += this.f6958r;
        } else if (iE == 8 || iE == 9) {
            this.f6959s = E(iE == 8 ? '\'' : '\"');
        } else if (iE == 10) {
            this.f6959s = G();
        } else if (iE != 11) {
            throw P("a double");
        }
        this.f6956p = 11;
        double d10 = Double.parseDouble(this.f6959s);
        if (this.f6963x != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            O("JSON forbids NaN and infinities: " + d10);
            throw null;
        }
        this.f6959s = null;
        this.f6956p = 0;
        int[] iArr2 = this.f6962w;
        int i6 = this.f6961u - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return d10;
    }

    public final int z() throws IOException {
        int iE = this.f6956p;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            long j = this.f6957q;
            int i = (int) j;
            if (j == i) {
                this.f6956p = 0;
                int[] iArr = this.f6962w;
                int i6 = this.f6961u - 1;
                iArr[i6] = iArr[i6] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f6957q + s());
        }
        if (iE == 16) {
            this.f6959s = new String(this.f6951b, this.f6952l, this.f6958r);
            this.f6952l += this.f6958r;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw P("an int");
            }
            if (iE == 10) {
                this.f6959s = G();
            } else {
                this.f6959s = E(iE == 8 ? '\'' : '\"');
            }
            try {
                int i10 = Integer.parseInt(this.f6959s);
                this.f6956p = 0;
                int[] iArr2 = this.f6962w;
                int i11 = this.f6961u - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return i10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6956p = 11;
        double d10 = Double.parseDouble(this.f6959s);
        int i12 = (int) d10;
        if (i12 == d10) {
            this.f6959s = null;
            this.f6956p = 0;
            int[] iArr3 = this.f6962w;
            int i13 = this.f6961u - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return i12;
        }
        throw new NumberFormatException("Expected an int but was " + this.f6959s + s());
    }
}
