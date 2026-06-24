package b;

import com.inmobi.cmp.ChoiceCmp;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f688b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l8.n f689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(l8.n nVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f687a = i;
        this.f689l = nVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f687a) {
            case 0:
                return new l(this.f689l, cVar, 0);
            default:
                return new l(this.f689l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        t6.c cVar = (t6.c) obj2;
        switch (this.f687a) {
            case 0:
                return new l(this.f689l, cVar, 0).invokeSuspend(x.f8464a);
            default:
                return new l(this.f689l, cVar, 1).invokeSuspend(x.f8464a);
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f687a) {
            case 0:
                int i = this.f688b;
                if (i == 0) {
                    p6.a.e(obj);
                    ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                    this.f688b = 1;
                    Object objAccess$handleMSPA = ChoiceCmp.access$handleMSPA(choiceCmp, this.f689l, this);
                    u6.a aVar = u6.a.f10763a;
                    if (objAccess$handleMSPA == aVar) {
                    }
                } else if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                break;
            default:
                int i6 = this.f688b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    ChoiceCmp choiceCmp2 = ChoiceCmp.INSTANCE;
                    this.f688b = 1;
                    Object objAccess$handleGBC = ChoiceCmp.access$handleGBC(choiceCmp2, this.f689l, this);
                    u6.a aVar2 = u6.a.f10763a;
                    if (objAccess$handleGBC == aVar2) {
                    }
                } else if (i6 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                break;
        }
        return x.f8464a;
    }
}
