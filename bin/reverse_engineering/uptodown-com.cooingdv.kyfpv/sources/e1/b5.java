package e1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b5 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.r0 f3827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3828b;

    public b5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.r0 r0Var) {
        this.f3828b = appMeasurementDynamiteService;
        this.f3827a = r0Var;
    }

    @Override // e1.l2
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f3827a.k(j, bundle, str, str2);
        } catch (RemoteException e10) {
            t1 t1Var = this.f3828b.i;
            if (t1Var != null) {
                w0 w0Var = t1Var.f4265o;
                t1.m(w0Var);
                w0Var.f4343r.c(e10, "Event listener threw exception");
            }
        }
    }
}
