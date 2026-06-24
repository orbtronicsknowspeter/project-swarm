package f8;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p6.b f4972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f4973b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedHashMap f4974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f4977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4978p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, v6.a aVar) {
        super(aVar);
        this.f4977o = qVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f4976n = obj;
        this.f4978p |= Integer.MIN_VALUE;
        return q.a(this.f4977o, null, this);
    }
}
