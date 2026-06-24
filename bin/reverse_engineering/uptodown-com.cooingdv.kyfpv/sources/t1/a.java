package t1;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f9502e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f9503a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f9506d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f9504b = str;
        this.f9505c = i;
        this.f9506d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f9502e.newThread(new androidx.browser.trusted.c(22, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f9504b + " Thread #" + this.f9503a.getAndIncrement());
        return threadNewThread;
    }
}
