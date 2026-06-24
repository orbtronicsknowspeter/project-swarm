package e1;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f4 extends h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a4.c0 f3973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a3.d f3975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e4 f3976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.support.v4.media.g f3977p;

    public f4(t1 t1Var) {
        super(t1Var);
        this.f3974m = true;
        this.f3975n = new a3.d(this, 25);
        this.f3976o = new e4(this);
        this.f3977p = new android.support.v4.media.g(this);
    }

    @Override // e1.h0
    public final boolean j() {
        return false;
    }

    public final void k() {
        g();
        if (this.f3973l == null) {
            this.f3973l = new a4.c0(Looper.getMainLooper(), 3);
        }
    }
}
