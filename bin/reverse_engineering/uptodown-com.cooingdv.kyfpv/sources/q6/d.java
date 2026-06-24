package q6;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f8715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8716b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8717l;

    public d(e eVar, int i, int i6) {
        this.f8715a = eVar;
        this.f8716b = i;
        b bVar = e.Companion;
        int size = eVar.size();
        bVar.getClass();
        b.d(i, i6, size);
        this.f8717l = i6 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e.Companion.getClass();
        b.b(i, this.f8717l);
        return this.f8715a.get(this.f8716b + i);
    }

    @Override // q6.a
    public final int getSize() {
        return this.f8717l;
    }

    @Override // q6.e, java.util.List
    public final List subList(int i, int i6) {
        e.Companion.getClass();
        b.d(i, i6, this.f8717l);
        int i10 = this.f8716b;
        return new d(this.f8715a, i + i10, i10 + i6);
    }
}
