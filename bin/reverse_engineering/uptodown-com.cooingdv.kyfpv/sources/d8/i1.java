package d8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f3658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3659b;

    @Override // d8.r0
    public final Object a() {
        return new p6.t(Arrays.copyOf(this.f3658a, this.f3659b));
    }

    @Override // d8.r0
    public final void b(int i) {
        long[] jArr = this.f3658a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f3658a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // d8.r0
    public final int d() {
        return this.f3659b;
    }
}
