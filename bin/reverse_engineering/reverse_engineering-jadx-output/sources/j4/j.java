package j4;

import android.content.Context;
import androidx.documentfile.provider.DocumentFile;
import java.util.zip.ZipOutputStream;
import o7.a0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6617a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6618b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DocumentFile f6621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f6622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f6623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f6624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6625r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, a2.n nVar, t6.c cVar) {
        super(2, cVar);
        this.f6621n = documentFile;
        this.f6623p = zipOutputStream;
        this.f6624q = context;
        this.f6625r = nVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f6617a) {
            case 0:
                return new j((o) this.f6625r, cVar);
            default:
                return new j(this.f6621n, (ZipOutputStream) this.f6623p, (Context) this.f6624q, (a2.n) this.f6625r, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f6617a) {
        }
        return ((j) create(a0Var, cVar)).invokeSuspend(x.f8463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b0 -> B:38:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01cd -> B:54:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01cf -> B:54:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d7 -> B:54:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0215 -> B:54:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0217 -> B:54:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x026f -> B:98:0x0270). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, t6.c cVar) {
        super(2, cVar);
        this.f6625r = oVar;
    }
}
