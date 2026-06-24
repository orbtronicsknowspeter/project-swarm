package e1;

import androidx.collection.LruCache;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends LruCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f4054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var) {
        super(20);
        this.f4054a = m1Var;
    }

    @Override // androidx.collection.LruCache
    public final Object create(Object obj) throws Throwable {
        String str = (String) obj;
        k0.y.d(str);
        m1 m1Var = this.f4054a;
        m1Var.h();
        k0.y.d(str);
        m mVar = m1Var.f4093b.f4308l;
        u4.U(mVar);
        b5.m mVarM0 = mVar.m0(str);
        if (mVarM0 == null) {
            return null;
        }
        w0 w0Var = m1Var.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4347w.c(str, "Populate EES config from database on cache miss. appId");
        m1Var.o(str, m1Var.p(str, (byte[]) mVarM0.f1061b));
        return (com.google.android.gms.internal.measurement.e0) m1Var.f4112s.snapshot().get(str);
    }
}
