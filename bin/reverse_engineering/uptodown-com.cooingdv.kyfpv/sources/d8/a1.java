package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f3619a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3620b = new u0("kotlin.Short", b8.d.f1110o);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        return Short.valueOf(eVar.decodeShort());
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f3620b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        fVar.encodeShort(((Number) obj).shortValue());
    }
}
