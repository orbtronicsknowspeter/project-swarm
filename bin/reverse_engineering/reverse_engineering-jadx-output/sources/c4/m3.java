package c4;

import com.uptodown.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1857b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f1860n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(MainActivity mainActivity, String str, t6.c cVar, int i) {
        super(2, cVar);
        this.f1856a = i;
        this.f1859m = mainActivity;
        this.f1860n = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1856a) {
            case 0:
                return new m3(this.f1859m, this.f1860n, cVar, 0);
            default:
                return new m3(this.f1859m, this.f1860n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1856a) {
        }
        return ((m3) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[PHI: r0
      0x00ae: PHI (r0v3 java.lang.Object) = (r0v2 java.lang.Object), (r0v2 java.lang.Object), (r0v4 java.lang.Object) binds: [B:34:0x0094, B:36:0x00ab, B:27:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.m3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
