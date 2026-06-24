package u4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10434b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d2 f10435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10436m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Context context, d2 d2Var, int i, t6.c cVar) {
        super(2, cVar);
        this.f10433a = 1;
        this.f10434b = context;
        this.f10435l = d2Var;
        this.f10436m = i;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10433a) {
            case 0:
                return new b2(this.f10434b, this.f10436m, this.f10435l, cVar, 0);
            case 1:
                return new b2(this.f10434b, this.f10435l, this.f10436m, cVar);
            default:
                return new b2(this.f10434b, this.f10436m, this.f10435l, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10433a) {
            case 0:
                b2 b2Var = (b2) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                b2Var.invokeSuspend(xVar);
                return xVar;
            case 1:
                b2 b2Var2 = (b2) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                b2Var2.invokeSuspend(xVar2);
                return xVar2;
            default:
                b2 b2Var3 = (b2) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8463a;
                b2Var3.invokeSuspend(xVar3);
                return xVar3;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        SharedPreferences sharedPreferences;
        switch (this.f10433a) {
            case 0:
                p6.a.e(obj);
                Context context = this.f10434b;
                j5.v vVar = new j5.v(context);
                HashMap map = new HashMap();
                int i = this.f10436m;
                map.put("floatingCategoryID", String.valueOf(i));
                g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat("/eapi/user/categories/add"), map, ShareTarget.METHOD_POST, false);
                g2VarK.f11206d = vVar.i(g2VarK, "/eapi/user/categories/add");
                if (!g2VarK.b() && g2VarK.f11206d != null) {
                    this.f10435l.c(context, i);
                }
                break;
            case 1:
                r7.o0 o0Var = this.f10435l.f10460c;
                p6.a.e(obj);
                Context context2 = this.f10434b;
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("SharedPreferencesUser", 0);
                try {
                    sharedPreferences = context2.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                if (string != null || sharedPreferences2.getString("is_turbo", null) != null) {
                    o0Var.getClass();
                    o0Var.g(null, j5.p.f6705a);
                    j5.v vVar2 = new j5.v(context2);
                    String strU = androidx.lifecycle.l.u(this.f10436m, "/eapi/user/categories/isFavorite/");
                    g2 g2VarK2 = vVar2.k("https://www.uptodown.app:443".concat(strU), null, ShareTarget.METHOD_GET, false);
                    g2VarK2.f11206d = vVar2.i(g2VarK2, strU);
                    if (!g2VarK2.b() && (jSONObject = g2VarK2.f11206d) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                        j5.r rVar = new j5.r(Boolean.valueOf(jSONObjectOptJSONObject.optInt("isCategoryFavorite") == 1));
                        o0Var.getClass();
                        o0Var.g(null, rVar);
                    }
                }
                break;
            default:
                p6.a.e(obj);
                Context context3 = this.f10434b;
                j5.v vVar3 = new j5.v(context3);
                HashMap map2 = new HashMap();
                int i6 = this.f10436m;
                map2.put("floatingCategoryID", String.valueOf(i6));
                g2 g2VarK3 = vVar3.k("https://www.uptodown.app:443".concat("/eapi/user/categories/delete"), map2, ShareTarget.METHOD_POST, false);
                g2VarK3.f11206d = vVar3.i(g2VarK3, "/eapi/user/categories/delete");
                if (!g2VarK3.b() && g2VarK3.f11206d != null) {
                    this.f10435l.c(context3, i6);
                }
                break;
        }
        return p6.x.f8463a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Context context, int i, d2 d2Var, t6.c cVar, int i6) {
        super(2, cVar);
        this.f10433a = i6;
        this.f10434b = context;
        this.f10436m = i;
        this.f10435l = d2Var;
    }
}
