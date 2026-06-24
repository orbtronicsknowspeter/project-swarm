package o8;

import java.io.Closeable;
import w8.g0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8353b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0[] f8354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f8355m;

    public e(f fVar, String str, long j, g0[] g0VarArr) {
        this.f8355m = fVar;
        this.f8352a = str;
        this.f8353b = j;
        this.f8354l = g0VarArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (g0 g0Var : this.f8354l) {
            n8.c.c(g0Var);
        }
    }
}
