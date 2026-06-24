package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.work.ListenableWorker;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b4.d;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import f4.c;
import j5.u;
import j5.v;
import java.util.HashMap;
import org.json.JSONObject;
import t0.f;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class SendUserUsageStatsWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3489a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendUserUsageStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3489a = context;
        Activity activity = c.f4875o;
        this.f3489a = f.e(context);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        String str;
        Context context = this.f3489a;
        if (u.b(context)) {
            int iS = z3.s(context, 0, "stats_downloads");
            int iS2 = z3.s(context, 0, "stats_installs");
            int iS3 = z3.s(context, 0, "stats_updates");
            z3.t(0L, context, "stats_time");
            long jA = u.a(context);
            v vVar = new v(context);
            HashMap map = new HashMap();
            map.put("usageTime", String.valueOf(jA));
            map.put("downloads", String.valueOf(iS));
            map.put("installations", String.valueOf(iS2));
            map.put("updates", String.valueOf(iS3));
            map.put("lastUpdate", String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat("/eapi/user-data/native-app-usage"), map, ShareTarget.METHOD_POST, false);
            g2VarK.f11206d = vVar.i(g2VarK, "/eapi/user-data/native-app-usage");
            if (!g2VarK.b() && (str = g2VarK.f11203a) != null && str.length() != 0) {
                String str2 = g2VarK.f11203a;
                str2.getClass();
                if (new JSONObject(str2).optInt("success") == 1) {
                    z3.O(context, 0, "stats_downloads");
                    z3.O(context, 0, "stats_installs");
                    z3.O(context, 0, "stats_updates");
                    z3.Q(0L, context, "stats_time");
                }
            }
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("stats_enabled", false);
            editorEdit.apply();
            float f = UptodownApp.I;
            if (d.p(context, "SendUserUsageStatsWorker")) {
                WorkManager.Companion.getInstance(context).cancelAllWorkByTag("SendUserUsageStatsWorker");
            }
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        resultSuccess.getClass();
        return resultSuccess;
    }
}
