package f9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {
    public final ArrayList h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f5046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f5048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f5049s;

    public k(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList2, Boolean bool, int i) {
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        str7 = (i & 128) != 0 ? null : str7;
        str8 = (i & 256) != 0 ? null : str8;
        bool = (i & 2048) != 0 ? null : bool;
        this.h = arrayList;
        this.i = str;
        this.j = str2;
        this.f5041k = str3;
        this.f5042l = str4;
        this.f5043m = str5;
        this.f5044n = str6;
        this.f5045o = str7;
        this.f5046p = str8;
        this.f5047q = str9;
        this.f5048r = arrayList2;
        this.f5049s = bool;
    }

    @Override // f9.i
    public final String d() throws JSONException {
        ArrayList arrayList;
        List<p6.i> list = this.f5048r;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (p6.i iVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(String.valueOf(((Number) iVar.f8442a).intValue()), iVar.f8443b);
                arrayList.add(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.h;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(new JSONObject(((a) obj).d()));
        }
        jSONObject2.put("userEvents", new JSONArray((Collection) arrayList2));
        jSONObject2.putOpt("acceptanceState", this.i);
        jSONObject2.putOpt("objectionState", this.j);
        jSONObject2.putOpt("tcData", this.f5041k);
        jSONObject2.putOpt("gppData", this.f5042l);
        jSONObject2.putOpt("state", this.f5043m);
        jSONObject2.putOpt("jurisdiction", this.f5044n);
        jSONObject2.putOpt("nonIabConsentData", this.f5045o);
        jSONObject2.putOpt("uspData", this.f5046p);
        jSONObject2.putOpt("gbcAcceptanceState", this.f5047q);
        jSONObject2.putOpt("gbcData", arrayList != null ? new JSONArray((Collection) arrayList) : null);
        jSONObject2.putOpt("paidUserIndicated", this.f5049s);
        c(jSONObject2);
        String string = jSONObject2.toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.a(this.h, kVar.h) && kotlin.jvm.internal.l.a(this.i, kVar.i) && kotlin.jvm.internal.l.a(this.j, kVar.j) && kotlin.jvm.internal.l.a(this.f5041k, kVar.f5041k) && kotlin.jvm.internal.l.a(this.f5042l, kVar.f5042l) && kotlin.jvm.internal.l.a(this.f5043m, kVar.f5043m) && kotlin.jvm.internal.l.a(this.f5044n, kVar.f5044n) && kotlin.jvm.internal.l.a(this.f5045o, kVar.f5045o) && kotlin.jvm.internal.l.a(this.f5046p, kVar.f5046p) && kotlin.jvm.internal.l.a(this.f5047q, kVar.f5047q) && kotlin.jvm.internal.l.a(this.f5048r, kVar.f5048r) && kotlin.jvm.internal.l.a(this.f5049s, kVar.f5049s);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5041k;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5042l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5043m;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5044n;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5045o;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5046p;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5047q;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.f5048r;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f5049s;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingUserDoneLog(userEvents=" + this.h + ", acceptanceState=" + ((Object) this.i) + ", objectionState=" + ((Object) this.j) + ", tcData=" + ((Object) this.f5041k) + ", gppData=" + ((Object) this.f5042l) + ", state=" + ((Object) this.f5043m) + ", jurisdiction=" + ((Object) this.f5044n) + ", nonIabConsentData=" + ((Object) this.f5045o) + ", uspData=" + ((Object) this.f5046p) + ", gbcAcceptanceState=" + ((Object) this.f5047q) + ", gbcData=" + this.f5048r + ", paidUserIndicated=" + this.f5049s + ')';
    }
}
