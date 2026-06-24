package l1;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f7051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f7052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f7053n;

    public c(d dVar, int i, int i6) {
        this.f7053n = dVar;
        this.f7051l = i;
        this.f7052m = i6;
    }

    @Override // l1.a
    public final Object[] c() {
        return this.f7053n.c();
    }

    @Override // l1.a
    public final int d() {
        return this.f7053n.e() + this.f7051l + this.f7052m;
    }

    @Override // l1.a
    public final int e() {
        return this.f7053n.e() + this.f7051l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a.a.n(i, this.f7052m);
        return this.f7053n.get(i + this.f7051l);
    }

    @Override // l1.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l1.d, java.util.List
    /* JADX INFO: renamed from: k */
    public final d subList(int i, int i6) {
        a.a.q(i, i6, this.f7052m);
        int i10 = this.f7051l;
        return this.f7053n.subList(i + i10, i6 + i10);
    }

    @Override // l1.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7052m;
    }

    @Override // l1.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
