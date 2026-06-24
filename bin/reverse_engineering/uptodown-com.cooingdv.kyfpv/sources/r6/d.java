package r6;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8925b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8928n;

    public d(f fVar, int i) {
        this.f8928n = i;
        fVar.getClass();
        this.f8924a = fVar;
        this.f8926l = -1;
        this.f8927m = fVar.f8940q;
        c();
    }

    public final void a() {
        if (this.f8924a.f8940q == this.f8927m) {
            return;
        }
        a3.b.i();
    }

    public final void c() {
        while (true) {
            int i = this.f8925b;
            f fVar = this.f8924a;
            if (i >= fVar.f8938o || fVar.f8935l[i] >= 0) {
                return;
            } else {
                this.f8925b = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8925b < this.f8924a.f8938o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8928n) {
            case 0:
                a();
                int i = this.f8925b;
                f fVar = this.f8924a;
                if (i >= fVar.f8938o) {
                    com.google.gson.internal.a.l();
                } else {
                    this.f8925b = i + 1;
                    this.f8926l = i;
                    e eVar = new e(fVar, i);
                    c();
                }
                break;
            case 1:
                a();
                int i6 = this.f8925b;
                f fVar2 = this.f8924a;
                if (i6 >= fVar2.f8938o) {
                    com.google.gson.internal.a.l();
                } else {
                    this.f8925b = i6 + 1;
                    this.f8926l = i6;
                    Object obj = fVar2.f8933a[i6];
                    c();
                }
                break;
            default:
                a();
                int i10 = this.f8925b;
                f fVar3 = this.f8924a;
                if (i10 >= fVar3.f8938o) {
                    com.google.gson.internal.a.l();
                } else {
                    this.f8925b = i10 + 1;
                    this.f8926l = i10;
                    Object[] objArr = fVar3.f8934b;
                    objArr.getClass();
                    Object obj2 = objArr[this.f8926l];
                    c();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.f8926l == -1) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Call next() before removing element from the iterator.");
            return;
        }
        f fVar = this.f8924a;
        fVar.d();
        fVar.l(this.f8926l);
        this.f8926l = -1;
        this.f8927m = fVar.f8940q;
    }
}
