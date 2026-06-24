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
public final class c extends q6.f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f8920m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f8921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8922b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8923l;

    static {
        c cVar = new c(0);
        cVar.f8923l = true;
        f8920m = cVar;
    }

    public c(int i) {
        if (i >= 0) {
            this.f8921a = new Object[i];
        } else {
            com.google.gson.internal.a.p("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8922b;
        bVar.getClass();
        q6.b.c(i, i6);
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f8921a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8922b;
        bVar.getClass();
        q6.b.c(i, i6);
        int size = collection.size();
        g(i, collection, size);
        return size > 0;
    }

    @Override // q6.f
    public final int c() {
        return this.f8922b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.f8922b);
    }

    @Override // q6.f
    public final Object d(int i) {
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8922b;
        bVar.getClass();
        q6.b.b(i, i6);
        return m(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f8921a;
            int i = this.f8922b;
            if (i == list.size()) {
                for (int i6 = 0; i6 < i; i6++) {
                    if (l.a(objArr[i6], list.get(i6))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i, Collection collection, int i6) {
        ((AbstractList) this).modCount++;
        l(i, i6);
        Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i6; i10++) {
            this.f8921a[i + i10] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8922b;
        bVar.getClass();
        q6.b.b(i, i6);
        return this.f8921a[i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f8921a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f8921a;
        int i = this.f8922b;
        int iHashCode = 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f8922b; i++) {
            if (l.a(this.f8921a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f8922b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (this.f8923l) {
            com.google.gson.internal.a.q();
        }
    }

    public final void l(int i, int i6) {
        int i10 = this.f8922b + i6;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f8921a;
        if (i10 > objArr.length) {
            q6.b bVar = q6.e.Companion;
            int length = objArr.length;
            bVar.getClass();
            int iE = q6.b.e(length, i10);
            Object[] objArr2 = this.f8921a;
            objArr2.getClass();
            this.f8921a = Arrays.copyOf(objArr2, iE);
        }
        Object[] objArr3 = this.f8921a;
        j.W(i + i6, i, this.f8922b, objArr3, objArr3);
        this.f8922b += i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f8922b - 1; i >= 0; i--) {
            if (l.a(this.f8921a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8922b;
        bVar.getClass();
        q6.b.c(i, i6);
        return new a(this, i);
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f8921a;
        Object obj = objArr[i];
        j.W(i, i + 1, this.f8922b, objArr, objArr);
        Object[] objArr2 = this.f8921a;
        int i6 = this.f8922b - 1;
        objArr2.getClass();
        objArr2[i6] = null;
        this.f8922b--;
        return obj;
    }

    public final void n(int i, int i6) {
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f8921a;
        j.W(i, i + i6, this.f8922b, objArr, objArr);
        Object[] objArr2 = this.f8921a;
        int i10 = this.f8922b;
        t1.L(objArr2, i10 - i6, i10);
        this.f8922b -= i6;
    }

    public final int o(int i, int i6, Collection collection, boolean z9) {
        Object[] objArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr = this.f8921a;
            if (i10 >= i6) {
                break;
            }
            int i12 = i + i10;
            if (collection.contains(objArr[i12]) == z9) {
                Object[] objArr2 = this.f8921a;
                i10++;
                objArr2[i11 + i] = objArr2[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i6 - i11;
        j.W(i + i11, i6 + i, this.f8922b, objArr, objArr);
        Object[] objArr3 = this.f8921a;
        int i14 = this.f8922b;
        t1.L(objArr3, i14 - i13, i14);
        if (i13 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f8922b -= i13;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        k();
        return o(0, this.f8922b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        k();
        return o(0, this.f8922b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        q6.b bVar = q6.e.Companion;
        int i6 = this.f8922b;
        bVar.getClass();
        q6.b.b(i, i6);
        Object[] objArr = this.f8921a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i6) {
        q6.b bVar = q6.e.Companion;
        int i10 = this.f8922b;
        bVar.getClass();
        q6.b.d(i, i6, i10);
        return new b(this.f8921a, i, i6 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f8922b;
        Object[] objArr2 = this.f8921a;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        j.W(0, 0, i, objArr2, objArr);
        int i6 = this.f8922b;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return t1.g(this.f8921a, 0, this.f8922b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i = this.f8922b;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f8921a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        k();
        int size = collection.size();
        g(this.f8922b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return j.d0(this.f8921a, 0, this.f8922b);
    }
}
