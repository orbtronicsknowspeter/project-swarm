package g5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import b2.t1;
import c4.t0;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.model.ChoiceError;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.PublicListActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import e4.q0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.f1;
import x4.d1;
import x4.k2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements a4.i, j1.f, j1.e, j1.c, SearchView.OnQueryTextListener, t.b, w4.d, w4.h, w1.b, x1.a, j1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5316b;

    public g(Context context) {
        boolean zIsEmpty;
        this.f5315a = 20;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f5316b = sharedPreferences;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                s();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public static String B(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static h9.a k(JSONObject jSONObject) {
        p6.x xVar;
        if (jSONObject == null) {
            xVar = null;
        } else {
            try {
                String strOptString = jSONObject.optString("initScreenSettingsButton");
                String strOptString2 = jSONObject.optString("initScreenRejectButton");
                String strOptString3 = jSONObject.optString("privacyBody");
                String strOptString4 = jSONObject.optString("secondScreenPrivacyBody");
                String strOptString5 = jSONObject.optString("privacyHeader");
                ArrayList arrayListU = u(jSONObject);
                strOptString.getClass();
                strOptString2.getClass();
                strOptString3.getClass();
                strOptString5.getClass();
                strOptString4.getClass();
                return new h9.a(strOptString, strOptString2, strOptString3, strOptString5, strOptString4, arrayListU);
            } catch (JSONException e10) {
                a.a.h("TranslationsTextResolver", "Error in parsing AdvancedUILabels", e10, 8);
                xVar = p6.x.f8464a;
            }
        }
        if (xVar == null) {
            a.a.g("TranslationsTextResolver", "AdvancedUILabels not present");
        }
        return new h9.a((String) null, (String) null, (String) null, (String) null, (List) null, 63);
    }

    public static h9.e m(JSONObject jSONObject) {
        p6.x xVar;
        if (jSONObject == null) {
            xVar = null;
        } else {
            try {
                String strOptString = jSONObject.optString("initScreenSettingsButton");
                strOptString.getClass();
                String strOptString2 = jSONObject.optString("action1");
                strOptString2.getClass();
                String strOptString3 = jSONObject.optString("action2");
                strOptString3.getClass();
                String strOptString4 = jSONObject.optString("privacyBody");
                strOptString4.getClass();
                String strOptString5 = jSONObject.optString("secondScreenPrivacyBody");
                strOptString5.getClass();
                String strOptString6 = jSONObject.optString("privacyHeader");
                strOptString6.getClass();
                return new h9.e(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, u(jSONObject));
            } catch (JSONException e10) {
                a.a.h("TranslationsTextResolver", "Error in parsing ConsentOrPayUILabels", e10, 8);
                xVar = p6.x.f8464a;
            }
        }
        if (xVar == null) {
            a.a.g("TranslationsTextResolver", "ConsentOrPayUILabels not present");
        }
        return new h9.e((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127);
    }

    public static h9.k n(JSONObject jSONObject) {
        p6.x xVar;
        if (jSONObject == null) {
            xVar = null;
        } else {
            try {
                String strOptString = jSONObject.optString("doneLabel");
                String strOptString2 = jSONObject.optString("searchLabel");
                String strOptString3 = jSONObject.optString("cancelLabel");
                String strOptString4 = jSONObject.optString("consentLabel");
                String strOptString5 = jSONObject.optString("flexPurposesLabel");
                String strOptString6 = jSONObject.optString("cookieAccessBodyText");
                String strOptString7 = jSONObject.optString("showVendorsLabel");
                String strOptString8 = jSONObject.optString("showIabLabel");
                String strOptString9 = jSONObject.optString("noneLabel");
                String strOptString10 = jSONObject.optString("someLabel");
                String strOptString11 = jSONObject.optString("allLabel");
                String strOptString12 = jSONObject.optString("closeLabel");
                String strOptString13 = jSONObject.optString("allVendorsLabel");
                ArrayList arrayListQ = d0.b.q(jSONObject, "summaryScreenBodyRejectService");
                ArrayList arrayListQ2 = d0.b.q(jSONObject, "summaryScreenBodyTextReject");
                ArrayList arrayListQ3 = d0.b.q(jSONObject, "summaryScreenBodyTextRejectNew");
                strOptString.getClass();
                strOptString2.getClass();
                strOptString3.getClass();
                strOptString7.getClass();
                strOptString8.getClass();
                strOptString4.getClass();
                strOptString5.getClass();
                strOptString6.getClass();
                strOptString9.getClass();
                strOptString10.getClass();
                strOptString11.getClass();
                strOptString12.getClass();
                strOptString13.getClass();
                return new h9.k(strOptString, strOptString2, strOptString3, strOptString7, strOptString8, strOptString4, strOptString5, strOptString6, strOptString9, strOptString10, strOptString11, strOptString12, strOptString13, arrayListQ, arrayListQ2, arrayListQ3);
            } catch (JSONException e10) {
                a.a.h("TranslationsTextResolver", "Error in parsing MobileUiLabels", e10, 8);
                xVar = p6.x.f8464a;
            }
        }
        if (xVar == null) {
            a.a.g("TranslationsTextResolver", "MobileUiLabels not present");
        }
        return new h9.k();
    }

    public static String o(int i, int i6, byte[] bArr) {
        if (i6 < 0) {
            return null;
        }
        int iX = x((i6 * 4) + 36, bArr) + i;
        int i10 = ((bArr[iX + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[iX] & 255);
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr2[i11] = bArr[(i11 * 2) + iX + 2];
        }
        return new String(bArr2, l7.a.f7152a);
    }

    public static h9.p p(JSONObject jSONObject) {
        p6.x xVar;
        if (jSONObject == null) {
            xVar = null;
        } else {
            try {
                String strOptString = jSONObject.optString("uspDnsTitle");
                strOptString.getClass();
                ArrayList arrayListQ = d0.b.q(jSONObject, "uspDnsText");
                String strOptString2 = jSONObject.optString("uspPrivacyPolicyLinkText");
                strOptString2.getClass();
                String strOptString3 = jSONObject.optString("uspDeleteDataLinkText");
                strOptString3.getClass();
                String strOptString4 = jSONObject.optString("uspAccessDataLinkText");
                strOptString4.getClass();
                return new h9.p(strOptString, arrayListQ, strOptString2, strOptString3, strOptString4, 787);
            } catch (JSONException e10) {
                a.a.h("TranslationsTextResolver", "Error in parsing PremiumUiLabels", e10, 8);
                xVar = p6.x.f8464a;
            }
        }
        if (xVar == null) {
            a.a.g("TranslationsTextResolver", "PremiumUiLabels not present");
        }
        return new h9.p(null, null, null, null, null, 1023);
    }

    public static ArrayList u(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("customFooterLinks");
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                int i6 = i + 1;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                jSONObject2.getClass();
                String strOptString = jSONObject2.optString("label");
                strOptString.getClass();
                String strOptString2 = jSONObject2.optString("link");
                strOptString2.getClass();
                arrayList.add(new h9.q(strOptString, strOptString2));
                i = i6;
            }
            return arrayList;
        } catch (Exception unused) {
            a.a.g("ChoiceCMP", "COP publisher link is null");
            return arrayList;
        }
    }

    public static int x(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[i + 2] << 16) & 16711680) | ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    public void A(int i, String str) {
        String strConcat = "                                             ".substring(0, (int) Math.min(i * 2, 45)).concat(str);
        StringBuilder sb = (StringBuilder) this.f5316b;
        sb.append(strConcat);
        sb.append('\n');
    }

    public void C() {
        synchronized (((m8.g) this.f5316b)) {
        }
    }

    @Override // x1.a
    public void a(y1.o oVar) {
        this.f5316b = oVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // w4.d
    public void b(x4.g gVar) {
        u4.d dVar = (u4.d) this.f5316b;
        gVar.getClass();
        float f = UptodownApp.I;
        if (b4.d.t() && dVar.getContext() != null && (dVar.getActivity() instanceof c4.k0)) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(dVar);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(lifecycleScope, t7.n.f10349a, null, new u4.b(dVar, gVar, null, 1), 2);
        }
    }

    @Override // j1.f
    public void c(Object obj) {
        ((CountDownLatch) this.f5316b).countDown();
    }

    @Override // w4.d
    public void d(x4.g gVar, int i) {
        u4.d dVar = (u4.d) this.f5316b;
        gVar.getClass();
        float f = UptodownApp.I;
        if (b4.d.t()) {
            long j = gVar.f11159a;
            String str = gVar.F;
            Context contextRequireContext = dVar.requireContext();
            contextRequireContext.getClass();
            d0.b.t(j, contextRequireContext, str);
            q0 q0Var = dVar.f10449l;
            if (q0Var != null) {
                q0Var.notifyItemChanged(i);
            }
        }
    }

    @Override // w4.h
    public void e() {
        f1 f1Var = (f1) this.f5316b;
        float f = UptodownApp.I;
        if (b4.d.t()) {
            FragmentActivity activity = f1Var.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                FragmentActivity fragmentActivityRequireActivity = f1Var.requireActivity();
                fragmentActivityRequireActivity.getClass();
                String string = f1Var.getString(R.string.url_turbo);
                string.getClass();
                j5.c.e(fragmentActivityRequireActivity, string, f1Var.getString(R.string.uptodown_turbo));
            }
        }
    }

    @Override // j1.c
    public void f() {
        ((CountDownLatch) this.f5316b).countDown();
    }

    @Override // w1.b
    public void g(Bundle bundle, String str) {
        y1.o oVar = (y1.o) this.f5316b;
        if (oVar != null) {
            try {
                String str2 = "$A$:" + B(bundle, str);
                y1.q qVar = oVar.f11655a;
                qVar.f11669o.f11909a.a(new y1.p(qVar, System.currentTimeMillis() - qVar.f11663d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // m6.a
    public Object get() {
        switch (this.f5315a) {
            case 11:
                return new b5.m((Context) ((f) this.f5316b).f5310b, new q2.e(2), new q2.e(1), 21);
            default:
                String packageName = ((Context) ((m6.a) this.f5316b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                com.google.gson.internal.a.i("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }

    @Override // a4.i
    public void h(Exception exc) {
        exc.getClass();
    }

    @Override // j1.e
    public void i(Exception exc) {
        ((CountDownLatch) this.f5316b).countDown();
    }

    @Override // w4.h
    public void j(long j) {
        f1 f1Var = (f1) this.f5316b;
        float f = UptodownApp.I;
        if (b4.d.t()) {
            FragmentActivity activity = f1Var.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                f1Var.a().f9932o.setVisibility(0);
                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(f1Var), null, null, new c4.c(f1Var, j, null, 2), 3);
            }
        }
    }

    public Object l(String str) {
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            ((k9.a) this.f5316b).getClass();
            return new h9.t(k9.a.a(str), p(jSONObject.optJSONObject("premiumUiLabels")), n(jSONObject.optJSONObject("mobileUiLabels")), m(jSONObject.optJSONObject("consentOrPay")), k(jSONObject.optJSONObject("advanced")));
        } catch (JSONException unused) {
            ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
            if (callback != null) {
                callback.onCmpError(ChoiceError.INVALID_JSON_FORMAT);
            }
            return new h9.t();
        }
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        str.getClass();
        n.d dVar = (n.d) this.f5316b;
        c.h hVar = dVar.F;
        if (hVar == null) {
            kotlin.jvm.internal.l.i("switchAdapter");
            throw null;
        }
        n.e eVar = dVar.D;
        if (eVar == null) {
            kotlin.jvm.internal.l.i("viewModel");
            throw null;
        }
        ArrayList arrayListB = eVar.b(str);
        boolean z9 = str.length() > 0;
        hVar.f1155a = arrayListB;
        if (!z9) {
            hVar.a();
        }
        hVar.notifyDataSetChanged();
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }

    @Override // a4.i
    public void onSuccess() {
        TvAppDetailFragment tvAppDetailFragment = (TvAppDetailFragment) this.f5316b;
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(tvAppDetailFragment), null, null, new e(tvAppDetailFragment, null, 3), 3);
    }

    @Override // j1.h
    public j1.p q(Object obj) {
        g2.d dVar = (g2.d) obj;
        m8.q qVar = (m8.q) this.f5316b;
        if (dVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return t1.x(null);
        }
        y1.l lVar = (y1.l) qVar.f7782l;
        y1.l.a(lVar);
        lVar.f11644m.o(null, lVar.f11641e.f11909a);
        lVar.f11648q.c(null);
        return t1.x(null);
    }

    public void r(byte[] bArr) {
        int iX = (x(16, bArr) * 4) + 36;
        int iX2 = x(12, bArr);
        int i = iX2;
        while (true) {
            if (i >= bArr.length - 4) {
                break;
            }
            if (x(i, bArr) == 1048834) {
                iX2 = i;
                break;
            }
            i += 4;
        }
        int i6 = 0;
        while (iX2 < bArr.length) {
            int iX3 = x(iX2, bArr);
            int iX4 = x(iX2 + 20, bArr);
            switch (iX3) {
                case 1048834:
                    int iX5 = x(iX2 + 28, bArr);
                    iX2 += 36;
                    String strO = o(iX, iX4, bArr);
                    StringBuilder sb = new StringBuilder();
                    for (int i10 = 0; i10 < iX5; i10++) {
                        int iX6 = x(iX2 + 4, bArr);
                        int iX7 = x(iX2 + 8, bArr);
                        int iX8 = x(iX2 + 16, bArr);
                        iX2 += 20;
                        sb.append(" " + o(iX, iX6, bArr) + "=\"" + (iX7 != -1 ? o(iX, iX7, bArr) : String.valueOf(iX8)) + "\"");
                    }
                    A(i6, "<" + strO + ((Object) sb) + ">");
                    i6++;
                    break;
                case 1048835:
                    i6--;
                    iX2 += 24;
                    A(i6, "</" + o(iX, iX4, bArr) + ">");
                    break;
                default:
                    return;
            }
        }
    }

    public synchronized void s() {
        ((SharedPreferences) this.f5316b).edit().clear().commit();
    }

    @Override // w4.h
    public void t(long j, String str) {
        f1 f1Var = (f1) this.f5316b;
        float f = UptodownApp.I;
        if (b4.d.t()) {
            FragmentActivity activity = f1Var.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                w2 w2Var = new w2();
                w2Var.f11432a = String.valueOf(j);
                w2Var.f11435m = str;
                Intent intent = new Intent(f1Var.requireContext(), (Class<?>) PublicListActivity.class);
                intent.putExtra("user", w2Var);
                FragmentActivity fragmentActivityRequireActivity = f1Var.requireActivity();
                fragmentActivityRequireActivity.getClass();
                f1Var.startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
            }
        }
    }

    @Override // w4.h
    public void v(d1 d1Var) {
        f1 f1Var = (f1) this.f5316b;
        float f = UptodownApp.I;
        if (b4.d.t()) {
            FragmentActivity activity = f1Var.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                k2 k2Var = new k2();
                k2Var.f11259a = d1Var.A;
                k2Var.f11260b = String.valueOf(d1Var.f11102t);
                k2Var.f11261l = d1Var.f11095m;
                k2Var.f11271w = d1Var.f11101s;
                k2Var.f11264o = d1Var.f11103u;
                k2Var.v = d1Var.f11098p;
                k2Var.f11265p = d1Var.v;
                k2Var.f11262m = d1Var.f11099q;
                k2Var.f11267r = d1Var.f11100r;
                k2Var.f11270u = d1Var.C;
                k2Var.f11268s = d1Var.G;
                k2Var.f11272x = 1;
                k2Var.f11263n = d1Var.B;
                Intent intent = new Intent(f1Var.requireContext(), (Class<?>) RepliesActivity.class);
                intent.putExtra("review", k2Var);
                intent.putExtra("appId", d1Var.B);
                intent.putExtra("appName", d1Var.C);
                intent.putExtra("appIconUrl", d1Var.F);
                intent.putExtra("appUrl", d1Var.D);
                FragmentActivity fragmentActivityRequireActivity = f1Var.requireActivity();
                fragmentActivityRequireActivity.getClass();
                f1Var.startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
            }
        }
    }

    @Override // w4.h
    public void w(long j) {
        f1 f1Var = (f1) this.f5316b;
        float f = UptodownApp.I;
        if (b4.d.t()) {
            FragmentActivity activity = f1Var.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                t0 t0VarB = f1Var.b();
                Context contextRequireContext = f1Var.requireContext();
                contextRequireContext.getClass();
                String strValueOf = String.valueOf(j);
                t0VarB.getClass();
                strValueOf.getClass();
                o7.a0 viewModelScope = ViewModelKt.getViewModelScope(t0VarB);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(t0VarB, contextRequireContext, strValueOf, (t6.c) null, 4), 2);
            }
        }
    }

    public void y(g2.e eVar, Thread thread, Throwable th) {
        y1.l lVar = (y1.l) this.f5316b;
        synchronized (lVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            t1.H();
            try {
                y1.z.a(lVar.f11641e.f11909a.b(new y1.j(lVar, System.currentTimeMillis(), th, thread, eVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    @Override // w4.h
    public void z(long j, String str) {
        f1 f1Var = (f1) this.f5316b;
        float f = UptodownApp.I;
        if (b4.d.t() && (f1Var.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = f1Var.getActivity();
            activity.getClass();
            ((MainActivity) activity).j0(j, str);
        }
    }

    public /* synthetic */ g(int i, boolean z9) {
        this.f5315a = i;
    }

    public /* synthetic */ g(Object obj, int i) {
        this.f5315a = i;
        this.f5316b = obj;
    }

    public g(f0.i iVar, m8.q qVar) {
        this.f5315a = 10;
        this.f5316b = qVar;
        iVar.n(new q1.c(this, 1));
    }

    public g(k9.a aVar) {
        this.f5315a = 5;
        aVar.getClass();
        this.f5316b = aVar;
    }

    public g(int i) {
        this.f5315a = i;
        switch (i) {
            case 3:
                this.f5316b = new CountDownLatch(1);
                break;
            case 9:
                this.f5316b = new StringBuilder();
                break;
            default:
                this.f5316b = new f(4);
                break;
        }
    }
}
