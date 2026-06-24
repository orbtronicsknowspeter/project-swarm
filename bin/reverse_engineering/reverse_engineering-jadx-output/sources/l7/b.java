package l7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7152a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7153b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i7.d f7155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k7.d f7156n;

    public b(k7.d dVar) {
        this.f7156n = dVar;
        int iJ = t0.f.j(0, 0, ((CharSequence) dVar.f6992b).length());
        this.f7153b = iJ;
        this.f7154l = iJ;
    }

    public final void a() {
        p6.i iVar;
        k7.d dVar = this.f7156n;
        CharSequence charSequence = (CharSequence) dVar.f6992b;
        int i = this.f7154l;
        if (i < 0) {
            this.f7152a = 0;
            this.f7155m = null;
            return;
        }
        if (i <= charSequence.length() && (iVar = (p6.i) ((d7.p) dVar.f6993c).invoke(charSequence, Integer.valueOf(this.f7154l))) != null) {
            int iIntValue = ((Number) iVar.f8441a).intValue();
            int iIntValue2 = ((Number) iVar.f8442b).intValue();
            this.f7155m = t0.f.K(this.f7153b, iIntValue);
            int i6 = iIntValue + iIntValue2;
            this.f7153b = i6;
            this.f7154l = i6 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f7155m = new i7.d(this.f7153b, m.u0(charSequence), 1);
            this.f7154l = -1;
        }
        this.f7152a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7152a == -1) {
            a();
        }
        return this.f7152a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7152a == -1) {
            a();
        }
        if (this.f7152a == 0) {
            com.google.gson.internal.a.l();
            return null;
        }
        i7.d dVar = this.f7155m;
        dVar.getClass();
        this.f7155m = null;
        this.f7152a = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
