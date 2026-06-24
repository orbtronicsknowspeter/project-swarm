package i7;

import q6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5700b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5702m;

    public c(int i, int i6, int i10) {
        this.f5699a = i10;
        this.f5700b = i6;
        boolean z9 = false;
        if (i10 <= 0 ? i >= i6 : i <= i6) {
            z9 = true;
        }
        this.f5701l = z9;
        this.f5702m = z9 ? i : i6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5701l;
    }

    @Override // q6.x
    public final int nextInt() {
        int i = this.f5702m;
        if (i != this.f5700b) {
            this.f5702m = this.f5699a + i;
            return i;
        }
        if (this.f5701l) {
            this.f5701l = false;
            return i;
        }
        com.google.gson.internal.a.l();
        return 0;
    }
}
