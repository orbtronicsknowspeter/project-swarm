package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j3 extends k3 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        h2 h2VarA;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f6262d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f6261c == null && (h2VarA = k3.a(this.f6263e)) != null) {
                Spliterator spliterator = h2VarA.spliterator();
                this.f6262d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f6259a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f6259a == null) {
            return;
        }
        if (this.f6262d == null) {
            Spliterator spliterator = this.f6261c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    h2 h2VarA = k3.a(dequeB);
                    if (h2VarA != null) {
                        h2VarA.forEach(consumer);
                    } else {
                        this.f6259a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
