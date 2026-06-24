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
    public String f11431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11432b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11434m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11438q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11441t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11442u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11445y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u2 f11430z = new u2();
    public static Parcelable.Creator<w2> CREATOR = new i0.l(22);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11435n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11436o = "type0";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11439r = -1;

    public final String a() {
        String str = this.f11433l;
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
                this.f11431a = jSONObjectOptJSONObject.optString("id");
            }
            if (!jSONObjectOptJSONObject.isNull("username")) {
                this.f11434m = jSONObjectOptJSONObject.optString("username");
            }
            if (!jSONObjectOptJSONObject.isNull("avatar")) {
                this.f11433l = jSONObjectOptJSONObject.optString("avatar");
            }
            if (!jSONObjectOptJSONObject.isNull("registeredTimestamp")) {
                this.f11435n = jSONObjectOptJSONObject.optLong("registeredTimestamp");
            }
            if (!jSONObjectOptJSONObject.isNull("usernameFormat")) {
                this.f11436o = jSONObjectOptJSONObject.optString("usernameFormat");
            }
            if (!jSONObjectOptJSONObject.isNull("backgroundImage")) {
                this.f11437p = jSONObjectOptJSONObject.optString("backgroundImage");
            }
            if (!jSONObjectOptJSONObject.isNull("hasNotifications")) {
                this.f11445y = jSONObjectOptJSONObject.optInt("hasNotifications") == 1;
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
            this.f11431a = jSONObject.optString("userID");
        }
        if (!jSONObject.isNull("username")) {
            this.f11434m = jSONObject.optString("username");
        }
        if (!jSONObject.isNull("registeredTimeAgo")) {
            this.f11442u = jSONObject.optString("registeredTimeAgo");
        }
        if (!jSONObject.isNull("avatar")) {
            this.f11433l = jSONObject.optString("avatar");
        }
        if (!jSONObject.isNull("isTurbo")) {
            this.f11443w = jSONObject.optInt("isTurbo") == 1;
        }
        if (!jSONObject.isNull("usernameFormat")) {
            this.f11436o = jSONObject.optString("usernameFormat");
        }
        if (!jSONObject.isNull("reviewsCount")) {
            this.f11438q = jSONObject.optInt("reviewsCount");
        }
        if (!jSONObject.isNull("backgroundImage")) {
            this.f11437p = jSONObject.optString("backgroundImage");
        }
        if (!jSONObject.isNull("following")) {
            this.f11439r = jSONObject.optInt("following");
        }
        if (!jSONObject.isNull("countFollowers")) {
            this.f11440s = jSONObject.optInt("countFollowers");
        }
        if (jSONObject.isNull("countFollowings")) {
            return;
        }
        this.f11441t = jSONObject.optInt("countFollowings");
    }

    public final boolean d() {
        String str = this.v;
        return !(str == null || str.length() == 0) || this.f11443w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final void e(Context context) {
        context.getClass();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
        editorEdit.putString("user_id", this.f11431a);
        editorEdit.putString("user_email", this.f11432b);
        editorEdit.putString("user_picture", this.f11433l);
        editorEdit.putString("user_name", this.f11434m);
        editorEdit.putLong("registered_timestamp", this.f11435n);
        editorEdit.putString("is_turbo", this.v);
        editorEdit.putString("username_format", this.f11436o);
        editorEdit.putString("background_image", this.f11437p);
        editorEdit.putBoolean("has_news_on_feed", this.f11445y);
        editorEdit.apply();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11431a);
        parcel.writeString(this.f11432b);
        parcel.writeString(this.f11433l);
        parcel.writeString(this.f11434m);
        parcel.writeString(this.v);
        parcel.writeString(this.f11436o);
        parcel.writeLong(this.f11435n);
        parcel.writeString(this.f11437p);
        if (this.f11443w) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f11438q);
        parcel.writeString(this.f11442u);
        parcel.writeInt(this.f11439r);
        parcel.writeInt(this.f11440s);
        parcel.writeInt(this.f11441t);
        if (this.f11444x) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        if (this.f11445y) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }
}
