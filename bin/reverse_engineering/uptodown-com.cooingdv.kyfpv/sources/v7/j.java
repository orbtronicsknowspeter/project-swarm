package v7;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.TimeUnit;
import t7.u;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10897e;
    public static final g f;

    static {
        String property;
        int i = u.f10358a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f10893a = property;
        f10894b = t7.a.i(100000L, 1L, LocationRequestCompat.PASSIVE_INTERVAL, "kotlinx.coroutines.scheduler.resolution.ns");
        int i6 = u.f10358a;
        if (i6 < 2) {
            i6 = 2;
        }
        f10895c = t7.a.j(i6, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f10896d = t7.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f10897e = TimeUnit.SECONDS.toNanos(t7.a.i(60L, 1L, LocationRequestCompat.PASSIVE_INTERVAL, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = g.f10889a;
    }
}
