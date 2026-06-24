package n4;

import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.Serializable;
import java.util.zip.ZipInputStream;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8024a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZipInputStream f8025b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.v f8026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.w f8027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public kotlin.jvm.internal.v f8028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g4.v f8031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Serializable f8032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Cloneable f8034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f8035u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8036w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, DocumentFile documentFile, Uri uri, g4.v vVar, t6.c cVar) {
        super(2, cVar);
        this.f8035u = context;
        this.v = documentFile;
        this.f8036w = uri;
        this.f8031q = vVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f8024a) {
            case 0:
                return new w((String) this.v, (File) this.f8033s, (a2.n) this.f8036w, this.f8031q, cVar);
            default:
                return new w((Context) this.f8035u, (DocumentFile) this.v, (Uri) this.f8036w, this.f8031q, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f8024a) {
        }
        return ((w) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0365, code lost:
    
        if (o7.c0.C(r3, r0, r26) == r8) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (o7.c0.C(r4, r3, r26) == r8) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04df, code lost:
    
        if (o7.c0.C(r5, r0, r26) == r8) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0331, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:134:0x0377, B:160:0x03d5], limit reached: 224 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0421 A[Catch: all -> 0x0387, IOException -> 0x04ee, EOFException -> 0x04f2, TryCatch #5 {all -> 0x0387, blocks: (B:141:0x0382, B:197:0x04ee, B:198:0x04f2, B:186:0x04a9, B:176:0x045d, B:178:0x0465, B:180:0x047a, B:187:0x04b0, B:188:0x04b5, B:167:0x0421, B:169:0x0438, B:170:0x043f, B:172:0x0445, B:174:0x044b, B:175:0x044e, B:189:0x04bf, B:165:0x041a), top: B:206:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0465 A[Catch: all -> 0x0387, IOException -> 0x04ee, EOFException -> 0x04f2, TryCatch #5 {all -> 0x0387, blocks: (B:141:0x0382, B:197:0x04ee, B:198:0x04f2, B:186:0x04a9, B:176:0x045d, B:178:0x0465, B:180:0x047a, B:187:0x04b0, B:188:0x04b5, B:167:0x0421, B:169:0x0438, B:170:0x043f, B:172:0x0445, B:174:0x044b, B:175:0x044e, B:189:0x04bf, B:165:0x041a), top: B:206:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b0 A[Catch: all -> 0x0387, IOException -> 0x04ee, EOFException -> 0x04f2, TryCatch #5 {all -> 0x0387, blocks: (B:141:0x0382, B:197:0x04ee, B:198:0x04f2, B:186:0x04a9, B:176:0x045d, B:178:0x0465, B:180:0x047a, B:187:0x04b0, B:188:0x04b5, B:167:0x0421, B:169:0x0438, B:170:0x043f, B:172:0x0445, B:174:0x044b, B:175:0x044e, B:189:0x04bf, B:165:0x041a), top: B:206:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04bf A[Catch: all -> 0x0387, IOException -> 0x04ee, EOFException -> 0x04f2, TRY_LEAVE, TryCatch #5 {all -> 0x0387, blocks: (B:141:0x0382, B:197:0x04ee, B:198:0x04f2, B:186:0x04a9, B:176:0x045d, B:178:0x0465, B:180:0x047a, B:187:0x04b0, B:188:0x04b5, B:167:0x0421, B:169:0x0438, B:170:0x043f, B:172:0x0445, B:174:0x044b, B:175:0x044e, B:189:0x04bf, B:165:0x041a), top: B:206:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v22, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.io.InputStream, java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x02bf -> B:114:0x02d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0317 -> B:122:0x0319). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x031c -> B:124:0x031f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0438 -> B:188:0x04b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x044e -> B:176:0x045d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x04a3 -> B:184:0x04a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x04a6 -> B:186:0x04a9). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, File file, a2.n nVar, g4.v vVar, t6.c cVar) {
        super(2, cVar);
        this.v = str;
        this.f8033s = file;
        this.f8036w = nVar;
        this.f8031q = vVar;
    }
}
