package e1;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.m0 f4231b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4232l;

    public /* synthetic */ r1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.m0 m0Var, int i) {
        this.f4230a = i;
        this.f4231b = m0Var;
        this.f4232l = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4230a) {
            case 0:
                w3 w3VarP = this.f4232l.i.p();
                com.google.android.gms.internal.measurement.m0 m0Var = this.f4231b;
                w3VarP.g();
                w3VarP.h();
                w3VarP.u(new x1((Object) w3VarP, w3VarP.w(false), (Object) m0Var, 6));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f4232l;
                a5 a5Var = appMeasurementDynamiteService.i.f4268r;
                t1.k(a5Var);
                t1 t1Var = appMeasurementDynamiteService.i;
                a5Var.T(this.f4231b, t1Var.H != null && t1Var.H.booleanValue());
                break;
        }
    }
}
