package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.b f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f3676b;

    public m0(z7.b bVar) {
        bVar.getClass();
        this.f3675a = bVar;
        this.f3676b = new w0(bVar.getDescriptor());
    }

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        return eVar.decodeNotNullMark() ? eVar.decodeSerializableValue(this.f3675a) : eVar.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m0.class == obj.getClass() && kotlin.jvm.internal.l.a(this.f3675a, ((m0) obj).f3675a);
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return this.f3676b;
    }

    public final int hashCode() {
        return this.f3675a.hashCode();
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        if (obj == null) {
            fVar.encodeNull();
        } else {
            fVar.encodeNotNullMark();
            fVar.encodeSerializableValue(this.f3675a, obj);
        }
    }
}
