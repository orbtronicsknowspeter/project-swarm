package g0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f5070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5071d;
    public Messenger f;
    public g g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f5068a = new SimpleArrayMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f5072e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f5069b = context;
        this.f5070c = new o(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5071d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i6;
        i6 = h;
        h = i6 + 1;
        return Integer.toString(i6);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, y0.a.f11598a);
            }
            intent.putExtra("app", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j1.p a(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.b.a(android.os.Bundle):j1.p");
    }

    public final void d(Bundle bundle, String str) {
        synchronized (this.f5068a) {
            try {
                j1.i iVar = (j1.i) this.f5068a.remove(str);
                if (iVar != null) {
                    iVar.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
