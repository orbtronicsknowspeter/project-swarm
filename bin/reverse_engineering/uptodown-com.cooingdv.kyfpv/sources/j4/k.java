package j4;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.v;
import o7.a0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f6627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f6628b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f6633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InputStream f6634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ OutputStream f6635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f6636s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InputStream inputStream, OutputStream outputStream, String str, t6.c cVar) {
        super(2, cVar);
        this.f6633p = oVar;
        this.f6634q = inputStream;
        this.f6635r = outputStream;
        this.f6636s = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new k(this.f6633p, this.f6634q, this.f6635r, this.f6636s, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a0) obj, (t6.c) obj2)).invokeSuspend(x.f8464a);
    }

    /* JADX WARN: Path cross not found for [B:36:0x0099, B:38:0x009f], limit reached: 77 */
    /* JADX WARN: Path cross not found for [B:38:0x009f, B:36:0x0099], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x0019, B:14:0x0047, B:16:0x004f, B:13:0x0038), top: B:61:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #4 {all -> 0x008d, blocks: (B:18:0x005d, B:20:0x0066, B:24:0x0075, B:26:0x0079, B:33:0x008f, B:36:0x0099, B:39:0x00a2), top: B:65:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
