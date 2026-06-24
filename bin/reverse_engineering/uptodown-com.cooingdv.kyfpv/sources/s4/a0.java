package s4;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5.m f9169b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9170l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b5.m mVar, String str, t6.c cVar, int i) {
        super(2, cVar);
        this.f9168a = i;
        this.f9169b = mVar;
        this.f9170l = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9168a) {
            case 0:
                return new a0(this.f9169b, this.f9170l, cVar, 0);
            default:
                return new a0(this.f9169b, this.f9170l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9168a) {
        }
        return ((a0) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objV;
        JSONObject jSONObject;
        Object objV2;
        JSONObject jSONObject2;
        switch (this.f9168a) {
            case 0:
                p6.a.e(obj);
                b5.m mVar = this.f9169b;
                j5.v vVar = new j5.v((Context) mVar.f1061b);
                String str = this.f9170l;
                str.getClass();
                g2 g2VarK = vVar.k("https://www.uptodown.app:443/eapi/v2/virus-total/" + str + "/report", null, ShareTarget.METHOD_GET, false);
                g2VarK.f11207d = vVar.i(g2VarK, "/eapi/v2/virus-total/fileId/report");
                if (g2VarK.b() || (jSONObject = g2VarK.f11207d) == null || (objV = b5.m.v(mVar, jSONObject)) == null) {
                    p6.j jVar = new p6.j(new Exception());
                    objV = jVar;
                }
                return new p6.k(objV);
            default:
                p6.a.e(obj);
                b5.m mVar2 = this.f9169b;
                j5.v vVar2 = new j5.v((Context) mVar2.f1061b);
                String str2 = this.f9170l;
                str2.getClass();
                g2 g2VarK2 = vVar2.k("https://www.uptodown.app:443/eapi/v2/virus-total-by-sha256/" + str2 + "/report", null, ShareTarget.METHOD_GET, false);
                g2VarK2.f11207d = vVar2.i(g2VarK2, "/eapi/v2/virus-total-by-sha256/sha256/report");
                if (g2VarK2.b() || (jSONObject2 = g2VarK2.f11207d) == null || (objV2 = b5.m.v(mVar2, jSONObject2)) == null) {
                    p6.j jVar2 = new p6.j(new Exception());
                    objV2 = jVar2;
                }
                return new p6.k(objV2);
        }
    }
}
