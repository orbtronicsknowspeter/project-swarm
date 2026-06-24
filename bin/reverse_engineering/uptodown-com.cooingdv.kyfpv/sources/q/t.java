package q;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f8620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f8621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8622e;
    public final ArrayList f;

    public t(long j, long j6, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f8594a;
        this.f8618a = j;
        this.f8619b = j6;
        this.f8620c = nVar;
        this.f8621d = num;
        this.f8622e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        if (this.f8618a != tVar.f8618a || this.f8619b != tVar.f8619b || !this.f8620c.equals(tVar.f8620c)) {
            return false;
        }
        Integer num = tVar.f8621d;
        Integer num2 = this.f8621d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = tVar.f8622e;
        String str2 = this.f8622e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(tVar.f)) {
            return false;
        }
        Object obj2 = j0.f8594a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f8618a;
        long j6 = this.f8619b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f8620c.hashCode()) * 1000003;
        Integer num = this.f8621d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f8622e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ j0.f8594a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f8618a + ", requestUptimeMs=" + this.f8619b + ", clientInfo=" + this.f8620c + ", logSource=" + this.f8621d + ", logSourceName=" + this.f8622e + ", logEvents=" + this.f + ", qosTier=" + j0.f8594a + "}";
    }
}
