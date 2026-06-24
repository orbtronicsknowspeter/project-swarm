package c3;

import android.content.Context;
import androidx.documentfile.provider.DocumentFile;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1302a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1303b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f1304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f1306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f1309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1311s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, DocumentFile documentFile, ArrayList arrayList, a2.n nVar, g4.u uVar, t6.c cVar) {
        super(2, cVar);
        this.f1307o = context;
        this.f1308p = documentFile;
        this.f1309q = arrayList;
        this.f1310r = nVar;
        this.f1311s = uVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1302a) {
            case 0:
                return new q0((s0) this.f1306n, (n0) this.f1310r, cVar);
            default:
                return new q0((Context) this.f1307o, (DocumentFile) this.f1308p, (ArrayList) this.f1309q, (a2.n) this.f1310r, (g4.u) this.f1311s, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1302a) {
        }
        return ((q0) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:4|(1:(1:(1:(1:(1:(2:11|49)(1:12))(4:13|42|29|(3:31|(1:34)|(0)(3:37|38|(0)(4:41|42|29|(5:43|(1:45)|46|(0)|49)(0))))(0)))(3:14|38|(0)))(5:15|27|28|29|(0)(0)))(1:16))(2:17|(0))|97|20|(1:22)(1:27)|28|29|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r2 = o7.m0.f8288a;
        r2 = t7.n.f10348a;
        r11 = new c4.g(r10, null, 14);
        r22.f1304l = null;
        r22.f1303b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (o7.c0.C(r11, r2, r22) == r3) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x014b -> B:42:0x014e). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, n0 n0Var, t6.c cVar) {
        super(2, cVar);
        this.f1306n = s0Var;
        this.f1310r = n0Var;
    }
}
