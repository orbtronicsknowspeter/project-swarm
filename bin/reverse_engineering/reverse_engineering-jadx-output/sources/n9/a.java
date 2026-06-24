package n9;

import android.graphics.Typeface;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Typeface f8119a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f8120b;

    public a(Float f) {
        this.f8120b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f8119a, aVar.f8119a) && l.a(this.f8120b, aVar.f8120b);
    }

    public final int hashCode() {
        Typeface typeface = this.f8119a;
        int iHashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Float f = this.f8120b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Font(fontTypeface=" + this.f8119a + ", fontSize=" + this.f8120b + ')';
    }
}
