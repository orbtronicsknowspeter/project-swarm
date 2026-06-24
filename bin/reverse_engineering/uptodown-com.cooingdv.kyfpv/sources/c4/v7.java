package c4;

import com.uptodown.activities.PublicProfileActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v7 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2205a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2206b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f2211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2212q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(y7 y7Var, int i, PublicProfileActivity publicProfileActivity, String str, int i6, t6.c cVar) {
        super(2, cVar);
        this.f2210o = y7Var;
        this.f2207l = i;
        this.f2211p = publicProfileActivity;
        this.f2212q = str;
        this.f2208m = i6;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2205a) {
            case 0:
                return new v7((y7) this.f2210o, this.f2207l, (PublicProfileActivity) this.f2211p, (String) this.f2212q, this.f2208m, cVar);
            default:
                return new v7(this.f2209n, (a2.t) this.f2212q, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2205a) {
        }
        return ((v7) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:25|149|26|151|27|(12:35|(3:37|(5:40|145|41|42|38)|153)|45|(2:48|46)|154|49|(8:51|(2:53|(1:55))|58|(5:60|(2:62|(2:64|57)(1:65))|67|(1:99)(2:69|(2:71|(9:73|147|74|(1:76)(1:78)|(1:82)|(1:84)(1:86)|85|87|(0))(2:91|(2:93|(0))))(1:98))|(0)(4:103|104|17|(2:105|(0))(0)))|66|67|(0)(0)|(0))|56|57|67|(0)(0)|(0)(0))|90|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        r0.printStackTrace();
        r0 = null;
     */
    /* JADX WARN: Path cross not found for [B:100:0x029a, B:25:0x00c0], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:25:0x00c0, B:100:0x029a], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:56:0x01ba, B:51:0x01a9], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:60:0x01c3, B:66:0x01e7], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:73:0x0200, B:91:0x0249], limit reached: 151 */
    /* JADX WARN: Path cross not found for [B:93:0x0257, B:90:0x0247], limit reached: 151 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02a1 -> B:104:0x02a2). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.v7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(ArrayList arrayList, a2.t tVar, t6.c cVar) {
        super(2, cVar);
        this.f2209n = arrayList;
        this.f2212q = tVar;
    }
}
