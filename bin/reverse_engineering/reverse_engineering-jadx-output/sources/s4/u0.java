package s4;

import androidx.browser.trusted.sharing.ShareTarget;
import e1.v4;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v4 f9301b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f9302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v4 v4Var, long j, t6.c cVar, int i) {
        super(2, cVar);
        this.f9300a = i;
        this.f9301b = v4Var;
        this.f9302l = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9300a) {
            case 0:
                return new u0(this.f9301b, this.f9302l, cVar, 0);
            default:
                return new u0(this.f9301b, this.f9302l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9300a) {
        }
        return ((u0) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        JSONObject jSONObject;
        Object obj3;
        JSONObject jSONObject2;
        switch (this.f9300a) {
            case 0:
                p6.a.e(obj);
                j5.v vVar = new j5.v(this.f9301b.f4332b);
                g2 g2VarK = vVar.k(k0.k.g(this.f9302l, "https://www.uptodown.app:443/eapi/app/", "/wishlist/add"), null, ShareTarget.METHOD_POST, false);
                g2VarK.f11206d = vVar.i(g2VarK, "/eapi/app/appID/wishlist/add");
                if (!g2VarK.b() && (jSONObject = g2VarK.f11206d) != null && jSONObject.optInt("success") == 1) {
                    obj2 = Boolean.TRUE;
                    return new p6.k(obj2);
                }
                p6.j jVar = new p6.j(new Exception());
                obj2 = jVar;
                return new p6.k(obj2);
            default:
                p6.a.e(obj);
                j5.v vVar2 = new j5.v(this.f9301b.f4332b);
                g2 g2VarK2 = vVar2.k(k0.k.g(this.f9302l, "https://www.uptodown.app:443/eapi/app/", "/wishlist/delete"), null, ShareTarget.METHOD_POST, false);
                g2VarK2.f11206d = vVar2.i(g2VarK2, "/eapi/app/appID/wishlist/delete");
                if (!g2VarK2.b() && (jSONObject2 = g2VarK2.f11206d) != null && jSONObject2.optInt("success") == 1) {
                    obj3 = Boolean.TRUE;
                    return new p6.k(obj3);
                }
                p6.j jVar2 = new p6.j(new Exception());
                obj3 = jVar2;
                return new p6.k(obj3);
        }
    }
}
