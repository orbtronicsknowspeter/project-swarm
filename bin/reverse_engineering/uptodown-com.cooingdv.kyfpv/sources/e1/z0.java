package e1;

import j$.util.Objects;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4447a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f4448b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f4449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f4450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f4451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d2 f4453p;

    public z0(a1 a1Var, String str, URL url, byte[] bArr, Map map, y0 y0Var) {
        Objects.requireNonNull(a1Var);
        this.f4453p = a1Var;
        k0.y.d(str);
        k0.y.g(url);
        this.f4448b = url;
        this.f4449l = bArr;
        this.f4452o = y0Var;
        this.f4450m = str;
        this.f4451n = map;
    }

    public void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        q1 q1Var = ((f3) this.f4453p).f3876a.f4266p;
        t1.m(q1Var);
        q1Var.p(new Runnable() { // from class: e1.e3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                z0 z0Var = this.f3905a;
                ((d3) z0Var.f4452o).c(z0Var.f4450m, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x027c: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:637), block:B:141:0x027a */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x027f: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:640), block:B:142:0x027e */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Type inference failed for: r14v0, types: [e1.z0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.z0.run():void");
    }

    public z0(f3 f3Var, String str, URL url, byte[] bArr, HashMap map, d3 d3Var) {
        Objects.requireNonNull(f3Var);
        this.f4453p = f3Var;
        k0.y.d(str);
        this.f4448b = url;
        this.f4449l = bArr;
        this.f4452o = d3Var;
        this.f4450m = str;
        this.f4451n = map;
    }
}
