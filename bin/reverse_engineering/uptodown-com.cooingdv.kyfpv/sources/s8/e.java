package s8;

import com.google.android.gms.internal.measurement.z3;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w8.k f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f9396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f9397d;

    static {
        w8.k kVar = w8.k.f10971m;
        f9394a = z3.m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f9395b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f9396c = new String[64];
        f9397d = new String[256];
        int i = 0;
        int i6 = 0;
        while (true) {
            String[] strArr = f9397d;
            if (i6 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i6)};
            byte[] bArr = n8.c.f8115a;
            strArr[i6] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i6++;
        }
        String[] strArr2 = f9396c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = a4.x.n(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f9396c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i13]);
            sb.append('|');
            strArr3[i14 | 8] = a4.x.n(sb, strArr3[i12], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f9396c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f9397d[i];
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r10, int r11, int r12, byte r13, byte r14) {
        /*
            java.lang.String[] r0 = s8.e.f9395b
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r13 >= r1) goto La
            r0 = r0[r13]
            goto L1c
        La:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            byte[] r0 = n8.c.f8115a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r0, r4, r1)
        L1c:
            r1 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            if (r14 != 0) goto L25
            java.lang.String r13 = ""
            goto L6b
        L25:
            java.lang.String[] r7 = s8.e.f9397d
            if (r13 == r5) goto L69
            if (r13 == r4) goto L69
            if (r13 == r6) goto L61
            r8 = 6
            if (r13 == r8) goto L61
            r8 = 7
            if (r13 == r8) goto L69
            r8 = 8
            if (r13 == r8) goto L69
            java.lang.String[] r8 = s8.e.f9396c
            int r9 = r8.length
            if (r14 >= r9) goto L3f
            r7 = r8[r14]
            goto L41
        L3f:
            r7 = r7[r14]
        L41:
            if (r13 != r1) goto L50
            r8 = r14 & 4
            if (r8 == 0) goto L50
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = r7.replace(r13, r14)
            goto L6b
        L50:
            if (r13 != 0) goto L5f
            r13 = r14 & 32
            if (r13 == 0) goto L5f
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = r7.replace(r13, r14)
            goto L6b
        L5f:
            r13 = r7
            goto L6b
        L61:
            if (r14 != r3) goto L66
            java.lang.String r13 = "ACK"
            goto L6b
        L66:
            r13 = r7[r14]
            goto L6b
        L69:
            r13 = r7[r14]
        L6b:
            if (r10 == 0) goto L70
            java.lang.String r10 = "<<"
            goto L72
        L70:
            java.lang.String r10 = ">>"
        L72:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r2] = r10
            r14[r3] = r11
            r14[r5] = r12
            r14[r4] = r0
            r14[r6] = r13
            byte[] r10 = n8.c.f8115a
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = java.lang.String.format(r10, r11, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.e.a(boolean, int, int, byte, byte):java.lang.String");
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = n8.c.f8115a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = n8.c.f8115a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
