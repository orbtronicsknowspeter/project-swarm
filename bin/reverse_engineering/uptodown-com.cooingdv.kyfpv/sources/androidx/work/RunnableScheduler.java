package androidx.work;

import androidx.annotation.IntRange;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) long j, Runnable runnable);
}
