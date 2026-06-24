package e1;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d4 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3877e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Object obj, f2 f2Var, int i) {
        super(f2Var);
        this.f3877e = i;
        this.f = obj;
    }

    @Override // e1.n
    public final void a() {
        switch (this.f3877e) {
            case 0:
                e4 e4Var = (e4) this.f;
                f4 f4Var = e4Var.f3913d;
                f4Var.g();
                t1 t1Var = f4Var.f3876a;
                t1Var.f4270t.getClass();
                e4Var.a(false, false, SystemClock.elapsedRealtime());
                y yVar = t1Var.f4272w;
                t1.j(yVar);
                t1Var.f4270t.getClass();
                yVar.j(SystemClock.elapsedRealtime());
                break;
            case 1:
                k4 k4Var = (k4) this.f;
                k4Var.k();
                w0 w0Var = k4Var.f3876a.f4265o;
                t1.m(w0Var);
                w0Var.f4347w.b("Starting upload from DelayedRunnable");
                k4Var.f4093b.q();
                break;
            default:
                u4 u4Var = (u4) this.f;
                u4Var.b().g();
                String str = (String) u4Var.f4321z.pollFirst();
                if (str != null) {
                    u4Var.f().getClass();
                    u4Var.R = SystemClock.elapsedRealtime();
                    u4Var.a().f4347w.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    u4.S(u4Var.f4317u.f4260a, intent);
                }
                u4Var.H();
                break;
        }
    }
}
