package j$.util;

import j$.util.stream.m5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f6045b;

    public /* synthetic */ f0(Consumer consumer, int i) {
        this.f6044a = i;
        this.f6045b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f6044a) {
            case 0:
                this.f6045b.accept(Double.valueOf(d10));
                break;
            default:
                ((m5) this.f6045b).accept(d10);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f6044a) {
        }
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }
}
