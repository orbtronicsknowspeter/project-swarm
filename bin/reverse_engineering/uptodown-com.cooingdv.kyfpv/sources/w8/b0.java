package w8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10944e;
    public b0 f;
    public b0 g;

    public b0(byte[] bArr, int i, int i6, boolean z9) {
        bArr.getClass();
        this.f10940a = bArr;
        this.f10941b = i;
        this.f10942c = i6;
        this.f10943d = z9;
        this.f10944e = false;
    }

    public final b0 a() {
        b0 b0Var = this.f;
        if (b0Var == this) {
            b0Var = null;
        }
        b0 b0Var2 = this.g;
        b0Var2.getClass();
        b0Var2.f = this.f;
        b0 b0Var3 = this.f;
        b0Var3.getClass();
        b0Var3.g = this.g;
        this.f = null;
        this.g = null;
        return b0Var;
    }

    public final void b(b0 b0Var) {
        b0Var.getClass();
        b0Var.g = this;
        b0Var.f = this.f;
        b0 b0Var2 = this.f;
        b0Var2.getClass();
        b0Var2.g = b0Var;
        this.f = b0Var;
    }

    public final b0 c() {
        this.f10943d = true;
        return new b0(this.f10940a, this.f10941b, this.f10942c, true);
    }

    public final void d(b0 b0Var, int i) {
        b0Var.getClass();
        byte[] bArr = b0Var.f10940a;
        if (!b0Var.f10944e) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("only owner can write");
            return;
        }
        int i6 = b0Var.f10942c;
        int i10 = i6 + i;
        if (i10 > 8192) {
            if (b0Var.f10943d) {
                s1.o.n();
                return;
            }
            int i11 = b0Var.f10941b;
            if (i10 - i11 > 8192) {
                s1.o.n();
                return;
            } else {
                q6.j.Y(bArr, 0, bArr, i11, i6);
                b0Var.f10942c -= b0Var.f10941b;
                b0Var.f10941b = 0;
            }
        }
        int i12 = b0Var.f10942c;
        int i13 = this.f10941b;
        q6.j.Y(this.f10940a, i12, bArr, i13, i13 + i);
        b0Var.f10942c += i;
        this.f10941b += i;
    }

    public b0() {
        this.f10940a = new byte[8192];
        this.f10944e = true;
        this.f10943d = false;
    }
}
