package k0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends t {
    public final IBinder g;
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e eVar, int i, IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.h = eVar;
        this.g = iBinder;
    }

    @Override // k0.t
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            y.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.h;
            if (!eVar.u().equals(interfaceDescriptor)) {
                String strU = eVar.u();
                StringBuilder sb = new StringBuilder(strU.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strU);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceN = eVar.n(iBinder);
            if (iInterfaceN == null || !(eVar.x(2, 4, iInterfaceN) || eVar.x(3, 4, iInterfaceN))) {
                return false;
            }
            eVar.C = null;
            b bVar = eVar.f6853x;
            if (bVar == null) {
                return true;
            }
            bVar.d();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // k0.t
    public final void b(h0.b bVar) {
        c cVar = this.h.f6854y;
        if (cVar != null) {
            cVar.a(bVar);
        }
        System.currentTimeMillis();
    }
}
