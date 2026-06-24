package h9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f5497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f5498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f5499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f5500e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f5501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f5502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f5503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f5504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f5505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f5506p;

    public d(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16) {
        this.f5496a = num;
        this.f5497b = num2;
        this.f5498c = num3;
        this.f5499d = num4;
        this.f5500e = num5;
        this.f = num6;
        this.g = num7;
        this.h = num8;
        this.i = num9;
        this.j = num10;
        this.f5501k = num11;
        this.f5502l = num12;
        this.f5503m = num13;
        this.f5504n = num14;
        this.f5505o = num15;
        this.f5506p = num16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f5496a, dVar.f5496a) && kotlin.jvm.internal.l.a(this.f5497b, dVar.f5497b) && kotlin.jvm.internal.l.a(this.f5498c, dVar.f5498c) && kotlin.jvm.internal.l.a(this.f5499d, dVar.f5499d) && kotlin.jvm.internal.l.a(this.f5500e, dVar.f5500e) && kotlin.jvm.internal.l.a(this.f, dVar.f) && kotlin.jvm.internal.l.a(this.g, dVar.g) && kotlin.jvm.internal.l.a(this.h, dVar.h) && kotlin.jvm.internal.l.a(this.i, dVar.i) && kotlin.jvm.internal.l.a(this.j, dVar.j) && kotlin.jvm.internal.l.a(this.f5501k, dVar.f5501k) && kotlin.jvm.internal.l.a(this.f5502l, dVar.f5502l) && kotlin.jvm.internal.l.a(this.f5503m, dVar.f5503m) && kotlin.jvm.internal.l.a(this.f5504n, dVar.f5504n) && kotlin.jvm.internal.l.a(this.f5505o, dVar.f5505o) && kotlin.jvm.internal.l.a(this.f5506p, dVar.f5506p);
    }

    public final int hashCode() {
        Integer num = this.f5496a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f5497b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5498c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f5499d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f5500e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.i;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.j;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f5501k;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f5502l;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f5503m;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.f5504n;
        int iHashCode14 = (iHashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.f5505o;
        int iHashCode15 = (iHashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.f5506p;
        return iHashCode15 + (num16 != null ? num16.hashCode() : 0);
    }

    public final String toString() {
        return "ChoiceStyleSheet(dividerColor=" + this.f5496a + ", tabBackgroundColor=" + this.f5497b + ", searchBarBackgroundColor=" + this.f5498c + ", searchBarForegroundColor=" + this.f5499d + ", toggleActiveColor=" + this.f5500e + ", toggleInactiveColor=" + this.f + ", globalBackgroundColor=" + this.g + ", titleTextColor=" + this.h + ", bodyTextColor=" + this.i + ", tabTextColor=" + this.j + ", menuTextColor=" + this.f5501k + ", linkTextColor=" + this.f5502l + ", buttonTextColor=" + this.f5503m + ", buttonDisabledTextColor=" + this.f5504n + ", buttonBackgroundColor=" + this.f5505o + ", buttonDisabledBackgroundColor=" + this.f5506p + ')';
    }
}
