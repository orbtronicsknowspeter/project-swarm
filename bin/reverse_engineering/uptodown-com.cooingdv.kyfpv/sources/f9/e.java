package f9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5016b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5017l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, v6.c cVar) {
        super(cVar);
        this.f5016b = hVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f5015a = obj;
        this.f5017l |= Integer.MIN_VALUE;
        return this.f5016b.b(0, null, null, this);
    }
}
