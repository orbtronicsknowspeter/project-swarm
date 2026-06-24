package y2;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b2.t1;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f11729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseMessagingService f11730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.f f11731c;

    public g(FirebaseMessagingService firebaseMessagingService, g5.f fVar, ExecutorService executorService) {
        this.f11729a = executorService;
        this.f11730b = firebaseMessagingService;
        this.f11731c = fVar;
    }

    public final boolean a() {
        m mVar;
        if (this.f11731c.D("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.f11730b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String strL = this.f11731c.L("gcm.n.image");
        if (TextUtils.isEmpty(strL)) {
            mVar = null;
        } else {
            try {
                mVar = new m(new URL(strL));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strL);
                mVar = null;
            }
        }
        if (mVar != null) {
            ExecutorService executorService = this.f11729a;
            j1.i iVar = new j1.i();
            mVar.f11746b = executorService.submit(new y1.n(4, mVar, iVar));
            mVar.f11747l = iVar.f6540a;
        }
        e eVarA = f.a(this.f11730b, this.f11731c);
        NotificationCompat.Builder builder = eVarA.f11726a;
        if (mVar != null) {
            try {
                j1.p pVar = mVar.f11747l;
                k0.y.g(pVar);
                Bitmap bitmap = (Bitmap) t1.k(pVar, 5L, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                mVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e10) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                mVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f11730b.getSystemService("notification")).notify(eVarA.f11727b, 0, eVarA.f11726a.build());
        return true;
    }
}
