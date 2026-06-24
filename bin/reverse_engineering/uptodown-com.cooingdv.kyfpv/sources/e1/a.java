package e1;

import androidx.collection.ArrayMap;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3741b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f3743m;

    public a(m3 m3Var, j3 j3Var, long j) {
        this.f3740a = 2;
        this.f3741b = j3Var;
        this.f3742l = j;
        Objects.requireNonNull(m3Var);
        this.f3743m = m3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3740a) {
            case 0:
                y yVar = (y) this.f3743m;
                String str = (String) this.f3741b;
                yVar.g();
                k0.y.d(str);
                ArrayMap arrayMap = yVar.f4410l;
                boolean zIsEmpty = arrayMap.isEmpty();
                long j = this.f3742l;
                if (zIsEmpty) {
                    yVar.f4411m = j;
                }
                Integer num = (Integer) arrayMap.get(str);
                if (num != null) {
                    arrayMap.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (arrayMap.size() < 100) {
                    arrayMap.put(str, 1);
                    yVar.f4409b.put(str, Long.valueOf(j));
                } else {
                    w0 w0Var = yVar.f3876a.f4265o;
                    t1.m(w0Var);
                    w0Var.f4343r.b("Too many ads visible");
                }
                break;
            case 1:
                y yVar2 = (y) this.f3743m;
                String str2 = (String) this.f3741b;
                yVar2.g();
                k0.y.d(str2);
                ArrayMap arrayMap2 = yVar2.f4410l;
                Integer num2 = (Integer) arrayMap2.get(str2);
                t1 t1Var = yVar2.f3876a;
                if (num2 == null) {
                    w0 w0Var2 = t1Var.f4265o;
                    t1.m(w0Var2);
                    w0Var2.f4340o.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    m3 m3Var = t1Var.f4271u;
                    w0 w0Var3 = t1Var.f4265o;
                    t1.l(m3Var);
                    j3 j3VarM = m3Var.m(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        arrayMap2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        arrayMap2.remove(str2);
                        ArrayMap arrayMap3 = yVar2.f4409b;
                        Long l10 = (Long) arrayMap3.get(str2);
                        long j6 = this.f3742l;
                        if (l10 == null) {
                            t1.m(w0Var3);
                            w0Var3.f4340o.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j6 - l10.longValue();
                            arrayMap3.remove(str2);
                            yVar2.l(str2, jLongValue, j3VarM);
                        }
                        if (arrayMap2.isEmpty()) {
                            long j10 = yVar2.f4411m;
                            if (j10 != 0) {
                                yVar2.k(j6 - j10, j3VarM);
                                yVar2.f4411m = 0L;
                            } else {
                                t1.m(w0Var3);
                                w0Var3.f4340o.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                m3 m3Var2 = (m3) this.f3743m;
                m3Var2.k((j3) this.f3741b, false, this.f3742l);
                m3Var2.f4123n = null;
                w3 w3VarP = m3Var2.f3876a.p();
                w3VarP.g();
                w3VarP.h();
                w3VarP.u(new m1.a(w3VarP, (j3) null));
                break;
        }
    }

    public /* synthetic */ a(y yVar, String str, long j, int i) {
        this.f3740a = i;
        this.f3741b = str;
        this.f3742l = j;
        this.f3743m = yVar;
    }
}
