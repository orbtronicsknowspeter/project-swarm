package e1;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3849b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.g f3850l;

    public c4(android.support.v4.media.g gVar, long j, long j6) {
        Objects.requireNonNull(gVar);
        this.f3850l = gVar;
        this.f3848a = j;
        this.f3849b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1 q1Var = ((f4) this.f3850l.f248l).f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new a4.f(this, 7));
    }
}
