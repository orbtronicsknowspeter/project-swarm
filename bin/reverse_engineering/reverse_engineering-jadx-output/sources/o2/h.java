package o2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements l2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8144a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8145b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l2.c f8146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f8147d;

    public h(f fVar) {
        this.f8147d = fVar;
    }

    @Override // l2.g
    public final l2.g b(String str) {
        if (this.f8144a) {
            throw new l2.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8144a = true;
        this.f8147d.i(this.f8146c, str, this.f8145b);
        return this;
    }

    @Override // l2.g
    public final l2.g c(boolean z9) {
        if (this.f8144a) {
            throw new l2.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8144a = true;
        this.f8147d.c(this.f8146c, z9 ? 1 : 0, this.f8145b);
        return this;
    }
}
