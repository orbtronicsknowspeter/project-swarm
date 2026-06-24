package l1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient f f7072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient m f7073n;

    public l(f fVar, m mVar) {
        this.f7072m = fVar;
        this.f7073n = mVar;
    }

    @Override // l1.a
    public final int b(Object[] objArr) {
        return this.f7073n.b(objArr);
    }

    @Override // l1.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7072m.get(obj) != null;
    }

    @Override // l1.g
    public final d g() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final q iterator() {
        return this.f7073n.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((n) this.f7072m).f7080o;
    }
}
