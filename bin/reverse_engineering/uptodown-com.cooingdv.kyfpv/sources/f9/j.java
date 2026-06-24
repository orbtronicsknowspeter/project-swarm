package f9;

import com.google.android.gms.internal.measurement.i5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {
    public final String h;
    public final String i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f5036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f5037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f5039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f5040q;

    public j(String str, String str2, int i, String str3, String str4, b bVar, b bVar2, String str5, String str6, Boolean bool) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.h = str;
        this.i = str2;
        this.j = i;
        this.f5034k = str3;
        this.f5035l = str4;
        this.f5036m = bVar;
        this.f5037n = bVar2;
        this.f5038o = str5;
        this.f5039p = str6;
        this.f5040q = bool;
    }

    @Override // f9.i
    public final String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("displayType", this.f5034k);
        jSONObject.put("configurationHashCode", this.f5035l);
        jSONObject.put("cmpId", this.j);
        jSONObject.put("accountId", this.h);
        jSONObject.put("publisher", this.i);
        jSONObject.putOpt("configs", this.f5036m.a());
        b bVar = this.f5037n;
        jSONObject.putOpt("existingConfigs", bVar == null ? null : bVar.a());
        jSONObject.putOpt("existingCMPStatus", this.f5038o);
        jSONObject.put("manualTrigger", this.f5040q);
        jSONObject.put("existingGBCStatus", this.f5039p);
        c(jSONObject);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.h, jVar.h) && kotlin.jvm.internal.l.a(this.i, jVar.i) && this.j == jVar.j && this.f5034k.equals(jVar.f5034k) && kotlin.jvm.internal.l.a(this.f5035l, jVar.f5035l) && this.f5036m.equals(jVar.f5036m) && kotlin.jvm.internal.l.a(this.f5037n, jVar.f5037n) && kotlin.jvm.internal.l.a(this.f5038o, jVar.f5038o) && kotlin.jvm.internal.l.a(this.f5039p, jVar.f5039p) && kotlin.jvm.internal.l.a(this.f5040q, jVar.f5040q);
    }

    public final int hashCode() {
        int iHashCode = (this.f5036m.hashCode() + i5.b(androidx.lifecycle.l.o((this.j + i5.b(this.h.hashCode() * 31, this.i)) * 31, 31, this.f5034k), this.f5035l)) * 31;
        b bVar = this.f5037n;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f5038o;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5039p;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f5040q;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingInitLog(accountId=" + this.h + ", publisher=" + this.i + ", cmpId=" + this.j + ", displayType=" + this.f5034k + ", configurationHashCode=" + this.f5035l + ", configs=" + this.f5036m + ", existingConfigs=" + this.f5037n + ", existingCMPStatus=" + ((Object) this.f5038o) + ", existingGBCStatus=" + ((Object) this.f5039p) + ", manualTrigger=" + this.f5040q + ')';
    }
}
