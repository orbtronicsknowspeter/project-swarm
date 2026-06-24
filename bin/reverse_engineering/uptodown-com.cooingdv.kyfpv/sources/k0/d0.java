package k0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6839b;

    public d0(e eVar, int i) {
        this.f6839b = eVar;
        this.f6838a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar = this.f6839b;
        if (iBinder == null) {
            eVar.y();
            return;
        }
        synchronized (eVar.f6847q) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.f6848r = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new u(iBinder) : (u) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = this.f6839b;
        int i = this.f6838a;
        eVar2.getClass();
        f0 f0Var = new f0(eVar2, 0, null);
        b0 b0Var = eVar2.f6845o;
        b0Var.sendMessage(b0Var.obtainMessage(7, i, -1, f0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f6839b;
        synchronized (eVar.f6847q) {
            eVar.f6848r = null;
        }
        e eVar2 = this.f6839b;
        int i = this.f6838a;
        b0 b0Var = eVar2.f6845o;
        b0Var.sendMessage(b0Var.obtainMessage(6, i, 1));
    }
}
