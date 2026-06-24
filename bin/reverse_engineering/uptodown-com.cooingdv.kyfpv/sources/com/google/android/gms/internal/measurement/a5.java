package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class a5 implements Iterable, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a5 f2490l = new a5(r5.f2779b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2491a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2492b;

    static {
        int i = u4.f2819a;
    }

    public a5(byte[] bArr) {
        bArr.getClass();
        this.f2492b = bArr;
    }

    public static a5 e(int i, int i6, byte[] bArr) {
        g(i, i + i6, bArr.length);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i, bArr2, 0, i6);
        return new a5(bArr2);
    }

    public static int g(int i, int i6, int i10) {
        int i11 = i6 - i;
        if ((i | i6 | i11 | (i10 - i6)) >= 0) {
            return i11;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i6 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i6).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i6);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 15 + String.valueOf(i10).length());
        sb3.append("End index: ");
        sb3.append(i6);
        sb3.append(" >= ");
        sb3.append(i10);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public byte b(int i) {
        return this.f2492b[i];
    }

    public byte c(int i) {
        return this.f2492b[i];
    }

    public int d() {
        return this.f2492b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a5) && d() == ((a5) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof a5)) {
                return obj.equals(this);
            }
            a5 a5Var = (a5) obj;
            int i = this.f2491a;
            int i6 = a5Var.f2491a;
            if (i == 0 || i6 == 0 || i == i6) {
                int iD = d();
                if (iD > a5Var.d()) {
                    int iD2 = d();
                    StringBuilder sb = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
                    sb.append("Length too large: ");
                    sb.append(iD);
                    sb.append(iD2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iD <= a5Var.d()) {
                    byte[] bArr = a5Var.f2492b;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < iD) {
                        if (this.f2492b[i10] == bArr[i11]) {
                            i10++;
                            i11++;
                        }
                    }
                    return true;
                }
                int iD3 = a5Var.d();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iD);
                sb2.append(", ");
                sb2.append(iD3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2491a;
        if (i != 0) {
            return i;
        }
        int iD = d();
        int i6 = iD;
        for (int i10 = 0; i10 < iD; i10++) {
            i6 = (i6 * 31) + this.f2492b[i10];
        }
        if (i6 == 0) {
            i6 = 1;
        }
        this.f2491a = i6;
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new y4(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = t0.f.N(this);
        } else {
            int iG = g(0, 47, d());
            strConcat = t0.f.N(iG == 0 ? f2490l : new z4(this.f2492b, iG)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return a4.x.n(sb, strConcat, "\">");
    }
}
