package i0;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f5619a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = f5619a;
        synchronized (set) {
        }
        return set;
    }
}
