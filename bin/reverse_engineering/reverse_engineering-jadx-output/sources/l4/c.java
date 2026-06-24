package l4;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f7103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7107e;
    public String f;

    public final void a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        try {
            if (!jSONObject.isNull("name")) {
                this.f7104b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("sha256")) {
                this.f7105c = jSONObject.getString("sha256");
            }
            if (!jSONObject.isNull("icon")) {
                this.f7106d = jSONObject.getString("icon");
            }
            if (!jSONObject.isNull("size")) {
                this.f7107e = jSONObject.getLong("size");
            }
            if (jSONObject.isNull("senderDeviceName")) {
                return;
            }
            this.f = jSONObject.getString("senderDeviceName");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
