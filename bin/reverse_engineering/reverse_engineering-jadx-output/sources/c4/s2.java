package c4;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.i4 f2069b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GoogleSignInAccount f2071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t2 f2072n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(GoogleSignInAccount googleSignInAccount, t2 t2Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f2068a = i;
        this.f2071m = googleSignInAccount;
        this.f2072n = t2Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2068a) {
            case 0:
                return new s2(this.f2071m, this.f2072n, cVar, 0);
            default:
                return new s2(this.f2071m, this.f2072n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2068a) {
        }
        return ((s2) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        com.google.android.gms.internal.measurement.i4 i4Var;
        com.google.android.gms.internal.measurement.i4 i4Var2;
        p7.c cVar;
        r2 r2Var;
        com.google.android.gms.internal.measurement.i4 i4Var3;
        com.google.android.gms.internal.measurement.i4 i4Var4;
        p7.c cVar2;
        r2 r2Var2;
        int i = this.f2068a;
        p6.x xVar = p6.x.f8463a;
        u6.a aVar = u6.a.f10762a;
        GoogleSignInAccount googleSignInAccount = this.f2071m;
        t2 t2Var = this.f2072n;
        switch (i) {
            case 0:
                String str = googleSignInAccount.f2429l;
                int i6 = this.f2070l;
                if (i6 == 0) {
                    p6.a.e(obj);
                    i4Var = new com.google.android.gms.internal.measurement.i4();
                    v7.e eVar = o7.m0.f8288a;
                    p7.c cVar3 = t7.n.f10348a;
                    g gVar = new g(t2Var, null, 2);
                    this.f2069b = i4Var;
                    this.f2070l = 1;
                    if (o7.c0.C(gVar, cVar3, this) != aVar) {
                    }
                } else if (i6 == 1) {
                    com.google.android.gms.internal.measurement.i4 i4Var5 = this.f2069b;
                    p6.a.e(obj);
                    i4Var = i4Var5;
                } else if (i6 == 2) {
                    i4Var2 = this.f2069b;
                    p6.a.e(obj);
                    i4Var = i4Var2;
                    v7.e eVar2 = o7.m0.f8288a;
                    cVar = t7.n.f10348a;
                    r2Var = new r2(i4Var, t2Var, null, 0);
                    this.f2069b = null;
                    this.f2070l = 3;
                    if (o7.c0.C(r2Var, cVar, this) != aVar) {
                    }
                } else if (i6 != 3) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                if (str == null || str.length() == 0) {
                    v7.e eVar22 = o7.m0.f8288a;
                    cVar = t7.n.f10348a;
                    r2Var = new r2(i4Var, t2Var, null, 0);
                    this.f2069b = null;
                    this.f2070l = 3;
                    if (o7.c0.C(r2Var, cVar, this) != aVar) {
                    }
                } else {
                    str.getClass();
                    this.f2069b = i4Var;
                    this.f2070l = 2;
                    if (i4Var.c(str, t2Var, this) != aVar) {
                        i4Var2 = i4Var;
                        i4Var = i4Var2;
                        v7.e eVar222 = o7.m0.f8288a;
                        cVar = t7.n.f10348a;
                        r2Var = new r2(i4Var, t2Var, null, 0);
                        this.f2069b = null;
                        this.f2070l = 3;
                        if (o7.c0.C(r2Var, cVar, this) != aVar) {
                        }
                    }
                }
                break;
            default:
                String str2 = googleSignInAccount.f2429l;
                int i10 = this.f2070l;
                if (i10 == 0) {
                    p6.a.e(obj);
                    i4Var3 = new com.google.android.gms.internal.measurement.i4();
                    if (str2 == null || str2.length() == 0) {
                        v7.e eVar3 = o7.m0.f8288a;
                        cVar2 = t7.n.f10348a;
                        r2Var2 = new r2(i4Var3, t2Var, null, 1);
                        this.f2069b = null;
                        this.f2070l = 2;
                        if (o7.c0.C(r2Var2, cVar2, this) != aVar) {
                        }
                    } else {
                        str2.getClass();
                        this.f2069b = i4Var3;
                        this.f2070l = 1;
                        if (i4Var3.c(str2, t2Var, this) != aVar) {
                            i4Var4 = i4Var3;
                        }
                    }
                } else if (i10 == 1) {
                    i4Var4 = this.f2069b;
                    p6.a.e(obj);
                } else if (i10 != 2) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                i4Var3 = i4Var4;
                v7.e eVar32 = o7.m0.f8288a;
                cVar2 = t7.n.f10348a;
                r2Var2 = new r2(i4Var3, t2Var, null, 1);
                this.f2069b = null;
                this.f2070l = 2;
                if (o7.c0.C(r2Var2, cVar2, this) != aVar) {
                }
                break;
        }
        return aVar;
    }
}
