package s8;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f9469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f9470e;
    public boolean f;
    public final u g;
    public final t h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9466a = 0;
    public final v i = new v(this);
    public final v j = new v(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9471k = 0;

    public w(int i, q qVar, boolean z9, boolean z10, ArrayList arrayList) {
        if (qVar == null) {
            com.google.gson.internal.a.i("connection == null");
            throw null;
        }
        this.f9468c = i;
        this.f9469d = qVar;
        this.f9467b = qVar.f9441x.c();
        u uVar = new u(this, qVar.f9440w.c());
        this.g = uVar;
        t tVar = new t(this);
        this.h = tVar;
        uVar.f9463n = z10;
        tVar.f9457l = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            s8.u r0 = r2.g     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f9463n     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f9462m     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            s8.t r0 = r2.h     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f9457l     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f9456b     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L31
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L27
            r0 = 6
            r2.c(r0)
            return
        L27:
            if (r1 != 0) goto L30
            s8.q r0 = r2.f9469d
            int r1 = r2.f9468c
            r0.f(r1)
        L30:
            return
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.w.a():void");
    }

    public final void b() throws IOException {
        t tVar = this.h;
        if (tVar.f9456b) {
            com.google.gson.internal.a.n("stream closed");
        } else {
            if (tVar.f9457l) {
                com.google.gson.internal.a.n("stream finished");
                return;
            }
            int i = this.f9471k;
            if (i != 0) {
                throw new a0(i);
            }
        }
    }

    public final void c(int i) {
        if (d(i)) {
            this.f9469d.A.i(this.f9468c, i);
        }
    }

    public final boolean d(int i) {
        synchronized (this) {
            try {
                if (this.f9471k != 0) {
                    return false;
                }
                if (this.g.f9463n && this.h.f9457l) {
                    return false;
                }
                this.f9471k = i;
                notifyAll();
                this.f9469d.f(this.f9468c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t e() {
        synchronized (this) {
            try {
                if (!this.f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.h;
    }

    public final boolean f() {
        return this.f9469d.f9428a == ((this.f9468c & 1) == 1);
    }

    public final synchronized boolean g() {
        try {
            if (this.f9471k != 0) {
                return false;
            }
            u uVar = this.g;
            if (uVar.f9463n || uVar.f9462m) {
                t tVar = this.h;
                if (tVar.f9457l || tVar.f9456b) {
                    if (this.f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h() {
        boolean zG;
        synchronized (this) {
            this.g.f9463n = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f9469d.f(this.f9468c);
    }

    public final void i(ArrayList arrayList) {
        boolean zG;
        synchronized (this) {
            zG = true;
            try {
                this.f = true;
                if (this.f9470e == null) {
                    this.f9470e = arrayList;
                    zG = g();
                    notifyAll();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.f9470e);
                    arrayList2.add(null);
                    arrayList2.addAll(arrayList);
                    this.f9470e = arrayList2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zG) {
            return;
        }
        this.f9469d.f(this.f9468c);
    }

    public final synchronized void j(int i) {
        if (this.f9471k == 0) {
            this.f9471k = i;
            notifyAll();
        }
    }
}
