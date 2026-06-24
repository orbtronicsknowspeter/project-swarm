package s8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.a0 f9388b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9387a = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f9391e = new b[8];
    public int f = 7;
    public int g = 0;
    public int h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9389c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9390d = 4096;

    public c(r rVar) {
        this.f9388b = new w8.a0(rVar);
    }

    public final int a(int i) {
        int i6;
        int i10 = 0;
        if (i > 0) {
            int length = this.f9391e.length;
            while (true) {
                length--;
                i6 = this.f;
                if (length < i6 || i <= 0) {
                    break;
                }
                int i11 = this.f9391e[length].f9386c;
                i -= i11;
                this.h -= i11;
                this.g--;
                i10++;
            }
            b[] bVarArr = this.f9391e;
            System.arraycopy(bVarArr, i6 + 1, bVarArr, i6 + 1 + i10, this.g);
            this.f += i10;
        }
        return i10;
    }

    public final w8.k b(int i) throws IOException {
        if (i >= 0) {
            b[] bVarArr = d.f9392a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f9384a;
            }
        }
        int length = this.f + 1 + (i - d.f9392a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f9391e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f9384a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f9387a.add(bVar);
        int i = bVar.f9386c;
        int i6 = this.f9390d;
        if (i > i6) {
            Arrays.fill(this.f9391e, (Object) null);
            this.f = this.f9391e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i6);
        int i10 = this.g + 1;
        b[] bVarArr = this.f9391e;
        if (i10 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f = this.f9391e.length - 1;
            this.f9391e = bVarArr2;
        }
        int i11 = this.f;
        this.f = i11 - 1;
        this.f9391e[i11] = bVar;
        this.g++;
        this.h += i;
    }

    public final w8.k d() {
        w8.a0 a0Var = this.f9388b;
        byte b7 = a0Var.readByte();
        int i = b7 & 255;
        boolean z9 = (b7 & 128) == 128;
        int iE = e(i, 127);
        if (!z9) {
            return a0Var.g(iE);
        }
        y yVar = y.f9481d;
        long j = iE;
        a0Var.t(j);
        byte[] bArrI = a0Var.f10935b.i(j);
        yVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g0.o oVar = yVar.f9482a;
        g0.o oVar2 = oVar;
        int i6 = 0;
        int i10 = 0;
        for (byte b10 : bArrI) {
            i6 = (i6 << 8) | (b10 & 255);
            i10 += 8;
            while (i10 >= 8) {
                oVar2 = ((g0.o[]) oVar2.f5105c)[(i6 >>> (i10 - 8)) & 255];
                if (((g0.o[]) oVar2.f5105c) == null) {
                    byteArrayOutputStream.write(oVar2.f5103a);
                    i10 -= oVar2.f5104b;
                    oVar2 = oVar;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            g0.o oVar3 = ((g0.o[]) oVar2.f5105c)[(i6 << (8 - i10)) & 255];
            g0.o[] oVarArr = (g0.o[]) oVar3.f5105c;
            int i11 = oVar3.f5104b;
            if (oVarArr != null || i11 > i10) {
                break;
            }
            byteArrayOutputStream.write(oVar3.f5103a);
            i10 -= i11;
            oVar2 = oVar;
        }
        return w8.k.n(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i, int i6) {
        int i10 = i & i6;
        if (i10 < i6) {
            return i10;
        }
        int i11 = 0;
        while (true) {
            byte b7 = this.f9388b.readByte();
            int i12 = b7 & 255;
            if ((b7 & 128) == 0) {
                return i6 + (i12 << i11);
            }
            i6 += (b7 & 127) << i11;
            i11 += 7;
        }
    }
}
