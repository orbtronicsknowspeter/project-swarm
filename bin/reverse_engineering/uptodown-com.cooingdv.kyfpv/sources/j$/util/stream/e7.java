package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class e7 extends f7 implements LongConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f6185c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    public e7(int i) {
        this.f6185c = new long[i];
    }

    @Override // j$.util.stream.f7
    public final void a(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.f6185c[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.f6198b;
        this.f6198b = i + 1;
        this.f6185c[i] = j;
    }
}
