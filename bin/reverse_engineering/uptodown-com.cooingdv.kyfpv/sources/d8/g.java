package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3645a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3646b = new u0("kotlin.Boolean", b8.d.h);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        return Boolean.valueOf(eVar.decodeBoolean());
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f3646b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        fVar.encodeBoolean(((Boolean) obj).booleanValue());
    }
}
