package d8;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements z7.b {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(int i, Object obj);

    public abstract Iterator d(Object obj);

    @Override // z7.a
    public Object deserialize(c8.e eVar) {
        eVar.getClass();
        return f(eVar);
    }

    public abstract int e(Object obj);

    public final Object f(c8.e eVar) {
        eVar.getClass();
        Object objA = a();
        int iB = b(objA);
        c8.c cVarBeginStructure = eVar.beginStructure(getDescriptor());
        if (!cVarBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                h(cVarBeginStructure, iDecodeElementIndex + iB, objA);
            }
        } else {
            int iDecodeCollectionSize = cVarBeginStructure.decodeCollectionSize(getDescriptor());
            c(iDecodeCollectionSize, objA);
            g(cVarBeginStructure, objA, iB, iDecodeCollectionSize);
        }
        cVarBeginStructure.endStructure(getDescriptor());
        return j(objA);
    }

    public abstract void g(c8.c cVar, Object obj, int i, int i6);

    public abstract void h(c8.c cVar, int i, Object obj);

    public abstract Object i(Object obj);

    public abstract Object j(Object obj);
}
