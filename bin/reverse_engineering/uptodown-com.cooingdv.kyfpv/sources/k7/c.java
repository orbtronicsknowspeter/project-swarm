package k7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f6988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6989b = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f6991m;

    public c(d dVar) {
        this.f6991m = dVar;
        this.f6988a = new l((d) dVar.f6993b);
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f6988a;
            if (!it.hasNext()) {
                this.f6989b = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((androidx.room.f) this.f6991m.f6994c).invoke(next)).booleanValue());
        this.f6990l = next;
        this.f6989b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6989b == -1) {
            a();
        }
        return this.f6989b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6989b == -1) {
            a();
        }
        if (this.f6989b == 0) {
            com.google.gson.internal.a.l();
            return null;
        }
        Object obj = this.f6990l;
        this.f6990l = null;
        this.f6989b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
