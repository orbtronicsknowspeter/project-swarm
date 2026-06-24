package m8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f7735n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7740e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f7743m;

    static {
        h hVar = new h();
        hVar.f7734d = true;
        long j = Integer.MAX_VALUE;
        hVar.f7733c = j <= 2147483647L ? (int) j : Integer.MAX_VALUE;
        f7735n = new i(hVar);
    }

    public i(h hVar) {
        this.f7736a = hVar.f7731a;
        this.f7737b = hVar.f7732b;
        this.f7738c = -1;
        this.f7739d = -1;
        this.f7740e = false;
        this.f = false;
        this.g = false;
        this.h = hVar.f7733c;
        this.i = -1;
        this.j = hVar.f7734d;
        this.f7741k = false;
        this.f7742l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m8.i a(m8.s r23) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.i.a(m8.s):m8.i");
    }

    public final String toString() {
        String string;
        String str = this.f7743m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7736a) {
            sb.append("no-cache, ");
        }
        if (this.f7737b) {
            sb.append("no-store, ");
        }
        int i = this.f7738c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i6 = this.f7739d;
        if (i6 != -1) {
            sb.append("s-maxage=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f7740e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i10 = this.h;
        if (i10 != -1) {
            sb.append("max-stale=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.i;
        if (i11 != -1) {
            sb.append("min-fresh=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f7741k) {
            sb.append("no-transform, ");
        }
        if (this.f7742l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f7743m = string;
        return string;
    }

    public i(boolean z9, boolean z10, int i, int i6, boolean z11, boolean z12, boolean z13, int i10, int i11, boolean z14, boolean z15, boolean z16, String str) {
        this.f7736a = z9;
        this.f7737b = z10;
        this.f7738c = i;
        this.f7739d = i6;
        this.f7740e = z11;
        this.f = z12;
        this.g = z13;
        this.h = i10;
        this.i = i11;
        this.j = z14;
        this.f7741k = z15;
        this.f7742l = z16;
        this.f7743m = str;
    }
}
