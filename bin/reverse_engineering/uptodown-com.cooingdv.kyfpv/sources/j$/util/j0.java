package j$.util;

import j$.util.stream.m5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j0 implements IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f6081b;

    public /* synthetic */ j0(Consumer consumer, int i) {
        this.f6080a = i;
        this.f6081b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.f6080a) {
            case 0:
                this.f6081b.accept(Integer.valueOf(i));
                break;
            default:
                ((m5) this.f6081b).accept(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f6080a) {
        }
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }
}
