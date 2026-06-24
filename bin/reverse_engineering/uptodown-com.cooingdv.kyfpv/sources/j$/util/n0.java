package j$.util;

import j$.util.stream.m5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n0 implements LongConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f6099b;

    public /* synthetic */ n0(Consumer consumer, int i) {
        this.f6098a = i;
        this.f6099b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f6098a) {
            case 0:
                this.f6099b.accept(Long.valueOf(j));
                break;
            default:
                ((m5) this.f6099b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f6098a) {
        }
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }
}
