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
    public final String f5033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f5035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f5036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f5038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f5039q;

    public j(String str, String str2, int i, String str3, String str4, b bVar, b bVar2, String str5, String str6, Boolean bool) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.h = str;
        this.i = str2;
        this.j = i;
        this.f5033k = str3;
        this.f5034l = str4;
        this.f5035m = bVar;
        this.f5036n = bVar2;
        this.f5037o = str5;
        this.f5038p = str6;
        this.f5039q = bool;
    }

    @Override // f9.i
    public final String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("displayType", this.f5033k);
        jSONObject.put("configurationHashCode", this.f5034l);
        jSONObject.put("cmpId", this.j);
        jSONObject.put("accountId", this.h);
        jSONObject.put("publisher", this.i);
        jSONObject.putOpt("configs", this.f5035m.a());
        b bVar = this.f5036n;
        jSONObject.putOpt("existingConfigs", bVar == null ? null : bVar.a());
        jSONObject.putOpt("existingCMPStatus", this.f5037o);
        jSONObject.put("manualTrigger", this.f5039q);
        jSONObject.put("existingGBCStatus", this.f5038p);
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
        return kotlin.jvm.internal.l.a(this.h, jVar.h) && kotlin.jvm.internal.l.a(this.i, jVar.i) && this.j == jVar.j && this.f5033k.equals(jVar.f5033k) && kotlin.jvm.internal.l.a(this.f5034l, jVar.f5034l) && this.f5035m.equals(jVar.f5035m) && kotlin.jvm.internal.l.a(this.f5036n, jVar.f5036n) && kotlin.jvm.internal.l.a(this.f5037o, jVar.f5037o) && kotlin.jvm.internal.l.a(this.f5038p, jVar.f5038p) && kotlin.jvm.internal.l.a(this.f5039q, jVar.f5039q);
    }

    public final int hashCode() {
        int iHashCode = (this.f5035m.hashCode() + i5.b(androidx.lifecycle.l.o((this.j + i5.b(this.h.hashCode() * 31, this.i)) * 31, 31, this.f5033k), this.f5034l)) * 31;
        b bVar = this.f5036n;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f5037o;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5038p;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f5039q;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingInitLog(accountId=" + this.h + ", publisher=" + this.i + ", cmpId=" + this.j + ", displayType=" + this.f5033k + ", configurationHashCode=" + this.f5034l + ", configs=" + this.f5035m + ", existingConfigs=" + this.f5036n + ", existingCMPStatus=" + ((Object) this.f5037o) + ", existingGBCStatus=" + ((Object) this.f5038p) + ", manualTrigger=" + this.f5039q + ')';
    }
}
