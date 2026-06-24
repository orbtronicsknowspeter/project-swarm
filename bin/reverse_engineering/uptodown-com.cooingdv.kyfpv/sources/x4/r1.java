package x4;

import android.content.Context;
import com.google.android.gms.internal.measurement.z3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11376e;

    public final void a(Context context) {
        z3.Q(this.f11372a, context, "fcm_app_id");
        z3.R(context, "fcm_packagename", this.f11373b);
        z3.O(context, this.f11374c, "fcm_download_id");
        z3.Q(this.f11375d, context, "fcm_received_timestamp");
        z3.Q(this.f11376e, context, "fcm_shown_timestamp");
    }

    public final String toString() {
        return "NotificationFCM(appId=" + this.f11372a + ", packageName=" + this.f11373b + ", downloadId=" + this.f11374c + ")";
    }
}
