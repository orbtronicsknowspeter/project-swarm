package s4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.x f9268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9269b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b5.m f9270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9271m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b5.m mVar, v6.c cVar) {
        super(cVar);
        this.f9270l = mVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f9269b = obj;
        this.f9271m |= Integer.MIN_VALUE;
        return this.f9270l.F(this);
    }
}
