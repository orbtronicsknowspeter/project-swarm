package e1;

import android.content.SharedPreferences;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f3970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f3971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2 f3972e;

    public /* synthetic */ f1(g1 g1Var, long j) {
        this.f3972e = g1Var;
        k0.y.d("health_monitor");
        k0.y.b(j > 0);
        this.f3969b = "health_monitor:start";
        this.f3970c = "health_monitor:count";
        this.f3971d = "health_monitor:value";
        this.f3968a = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(long r11, com.google.android.gms.internal.measurement.b3 r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.f1.a(long, com.google.android.gms.internal.measurement.b3):boolean");
    }

    public void b() {
        g1 g1Var = (g1) this.f3972e;
        g1Var.g();
        g1Var.f3876a.f4270t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = g1Var.k().edit();
        editorEdit.remove((String) this.f3970c);
        editorEdit.remove((String) this.f3971d);
        editorEdit.putLong((String) this.f3969b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ f1(u4 u4Var) {
        this.f3972e = u4Var;
    }
}
