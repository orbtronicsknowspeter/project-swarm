package o5;

import com.uptodown.workers.AppUpdatedWorker;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppUpdatedWorker f8174b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8175l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppUpdatedWorker appUpdatedWorker, t6.c cVar) {
        super(cVar);
        this.f8174b = appUpdatedWorker;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8173a = obj;
        this.f8175l |= Integer.MIN_VALUE;
        return this.f8174b.doWork(this);
    }
}
