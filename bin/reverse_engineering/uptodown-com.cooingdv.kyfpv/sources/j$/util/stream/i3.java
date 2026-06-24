package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i3 extends k3 implements j$.util.e1 {
    @Override // j$.util.e1
    public final boolean tryAdvance(Object obj) {
        g2 g2Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.e1) this.f6262d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f6261c == null && (g2Var = (g2) k3.a(this.f6263e)) != null) {
                j$.util.e1 e1VarSpliterator = g2Var.spliterator();
                this.f6262d = e1VarSpliterator;
                return e1VarSpliterator.tryAdvance(obj);
            }
            this.f6259a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Object obj) {
        if (this.f6259a == null) {
            return;
        }
        if (this.f6262d == null) {
            Spliterator spliterator = this.f6261c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    g2 g2Var = (g2) k3.a(dequeB);
                    if (g2Var != null) {
                        g2Var.g(obj);
                    } else {
                        this.f6259a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.e1) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
