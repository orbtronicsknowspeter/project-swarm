package y2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.documentfile.provider.DocumentFile;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import b2.t1;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.measurement.z5;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadUpdatesWorker;
import e1.f0;
import e1.g1;
import e1.w0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o7.m0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.n0;
import u4.y0;
import x4.j0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class s implements e3.b, o5.e, ViewBinding, t.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static s f11753o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11755b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f11757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f11758n;

    public s(int i) {
        this.f11754a = i;
        switch (i) {
            case 3:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.f11755b = tVar;
                s sVar = new s((s) null, tVar);
                this.f11757m = sVar;
                this.f11756l = sVar.L();
                z5 z5Var = new z5(1);
                this.f11758n = z5Var;
                sVar.N("require", new a9(z5Var));
                ((HashMap) z5Var.f2934a).put("internal.platform", d1.f2536a);
                sVar.N("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                break;
            case 8:
                this.f11755b = m9.c.c();
                this.f11756l = m9.c.e();
                this.f11757m = (l9.a) m9.c.v.getValue();
                this.f11758n = new USRegulationData(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 524287, null);
                break;
            case 9:
                this.f11755b = ShareTarget.METHOD_GET;
                this.f11757m = new g5.f(9);
                break;
            case 18:
                break;
            default:
                this.f11755b = null;
                this.f11756l = null;
                this.f11757m = null;
                this.f11758n = new ArrayDeque();
                break;
        }
    }

    public static final void j(s sVar, String str, String str2) {
        if (l7.u.k0(str2, ".apk", false)) {
            HashMap map = n4.m.f7985a;
            if (map.containsKey(str2)) {
                return;
            }
            FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) sVar.f11757m;
            PackageManager packageManager = fileExplorerActivity.getPackageManager();
            packageManager.getClass();
            PackageInfo packageInfoD = n4.i.d(packageManager, str, 128);
            Drawable drawableLoadIcon = null;
            if ((packageInfoD != null ? packageInfoD.applicationInfo : null) != null) {
                ApplicationInfo applicationInfo = packageInfoD.applicationInfo;
                applicationInfo.getClass();
                applicationInfo.sourceDir = str;
                ApplicationInfo applicationInfo2 = packageInfoD.applicationInfo;
                applicationInfo2.getClass();
                applicationInfo2.publicSourceDir = str;
                ApplicationInfo applicationInfo3 = packageInfoD.applicationInfo;
                applicationInfo3.getClass();
                drawableLoadIcon = applicationInfo3.loadIcon(fileExplorerActivity.getPackageManager());
            }
            if (drawableLoadIcon != null) {
                map.put(str2, drawableLoadIcon);
            }
        }
    }

    public static synchronized s t() {
        try {
            if (f11753o == null) {
                f11753o = new s(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11753o;
    }

    public static s x(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131558531, (ViewGroup) null, false);
        int i = 2131363093;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(viewInflate, 2131363093);
        if (radioGroup != null) {
            i = 2131363605;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363605);
            if (textView != null) {
                i = 2131364394;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364394);
                if (textView2 != null) {
                    return new s((LinearLayout) viewInflate, radioGroup, textView, textView2, 12);
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static s y(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131558586, (ViewGroup) null, false);
        int i = 2131362291;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362291);
        if (imageView != null) {
            i = 2131363637;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363637);
            if (textView != null) {
                i = 2131363656;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363656);
                if (textView2 != null) {
                    return new s((LinearLayout) viewInflate, imageView, textView, textView2, 13);
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public void A(String str, t0.f fVar) {
        if (str == null) {
            com.google.gson.internal.a.i("method == null");
            return;
        }
        if (str.length() == 0) {
            com.google.gson.internal.a.p("method.length() == 0");
            return;
        }
        if (str.equals(ShareTarget.METHOD_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            com.google.gson.internal.a.p(androidx.lifecycle.l.w("method ", str, " must have a request body."));
        } else {
            this.f11755b = str;
        }
    }

    public void B(String str) {
        ((g5.f) this.f11757m).Q(str);
    }

    public void C(b9.q qVar, int i) {
        Class<?> cls = qVar.getClass();
        a4.d0 d0Var = (a4.d0) this.f11755b;
        e6.a aVar = (e6.a) ((Map) ((a3.d) d0Var.f85o).f63b).get(cls);
        if (aVar != null) {
            Object objA = aVar.a(d0Var, (f0.i) this.f11756l);
            c6.e eVar = (c6.e) this.f11757m;
            StringBuilder sb = eVar.f2423a;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            c6.e.c(eVar, objA, i, length);
        }
    }

    public void D(String str) {
        if (str == null) {
            com.google.gson.internal.a.i("url == null");
            return;
        }
        String strConcat = str.regionMatches(true, 0, "ws:", 0, 3) ? "http:".concat(str.substring(3)) : str.regionMatches(true, 0, "wss:", 0, 4) ? "https:".concat(str.substring(4)) : str;
        m8.t tVar = new m8.t();
        m8.u uVarA = tVar.b(null, strConcat) == 1 ? tVar.a() : null;
        if (uVarA != null) {
            this.f11756l = uVarA;
        } else {
            com.google.gson.internal.a.p("unexpected url: ".concat(strConcat));
        }
    }

    public void E(b9.q qVar) {
        c6.a aVar = (c6.a) ((Map) this.f11758n).get(qVar.getClass());
        if (aVar != null) {
            aVar.a(this, qVar);
        } else {
            F(qVar);
        }
    }

    public void F(b9.q qVar) {
        b9.q qVar2 = qVar.f1122b;
        while (qVar2 != null) {
            b9.q qVar3 = qVar2.f1125e;
            qVar2.a(this);
            qVar2 = qVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[Catch: NumberFormatException | JSONException -> 0x0109, NumberFormatException | JSONException -> 0x0109, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0109, blocks: (B:10:0x002f, B:24:0x0063, B:24:0x0063, B:26:0x0070, B:26:0x0070, B:28:0x0082, B:28:0x0082, B:29:0x008b, B:29:0x008b, B:51:0x00fc, B:51:0x00fc, B:33:0x0098, B:33:0x0098, B:35:0x00a5, B:35:0x00a5, B:37:0x00b7, B:37:0x00b7, B:38:0x00c0, B:38:0x00c0, B:42:0x00cc, B:42:0x00cc, B:46:0x00dc, B:46:0x00dc, B:50:0x00f0, B:50:0x00f0), top: B:65:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle G() {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.s.G():android.os.Bundle");
    }

    public com.google.android.gms.internal.measurement.n H(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.f11756l).c(this, nVar);
    }

    public com.google.android.gms.internal.measurement.n I(s sVar, w3... w3VarArr) {
        com.google.android.gms.internal.measurement.n nVarX = com.google.android.gms.internal.measurement.n.f2717c;
        for (w3 w3Var : w3VarArr) {
            nVarX = z3.X(w3Var);
            t1.f0((s) this.f11757m);
            if ((nVarX instanceof com.google.android.gms.internal.measurement.o) || (nVarX instanceof com.google.android.gms.internal.measurement.m)) {
                nVarX = ((com.google.android.gms.internal.measurement.t) this.f11755b).c(sVar, nVarX);
            }
        }
        return nVarX;
    }

    public com.google.android.gms.internal.measurement.n J(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVarC = com.google.android.gms.internal.measurement.n.f2717c;
        Iterator itN = dVar.n();
        while (itN.hasNext()) {
            nVarC = ((com.google.android.gms.internal.measurement.t) this.f11756l).c(this, dVar.p(((Integer) itN.next()).intValue()));
            if (nVarC instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVarC;
    }

    public void K(Bundle bundle) {
        g1 g1Var = (g1) this.f11758n;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesK = g1Var.k();
        e1.t1 t1Var = g1Var.f3875a;
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        int size = bundle2.size();
        String str = (String) this.f11755b;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        f8.a();
                        if (t1Var.f4262m.q(null, f0.R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                w0 w0Var = t1Var.f4264o;
                                e1.t1.m(w0Var);
                                w0Var.f4339o.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                w0 w0Var2 = t1Var.f4264o;
                                e1.t1.m(w0Var2);
                                w0Var2.f4339o.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        w0 w0Var3 = t1Var.f4264o;
                        e1.t1.m(w0Var3);
                        w0Var3.f4339o.c(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f11757m = bundle2;
    }

    public s L() {
        return new s(this, (com.google.android.gms.internal.measurement.t) this.f11756l);
    }

    public boolean M(String str) {
        if (((HashMap) this.f11757m).containsKey(str)) {
            return true;
        }
        s sVar = (s) this.f11755b;
        if (sVar != null) {
            return sVar.M(str);
        }
        return false;
    }

    public void N(String str, com.google.android.gms.internal.measurement.n nVar) {
        s sVar;
        HashMap map = (HashMap) this.f11757m;
        if (!map.containsKey(str) && (sVar = (s) this.f11755b) != null && sVar.M(str)) {
            sVar.N(str, nVar);
        } else {
            if (((HashMap) this.f11758n).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                map.remove(str);
            } else {
                map.put(str, nVar);
            }
        }
    }

    public void O(String str, com.google.android.gms.internal.measurement.n nVar) {
        if (((HashMap) this.f11758n).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f11757m;
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public com.google.android.gms.internal.measurement.n P(String str) {
        HashMap map = (HashMap) this.f11757m;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) map.get(str);
        }
        s sVar = (s) this.f11755b;
        if (sVar != null) {
            return sVar.P(str);
        }
        com.google.gson.internal.a.p(a4.x.C(str, " is not defined"));
        return null;
    }

    @Override // o5.e
    public void a(long j) {
        ((kotlin.jvm.internal.w) this.f11755b).f7023a = j;
    }

    @Override // o5.e
    public void b(long j) {
        ((kotlin.jvm.internal.w) this.f11756l).f7023a = j;
    }

    public String c(int i) {
        if (i == 0) {
            throw null;
        }
        switch (c.j.c(i)) {
            case 0:
                List list = r3.o.f8883a;
                return "SharingNotice";
            case 1:
                List list2 = r3.o.f8883a;
                return "SaleOptOutNotice";
            case 2:
                List list3 = r3.o.f8883a;
                return "SharingOptOutNotice";
            case 3:
                List list4 = r3.o.f8883a;
                return "TargetedAdvertisingOptOutNotice";
            case 4:
                List list5 = r3.o.f8883a;
                return "SensitiveDataProcessingOptOutNotice";
            case 5:
                List list6 = r3.o.f8883a;
                return "SensitiveDataLimitUseNotice";
            case 6:
            default:
                return "";
            case 7:
                List list7 = r3.o.f8883a;
                return "SaleOptOut";
            case 8:
                List list8 = r3.o.f8883a;
                return "SharingOptOut";
            case 9:
                List list9 = r3.o.f8883a;
                return "TargetedAdvertisingOptOut";
            case 10:
                List list10 = r3.o.f8883a;
                return "SensitiveDataProcessing";
            case 11:
                List list11 = r3.o.f8883a;
                return "KnownChildSensitiveDataConsents";
            case 12:
                List list12 = r3.o.f8883a;
                return "PersonalDataConsents";
            case 13:
                List list13 = r3.o.f8883a;
                return "MspaCoveredTransaction";
            case 14:
                List list14 = r3.o.f8883a;
                return "MspaOptOutOptionMode";
            case 15:
                List list15 = r3.o.f8883a;
                return "MspaServiceProviderMode";
        }
    }

    public void d(int i, Object obj) {
        if (i == 0) {
            throw null;
        }
        try {
            ((l3.a) this.f11755b).h(k(), c(i), obj);
        } catch (Exception unused) {
            a.a.h(null, ChoiceError.ERROR_WHILE_SAVING_CONSENT.getMessage(), null, 5);
        }
    }

    @Override // o5.e
    public void e() {
        Bundle bundleE = k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "reconnected");
        DownloadUpdatesWorker downloadUpdatesWorker = (DownloadUpdatesWorker) this.f11757m;
        downloadUpdatesWorker.r(bundleE, downloadUpdatesWorker.f3476c, (j0) this.f11758n);
    }

    public void f(int i, boolean z9) {
        if (i == 0) {
            throw null;
        }
        List<Integer> listD0 = z9 ? q6.m.d0(1, 1, 1) : q6.m.d0(2, 2, 2);
        d(i, listD0);
        ((USRegulationData) this.f11758n).setKnownChildSensitiveDataConsents(listD0);
    }

    public void g(Boolean bool, int i) {
        if (i == 0) {
            throw null;
        }
        Boolean bool2 = Boolean.TRUE;
        int i6 = kotlin.jvm.internal.l.a(bool, bool2) ? 1 : 2;
        ((USRegulationData) this.f11758n).setPersonalDataConsents(kotlin.jvm.internal.l.a(bool, bool2) ? 1 : 2);
        d(i, Integer.valueOf(i6));
    }

    @Override // m6.a
    public Object get() {
        switch (this.f11754a) {
            case 1:
                return new c3.o((n1.f) ((f0.i) this.f11755b).f4811b, (f3.j) ((m6.a) this.f11756l).get(), (t6.h) ((m6.a) this.f11757m).get(), (c3.w0) ((e3.c) this.f11758n).get());
            default:
                return new s((Executor) ((m6.a) this.f11755b).get(), (y.d) ((m6.a) this.f11756l).get(), (n0) ((n0) this.f11757m).get(), (z.c) ((m6.a) this.f11758n).get(), 20);
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f11754a) {
        }
        return (RelativeLayout) this.f11755b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r31v0, types: [d7.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [q6.t] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.util.ArrayList] */
    public void h(List list, boolean z9, d7.l lVar) {
        int i;
        ?? arrayList;
        String strC;
        int i6;
        p6.x xVar;
        Object obj;
        String strC2;
        String str;
        String str2;
        ?? r22;
        int i10;
        String str3;
        Object objL0;
        JSONArray jSONArray;
        i7.d dVarK;
        l8.n nVar = (l8.n) this.f11756l;
        l3.a aVar = (l3.a) this.f11755b;
        USRegulationData uSRegulationData = (USRegulationData) this.f11758n;
        list.getClass();
        l9.a aVar2 = (l9.a) this.f11757m;
        aVar2.getClass();
        int i11 = aVar2.f7262a.getInt("SavedSectionId", 0);
        String str4 = "";
        aVar2.h(l7.u.o0("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i11), false), "");
        try {
            jSONArray = new JSONArray(aVar2.j(62));
            dVarK = t0.f.K(0, jSONArray.length());
            i = 0;
        } catch (JSONException unused) {
            i = 0;
        }
        try {
            arrayList = new ArrayList(q6.n.i0(dVarK, 10));
            Iterator it = dVarK.iterator();
            while (((i7.c) it).f5700l) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(((q6.x) it).nextInt())));
            }
        } catch (JSONException unused2) {
            arrayList = q6.t.f8724a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) obj2).intValue() != i11) {
                arrayList2.add(obj2);
            }
        }
        aVar2.f(62, arrayList2.toString());
        aVar2.f(64, q6.l.x0(arrayList2, "_", null, null, null, 62));
        aVar.b(i11);
        try {
            strC = aVar.c();
            strC.getClass();
        } catch (Exception unused3) {
            a.a.h(null, ChoiceError.ERROR_WHILE_SAVING_CONSENT.getMessage(), null, 5);
            strC = "";
        }
        aVar2.f(63, strC);
        Iterator it2 = list.iterator();
        while (true) {
            int i12 = 16;
            if (!it2.hasNext()) {
                String str5 = str4;
                int i13 = nVar.f7240o.f7219b ? 1 : 2;
                d(14, Integer.valueOf(i13));
                uSRegulationData.setMspaCoveredTransaction(i13);
                String str6 = nVar.f7240o.f7220c;
                if (str6 == null) {
                    xVar = null;
                    i6 = 16;
                } else {
                    int i14 = str6.equals("OPT_OUT") ? 1 : 2;
                    int i15 = str6.equals("SERVICE-PROVIDER") ? 1 : 2;
                    d(15, Integer.valueOf(i14));
                    i6 = 16;
                    d(16, Integer.valueOf(i15));
                    uSRegulationData.setMspaOptOutOptionMode(i14);
                    uSRegulationData.setMspaServiceProviderMode(i15);
                    xVar = p6.x.f8463a;
                }
                if (xVar == null) {
                    d(15, 0);
                    d(i6, 0);
                    int i16 = i;
                    uSRegulationData.setMspaOptOutOptionMode(i16);
                    uSRegulationData.setMspaServiceProviderMode(i16);
                }
                Vector vector = new Vector(null, 1, 0 == true ? 1 : 0);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    j8.b bVar = (j8.b) it3.next();
                    int iIntValue = bVar.f6720a.intValue();
                    if (kotlin.jvm.internal.l.a(bVar.f6722c, Boolean.TRUE)) {
                        vector.set(iIntValue);
                    } else {
                        vector.unset(iIntValue);
                    }
                }
                aVar2.e(71, vector);
                Vector vector2 = new Vector(null, 1, 0 == true ? 1 : 0);
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next = it4.next();
                        if (((j8.b) next).f6720a.intValue() == q6.j.i0(j8.e.f6732b)) {
                            obj = next;
                        }
                    } else {
                        obj = null;
                    }
                }
                j8.b bVar2 = (j8.b) obj;
                if (bVar2 != null && (r22 = bVar2.f) != 0) {
                    for (j8.c cVar : r22) {
                        int iIntValue2 = cVar.f6726b.intValue();
                        if (kotlin.jvm.internal.l.a(cVar.f6728d, Boolean.TRUE)) {
                            vector2.set(iIntValue2);
                        } else {
                            vector2.unset(iIntValue2);
                        }
                    }
                }
                aVar2.e(72, vector2);
                m9.c.i = aVar;
                try {
                    strC2 = aVar.c();
                    strC2.getClass();
                } catch (Exception unused4) {
                    a.a.h(null, ChoiceError.ERROR_WHILE_SAVING_CONSENT.getMessage(), null, 5);
                    strC2 = str5;
                }
                uSRegulationData.setGppString(strC2);
                uSRegulationData.setVersion(1);
                aVar2.c(68, o());
                aVar.d();
                aVar2.f(61, String.valueOf(1));
                aVar2.f(62, aVar.f().toString());
                aVar2.f(64, q6.l.x0(aVar.f(), "_", null, null, null, 62));
                String strO0 = l7.u.o0("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(o()), false);
                try {
                    String strC3 = aVar.e(k()).c();
                    strC3.getClass();
                    str = strC3;
                } catch (Exception unused5) {
                    str = str5;
                }
                aVar2.h(strO0, str);
                aVar2.f(63, uSRegulationData.getGppString());
                int i17 = j8.e.j;
                if (i17 == 1) {
                    str2 = "NATIONAL";
                } else {
                    if (i17 != 2) {
                        throw null;
                    }
                    str2 = "STATE_AND_NATIONAL";
                }
                aVar2.f(69, str2);
                aVar2.f(70, t1.f946b);
                lVar.invoke(uSRegulationData);
                return;
            }
            j8.b bVar3 = (j8.b) it2.next();
            Integer num = bVar3.f6720a;
            boolean z10 = bVar3.g;
            switch (num.intValue()) {
                case 1:
                    i10 = 9;
                    break;
                case 2:
                    i10 = 8;
                    break;
                case 3:
                    i10 = 10;
                    break;
                case 4:
                    i10 = 13;
                    break;
                case 5:
                    i10 = 11;
                    break;
                case 6:
                    i10 = 12;
                    break;
                default:
                    i10 = 17;
                    break;
            }
            switch (c.j.c(i10)) {
                case 7:
                    str3 = str4;
                    int i18 = z9 ? 1 : 2;
                    d(2, Integer.valueOf(i18));
                    uSRegulationData.setSaleOptOutNotice(i18);
                    Integer numValueOf = Integer.valueOf(z9 ? kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE) ? 1 : 2 : i);
                    uSRegulationData.setSaleOptOut(kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE) ? 1 : 2);
                    d(i10, numValueOf);
                    break;
                case 8:
                    str3 = str4;
                    if (z10) {
                        p(z9);
                    } else {
                        q(z9);
                        if (c(i10).length() > 0) {
                            Integer numValueOf2 = Integer.valueOf(z9 ? kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE) ? 1 : 2 : i);
                            uSRegulationData.setSharingOptOut(z9 ? kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE) ? 1 : 2 : i);
                            d(i10, numValueOf2);
                        }
                    }
                    break;
                case 9:
                    str3 = str4;
                    if (c(i10).length() > 0) {
                        r(z9);
                        Integer numValueOf3 = Integer.valueOf(z9 ? kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE) ? 1 : 2 : i);
                        uSRegulationData.setTargetedAdvertisingOptOut(z9 ? kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE) ? 1 : 2 : i);
                        d(i10, numValueOf3);
                    }
                    break;
                case 10:
                    ?? r15 = bVar3.f;
                    if (r15 == 0) {
                        objL0 = 0;
                        str3 = str4;
                    } else {
                        l(z9);
                        i(z9);
                        int[] iArr = new int[16];
                        for (int i19 = i; i19 < 16; i19++) {
                            iArr[i19] = i;
                        }
                        Iterator it5 = r15.iterator();
                        while (it5.hasNext()) {
                            j8.c cVar2 = (j8.c) it5.next();
                            Iterator it6 = it5;
                            Integer num2 = cVar2.f6726b;
                            String str7 = str4;
                            i7.d dVar = new i7.d(1, i12, 1);
                            int iIntValue3 = num2.intValue();
                            if (1 <= iIntValue3 && iIntValue3 <= dVar.f5696b) {
                                int iIntValue4 = num2.intValue() - 1;
                                Boolean bool = cVar2.f6728d;
                                if (bool == null) {
                                    bool = bVar3.f6722c;
                                }
                                iArr[iIntValue4] = kotlin.jvm.internal.l.a(bool, Boolean.TRUE) ? 1 : 2;
                            }
                            it5 = it6;
                            str4 = str7;
                            i12 = 16;
                        }
                        str3 = str4;
                        objL0 = q6.j.l0(iArr);
                        uSRegulationData.setSensitiveDataProcessing(q6.j.l0(iArr));
                    }
                    d(i10, objL0);
                    break;
                case 11:
                    f(i10, kotlin.jvm.internal.l.a(bVar3.f6722c, Boolean.TRUE));
                    continue;
                case 12:
                    if (!z10) {
                        if (c(i10).length() > 0) {
                            g(bVar3.f6722c, i10);
                        } else {
                            continue;
                        }
                    }
                    break;
            }
            str4 = str3;
        }
    }

    public void i(boolean z9) {
        int i = z9 ? 1 : 2;
        d(6, Integer.valueOf(i));
        ((USRegulationData) this.f11758n).setSensitiveDataLimitUseNotice(i);
    }

    public String k() {
        return "usnat";
    }

    public void l(boolean z9) {
        int i = z9 ? 1 : 2;
        d(5, Integer.valueOf(i));
        ((USRegulationData) this.f11758n).setSensitiveDataProcessingOptOutNotice(i);
    }

    public void m(b9.q qVar) {
        if (qVar.f1125e != null) {
            s();
            ((c6.e) this.f11757m).a('\n');
        }
    }

    public m8.a0 n() {
        if (((m8.u) this.f11756l) != null) {
            return new m8.a0(this);
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("url == null");
        return null;
    }

    public int o() {
        return 7;
    }

    public void p(boolean z9) {
        int i = z9 ? 1 : 2;
        d(1, Integer.valueOf(i));
        ((USRegulationData) this.f11758n).setSharingNotice(i);
    }

    public void q(boolean z9) {
        int i = z9 ? 1 : 2;
        d(3, Integer.valueOf(i));
        ((USRegulationData) this.f11758n).setSharingOptOutNotice(i);
    }

    public void r(boolean z9) {
        int i = z9 ? 1 : 2;
        d(4, Integer.valueOf(i));
        ((USRegulationData) this.f11758n).setTargetedAdvertisingOptOutNotice(i);
    }

    public void s() {
        c6.e eVar = (c6.e) this.f11757m;
        StringBuilder sb = eVar.f2423a;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        eVar.a('\n');
    }

    public boolean u(Context context) {
        if (((Boolean) this.f11757m) == null) {
            this.f11757m = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f11756l).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11757m).booleanValue();
    }

    public boolean v(Context context) {
        if (((Boolean) this.f11756l) == null) {
            this.f11756l = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f11756l).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f11756l).booleanValue();
    }

    public void w(String str, String str2) {
        g5.f fVar = (g5.f) this.f11757m;
        fVar.getClass();
        g5.f.v(str, str2);
        fVar.Q(str);
        fVar.o(str, str2);
    }

    public int z() {
        return ((c6.e) this.f11757m).f2423a.length();
    }

    public /* synthetic */ s(boolean z9) {
        this.f11754a = 9;
    }

    public s(g1 g1Var, String str) {
        this.f11754a = 5;
        this.f11758n = g1Var;
        k0.y.d(str);
        this.f11755b = str;
        this.f11756l = new Bundle();
    }

    public s(s sVar, com.google.android.gms.internal.measurement.t tVar) {
        this.f11754a = 4;
        this.f11757m = new HashMap();
        this.f11758n = new HashMap();
        this.f11755b = sVar;
        this.f11756l = tVar;
    }

    public s(DocumentFile documentFile, File file, FileExplorerActivity fileExplorerActivity, android.support.v4.media.g gVar) {
        this.f11754a = 7;
        this.f11755b = documentFile;
        this.f11756l = file;
        this.f11757m = fileExplorerActivity;
        this.f11758n = gVar;
        v7.e eVar = m0.f8288a;
        o7.c0.s(o7.c0.b(v7.d.f10884a), null, null, new j4.q(this, null, 0), 3);
    }

    public s(Context context, y0 y0Var, x4.j jVar) {
        this.f11754a = 11;
        y0Var.getClass();
        jVar.getClass();
        this.f11755b = context;
        this.f11756l = y0Var;
        this.f11757m = jVar;
        this.f11758n = new ArrayList();
    }

    public s(a4.d0 d0Var, f0.i iVar, c6.e eVar, Map map, q2.e eVar2) {
        this.f11754a = 2;
        this.f11755b = d0Var;
        this.f11756l = iVar;
        this.f11757m = eVar;
        this.f11758n = map;
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11754a = i;
        this.f11755b = obj;
        this.f11756l = obj2;
        this.f11757m = obj3;
        this.f11758n = obj4;
    }
}
