package o;

import a4.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8126a;

    public c(String str) {
        if (str != null) {
            this.f8126a = str;
        } else {
            com.google.gson.internal.a.i("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f8126a.equals(((c) obj).f8126a);
    }

    public final int hashCode() {
        return this.f8126a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return x.n(new StringBuilder("Encoding{name=\""), this.f8126a, "\"}");
    }
}
