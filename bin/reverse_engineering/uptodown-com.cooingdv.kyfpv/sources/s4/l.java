package s4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9232b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f9233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j5.v f9234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f9235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(s sVar, j5.v vVar, kotlin.jvm.internal.x xVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f9231a = i;
        this.f9233l = sVar;
        this.f9234m = vVar;
        this.f9235n = xVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f9231a) {
            case 0:
                return new l(this.f9233l, this.f9234m, this.f9235n, cVar, 0);
            default:
                return new l(this.f9233l, this.f9234m, this.f9235n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f9231a) {
        }
        return ((l) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f9231a;
        kotlin.jvm.internal.x xVar = this.f9235n;
        j5.v vVar = this.f9234m;
        s sVar = this.f9233l;
        u6.a aVar = u6.a.f10763a;
        p6.x xVar2 = p6.x.f8464a;
        switch (i) {
            case 0:
                int i6 = this.f9232b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    ArrayList arrayList = (ArrayList) xVar.f7025a;
                    this.f9232b = 1;
                    v7.e eVar = o7.m0.f8289a;
                    Object objC = o7.c0.C(new r(sVar, arrayList, vVar, (t6.c) null), v7.d.f10885a, this);
                    if (objC != aVar) {
                        objC = xVar2;
                    }
                    if (objC == aVar) {
                    }
                }
                break;
            default:
                int i10 = this.f9232b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        p6.a.e(obj);
                    }
                    break;
                } else {
                    p6.a.e(obj);
                    ArrayList arrayList2 = (ArrayList) xVar.f7025a;
                    this.f9232b = 1;
                    v7.e eVar2 = o7.m0.f8289a;
                    Object objC2 = o7.c0.C(new r(arrayList2, sVar, vVar, (t6.c) null), v7.d.f10885a, this);
                    if (objC2 != aVar) {
                        objC2 = xVar2;
                    }
                    if (objC2 == aVar) {
                    }
                }
                break;
        }
        return xVar2;
    }
}
