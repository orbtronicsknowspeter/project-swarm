package com.uptodown.workers;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.l;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import b2.t1;
import b4.d;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import e1.c0;
import j5.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import l7.u;
import o5.p;
import org.json.JSONArray;
import org.json.JSONObject;
import x4.e;
import x4.j0;
import x4.q2;
import x4.r;
import x4.s1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class GetUpdatesWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUpdatesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3483a = context;
        this.f3484b = new g(context, 20);
    }

    public static final void b(GetUpdatesWorker getUpdatesWorker, JSONObject jSONObject) {
        Cursor cursorQuery;
        s1 s1Var;
        Uri uriFromFile;
        c0 c0Var = j5.g.D;
        Context context = getUpdatesWorker.f3483a;
        j5.g gVarL = c0Var.l(context);
        gVarL.b();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("updates");
        int i = 0;
        if (jSONArrayOptJSONArray != null) {
            arrayList.addAll(getUpdatesWorker.d(jSONArrayOptJSONArray, gVarL, false));
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("partialUpdates");
        if (jSONArrayOptJSONArray2 != null) {
            JSONArray jSONArray = new JSONArray();
            int length = jSONArrayOptJSONArray2.length();
            int i6 = 0;
            while (i6 < length) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i6);
                if (jSONArrayOptJSONArray != null) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i10 = i; i10 < length2; i10++) {
                        if (u.m0(jSONObject2.optString("packagename"), jSONArrayOptJSONArray.getJSONObject(i10).optString("packagename"), true)) {
                            break;
                        }
                    }
                    jSONArray.put(jSONObject2);
                } else {
                    jSONArray.put(jSONObject2);
                }
                i6++;
                i = 0;
            }
            arrayList.addAll(getUpdatesWorker.d(jSONArray, gVarL, true));
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            if (u.m0(context.getPackageName(), ((q2) next).f11345b, true)) {
                z9 = true;
            }
        }
        Iterator it2 = gVarL.a0().iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            String str = ((q2) next2).f11345b;
            Iterator it3 = arrayList.iterator();
            it3.getClass();
            while (true) {
                if (!it3.hasNext()) {
                    gVarL.s(str);
                    break;
                }
                Object next3 = it3.next();
                next3.getClass();
                if (u.m0(str, ((q2) next3).f11345b, true)) {
                    break;
                }
            }
        }
        gVarL.c();
        if (z3.p(context, "is_status_code_526", false)) {
            if (o.a(context)) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
                builder.setSmallIcon(R.drawable.vector_uptodown_notification);
                String string = context.getString(R.string.new_update_available);
                string.getClass();
                builder.setContentTitle(string);
                String string2 = context.getString(R.string.dialog_updates_available);
                string2.getClass();
                builder.setContentText(string2);
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                    if (sharedPreferences.contains("url_526")) {
                        string = sharedPreferences.getString("url_526", null);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (string != null) {
                    builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(string)), 201326592));
                }
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).notify(264, builder.build());
                o.k(string, String.valueOf(System.currentTimeMillis()), string2, null, null, context);
            }
            if (z9) {
                float f = UptodownApp.I;
                if (d.p(context, "GenerateQueueWorker")) {
                    return;
                }
                WorkManager.Companion.getInstance(context).enqueue(((OneTimeWorkRequest.Builder) l.t(GenerateQueueWorker.class, "GenerateQueueWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", true).putBoolean("downloadUptodown", true).build()).build());
                return;
            }
            return;
        }
        if (z3.p(context, "install_apk_rooted", false) || z3.h(context)) {
            float f10 = UptodownApp.I;
            if (!d.p(context, "GenerateQueueWorker")) {
                WorkManager.Companion.getInstance(context).enqueue(((OneTimeWorkRequest.Builder) l.t(GenerateQueueWorker.class, "GenerateQueueWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", false).putString("packagename", null).build()).build());
            }
        } else {
            o.l(context);
            p.a(context, null);
        }
        if (z9) {
            gVarL.b();
            String packageName = context.getPackageName();
            packageName.getClass();
            q2 q2VarY = gVarL.Y(packageName);
            gVarL.c();
            r rVar = q2VarY != null ? q2VarY.f11353s : null;
            if (rVar == null || !rVar.c()) {
                UptodownApp.f3290c0.send(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, null);
                return;
            }
            j5.g gVarL2 = j5.g.D.l(context);
            gVarL2.b();
            try {
                SQLiteDatabase sQLiteDatabase = gVarL2.f6674a;
                sQLiteDatabase.getClass();
                cursorQuery = sQLiteDatabase.query("notifications", gVarL2.f6683s, "actions=?", new String[]{"update_uptodown"}, null, null, "id DESC");
                try {
                    if (cursorQuery.moveToFirst()) {
                        s1 s1Var2 = new s1();
                        s1Var2.a(cursorQuery);
                        s1Var = s1Var2;
                    } else {
                        s1Var = null;
                    }
                    try {
                        cursorQuery.close();
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    s1Var = null;
                }
            } catch (Exception e13) {
                e = e13;
                cursorQuery = null;
                s1Var = null;
            }
            gVarL2.c();
            if ((s1Var != null ? s1Var.f11386b : null) == null || rVar.F.isEmpty() || ((j0) rVar.F.get(0)).f11241q == null) {
                return;
            }
            String str2 = ((j0) rVar.F.get(0)).f11241q;
            str2.getClass();
            File file = new File(str2);
            if (file.exists()) {
                String str3 = s1Var.f11386b;
                str3.getClass();
                if (System.currentTimeMillis() - Long.parseLong(str3) > 604800000) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        uriFromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
                        uriFromFile.getClass();
                    } else {
                        uriFromFile = Uri.fromFile(file);
                        uriFromFile.getClass();
                    }
                    o.j(context, uriFromFile);
                }
            }
        }
    }

    public final void c(q2 q2Var) {
        ArrayList arrayList = q2Var.f11354t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = q2Var.f11354t;
        arrayList2.getClass();
        ArrayList arrayListC = x4.p.c(this.f3483a, arrayList2);
        if (arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("update", 1);
            bundle.putString("feature", (String) next);
            this.f3484b.E(bundle, "required_features_not_supported");
        }
    }

    public final ArrayList d(JSONArray jSONArray, j5.g gVar, boolean z9) {
        q2 q2VarG;
        int applicationEnabledSetting;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (!jSONObjectOptJSONObject.isNull("packagename")) {
                String strOptString = jSONObjectOptJSONObject.optString("packagename");
                strOptString.getClass();
                e eVarB = gVar.B(strOptString);
                if (eVarB != null && (q2VarG = t1.G(eVarB, jSONObjectOptJSONObject)) != null) {
                    if (z9) {
                        q2VarG.f11350p = 1;
                    }
                    String str = q2VarG.f11345b;
                    q2 q2VarY = gVar.Y(str);
                    if (q2VarY == null) {
                        gVar.e0(q2VarG);
                        c(q2VarG);
                        Context context = this.f3483a;
                        context.getClass();
                        try {
                            applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(str);
                        } catch (Error e10) {
                            e10.printStackTrace();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3 && applicationEnabledSetting != 4) {
                            this.f3485c++;
                        }
                    } else if (q2VarY.b(q2VarG)) {
                        gVar.s(str);
                        gVar.e0(q2VarG);
                        c(q2VarG);
                    }
                    arrayList.add(q2VarG);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(t6.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o5.g
            if (r0 == 0) goto L13
            r0 = r5
            o5.g r0 = (o5.g) r0
            int r1 = r0.f8183l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8183l = r1
            goto L18
        L13:
            o5.g r0 = new o5.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8181a
            int r1 = r0.f8183l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r5)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            return r2
        L2c:
            p6.a.e(r5)
            v7.e r5 = o7.m0.f8289a
            v7.d r5 = v7.d.f10885a
            o5.h r1 = new o5.h
            r1.<init>(r4, r2)
            r0.f8183l = r3
            java.lang.Object r5 = o7.c0.C(r1, r5, r0)
            u6.a r0 = u6.a.f10763a
            if (r5 != r0) goto L43
            return r0
        L43:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.GetUpdatesWorker.doWork(t6.c):java.lang.Object");
    }
}
