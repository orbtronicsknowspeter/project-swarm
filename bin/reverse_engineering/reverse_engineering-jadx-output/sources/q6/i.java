package q6;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object[] f8719m = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f8721b = f8719m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8722l;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        b bVar = e.Companion;
        int i6 = this.f8722l;
        bVar.getClass();
        b.c(i, i6);
        if (i == this.f8722l) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        n();
        g(this.f8722l + 1);
        int iM = m(this.f8720a + i);
        int i10 = this.f8722l;
        if (i < ((i10 + 1) >> 1)) {
            if (iM == 0) {
                Object[] objArr = this.f8721b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM - 1;
            }
            int length2 = this.f8720a;
            if (length2 == 0) {
                Object[] objArr2 = this.f8721b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i11 = length2 - 1;
            int i12 = this.f8720a;
            Object[] objArr3 = this.f8721b;
            if (length >= i12) {
                objArr3[i11] = objArr3[i12];
                j.W(i12, i12 + 1, length + 1, objArr3, objArr3);
            } else {
                j.W(i12 - 1, i12, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.f8721b;
                objArr4[objArr4.length - 1] = objArr4[0];
                j.W(0, 1, length + 1, objArr4, objArr4);
            }
            this.f8721b[length] = obj;
            this.f8720a = i11;
        } else {
            int iM2 = m(i10 + this.f8720a);
            Object[] objArr5 = this.f8721b;
            if (iM < iM2) {
                j.W(iM + 1, iM, iM2, objArr5, objArr5);
            } else {
                j.W(1, 0, iM2, objArr5, objArr5);
                Object[] objArr6 = this.f8721b;
                objArr6[0] = objArr6[objArr6.length - 1];
                j.W(iM + 1, iM, objArr6.length - 1, objArr6, objArr6);
            }
            this.f8721b[iM] = obj;
        }
        this.f8722l++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        b bVar = e.Companion;
        int i6 = this.f8722l;
        bVar.getClass();
        b.c(i, i6);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f8722l) {
            return addAll(collection);
        }
        n();
        g(collection.size() + this.f8722l);
        int iM = m(this.f8722l + this.f8720a);
        int iM2 = m(this.f8720a + i);
        int size = collection.size();
        if (i >= ((this.f8722l + 1) >> 1)) {
            int i10 = iM2 + size;
            Object[] objArr = this.f8721b;
            if (iM2 < iM) {
                int i11 = size + iM;
                if (i11 <= objArr.length) {
                    j.W(i10, iM2, iM, objArr, objArr);
                } else if (i10 >= objArr.length) {
                    j.W(i10 - objArr.length, iM2, iM, objArr, objArr);
                } else {
                    int length = iM - (i11 - objArr.length);
                    j.W(0, length, iM, objArr, objArr);
                    Object[] objArr2 = this.f8721b;
                    j.W(i10, iM2, length, objArr2, objArr2);
                }
            } else {
                j.W(size, 0, iM, objArr, objArr);
                Object[] objArr3 = this.f8721b;
                if (i10 >= objArr3.length) {
                    j.W(i10 - objArr3.length, iM2, objArr3.length, objArr3, objArr3);
                } else {
                    j.W(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f8721b;
                    j.W(i10, iM2, objArr4.length - size, objArr4, objArr4);
                }
            }
            e(iM2, collection);
            return true;
        }
        int i12 = this.f8720a;
        int length2 = i12 - size;
        Object[] objArr5 = this.f8721b;
        if (iM2 < i12) {
            j.W(length2, i12, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f8721b;
            if (size >= iM2) {
                j.W(objArr6.length - size, 0, iM2, objArr6, objArr6);
            } else {
                j.W(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f8721b;
                j.W(0, size, iM2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            j.W(length2, i12, iM2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i13 = iM2 - i12;
            int length3 = objArr5.length - length2;
            if (length3 >= i13) {
                j.W(length2, i12, iM2, objArr5, objArr5);
            } else {
                j.W(length2, i12, i12 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f8721b;
                j.W(0, this.f8720a + length3, iM2, objArr8, objArr8);
            }
        }
        this.f8720a = length2;
        e(k(iM2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        g(this.f8722l + 1);
        int length = this.f8720a;
        if (length == 0) {
            Object[] objArr = this.f8721b;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f8720a = i;
        this.f8721b[i] = obj;
        this.f8722l++;
    }

    public final void addLast(Object obj) {
        n();
        g(c() + 1);
        this.f8721b[m(c() + this.f8720a)] = obj;
        this.f8722l = c() + 1;
    }

    @Override // q6.f
    public final int c() {
        return this.f8722l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f8720a, m(c() + this.f8720a));
        }
        this.f8720a = 0;
        this.f8722l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // q6.f
    public final Object d(int i) {
        b bVar = e.Companion;
        int i6 = this.f8722l;
        bVar.getClass();
        b.b(i, i6);
        if (i == c() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        n();
        int iM = m(this.f8720a + i);
        Object[] objArr = this.f8721b;
        Object obj = objArr[iM];
        int i10 = this.f8722l >> 1;
        int i11 = this.f8720a;
        if (i < i10) {
            if (iM >= i11) {
                j.W(i11 + 1, i11, iM, objArr, objArr);
            } else {
                j.W(1, 0, iM, objArr, objArr);
                Object[] objArr2 = this.f8721b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f8720a;
                j.W(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f8721b;
            int i13 = this.f8720a;
            objArr3[i13] = null;
            this.f8720a = h(i13);
        } else {
            int iM2 = m((c() - 1) + i11);
            Object[] objArr4 = this.f8721b;
            if (iM <= iM2) {
                j.W(iM, iM + 1, iM2 + 1, objArr4, objArr4);
            } else {
                j.W(iM, iM + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f8721b;
                objArr5[objArr5.length - 1] = objArr5[0];
                j.W(0, 1, iM2 + 1, objArr5, objArr5);
            }
            this.f8721b[iM2] = null;
        }
        this.f8722l--;
        return obj;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f8721b.length;
        while (i < length && it.hasNext()) {
            this.f8721b[i] = it.next();
            i++;
        }
        int i6 = this.f8720a;
        for (int i10 = 0; i10 < i6 && it.hasNext(); i10++) {
            this.f8721b[i10] = it.next();
        }
        this.f8722l = collection.size() + this.f8722l;
    }

    public final void g(int i) {
        if (i < 0) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Deque is too big.");
            return;
        }
        Object[] objArr = this.f8721b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f8719m) {
            if (i < 10) {
                i = 10;
            }
            this.f8721b = new Object[i];
            return;
        }
        b bVar = e.Companion;
        int length = objArr.length;
        bVar.getClass();
        Object[] objArr2 = new Object[b.e(length, i)];
        Object[] objArr3 = this.f8721b;
        j.W(0, this.f8720a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f8721b;
        int length2 = objArr4.length;
        int i6 = this.f8720a;
        j.W(length2 - i6, 0, i6, objArr4, objArr2);
        this.f8720a = 0;
        this.f8721b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b bVar = e.Companion;
        int i6 = this.f8722l;
        bVar.getClass();
        b.b(i, i6);
        return this.f8721b[m(this.f8720a + i)];
    }

    public final int h(int i) {
        this.f8721b.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM = m(c() + this.f8720a);
        int length = this.f8720a;
        if (length < iM) {
            while (length < iM) {
                if (kotlin.jvm.internal.l.a(obj, this.f8721b[length])) {
                    i = this.f8720a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM) {
            return -1;
        }
        int length2 = this.f8721b.length;
        while (true) {
            if (length >= length2) {
                for (int i6 = 0; i6 < iM; i6++) {
                    if (kotlin.jvm.internal.l.a(obj, this.f8721b[i6])) {
                        length = i6 + this.f8721b.length;
                        i = this.f8720a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l.a(obj, this.f8721b[length])) {
                i = this.f8720a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final int k(int i) {
        return i < 0 ? i + this.f8721b.length : i;
    }

    public final void l(int i, int i6) {
        Object[] objArr = this.f8721b;
        if (i < i6) {
            j.e0(null, objArr, i, i6);
        } else {
            j.e0(null, objArr, i, objArr.length);
            j.e0(null, this.f8721b, 0, i6);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM = m(this.f8722l + this.f8720a);
        int i6 = this.f8720a;
        if (i6 < iM) {
            length = iM - 1;
            if (i6 <= length) {
                while (!kotlin.jvm.internal.l.a(obj, this.f8721b[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i = this.f8720a;
                return length - i;
            }
            return -1;
        }
        if (i6 > iM) {
            while (true) {
                iM--;
                Object[] objArr = this.f8721b;
                if (-1 >= iM) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i10 = this.f8720a;
                    if (i10 <= length) {
                        while (!kotlin.jvm.internal.l.a(obj, this.f8721b[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i = this.f8720a;
                    }
                } else if (kotlin.jvm.internal.l.a(obj, objArr[iM])) {
                    length = iM + this.f8721b.length;
                    i = this.f8720a;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int m(int i) {
        Object[] objArr = this.f8721b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM;
        Object[] objArr;
        collection.getClass();
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f8721b.length != 0) {
            int iM2 = m(c() + this.f8720a);
            int i = this.f8720a;
            if (i < iM2) {
                iM = i;
                while (true) {
                    objArr = this.f8721b;
                    if (i >= iM2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z9 = true;
                    } else {
                        this.f8721b[iM] = obj;
                        iM++;
                    }
                    i++;
                }
                j.e0(null, objArr, iM, iM2);
            } else {
                int length = this.f8721b.length;
                boolean z10 = false;
                int i6 = i;
                while (i < length) {
                    Object[] objArr2 = this.f8721b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f8721b[i6] = obj2;
                        i6++;
                    }
                    i++;
                }
                iM = m(i6);
                for (int i10 = 0; i10 < iM2; i10++) {
                    Object[] objArr3 = this.f8721b;
                    Object obj3 = objArr3[i10];
                    objArr3[i10] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f8721b[iM] = obj3;
                        iM = h(iM);
                    }
                }
                z9 = z10;
            }
            if (z9) {
                n();
                this.f8722l = k(iM - this.f8720a);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            androidx.privacysandbox.ads.adservices.customaudience.a.s("ArrayDeque is empty.");
            return null;
        }
        n();
        Object[] objArr = this.f8721b;
        int i = this.f8720a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f8720a = h(i);
        this.f8722l = c() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            androidx.privacysandbox.ads.adservices.customaudience.a.s("ArrayDeque is empty.");
            return null;
        }
        n();
        int iM = m((size() - 1) + this.f8720a);
        Object[] objArr = this.f8721b;
        Object obj = objArr[iM];
        objArr[iM] = null;
        this.f8722l = c() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i6) {
        b bVar = e.Companion;
        int i10 = this.f8722l;
        bVar.getClass();
        b.d(i, i6, i10);
        int i11 = i6 - i;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f8722l) {
            clear();
            return;
        }
        if (i11 == 1) {
            d(i);
            return;
        }
        n();
        int i12 = this.f8722l - i6;
        int i13 = this.f8720a;
        if (i < i12) {
            int iM = m((i - 1) + i13);
            int iM2 = m(this.f8720a + (i6 - 1));
            while (i > 0) {
                int i14 = iM + 1;
                int iMin = Math.min(i, Math.min(i14, iM2 + 1));
                Object[] objArr = this.f8721b;
                int i15 = iM2 - iMin;
                int i16 = iM - iMin;
                j.W(i15 + 1, i16 + 1, i14, objArr, objArr);
                iM = k(i16);
                iM2 = k(i15);
                i -= iMin;
            }
            int iM3 = m(this.f8720a + i11);
            l(this.f8720a, iM3);
            this.f8720a = iM3;
        } else {
            int iM4 = m(i13 + i6);
            int iM5 = m(this.f8720a + i);
            int i17 = this.f8722l;
            while (true) {
                i17 -= i6;
                if (i17 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f8721b;
                i6 = Math.min(i17, Math.min(objArr2.length - iM4, objArr2.length - iM5));
                Object[] objArr3 = this.f8721b;
                int i18 = iM4 + i6;
                j.W(iM5, iM4, i18, objArr3, objArr3);
                iM4 = m(i18);
                iM5 = m(iM5 + i6);
            }
            int iM6 = m(this.f8722l + this.f8720a);
            l(k(iM6 - i11), iM6);
        }
        this.f8722l -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM;
        Object[] objArr;
        collection.getClass();
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f8721b.length != 0) {
            int iM2 = m(c() + this.f8720a);
            int i = this.f8720a;
            if (i < iM2) {
                iM = i;
                while (true) {
                    objArr = this.f8721b;
                    if (i >= iM2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f8721b[iM] = obj;
                        iM++;
                    } else {
                        z9 = true;
                    }
                    i++;
                }
                j.e0(null, objArr, iM, iM2);
            } else {
                int length = this.f8721b.length;
                boolean z10 = false;
                int i6 = i;
                while (i < length) {
                    Object[] objArr2 = this.f8721b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f8721b[i6] = obj2;
                        i6++;
                    } else {
                        z10 = true;
                    }
                    i++;
                }
                iM = m(i6);
                for (int i10 = 0; i10 < iM2; i10++) {
                    Object[] objArr3 = this.f8721b;
                    Object obj3 = objArr3[i10];
                    objArr3[i10] = null;
                    if (collection.contains(obj3)) {
                        this.f8721b[iM] = obj3;
                        iM = h(iM);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                n();
                this.f8722l = k(iM - this.f8720a);
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b bVar = e.Companion;
        int i6 = this.f8722l;
        bVar.getClass();
        b.b(i, i6);
        int iM = m(this.f8720a + i);
        Object[] objArr = this.f8721b;
        Object obj2 = objArr[iM];
        objArr[iM] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f8722l;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        Object[] objArr2 = objArr;
        int iM = m(this.f8722l + this.f8720a);
        int i6 = this.f8720a;
        if (i6 < iM) {
            j.c0(this.f8721b, objArr2, 0, i6, iM, 2);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f8721b;
            j.W(0, this.f8720a, objArr3.length, objArr3, objArr2);
            Object[] objArr4 = this.f8721b;
            j.W(objArr4.length - this.f8720a, 0, iM, objArr4, objArr2);
        }
        int i10 = this.f8722l;
        if (i10 < objArr2.length) {
            objArr2[i10] = null;
        }
        return objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        g(collection.size() + c());
        e(m(c() + this.f8720a), collection);
        return true;
    }
}
