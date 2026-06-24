package m8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f7771k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f7772l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f7773m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7778e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public p(String str, String str2, long j6, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f7774a = str;
        this.f7775b = str2;
        this.f7776c = j6;
        this.f7777d = str3;
        this.f7778e = str4;
        this.f = z9;
        this.g = z10;
        this.i = z11;
        this.h = z12;
    }

    public static int a(String str, int i, int i6, boolean z9) {
        while (i < i6) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z9)) {
                return i;
            }
            i++;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.p.b(int, java.lang.String):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f7774a.equals(this.f7774a) && pVar.f7775b.equals(this.f7775b) && pVar.f7777d.equals(this.f7777d) && pVar.f7778e.equals(this.f7778e) && pVar.f7776c == this.f7776c && pVar.f == this.f && pVar.g == this.g && pVar.h == this.h && pVar.i == this.i;
    }

    public final int hashCode() {
        int iO = androidx.lifecycle.l.o(androidx.lifecycle.l.o(androidx.lifecycle.l.o(androidx.lifecycle.l.o(527, 31, this.f7774a), 31, this.f7775b), 31, this.f7777d), 31, this.f7778e);
        long j6 = this.f7776c;
        return ((((((((iO + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7774a);
        sb.append('=');
        sb.append(this.f7775b);
        if (this.h) {
            long j6 = this.f7776c;
            if (j6 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) q8.b.f8782a.get()).format(new Date(j6)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f7777d);
        }
        sb.append("; path=");
        sb.append(this.f7778e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
