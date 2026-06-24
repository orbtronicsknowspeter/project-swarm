package s7;

import java.util.Arrays;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f9346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9347b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9348l;

    public final d b() {
        d dVarC;
        synchronized (this) {
            try {
                d[] dVarArrD = this.f9346a;
                if (dVarArrD == null) {
                    dVarArrD = d();
                    this.f9346a = dVarArrD;
                } else if (this.f9347b >= dVarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrD, dVarArrD.length * 2);
                    this.f9346a = (d[]) objArrCopyOf;
                    dVarArrD = (d[]) objArrCopyOf;
                }
                int i = this.f9348l;
                do {
                    dVarC = dVarArrD[i];
                    if (dVarC == null) {
                        dVarC = c();
                        dVarArrD[i] = dVarC;
                    }
                    i++;
                    if (i >= dVarArrD.length) {
                        i = 0;
                    }
                } while (!dVarC.a(this));
                this.f9348l = i;
                this.f9347b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarC;
    }

    public abstract d c();

    public abstract d[] d();

    public final void e(d dVar) {
        int i;
        t6.c[] cVarArrB;
        synchronized (this) {
            try {
                int i6 = this.f9347b - 1;
                this.f9347b = i6;
                if (i6 == 0) {
                    this.f9348l = 0;
                }
                dVar.getClass();
                cVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (t6.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(x.f8464a);
            }
        }
    }
}
