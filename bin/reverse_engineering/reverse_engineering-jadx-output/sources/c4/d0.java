package c4;

import com.uptodown.activities.MyDownloads;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1490a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1491b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Serializable f1494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1497q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k0 k0Var, String str, x4.r rVar, File file, String str2, boolean z9, t6.c cVar) {
        super(2, cVar);
        this.f1493m = k0Var;
        this.f1494n = str;
        this.f1496p = rVar;
        this.f1497q = file;
        this.f1495o = str2;
        this.f1492l = z9;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1490a) {
            case 0:
                return new d0((k0) this.f1493m, (String) this.f1494n, (x4.r) this.f1496p, (File) this.f1497q, (String) this.f1495o, this.f1492l, cVar);
            default:
                return new d0(this.f1492l, (o5) this.f1495o, (MyDownloads) this.f1496p, (m5) this.f1497q, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1490a) {
        }
        return ((d0) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x031c  */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r17v0, types: [t6.c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, r7.o0] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z9, o5 o5Var, MyDownloads myDownloads, m5 m5Var, t6.c cVar) {
        super(2, cVar);
        this.f1492l = z9;
        this.f1495o = o5Var;
        this.f1496p = myDownloads;
        this.f1497q = m5Var;
    }
}
