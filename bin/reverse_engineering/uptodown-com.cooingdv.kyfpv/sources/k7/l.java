package k7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7005b;

    public l(d dVar) {
        this.f7005b = dVar;
        this.f7004a = ((f) dVar.f6993b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7004a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((d7.l) this.f7005b.f6994c).invoke(this.f7004a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
