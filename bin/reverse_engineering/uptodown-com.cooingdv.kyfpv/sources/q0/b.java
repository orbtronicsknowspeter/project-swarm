package q0;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f8633b;

    public /* synthetic */ b(Runnable runnable, int i) {
        this.f8632a = i;
        this.f8633b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8632a) {
            case 0:
                Process.setThreadPriority(0);
                this.f8633b.run();
                break;
            case 1:
                try {
                    this.f8633b.run();
                } catch (Exception e10) {
                    a.a.v("Executor", "Background execution failure.", e10);
                    return;
                }
                break;
            default:
                this.f8633b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f8632a) {
            case 2:
                return this.f8633b.toString();
            default:
                return super.toString();
        }
    }
}
