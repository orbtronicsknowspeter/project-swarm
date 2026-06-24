package s8;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends n8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9424b = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f9426m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, s sVar) {
        super("OkHttp %s", qVar.f9431m);
        this.f9425l = qVar;
        this.f9426m = sVar;
    }

    @Override // n8.a
    public final void a() {
        int i = this.f9424b;
        Object obj = this.f9426m;
        Object obj2 = this.f9425l;
        switch (i) {
            case 0:
                w wVar = (w) obj;
                q qVar = (q) ((o) obj2).f9425l;
                try {
                    qVar.f9429b.b(wVar);
                    return;
                } catch (IOException e10) {
                    u8.h.f10784a.k(4, "Http2Connection.Listener failure for " + qVar.f9431m, e10);
                    try {
                        wVar.c(2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                q qVar2 = (q) ((o) obj2).f9425l;
                try {
                    qVar2.A.b((f8.q) obj);
                    return;
                } catch (IOException unused2) {
                    ThreadPoolExecutor threadPoolExecutor = q.D;
                    qVar2.c();
                    return;
                }
            default:
                q qVar3 = (q) obj2;
                s sVar = (s) obj;
                try {
                    try {
                        sVar.d(this);
                        do {
                            break;
                        } while (sVar.c(false, this));
                        qVar3.b(1, 6);
                    } catch (IOException unused3) {
                    }
                } catch (IOException unused4) {
                    qVar3.b(2, 2);
                } catch (Throwable th) {
                    try {
                        qVar3.b(3, 3);
                        break;
                    } catch (IOException unused5) {
                    }
                    n8.c.c(sVar);
                    throw th;
                }
                n8.c.c(sVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o oVar, Object[] objArr, w wVar) {
        super("OkHttp %s stream %d", objArr);
        this.f9425l = oVar;
        this.f9426m = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o oVar, Object[] objArr, f8.q qVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f9425l = oVar;
        this.f9426m = qVar;
    }
}
