package k7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6995b = -2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f6996l;

    public e(d dVar) {
        this.f6996l = dVar;
    }

    public final void a() {
        Object objInvoke;
        int i = this.f6995b;
        d dVar = this.f6996l;
        if (i == -2) {
            objInvoke = ((d7.a) dVar.f6992b).invoke();
        } else {
            d7.l lVar = (d7.l) dVar.f6993c;
            Object obj = this.f6994a;
            obj.getClass();
            objInvoke = lVar.invoke(obj);
        }
        this.f6994a = objInvoke;
        this.f6995b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6995b < 0) {
            a();
        }
        return this.f6995b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6995b < 0) {
            a();
        }
        if (this.f6995b == 0) {
            com.google.gson.internal.a.l();
            return null;
        }
        Object obj = this.f6994a;
        obj.getClass();
        this.f6995b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
