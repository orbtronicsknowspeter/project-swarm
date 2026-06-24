package g5;

import android.content.Context;
import c4.sc;
import com.uptodown.tv.ui.fragment.TvSearchFragment;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5311b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TvSearchFragment f5312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x4.g f5313m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(TvSearchFragment tvSearchFragment, x4.g gVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f5310a = i;
        this.f5312l = tvSearchFragment;
        this.f5313m = gVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5310a) {
            case 0:
                return new f0(this.f5312l, this.f5313m, cVar, 0);
            default:
                return new f0(this.f5312l, this.f5313m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5310a) {
        }
        return ((f0) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i = this.f5310a;
        x4.g gVar = this.f5313m;
        TvSearchFragment tvSearchFragment = this.f5312l;
        u6.a aVar = u6.a.f10762a;
        p6.x xVar = p6.x.f8463a;
        t6.c cVar = null;
        switch (i) {
            case 0:
                int i6 = this.f5311b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    Context contextRequireContext = tvSearchFragment.requireContext();
                    contextRequireContext.getClass();
                    g2 g2VarO = new j5.v(contextRequireContext).o(gVar.f11158a);
                    if (!g2VarO.b() && (str = g2VarO.f11203a) != null && str.length() != 0) {
                        String str2 = g2VarO.f11203a;
                        str2.getClass();
                        JSONObject jSONObject = new JSONObject(str2);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                        if (jSONObject.optInt("success") == 1 && jSONObjectOptJSONObject != null) {
                            gVar.a(null, jSONObjectOptJSONObject);
                        }
                    }
                    v7.e eVar = o7.m0.f8288a;
                    p7.c cVar2 = t7.n.f10348a;
                    sc scVar = new sc(tvSearchFragment, gVar, null, 15);
                    this.f5311b = 1;
                    if (o7.c0.C(scVar, cVar2, this) == aVar) {
                    }
                }
                break;
            default:
                int i10 = this.f5311b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    this.f5311b = 1;
                    int i11 = TvSearchFragment.f3444m;
                    v7.e eVar2 = o7.m0.f8288a;
                    Object objC = o7.c0.C(new f0(tvSearchFragment, gVar, cVar, 0), v7.d.f10884a, this);
                    if (objC != aVar) {
                        objC = xVar;
                    }
                    if (objC == aVar) {
                    }
                }
                break;
        }
        return xVar;
    }
}
