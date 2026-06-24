package u4;

import android.content.Context;
import com.uptodown.gcm.MyFirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10453b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f10454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f10455m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, Object obj2, t6.c cVar, int i) {
        super(2, cVar);
        this.f10452a = i;
        this.f10454l = obj;
        this.f10455m = obj2;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f10452a) {
            case 0:
                return new d0((f0) this.f10454l, (Context) this.f10455m, cVar, 0);
            case 1:
                return new d0((f0) this.f10454l, (q1.a) this.f10455m, cVar, 1);
            case 2:
                return new d0((z0) this.f10454l, (x4.g) this.f10455m, cVar, 2);
            case 3:
                return new d0((m1) this.f10454l, (x4.g) this.f10455m, cVar, 3);
            case 4:
                return new d0((y2.r) this.f10454l, (MyFirebaseMessagingService) this.f10455m, cVar, 4);
            default:
                return new d0((MyFirebaseMessagingService) this.f10454l, (String) this.f10455m, cVar, 5);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f10452a) {
        }
        return ((d0) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARN: Type inference failed for: r11v0, types: [t6.c] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10 */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
