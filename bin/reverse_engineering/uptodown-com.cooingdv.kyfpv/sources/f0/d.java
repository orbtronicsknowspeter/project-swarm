package f0;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends AsyncTaskLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Semaphore f4805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f4806b;

    public d(Context context, Set set) {
        super(context);
        this.f4805a = new Semaphore(0);
        this.f4806b = set;
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object loadInBackground() {
        Iterator it = this.f4806b.iterator();
        if (it.hasNext()) {
            ((i0.g) it.next()).getClass();
            com.google.gson.internal.a.q();
            return null;
        }
        try {
            this.f4805a.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        this.f4805a.drainPermits();
        forceLoad();
    }
}
