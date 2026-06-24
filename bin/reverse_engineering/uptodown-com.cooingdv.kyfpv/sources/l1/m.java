package l1;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient Object[] f7074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f7075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f7076n;

    public m(Object[] objArr, int i, int i6) {
        this.f7074l = objArr;
        this.f7075m = i;
        this.f7076n = i6;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a.a.n(i, this.f7076n);
        Object obj = this.f7074l[(i * 2) + this.f7075m];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7076n;
    }
}
