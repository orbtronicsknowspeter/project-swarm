package j0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.i f6538b;

    public w(j1.i iVar) {
        super(4);
        this.f6538b = iVar;
    }

    @Override // j0.x
    public final void a(Status status) {
        this.f6538b.b(new g0.m(status));
    }

    @Override // j0.x
    public final void b(Exception exc) {
        this.f6538b.b(exc);
    }

    @Override // j0.x
    public final void c(m mVar) throws DeadObjectException {
        try {
            h(mVar);
        } catch (DeadObjectException e10) {
            a(x.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(x.e(e11));
        } catch (RuntimeException e12) {
            this.f6538b.b(e12);
        }
    }

    @Override // j0.q
    public final boolean f(m mVar) {
        if (mVar.f6511n.get(null) == null) {
            return false;
        }
        com.google.gson.internal.a.o();
        return false;
    }

    @Override // j0.q
    public final h0.d[] g(m mVar) {
        if (mVar.f6511n.get(null) == null) {
            return null;
        }
        com.google.gson.internal.a.o();
        return null;
    }

    public final void h(m mVar) {
        if (mVar.f6511n.remove(null) == null) {
            this.f6538b.c(Boolean.FALSE);
        } else {
            com.google.gson.internal.a.o();
        }
    }

    @Override // j0.x
    public final /* bridge */ /* synthetic */ void d(android.support.v4.media.g gVar, boolean z9) {
    }
}
