package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6095a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f6096b;

    public m(n nVar) {
        this.f6096b = nVar.f6097a.iterator();
    }

    public m(t tVar) {
        this.f6096b = tVar.f6097a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6095a) {
        }
        return this.f6096b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6095a) {
            case 0:
                return this.f6096b.next();
            default:
                return new r((Map.Entry) this.f6096b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6095a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f6095a) {
            case 0:
                c.r(this.f6096b, consumer);
                break;
            default:
                c.r(this.f6096b, new q(0, consumer));
                break;
        }
    }
}
