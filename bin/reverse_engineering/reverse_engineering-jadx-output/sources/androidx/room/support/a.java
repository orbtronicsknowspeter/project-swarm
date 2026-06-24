package androidx.room.support;

import android.os.SystemClock;
import androidx.room.support.AutoCloser;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AutoCloser.Watch {
    @Override // androidx.room.support.AutoCloser.Watch
    public final long getMillis() {
        return SystemClock.uptimeMillis();
    }
}
