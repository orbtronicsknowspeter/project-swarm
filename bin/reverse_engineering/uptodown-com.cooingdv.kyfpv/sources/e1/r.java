package e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4228e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f4229k;

    public r(String str, String str2, long j, long j6, long j10, long j11, long j12, Long l10, Long l11, Long l12, Boolean bool) {
        k0.y.d(str);
        k0.y.d(str2);
        k0.y.b(j >= 0);
        k0.y.b(j6 >= 0);
        k0.y.b(j10 >= 0);
        k0.y.b(j12 >= 0);
        this.f4224a = str;
        this.f4225b = str2;
        this.f4226c = j;
        this.f4227d = j6;
        this.f4228e = j10;
        this.f = j11;
        this.g = j12;
        this.h = l10;
        this.i = l11;
        this.j = l12;
        this.f4229k = bool;
    }

    public final r a(long j) {
        return new r(this.f4224a, this.f4225b, this.f4226c, this.f4227d, this.f4228e, j, this.g, this.h, this.i, this.j, this.f4229k);
    }

    public final r b(Long l10, Long l11, Boolean bool) {
        return new r(this.f4224a, this.f4225b, this.f4226c, this.f4227d, this.f4228e, this.f, this.g, this.h, l10, l11, bool);
    }
}
