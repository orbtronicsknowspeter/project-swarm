package g5;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import c4.sc;
import com.uptodown.R;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5332b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n0 f5333l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(n0 n0Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f5331a = i;
        this.f5333l = n0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5331a) {
            case 0:
                return new l0(this.f5333l, cVar, 0);
            default:
                return new l0(this.f5333l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5331a) {
        }
        return ((l0) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g2 g2VarM;
        JSONObject jSONObject;
        Resources resources;
        int i = this.f5331a;
        int i6 = 0;
        n0 n0Var = this.f5333l;
        u6.a aVar = u6.a.f10763a;
        p6.x xVar = p6.x.f8464a;
        t6.c cVar = null;
        switch (i) {
            case 0:
                int i10 = this.f5332b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                    n0Var.f5343m = true;
                    FragmentActivity fragmentActivityRequireActivity = n0Var.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    j5.v vVar = new j5.v(fragmentActivityRequireActivity);
                    x4.j jVar = n0Var.f5341b;
                    if (jVar != null) {
                        int i11 = jVar.f11225a;
                        if (i11 == -2) {
                            g2VarM = vVar.m(75, n0Var.f5342l);
                        } else if (i11 != -1) {
                            jVar.getClass();
                            boolean z9 = jVar.f11228m;
                            x4.j jVar2 = n0Var.f5341b;
                            if (z9) {
                                jVar2.getClass();
                                g2VarM = vVar.u(jVar2.f11225a, 75, n0Var.f5342l);
                            } else {
                                jVar2.getClass();
                                g2VarM = vVar.t(jVar2.f11225a, 75, n0Var.f5342l);
                            }
                        } else {
                            g2VarM = vVar.s(75, n0Var.f5342l);
                        }
                    } else {
                        g2VarM = null;
                    }
                    if (g2VarM != null && !g2VarM.b() && (jSONObject = g2VarM.f11207d) != null) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                        if (jSONObject.optInt("success") == 1 && jSONArrayOptJSONArray != null) {
                            xVar2.f7025a = new ArrayList();
                            Context context = n0Var.getContext();
                            Integer num = (context == null || (resources = context.getResources()) == null) ? null : new Integer(resources.getDimensionPixelSize(R.dimen.tv_card_height));
                            int length = jSONArrayOptJSONArray.length();
                            while (i6 < length) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                                jSONObjectOptJSONObject.getClass();
                                x4.g gVar = new x4.g();
                                gVar.a(null, jSONObjectOptJSONObject);
                                ((ArrayList) xVar2.f7025a).add(gVar);
                                if (num != null) {
                                    a4.g0.d().e(gVar.g(num.intValue())).b(null);
                                }
                                n0Var.f5342l++;
                                i6++;
                            }
                        }
                    }
                    v7.e eVar = o7.m0.f8289a;
                    p7.c cVar2 = t7.n.f10349a;
                    sc scVar = new sc(n0Var, xVar2, cVar, 16);
                    this.f5332b = 1;
                    if (o7.c0.C(scVar, cVar2, this) == aVar) {
                    }
                }
                break;
            default:
                int i12 = this.f5332b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    this.f5332b = 1;
                    v7.e eVar2 = o7.m0.f8289a;
                    Object objC = o7.c0.C(new l0(n0Var, cVar, i6), v7.d.f10885a, this);
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
