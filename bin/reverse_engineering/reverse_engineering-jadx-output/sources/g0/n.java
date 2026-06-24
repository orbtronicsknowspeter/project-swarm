package g0;

import android.content.Context;
import android.util.Log;
import j1.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static n f5097e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f5100c = new k(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5101d = 1;

    public n(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5099b = scheduledExecutorService;
        this.f5098a = context.getApplicationContext();
    }

    public static synchronized n a(Context context) {
        try {
            if (f5097e == null) {
                f5097e = new n(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new q0.a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5097e;
    }

    public final synchronized p b(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!this.f5100c.d(lVar)) {
                k kVar = new k(this);
                this.f5100c = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.f5093b.f6539a;
    }
}
