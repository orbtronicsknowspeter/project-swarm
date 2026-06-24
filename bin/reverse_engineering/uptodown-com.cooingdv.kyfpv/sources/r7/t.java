package r7;

import c4.dd;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dd f9058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9059b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dd f9061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9062n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(dd ddVar, t6.c cVar) {
        super(cVar);
        this.f9061m = ddVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9060l = obj;
        this.f9062n |= Integer.MIN_VALUE;
        return this.f9061m.emit(null, this);
    }
}
