package j9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f6811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6812b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f6813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6814m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, v6.c cVar) {
        super(cVar);
        this.f6813l = uVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6812b = obj;
        this.f6814m |= Integer.MIN_VALUE;
        return this.f6813l.a(this);
    }
}
