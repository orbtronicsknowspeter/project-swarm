package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class x8 extends y8 implements Consumer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Predicate f6427e;
    public Object f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Spliterator spliterator, Predicate predicate, int i) {
        super(spliterator);
        this.g = i;
        this.f6427e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(Spliterator spliterator, x8 x8Var, int i) {
        super(spliterator, x8Var);
        this.g = i;
        this.f6427e = x8Var.f6427e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f6436d = (this.f6436d + 1) & 63;
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z9 = this.f6435c;
                Spliterator spliterator = this.f6433a;
                if (z9) {
                    boolean z10 = false;
                    this.f6435c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && a() && this.f6427e.test(this.f)) {
                            z10 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z10) {
                        this.f6434b.set(true);
                    }
                    consumer.accept(this.f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f6435c && a() && this.f6433a.tryAdvance(this)) {
                    zTest = this.f6427e.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f6435c = false;
                if (!zTest) {
                    this.f6434b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.y8, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (!this.f6434b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.y8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new x8(spliterator, this, 0);
            default:
                return new x8(spliterator, this, 1);
        }
    }
}
