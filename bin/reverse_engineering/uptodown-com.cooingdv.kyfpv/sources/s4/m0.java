package s4;

import androidx.browser.trusted.sharing.ShareTarget;
import e1.v4;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v4 f9244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(v4 v4Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f9243a = i;
        this.f9244b = v4Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9243a) {
            case 0:
                return new m0(this.f9244b, cVar, 0);
            default:
                return new m0(this.f9244b, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9243a) {
        }
        return ((m0) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        switch (this.f9243a) {
            case 0:
                p6.a.e(obj);
                j5.v vVar = new j5.v(this.f9244b.f4333b);
                g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat("/eapi/my-recommended-list/private"), null, ShareTarget.METHOD_POST, false);
                g2VarK.f11207d = vVar.i(g2VarK, "/eapi/my-recommended-list/private");
                return new p6.k((g2VarK.b() || (str = g2VarK.f11204a) == null || str.length() == 0) ? Boolean.TRUE : Boolean.FALSE);
            default:
                p6.a.e(obj);
                j5.v vVar2 = new j5.v(this.f9244b.f4333b);
                g2 g2VarK2 = vVar2.k("https://www.uptodown.app:443".concat("/eapi/my-recommended-list/public"), null, ShareTarget.METHOD_POST, false);
                g2VarK2.f11207d = vVar2.i(g2VarK2, "/eapi/my-recommended-list/public");
                return new p6.k((g2VarK2.b() || (str2 = g2VarK2.f11204a) == null || str2.length() == 0) ? Boolean.FALSE : Boolean.TRUE);
        }
    }
}
