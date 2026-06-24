package j9;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6802b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f6805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6806o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, v6.c cVar) {
        super(cVar);
        this.f6805n = sVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6804m = obj;
        this.f6806o |= Integer.MIN_VALUE;
        return this.f6805n.d(0, this);
    }
}
