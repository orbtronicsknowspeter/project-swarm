package m8;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f7693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f7694b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f7697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f7698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f7699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f7700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f7701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f7702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f7704u;
    public volatile i v;

    public c0(b0 b0Var) {
        this.f7693a = b0Var.f7684a;
        this.f7694b = b0Var.f7685b;
        this.f7695l = b0Var.f7686c;
        this.f7696m = b0Var.f7687d;
        this.f7697n = b0Var.f7688e;
        g5.f fVar = b0Var.f;
        fVar.getClass();
        this.f7698o = new s(fVar);
        this.f7699p = b0Var.g;
        this.f7700q = b0Var.h;
        this.f7701r = b0Var.i;
        this.f7702s = b0Var.j;
        this.f7703t = b0Var.f7689k;
        this.f7704u = b0Var.f7690l;
    }

    public final i b() {
        i iVar = this.v;
        if (iVar != null) {
            return iVar;
        }
        i iVarA = i.a(this.f7698o);
        this.v = iVarA;
        return iVarA;
    }

    public final String c(String str) {
        String strA = this.f7698o.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.f7699p;
        if (e0Var != null) {
            e0Var.close();
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("response is not eligible for a body and must not be closed");
        }
    }

    public final b0 d() {
        b0 b0Var = new b0();
        b0Var.f7684a = this.f7693a;
        b0Var.f7685b = this.f7694b;
        b0Var.f7686c = this.f7695l;
        b0Var.f7687d = this.f7696m;
        b0Var.f7688e = this.f7697n;
        b0Var.f = this.f7698o.c();
        b0Var.g = this.f7699p;
        b0Var.h = this.f7700q;
        b0Var.i = this.f7701r;
        b0Var.j = this.f7702s;
        b0Var.f7689k = this.f7703t;
        b0Var.f7690l = this.f7704u;
        return b0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f7694b + ", code=" + this.f7695l + ", message=" + this.f7696m + ", url=" + this.f7693a.f7674a + '}';
    }
}
