package o5;

import com.uptodown.workers.GetUpdatesWorker;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetUpdatesWorker f8182b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8183l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GetUpdatesWorker getUpdatesWorker, t6.c cVar) {
        super(cVar);
        this.f8182b = getUpdatesWorker;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8181a = obj;
        this.f8183l |= Integer.MIN_VALUE;
        return this.f8182b.doWork(this);
    }
}
