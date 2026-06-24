package k6;

import java.util.List;
import kotlin.jvm.internal.l;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6985c;

    public /* synthetic */ c() {
        this("", new a(15, null, null), t.f8725a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f6983a, cVar.f6983a) && l.a(this.f6984b, cVar.f6984b) && l.a(this.f6985c, cVar.f6985c);
    }

    public final int hashCode() {
        String str = this.f6983a;
        return this.f6985c.hashCode() + ((this.f6984b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "GBCPurposeResponse(language=" + ((Object) this.f6983a) + ", banner=" + this.f6984b + ", purposes=" + this.f6985c + ')';
    }

    public c(String str, a aVar, List list) {
        this.f6983a = str;
        this.f6984b = aVar;
        this.f6985c = list;
    }
}
