package c4;

import com.uptodown.activities.PublicProfileActivity;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x7 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublicProfileActivity f2308b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2309l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7(PublicProfileActivity publicProfileActivity, String str, t6.c cVar, int i) {
        super(2, cVar);
        this.f2307a = i;
        this.f2308b = publicProfileActivity;
        this.f2309l = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2307a) {
            case 0:
                return new x7(this.f2308b, this.f2309l, cVar, 0);
            default:
                return new x7(this.f2308b, this.f2309l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2307a) {
        }
        return ((x7) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        JSONObject jSONObject;
        x4.w2 w2Var;
        String str2;
        switch (this.f2307a) {
            case 0:
                ArrayList arrayListW = a4.x.w(obj);
                x4.g2 g2VarQ = new j5.v(this.f2308b).q(20, 0, this.f2309l);
                if (!g2VarQ.b() && (str = g2VarQ.f11203a) != null && str.length() != 0) {
                    String str3 = g2VarQ.f11203a;
                    str3.getClass();
                    JSONArray jSONArrayOptJSONArray = new JSONObject(str3).optJSONArray("data");
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                            jSONObjectOptJSONObject.getClass();
                            x4.g gVar = new x4.g();
                            gVar.a(null, jSONObjectOptJSONObject);
                            arrayListW.add(gVar);
                        }
                    }
                }
                return arrayListW;
            default:
                ArrayList arrayListW2 = a4.x.w(obj);
                x4.g2 g2VarY = new j5.v(this.f2308b).y(10, 0, this.f2309l);
                if (!g2VarY.b() && (jSONObject = g2VarY.f11206d) != null && !jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.isNull("user")) {
                        w2Var = null;
                    } else {
                        w2Var = new x4.w2();
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                        jSONObject3.getClass();
                        w2Var.c(jSONObject3);
                    }
                    JSONArray jSONArray = jSONObject2.isNull("comments") ? null : jSONObject2.getJSONArray("comments");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        int length2 = jSONArray.length();
                        for (int i6 = 0; i6 < length2; i6++) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i6);
                            jSONObject4.getClass();
                            x4.k2 k2VarR = q1.a.r(jSONObject4);
                            if (w2Var != null && (str2 = w2Var.f11434m) != null && str2.length() != 0) {
                                k2VarR.f11260l = w2Var.f11434m;
                                if (w2Var.f11443w) {
                                    k2VarR.v = 1;
                                }
                            }
                            arrayListW2.add(k2VarR);
                        }
                    }
                }
                return arrayListW2;
        }
    }
}
