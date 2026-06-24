package l8;

import com.inmobi.cmp.data.model.ChoiceColor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChoiceColor f7251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChoiceColor f7252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7253d;

    public p(String str, ChoiceColor choiceColor, ChoiceColor choiceColor2, e eVar) {
        this.f7250a = str;
        this.f7251b = choiceColor;
        this.f7252c = choiceColor2;
        this.f7253d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f7250a.equals(pVar.f7250a) && kotlin.jvm.internal.l.a(this.f7251b, pVar.f7251b) && kotlin.jvm.internal.l.a(this.f7252c, pVar.f7252c) && kotlin.jvm.internal.l.a(this.f7253d, pVar.f7253d);
    }

    public final int hashCode() {
        int iHashCode = this.f7250a.hashCode() * 31;
        ChoiceColor choiceColor = this.f7251b;
        int iHashCode2 = (iHashCode + (choiceColor == null ? 0 : choiceColor.hashCode())) * 31;
        ChoiceColor choiceColor2 = this.f7252c;
        int iHashCode3 = (iHashCode2 + (choiceColor2 == null ? 0 : choiceColor2.hashCode())) * 31;
        e eVar = this.f7253d;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeConfig(themeMode=" + this.f7250a + ", lightModeColors=" + this.f7251b + ", darkModeColors=" + this.f7252c + ", font=" + this.f7253d + ')';
    }
}
