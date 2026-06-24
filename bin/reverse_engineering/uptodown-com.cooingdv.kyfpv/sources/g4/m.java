package g4;

import com.uptodown.core.activities.FileExplorerActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5217b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FileExplorerActivity f5218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5220n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(FileExplorerActivity fileExplorerActivity, String str, String str2, t6.c cVar, int i) {
        super(2, cVar);
        this.f5216a = i;
        this.f5218l = fileExplorerActivity;
        this.f5219m = str;
        this.f5220n = str2;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5216a) {
            case 0:
                return new m(this.f5218l, this.f5219m, this.f5220n, cVar, 0);
            default:
                return new m(this.f5218l, this.f5219m, this.f5220n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5216a) {
        }
        return ((m) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
