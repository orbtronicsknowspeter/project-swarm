package e1;

import com.google.android.gms.internal.measurement.x5;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f4071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4072c;

    public /* synthetic */ k1(m1 m1Var, String str, int i) {
        this.f4070a = i;
        this.f4071b = m1Var;
        this.f4072c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4070a) {
            case 0:
                return new com.google.android.gms.internal.measurement.k4(new k1(this.f4071b, this.f4072c, 1));
            case 1:
                m1 m1Var = this.f4071b;
                m mVar = m1Var.f4093b.f4308l;
                u4.U(mVar);
                String str = this.f4072c;
                b1 b1VarI0 = mVar.i0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                m1Var.f3876a.f4263m.l();
                map.put("gmp_version", 133005L);
                if (b1VarI0 != null) {
                    String strN = b1VarI0.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(b1VarI0.P()));
                    map.put("dynamite_version", Long.valueOf(b1VarI0.b()));
                }
                return map;
            default:
                android.support.v4.media.g gVar = new android.support.v4.media.g(this.f4071b, this.f4072c, 6, false);
                x5 x5Var = new x5("internal.remoteConfig", 0);
                x5Var.f2651b.put("getValue", new com.google.android.gms.internal.measurement.k4(x5Var, gVar));
                return x5Var;
        }
    }
}
