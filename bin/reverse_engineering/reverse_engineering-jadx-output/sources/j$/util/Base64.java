package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    public static Decoder getUrlDecoder() {
        return Decoder.f5961c;
    }

    public static class Decoder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f5959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f5960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Decoder f5961c;

        static {
            int[] iArr = new int[256];
            f5959a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                f5959a[c.f5973a[i]] = i;
            }
            f5959a[61] = -2;
            int[] iArr2 = new int[256];
            f5960b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i6 = 0; i6 < 64; i6++) {
                f5960b[c.f5974b[i6]] = i6;
            }
            f5960b[61] = -2;
            f5961c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        
            if (r9 != 18) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
        
            if (r9 != 6) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
        
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:
        
            if (r9 != 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
        
            r0 = r10 + 1;
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 2;
            r5[r0] = (byte) (r11 >> 8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0128, code lost:
        
            if (r9 == 12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x012a, code lost:
        
            if (r8 < r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:
        
            if (r10 == r1) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0132, code lost:
        
            return java.util.Arrays.copyOf(r5, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
        
            j$.time.g.i("Input byte array has incorrect ending byte at ", r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
        
            j$.time.g.c("Last unit does not have enough valid bits");
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public byte[] decode(java.lang.String r21) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }
}
