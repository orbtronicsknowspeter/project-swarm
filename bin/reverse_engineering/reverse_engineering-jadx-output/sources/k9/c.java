package k9;

import android.content.Context;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f7009b;

    public c(Context context) {
        this.f7008a = 2;
        context.getClass();
        JSONObject jSONObject = new JSONObject();
        this.f7009b = jSONObject;
        d(0, "autoplay");
        d(0, "mute");
        d(0, "controls");
        d(1, "enablejsapi");
        d(0, "fs");
        String str = "https://" + context.getPackageName();
        try {
            jSONObject.put("origin", str);
            d(0, "rel");
            d(3, "iv_load_policy");
            d(0, "cc_load_policy");
        } catch (JSONException unused) {
            a3.b.n("Illegal JSON value origin: ".concat(str));
            throw null;
        }
    }

    public Object a(String str) {
        switch (this.f7008a) {
            case 0:
                str.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f7009b = jSONObject;
                    return new k6.c(jSONObject.optString("language"), c(), e());
                } catch (JSONException unused) {
                    ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                    if (callback != null) {
                        callback.onCmpError(ChoiceError.INVALID_JSON_FORMAT);
                    }
                    return new k6.c();
                }
            default:
                str.getClass();
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    this.f7009b = jSONObject2;
                    return new j8.a(10, jSONObject2.optString("jurisdiction"), b());
                } catch (JSONException unused2) {
                    ChoiceCmpCallback callback2 = ChoiceCmp.INSTANCE.getCallback();
                    if (callback2 != null) {
                        callback2.onCmpError(ChoiceError.INVALID_JSON_FORMAT);
                    }
                    return new j8.a(15, null, null);
                }
        }
    }

    public ArrayList b() {
        String str;
        k6.a aVar;
        JSONArray jSONArray;
        JSONObject jSONObject = this.f7009b;
        String str2 = null;
        if (jSONObject == null) {
            l.i("json");
            throw null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("purposes");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < length) {
                int i6 = i + 1;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                Integer numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt("id"));
                Boolean boolValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("defaultValue"));
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("consentBanner");
                if (jSONObjectOptJSONObject2 == null) {
                    aVar = new k6.a(15, str2, str2);
                    str = str2;
                } else {
                    str = str2;
                    String strOptString = jSONObjectOptJSONObject2.optString("title");
                    strOptString.getClass();
                    String strOptString2 = jSONObjectOptJSONObject2.optString("description");
                    strOptString2.getClass();
                    aVar = new k6.a(10, strOptString, strOptString2);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("purposes");
                k6.a aVar2 = aVar;
                ArrayList arrayList2 = new ArrayList();
                if (jSONArrayOptJSONArray2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    int length2 = jSONArrayOptJSONArray2.length();
                    jSONArray = jSONArrayOptJSONArray;
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = i10 + 1;
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i10);
                        arrayList2.add(new j8.c(Integer.valueOf(jSONObjectOptJSONObject3.optInt("id")), Integer.valueOf(jSONObjectOptJSONObject3.optInt("order")), jSONObjectOptJSONObject3.optString("title"), jSONObjectOptJSONObject3.optString("description"), d0.b.e(jSONObjectOptJSONObject3, "nationalIds")));
                        i10 = i11;
                        jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                    }
                }
                arrayList.add(new j8.b(numValueOf, boolValueOf, aVar2, arrayList2, jSONObjectOptJSONObject.optBoolean("noticeOnly")));
                i = i6;
                str2 = str;
                jSONArrayOptJSONArray = jSONArray;
            }
        }
        return arrayList;
    }

    public k6.a c() throws JSONException {
        JSONObject jSONObject = this.f7009b;
        if (jSONObject == null) {
            l.i("json");
            throw null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("banner");
        String strOptString = jSONObject2.optString("title");
        strOptString.getClass();
        String strOptString2 = jSONObject2.optString("sectionTitle");
        strOptString2.getClass();
        String strOptString3 = jSONObject2.optString("description");
        strOptString3.getClass();
        String strOptString4 = jSONObject2.optString("confirm");
        strOptString4.getClass();
        return new k6.a(strOptString, strOptString2, strOptString3, strOptString4);
    }

    public void d(int i, String str) {
        try {
            this.f7009b.put(str, i);
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value " + str + ": " + i);
        }
    }

    public ArrayList e() throws JSONException {
        JSONObject jSONObject = this.f7009b;
        if (jSONObject == null) {
            l.i("json");
            throw null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("purposes");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                int i6 = i + 1;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Integer numValueOf = Integer.valueOf(jSONObject2.optInt("id"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("banner");
                jSONObject3.getClass();
                String strOptString = jSONObject3.optString("title");
                strOptString.getClass();
                arrayList.add(new k6.b(numValueOf, new k6.a(14, strOptString, null)));
                i = i6;
            }
        }
        return arrayList;
    }

    public /* synthetic */ c(int i) {
        this.f7008a = i;
    }
}
