package d8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f3712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3713b;

    @Override // d8.r0
    public final Object a() {
        return Arrays.copyOf(this.f3712a, this.f3713b);
    }

    @Override // d8.r0
    public final void b(int i) {
        float[] fArr = this.f3712a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f3712a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // d8.r0
    public final int d() {
        return this.f3713b;
    }
}
