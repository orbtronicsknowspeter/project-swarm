package c4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.fragment.app.Fragment;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.uptodown.activities.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(MainActivity mainActivity, t6.c cVar, int i) {
        super(2, cVar);
        this.f1753a = i;
        this.f1754b = mainActivity;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1753a) {
            case 0:
                return new j3(this.f1754b, cVar, 0);
            case 1:
                return new j3(this.f1754b, cVar, 1);
            case 2:
                return new j3(this.f1754b, cVar, 2);
            case 3:
                return new j3(this.f1754b, cVar, 3);
            case 4:
                return new j3(this.f1754b, cVar, 4);
            case 5:
                return new j3(this.f1754b, cVar, 5);
            default:
                return new j3(this.f1754b, cVar, 6);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1753a) {
            case 0:
                j3 j3Var = (j3) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                j3Var.invokeSuspend(xVar);
                return xVar;
            case 1:
                j3 j3Var2 = (j3) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                j3Var2.invokeSuspend(xVar2);
                return xVar2;
            case 2:
                j3 j3Var3 = (j3) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8463a;
                j3Var3.invokeSuspend(xVar3);
                return xVar3;
            case 3:
                return ((j3) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
            case 4:
                j3 j3Var4 = (j3) create(a0Var, cVar);
                p6.x xVar4 = p6.x.f8463a;
                j3Var4.invokeSuspend(xVar4);
                return xVar4;
            case 5:
                j3 j3Var5 = (j3) create(a0Var, cVar);
                p6.x xVar5 = p6.x.f8463a;
                j3Var5.invokeSuspend(xVar5);
                return xVar5;
            default:
                j3 j3Var6 = (j3) create(a0Var, cVar);
                p6.x xVar6 = p6.x.f8463a;
                j3Var6.invokeSuspend(xVar6);
                return xVar6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        x4.n2 n2VarV;
        int i = this.f1753a;
        int i6 = 0;
        Cursor cursorQuery = null;
        p6.x xVar = p6.x.f8463a;
        MainActivity mainActivity = this.f1754b;
        switch (i) {
            case 0:
                p6.a.e(obj);
                mainActivity.u0();
                break;
            case 1:
                p6.a.e(obj);
                String strY = com.google.android.gms.internal.measurement.z3.y(mainActivity, "fcmToken");
                if (strY == null || strY.length() == 0) {
                    j5.v vVar = new j5.v(mainActivity);
                    String strW = androidx.lifecycle.l.w("/eapi/v3/device/", Settings.Secure.getString(mainActivity.getContentResolver(), "android_id"), "/welcome-messages");
                    x4.g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat(strW), null, ShareTarget.METHOD_GET, false);
                    JSONObject jSONObjectI = vVar.i(g2VarK, strW);
                    g2VarK.f11206d = jSONObjectI;
                    if (jSONObjectI != null && jSONObjectI.optInt("success") == 1 && (jSONObjectOptJSONObject = jSONObjectI.optJSONObject("data")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("messages")) != null) {
                        String strY2 = com.google.android.gms.internal.measurement.z3.y(mainActivity, "Language");
                        if (strY2 == null) {
                            strY2 = "en";
                        }
                        j5.g gVarL = j5.g.D.l(mainActivity);
                        gVarL.b();
                        int length = jSONArrayOptJSONArray.length();
                        int i10 = 0;
                        while (i10 < length) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("translations")) != null) {
                                int length2 = jSONArrayOptJSONArray2.length();
                                int i11 = i6;
                                Cursor cursor = cursorQuery;
                                Object obj2 = cursor;
                                ?? r13 = cursor;
                                while (true) {
                                    if (i11 < length2) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                                        obj2 = obj2;
                                        if (jSONObjectOptJSONObject3 != null) {
                                            if (obj2 == null) {
                                                obj2 = jSONObjectOptJSONObject3;
                                            }
                                            if (kotlin.jvm.internal.l.a(jSONObjectOptJSONObject3.optString("locale"), strY2)) {
                                                n2VarV = t0.f.v(jSONObjectOptJSONObject3);
                                            } else if (kotlin.jvm.internal.l.a(jSONObjectOptJSONObject3.optString("locale"), "en")) {
                                                r13 = jSONObjectOptJSONObject3;
                                            }
                                        }
                                        i11++;
                                        r13 = r13;
                                        obj2 = obj2;
                                    } else if (r13 != 0) {
                                        n2VarV = t0.f.v(r13);
                                    } else if (obj2 == null) {
                                        n2VarV = null;
                                    } else {
                                        r13 = obj2;
                                        n2VarV = t0.f.v(r13);
                                    }
                                }
                                if (n2VarV != null) {
                                    gVarL.d0(n2VarV.f11296b, n2VarV.f11297c, n2VarV.f11298d, n2VarV.f11299e);
                                }
                            }
                            i10++;
                            i6 = 0;
                            cursorQuery = null;
                        }
                        gVarL.c();
                    }
                }
                break;
            case 2:
                ArrayList arrayListW = a4.x.w(obj);
                j5.g gVarL2 = j5.g.D.l(mainActivity);
                gVarL2.b();
                x4.h2 h2VarX = gVarL2.X("categories");
                if (h2VarX == null || !h2VarX.a()) {
                    j5.v vVar2 = new j5.v(mainActivity);
                    x4.g2 g2VarK2 = vVar2.k("https://www.uptodown.app:443".concat("/eapi/v2/categories/parents"), new HashMap(), ShareTarget.METHOD_GET, false);
                    g2VarK2.f11206d = vVar2.i(g2VarK2, "/eapi/v2/categories/parents");
                    if (!g2VarK2.b() && g2VarK2.f11203a != null) {
                        JSONObject jSONObject = g2VarK2.f11206d;
                        jSONObject.getClass();
                        arrayListW = t0.f.w(jSONObject);
                        String str = g2VarK2.f11203a;
                        str.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        gVarL2.r("categories");
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "categories");
                        contentValues.put("json", str);
                        contentValues.put("timestamp", String.valueOf(jCurrentTimeMillis));
                        SQLiteDatabase sQLiteDatabase = gVarL2.f6673a;
                        sQLiteDatabase.getClass();
                        sQLiteDatabase.insert("responses", null, contentValues);
                    }
                } else {
                    arrayListW = t0.f.w(new JSONObject((String) h2VarX.f11212b));
                }
                gVarL2.c();
                if (!arrayListW.isEmpty()) {
                    mainActivity.f3319r0.addAll(arrayListW);
                }
                break;
            case 3:
                p6.a.e(obj);
                j5.g gVarL3 = j5.g.D.l(mainActivity);
                gVarL3.b();
                ArrayList arrayList = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase2 = gVarL3.f6673a;
                    sQLiteDatabase2.getClass();
                    cursorQuery = sQLiteDatabase2.query("pending_system_messages", null, null, null, null, null, "timestamp ASC");
                    if (cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(new x4.n2(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("body")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("url")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("action_button_text"))));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                }
                x4.n2 n2Var = (x4.n2) q6.l.r0(arrayList);
                if (n2Var != null) {
                    long j = n2Var.f11295a;
                    SQLiteDatabase sQLiteDatabase3 = gVarL3.f6673a;
                    sQLiteDatabase3.getClass();
                    sQLiteDatabase3.delete("pending_system_messages", "id = ?", new String[]{String.valueOf(j)});
                }
                gVarL3.c();
                break;
            case 4:
                p6.a.e(obj);
                mainActivity.z();
                break;
            case 5:
                p6.a.e(obj);
                String string = mainActivity.getString(2131951692);
                string.getClass();
                mainActivity.A(string);
                break;
            default:
                p6.a.e(obj);
                Fragment fragmentW0 = mainActivity.W0();
                if (fragmentW0 instanceof u4.f0) {
                    ((u4.f0) fragmentW0).D();
                }
                break;
        }
        return xVar;
    }
}
