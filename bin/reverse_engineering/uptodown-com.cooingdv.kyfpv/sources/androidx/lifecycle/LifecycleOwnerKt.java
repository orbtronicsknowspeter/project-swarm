package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
