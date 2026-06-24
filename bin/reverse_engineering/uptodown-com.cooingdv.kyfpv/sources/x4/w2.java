package x4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11433b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11435m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11439q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11443u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11444w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11445x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11446y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u2 f11431z = new u2();
    public static Parcelable.Creator<w2> CREATOR = new i0.l(22);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11436n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11437o = "type0";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11440r = -1;

    public final String a() {
        String str = this.f11434l;
        if (str == null) {
            return null;
        }
        str.getClass();
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.Q, ":webp");
    }

    public final void b(Context context, JSONObject jSONObject) {
        context.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("udata");
        if (jSONObjectOptJSONObject != null) {
            if (!jSONObjectOptJSONObject.isNull("id")) {
                this.f11432a = jSONObjectOptJSONObject.optString("id");
            }
            if (!jSONObjectOptJSONObject.isNull("username")) {
                this.f11435m = jSONObjectOptJSONObject.optString("username");
            }
            if (!jSONObjectOptJSONObject.isNull("avatar")) {
                this.f11434l = jSONObjectOptJSONObject.optString("avatar");
            }
            if (!jSONObjectOptJSONObject.isNull("registeredTimestamp")) {
                this.f11436n = jSONObjectOptJSONObject.optLong("registeredTimestamp");
            }
            if (!jSONObjectOptJSONObject.isNull("usernameFormat")) {
                this.f11437o = jSONObjectOptJSONObject.optString("usernameFormat");
            }
            if (!jSONObjectOptJSONObject.isNull("backgroundImage")) {
                this.f11438p = jSONObjectOptJSONObject.optString("backgroundImage");
            }
            if (!jSONObjectOptJSONObject.isNull("hasNotifications")) {
                this.f11446y = jSONObjectOptJSONObject.optInt("hasNotifications") == 1;
            }
        }
        if (jSONObject.isNull("utoken")) {
            u2.c(context);
        } else {
            String strOptString = jSONObject.optString("utoken");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("UTOKEN", strOptString);
            editorEdit.apply();
        }
        if (jSONObject.isNull("turboToken")) {
            return;
        }
        this.v = jSONObject.optString("turboToken");
    }

    public final void c(JSONObject jSONObject) {
        if (!jSONObject.isNull("userID")) {
            this.f11432a = jSONObject.optString("userID");
        }
        if (!jSONObject.isNull("username")) {
            this.f11435m = jSONObject.optString("username");
        }
        if (!jSONObject.isNull("registeredTimeAgo")) {
            this.f11443u = jSONObject.optString("registeredTimeAgo");
        }
        if (!jSONObject.isNull("avatar")) {
            this.f11434l = jSONObject.optString("avatar");
        }
        if (!jSONObject.isNull("isTurbo")) {
            this.f11444w = jSONObject.optInt("isTurbo") == 1;
        }
        if (!jSONObject.isNull("usernameFormat")) {
            this.f11437o = jSONObject.optString("usernameFormat");
        }
        if (!jSONObject.isNull("reviewsCount")) {
            this.f11439q = jSONObject.optInt("reviewsCount");
        }
        if (!jSONObject.isNull("backgroundImage")) {
            this.f11438p = jSONObject.optString("backgroundImage");
        }
        if (!jSONObject.isNull("following")) {
            this.f11440r = jSONObject.optInt("following");
        }
        if (!jSONObject.isNull("countFollowers")) {
            this.f11441s = jSONObject.optInt("countFollowers");
        }
        if (jSONObject.isNull("countFollowings")) {
            return;
        }
        this.f11442t = jSONObject.optInt("countFollowings");
    }

    public final boolean d() {
        String str = this.v;
        return !(str == null || str.length() == 0) || this.f11444w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final void e(Context context) {
        context.getClass();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
        editorEdit.putString("user_id", this.f11432a);
        editorEdit.putString("user_email", this.f11433b);
        editorEdit.putString("user_picture", this.f11434l);
        editorEdit.putString("user_name", this.f11435m);
        editorEdit.putLong("registered_timestamp", this.f11436n);
        editorEdit.putString("is_turbo", this.v);
        editorEdit.putString("username_format", this.f11437o);
        editorEdit.putString("background_image", this.f11438p);
        editorEdit.putBoolean("has_news_on_feed", this.f11446y);
        editorEdit.apply();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11432a);
        parcel.writeString(this.f11433b);
        parcel.writeString(this.f11434l);
        parcel.writeString(this.f11435m);
        parcel.writeString(this.v);
        parcel.writeString(this.f11437o);
        parcel.writeLong(this.f11436n);
        parcel.writeString(this.f11438p);
        if (this.f11444w) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f11439q);
        parcel.writeString(this.f11443u);
        parcel.writeInt(this.f11440r);
        parcel.writeInt(this.f11441s);
        parcel.writeInt(this.f11442t);
        if (this.f11445x) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        if (this.f11446y) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }
}
