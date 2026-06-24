package c3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a1 f1208b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1 f1210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1211n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, t6.c cVar) {
        super(cVar);
        this.f1210m = d1Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f1209l = obj;
        this.f1211n |= Integer.MIN_VALUE;
        return d1.a(this.f1210m, null, null, this);
    }
}
