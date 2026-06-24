package d8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.b f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.b f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f3638c;

    public e0(z7.b bVar, z7.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.f3636a = bVar;
        this.f3637b = bVar2;
        b8.e descriptor = bVar.getDescriptor();
        b8.e descriptor2 = bVar2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.f3638c = new d0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // d8.a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // d8.a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // d8.a
    public final void c(int i, Object obj) {
        ((LinkedHashMap) obj).getClass();
    }

    @Override // d8.a
    public final Iterator d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // d8.a
    public final int e(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // d8.a
    public final void g(c8.c cVar, Object obj, int i, int i6) {
        Map map = (Map) obj;
        map.getClass();
        if (i6 < 0) {
            com.google.gson.internal.a.p("Size must be known in advance when using READ_ALL");
            return;
        }
        i7.d dVarK = t0.f.K(0, i6 * 2);
        dVarK.getClass();
        int i10 = dVarK.f5696a;
        int i11 = dVarK.f5697b;
        int i12 = dVarK.f5698l <= 0 ? -2 : 2;
        int i13 = new i7.b(i10, i11, i12).f5697b;
        if ((i12 <= 0 || i10 > i13) && (i12 >= 0 || i13 > i10)) {
            return;
        }
        while (true) {
            k(cVar, i + i10, map, false);
            if (i10 == i13) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return this.f3638c;
    }

    @Override // d8.a
    public final /* bridge */ /* synthetic */ void h(c8.c cVar, int i, Object obj) {
        k(cVar, i, (Map) obj, true);
    }

    @Override // d8.a
    public final Object i(Object obj) {
        throw null;
    }

    @Override // d8.a
    public final Object j(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    public final void k(c8.c cVar, int i, Map map, boolean z9) {
        int iDecodeElementIndex;
        map.getClass();
        Object objDecodeSerializableElement = cVar.decodeSerializableElement(getDescriptor(), i, this.f3636a, null);
        if (z9) {
            iDecodeElementIndex = cVar.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i + 1) {
                s1.o.e(i, iDecodeElementIndex, ", returned index for value: ", "Value must follow key in a map, index for key: ");
                return;
            }
        } else {
            iDecodeElementIndex = i + 1;
        }
        boolean zContainsKey = map.containsKey(objDecodeSerializableElement);
        z7.b bVar = this.f3637b;
        map.put(objDecodeSerializableElement, (!zContainsKey || (bVar.getDescriptor().getKind() instanceof b8.d)) ? cVar.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, bVar, null) : cVar.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, bVar, q6.a0.g0(map, objDecodeSerializableElement)));
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        int iE = e(obj);
        b8.e descriptor = getDescriptor();
        c8.d dVarBeginCollection = fVar.beginCollection(descriptor, iE);
        Iterator itD = d(obj);
        int i = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i6 = i + 1;
            dVarBeginCollection.encodeSerializableElement(getDescriptor(), i, this.f3636a, key);
            i += 2;
            dVarBeginCollection.encodeSerializableElement(getDescriptor(), i6, this.f3637b, value);
        }
        dVarBeginCollection.endStructure(descriptor);
    }
}
