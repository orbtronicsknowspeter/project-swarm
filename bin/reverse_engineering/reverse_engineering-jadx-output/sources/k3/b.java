package k3;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f6963u = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] v = new String[128];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f6964w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f6965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6966b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.google.gson.a f6968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f6969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6975t;

    static {
        for (int i = 0; i <= 31; i++) {
            v[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f6964w = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f6966b = iArr;
        this.f6967l = 0;
        if (iArr.length == 0) {
            this.f6966b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f6966b;
        int i = this.f6967l;
        this.f6967l = i + 1;
        iArr2[i] = 6;
        this.f6972q = 2;
        this.f6975t = true;
        Objects.requireNonNull(writer, "out == null");
        this.f6965a = writer;
        s(com.google.gson.a.f3103d);
    }

    public void A(long j) throws IOException {
        E();
        b();
        this.f6965a.write(Long.toString(j));
    }

    public void B(Number number) throws IOException {
        if (number == null) {
            n();
            return;
        }
        E();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f6972q != 1) {
                    com.google.gson.internal.a.p("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f6963u.matcher(string).matches()) {
                androidx.privacysandbox.ads.adservices.customaudience.a.t("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        b();
        this.f6965a.append((CharSequence) string);
    }

    public void C(String str) throws IOException {
        if (str == null) {
            n();
            return;
        }
        E();
        b();
        y(str);
    }

    public void D(boolean z9) throws IOException {
        E();
        b();
        this.f6965a.write(z9 ? "true" : "false");
    }

    public final void E() throws IOException {
        if (this.f6974s != null) {
            int iR = r();
            if (iR == 5) {
                this.f6965a.write(this.f6970o);
            } else if (iR != 3) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("Nesting problem.");
                return;
            }
            j();
            this.f6966b[this.f6967l - 1] = 4;
            y(this.f6974s);
            this.f6974s = null;
        }
    }

    public final void b() throws IOException {
        int iR = r();
        if (iR == 1) {
            this.f6966b[this.f6967l - 1] = 2;
            j();
            return;
        }
        Writer writer = this.f6965a;
        if (iR == 2) {
            writer.append((CharSequence) this.f6970o);
            j();
            return;
        }
        if (iR == 4) {
            writer.append((CharSequence) this.f6969n);
            this.f6966b[this.f6967l - 1] = 5;
            return;
        }
        if (iR != 6) {
            if (iR != 7) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("Nesting problem.");
                return;
            } else if (this.f6972q != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("JSON must have only one top-level value.");
                return;
            }
        }
        this.f6966b[this.f6967l - 1] = 7;
    }

    public void c() throws IOException {
        E();
        b();
        int i = this.f6967l;
        int[] iArr = this.f6966b;
        if (i == iArr.length) {
            this.f6966b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f6966b;
        int i6 = this.f6967l;
        this.f6967l = i6 + 1;
        iArr2[i6] = 1;
        this.f6965a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6965a.close();
        int i = this.f6967l;
        if (i > 1 || (i == 1 && this.f6966b[i - 1] != 7)) {
            com.google.gson.internal.a.n("Incomplete document");
        } else {
            this.f6967l = 0;
        }
    }

    public void d() throws IOException {
        E();
        b();
        int i = this.f6967l;
        int[] iArr = this.f6966b;
        if (i == iArr.length) {
            this.f6966b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f6966b;
        int i6 = this.f6967l;
        this.f6967l = i6 + 1;
        iArr2[i6] = 3;
        this.f6965a.write(123);
    }

    public final void e(char c9, int i, int i6) throws IOException {
        int iR = r();
        if (iR != i6 && iR != i) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Nesting problem.");
            return;
        }
        if (this.f6974s != null) {
            com.google.gson.internal.a.h(this.f6974s, "Dangling name: ");
            return;
        }
        this.f6967l--;
        if (iR == i6) {
            j();
        }
        this.f6965a.write(c9);
    }

    public void f() throws IOException {
        e(']', 1, 2);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f6967l != 0) {
            this.f6965a.flush();
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("JsonWriter is closed.");
        }
    }

    public void h() throws IOException {
        e('}', 3, 5);
    }

    public void i(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6974s != null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Already wrote a name, expecting a value.");
            return;
        }
        int iR = r();
        if (iR == 3 || iR == 5) {
            this.f6974s = str;
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Please begin an object before writing a name.");
        }
    }

    public final void j() throws IOException {
        if (this.f6971p) {
            return;
        }
        String str = this.f6968m.f3104a;
        Writer writer = this.f6965a;
        writer.write(str);
        int i = this.f6967l;
        for (int i6 = 1; i6 < i; i6++) {
            writer.write(this.f6968m.f3105b);
        }
    }

    public b n() throws IOException {
        if (this.f6974s != null) {
            if (!this.f6975t) {
                this.f6974s = null;
                return this;
            }
            E();
        }
        b();
        this.f6965a.write("null");
        return this;
    }

    public final int r() {
        int i = this.f6967l;
        if (i != 0) {
            return this.f6966b[i - 1];
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("JsonWriter is closed.");
        return 0;
    }

    public final void s(com.google.gson.a aVar) {
        Objects.requireNonNull(aVar);
        this.f6968m = aVar;
        this.f6970o = ",";
        if (aVar.f3106c) {
            this.f6969n = ": ";
            if (aVar.f3104a.isEmpty()) {
                this.f6970o = ", ";
            }
        } else {
            this.f6969n = ":";
        }
        this.f6971p = this.f6968m.f3104a.isEmpty() && this.f6968m.f3105b.isEmpty();
    }

    public final void u(int i) {
        if (i == 0) {
            throw null;
        }
        this.f6972q = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f6973r
            if (r0 == 0) goto L7
            java.lang.String[] r0 = k3.b.f6964w
            goto L9
        L7:
            java.lang.String[] r0 = k3.b.v
        L9:
            java.io.Writer r1 = r8.f6965a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.y(java.lang.String):void");
    }

    public void z(double d10) throws IOException {
        E();
        if (this.f6972q == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f6965a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }
}
