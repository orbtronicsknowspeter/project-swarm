package l8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7183b;

    public /* synthetic */ c() {
        this(new ArrayList(), new a(false, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f7182a, cVar.f7182a) && kotlin.jvm.internal.l.a(this.f7183b, cVar.f7183b);
    }

    public final int hashCode() {
        return this.f7183b.hashCode() + (this.f7182a.hashCode() * 31);
    }

    public final String toString() {
        return "ConsentOrPayConfig(countries=" + this.f7182a + ", actionButtonSettings=" + this.f7183b + ')';
    }

    public c(ArrayList arrayList, a aVar) {
        this.f7182a = arrayList;
        this.f7183b = aVar;
    }
}
