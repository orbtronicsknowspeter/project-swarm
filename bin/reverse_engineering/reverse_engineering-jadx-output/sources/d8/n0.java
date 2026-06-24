package d8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3679a = p6.a.c(p6.g.f8438a, new androidx.lifecycle.k(this));

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        int iDecodeElementIndex;
        eVar.getClass();
        b8.e descriptor = getDescriptor();
        c8.c cVarBeginStructure = eVar.beginStructure(descriptor);
        if (!cVarBeginStructure.decodeSequentially() && (iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new z7.g(androidx.lifecycle.l.u(iDecodeElementIndex, "Unexpected index "));
        }
        cVarBeginStructure.endStructure(descriptor);
        return p6.x.f8463a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p6.f] */
    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return (b8.e) this.f3679a.getValue();
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        obj.getClass();
        fVar.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
