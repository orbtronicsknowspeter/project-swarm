package x8;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11545a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(l7.a.f7151a);
        bytes.getClass();
        f11545a = bytes;
    }

    public static final String a(w8.h hVar, long j) throws EOFException {
        if (j > 0) {
            long j6 = j - 1;
            if (hVar.d(j6) == 13) {
                String strR = hVar.r(j6, l7.a.f7151a);
                hVar.skip(2L);
                return strR;
            }
        }
        String strR2 = hVar.r(j, l7.a.f7151a);
        hVar.skip(1L);
        return strR2;
    }
}
