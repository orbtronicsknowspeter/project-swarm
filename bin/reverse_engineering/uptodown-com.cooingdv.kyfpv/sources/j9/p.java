package j9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f6795b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6796l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, v6.c cVar) {
        super(cVar);
        this.f6795b = sVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6794a = obj;
        this.f6796l |= Integer.MIN_VALUE;
        return this.f6795b.b(0, this);
    }
}
