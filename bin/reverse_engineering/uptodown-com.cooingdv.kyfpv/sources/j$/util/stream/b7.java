package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b7 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Supplier f6144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f6145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m5 f6146e;
    public BooleanSupplier f;
    public long g;
    public c h;
    public boolean i;

    public abstract void d();

    public abstract b7 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.c.e(this, i);
    }

    public b7(a aVar, Supplier supplier, boolean z9) {
        this.f6143b = aVar;
        this.f6144c = supplier;
        this.f6145d = null;
        this.f6142a = z9;
    }

    public b7(a aVar, Spliterator spliterator, boolean z9) {
        this.f6143b = aVar;
        this.f6144c = null;
        this.f6145d = spliterator;
        this.f6142a = z9;
    }

    public final void c() {
        if (this.f6145d == null) {
            this.f6145d = (Spliterator) this.f6144c.get();
            this.f6144c = null;
        }
    }

    public final boolean a() {
        c cVar = this.h;
        if (cVar == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.f6146e.c(this.f6145d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z9 = j < cVar.count();
        if (z9) {
            return z9;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f6142a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f6145d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.f6146e.e() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.f6146e.end();
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f6145d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (z6.SIZED.j(this.f6143b.f)) {
            return this.f6145d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.f6143b.f;
        int i6 = i & ((~i) >> 1) & z6.j & z6.f;
        return (i6 & 64) != 0 ? (i6 & (-16449)) | (this.f6145d.characteristics() & 16448) : i6;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f6145d);
    }
}
