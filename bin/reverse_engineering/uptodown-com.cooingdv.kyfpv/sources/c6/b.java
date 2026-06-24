package c6;

import a4.x;
import f0.i;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2418a;

    public b(String str) {
        this.f2418a = str;
    }

    public final Object a(i iVar) {
        Object obj = ((HashMap) iVar.f4812b).get(this);
        if (obj != null) {
            return obj;
        }
        com.google.gson.internal.a.i(this.f2418a);
        return null;
    }

    public final void b(i iVar, Object obj) {
        HashMap map = (HashMap) iVar.f4812b;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f2418a.equals(((b) obj).f2418a);
    }

    public final int hashCode() {
        return this.f2418a.hashCode();
    }

    public final String toString() {
        return x.n(new StringBuilder("Prop{name='"), this.f2418a, "'}");
    }
}
