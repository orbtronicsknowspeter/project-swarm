package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o1 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f6311b;

    public /* synthetic */ o1(u1 u1Var, int i) {
        this.f6310a = i;
        this.f6311b = u1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f6310a) {
            case 0:
                return new r1(this.f6311b);
            case 1:
                return new q1(this.f6311b);
            default:
                return new s1(this.f6311b);
        }
    }
}
