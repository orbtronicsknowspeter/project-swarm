package z1;

import b2.t1;
import j1.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import y1.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f11904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11905b = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f11906l = t1.x(null);

    public b(ExecutorService executorService) {
        this.f11904a = executorService;
    }

    public final p a(Runnable runnable) {
        p pVarE;
        synchronized (this.f11905b) {
            pVarE = this.f11906l.e(this.f11904a, new v4.a(runnable, 10));
            this.f11906l = pVarE;
        }
        return pVarE;
    }

    public final p b(j jVar) {
        p pVarE;
        synchronized (this.f11905b) {
            pVarE = this.f11906l.e(this.f11904a, new v4.a(jVar, 9));
            this.f11906l = pVarE;
        }
        return pVarE;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11904a.execute(runnable);
    }
}
