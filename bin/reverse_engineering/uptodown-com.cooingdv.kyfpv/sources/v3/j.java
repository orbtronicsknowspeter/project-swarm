package v3;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f10849a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10850b = new ConcurrentHashMap();

    public j() {
        new AtomicLong(0L);
    }

    @JavascriptInterface
    public final void sendBooleanValue(final long j, final boolean z9) {
        this.f10849a.post(new Runnable(j, z9) { // from class: v3.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f10848b;

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f10847a.f10850b.remove(Long.valueOf(this.f10848b)) == null) {
                    return;
                }
                com.google.gson.internal.a.o();
            }
        });
    }
}
