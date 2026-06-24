package l8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f7185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f7186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f7187d;

    public d(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f7184a = bool;
        this.f7185b = bool2;
        this.f7186c = bool3;
        this.f7187d = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7184a.equals(dVar.f7184a) && this.f7185b.equals(dVar.f7185b) && this.f7186c.equals(dVar.f7186c) && this.f7187d.equals(dVar.f7187d);
    }

    public final int hashCode() {
        return this.f7187d.hashCode() + ((this.f7186c.hashCode() + ((this.f7185b.hashCode() + (this.f7184a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Features(visitEvents=" + this.f7184a + ", advancedCustomizations=" + this.f7185b + ", consentOrPay=" + this.f7186c + ", themeCustomizations=" + this.f7187d + ')';
    }
}
