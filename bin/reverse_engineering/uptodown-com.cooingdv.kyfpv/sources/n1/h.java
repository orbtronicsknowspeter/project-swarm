package n1;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7923e;
    public final String f;
    public final String g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = p0.d.f8413a;
        y.i(true ^ (str == null || str.trim().isEmpty()), "ApplicationId must be set.");
        this.f7920b = str;
        this.f7919a = str2;
        this.f7921c = str3;
        this.f7922d = str4;
        this.f7923e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static h a(Context context) {
        android.support.v4.media.g gVar = new android.support.v4.media.g(context, 24);
        String strD = gVar.D("google_app_id");
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        return new h(strD, gVar.D("google_api_key"), gVar.D("firebase_database_url"), gVar.D("ga_trackingId"), gVar.D("gcm_defaultSenderId"), gVar.D("google_storage_bucket"), gVar.D("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return y.j(this.f7920b, hVar.f7920b) && y.j(this.f7919a, hVar.f7919a) && y.j(this.f7921c, hVar.f7921c) && y.j(this.f7922d, hVar.f7922d) && y.j(this.f7923e, hVar.f7923e) && y.j(this.f, hVar.f) && y.j(this.g, hVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7920b, this.f7919a, this.f7921c, this.f7922d, this.f7923e, this.f, this.g});
    }

    public final String toString() {
        android.support.v4.media.g gVar = new android.support.v4.media.g(this);
        gVar.p(this.f7920b, "applicationId");
        gVar.p(this.f7919a, "apiKey");
        gVar.p(this.f7921c, "databaseUrl");
        gVar.p(this.f7923e, "gcmSenderId");
        gVar.p(this.f, "storageBucket");
        gVar.p(this.g, "projectId");
        return gVar.toString();
    }
}
