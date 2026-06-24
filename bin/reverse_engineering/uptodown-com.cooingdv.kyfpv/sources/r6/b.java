package r6;

import b2.t1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import q6.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends q6.f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f8915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8916b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f8918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f8919n;

    public b(Object[] objArr, int i, int i6, b bVar, c cVar) {
        objArr.getClass();
        cVar.getClass();
        this.f8915a = objArr;
        this.f8916b = i;
        this.f8917l = i6;
        this.f8918m = bVar;
        this.f8919n = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8917l;
        bVar.getClass();
        q6.b.c(i, i6);
        h(this.f8916b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        l();
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8917l;
        bVar.getClass();
        q6.b.c(i, i6);
        int size = collection.size();
        g(this.f8916b + i, collection, size);
        return size > 0;
    }

    @Override // q6.f
    public final int c() {
        k();
        return this.f8917l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.f8916b, this.f8917l);
    }

    @Override // q6.f
    public final Object d(int i) {
        l();
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8917l;
        bVar.getClass();
        q6.b.b(i, i6);
        return m(this.f8916b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f8915a;
            int i = this.f8917l;
            if (i == list.size()) {
                for (int i6 = 0; i6 < i; i6++) {
                    if (l.a(objArr[this.f8916b + i6], list.get(i6))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i, Collection collection, int i6) {
        ((AbstractList) this).modCount++;
        c cVar = this.f8919n;
        b bVar = this.f8918m;
        if (bVar != null) {
            bVar.g(i, collection, i6);
        } else {
            c cVar2 = c.f8920m;
            cVar.g(i, collection, i6);
        }
        this.f8915a = cVar.f8921a;
        this.f8917l += i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8917l;
        bVar.getClass();
        q6.b.b(i, i6);
        return this.f8915a[this.f8916b + i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f8919n;
        b bVar = this.f8918m;
        if (bVar != null) {
            bVar.h(i, obj);
        } else {
            c cVar2 = c.f8920m;
            cVar.h(i, obj);
        }
        this.f8915a = cVar.f8921a;
        this.f8917l++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.f8915a;
        int i = this.f8917l;
        int iHashCode = 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[this.f8916b + i6];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.f8917l; i++) {
            if (l.a(this.f8915a[this.f8916b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.f8917l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (((AbstractList) this.f8919n).modCount == ((AbstractList) this).modCount) {
            return;
        }
        a3.b.i();
    }

    public final void l() {
        if (this.f8919n.f8923l) {
            com.google.gson.internal.a.q();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.f8917l - 1; i >= 0; i--) {
            if (l.a(this.f8915a[this.f8916b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8917l;
        bVar.getClass();
        q6.b.c(i, i6);
        return new a(this, i);
    }

    public final Object m(int i) {
        Object objM;
        ((AbstractList) this).modCount++;
        b bVar = this.f8918m;
        if (bVar != null) {
            objM = bVar.m(i);
        } else {
            c cVar = c.f8920m;
            objM = this.f8919n.m(i);
        }
        this.f8917l--;
        return objM;
    }

    public final void n(int i, int i6) {
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f8918m;
        if (bVar != null) {
            bVar.n(i, i6);
        } else {
            c cVar = c.f8920m;
            this.f8919n.n(i, i6);
        }
        this.f8917l -= i6;
    }

    public final int o(int i, int i6, Collection collection, boolean z9) {
        int iO;
        b bVar = this.f8918m;
        if (bVar != null) {
            iO = bVar.o(i, i6, collection, z9);
        } else {
            c cVar = c.f8920m;
            iO = this.f8919n.o(i, i6, collection, z9);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f8917l -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        l();
        k();
        return o(this.f8916b, this.f8917l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        l();
        k();
        return o(this.f8916b, this.f8917l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8917l;
        bVar.getClass();
        q6.b.b(i, i6);
        Object[] objArr = this.f8915a;
        int i10 = this.f8916b + i;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i6) {
        q6.b bVar = q6.e.Companion;
        int i10 = this.f8917l;
        bVar.getClass();
        q6.b.d(i, i6, i10);
        return new b(this.f8915a, this.f8916b + i, i6 - i, this, this.f8919n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        k();
        int length = objArr.length;
        int i = this.f8917l;
        Object[] objArr2 = this.f8915a;
        int i6 = this.f8916b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i6, i + i6, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        j.W(0, i6, i + i6, objArr2, objArr);
        int i10 = this.f8917l;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return t1.g(this.f8915a, this.f8916b, this.f8917l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        h(this.f8916b + this.f8917l, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        l();
        k();
        int size = collection.size();
        g(this.f8916b + this.f8917l, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f8915a;
        int i = this.f8917l;
        int i6 = this.f8916b;
        return j.d0(objArr, i6, i + i6);
    }
}
