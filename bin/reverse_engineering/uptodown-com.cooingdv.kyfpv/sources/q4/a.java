package q4;

import com.google.android.gms.internal.measurement.i5;
import java.io.IOException;
import k0.k;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8679b;

    public /* synthetic */ a(c cVar, int i) {
        this.f8678a = i;
        this.f8679b = cVar;
    }

    private final void a() {
        c cVar;
        c cVar2;
        while (true) {
            try {
                try {
                    synchronized (this.f8679b.i) {
                        while (true) {
                            try {
                                c cVar3 = this.f8679b;
                                if (cVar3.j || cVar3.f8692o < cVar3.i.size()) {
                                    break;
                                }
                                c cVar4 = this.f8679b;
                                cVar4.f8688k = false;
                                cVar4.i.wait();
                            } finally {
                            }
                        }
                    }
                    c cVar5 = this.f8679b;
                    if (cVar5.f8692o >= cVar5.f8690m) {
                        while (true) {
                            cVar2 = this.f8679b;
                            if (cVar2.f8691n == cVar2.f8692o) {
                                break;
                            } else {
                                i5.C("Waiting for read and write to catch up before cleanup.");
                            }
                        }
                        c.a(cVar2);
                    }
                    c cVar6 = this.f8679b;
                    int i = cVar6.f8692o;
                    int size = cVar6.i.size();
                    cVar = this.f8679b;
                    if (i < size) {
                        cVar.f8688k = true;
                        o4.a aVar = (o4.a) cVar.i.get(cVar.f8692o);
                        aVar.e();
                        i5.C("Executing: " + aVar.b() + " with context: " + k.n(this.f8679b.f8685c));
                        this.f8679b.h.write(aVar.b());
                        this.f8679b.h.flush();
                        this.f8679b.h.write("\necho F*D^W@#FGF " + this.f8679b.f8693p + " $?\n");
                        this.f8679b.h.flush();
                        c cVar7 = this.f8679b;
                        cVar7.f8692o = cVar7.f8692o + 1;
                        cVar7.f8693p = cVar7.f8693p + 1;
                    } else if (cVar.j) {
                        break;
                    }
                } finally {
                    c cVar8 = this.f8679b;
                    cVar8.f8692o = 0;
                    c.b(cVar8.h);
                }
            } catch (IOException e10) {
                e = e10;
                i5.C(e.getMessage());
            } catch (InterruptedException e11) {
                e = e11;
                i5.C(e.getMessage());
            }
        }
        cVar.f8688k = false;
        cVar.h.write("\nexit 0\n");
        this.f8679b.h.flush();
        i5.C("Closing shell");
        c cVar9 = this.f8679b;
        cVar9.f8692o = 0;
        c.b(cVar9.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        r9.f8679b.f8687e.waitFor();
        r9.f8679b.f8687e.destroy();
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a.run():void");
    }
}
