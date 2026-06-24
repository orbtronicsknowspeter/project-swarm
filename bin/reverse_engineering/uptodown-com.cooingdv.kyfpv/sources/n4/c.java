package n4;

import e1.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7942b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c0 f7943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c0 c0Var, v6.c cVar) {
        super(cVar);
        this.f7943l = c0Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f7942b = obj;
        this.f7944m |= Integer.MIN_VALUE;
        return this.f7943l.i(null, null, null, null, this);
    }
}
