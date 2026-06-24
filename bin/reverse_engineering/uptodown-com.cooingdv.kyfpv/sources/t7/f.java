package t7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o7.c0;
import o7.k0;
import o7.r0;
import o7.v1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends k0 implements v6.d, t6.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10326q = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o7.w f10327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t6.c f10328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f10329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f10330p;

    public f(o7.w wVar, t6.c cVar) {
        super(-1);
        this.f10327m = wVar;
        this.f10328n = cVar;
        this.f10329o = a.f10317b;
        this.f10330p = a.k(cVar.getContext());
    }

    @Override // v6.d
    public final v6.d getCallerFrame() {
        t6.c cVar = this.f10328n;
        if (cVar instanceof v6.d) {
            return (v6.d) cVar;
        }
        return null;
    }

    @Override // t6.c
    public final t6.h getContext() {
        return this.f10328n.getContext();
    }

    @Override // o7.k0
    public final Object h() {
        Object obj = this.f10329o;
        this.f10329o = a.f10317b;
        return obj;
    }

    @Override // t6.c
    public final void resumeWith(Object obj) {
        Throwable thA = p6.k.a(obj);
        Object uVar = thA == null ? obj : new o7.u(false, thA);
        t6.c cVar = this.f10328n;
        t6.h context = cVar.getContext();
        o7.w wVar = this.f10327m;
        if (wVar.isDispatchNeeded(context)) {
            this.f10329o = uVar;
            this.f8273l = 0;
            wVar.dispatch(cVar.getContext(), this);
            return;
        }
        r0 r0VarA = v1.a();
        if (r0VarA.f8303a >= 4294967296L) {
            this.f10329o = uVar;
            this.f8273l = 0;
            r0VarA.z(this);
            return;
        }
        r0VarA.A(true);
        try {
            t6.h context2 = cVar.getContext();
            Object objL = a.l(context2, this.f10330p);
            try {
                cVar.resumeWith(obj);
                while (r0VarA.C()) {
                }
            } finally {
                a.g(context2, objL);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f10327m + ", " + c0.z(this.f10328n) + ']';
    }

    @Override // o7.k0
    public final t6.c c() {
        return this;
    }
}
