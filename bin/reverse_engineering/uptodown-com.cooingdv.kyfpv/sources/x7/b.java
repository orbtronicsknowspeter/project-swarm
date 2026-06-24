package x7;

import d7.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f11518b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f11519l;

    public /* synthetic */ b(g gVar, Object obj, int i) {
        this.f11517a = i;
        this.f11518b = gVar;
        this.f11519l = obj;
    }

    @Override // d7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f11517a) {
            case 0:
                this.f11518b.unlock(this.f11519l);
                break;
            default:
                c cVar = (c) this.f11519l;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f11528q;
                Object obj4 = cVar.f11521b;
                g gVar = this.f11518b;
                atomicReferenceFieldUpdater.set(gVar, obj4);
                gVar.unlock(obj4);
                break;
        }
        return x.f8464a;
    }
}
