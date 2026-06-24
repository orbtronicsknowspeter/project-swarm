package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends l5 {
    private static final q3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        q3 q3Var = new q3();
        zzg = q3Var;
        l5.l(q3.class, q3Var);
    }

    public static p3 p() {
        return (p3) zzg.g();
    }

    public static q3 q() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final Object n(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new l6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", s1.f2798n, "zze", s1.f2796l, "zzf", s1.f2797m});
        }
        if (i6 == 3) {
            return new q3();
        }
        if (i6 == 4) {
            return new p3(zzg);
        }
        if (i6 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int o() {
        int iJ = androidx.lifecycle.l.j(this.zze);
        if (iJ == 0) {
            return 1;
        }
        return iJ;
    }

    public final void r(int i) {
        this.zze = androidx.lifecycle.l.l(i);
        this.zzb |= 2;
    }

    public final int s() {
        int i;
        int i6 = this.zzd;
        if (i6 != 0) {
            i = 2;
            if (i6 != 1) {
                if (i6 != 2) {
                    i = 4;
                    if (i6 != 3) {
                        i = i6 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t() {
        /*
            r4 = this;
            int r0 = r4.zzf
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q3.t():int");
    }

    public final /* synthetic */ void u(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
