package y1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11650b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.e f11651l;

    public /* synthetic */ m(q qVar, g2.e eVar, int i) {
        this.f11649a = i;
        this.f11650b = qVar;
        this.f11651l = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11649a) {
            case 0:
                this.f11650b.a(this.f11651l);
                break;
            default:
                this.f11650b.a(this.f11651l);
                break;
        }
    }
}
