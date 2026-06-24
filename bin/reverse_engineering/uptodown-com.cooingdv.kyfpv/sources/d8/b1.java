package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f3622a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3623b = new u0("kotlin.String", b8.d.f1111p);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        return eVar.decodeString();
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f3623b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        String str = (String) obj;
        str.getClass();
        fVar.encodeString(str);
    }
}
