package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f6464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6465e;
    public int f;

    public t1(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.f6461a = "";
        this.f6462b = charSequence.toString();
        this.f6463c = "";
    }

    public static int c(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public final String toString() {
        String[] strArr = this.f6464d;
        int i = this.f6465e;
        String str = this.f6461a;
        int length = str.length();
        String str2 = this.f6463c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int iC = c(str, cArr, 0);
        if (i > 0) {
            int iC2 = c(strArr[0], cArr, iC) + iC;
            for (int i6 = 1; i6 < i; i6++) {
                int iC3 = c(this.f6462b, cArr, iC2) + iC2;
                iC2 = c(strArr[i6], cArr, iC3) + iC3;
            }
            iC = iC2;
        }
        c(str2, cArr, iC);
        return new String(cArr);
    }

    public final void a(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f6464d;
        if (strArr == null) {
            this.f6464d = new String[8];
        } else {
            int i = this.f6465e;
            if (i == strArr.length) {
                this.f6464d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f = this.f6462b.length() + this.f;
        }
        this.f = strValueOf.length() + this.f;
        String[] strArr2 = this.f6464d;
        int i6 = this.f6465e;
        this.f6465e = i6 + 1;
        strArr2[i6] = strValueOf;
    }

    public final void b() {
        String[] strArr;
        if (this.f6465e > 1) {
            char[] cArr = new char[this.f];
            int iC = c(this.f6464d[0], cArr, 0);
            int i = 1;
            do {
                int iC2 = c(this.f6462b, cArr, iC) + iC;
                iC = c(this.f6464d[i], cArr, iC2) + iC2;
                strArr = this.f6464d;
                strArr[i] = null;
                i++;
            } while (i < this.f6465e);
            this.f6465e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
