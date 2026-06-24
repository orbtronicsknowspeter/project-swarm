package o7;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d7.q f8310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f8312e;

    public /* synthetic */ t(Object obj, i iVar, d7.q qVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : qVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static t a(t tVar, i iVar, Throwable th, int i) {
        Object obj = tVar.f8308a;
        if ((i & 2) != 0) {
            iVar = tVar.f8309b;
        }
        i iVar2 = iVar;
        d7.q qVar = tVar.f8310c;
        Object obj2 = tVar.f8311d;
        if ((i & 16) != 0) {
            th = tVar.f8312e;
        }
        return new t(obj, iVar2, qVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.l.a(this.f8308a, tVar.f8308a) && kotlin.jvm.internal.l.a(this.f8309b, tVar.f8309b) && kotlin.jvm.internal.l.a(this.f8310c, tVar.f8310c) && kotlin.jvm.internal.l.a(this.f8311d, tVar.f8311d) && kotlin.jvm.internal.l.a(this.f8312e, tVar.f8312e);
    }

    public final int hashCode() {
        Object obj = this.f8308a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f8309b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        d7.q qVar = this.f8310c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f8311d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8312e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8308a + ", cancelHandler=" + this.f8309b + ", onCancellation=" + this.f8310c + ", idempotentResume=" + this.f8311d + ", cancelCause=" + this.f8312e + ')';
    }

    public t(Object obj, i iVar, d7.q qVar, Object obj2, Throwable th) {
        this.f8308a = obj;
        this.f8309b = iVar;
        this.f8310c = qVar;
        this.f8311d = obj2;
        this.f8312e = th;
    }
}
