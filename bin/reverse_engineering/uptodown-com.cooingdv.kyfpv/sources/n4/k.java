package n4;

import android.app.Activity;
import android.content.pm.PackageInfo;
import g4.h0;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PackageInfo f7976b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f7982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Activity f7983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f7984s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Activity activity, h0 h0Var, t6.c cVar) {
        super(2, cVar);
        this.f7982q = str;
        this.f7983r = activity;
        this.f7984s = h0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new k(this.f7982q, this.f7983r, this.f7984s, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x028f, code lost:
    
        if (r0 == r5) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (r0 == r5) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb A[Catch: Exception -> 0x0071, TryCatch #4 {Exception -> 0x0071, blocks: (B:104:0x0292, B:100:0x026e, B:20:0x005f, B:74:0x01a4, B:76:0x01bb, B:77:0x01bf, B:79:0x01f8, B:83:0x0205, B:97:0x0255, B:25:0x007e, B:70:0x017b, B:30:0x00a3, B:32:0x00b2, B:35:0x00b9, B:101:0x0274), top: B:119:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246 A[Catch: Exception -> 0x023e, TRY_LEAVE, TryCatch #6 {Exception -> 0x023e, blocks: (B:87:0x0213, B:95:0x0246), top: B:129:0x020b }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [g4.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [g4.h0] */
    /* JADX WARN: Type inference failed for: r14v5, types: [g4.h0] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [g4.h0] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.StringBuilder] */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
