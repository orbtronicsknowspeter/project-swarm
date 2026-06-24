package a4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {
    public static final Object B = new Object();
    public static final d C = new d(0);
    public static final AtomicInteger D = new AtomicInteger();
    public static final e E = new e();
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100a = D.incrementAndGet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f101b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a3.d f103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bitmap f111u;
    public Future v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Exception f113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f115z;

    public h(g0 g0Var, q qVar, a3.d dVar, o0 o0Var, b bVar, n0 n0Var) {
        this.f101b = g0Var;
        this.f102l = qVar;
        this.f103m = dVar;
        this.f104n = o0Var;
        this.f109s = bVar;
        this.f105o = bVar.f71d;
        k0 k0Var = bVar.f69b;
        this.f106p = k0Var;
        this.A = k0Var.h;
        this.f107q = 0;
        this.f108r = n0Var;
        this.f115z = n0Var.d();
    }

    public static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            q0 q0Var = (q0) list.get(i);
            try {
                Bitmap bitmapA = q0Var.a(bitmap);
                if (bitmapA == null) {
                    StringBuilder sbT = x.t("Transformation ");
                    sbT.append(q0Var.b());
                    sbT.append(" returned null after ");
                    sbT.append(i);
                    sbT.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sbT.append(((q0) it.next()).b());
                        sbT.append('\n');
                    }
                    g0.j.post(new f(sbT, 0));
                    return null;
                }
                if (bitmapA == bitmap && bitmap.isRecycled()) {
                    g0.j.post(new g(q0Var, 0));
                    return null;
                }
                if (bitmapA != bitmap && !bitmap.isRecycled()) {
                    g0.j.post(new g(q0Var, 1));
                    return null;
                }
                i++;
                bitmap = bitmapA;
            } catch (RuntimeException e10) {
                g0.j.post(new m1.a(1, q0Var, e10));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap c(w8.g0 g0Var, k0 k0Var) throws IOException {
        g0Var.getClass();
        w8.a0 a0Var = new w8.a0(g0Var);
        boolean z9 = a0Var.d(0L, t0.f178b) && a0Var.d(8L, t0.f179c);
        k0Var.getClass();
        int i = k0Var.f130e;
        int i6 = k0Var.f129d;
        BitmapFactory.Options optionsC = n0.c(k0Var);
        boolean z10 = optionsC != null && optionsC.inJustDecodeBounds;
        if (z9) {
            w8.h hVar = a0Var.f10935b;
            hVar.z(g0Var);
            byte[] bArrI = hVar.i(hVar.f10962b);
            if (z10) {
                BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length, optionsC);
                n0.a(i6, i, optionsC.outWidth, optionsC.outHeight, optionsC, k0Var);
            }
            return BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length, optionsC);
        }
        w8.f fVar = new w8.f(a0Var, 1);
        InputStream inputStream = fVar;
        if (z10) {
            w wVar = new w(fVar);
            wVar.f187o = false;
            long j = wVar.f183b + ((long) 1024);
            if (wVar.f185m < j) {
                wVar.c(j);
            }
            long j6 = wVar.f183b;
            BitmapFactory.decodeStream(wVar, null, optionsC);
            n0.a(i6, i, optionsC.outWidth, optionsC.outHeight, optionsC, k0Var);
            wVar.b(j6);
            wVar.f187o = true;
            inputStream = wVar;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, optionsC);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        com.google.gson.internal.a.n("Failed to decode stream.");
        return null;
    }

    public static h e(g0 g0Var, q qVar, a3.d dVar, o0 o0Var, b bVar) {
        k0 k0Var = bVar.f69b;
        List list = g0Var.f96b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n0 n0Var = (n0) list.get(i);
            if (n0Var.b(k0Var)) {
                return new h(g0Var, qVar, dVar, o0Var, bVar, n0Var);
            }
        }
        return new h(g0Var, qVar, dVar, o0Var, bVar, E);
    }

    public static Bitmap g(k0 k0Var, Bitmap bitmap, int i) {
        float f;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        k0Var.getClass();
        int i15 = k0Var.g;
        int i16 = k0Var.f130e;
        int i17 = k0Var.f129d;
        int i18 = i16;
        Matrix matrix = new Matrix();
        int i19 = 0;
        if (k0Var.d() || i != 0) {
            if (i != 0) {
                switch (i) {
                    case 3:
                    case 4:
                        i14 = SubsamplingScaleImageView.ORIENTATION_180;
                        break;
                    case 5:
                    case 6:
                        i14 = 90;
                        break;
                    case 7:
                    case 8:
                        i14 = 270;
                        break;
                    default:
                        i14 = 0;
                        break;
                }
                int i20 = (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
                if (i14 != 0) {
                    matrix.preRotate(i14);
                    if (i14 == 90 || i14 == 270) {
                        i18 = i17;
                        i17 = i18;
                    }
                }
                if (i20 != 1) {
                    matrix.postScale(i20, 1.0f);
                }
            }
            if (k0Var.f) {
                if (i17 != 0) {
                    f13 = i17;
                    f14 = width;
                } else {
                    f13 = i18;
                    f14 = height;
                }
                float f17 = f13 / f14;
                if (i18 != 0) {
                    f15 = i18;
                    f16 = height;
                } else {
                    f15 = i17;
                    f16 = width;
                }
                float f18 = f15 / f16;
                if (f17 > f18) {
                    int iCeil = (int) Math.ceil((f18 / f17) * height);
                    int i21 = (i15 & 48) == 48 ? 0 : (i15 & 80) == 80 ? height - iCeil : (height - iCeil) / 2;
                    height = iCeil;
                    f18 = i18 / iCeil;
                    i6 = i21;
                } else if (f17 < f18) {
                    int iCeil2 = (int) Math.ceil((f17 / f18) * width);
                    int i22 = (i15 & 3) == 3 ? 0 : (i15 & 5) == 5 ? width - iCeil2 : (width - iCeil2) / 2;
                    width = iCeil2;
                    f17 = i17 / iCeil2;
                    i6 = 0;
                    i19 = i22;
                } else {
                    f17 = f18;
                    i6 = 0;
                }
                matrix.preScale(f17, f18);
                int i23 = height;
                i10 = width;
                i11 = i6;
                i12 = i23;
                i13 = i19;
            } else {
                if ((i17 != 0 || i18 != 0) && (i17 != width || i18 != height)) {
                    if (i17 != 0) {
                        f = i17;
                        f10 = width;
                    } else {
                        f = i18;
                        f10 = height;
                    }
                    float f19 = f / f10;
                    if (i18 != 0) {
                        f11 = i18;
                        f12 = height;
                    } else {
                        f11 = i17;
                        f12 = width;
                    }
                    matrix.preScale(f19, f11 / f12);
                }
                i12 = height;
                i13 = 0;
                i10 = width;
                i11 = 0;
            }
        } else {
            i12 = height;
            i13 = 0;
            i10 = width;
            i11 = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i13, i11, i10, i12, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static void h(k0 k0Var) {
        Uri uri = (Uri) k0Var.f127b;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(k0Var.f128c);
        StringBuilder sb = (StringBuilder) C.get();
        sb.ensureCapacity(strValueOf.length() + 8);
        sb.replace(8, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    public final boolean b() {
        ArrayList arrayList;
        Future future;
        return this.f109s == null && ((arrayList = this.f110t) == null || arrayList.isEmpty()) && (future = this.v) != null && future.cancel(false);
    }

    public final void d(b bVar) {
        boolean zRemove;
        if (this.f109s == bVar) {
            this.f109s = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f110t;
            zRemove = arrayList != null ? arrayList.remove(bVar) : false;
        }
        if (zRemove && bVar.f69b.h == this.A) {
            ArrayList arrayList2 = this.f110t;
            boolean z9 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            b bVar2 = this.f109s;
            if (bVar2 != null || z9) {
                i = bVar2 != null ? bVar2.f69b.h : 1;
                if (z9) {
                    int size = this.f110t.size();
                    for (int i = 0; i < size; i++) {
                        int i6 = ((b) this.f110t.get(i)).f69b.h;
                        if (c.j.c(i6) > c.j.c(i)) {
                            i = i6;
                        }
                    }
                }
            }
            this.A = i;
        }
        this.f101b.getClass();
    }

    public final Bitmap f() throws IOException {
        v vVar = (v) ((u) this.f103m.f63b).get(this.f105o);
        Bitmap bitmapG = vVar != null ? vVar.f180a : null;
        boolean z9 = true;
        if (bitmapG != null) {
            this.f104n.f148b.sendEmptyMessage(0);
            this.f112w = 1;
            this.f101b.getClass();
            return bitmapG;
        }
        int i = this.f115z == 0 ? 4 : this.f107q;
        this.f107q = i;
        m0 m0VarE = this.f108r.e(this.f106p, i);
        if (m0VarE != null) {
            this.f112w = m0VarE.f141a;
            this.f114y = m0VarE.f144d;
            bitmapG = m0VarE.f142b;
            if (bitmapG == null) {
                w8.g0 g0Var = m0VarE.f143c;
                try {
                    bitmapG = c(g0Var, this.f106p);
                } finally {
                    try {
                        g0Var.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmapG != null) {
            this.f101b.getClass();
            o0 o0Var = this.f104n;
            o0Var.getClass();
            StringBuilder sb = t0.f177a;
            int allocationByteCount = bitmapG.getAllocationByteCount();
            if (allocationByteCount < 0) {
                a3.b.l(bitmapG, "Negative size: ");
                return null;
            }
            n nVar = o0Var.f148b;
            nVar.sendMessage(nVar.obtainMessage(2, allocationByteCount, 0));
            k0 k0Var = this.f106p;
            if (k0Var.d() || ((List) k0Var.i) != null || this.f114y != 0) {
                synchronized (B) {
                    try {
                        if (this.f106p.d() || this.f114y != 0) {
                            bitmapG = g(this.f106p, bitmapG, this.f114y);
                            this.f101b.getClass();
                        }
                        List list = (List) this.f106p.i;
                        if (list == null) {
                            z9 = false;
                        }
                        if (z9) {
                            bitmapG = a(list, bitmapG);
                            this.f101b.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmapG != null) {
                    o0 o0Var2 = this.f104n;
                    o0Var2.getClass();
                    int allocationByteCount2 = bitmapG.getAllocationByteCount();
                    if (allocationByteCount2 < 0) {
                        a3.b.l(bitmapG, "Negative size: ");
                        return null;
                    }
                    n nVar2 = o0Var2.f148b;
                    nVar2.sendMessage(nVar2.obtainMessage(3, allocationByteCount2, 0));
                }
            }
        }
        return bitmapG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f102l;
        try {
            try {
                try {
                    h(this.f106p);
                    this.f101b.getClass();
                    Bitmap bitmapF = f();
                    this.f111u = bitmapF;
                    if (bitmapF == null) {
                        n nVar = qVar.h;
                        nVar.sendMessage(nVar.obtainMessage(6, this));
                    } else {
                        qVar.b(this);
                    }
                } catch (a0 e10) {
                    this.f113x = e10;
                    n nVar2 = qVar.h;
                    nVar2.sendMessage(nVar2.obtainMessage(6, this));
                } catch (Exception e11) {
                    this.f113x = e11;
                    n nVar3 = qVar.h;
                    nVar3.sendMessage(nVar3.obtainMessage(6, this));
                }
            } catch (IOException e12) {
                this.f113x = e12;
                n nVar4 = qVar.h;
                nVar4.sendMessageDelayed(nVar4.obtainMessage(5, this), 500L);
            } catch (OutOfMemoryError e13) {
                StringWriter stringWriter = new StringWriter();
                this.f104n.a().a(new PrintWriter(stringWriter));
                this.f113x = new RuntimeException(stringWriter.toString(), e13);
                n nVar5 = qVar.h;
                nVar5.sendMessage(nVar5.obtainMessage(6, this));
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
