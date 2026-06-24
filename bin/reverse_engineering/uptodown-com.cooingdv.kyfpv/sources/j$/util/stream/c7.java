package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class c7 extends f7 implements DoubleConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f6166c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    public c7(int i) {
        this.f6166c = new double[i];
    }

    @Override // j$.util.stream.f7
    public final void a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j; i++) {
            doubleConsumer.accept(this.f6166c[i]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i = this.f6198b;
        this.f6198b = i + 1;
        this.f6166c[i] = d10;
    }
}
