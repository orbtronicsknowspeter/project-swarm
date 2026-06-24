package u4;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.d3;
import x4.g2;
import x4.l2;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j5.v f10569b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f10570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v0 f10571m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(j5.v vVar, long j, v0 v0Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f10568a = i;
        this.f10569b = vVar;
        this.f10570l = j;
        this.f10571m = v0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10568a) {
            case 0:
                return new p0(this.f10569b, this.f10570l, this.f10571m, cVar, 0);
            default:
                return new p0(this.f10569b, this.f10570l, this.f10571m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10568a) {
            case 0:
                p0 p0Var = (p0) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                p0Var.invokeSuspend(xVar);
                return xVar;
            default:
                p0 p0Var2 = (p0) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                p0Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str;
        JSONArray jSONArrayOptJSONArray2;
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray3;
        switch (this.f10568a) {
            case 0:
                ArrayList arrayListW = a4.x.w(obj);
                String strH = a4.x.h(this.f10570l, "https://www.uptodown.app:443/eapi/floating-categories/app/");
                j5.v vVar = this.f10569b;
                g2 g2VarK = vVar.k(strH, null, ShareTarget.METHOD_GET, false);
                g2VarK.f11207d = vVar.i(g2VarK, "/eapi/floating-categories/app");
                if (!g2VarK.b() && (jSONObject = g2VarK.f11207d) != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                    if (jSONArrayOptJSONArray.length() <= 2) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            p2 p2Var = new p2(null, null, 7);
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("data");
                            if (jSONObjectOptJSONObject3 != null) {
                                x4.j jVar = new x4.j(0, (String) null, 7);
                                jVar.b(jSONObjectOptJSONObject3);
                                jVar.f11228m = true;
                                p2Var.f11330a = jVar;
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject2.optJSONArray("apps");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length2 = jSONArrayOptJSONArray4.length();
                                for (int i6 = 0; i6 < length2; i6++) {
                                    x4.g gVar = new x4.g();
                                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray4.optJSONObject(i6);
                                    jSONObjectOptJSONObject4.getClass();
                                    gVar.a(null, jSONObjectOptJSONObject4);
                                    p2Var.f11331b.add(gVar);
                                }
                            }
                            arrayListW.add(p2Var);
                        }
                    } else {
                        int length3 = jSONArrayOptJSONArray.length();
                        for (int i10 = 0; i10 < length3; i10++) {
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i10);
                            x4.j jVar2 = new x4.j(0, (String) null, 7);
                            jVar2.f11228m = true;
                            jSONObjectOptJSONObject5.getClass();
                            jVar2.b(jSONObjectOptJSONObject5);
                            arrayListW.add(jVar2);
                        }
                    }
                }
                if (!arrayListW.isEmpty()) {
                    Object objQ0 = q6.l.q0(arrayListW);
                    if (objQ0 instanceof x4.j) {
                        arrayList = arrayListW;
                        arrayListW = null;
                    } else if (objQ0 instanceof p2) {
                        arrayList = null;
                    } else {
                        arrayListW = null;
                        arrayList = null;
                    }
                    r7.o0 o0Var = this.f10571m.i;
                    j5.r rVar = new j5.r(new h0(arrayListW, arrayList));
                    o0Var.getClass();
                    o0Var.g(null, rVar);
                }
                break;
            default:
                ArrayList arrayListW2 = a4.x.w(obj);
                j5.v vVar2 = this.f10569b;
                long j = this.f10570l;
                g2 g2VarA = vVar2.A(j);
                if (!g2VarA.b() && (jSONObject2 = g2VarA.f11207d) != null && jSONObject2.optInt("success") == 1 && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null && (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("videos")) != null) {
                    int length4 = jSONArrayOptJSONArray3.length();
                    for (int i11 = 0; i11 < length4; i11++) {
                        JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray3.optJSONObject(i11);
                        jSONObjectOptJSONObject6.getClass();
                        d3 d3Var = new d3();
                        if (!jSONObjectOptJSONObject6.isNull("youtubeID")) {
                            d3Var.f11120a = jSONObjectOptJSONObject6.optString("youtubeID");
                        }
                        if (!jSONObjectOptJSONObject6.isNull("image")) {
                            d3Var.f11121b = jSONObjectOptJSONObject6.optString("image");
                        }
                        arrayListW2.add(d3Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                g2 g2VarR = vVar2.r(j);
                if (!g2VarR.b() && (str = g2VarR.f11204a) != null && str.length() != 0) {
                    String str2 = g2VarR.f11204a;
                    str2.getClass();
                    JSONObject jSONObject3 = new JSONObject(str2);
                    if (jSONObject3.optInt("success") == 1 && (jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("data")) != null) {
                        int length5 = jSONArrayOptJSONArray2.length();
                        for (int i12 = 0; i12 < length5; i12++) {
                            JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray2.optJSONObject(i12);
                            jSONObjectOptJSONObject7.getClass();
                            l2 l2Var = new l2();
                            if (!jSONObjectOptJSONObject7.isNull("screenshotURL")) {
                                l2Var.f11278a = jSONObjectOptJSONObject7.optString("screenshotURL");
                            }
                            if (!jSONObjectOptJSONObject7.isNull("isVertical")) {
                                l2Var.f11281m = jSONObjectOptJSONObject7.optInt("isVertical");
                            }
                            if (!jSONObjectOptJSONObject7.isNull("featured")) {
                                l2Var.f11280l = jSONObjectOptJSONObject7.optInt("featured");
                            }
                            if (l2Var.f11280l == 0) {
                                arrayList2.add(l2Var);
                            }
                            q6.q.j0(arrayList2, new c4.k1(new c4.j1(18), 11));
                        }
                    }
                }
                r7.o0 o0Var2 = this.f10571m.g;
                j5.r rVar2 = new j5.r(new g0(arrayList2, arrayListW2));
                o0Var2.getClass();
                o0Var2.g(null, rVar2);
                break;
        }
        return p6.x.f8464a;
    }
}
