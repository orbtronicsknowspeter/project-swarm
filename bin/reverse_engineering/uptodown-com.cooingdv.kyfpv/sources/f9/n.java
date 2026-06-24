package f9;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends i {
    public final String h;
    public final Boolean i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f5051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f5052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Boolean f5054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5055p;

    public n(String str, Boolean bool, String str2, String str3, b bVar, Boolean bool2, String str4, Boolean bool3, boolean z9) {
        this.h = str;
        this.i = bool;
        this.j = str2;
        this.f5050k = str3;
        this.f5051l = bVar;
        this.f5052m = bool2;
        this.f5053n = str4;
        this.f5054o = bool3;
        this.f5055p = z9;
    }

    @Override // f9.i
    public final String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("existingCMPStatus", this.h);
        jSONObject.putOpt("regulation", this.j);
        jSONObject.putOpt("cmpTriggered", this.i);
        jSONObject.putOpt("accountId", this.f5050k);
        b bVar = this.f5051l;
        jSONObject.putOpt("existingConfigs", bVar == null ? null : bVar.a());
        jSONObject.putOpt("paidUser", this.f5052m);
        jSONObject.putOpt("existingGBCStatus", this.f5053n);
        jSONObject.putOpt("consentOrPayApplicable", this.f5054o);
        jSONObject.putOpt("gbcApplicable", Boolean.valueOf(this.f5055p));
        c(jSONObject);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
