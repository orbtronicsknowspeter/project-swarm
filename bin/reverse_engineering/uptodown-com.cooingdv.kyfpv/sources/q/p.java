package q;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8610b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f8609a = bArr;
        this.f8610b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z9 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f8609a, z9 ? pVar.f8609a : pVar.f8609a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f8610b, z9 ? pVar2.f8610b : pVar2.f8610b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f8609a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8610b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f8609a) + ", encryptedBlob=" + Arrays.toString(this.f8610b) + "}";
    }
}
