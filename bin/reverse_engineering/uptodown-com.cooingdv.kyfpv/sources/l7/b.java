package l7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7153a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7154b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i7.d f7156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k7.d f7157n;

    public b(k7.d dVar) {
        this.f7157n = dVar;
        int iJ = t0.f.j(0, 0, ((CharSequence) dVar.f6993b).length());
        this.f7154b = iJ;
        this.f7155l = iJ;
    }

    public final void a() {
        p6.i iVar;
        k7.d dVar = this.f7157n;
        CharSequence charSequence = (CharSequence) dVar.f6993b;
        int i = this.f7155l;
        if (i < 0) {
            this.f7153a = 0;
            this.f7156m = null;
            return;
        }
        if (i <= charSequence.length() && (iVar = (p6.i) ((d7.p) dVar.f6994c).invoke(charSequence, Integer.valueOf(this.f7155l))) != null) {
            int iIntValue = ((Number) iVar.f8442a).intValue();
            int iIntValue2 = ((Number) iVar.f8443b).intValue();
            this.f7156m = t0.f.K(this.f7154b, iIntValue);
            int i6 = iIntValue + iIntValue2;
            this.f7154b = i6;
            this.f7155l = i6 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f7156m = new i7.d(this.f7154b, m.u0(charSequence), 1);
            this.f7155l = -1;
        }
        this.f7153a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7153a == -1) {
            a();
        }
        return this.f7153a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7153a == -1) {
            a();
        }
        if (this.f7153a == 0) {
            com.google.gson.internal.a.l();
            return null;
        }
        i7.d dVar = this.f7156m;
        dVar.getClass();
        this.f7156m = null;
        this.f7153a = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
