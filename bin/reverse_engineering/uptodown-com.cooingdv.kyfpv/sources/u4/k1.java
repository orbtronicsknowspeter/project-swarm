package u4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f10518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10519b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m1 f10520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, v6.c cVar) {
        super(cVar);
        this.f10520l = m1Var;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f10519b = obj;
        this.f10521m |= Integer.MIN_VALUE;
        return m1.a(this.f10520l, this);
    }
}
