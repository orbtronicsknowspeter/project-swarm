package k7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements Iterator, t6.c, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6999b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Iterator f7000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t6.c f7001m;

    @Override // k7.h
    public final void a(Object obj, v6.h hVar) {
        this.f6999b = obj;
        this.f6998a = 3;
        this.f7001m = hVar;
    }

    public final RuntimeException c() {
        int i = this.f6998a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f6998a);
    }

    @Override // t6.c
    public final t6.h getContext() {
        return t6.i.f10315a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f6998a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f7000l;
                it.getClass();
                if (it.hasNext()) {
                    this.f6998a = 2;
                    return true;
                }
                this.f7000l = null;
            }
            this.f6998a = 5;
            t6.c cVar = this.f7001m;
            cVar.getClass();
            this.f7001m = null;
            cVar.resumeWith(x.f8464a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6998a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            com.google.gson.internal.a.l();
            return null;
        }
        if (i == 2) {
            this.f6998a = 1;
            Iterator it = this.f7000l;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.f6998a = 0;
        Object obj = this.f6999b;
        this.f6999b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // t6.c
    public final void resumeWith(Object obj) {
        p6.a.e(obj);
        this.f6998a = 4;
    }
}
