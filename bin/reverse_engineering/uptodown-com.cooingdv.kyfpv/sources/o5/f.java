package o5;

import com.uptodown.workers.GetRemoteInstallWorker;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetRemoteInstallWorker f8179b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8180l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GetRemoteInstallWorker getRemoteInstallWorker, t6.c cVar) {
        super(cVar);
        this.f8179b = getRemoteInstallWorker;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8178a = obj;
        this.f8180l |= Integer.MIN_VALUE;
        return this.f8179b.doWork(this);
    }
}
