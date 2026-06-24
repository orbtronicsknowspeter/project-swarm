package y2;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends Binder {
    public final g5.g i;

    public b0(g5.g gVar) {
        this.i = gVar;
    }

    public final void a(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c0Var.f11716a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.i.f5316b;
        j1.i iVar = new j1.i();
        firebaseMessagingService.f3091a.execute(new androidx.work.impl.c(firebaseMessagingService, intent, iVar, 4));
        iVar.f6540a.a(new androidx.arch.core.executor.a(2), new v4.a(c0Var, 7));
    }
}
