package o7;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8265b;

    public /* synthetic */ h(Object obj, int i) {
        this.f8264a = i;
        this.f8265b = obj;
    }

    @Override // o7.i
    public final void a(Throwable th) {
        switch (this.f8264a) {
            case 0:
                ((ScheduledFuture) this.f8265b).cancel(false);
                break;
            case 1:
                ((d7.l) this.f8265b).invoke(th);
                break;
            default:
                ((o0) this.f8265b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f8264a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f8265b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((d7.l) this.f8265b).getClass().getSimpleName() + '@' + c0.o(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f8265b) + ']';
        }
    }
}
