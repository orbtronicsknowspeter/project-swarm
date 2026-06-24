package androidx.collection.internal;

import d7.a;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(a aVar) {
        T t9;
        aVar.getClass();
        synchronized (this) {
            t9 = (T) aVar.invoke();
        }
        return t9;
    }
}
