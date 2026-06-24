package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d2 f11060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.v f11061b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.v f11062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q1.a f11064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11065o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(q1.a aVar, v6.c cVar) {
        super(cVar);
        this.f11064n = aVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f11063m = obj;
        this.f11065o |= Integer.MIN_VALUE;
        return this.f11064n.m(null, null, this);
    }
}
