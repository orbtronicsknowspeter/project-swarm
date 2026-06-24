package n4;

import android.content.Context;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f8050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZipInputStream f8051b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ZipEntry f8052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.v f8053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public kotlin.jvm.internal.w f8054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FileOutputStream f8055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kotlin.jvm.internal.v f8056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f8059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f8060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DocumentFile f8061u;
    public final /* synthetic */ a2.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g4.v f8062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, Context context, DocumentFile documentFile, a2.n nVar, g4.v vVar, t6.c cVar) {
        super(2, cVar);
        this.f8059s = str;
        this.f8060t = context;
        this.f8061u = documentFile;
        this.v = nVar;
        this.f8062w = vVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new y(this.f8059s, this.f8060t, this.f8061u, this.v, this.f8062w, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a3 -> B:40:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b8 -> B:30:0x00d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0113 -> B:38:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0116 -> B:38:0x0118). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
