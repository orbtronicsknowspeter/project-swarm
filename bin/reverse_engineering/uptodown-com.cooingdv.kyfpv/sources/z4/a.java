package z4;

import android.content.BroadcastReceiver;
import d7.p;
import o7.a0;
import p6.x;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11955a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11956b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a4.p f11957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f11958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f11959n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4.p pVar, String str, BroadcastReceiver.PendingResult pendingResult, t6.c cVar) {
        super(2, cVar);
        this.f11957l = pVar;
        this.f11958m = str;
        this.f11959n = pendingResult;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f11955a) {
            case 0:
                return new a(this.f11958m, this.f11957l, this.f11959n, cVar);
            default:
                return new a(this.f11957l, this.f11958m, this.f11959n, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f11955a) {
        }
        return ((a) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, a4.p pVar, BroadcastReceiver.PendingResult pendingResult, t6.c cVar) {
        super(2, cVar);
        this.f11958m = str;
        this.f11957l = pVar;
        this.f11959n = pendingResult;
    }
}
