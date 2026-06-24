package l8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f7190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f7191d;

    public e(f fVar, f fVar2, f fVar3, f fVar4) {
        this.f7188a = fVar;
        this.f7189b = fVar2;
        this.f7190c = fVar3;
        this.f7191d = fVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.f7188a, eVar.f7188a) && kotlin.jvm.internal.l.a(this.f7189b, eVar.f7189b) && kotlin.jvm.internal.l.a(this.f7190c, eVar.f7190c) && kotlin.jvm.internal.l.a(this.f7191d, eVar.f7191d);
    }

    public final int hashCode() {
        f fVar = this.f7188a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.f7189b;
        int iHashCode2 = (iHashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.f7190c;
        int iHashCode3 = (iHashCode2 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        f fVar4 = this.f7191d;
        return iHashCode3 + (fVar4 != null ? fVar4.hashCode() : 0);
    }

    public final String toString() {
        return "FontConfig(title=" + this.f7188a + ", subtitle=" + this.f7189b + ", body=" + this.f7190c + ", button=" + this.f7191d + ')';
    }
}
