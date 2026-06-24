package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import q6.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener poolingContainerListener) {
        poolingContainerListener.getClass();
        this.listeners.add(poolingContainerListener);
    }

    public final void onRelease() {
        for (int iC0 = m.c0(this.listeners); -1 < iC0; iC0--) {
            this.listeners.get(iC0).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener poolingContainerListener) {
        poolingContainerListener.getClass();
        this.listeners.remove(poolingContainerListener);
    }
}
