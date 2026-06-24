package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class e8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f6187b;

    public e8(Runnable runnable, Runnable runnable2) {
        this.f6186a = runnable;
        this.f6187b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6186a.run();
            this.f6187b.run();
        } catch (Throwable th) {
            try {
                this.f6187b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
