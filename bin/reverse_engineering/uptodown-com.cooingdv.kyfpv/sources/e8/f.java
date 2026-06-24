package e8;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4769a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f4770b = e.f4766b;

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        d0.b.m(eVar);
        return new d((List) new d8.d(m.f4777a).f(eVar));
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f4770b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        d0.b.i(fVar);
        m mVar = m.f4777a;
        b8.f fVar2 = m.f4778b;
        fVar2.getClass();
        d8.c cVar = new d8.c(fVar2, 1);
        List list = dVar.f4765a;
        int size = list.size();
        c8.d dVarBeginCollection = fVar.beginCollection(cVar, size);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            dVarBeginCollection.encodeSerializableElement(cVar, i, mVar, it.next());
        }
        dVarBeginCollection.endStructure(cVar);
    }
}
