package g5;

import android.content.Context;
import android.content.res.Resources;
import com.uptodown.tv.ui.fragment.TvSearchFragment;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5317b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TvSearchFragment f5318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5319m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(TvSearchFragment tvSearchFragment, String str, t6.c cVar, int i) {
        super(2, cVar);
        this.f5316a = i;
        this.f5318l = tvSearchFragment;
        this.f5319m = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5316a) {
            case 0:
                return new g0(this.f5318l, this.f5319m, cVar, 0);
            default:
                return new g0(this.f5318l, this.f5319m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5316a) {
        }
        return ((g0) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        Resources resources;
        int i = this.f5316a;
        p6.x xVar = p6.x.f8463a;
        u6.a aVar = u6.a.f10762a;
        t6.c cVar = null;
        int i6 = 1;
        switch (i) {
            case 0:
                int i10 = this.f5317b;
                if (i10 == 0) {
                    p6.a.e(obj);
                    this.f5317b = 1;
                    if (o7.c0.j(300L, this) != aVar) {
                    }
                } else if (i10 == 1) {
                    p6.a.e(obj);
                } else if (i10 == 2) {
                    p6.a.e(obj);
                } else {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                }
                this.f5317b = 2;
                int i11 = TvSearchFragment.f3444m;
                v7.e eVar = o7.m0.f8288a;
                Object objC = o7.c0.C(new g0(this.f5318l, this.f5319m, cVar, i6), v7.d.f10884a, this);
                if (objC != aVar) {
                    objC = xVar;
                }
                if (objC != aVar) {
                }
                break;
            default:
                int i12 = this.f5317b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p6.a.e(obj);
                    } else {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ArrayList arrayListW = a4.x.w(obj);
                    TvSearchFragment tvSearchFragment = this.f5318l;
                    Context contextRequireContext = tvSearchFragment.requireContext();
                    contextRequireContext.getClass();
                    j5.v vVar = new j5.v(contextRequireContext);
                    String str = this.f5319m;
                    g2 g2VarH = vVar.H(10, 0, str);
                    if (!g2VarH.b() && (jSONObject = g2VarH.f11206d) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("results");
                        if (jSONObject.optInt("success") == 1 && jSONArrayOptJSONArray != null) {
                            Context context = tvSearchFragment.getContext();
                            t6.c cVar2 = null;
                            Integer num = (context == null || (resources = context.getResources()) == null) ? null : new Integer(resources.getDimensionPixelSize(2131166557));
                            int length = jSONArrayOptJSONArray.length();
                            for (int i13 = 0; i13 < length; i13++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i13);
                                jSONObjectOptJSONObject2.getClass();
                                x4.g gVar = new x4.g();
                                gVar.a(null, jSONObjectOptJSONObject2);
                                arrayListW.add(gVar);
                                if (num != null) {
                                    a4.g0.d().e(gVar.g(num.intValue())).b(null);
                                }
                            }
                            v7.e eVar2 = o7.m0.f8288a;
                            p7.c cVar3 = t7.n.f10348a;
                            b5.l lVar = new b5.l((Object) tvSearchFragment, (Object) str, arrayListW, cVar2, 15);
                            this.f5317b = 1;
                            if (o7.c0.C(lVar, cVar3, this) == aVar) {
                            }
                            break;
                        }
                    }
                }
                break;
        }
        return aVar;
    }
}
