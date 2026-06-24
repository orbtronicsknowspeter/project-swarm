package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements Iterator, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6062a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f6064c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public g1(Spliterator spliterator) {
        this.f6064c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f6062a = true;
        this.f6063b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6062a) {
            this.f6064c.tryAdvance(this);
        }
        return this.f6062a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f6062a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6062a = false;
        return this.f6063b;
    }
}
