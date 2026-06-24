package o5;

import com.uptodown.workers.TrackingWorker;
import j5.v;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x4.p f8204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f8205b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TrackingWorker f8209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8210p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TrackingWorker trackingWorker, v6.c cVar) {
        super(cVar);
        this.f8209o = trackingWorker;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f8208n = obj;
        this.f8210p |= Integer.MIN_VALUE;
        return this.f8209o.d(this);
    }
}
