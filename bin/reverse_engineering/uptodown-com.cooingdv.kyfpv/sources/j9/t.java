package j9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6813b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f6814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6815m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, v6.c cVar) {
        super(cVar);
        this.f6814l = uVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6813b = obj;
        this.f6815m |= Integer.MIN_VALUE;
        return this.f6814l.a(this);
    }
}
