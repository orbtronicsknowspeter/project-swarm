package j$.time.format;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5837d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f5838e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5841c;

    static {
        new j("+HH:MM:ss", "0");
    }

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        for (int i = 0; i < 22; i++) {
            if (f5837d[i].equals(str)) {
                this.f5840b = i;
                this.f5841c = i % 11;
                this.f5839a = str2;
                return;
            }
        }
        j$.time.g.c("Invalid zone offset pattern: ".concat(str));
        throw null;
    }

    @Override // j$.time.format.f
    public final boolean e(p pVar, StringBuilder sb) {
        Long lA = pVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z9 = false;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int i = (int) jLongValue;
        if (jLongValue != i) {
            throw new ArithmeticException();
        }
        String str = this.f5839a;
        if (i == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((i / 3600) % 100);
        int iAbs2 = Math.abs((i / 60) % 60);
        int iAbs3 = Math.abs(i % 60);
        int length = sb.length();
        sb.append(i < 0 ? "-" : "+");
        if (this.f5840b >= 11 && iAbs < 10) {
            sb.append((char) (iAbs + 48));
        } else {
            a(false, iAbs, sb);
        }
        int i6 = this.f5841c;
        if ((i6 >= 3 && i6 <= 8) || ((i6 >= 9 && iAbs3 > 0) || (i6 >= 1 && iAbs2 > 0))) {
            a(i6 > 0 && i6 % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i6 == 7 || i6 == 8 || (i6 >= 5 && iAbs3 > 0)) {
                if (i6 > 0 && i6 % 2 == 0) {
                    z9 = true;
                }
                a(z9, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public static void a(boolean z9, int i, StringBuilder sb) {
        sb.append(z9 ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f5839a.replace("'", "''");
        return "Offset(" + f5837d[this.f5840b] + ",'" + strReplace + "')";
    }
}
