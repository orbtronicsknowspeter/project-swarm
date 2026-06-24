package k7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6996b = -2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f6997l;

    public e(d dVar) {
        this.f6997l = dVar;
    }

    public final void a() {
        Object objInvoke;
        int i = this.f6996b;
        d dVar = this.f6997l;
        if (i == -2) {
            objInvoke = ((d7.a) dVar.f6993b).invoke();
        } else {
            d7.l lVar = (d7.l) dVar.f6994c;
            Object obj = this.f6995a;
            obj.getClass();
            objInvoke = lVar.invoke(obj);
        }
        this.f6995a = objInvoke;
        this.f6996b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6996b < 0) {
            a();
        }
        return this.f6996b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6996b < 0) {
            a();
        }
        if (this.f6996b == 0) {
            com.google.gson.internal.a.l();
            return null;
        }
        Object obj = this.f6995a;
        obj.getClass();
        this.f6996b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
