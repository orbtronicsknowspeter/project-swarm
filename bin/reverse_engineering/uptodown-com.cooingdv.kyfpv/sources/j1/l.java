package j1;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements n, f, e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6552b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f6553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f6554m;

    public /* synthetic */ l(Executor executor, a aVar, p pVar, int i) {
        this.f6551a = i;
        this.f6552b = executor;
        this.f6553l = aVar;
        this.f6554m = pVar;
    }

    @Override // j1.n
    public final void a(p pVar) {
        switch (this.f6551a) {
            case 0:
                this.f6552b.execute(new m1.a(this, pVar, 22, false));
                break;
            default:
                this.f6552b.execute(new m1.a(this, pVar, 23, false));
                break;
        }
    }

    @Override // j1.f
    public void c(Object obj) {
        this.f6554m.k(obj);
    }

    @Override // j1.c
    public void f() {
        this.f6554m.n();
    }

    @Override // j1.e
    public void i(Exception exc) {
        this.f6554m.m(exc);
    }
}
