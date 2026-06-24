package f8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends a2.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4952c;

    public f(q qVar, boolean z9) {
        super(qVar);
        this.f4952c = z9;
    }

    @Override // a2.i
    public final void c(byte b7) {
        if (this.f4952c) {
            h(String.valueOf(b7 & 255));
            return;
        }
        String strValueOf = String.valueOf(b7 & 255);
        strValueOf.getClass();
        ((q) this.f23b).i(strValueOf);
    }

    @Override // a2.i
    public final void e(int i) {
        if (this.f4952c) {
            h(Long.toString(4294967295L & ((long) i), 10));
            return;
        }
        String string = Long.toString(4294967295L & ((long) i), 10);
        string.getClass();
        ((q) this.f23b).i(string);
    }

    @Override // a2.i
    public final void f(long j) {
        int i = 63;
        String str = "0";
        if (this.f4952c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j6 = (j >>> 1) / ((long) 5);
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j6 * j10)), 10);
                    while (j6 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j6 % j10), 10);
                        j6 /= j10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            h(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (j >>> 1) / ((long) 5);
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j11 * j12)), 10);
                while (j11 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((q) this.f23b).i(str);
    }

    @Override // a2.i
    public final void g(short s6) {
        if (this.f4952c) {
            h(String.valueOf(s6 & 65535));
            return;
        }
        String strValueOf = String.valueOf(s6 & 65535);
        strValueOf.getClass();
        ((q) this.f23b).i(strValueOf);
    }
}
