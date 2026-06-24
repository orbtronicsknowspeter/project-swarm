package g5;

import com.uptodown.tv.ui.fragment.TvAppDetailFragment;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5306b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TvAppDetailFragment f5307l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TvAppDetailFragment tvAppDetailFragment, t6.c cVar, int i) {
        super(2, cVar);
        this.f5305a = i;
        this.f5307l = tvAppDetailFragment;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5305a) {
            case 0:
                return new e(this.f5307l, cVar, 0);
            case 1:
                return new e(this.f5307l, cVar, 1);
            case 2:
                return new e(this.f5307l, cVar, 2);
            case 3:
                return new e(this.f5307l, cVar, 3);
            default:
                return new e(this.f5307l, cVar, 4);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5305a) {
        }
        return ((e) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
