package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends a1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6396m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(a aVar, int i, Object obj, int i6) {
        super(aVar, i);
        this.f6395l = i6;
        this.f6396m = obj;
    }

    @Override // j$.util.stream.a
    public final m5 M(int i, m5 m5Var) {
        switch (this.f6395l) {
            case 0:
                return new u0(this, m5Var, 1);
            case 1:
                return new x0(this, m5Var);
            case 2:
                return new m(this, m5Var, 4);
            default:
                return new z4(this, m5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(b1 b1Var, IntConsumer intConsumer) {
        super(b1Var, 0);
        this.f6395l = 0;
        this.f6396m = intConsumer;
    }
}
