package s1;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements s2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f9143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f9144b;

    public final synchronized void a() {
        try {
            Iterator it = this.f9143a.iterator();
            while (it.hasNext()) {
                this.f9144b.add(((s2.b) it.next()).get());
            }
            this.f9143a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.b
    public final Object get() {
        if (this.f9144b == null) {
            synchronized (this) {
                try {
                    if (this.f9144b == null) {
                        this.f9144b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f9144b);
    }
}
