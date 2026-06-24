package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.q qVar, int i, int i6, boolean z9, int i10) {
        super(qVar, i, i6, u.NOT_NEGATIVE, i10);
        this.g = z9;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.f5836e == -1) {
            return this;
        }
        return new g(this.f5832a, this.f5833b, this.f5834c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i) {
        return new g(this.f5832a, this.f5833b, this.f5834c, this.g, this.f5836e + i);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean e(p pVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.f5832a;
        Long lA = pVar.a(qVar);
        if (lA == null) {
            return false;
        }
        s sVar = pVar.f5858b.f5822c;
        long jLongValue = lA.longValue();
        j$.time.temporal.u uVarRange = qVar.range();
        uVarRange.b(jLongValue, qVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarRange.f5922a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(uVarRange.f5925d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z9 = this.g;
        int i = this.f5833b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f5834c), roundingMode).toPlainString().substring(2);
            sVar.getClass();
            if (z9) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z9) {
                sVar.getClass();
                sb.append('.');
            }
            for (int i6 = 0; i6 < i; i6++) {
                sVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f5832a + "," + this.f5833b + "," + this.f5834c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
