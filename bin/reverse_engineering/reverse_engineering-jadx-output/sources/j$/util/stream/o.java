package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.f6306b = i;
        this.f6307c = aVar;
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f6306b) {
            case 0:
                this.f6195a.accept(((DoubleFunction) ((r) this.f6307c).f6336m).apply(d10));
                break;
            default:
                ((DoubleConsumer) ((x) this.f6307c).f6420m).accept(d10);
                this.f6195a.accept(d10);
                break;
        }
    }
}
