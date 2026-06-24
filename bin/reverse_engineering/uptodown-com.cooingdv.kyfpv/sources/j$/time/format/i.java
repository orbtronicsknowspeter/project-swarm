package j$.time.format;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f {
    public static final long[] f = {0, 10, 100, 1000, WorkRequest.MIN_BACKOFF_MILLIS, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f5832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f5835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5836e;

    public i(j$.time.temporal.q qVar, int i, int i6, u uVar) {
        this.f5832a = qVar;
        this.f5833b = i;
        this.f5834c = i6;
        this.f5835d = uVar;
        this.f5836e = 0;
    }

    public i(j$.time.temporal.q qVar, int i, int i6, u uVar, int i10) {
        this.f5832a = qVar;
        this.f5833b = i;
        this.f5834c = i6;
        this.f5835d = uVar;
        this.f5836e = i10;
    }

    public i a() {
        if (this.f5836e == -1) {
            return this;
        }
        return new i(this.f5832a, this.f5833b, this.f5834c, this.f5835d, -1);
    }

    public i b(int i) {
        return new i(this.f5832a, this.f5833b, this.f5834c, this.f5835d, this.f5836e + i);
    }

    @Override // j$.time.format.f
    public boolean e(p pVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.f5832a;
        Long lA = pVar.a(qVar);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        s sVar = pVar.f5858b.f5822c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.f5834c;
        if (length > i) {
            throw new j$.time.b("Field " + qVar + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        sVar.getClass();
        int i6 = this.f5833b;
        u uVar = this.f5835d;
        if (jLongValue >= 0) {
            int i10 = c.f5827a[uVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    sb.append('+');
                }
            } else if (i6 < 19 && jLongValue >= f[i6]) {
                sb.append('+');
            }
        } else {
            int i11 = c.f5827a[uVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                sb.append('-');
            } else if (i11 == 4) {
                throw new j$.time.b("Field " + qVar + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i12 = 0; i12 < i6 - string.length(); i12++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        int i = this.f5834c;
        j$.time.temporal.q qVar = this.f5832a;
        u uVar = this.f5835d;
        int i6 = this.f5833b;
        if (i6 == 1 && i == 19 && uVar == u.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i6 == i && uVar == u.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i6 + ")";
        }
        return "Value(" + qVar + "," + i6 + "," + i + "," + uVar + ")";
    }
}
