package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f3639a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f3640b = o0.a("kotlin.UByte", j.f3660a);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        return new p6.o(eVar.decodeInline(f3640b).decodeByte());
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f3640b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        fVar.encodeInline(f3640b).encodeByte(((p6.o) obj).f8455a);
    }
}
