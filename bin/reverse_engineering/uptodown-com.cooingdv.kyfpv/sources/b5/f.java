package b5;

import d7.p;
import j5.v;
import java.util.ArrayList;
import o7.a0;
import o7.c0;
import o7.m0;
import org.json.JSONArray;
import org.json.JSONObject;
import p6.x;
import t7.n;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends v6.i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1017b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f1020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f1021o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, m mVar, v vVar, t6.c cVar) {
        super(2, cVar);
        this.f1016a = i;
        this.f1020n = vVar;
        this.f1021o = mVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1016a) {
            case 0:
                return new f(0, this.f1021o, this.f1020n, cVar);
            default:
                return new f(1, this.f1021o, this.f1020n, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1016a) {
        }
        return ((f) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i;
        JSONObject jSONObject;
        ArrayList arrayList2;
        int i6;
        int i10 = this.f1016a;
        u6.a aVar = u6.a.f10763a;
        v vVar = this.f1020n;
        m mVar = this.f1021o;
        switch (i10) {
            case 0:
                x4.j jVar = (x4.j) mVar.f1063m;
                int i11 = this.f1019m;
                if (i11 == 0) {
                    p6.a.e(obj);
                    g2 g2VarF = vVar.f(jVar.f11225a);
                    arrayList = new ArrayList();
                    if (g2VarF.b() || (jSONObject = g2VarF.f11207d) == null || jSONObject.optInt("success") != 1) {
                        i = 0;
                    } else {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                        if (jSONArrayOptJSONArray != null) {
                            int length = jSONArrayOptJSONArray.length();
                            for (int i12 = 0; i12 < length; i12++) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
                                x4.j jVar2 = new x4.j(0, (String) null, 7);
                                jSONObjectOptJSONObject.getClass();
                                jVar2.a(jSONObjectOptJSONObject, jVar.f11225a);
                                arrayList.add(jVar2);
                            }
                            if (!arrayList.isEmpty()) {
                                v7.e eVar = m0.f8289a;
                                p7.c cVar = n.f10349a;
                                e eVar2 = new e(mVar, arrayList, null, 0);
                                this.f1017b = arrayList;
                                this.f1018l = 1;
                                this.f1019m = 1;
                                if (c0.C(eVar2, cVar, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        i = 1;
                    }
                } else {
                    if (i11 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.f1018l;
                    arrayList = this.f1017b;
                    p6.a.e(obj);
                }
                return new b(arrayList, i != 0);
            default:
                int i13 = this.f1019m;
                if (i13 == 0) {
                    p6.a.e(obj);
                    g2 g2VarH = vVar.h(((x4.j) mVar.f1063m).f11225a);
                    if (g2VarH.b() || g2VarH.f11207d == null) {
                        arrayList2 = new ArrayList();
                        i6 = 0;
                    } else {
                        arrayList2 = v.E(g2VarH);
                        if (!arrayList2.isEmpty()) {
                            v7.e eVar3 = m0.f8289a;
                            p7.c cVar2 = n.f10349a;
                            e eVar4 = new e(mVar, arrayList2, null, 1);
                            this.f1017b = arrayList2;
                            this.f1018l = 1;
                            this.f1019m = 1;
                            if (c0.C(eVar4, cVar2, this) == aVar) {
                                return aVar;
                            }
                        }
                        i6 = 1;
                    }
                } else {
                    if (i13 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = this.f1018l;
                    arrayList2 = this.f1017b;
                    p6.a.e(obj);
                }
                return new c(arrayList2, i6 != 0);
        }
    }
}
