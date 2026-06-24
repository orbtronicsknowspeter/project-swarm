package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.f6307b = i;
        this.f6308c = aVar;
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f6307b) {
            case 0:
                this.f6196a.accept(((DoubleFunction) ((r) this.f6308c).f6337m).apply(d10));
                break;
            default:
                ((DoubleConsumer) ((x) this.f6308c).f6421m).accept(d10);
                this.f6196a.accept(d10);
                break;
        }
    }
}
