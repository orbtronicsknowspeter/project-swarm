package h0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f5430c;

    public /* synthetic */ n(boolean z9, String str, m mVar) {
        this.f5428a = z9;
        this.f5429b = str;
        this.f5430c = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z9 = this.f5428a;
        String str = this.f5429b;
        m mVar = this.f5430c;
        String str2 = (z9 || !p.c(str, mVar, true, false).f5446a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        y.g(messageDigest);
        byte[] bArrDigest = messageDigest.digest(mVar.f5427k);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i6 = 0;
        for (byte b7 : bArrDigest) {
            char[] cArr2 = p0.b.f8406b;
            cArr[i6] = cArr2[(b7 & 255) >>> 4];
            cArr[i6 + 1] = cArr2[b7 & 15];
            i6 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z9 + ", ver=12451000.false";
    }
}
