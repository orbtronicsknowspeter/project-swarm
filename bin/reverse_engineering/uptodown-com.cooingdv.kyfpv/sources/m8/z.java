package m8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f7837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.e f7838b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f7839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a0 f7840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7841n;

    public z(x xVar, a0 a0Var) {
        this.f7837a = xVar;
        this.f7840m = a0Var;
        this.f7838b = new q8.e(xVar);
    }

    public final c0 a() {
        ArrayList arrayList = new ArrayList();
        x xVar = this.f7837a;
        arrayList.addAll(xVar.f7817m);
        arrayList.add(this.f7838b);
        arrayList.add(new o8.b(xVar.f7821q, 2));
        g gVar = xVar.f7822r;
        arrayList.add(new o8.b(gVar != null ? gVar.f7722a : null, 0));
        int i = 1;
        arrayList.add(new o8.b(xVar, i));
        arrayList.addAll(xVar.f7818n);
        arrayList.add(new j5.h(i));
        b bVar = this.f7839l;
        int i6 = xVar.E;
        int i10 = xVar.F;
        int i11 = xVar.G;
        a0 a0Var = this.f7840m;
        return new q8.d(arrayList, null, null, null, 0, a0Var, this, bVar, i6, i10, i11).a(a0Var);
    }

    public final Object clone() {
        x xVar = this.f7837a;
        z zVar = new z(xVar, this.f7840m);
        xVar.f7819o.getClass();
        zVar.f7839l = b.f7682d;
        return zVar;
    }
}
