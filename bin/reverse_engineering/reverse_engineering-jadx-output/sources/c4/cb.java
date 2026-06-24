package c4;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class cb extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1480b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1483n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb(boolean z9, Object obj, Object obj2, Object obj3, t6.c cVar, int i) {
        super(2, cVar);
        this.f1479a = i;
        this.f1480b = z9;
        this.f1481l = obj;
        this.f1482m = obj2;
        this.f1483n = obj3;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1479a) {
            case 0:
                return new cb(this.f1480b, (ArrayList) this.f1481l, (Context) this.f1482m, (kotlin.jvm.internal.u) this.f1483n, cVar, 0);
            default:
                return new cb(this.f1480b, (x4.g) this.f1481l, (j5.v) this.f1482m, (u4.v0) this.f1483n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1479a) {
            case 0:
                cb cbVar = (cb) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                cbVar.invokeSuspend(xVar);
                return xVar;
            default:
                cb cbVar2 = (cb) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                cbVar2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        switch (this.f1479a) {
            case 0:
                p6.a.e(obj);
                if (this.f1480b) {
                    Iterator it = ((ArrayList) this.f1481l).iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        x4.r rVarA = ((x4.q2) next).a((Context) this.f1482m);
                        if (rVarA == null || !rVarA.c()) {
                            ((kotlin.jvm.internal.u) this.f1483n).f7021a = false;
                        }
                    }
                }
                break;
            default:
                u4.v0 v0Var = (u4.v0) this.f1483n;
                j5.v vVar = (j5.v) this.f1482m;
                x4.g gVar = (x4.g) this.f1481l;
                p6.a.e(obj);
                int i = 0;
                if (this.f1480b) {
                    x4.c cVar = new x4.c();
                    cVar.f11074d = gVar;
                    x4.g2 g2VarK = vVar.k(k0.k.g(gVar.f11158a, "https://www.uptodown.app:443/eapi/app/", "/alternatives"), j5.v.g(), ShareTarget.METHOD_GET, false);
                    g2VarK.f11206d = vVar.i(g2VarK, "/eapi/app/appID/alternatives");
                    if (!g2VarK.b() && (jSONObject2 = g2VarK.f11206d) != null && jSONObject2.optInt("success") == 1 && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null) {
                        if (!jSONObjectOptJSONObject.isNull("title")) {
                            cVar.f11071a = jSONObjectOptJSONObject.optString("title");
                        }
                        if (!jSONObjectOptJSONObject.isNull("description")) {
                            cVar.f11072b = jSONObjectOptJSONObject.optString("description");
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("apps");
                        if (jSONArrayOptJSONArray != null) {
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            while (i < length) {
                                x4.g gVar2 = new x4.g();
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                                jSONObject3.getClass();
                                gVar2.a(null, jSONObject3);
                                arrayList.add(gVar2);
                                i++;
                            }
                            cVar.f11073c = arrayList;
                        }
                        ArrayList arrayList2 = cVar.f11073c;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            r7.o0 o0Var = v0Var.f10625c;
                            o0Var.getClass();
                            o0Var.g(null, cVar);
                        }
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    long j = gVar.f11158a;
                    HashMap map = new HashMap();
                    map.put("page[limit]", String.valueOf(20));
                    map.put("page[offset]", String.valueOf(0));
                    map.putAll(j5.v.g());
                    x4.g2 g2VarK2 = vVar.k(k0.k.g(j, "https://www.uptodown.app:443/eapi/", "/similar"), map, ShareTarget.METHOD_GET, false);
                    g2VarK2.f11206d = vVar.i(g2VarK2, "/eapi/appID/similar");
                    if (!g2VarK2.b() && (jSONObject = g2VarK2.f11206d) != null) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("data");
                        if (jSONObject.optInt("success", 0) == 1 && jSONArrayOptJSONArray2 != null) {
                            int length2 = jSONArrayOptJSONArray2.length();
                            while (i < length2) {
                                x4.g gVar3 = new x4.g();
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                                jSONObjectOptJSONObject2.getClass();
                                gVar3.a(null, jSONObjectOptJSONObject2);
                                arrayList3.add(gVar3);
                                i++;
                            }
                            if (!arrayList3.isEmpty()) {
                                r7.o0 o0Var2 = v0Var.f10623a;
                                o0Var2.getClass();
                                o0Var2.g(null, arrayList3);
                            }
                        }
                    }
                }
                break;
        }
        return p6.x.f8463a;
    }
}
