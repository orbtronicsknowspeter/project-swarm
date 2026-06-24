package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f6321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f6322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(u1 u1Var, Predicate predicate) {
        super(u1Var);
        this.f6321c = u1Var;
        this.f6322d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f6363a) {
            return;
        }
        boolean zTest = this.f6322d.test(obj);
        u1 u1Var = this.f6321c;
        if (zTest == u1Var.f6379a) {
            this.f6363a = true;
            this.f6364b = u1Var.f6380b;
        }
    }
}
