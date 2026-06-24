package p7;

import a4.x;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import o7.e1;
import o7.h0;
import o7.l;
import o7.m0;
import o7.o0;
import o7.q1;
import o7.w;
import o7.x1;
import t6.h;
import t7.n;
import t7.o;
import v7.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends w implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8468b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f8469l;

    public c(Handler handler, boolean z9) {
        this.f8467a = handler;
        this.f8468b = z9;
        this.f8469l = z9 ? this : new c(handler, true);
    }

    @Override // o7.w
    public final void dispatch(h hVar, Runnable runnable) {
        if (this.f8467a.post(runnable)) {
            return;
        }
        y(hVar, runnable);
    }

    @Override // o7.h0
    public final o0 e(long j, x1 x1Var, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f8467a.postDelayed(x1Var, j)) {
            return new androidx.datastore.core.a(1, this, x1Var);
        }
        y(hVar, x1Var);
        return q1.f8301a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f8467a == this.f8467a && cVar.f8468b == this.f8468b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8467a) ^ (this.f8468b ? 1231 : 1237);
    }

    @Override // o7.h0
    public final void i(long j, l lVar) {
        m4.a aVar = new m4.a(lVar, this, 3, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f8467a.postDelayed(aVar, j)) {
            lVar.u(new androidx.work.impl.model.a(9, this, aVar));
        } else {
            y(lVar.f8282n, aVar);
        }
    }

    @Override // o7.w
    public final boolean isDispatchNeeded(h hVar) {
        return (this.f8468b && kotlin.jvm.internal.l.a(Looper.myLooper(), this.f8467a.getLooper())) ? false : true;
    }

    @Override // o7.w
    public final w limitedParallelism(int i, String str) {
        t7.a.a(i);
        return str != null ? new o(this, str) : this;
    }

    @Override // o7.w
    public final String toString() {
        c cVar;
        String str;
        e eVar = m0.f8289a;
        c cVar2 = n.f10349a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f8469l;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f8467a.toString();
        return this.f8468b ? x.C(string, ".immediate") : string;
    }

    public final void y(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        e1 e1Var = (e1) hVar.get(o7.x.f8328b);
        if (e1Var != null) {
            e1Var.c(cancellationException);
        }
        e eVar = m0.f8289a;
        v7.d.f10885a.dispatch(hVar, runnable);
    }
}
