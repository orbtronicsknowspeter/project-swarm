package j$.time.temporal;

import androidx.core.location.LocationRequestCompat;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j$.time.format.a f5917a = new j$.time.format.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j$.time.format.a f5918b = new j$.time.format.a(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.format.a f5919c = new j$.time.format.a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.format.a f5920d = new j$.time.format.a(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.format.a f5921e = new j$.time.format.a(5);
    public static final j$.time.format.a f = new j$.time.format.a(6);
    public static final j$.time.format.a g = new j$.time.format.a(7);

    public static u d(n nVar, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.f(nVar);
        }
        if (nVar.c(qVar)) {
            return ((a) qVar).f5899b;
        }
        throw new t(j$.time.c.a("Unsupported field: ", qVar));
    }

    public static int a(n nVar, q qVar) {
        u uVarG = nVar.g(qVar);
        if (uVarG.f5922a < -2147483648L || uVarG.f5925d > 2147483647L) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jQ = nVar.q(qVar);
        if (uVarG.d(jQ)) {
            return (int) jQ;
        }
        throw new j$.time.b("Invalid value for " + qVar + " (valid values " + uVarG + "): " + jQ);
    }

    public static Object c(n nVar, j$.time.format.a aVar) {
        if (aVar == f5917a || aVar == f5918b || aVar == f5919c) {
            return null;
        }
        return aVar.a(nVar);
    }

    public static m b(m mVar, long j, s sVar) {
        long j6;
        if (j == Long.MIN_VALUE) {
            mVar = mVar.b(LocationRequestCompat.PASSIVE_INTERVAL, sVar);
            j6 = 1;
        } else {
            j6 = -j;
        }
        return mVar.b(j6, sVar);
    }
}
