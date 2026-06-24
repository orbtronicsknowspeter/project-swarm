package e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f4287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4288b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4289c = a();

    public t4(u4 u4Var) {
        this.f4287a = u4Var;
    }

    public final long a() {
        u4 u4Var = this.f4287a;
        k0.y.g(u4Var);
        long jLongValue = ((Long) f0.v.a(null)).longValue();
        long jLongValue2 = ((Long) f0.f3960w.a(null)).longValue();
        for (int i = 1; i < this.f4288b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        u4Var.f().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
