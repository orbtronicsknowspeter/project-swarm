package f4;

import android.app.Activity;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.uptodown.UptodownApp;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements NsdManager.RegistrationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UptodownApp f4875a;

    public b(UptodownApp uptodownApp) {
        this.f4875a = uptodownApp;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        this.f4875a.b();
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        Activity activity = c.f4876o;
        String serviceName = nsdServiceInfo.getServiceName();
        serviceName.getClass();
        c.f4881t = serviceName;
        this.f4875a.f4889l.set(true);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        UptodownApp uptodownApp = this.f4875a;
        AtomicBoolean atomicBoolean = uptodownApp.f4887a;
        if (atomicBoolean.get()) {
            uptodownApp.f4889l.set(false);
        }
        if (uptodownApp.f4888b.get() || !atomicBoolean.compareAndSet(true, false)) {
            return;
        }
        Context applicationContext = uptodownApp.getApplicationContext();
        applicationContext.getClass();
        uptodownApp.a(applicationContext);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
    }
}
