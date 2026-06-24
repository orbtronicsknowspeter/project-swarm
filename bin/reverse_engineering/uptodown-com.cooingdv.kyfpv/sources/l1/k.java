package l1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient f f7069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient Object[] f7070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f7071o;

    public k(f fVar, Object[] objArr, int i) {
        this.f7069m = fVar;
        this.f7070n = objArr;
        this.f7071o = i;
    }

    @Override // l1.a
    public final int b(Object[] objArr) {
        return g().b(objArr);
    }

    @Override // l1.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7069m.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.g
    public final d l() {
        return new j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final q iterator() {
        return g().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7071o;
    }
}
