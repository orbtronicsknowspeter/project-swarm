package s1;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements p2.c, p2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f9139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.j f9140c;

    public k() {
        t1.j jVar = t1.j.f9534a;
        this.f9138a = new HashMap();
        this.f9139b = new ArrayDeque();
        this.f9140c = jVar;
    }

    public final synchronized void a(Executor executor, p2.a aVar) {
        try {
            executor.getClass();
            if (!this.f9138a.containsKey(d0.b.class)) {
                this.f9138a.put(d0.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f9138a.get(d0.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
