package q;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f8615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f8617e;
    public final String f;
    public final long g;
    public final i0 h;
    public final b0 i;

    public s(long j, Integer num, a0 a0Var, long j6, byte[] bArr, String str, long j10, i0 i0Var, b0 b0Var) {
        this.f8613a = j;
        this.f8614b = num;
        this.f8615c = a0Var;
        this.f8616d = j6;
        this.f8617e = bArr;
        this.f = str;
        this.g = j10;
        this.h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            if (this.f8613a == sVar.f8613a) {
                Integer num = sVar.f8614b;
                Integer num2 = this.f8614b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    a0 a0Var = sVar.f8615c;
                    a0 a0Var2 = this.f8615c;
                    if (a0Var2 != null ? a0Var2.equals(a0Var) : a0Var == null) {
                        if (this.f8616d == sVar.f8616d) {
                            if (Arrays.equals(this.f8617e, e0Var instanceof s ? ((s) e0Var).f8617e : sVar.f8617e)) {
                                String str = sVar.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == sVar.g) {
                                        i0 i0Var = sVar.h;
                                        i0 i0Var2 = this.h;
                                        if (i0Var2 != null ? i0Var2.equals(i0Var) : i0Var == null) {
                                            b0 b0Var = sVar.i;
                                            b0 b0Var2 = this.i;
                                            if (b0Var2 != null ? b0Var2.equals(b0Var) : b0Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8613a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f8614b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f8615c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j6 = this.f8616d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f8617e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.g;
        int i6 = (iHashCode4 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        int iHashCode5 = (i6 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f8613a + ", eventCode=" + this.f8614b + ", complianceData=" + this.f8615c + ", eventUptimeMs=" + this.f8616d + ", sourceExtension=" + Arrays.toString(this.f8617e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
