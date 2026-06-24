package e8;

import d8.b1;
import d8.e0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f4789a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f4790b = u.f4786b;

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        d0.b.m(eVar);
        b1 b1Var = b1.f3622a;
        m mVar = m.f4777a;
        return new t((Map) new e0(b1.f3622a, m.f4777a).deserialize(eVar));
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f4790b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        t tVar = (t) obj;
        tVar.getClass();
        d0.b.i(fVar);
        b1 b1Var = b1.f3622a;
        m mVar = m.f4777a;
        new e0(b1.f3622a, m.f4777a).serialize(fVar, tVar);
    }
}
