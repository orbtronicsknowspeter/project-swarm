package r7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f9074b;

    public /* synthetic */ x(kotlin.jvm.internal.x xVar, int i) {
        this.f9073a = i;
        this.f9074b = xVar;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        switch (this.f9073a) {
            case 0:
                this.f9074b.f7025a = obj;
                throw new s7.a(this);
            default:
                this.f9074b.f7025a = obj;
                throw new s7.a(this);
        }
    }
}
