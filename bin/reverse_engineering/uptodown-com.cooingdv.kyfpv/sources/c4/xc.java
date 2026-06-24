package c4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class xc extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc(Context context, t6.c cVar, int i) {
        super(2, cVar);
        this.f2318a = i;
        this.f2319b = context;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2318a) {
            case 0:
                return new xc(this.f2319b, cVar, 0);
            default:
                return new xc(this.f2319b, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2318a) {
            case 0:
                xc xcVar = (xc) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                xcVar.invokeSuspend(xVar);
                return xVar;
            default:
                xc xcVar2 = (xc) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                xcVar2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:50:0x0122, B:51:0x0132, B:53:0x0138, B:55:0x014d, B:57:0x0151, B:60:0x0158, B:63:0x016f, B:65:0x018c, B:69:0x0193, B:72:0x019d, B:74:0x01a1, B:76:0x01ab), top: B:88:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:50:0x0122, B:51:0x0132, B:53:0x0138, B:55:0x014d, B:57:0x0151, B:60:0x0158, B:63:0x016f, B:65:0x018c, B:69:0x0193, B:72:0x019d, B:74:0x01a1, B:76:0x01ab), top: B:88:0x0122 }] */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.xc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
