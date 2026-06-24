package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f3705e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8.e f3706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8.i f3707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f3709d;

    public t(b8.e eVar, f8.i iVar) {
        eVar.getClass();
        this.f3706a = eVar;
        this.f3707b = iVar;
        int iE = eVar.e();
        if (iE <= 64) {
            this.f3708c = iE != 64 ? (-1) << iE : 0L;
            this.f3709d = f3705e;
            return;
        }
        this.f3708c = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.f3709d = jArr;
    }
}
