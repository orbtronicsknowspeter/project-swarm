package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k3 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f6259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f6261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f6262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Deque f6263e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public k3(h2 h2Var) {
        this.f6259a = h2Var;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iO = this.f6259a.o();
        while (true) {
            iO--;
            if (iO < this.f6260b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f6259a.a(iO));
        }
    }

    public static h2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            h2 h2Var = (h2) arrayDeque.pollFirst();
            if (h2Var == null) {
                return null;
            }
            if (h2Var.o() != 0) {
                for (int iO = h2Var.o() - 1; iO >= 0; iO--) {
                    arrayDeque.addFirst(h2Var.a(iO));
                }
            } else if (h2Var.count() > 0) {
                return h2Var;
            }
        }
    }

    public final boolean c() {
        if (this.f6259a == null) {
            return false;
        }
        if (this.f6262d != null) {
            return true;
        }
        Spliterator spliterator = this.f6261c;
        if (spliterator == null) {
            Deque dequeB = b();
            this.f6263e = dequeB;
            h2 h2VarA = a(dequeB);
            if (h2VarA != null) {
                this.f6262d = h2VarA.spliterator();
                return true;
            }
            this.f6259a = null;
            return false;
        }
        this.f6262d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        h2 h2Var = this.f6259a;
        if (h2Var == null || this.f6262d != null) {
            return null;
        }
        Spliterator spliterator = this.f6261c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.f6260b;
        int iO = h2Var.o() - 1;
        h2 h2Var2 = this.f6259a;
        int i6 = this.f6260b;
        if (i < iO) {
            this.f6260b = i6 + 1;
            return h2Var2.a(i6).spliterator();
        }
        h2 h2VarA = h2Var2.a(i6);
        this.f6259a = h2VarA;
        int iO2 = h2VarA.o();
        h2 h2Var3 = this.f6259a;
        if (iO2 == 0) {
            Spliterator spliterator2 = h2Var3.spliterator();
            this.f6261c = spliterator2;
            return spliterator2.trySplit();
        }
        this.f6260b = 1;
        return h2Var3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f6259a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f6261c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f6260b; i < this.f6259a.o(); i++) {
            jCount += this.f6259a.a(i).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.e1 trySplit() {
        return (j$.util.e1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.y0 trySplit() {
        return (j$.util.y0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.v0 trySplit() {
        return (j$.util.v0) trySplit();
    }
}
