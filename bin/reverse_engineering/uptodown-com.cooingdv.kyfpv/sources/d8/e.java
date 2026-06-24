package d8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f3634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3635b;

    @Override // d8.r0
    public final Object a() {
        return Arrays.copyOf(this.f3634a, this.f3635b);
    }

    @Override // d8.r0
    public final void b(int i) {
        boolean[] zArr = this.f3634a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f3634a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // d8.r0
    public final int d() {
        return this.f3635b;
    }
}
