package c4;

import android.os.Bundle;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n4 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1897b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f1898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f1899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w4 f1900n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(int i, Bundle bundle, w4 w4Var, String str, t6.c cVar, int i6) {
        super(2, cVar);
        this.f1896a = i6;
        this.f1897b = i;
        this.f1898l = bundle;
        this.f1900n = w4Var;
        this.f1899m = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1896a) {
            case 0:
                return new n4(this.f1897b, this.f1898l, (MyApps) this.f1900n, this.f1899m, cVar, 0);
            default:
                return new n4(this.f1897b, this.f1898l, (Updates) this.f1900n, this.f1899m, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1896a) {
            case 0:
                n4 n4Var = (n4) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                n4Var.invokeSuspend(xVar);
                return xVar;
            default:
                n4 n4Var2 = (n4) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                n4Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.n4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
