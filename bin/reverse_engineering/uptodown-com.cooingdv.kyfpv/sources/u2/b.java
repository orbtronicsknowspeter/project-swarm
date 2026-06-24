package u2;

import a4.x;
import c.j;
import k0.k;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10409e;
    public final long f;
    public final String g;

    static {
        byte b7 = (byte) (((byte) (0 | 2)) | 1);
        if (b7 == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b7 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k.h("Missing required properties:", sb));
    }

    public b(String str, int i, String str2, String str3, long j, long j6, String str4) {
        this.f10405a = str;
        this.f10406b = i;
        this.f10407c = str2;
        this.f10408d = str3;
        this.f10409e = j;
        this.f = j6;
        this.g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f10400a = this.f10405a;
        aVar.f10401b = this.f10406b;
        aVar.f10402c = this.f10407c;
        aVar.f10403d = this.f10408d;
        aVar.f10404e = this.f10409e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f10405a;
        String str2 = this.f10405a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!j.a(this.f10406b, bVar.f10406b)) {
            return false;
        }
        String str3 = bVar.f10407c;
        String str4 = this.f10407c;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = bVar.f10408d;
        String str6 = this.f10408d;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.f10409e != bVar.f10409e || this.f != bVar.f) {
            return false;
        }
        String str7 = bVar.g;
        String str8 = this.g;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.f10405a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ j.c(this.f10406b)) * 1000003;
        String str2 = this.f10407c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10408d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f10409e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f;
        int i6 = (i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f10405a);
        sb.append(", registrationStatus=");
        int i = this.f10406b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f10407c);
        sb.append(", refreshToken=");
        sb.append(this.f10408d);
        sb.append(", expiresInSecs=");
        sb.append(this.f10409e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return x.n(sb, this.g, "}");
    }
}
