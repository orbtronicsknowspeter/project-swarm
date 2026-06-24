package n5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8083b;

    public e(float f, int i) {
        this.f8082a = f;
        this.f8083b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8082a, eVar.f8082a) == 0 && this.f8083b == eVar.f8083b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f8082a) * 31) + this.f8083b;
    }

    public final String toString() {
        return "ChartData(value=" + this.f8082a + ", color=" + this.f8083b + ")";
    }
}
