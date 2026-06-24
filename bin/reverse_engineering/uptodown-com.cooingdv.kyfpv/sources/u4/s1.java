package u4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10602b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z1 f10603l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(z1 z1Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f10601a = i;
        this.f10603l = z1Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10601a) {
            case 0:
                return new s1(this.f10603l, cVar, 0);
            case 1:
                return new s1(this.f10603l, cVar, 1);
            case 2:
                return new s1(this.f10603l, cVar, 2);
            case 3:
                return new s1(this.f10603l, cVar, 3);
            case 4:
                return new s1(this.f10603l, cVar, 4);
            default:
                return new s1(this.f10603l, cVar, 5);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10601a) {
            case 0:
                ((s1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            case 1:
                ((s1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            case 2:
                ((s1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            case 3:
                ((s1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            case 4:
                ((s1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            default:
                ((s1) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
        }
        return u6.a.f10763a;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10601a) {
            case 0:
                int i = this.f10602b;
                if (i == 0) {
                    p6.a.e(obj);
                    z1 z1Var = this.f10603l;
                    r7.e0 e0Var = ((a1) z1Var.f10683l.getValue()).f10419a;
                    r1 r1Var = new r1(z1Var, 0);
                    this.f10602b = 1;
                    Object objCollect = e0Var.f8973a.collect(r1Var, this);
                    u6.a aVar = u6.a.f10763a;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p6.a.e(obj);
                }
                throw new a1.b();
            case 1:
                int i6 = this.f10602b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                z1 z1Var2 = this.f10603l;
                r7.d0 d0Var = ((a1) z1Var2.f10683l.getValue()).f10420b;
                r1 r1Var2 = new r1(z1Var2, 1);
                this.f10602b = 1;
                d0Var.f8969a.collect(r1Var2, this);
                return u6.a.f10763a;
            case 2:
                int i10 = this.f10602b;
                if (i10 == 0) {
                    p6.a.e(obj);
                    z1 z1Var3 = this.f10603l;
                    r7.e0 e0Var2 = ((a1) z1Var3.f10683l.getValue()).f10421c;
                    r1 r1Var3 = new r1(z1Var3, 2);
                    this.f10602b = 1;
                    Object objCollect2 = e0Var2.f8973a.collect(r1Var3, this);
                    u6.a aVar2 = u6.a.f10763a;
                    if (objCollect2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p6.a.e(obj);
                }
                throw new a1.b();
            case 3:
                int i11 = this.f10602b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                z1 z1Var4 = this.f10603l;
                r7.d0 d0Var2 = ((a1) z1Var4.f10683l.getValue()).f10422d;
                r1 r1Var4 = new r1(z1Var4, 3);
                this.f10602b = 1;
                d0Var2.f8969a.collect(r1Var4, this);
                return u6.a.f10763a;
            case 4:
                int i12 = this.f10602b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                z1 z1Var5 = this.f10603l;
                r7.o0 o0Var = z1Var5.d().f10462d;
                r1 r1Var5 = new r1(z1Var5, 4);
                this.f10602b = 1;
                o0Var.collect(r1Var5, this);
                return u6.a.f10763a;
            default:
                int i13 = this.f10602b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        throw androidx.lifecycle.l.q(obj);
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                z1 z1Var6 = this.f10603l;
                r7.o0 o0Var2 = z1Var6.d().f10460b;
                r1 r1Var6 = new r1(z1Var6, 5);
                this.f10602b = 1;
                o0Var2.collect(r1Var6, this);
                return u6.a.f10763a;
        }
    }
}
