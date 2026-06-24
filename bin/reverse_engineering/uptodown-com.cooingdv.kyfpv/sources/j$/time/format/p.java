package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.n f5857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f5858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5859c;

    public p(j$.time.temporal.n nVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVar = dateTimeFormatter.f5823d;
        if (lVar != null) {
            j$.time.chrono.l lVar2 = (j$.time.chrono.l) nVar.k(j$.time.temporal.r.f5918b);
            ZoneId zoneId = (ZoneId) nVar.k(j$.time.temporal.r.f5917a);
            j$.time.chrono.b bVarO = null;
            lVar = Objects.equals(lVar, lVar2) ? null : lVar;
            Objects.equals(null, zoneId);
            if (lVar != null) {
                j$.time.chrono.l lVar3 = lVar != null ? lVar : lVar2;
                if (lVar != null) {
                    if (nVar.c(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarO = lVar3.o(nVar);
                    } else if (lVar != j$.time.chrono.s.f5798c || lVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && nVar.c(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + lVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + nVar);
                            }
                        }
                    }
                }
                nVar = new o(bVarO, nVar, lVar3, zoneId);
            }
        }
        this.f5857a = nVar;
        this.f5858b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i = this.f5859c;
        j$.time.temporal.n nVar = this.f5857a;
        if (i <= 0 || nVar.c(qVar)) {
            return Long.valueOf(nVar.q(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f5857a.toString();
    }
}
