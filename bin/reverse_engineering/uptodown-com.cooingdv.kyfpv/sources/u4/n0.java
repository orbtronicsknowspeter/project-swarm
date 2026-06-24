package u4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10553b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f10554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v0 f10555m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, v0 v0Var, long j, t6.c cVar) {
        super(2, cVar);
        this.f10552a = 3;
        this.f10553b = context;
        this.f10555m = v0Var;
        this.f10554l = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10552a) {
            case 0:
                return new n0(this.f10555m, this.f10553b, this.f10554l, cVar);
            case 1:
                return new n0(1, this.f10554l, this.f10553b, cVar, this.f10555m);
            case 2:
                return new n0(2, this.f10554l, this.f10553b, cVar, this.f10555m);
            default:
                return new n0(this.f10553b, this.f10555m, this.f10554l, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10552a) {
            case 0:
                n0 n0Var = (n0) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                n0Var.invokeSuspend(xVar);
                return xVar;
            case 1:
                n0 n0Var2 = (n0) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                n0Var2.invokeSuspend(xVar2);
                return xVar2;
            case 2:
                n0 n0Var3 = (n0) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                n0Var3.invokeSuspend(xVar3);
                return xVar3;
            default:
                n0 n0Var4 = (n0) create(a0Var, cVar);
                p6.x xVar4 = p6.x.f8464a;
                n0Var4.invokeSuspend(xVar4);
                return xVar4;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        String strOptString;
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject3;
        switch (this.f10552a) {
            case 0:
                p6.a.e(obj);
                r7.o0 o0Var = this.f10555m.f10631m;
                o0Var.getClass();
                o0Var.g(null, j5.p.f6706a);
                Context context = this.f10553b;
                j5.v vVar = new j5.v(context);
                long j = this.f10554l;
                g2 g2VarB = vVar.b(j);
                if (!g2VarB.b() && (jSONObject = g2VarB.f11207d) != null && jSONObject.optInt("success") == 1) {
                    new android.support.v4.media.g(context, 20).E(k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "removed"), "preregister");
                    j5.g gVarL = j5.g.D.l(context);
                    gVarL.b();
                    String[] strArr = {String.valueOf(j)};
                    SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                    sQLiteDatabase.getClass();
                    sQLiteDatabase.delete("preregistrations", "appId=?", strArr);
                    gVarL.c();
                    j5.r rVar = new j5.r(new j0(false));
                    o0Var.getClass();
                    o0Var.g(null, rVar);
                }
                break;
            case 1:
                p6.a.e(obj);
                j5.v vVar2 = new j5.v(this.f10553b);
                boolean z9 = false;
                g2 g2VarK = vVar2.k(k0.k.g(this.f10554l, "https://www.uptodown.app:443/eapi/app/", "/pre-registered"), j5.v.g(), ShareTarget.METHOD_GET, false);
                g2VarK.f11207d = vVar2.i(g2VarK, "/eapi/app/appID/pre-registered");
                if (g2VarK.b() || (jSONObject2 = g2VarK.f11207d) == null || (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) == null) {
                    strOptString = null;
                } else {
                    strOptString = !jSONObjectOptJSONObject.isNull("message") ? jSONObjectOptJSONObject.optString("message") : null;
                    if (!jSONObjectOptJSONObject.isNull("preRegistered") && jSONObjectOptJSONObject.optInt("preRegistered") != 0) {
                        z9 = true;
                    }
                }
                r7.o0 o0Var2 = this.f10555m.f10633o;
                j5.r rVar2 = new j5.r(new k0(strOptString, z9));
                o0Var2.getClass();
                o0Var2.g(null, rVar2);
                break;
            case 2:
                ArrayList arrayListW = a4.x.w(obj);
                j5.v vVar3 = new j5.v(this.f10553b);
                g2 g2VarK2 = vVar3.k(k0.k.g(this.f10554l, "https://www.uptodown.app:443/eapi/v2/apps/", "/promoted"), j5.v.g(), ShareTarget.METHOD_GET, false);
                g2VarK2.f11207d = vVar3.i(g2VarK2, "/eapi/v2/apps/appID/promoted");
                if (!g2VarK2.b() && (jSONObject3 = g2VarK2.f11207d) != null) {
                    JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("data");
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            x4.g gVar = new x4.g();
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            jSONObjectOptJSONObject2.getClass();
                            gVar.a(null, jSONObjectOptJSONObject2);
                            arrayListW.add(gVar);
                        }
                    }
                    if (!arrayListW.isEmpty()) {
                        r7.o0 o0Var3 = this.f10555m.f10628e;
                        o0Var3.getClass();
                        o0Var3.g(null, arrayListW);
                    }
                }
                break;
            default:
                p6.a.e(obj);
                j5.v vVar4 = new j5.v(this.f10553b);
                Object value = this.f10555m.C.getValue();
                long j6 = this.f10554l;
                if (value != null) {
                    g2 g2VarK3 = vVar4.k(k0.k.g(j6, "https://www.uptodown.com:443/dwn/", "/native-external-update/increase"), null, ShareTarget.METHOD_POST, false);
                    g2VarK3.f11207d = vVar4.i(g2VarK3, "/dwn/appID/native-external-update/increase");
                } else {
                    g2 g2VarK4 = vVar4.k(k0.k.g(j6, "https://www.uptodown.com:443/dwn/", "/native-external/increase"), null, ShareTarget.METHOD_POST, false);
                    g2VarK4.f11207d = vVar4.i(g2VarK4, "/dwn/appID/native-external/increase");
                }
                break;
        }
        return p6.x.f8464a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i, long j, Context context, t6.c cVar, v0 v0Var) {
        super(2, cVar);
        this.f10552a = i;
        this.f10553b = context;
        this.f10554l = j;
        this.f10555m = v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(v0 v0Var, Context context, long j, t6.c cVar) {
        super(2, cVar);
        this.f10552a = 0;
        this.f10555m = v0Var;
        this.f10553b = context;
        this.f10554l = j;
    }
}
