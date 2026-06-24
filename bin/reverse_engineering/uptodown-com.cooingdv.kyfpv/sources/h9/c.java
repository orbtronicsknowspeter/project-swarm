package h9;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f5494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f5495b;

    public c(Typeface typeface, Typeface typeface2) {
        this.f5494a = typeface;
        this.f5495b = typeface2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f5494a, cVar.f5494a) && kotlin.jvm.internal.l.a(this.f5495b, cVar.f5495b);
    }

    public final int hashCode() {
        Typeface typeface = this.f5494a;
        int iHashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.f5495b;
        return iHashCode + (typeface2 != null ? typeface2.hashCode() : 0);
    }

    public final String toString() {
        return "ChoiceFonts(bold=" + this.f5494a + ", regular=" + this.f5495b + ')';
    }
}
