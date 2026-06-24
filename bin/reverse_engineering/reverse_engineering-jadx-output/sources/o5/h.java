package o5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.work.ListenableWorker;
import com.uptodown.UptodownApp;
import com.uptodown.workers.GetUpdatesWorker;
import j5.v;
import o7.a0;
import org.json.JSONObject;
import p6.x;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GetUpdatesWorker f8183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GetUpdatesWorker getUpdatesWorker, t6.c cVar) {
        super(2, cVar);
        this.f8183a = getUpdatesWorker;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new h(this.f8183a, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((a0) obj, (t6.c) obj2)).invokeSuspend(x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        g2 g2VarK;
        String str;
        JSONObject jSONObjectOptJSONObject;
        SharedPreferences sharedPreferences;
        GetUpdatesWorker getUpdatesWorker = this.f8183a;
        Context context = getUpdatesWorker.f3482a;
        p6.a.e(obj);
        try {
            context.getClass();
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                return ListenableWorker.Result.success();
            }
            int i = z4.c.f11961a;
            v vVar = new v(context, 0);
            context.getClass();
            try {
                sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            boolean z9 = sharedPreferences.contains("updates_active") ? sharedPreferences.getBoolean("updates_active", true) : true;
            if (z9) {
                g2VarK = vVar.k("https://t.uptodown.app:443/eapi/v3/tracker/updates/".concat(string), null, ShareTarget.METHOD_GET, false);
                getUpdatesWorker.f3483b.G("getUpdates", null, g2VarK, getUpdatesWorker.getInputData().getString("source"));
            } else {
                g2VarK = new g2();
                g2VarK.f11204b = 404;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", 1);
                g2VarK.f11203a = jSONObject.toString();
                g2VarK.f11206d = jSONObject;
            }
            if (vVar.c(g2VarK) && (str = g2VarK.f11203a) != null && str.length() != 0) {
                String str2 = g2VarK.f11203a;
                str2.getClass();
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.optInt("success") == 1 && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null) {
                    GetUpdatesWorker.b(getUpdatesWorker, jSONObjectOptJSONObject);
                }
            } else if (g2VarK.f11204b == 404) {
                j5.g gVarL = j5.g.D.l(context);
                gVarL.b();
                if (!gVarL.a0().isEmpty()) {
                    gVarL.u();
                }
                gVarL.c();
                p.a(context, null);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("newUpdatesAvailableCount", getUpdatesWorker.f3484c);
            UptodownApp.f3289c0.send(601, bundle);
            return ListenableWorker.Result.success();
        } catch (Exception e10) {
            e10.printStackTrace();
            new android.support.v4.media.g(context, 20).F("getUpdatesWorker", e10);
            return ListenableWorker.Result.success();
        }
    }
}
