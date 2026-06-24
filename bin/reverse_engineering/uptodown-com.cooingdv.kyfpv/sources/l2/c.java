package l2;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7091b;

    public c(String str, Map map) {
        this.f7090a = str;
        this.f7091b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7090a.equals(cVar.f7090a) && this.f7091b.equals(cVar.f7091b);
    }

    public final int hashCode() {
        return this.f7091b.hashCode() + (this.f7090a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f7090a + ", properties=" + this.f7091b.values() + "}";
    }
}
