package f9;

import a2.t;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import w8.e0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4997e;

    public b(m8.g gVar, t tVar) {
        this.f4997e = gVar;
        this.f4994b = tVar;
        e0 e0VarJ = tVar.j(1);
        this.f4995c = e0VarJ;
        this.f4996d = new m8.c(this, e0VarJ, tVar);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("themeUuid", (String) this.f4994b);
        jSONObject.put("language", (String) this.f4995c);
        jSONObject.put("copApplicable", (Boolean) this.f4996d);
        jSONObject.put("advancedApplicable", (Boolean) this.f4997e);
        jSONObject.put("gbcApplicable", this.f4993a);
        return jSONObject;
    }

    public void b() {
        synchronized (((m8.g) this.f4997e)) {
            try {
                if (this.f4993a) {
                    return;
                }
                this.f4993a = true;
                n8.c.c((e0) this.f4995c);
                try {
                    ((t) this.f4994b).a();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(String str, String str2, Boolean bool, Boolean bool2, boolean z9) {
        this.f4994b = str;
        this.f4995c = str2;
        this.f4996d = bool;
        this.f4997e = bool2;
        this.f4993a = z9;
    }
}
