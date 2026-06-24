package x4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable {
    public static Parcelable.Creator<j> CREATOR = new i0.l(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11226b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f11232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f11233r;

    public /* synthetic */ j(int i, String str, int i6) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? null : str, (String) null);
    }

    public final void a(JSONObject jSONObject, int i) {
        if (!jSONObject.isNull("name")) {
            this.f11226b = jSONObject.optString("name");
        }
        if (!jSONObject.isNull("id")) {
            this.f11225a = jSONObject.optInt("id");
        }
        this.f11230o = i;
    }

    public final void b(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.f11225a = jSONObject.optInt("id");
        }
        if (!jSONObject.isNull("name")) {
            this.f11226b = jSONObject.optString("name");
        } else if (!jSONObject.isNull("value")) {
            this.f11226b = jSONObject.optString("value");
        }
        if (!jSONObject.isNull("description")) {
            this.f11227l = jSONObject.optString("description");
        }
        this.f11228m = true;
    }

    public final void c(Bundle bundle) {
        this.f11225a = bundle.getInt("id");
        this.f11226b = bundle.getString("name");
        this.f11227l = bundle.getString("description");
        this.f11228m = bundle.getBoolean("isFloating");
        this.f11230o = bundle.getInt("parentCategoryId");
        this.f11231p = bundle.getInt("isGame");
        this.f11229n = bundle.getBoolean("isLeaf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.f11225a = jSONObject.optInt("id");
        }
        if (!jSONObject.isNull("name")) {
            this.f11226b = jSONObject.optString("name");
        }
        if (!jSONObject.isNull("description")) {
            this.f11227l = jSONObject.optString("description");
        }
        if (!jSONObject.isNull("parentCategoryID")) {
            this.f11230o = jSONObject.optInt("parentCategoryID");
        }
        Object[] objArr = 0;
        if (!jSONObject.isNull("isFloating")) {
            this.f11228m = jSONObject.optInt("isFloating") == 1;
        }
        if (jSONObject.isNull("relatedCategories")) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("relatedCategories");
        if (jSONArrayOptJSONArray != null) {
            this.f11233r = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                j jVar = new j((int) (objArr == true ? 1 : 0), (String) null, 7);
                jSONObjectOptJSONObject.getClass();
                jVar.d(jSONObjectOptJSONObject);
                ArrayList arrayList = this.f11233r;
                arrayList.getClass();
                arrayList.add(jVar);
            }
        }
        this.f11228m = jSONObject.optInt("isFloating") == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f11225a);
        parcel.writeString(this.f11226b);
        parcel.writeString(this.f11227l);
        parcel.writeInt(this.f11228m ? 1 : 0);
        parcel.writeInt(this.f11229n ? 1 : 0);
        parcel.writeInt(this.f11230o);
        parcel.writeInt(this.f11231p);
        parcel.writeTypedList(this.f11232q);
    }

    public j(int i, String str, String str2) {
        this.f11225a = i;
        this.f11226b = str;
        this.f11227l = str2;
    }
}
