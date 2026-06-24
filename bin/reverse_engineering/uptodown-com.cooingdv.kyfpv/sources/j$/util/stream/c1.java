package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.f6157b = i;
        this.f6158c = aVar;
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5
    public final void accept(long j) {
        switch (this.f6157b) {
            case 0:
                this.f6215a.accept(((LongFunction) ((r) this.f6158c).f6337m).apply(j));
                break;
            default:
                ((LongConsumer) ((g1) this.f6158c).f6202m).accept(j);
                this.f6215a.accept(j);
                break;
        }
    }
}
