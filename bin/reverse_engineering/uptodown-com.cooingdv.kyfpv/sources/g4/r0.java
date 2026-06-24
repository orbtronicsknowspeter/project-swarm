package g4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f5252b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5253l;

    public /* synthetic */ r0(s0 s0Var, String str, int i) {
        this.f5251a = i;
        this.f5252b = s0Var;
        this.f5253l = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5251a) {
            case 0:
                s0 s0Var = this.f5252b;
                s0Var.E();
                s0Var.i(this.f5253l);
                break;
            default:
                s0 s0Var2 = this.f5252b;
                s0Var2.E();
                s0Var2.i(this.f5253l);
                break;
        }
    }
}
