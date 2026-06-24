package q0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f8631b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f8630a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f8631b.newThread(new b(runnable, 0));
        threadNewThread.setName(this.f8630a);
        return threadNewThread;
    }
}
