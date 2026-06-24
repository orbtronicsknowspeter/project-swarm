package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class l implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f6003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile l f6004d;

    public l(int i, Object obj, Object obj2) {
        this.f6001a = i;
        this.f6002b = obj;
        this.f6003c = obj2;
    }

    public l(int i, Object obj, Object obj2, l lVar) {
        this(i, obj, obj2);
        this.f6004d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6002b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6003c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f6002b.hashCode() ^ this.f6003c.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.D(this.f6002b, this.f6003c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f6002b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f6003c;
        return value == obj3 || value.equals(obj3);
    }

    public l a(int i, Object obj) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.f6001a == i && ((obj2 = lVar.f6002b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f6004d;
        } while (lVar != null);
        return null;
    }
}
