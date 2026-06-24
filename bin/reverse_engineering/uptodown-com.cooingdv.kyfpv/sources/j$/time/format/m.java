package j$.time.format;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f5844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f5847d;

    public m(j$.time.temporal.q qVar, v vVar, b bVar) {
        this.f5844a = qVar;
        this.f5845b = vVar;
        this.f5846c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean e(p pVar, StringBuilder sb) {
        String strA;
        Long lA = pVar.a(this.f5844a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) pVar.f5857a.k(j$.time.temporal.r.f5918b);
        if (lVar == null || lVar == j$.time.chrono.s.f5798c) {
            b bVar = this.f5846c;
            long jLongValue = lA.longValue();
            v vVar = this.f5845b;
            Locale locale = pVar.f5858b.f5821b;
            strA = bVar.f5826a.a(jLongValue, vVar);
        } else {
            b bVar2 = this.f5846c;
            long jLongValue2 = lA.longValue();
            v vVar2 = this.f5845b;
            Locale locale2 = pVar.f5858b.f5821b;
            strA = bVar2.f5826a.a(jLongValue2, vVar2);
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.f5847d == null) {
            this.f5847d = new i(this.f5844a, 1, 19, u.NORMAL);
        }
        return this.f5847d.e(pVar, sb);
    }

    public final String toString() {
        v vVar = v.FULL;
        v vVar2 = this.f5845b;
        j$.time.temporal.q qVar = this.f5844a;
        if (vVar2 == vVar) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + vVar2 + ")";
    }
}
