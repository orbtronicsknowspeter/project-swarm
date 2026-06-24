package h0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f5426k;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5426k = bArr;
    }

    @Override // h0.l
    public final byte[] I() {
        return this.f5426k;
    }
}
