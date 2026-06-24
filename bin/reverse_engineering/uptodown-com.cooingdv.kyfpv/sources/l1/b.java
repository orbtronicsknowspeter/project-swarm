package l1;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends q implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7048b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f7050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(0);
        int size = dVar.size();
        a.a.p(i, size);
        this.f7048b = size;
        this.f7049l = i;
        this.f7050m = dVar;
    }

    public final Object a(int i) {
        return this.f7050m.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7049l < this.f7048b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7049l > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            com.google.gson.internal.a.l();
            return null;
        }
        int i = this.f7049l;
        this.f7049l = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7049l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            com.google.gson.internal.a.l();
            return null;
        }
        int i = this.f7049l - 1;
        this.f7049l = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7049l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
