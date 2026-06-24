package h9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f5608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f5609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f5610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f5611e;

    public /* synthetic */ t() {
        this(new g(), new p(null, null, null, null, null, 1023), new k(), new e((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127), new a((String) null, (String) null, (String) null, (String) null, (List) null, 63));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.l.a(this.f5607a, tVar.f5607a) && kotlin.jvm.internal.l.a(this.f5608b, tVar.f5608b) && kotlin.jvm.internal.l.a(this.f5609c, tVar.f5609c) && kotlin.jvm.internal.l.a(this.f5610d, tVar.f5610d) && kotlin.jvm.internal.l.a(this.f5611e, tVar.f5611e);
    }

    public final int hashCode() {
        return this.f5611e.hashCode() + ((this.f5610d.hashCode() + ((this.f5609c.hashCode() + ((this.f5608b.hashCode() + (this.f5607a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TranslationsText(coreUiLabels=" + this.f5607a + ", premiumUiLabels=" + this.f5608b + ", mobileUiLabels=" + this.f5609c + ", consentOrPay=" + this.f5610d + ", advanced=" + this.f5611e + ')';
    }

    public t(g gVar, p pVar, k kVar, e eVar, a aVar) {
        this.f5607a = gVar;
        this.f5608b = pVar;
        this.f5609c = kVar;
        this.f5610d = eVar;
        this.f5611e = aVar;
    }
}
