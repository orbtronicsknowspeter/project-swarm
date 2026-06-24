package s4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f9246b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f9247l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.jvm.internal.x xVar, s sVar, t6.c cVar) {
        super(2, cVar);
        this.f9245a = 1;
        this.f9246b = xVar;
        this.f9247l = sVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9245a) {
            case 0:
                return new n(this.f9247l, this.f9246b, cVar, 0);
            case 1:
                return new n(this.f9246b, this.f9247l, cVar);
            default:
                return new n(this.f9247l, this.f9246b, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9245a) {
            case 0:
                n nVar = (n) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                nVar.invokeSuspend(xVar);
                return xVar;
            case 1:
                n nVar2 = (n) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                nVar2.invokeSuspend(xVar2);
                return xVar2;
            default:
                n nVar3 = (n) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                nVar3.invokeSuspend(xVar3);
                return xVar3;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9245a) {
            case 0:
                p6.a.e(obj);
                ((w4.i) this.f9247l.f9288d).d((ArrayList) this.f9246b.f7025a);
                break;
            case 1:
                p6.a.e(obj);
                Object obj2 = this.f9246b.f7025a;
                if (obj2 != null) {
                    ((w4.i) this.f9247l.f9288d).l((x4.g) obj2);
                }
                break;
            default:
                p6.a.e(obj);
                ((w4.i) this.f9247l.f9288d).a((x4.g) this.f9246b.f7025a);
                break;
        }
        return p6.x.f8464a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(s sVar, kotlin.jvm.internal.x xVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f9245a = i;
        this.f9247l = sVar;
        this.f9246b = xVar;
    }
}
