package m8;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f7692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f7693b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f7696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f7697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f7698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f7699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f7700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f7701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f7702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f7703u;
    public volatile i v;

    public c0(b0 b0Var) {
        this.f7692a = b0Var.f7683a;
        this.f7693b = b0Var.f7684b;
        this.f7694l = b0Var.f7685c;
        this.f7695m = b0Var.f7686d;
        this.f7696n = b0Var.f7687e;
        g5.f fVar = b0Var.f;
        fVar.getClass();
        this.f7697o = new s(fVar);
        this.f7698p = b0Var.g;
        this.f7699q = b0Var.h;
        this.f7700r = b0Var.i;
        this.f7701s = b0Var.j;
        this.f7702t = b0Var.f7688k;
        this.f7703u = b0Var.f7689l;
    }

    public final i b() {
        i iVar = this.v;
        if (iVar != null) {
            return iVar;
        }
        i iVarA = i.a(this.f7697o);
        this.v = iVarA;
        return iVarA;
    }

    public final String c(String str) {
        String strA = this.f7697o.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.f7698p;
        if (e0Var != null) {
            e0Var.close();
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("response is not eligible for a body and must not be closed");
        }
    }

    public final b0 d() {
        b0 b0Var = new b0();
        b0Var.f7683a = this.f7692a;
        b0Var.f7684b = this.f7693b;
        b0Var.f7685c = this.f7694l;
        b0Var.f7686d = this.f7695m;
        b0Var.f7687e = this.f7696n;
        b0Var.f = this.f7697o.c();
        b0Var.g = this.f7698p;
        b0Var.h = this.f7699q;
        b0Var.i = this.f7700r;
        b0Var.j = this.f7701s;
        b0Var.f7688k = this.f7702t;
        b0Var.f7689l = this.f7703u;
        return b0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f7693b + ", code=" + this.f7694l + ", message=" + this.f7695m + ", url=" + this.f7692a.f7673a + '}';
    }
}
