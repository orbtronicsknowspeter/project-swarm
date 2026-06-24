package y1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import e1.x2;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11653b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f11654l;

    public /* synthetic */ n(q qVar, Exception exc) {
        this.f11652a = 1;
        Map map = Collections.EMPTY_MAP;
        this.f11653b = qVar;
        this.f11654l = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11652a) {
            case 0:
                q qVar = (q) this.f11653b;
                String str = (String) this.f11654l;
                l lVar = qVar.g;
                lVar.getClass();
                try {
                    ((a2.t) lVar.f11640d.f4470n).l("operation", str);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = lVar.f11637a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                q qVar2 = (q) this.f11653b;
                Exception exc = (Exception) this.f11654l;
                Map map = Collections.EMPTY_MAP;
                l lVar2 = qVar2.g;
                Thread threadCurrentThread = Thread.currentThread();
                lVar2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                s sVar = lVar2.f11645n;
                if (sVar == null || !sVar.f11679e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = lVar2.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    a2.c cVar = new a2.c(strE, j, map);
                    e2.d dVar = lVar2.f11644m;
                    dVar.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    dVar.k(exc, threadCurrentThread, "error", cVar, false);
                    return;
                }
                return;
            case 2:
                ((x2) this.f11653b).a((Intent) this.f11654l);
                return;
            case 3:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f11653b;
                j1.i iVar = (j1.i) this.f11654l;
                try {
                    iVar.a(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    iVar.f6540a.m(e11);
                    return;
                }
            default:
                y2.m mVar = (y2.m) this.f11653b;
                j1.i iVar2 = (j1.i) this.f11654l;
                try {
                    iVar2.a(mVar.b());
                    return;
                } catch (Exception e12) {
                    iVar2.f6540a.m(e12);
                    return;
                }
        }
    }

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f11652a = i;
        this.f11653b = obj;
        this.f11654l = obj2;
    }
}
