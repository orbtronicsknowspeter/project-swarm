package n4;

import e1.c0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends v6.i implements d7.p {
    public long A;
    public long B;
    public int C;
    public final /* synthetic */ File D;
    public final /* synthetic */ c0 E;
    public final /* synthetic */ File F;
    public final /* synthetic */ k4.c G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.u f7991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.u f7992b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f7993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ZipFile f7994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f7995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Enumeration f7996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ZipEntry f7997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f7998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.x f7999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileOutputStream f8000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public kotlin.jvm.internal.v f8001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f8002u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f8005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8006z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, c0 c0Var, File file2, k4.c cVar, t6.c cVar2) {
        super(2, cVar2);
        this.D = file;
        this.E = c0Var;
        this.F = file2;
        this.G = cVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new q(this.D, this.E, this.F, this.G, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:333|140|303|141|269|142|273|143|144|311|145|(11:147|148|257|149|150|151|152|293|153|154|(1:345)(1:157))(1:165)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:32|(6:289|33|(4:283|36|37|34)|342|39|40)|(3:297|41|42)|(5:263|44|(12:46|47|271|48|49|275|50|51|(8:325|53|(0)(2:56|328)|176|297|41|42|(0))|55|59|(5:61|62|261|63|(15:321|65|(5:67|319|68|267|69)(1:74)|75|265|76|77|78|255|79|291|80|81|82|(17:85|86|287|94|95|295|96|97|341|(8:285|98|99|279|100|101|102|(23:259|104|105|313|106|107|(2:109|(4:335|113|339|338)(2:337|112))(2:336|115)|116|307|117|(1:119)|120|121|122|323|123|124|125|317|126|127|128|(2:332|348)(4:131|132|340|338))(12:333|140|303|141|269|142|273|143|144|311|145|(11:147|148|257|149|150|151|152|293|153|154|(1:345)(1:157))(1:165)))|164|137|138|201|194|202|(2:204|(4:206|(1:346)|209|349)(6:210|(3:212|(2:215|213)|329)|216|(1:347)|219|350))(8:220|(2:(5:227|305|228|229|225)|330)|233|(3:235|(2:238|236)|331)|239|(1:344)|242|243)))(16:93|287|94|95|295|96|97|341|(9:285|98|99|279|100|101|102|(0)(0)|338)|164|137|138|201|194|202|(0)(0)))(9:173|253|174|175|176|297|41|42|(0)))|84|343)|180|281|181|(3:197|202|(0)(0))(9:185|(1:187)|188|189|309|190|(4:193|194|202|(0)(0))|84|343)|195|89|201|194|202|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:333|303|141|269|273|143|311|145|(11:147|148|257|149|150|151|152|293|153|154|(1:345)(1:157))(1:165)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:325:0x0227, B:55:0x022d], limit reached: 345 */
    /* JADX WARN: Removed duplicated region for block: B:183:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v33, types: [t6.c] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v53, types: [byte[], d2.a, java.io.FileOutputStream, java.io.InputStream, java.lang.String, java.util.ArrayList, java.util.Enumeration, java.util.zip.ZipEntry, java.util.zip.ZipFile, kotlin.jvm.internal.u, kotlin.jvm.internal.v, kotlin.jvm.internal.x, t6.c] */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x054b -> B:158:0x054f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0579 -> B:159:0x055f). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
