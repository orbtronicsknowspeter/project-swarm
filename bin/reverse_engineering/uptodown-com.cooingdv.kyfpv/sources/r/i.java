package r;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f8829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8831e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public i(String str, Integer num, m mVar, long j, long j6, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f8827a = str;
        this.f8828b = num;
        this.f8829c = mVar;
        this.f8830d = j;
        this.f8831e = j6;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f8827a;
        if (str == null) {
            com.google.gson.internal.a.i("Null transportName");
            return null;
        }
        hVar.f8817b = str;
        hVar.f8819m = this.f8828b;
        hVar.f8820n = this.g;
        hVar.f8818l = this.h;
        hVar.f8825s = this.i;
        hVar.f8826t = this.j;
        m mVar = this.f8829c;
        if (mVar == null) {
            com.google.gson.internal.a.i("Null encodedPayload");
            return null;
        }
        hVar.f8821o = mVar;
        hVar.f8822p = Long.valueOf(this.f8830d);
        hVar.f8823q = Long.valueOf(this.f8831e);
        hVar.f8824r = new HashMap(this.f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f8827a.equals(iVar.f8827a)) {
                Integer num = iVar.f8828b;
                Integer num2 = this.f8828b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f8829c.equals(iVar.f8829c) && this.f8830d == iVar.f8830d && this.f8831e == iVar.f8831e && this.f.equals(iVar.f)) {
                        Integer num3 = iVar.g;
                        Integer num4 = this.g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = iVar.h;
                            String str2 = this.h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.i, iVar.i) && Arrays.equals(this.j, iVar.j)) {
                                    return true;
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
        int iHashCode = (this.f8827a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f8828b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f8829c.hashCode()) * 1000003;
        long j = this.f8830d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f8831e;
        int iHashCode3 = (((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f8827a + ", code=" + this.f8828b + ", encodedPayload=" + this.f8829c + ", eventMillis=" + this.f8830d + ", uptimeMillis=" + this.f8831e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
