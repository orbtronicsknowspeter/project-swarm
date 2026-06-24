package e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f3844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3846c;

    public c1(u4 u4Var) {
        k0.y.g(u4Var);
        this.f3844a = u4Var;
    }

    public final void a() {
        u4 u4Var = this.f3844a;
        u4Var.l0();
        u4Var.b().g();
        u4Var.b().g();
        if (this.f3845b) {
            u4Var.a().f4347w.b("Unregistering connectivity change receiver");
            this.f3845b = false;
            this.f3846c = false;
            try {
                u4Var.f4317u.f4260a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                u4Var.a().f4340o.c(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u4 u4Var = this.f3844a;
        u4Var.l0();
        String action = intent.getAction();
        u4Var.a().f4347w.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            u4Var.a().f4343r.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        a1 a1Var = u4Var.f4307b;
        u4.U(a1Var);
        boolean zA = a1Var.A();
        if (this.f3846c != zA) {
            this.f3846c = zA;
            u4Var.b().p(new a4.f(this, zA));
        }
    }
}
