package j1;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements f, e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6543a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6544b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f6545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Exception f6549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6550q;

    public k(int i, p pVar) {
        this.f6544b = i;
        this.f6545l = pVar;
    }

    public final void a() {
        int i = this.f6546m;
        int i6 = this.f6547n;
        int i10 = i + i6 + this.f6548o;
        int i11 = this.f6544b;
        if (i10 == i11) {
            Exception exc = this.f6549p;
            p pVar = this.f6545l;
            if (exc == null) {
                if (this.f6550q) {
                    pVar.n();
                    return;
                } else {
                    pVar.k(null);
                    return;
                }
            }
            int length = String.valueOf(i6).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + length + 8 + 24);
            sb.append(i6);
            sb.append(" out of ");
            sb.append(i11);
            sb.append(" underlying tasks failed");
            pVar.m(new ExecutionException(sb.toString(), this.f6549p));
        }
    }

    @Override // j1.f
    public final void c(Object obj) {
        synchronized (this.f6543a) {
            this.f6546m++;
            a();
        }
    }

    @Override // j1.c
    public final void f() {
        synchronized (this.f6543a) {
            this.f6548o++;
            this.f6550q = true;
            a();
        }
    }

    @Override // j1.e
    public final void i(Exception exc) {
        synchronized (this.f6543a) {
            this.f6547n++;
            this.f6549p = exc;
            a();
        }
    }
}
