package y2;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArrayMap;
import b2.t1;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.s f11778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g4.v f11779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f11780d;
    public final ScheduledThreadPoolExecutor f;
    public final v h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayMap f11781e = new ArrayMap();
    public boolean g = false;

    public x(FirebaseMessaging firebaseMessaging, s4.s sVar, v vVar, g4.v vVar2, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f11780d = firebaseMessaging;
        this.f11778b = sVar;
        this.h = vVar;
        this.f11779c = vVar2;
        this.f11777a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(j1.p pVar) throws IOException {
        try {
            t1.k(pVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) throws IOException {
        String strA = this.f11780d.a();
        g4.v vVar = this.f11779c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(vVar.d(vVar.k(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f11780d.a();
        g4.v vVar = this.f11779c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(vVar.d(vVar.k(strA, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(u uVar) {
        synchronized (this.f11781e) {
            try {
                String str = uVar.f11767c;
                if (this.f11781e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f11781e.get(str);
                    j1.i iVar = (j1.i) arrayDeque.poll();
                    if (iVar != null) {
                        iVar.a(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f11781e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(boolean z9) {
        this.g = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: IOException -> 0x005d, TryCatch #1 {IOException -> 0x005d, blocks: (B:15:0x0028, B:32:0x0083, B:34:0x0089, B:20:0x0039, B:22:0x0041, B:24:0x004a, B:27:0x005f, B:29:0x0067, B:31:0x0070), top: B:54:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.x.g():boolean");
    }

    public final void h(long j) {
        this.f.schedule(new z(this, this.f11777a, this.f11778b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        f(true);
    }
}
