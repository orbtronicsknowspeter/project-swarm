package c4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2250a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f2251b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f2252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f2254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f2255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f2256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f2257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Serializable f2258r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context, String str, String str2, String str3, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.x xVar, kotlin.jvm.internal.x xVar2, t6.c cVar) {
        super(2, cVar);
        this.f2251b = x2Var;
        this.f2252l = context;
        this.f2253m = str;
        this.f2254n = str2;
        this.f2258r = str3;
        this.f2255o = vVar;
        this.f2256p = xVar;
        this.f2257q = xVar2;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2250a) {
            case 0:
                return new w2(this.f2251b, this.f2252l, this.f2253m, this.f2254n, this.f2256p, this.f2255o, this.f2257q, (kotlin.jvm.internal.x) this.f2258r, cVar);
            default:
                return new w2(this.f2251b, this.f2252l, this.f2253m, this.f2254n, (String) this.f2258r, this.f2255o, this.f2256p, this.f2257q, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2250a) {
            case 0:
                w2 w2Var = (w2) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                w2Var.invokeSuspend(xVar);
                return xVar;
            default:
                w2 w2Var2 = (w2) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                w2Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferences;
        switch (this.f2250a) {
            case 0:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.f2258r;
                p6.a.e(obj);
                r7.o0 o0Var = this.f2251b.f2289a;
                o0Var.getClass();
                o0Var.g(null, j5.p.f6705a);
                Context context = this.f2252l;
                x4.g2 g2VarD = new j5.v(context).D(this.f2253m, this.f2254n);
                JSONObject jSONObject = g2VarD.f11206d;
                kotlin.jvm.internal.x xVar2 = this.f2257q;
                kotlin.jvm.internal.v vVar = this.f2255o;
                kotlin.jvm.internal.x xVar3 = this.f2256p;
                if (jSONObject != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        x4.w2 w2Var = new x4.w2();
                        w2Var.b(context, jSONObjectOptJSONObject);
                        xVar3.f7024a = w2Var;
                        try {
                            sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                        if (string == null || string.length() == 0) {
                            x4.u2.c(context);
                        } else {
                            x4.w2 w2Var2 = (x4.w2) xVar3.f7024a;
                            if (w2Var2 != null) {
                                w2Var2.e(context);
                            }
                            vVar.f7022a = 1;
                        }
                        if (!jSONObjectOptJSONObject.isNull("message")) {
                            xVar2.f7024a = jSONObjectOptJSONObject.optString("message");
                        }
                    }
                    xVar.f7024a = x4.g2.e(jSONObject);
                }
                if (xVar3.f7024a != null) {
                    new android.support.v4.media.g(context, 20).E(k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "success", "loginSource", "signin"), "login");
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("responseCode", String.valueOf(g2VarD.f11204b));
                    String str = g2VarD.f11205c;
                    if (str != null && str.length() != 0) {
                        String str2 = g2VarD.f11205c;
                        str2.getClass();
                        bundle.putString("exception", str2);
                    }
                    bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
                    bundle.putString("loginSource", "signin");
                    new android.support.v4.media.g(context, 20).E(bundle, "login");
                }
                j5.r rVar = new j5.r(new u2(vVar.f7022a, (String) xVar2.f7024a, (String) xVar.f7024a));
                o0Var.getClass();
                o0Var.g(null, rVar);
                break;
            default:
                p6.a.e(obj);
                r7.o0 o0Var2 = this.f2251b.f2291c;
                o0Var2.getClass();
                o0Var2.g(null, j5.p.f6705a);
                Context context2 = this.f2252l;
                j5.v vVar2 = new j5.v(context2);
                String str3 = (String) this.f2258r;
                HashMap map = new HashMap();
                map.put("username", this.f2253m);
                map.put("password", this.f2254n);
                map.put(NotificationCompat.CATEGORY_EMAIL, str3);
                map.put("terms", "1");
                x4.g2 g2VarK = vVar2.k("https://www.uptodown.app:443".concat("/eapi/user/signup"), map, ShareTarget.METHOD_POST, false);
                if (g2VarK.b()) {
                    g2VarK.f11206d = vVar2.j(g2VarK, "/eapi/user/signup");
                } else {
                    g2VarK.f11206d = vVar2.i(g2VarK, "/eapi/user/signup");
                }
                JSONObject jSONObject2 = g2VarK.f11206d;
                kotlin.jvm.internal.x xVar4 = this.f2257q;
                kotlin.jvm.internal.x xVar5 = this.f2256p;
                kotlin.jvm.internal.v vVar3 = this.f2255o;
                if (jSONObject2 != null) {
                    if (!jSONObject2.isNull("success")) {
                        vVar3.f7022a = jSONObject2.optInt("success");
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                    if (jSONObjectOptJSONObject2 != null && !jSONObjectOptJSONObject2.isNull("message")) {
                        xVar5.f7024a = jSONObjectOptJSONObject2.optString("message");
                    }
                    xVar4.f7024a = x4.g2.e(jSONObject2);
                }
                if (vVar3.f7022a == 1) {
                    new android.support.v4.media.g(context2, 20).E(k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "success", "loginSource", "signup"), "login");
                } else {
                    Bundle bundleF = k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "loginSource", "signup");
                    bundleF.putString("responseCode", String.valueOf(g2VarK.f11204b));
                    String str4 = g2VarK.f11205c;
                    if (str4 != null) {
                        bundleF.putString("exception", str4);
                    }
                    new android.support.v4.media.g(context2, 20).E(bundleF, "login");
                }
                j5.r rVar2 = new j5.r(new v2(vVar3.f7022a, (String) xVar5.f7024a, (String) xVar4.f7024a));
                o0Var2.getClass();
                o0Var2.g(null, rVar2);
                break;
        }
        return p6.x.f8463a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context, String str, String str2, kotlin.jvm.internal.x xVar, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.x xVar2, kotlin.jvm.internal.x xVar3, t6.c cVar) {
        super(2, cVar);
        this.f2251b = x2Var;
        this.f2252l = context;
        this.f2253m = str;
        this.f2254n = str2;
        this.f2256p = xVar;
        this.f2255o = vVar;
        this.f2257q = xVar2;
        this.f2258r = xVar3;
    }
}
