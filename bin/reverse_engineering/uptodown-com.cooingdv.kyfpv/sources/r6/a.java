package r6;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ListIterator, e7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8911b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q6.f f8914n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8910a = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8912l = -1;

    public a(c cVar, int i) {
        this.f8914n = cVar;
        this.f8911b = i;
        this.f8913m = ((AbstractList) cVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((b) this.f8914n).f8919n).modCount == this.f8913m) {
            return;
        }
        a3.b.i();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8910a) {
            case 0:
                a();
                b bVar = (b) this.f8914n;
                int i = this.f8911b;
                this.f8911b = i + 1;
                bVar.add(i, obj);
                this.f8912l = -1;
                this.f8913m = ((AbstractList) bVar).modCount;
                break;
            default:
                c();
                c cVar = (c) this.f8914n;
                int i6 = this.f8911b;
                this.f8911b = i6 + 1;
                cVar.add(i6, obj);
                this.f8912l = -1;
                this.f8913m = ((AbstractList) cVar).modCount;
                break;
        }
    }

    public void c() {
        if (((AbstractList) ((c) this.f8914n)).modCount == this.f8913m) {
            return;
        }
        a3.b.i();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8910a) {
            case 0:
                if (this.f8911b < ((b) this.f8914n).f8917l) {
                }
                break;
            default:
                if (this.f8911b < ((c) this.f8914n).f8922b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8910a) {
            case 0:
                if (this.f8911b > 0) {
                }
                break;
            default:
                if (this.f8911b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8910a) {
            case 0:
                a();
                int i = this.f8911b;
                b bVar = (b) this.f8914n;
                if (i >= bVar.f8917l) {
                    com.google.gson.internal.a.l();
                } else {
                    this.f8911b = i + 1;
                    this.f8912l = i;
                }
                break;
            default:
                c();
                int i6 = this.f8911b;
                c cVar = (c) this.f8914n;
                if (i6 >= cVar.f8922b) {
                    com.google.gson.internal.a.l();
                } else {
                    this.f8911b = i6 + 1;
                    this.f8912l = i6;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8910a) {
        }
        return this.f8911b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8910a) {
            case 0:
                a();
                int i = this.f8911b;
                if (i <= 0) {
                    com.google.gson.internal.a.l();
                } else {
                    int i6 = i - 1;
                    this.f8911b = i6;
                    this.f8912l = i6;
                    b bVar = (b) this.f8914n;
                }
                break;
            default:
                c();
                int i10 = this.f8911b;
                if (i10 <= 0) {
                    com.google.gson.internal.a.l();
                } else {
                    int i11 = i10 - 1;
                    this.f8911b = i11;
                    this.f8912l = i11;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f8910a) {
            case 0:
                i = this.f8911b;
                break;
            default:
                i = this.f8911b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8910a) {
            case 0:
                b bVar = (b) this.f8914n;
                a();
                int i = this.f8912l;
                if (i == -1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("Call next() or previous() before removing element from the iterator.");
                } else {
                    bVar.d(i);
                    this.f8911b = this.f8912l;
                    this.f8912l = -1;
                    this.f8913m = ((AbstractList) bVar).modCount;
                }
                break;
            default:
                c cVar = (c) this.f8914n;
                c();
                int i6 = this.f8912l;
                if (i6 == -1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("Call next() or previous() before removing element from the iterator.");
                } else {
                    cVar.d(i6);
                    this.f8911b = this.f8912l;
                    this.f8912l = -1;
                    this.f8913m = ((AbstractList) cVar).modCount;
                }
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8910a) {
            case 0:
                a();
                int i = this.f8912l;
                if (i == -1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((b) this.f8914n).set(i, obj);
                }
                break;
            default:
                c();
                int i6 = this.f8912l;
                if (i6 == -1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((c) this.f8914n).set(i6, obj);
                }
                break;
        }
    }

    public a(b bVar, int i) {
        this.f8914n = bVar;
        this.f8911b = i;
        this.f8913m = ((AbstractList) bVar).modCount;
    }
}
