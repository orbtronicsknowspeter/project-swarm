package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5997k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i, int i6, ConcurrentHashMap concurrentHashMap, int i10) {
        super(lVarArr, i, i6, concurrentHashMap);
        this.f5997k = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5997k) {
            case 0:
                l lVar = this.f6010b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar.f6002b;
                this.j = lVar;
                a();
                return obj;
            default:
                l lVar2 = this.f6010b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = lVar2.f6003c;
                this.j = lVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f5997k) {
        }
        return next();
    }
}
