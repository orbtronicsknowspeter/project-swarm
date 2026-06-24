package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u6 implements j$.util.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6387e;
    public final /* synthetic */ v6 f;

    public abstract void a(int i, Object obj, Object obj2);

    public abstract j$.util.e1 b(Object obj, int i, int i6);

    public abstract j$.util.e1 c(int i, int i6, int i10, int i11);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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

    public u6(v6 v6Var, int i, int i6, int i10, int i11) {
        this.f = v6Var;
        this.f6383a = i;
        this.f6384b = i6;
        this.f6385c = i10;
        this.f6386d = i11;
        Object[] objArr = v6Var.f;
        this.f6387e = objArr == null ? v6Var.f6402e : objArr[i];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f6383a;
        int i6 = this.f6386d;
        int i10 = this.f6384b;
        if (i == i10) {
            return ((long) i6) - ((long) this.f6385c);
        }
        long[] jArr = this.f.f6155d;
        return ((jArr[i10] + ((long) i6)) - jArr[i]) - ((long) this.f6385c);
    }

    @Override // j$.util.e1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.f6383a;
        int i6 = this.f6384b;
        if (i >= i6 && (i != i6 || this.f6385c >= this.f6386d)) {
            return false;
        }
        Object obj2 = this.f6387e;
        int i10 = this.f6385c;
        this.f6385c = i10 + 1;
        a(i10, obj2, obj);
        int i11 = this.f6385c;
        Object obj3 = this.f6387e;
        v6 v6Var = this.f;
        if (i11 == v6Var.q(obj3)) {
            this.f6385c = 0;
            int i12 = this.f6383a + 1;
            this.f6383a = i12;
            Object[] objArr = v6Var.f;
            if (objArr != null && i12 <= i6) {
                this.f6387e = objArr[i12];
            }
        }
        return true;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Object obj) {
        v6 v6Var;
        Objects.requireNonNull(obj);
        int i = this.f6383a;
        int i6 = this.f6386d;
        int i10 = this.f6384b;
        if (i < i10 || (i == i10 && this.f6385c < i6)) {
            int i11 = this.f6385c;
            while (true) {
                v6Var = this.f;
                if (i >= i10) {
                    break;
                }
                Object obj2 = v6Var.f[i];
                v6Var.p(obj2, i11, v6Var.q(obj2), obj);
                i++;
                i11 = 0;
            }
            v6Var.p(this.f6383a == i10 ? this.f6387e : v6Var.f[i10], i11, i6, obj);
            this.f6383a = i10;
            this.f6385c = i6;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.e1 trySplit() {
        int i = this.f6383a;
        int i6 = this.f6384b;
        if (i < i6) {
            int i10 = i6 - 1;
            int i11 = this.f6385c;
            v6 v6Var = this.f;
            j$.util.e1 e1VarC = c(i, i10, i11, v6Var.q(v6Var.f[i10]));
            this.f6383a = i6;
            this.f6385c = 0;
            this.f6387e = v6Var.f[i6];
            return e1VarC;
        }
        if (i != i6) {
            return null;
        }
        int i12 = this.f6385c;
        int i13 = (this.f6386d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        j$.util.e1 e1VarB = b(this.f6387e, i12, i13);
        this.f6385c += i13;
        return e1VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.e1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.y0 trySplit() {
        return (j$.util.y0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.e1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b1 trySplit() {
        return (j$.util.b1) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.e1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.v0 trySplit() {
        return (j$.util.v0) trySplit();
    }
}
