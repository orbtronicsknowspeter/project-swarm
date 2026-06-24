package y2;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f11768d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a4.d0 f11770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f11771c;

    public v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f11771c = scheduledThreadPoolExecutor;
        this.f11769a = sharedPreferences;
    }

    public final synchronized u a() {
        u uVar;
        String strM = this.f11770b.m();
        Pattern pattern = u.f11764d;
        uVar = null;
        if (!TextUtils.isEmpty(strM)) {
            String[] strArrSplit = strM.split("!", -1);
            if (strArrSplit.length == 2) {
                uVar = new u(strArrSplit[0], strArrSplit[1]);
            }
        }
        return uVar;
    }

    public final synchronized void b() {
        this.f11770b = a4.d0.i(this.f11769a, this.f11771c);
    }

    public final synchronized void c(u uVar) {
        this.f11770b.n(uVar.f11767c);
    }
}
