package l1;

import com.google.android.gms.internal.measurement.z3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object[] f7081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f7082s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient Object[] f7083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f7084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f7085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient int f7086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f7087q;

    static {
        Object[] objArr = new Object[0];
        f7081r = objArr;
        f7082s = new o(0, 0, 0, objArr, objArr);
    }

    public o(int i, int i6, int i10, Object[] objArr, Object[] objArr2) {
        this.f7083m = objArr;
        this.f7084n = i;
        this.f7085o = objArr2;
        this.f7086p = i6;
        this.f7087q = i10;
    }

    @Override // l1.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f7083m;
        int i = this.f7087q;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // l1.a
    public final Object[] c() {
        return this.f7083m;
    }

    @Override // l1.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7085o;
            if (objArr.length != 0) {
                int iS = z3.S(obj.hashCode());
                while (true) {
                    int i = iS & this.f7086p;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iS = i + 1;
                }
            }
        }
        return false;
    }

    @Override // l1.a
    public final int d() {
        return this.f7087q;
    }

    @Override // l1.a
    public final int e() {
        return 0;
    }

    @Override // l1.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7084n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // l1.g
    public final d l() {
        return d.g(this.f7087q, this.f7083m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7087q;
    }
}
