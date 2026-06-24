package b4;

import android.os.Bundle;
import android.telephony.TelephonyManager;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import d7.p;
import e1.c0;
import j5.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import l7.u;
import o7.a0;
import org.json.JSONObject;
import p6.x;
import v6.i;
import x4.g2;
import x4.j0;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UptodownApp f1000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(UptodownApp uptodownApp, t6.c cVar, int i) {
        super(2, cVar);
        this.f999a = i;
        this.f1000b = uptodownApp;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f999a) {
            case 0:
                return new e(this.f1000b, cVar, 0);
            default:
                return new e(this.f1000b, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f999a) {
            case 0:
                e eVar = (e) create(a0Var, cVar);
                x xVar = x.f8464a;
                eVar.invokeSuspend(xVar);
                return xVar;
            default:
                e eVar2 = (e) create(a0Var, cVar);
                x xVar2 = x.f8464a;
                eVar2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        File externalFilesDir;
        JSONObject jSONObject;
        switch (this.f999a) {
            case 0:
                p6.a.e(obj);
                c0 c0Var = j5.g.D;
                UptodownApp uptodownApp = this.f1000b;
                j5.g gVarL = c0Var.l(uptodownApp);
                gVarL.b();
                Iterator it = gVarL.P().iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    r rVar = (r) next;
                    if (rVar.f11356b == null || rVar.f11359n == 0) {
                        gVarL.j(rVar);
                    } else if (!rVar.F.isEmpty()) {
                        Iterator it2 = rVar.F.iterator();
                        it2.getClass();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                next2.getClass();
                                if (((j0) next2).f11236l <= 0) {
                                    gVarL.j(rVar);
                                }
                            }
                        }
                    }
                }
                gVarL.c();
                j5.g gVarL2 = j5.g.D.l(uptodownApp);
                gVarL2.b();
                ArrayList arrayListP = gVarL2.P();
                gVarL2.c();
                h4.a aVar = new h4.a(uptodownApp);
                if (aVar.d()) {
                    File[] externalFilesDirs = uptodownApp.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 1) {
                        externalFilesDir = externalFilesDirs[1];
                    } else {
                        File externalFilesDir2 = uptodownApp.getExternalFilesDir(null);
                        aVar.g();
                        aVar.f();
                        externalFilesDir = externalFilesDir2;
                    }
                } else {
                    externalFilesDir = uptodownApp.getExternalFilesDir(null);
                }
                File file = new File(externalFilesDir, "Apps");
                if (!file.exists()) {
                    file.mkdirs();
                }
                Iterator it3 = c0.m(uptodownApp, file).iterator();
                it3.getClass();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    next3.getClass();
                    File file2 = (File) next3;
                    Iterator it4 = arrayListP.iterator();
                    it4.getClass();
                    boolean z9 = false;
                    while (it4.hasNext()) {
                        Object next4 = it4.next();
                        next4.getClass();
                        r rVar2 = (r) next4;
                        if (rVar2.p() && !rVar2.F.isEmpty()) {
                            Iterator it5 = rVar2.F.iterator();
                            it5.getClass();
                            while (true) {
                                if (it5.hasNext()) {
                                    Object next5 = it5.next();
                                    next5.getClass();
                                    if (u.m0(((j0) next5).f11241q, file2.getAbsolutePath(), false)) {
                                        z9 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (!z9) {
                        file2.delete();
                    }
                }
                break;
            default:
                p6.a.e(obj);
                String country = Locale.getDefault().getCountry();
                z3.g = country;
                UptodownApp uptodownApp2 = this.f1000b;
                if (country == null || country.length() == 0) {
                    Object systemService = uptodownApp2.getSystemService("phone");
                    systemService.getClass();
                    z3.g = ((TelephonyManager) systemService).getNetworkCountryIso();
                }
                String str = z3.g;
                if (str == null || str.length() == 0) {
                    v vVar = new v(uptodownApp2);
                    g2 g2VarK = vVar.k("https://api.country.is/", null, ShareTarget.METHOD_GET, false);
                    g2VarK.f11207d = vVar.i(g2VarK, "api.country.is/");
                    Bundle bundle = new Bundle();
                    if (!g2VarK.b() && (jSONObject = g2VarK.f11207d) != null && !jSONObject.isNull("country")) {
                        String strOptString = jSONObject.optString("country");
                        z3.g = strOptString;
                        bundle.putString("country", strOptString);
                    }
                    bundle.putString("responseCode", String.valueOf(g2VarK.f11205b));
                    new android.support.v4.media.g(uptodownApp2, 20).E(bundle, "countryFromIP");
                }
                break;
        }
        return x.f8464a;
    }
}
