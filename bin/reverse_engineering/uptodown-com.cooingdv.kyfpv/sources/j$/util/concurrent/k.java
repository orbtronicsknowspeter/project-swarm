package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f6000c;

    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f5998a = obj;
        this.f5999b = obj2;
        this.f6000c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5998a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5999b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5998a.hashCode() ^ this.f5999b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.D(this.f5998a, this.f5999b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f5998a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f5999b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f5999b;
        this.f5999b = obj;
        this.f6000c.put(this.f5998a, obj);
        return obj2;
    }
}
