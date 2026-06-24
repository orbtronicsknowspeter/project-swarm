package k0;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f6931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f6933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f6935e;
    public final /* synthetic */ e f;

    public t(e eVar, int i, Bundle bundle) {
        this.f = eVar;
        Boolean bool = Boolean.TRUE;
        this.f6933c = eVar;
        this.f6931a = bool;
        this.f6932b = false;
        this.f6934d = i;
        this.f6935e = bundle;
    }

    public abstract boolean a();

    public abstract void b(h0.b bVar);

    public final void c() {
        d();
        e eVar = this.f6933c;
        synchronized (eVar.f6850u) {
            eVar.f6850u.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f6931a = null;
        }
    }
}
