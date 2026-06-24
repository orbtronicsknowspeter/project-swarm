package androidx.work;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public interface ProgressUpdater {
    m1.b updateProgress(Context context, UUID uuid, Data data);
}
