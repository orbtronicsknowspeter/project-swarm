package y2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f11782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f11783b;

    public y(z zVar, z zVar2) {
        this.f11783b = zVar;
        this.f11782a = zVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f11783b.f11787a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            z zVar = this.f11782a;
            if (zVar == null) {
                return;
            }
            if (zVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                z zVar2 = this.f11782a;
                zVar2.f11790m.f.schedule(zVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f11782a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
