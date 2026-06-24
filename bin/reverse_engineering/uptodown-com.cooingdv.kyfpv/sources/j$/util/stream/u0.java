package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.f6376b = i;
        this.f6377c = aVar;
    }

    @Override // j$.util.stream.k5, j$.util.stream.m5
    public final void accept(int i) {
        switch (this.f6376b) {
            case 0:
                this.f6206a.accept(((IntFunction) ((r) this.f6377c).f6337m).apply(i));
                break;
            default:
                ((IntConsumer) ((v0) this.f6377c).f6396m).accept(i);
                this.f6206a.accept(i);
                break;
        }
    }
}
