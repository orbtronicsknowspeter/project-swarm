package c4;

import com.uptodown.activities.UserAvatarActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class pb extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1997b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAvatarActivity f1998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb(UserAvatarActivity userAvatarActivity, t6.c cVar, int i) {
        super(2, cVar);
        this.f1996a = i;
        this.f1998l = userAvatarActivity;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1996a) {
            case 0:
                return new pb(this.f1998l, cVar, 0);
            case 1:
                return new pb(this.f1998l, cVar, 1);
            default:
                return new pb(this.f1998l, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1996a) {
            case 0:
                break;
            case 1:
                ((pb) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
            default:
                ((pb) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
                break;
        }
        return u6.a.f10763a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.pb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
