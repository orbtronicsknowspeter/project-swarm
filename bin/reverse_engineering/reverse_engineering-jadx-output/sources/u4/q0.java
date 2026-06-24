package u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.g2;
import x4.k2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10577a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f10578b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f10579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j5.v f10580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10581n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, j5.v vVar, long j, v0 v0Var, t6.c cVar) {
        super(2, cVar);
        this.f10579l = context;
        this.f10580m = vVar;
        this.f10581n = j;
        this.f10578b = v0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10577a) {
            case 0:
                return new q0(this.f10579l, this.f10580m, this.f10581n, this.f10578b, cVar);
            default:
                return new q0(this.f10578b, this.f10579l, this.f10580m, this.f10581n, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10577a) {
            case 0:
                q0 q0Var = (q0) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                q0Var.invokeSuspend(xVar);
                return xVar;
            default:
                q0 q0Var2 = (q0) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                q0Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        k2 k2Var;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        SharedPreferences sharedPreferences;
        int i = this.f10577a;
        p6.x xVar = p6.x.f8463a;
        long j = this.f10581n;
        j5.v vVar = this.f10580m;
        Context context = this.f10579l;
        v0 v0Var = this.f10578b;
        switch (i) {
            case 0:
                ArrayList arrayListW = a4.x.w(obj);
                int i6 = l7.u.m0(context.getString(2131952555), "phone", true) ? 5 : 6;
                HashMap map = new HashMap();
                map.put("page[limit]", String.valueOf(i6));
                map.put("page[offset]", String.valueOf(0));
                g2 g2VarK = vVar.k(k0.k.g(j, "https://www.uptodown.app:443/eapi/apps/", "/comments-with-text"), map, ShareTarget.METHOD_GET, false);
                g2VarK.f11206d = vVar.i(g2VarK, "/eapi/apps/appId/comments-with-text");
                if (!g2VarK.b() && (jSONObject2 = g2VarK.f11206d) != null) {
                    int iOptInt = jSONObject2.optInt("success");
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("data");
                    if (iOptInt == 1 && jSONArrayOptJSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            int length = jSONArrayOptJSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                                jSONObjectOptJSONObject2.getClass();
                                arrayList.add(q1.a.h(jSONObjectOptJSONObject2));
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        arrayListW.addAll(arrayList);
                    }
                }
                g2 g2VarK2 = vVar.k(k0.k.g(j, "https://www.uptodown.app:443/eapi/app/", "/my-comment"), null, ShareTarget.METHOD_GET, false);
                g2VarK2.f11206d = vVar.i(g2VarK2, "/eapi/app/appID/my-comment");
                if (!g2VarK2.b() && (jSONObject = g2VarK2.f11206d) != null) {
                    if (jSONObject.optInt("success") == 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                        k2Var = new k2();
                        if (!jSONObjectOptJSONObject.isNull("rating")) {
                            k2Var.f11264p = jSONObjectOptJSONObject.optInt("rating");
                        }
                        if (!jSONObjectOptJSONObject.isNull("text")) {
                            k2Var.f11263o = jSONObjectOptJSONObject.optString("text");
                        }
                    }
                    r7.o0 o0Var = v0Var.f10634q;
                    o0Var.getClass();
                    o0Var.g(null, arrayListW);
                    v0Var.f10638u.f(k2Var);
                    r7.o0 o0Var2 = v0Var.f10628k;
                    j5.r rVar = new j5.r(new i0(arrayListW, k2Var));
                    o0Var2.getClass();
                    o0Var2.g(null, rVar);
                } else if (g2VarK2.b()) {
                    int i11 = g2VarK2.f11204b;
                }
                k2Var = null;
                r7.o0 o0Var3 = v0Var.f10634q;
                o0Var3.getClass();
                o0Var3.g(null, arrayListW);
                v0Var.f10638u.f(k2Var);
                r7.o0 o0Var22 = v0Var.f10628k;
                j5.r rVar2 = new j5.r(new i0(arrayListW, k2Var));
                o0Var22.getClass();
                o0Var22.g(null, rVar2);
                break;
            default:
                p6.a.e(obj);
                r7.o0 o0Var4 = v0Var.f10641y;
                o0Var4.getClass();
                o0Var4.g(null, j5.p.f6705a);
                ArrayList arrayList2 = new ArrayList();
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("SharedPreferencesUser", 0);
                try {
                    sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                if (string != null || sharedPreferences2.getString("is_turbo", null) != null) {
                    Context context2 = vVar.f6714a;
                    context2.getClass();
                    String str = "/eapi/app/" + j + "/my-devices/" + Settings.Secure.getString(context2.getContentResolver(), "android_id");
                    g2 g2VarK3 = vVar.k("https://www.uptodown.app:443".concat(str), null, ShareTarget.METHOD_GET, false);
                    g2VarK3.f11206d = vVar.i(g2VarK3, str);
                    if (g2VarK3.b() || (jSONObject3 = g2VarK3.f11206d) == null) {
                        arrayList2 = new ArrayList();
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("data");
                        if (jSONObject3.optInt("success") == 1 && jSONArrayOptJSONArray2 != null) {
                            arrayList2 = new ArrayList();
                            try {
                                int length2 = jSONArrayOptJSONArray2.length();
                                for (int i12 = 0; i12 < length2; i12++) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i12);
                                    jSONObjectOptJSONObject3.getClass();
                                    arrayList2.add(d0.b.l(jSONObjectOptJSONObject3));
                                }
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                    }
                }
                if (arrayList2.size() > 1) {
                    if (arrayList2.size() > 1) {
                        q6.q.j0(arrayList2, new g4.z(11));
                    }
                    j5.r rVar3 = new j5.r(arrayList2);
                    o0Var4.getClass();
                    o0Var4.g(null, rVar3);
                }
                break;
        }
        return xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(v0 v0Var, Context context, j5.v vVar, long j, t6.c cVar) {
        super(2, cVar);
        this.f10578b = v0Var;
        this.f10579l = context;
        this.f10580m = vVar;
        this.f10581n = j;
    }
}
