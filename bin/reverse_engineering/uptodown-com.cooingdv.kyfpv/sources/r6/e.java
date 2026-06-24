package r6;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Map.Entry, e7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8930b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8931l;

    public e(f fVar, int i) {
        fVar.getClass();
        this.f8929a = fVar;
        this.f8930b = i;
        this.f8931l = fVar.f8940q;
    }

    public final void a() {
        if (this.f8929a.f8940q != this.f8931l) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f8929a.f8933a[this.f8930b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f8929a.f8934b;
        objArr.getClass();
        return objArr[this.f8930b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f8929a;
        fVar.d();
        Object[] objArr = fVar.f8934b;
        if (objArr == null) {
            int length = fVar.f8933a.length;
            if (length < 0) {
                com.google.gson.internal.a.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            fVar.f8934b = objArr;
        }
        int i = this.f8930b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
