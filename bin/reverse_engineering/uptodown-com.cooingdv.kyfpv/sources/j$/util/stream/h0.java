package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends k0 implements k5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f6210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f6211d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.k0, j$.util.stream.m5
    public final void accept(int i) {
        n(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f6255a) {
            return new j$.util.d0(((Integer) this.f6256b).intValue());
        }
        return null;
    }

    static {
        a7 a7Var = a7.INT_VALUE;
        q qVar = new q(9);
        q qVar2 = new q(10);
        j$.util.d0 d0Var = j$.util.d0.f6033c;
        f6210c = new f0(true, a7Var, d0Var, qVar, qVar2);
        f6211d = new f0(false, a7Var, d0Var, new q(9), new q(10));
    }
}
