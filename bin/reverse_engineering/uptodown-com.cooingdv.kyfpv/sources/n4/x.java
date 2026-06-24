package n4;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.OutputStream;
import java.util.zip.ZipInputStream;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZipInputStream f8037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.x f8038b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.v f8039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.w f8040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OutputStream f8041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f8042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kotlin.jvm.internal.v f8043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ File f8047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f8048u;
    public final /* synthetic */ Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g4.v f8049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(File file, Uri uri, Context context, g4.v vVar, t6.c cVar) {
        super(2, cVar);
        this.f8047t = file;
        this.f8048u = uri;
        this.v = context;
        this.f8049w = vVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new x(this.f8047t, this.f8048u, this.v, this.f8049w, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (o7.c0.C(r2, r1, r22) == r13) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a8  */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[], java.io.OutputStream, kotlin.jvm.internal.v, t6.c] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0143 -> B:94:0x029c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x020e -> B:82:0x0222). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0273 -> B:90:0x0274). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0278 -> B:92:0x0280). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
