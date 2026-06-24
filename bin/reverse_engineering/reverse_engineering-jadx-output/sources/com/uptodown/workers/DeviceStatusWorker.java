package com.uptodown.workers;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.z3;
import j5.g;
import j5.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x4.g2;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceStatusWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3471a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceStatusWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3471a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() throws JSONException {
        NetworkCapabilities networkCapabilities;
        NetworkCapabilities networkCapabilities2;
        long j;
        Cursor cursorQuery;
        String string;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Context context = this.f3471a;
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        int i = (intExtra < 0 || intExtra2 <= 0) ? -1 : (intExtra * 100) / intExtra2;
        Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra3 = intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) : -1;
        int i6 = (intExtra3 == 2 || intExtra3 == 5) ? 1 : 0;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        ?? HasTransport = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? 0 : networkCapabilities.hasTransport(1);
        Object systemService2 = context.getSystemService("connectivity");
        systemService2.getClass();
        ConnectivityManager connectivityManager2 = (ConnectivityManager) systemService2;
        Network activeNetwork2 = connectivityManager2.getActiveNetwork();
        int linkUpstreamBandwidthKbps = (activeNetwork2 == null || (networkCapabilities2 = connectivityManager2.getNetworkCapabilities(activeNetwork2)) == null) ? 0 : networkCapabilities2.getLinkUpstreamBandwidthKbps();
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVarL = g.D.l(context);
        gVarL.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("batteryLevel", Integer.valueOf(i));
        contentValues.put("isCharging", Integer.valueOf(i6));
        contentValues.put("isWifiConnected", Integer.valueOf((int) HasTransport));
        contentValues.put("uploadSpeedKbps", Integer.valueOf(linkUpstreamBandwidthKbps));
        SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
        sQLiteDatabase.getClass();
        sQLiteDatabase.insert("device_status", null, contentValues);
        gVarL.c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
        try {
            try {
                j = sharedPreferences.getLong("last_device_status_send_timestamp", 0L);
            } catch (ClassCastException unused) {
                j = sharedPreferences.getInt("last_device_status_send_timestamp", -1);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                editorEdit.putLong("last_device_status_send_timestamp", j);
                editorEdit.apply();
            }
        } catch (ClassCastException unused2) {
            j = 0;
        }
        if (System.currentTimeMillis() - j >= 86400000 && z3.f2928c) {
            g gVarL2 = g.D.l(context);
            gVarL2.b();
            ArrayList arrayList = new ArrayList();
            try {
                SQLiteDatabase sQLiteDatabase2 = gVarL2.f6673a;
                sQLiteDatabase2.getClass();
                cursorQuery = sQLiteDatabase2.query("device_status", null, null, null, null, null, "timestamp DESC");
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(new q(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("id")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timestamp")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("batteryLevel")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("isCharging")) == 1, cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("isWifiConnected")) == 1, cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("uploadSpeedKbps"))));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                }
            } catch (Exception e11) {
                e = e11;
                cursorQuery = null;
            }
            if (!arrayList.isEmpty() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null) {
                v vVar = new v(context);
                String strConcat = "https://www.uptodown.app:443".concat("/eapi/v3/device/daily-stats");
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    q qVar = (q) next;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hourTimestamp", qVar.f11335b);
                    jSONObject.put("batteryLevel", qVar.f11336c);
                    jSONObject.put("isCharging", qVar.f11337d);
                    jSONObject.put("wifiConnected", qVar.f11338e);
                    jSONObject.put("uploadSpeedKbps", qVar.f);
                    jSONArray.put(jSONObject);
                    vVar = vVar;
                    it = it;
                }
                v vVar2 = vVar;
                HashMap map = new HashMap();
                map.put("identifier", string);
                map.put("date", String.valueOf(System.currentTimeMillis() / ((long) 1000)));
                map.put("hourlyStats", jSONArray.toString());
                g2 g2VarK = vVar2.k(strConcat, map, ShareTarget.METHOD_POST, false);
                g2VarK.f11206d = vVar2.i(g2VarK, strConcat);
                if (!g2VarK.b()) {
                    SQLiteDatabase sQLiteDatabase3 = gVarL2.f6673a;
                    sQLiteDatabase3.getClass();
                    sQLiteDatabase3.delete("device_status", null, null);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    SharedPreferences sharedPreferences3 = context.getSharedPreferences("SettingsPreferences", 0);
                    sharedPreferences3.getClass();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                    editorEdit2.putLong("last_device_status_send_timestamp", jCurrentTimeMillis2);
                    editorEdit2.apply();
                }
            }
            gVarL2.c();
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        resultSuccess.getClass();
        return resultSuccess;
    }
}
