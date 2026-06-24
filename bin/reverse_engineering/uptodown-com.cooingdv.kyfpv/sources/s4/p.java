package s4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9259b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9260l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, ArrayList arrayList, t6.c cVar, int i) {
        super(2, cVar);
        this.f9258a = i;
        this.f9259b = sVar;
        this.f9260l = arrayList;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9258a) {
            case 0:
                return new p(this.f9259b, this.f9260l, cVar, 0);
            default:
                return new p(this.f9259b, this.f9260l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9258a) {
            case 0:
                p pVar = (p) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                pVar.invokeSuspend(xVar);
                return xVar;
            default:
                p pVar2 = (p) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                pVar2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9258a) {
            case 0:
                p6.a.e(obj);
                ((w4.i) this.f9259b.f9288d).e(this.f9260l);
                break;
            default:
                p6.a.e(obj);
                ((w4.i) this.f9259b.f9288d).j(this.f9260l);
                break;
        }
        return p6.x.f8464a;
    }
}
