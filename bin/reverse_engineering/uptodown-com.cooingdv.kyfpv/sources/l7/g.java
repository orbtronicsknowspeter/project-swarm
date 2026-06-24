package l7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7168b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7171n;

    public g(String str) {
        this.f7167a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i6;
        int i10 = this.f7168b;
        if (i10 != 0) {
            return i10 == 1;
        }
        if (this.f7171n < 0) {
            this.f7168b = 2;
            return false;
        }
        String str = this.f7167a;
        int length = str.length();
        int length2 = str.length();
        for (int i11 = this.f7169l; i11 < length2; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i6 = i11 + 1) < str.length() && str.charAt(i6) == '\n') ? 2 : 1;
                length = i11;
                this.f7168b = 1;
                this.f7171n = i;
                this.f7170m = length;
                return true;
            }
        }
        i = -1;
        this.f7168b = 1;
        this.f7171n = i;
        this.f7170m = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            com.google.gson.internal.a.l();
            return null;
        }
        this.f7168b = 0;
        int i = this.f7170m;
        int i6 = this.f7169l;
        this.f7169l = this.f7171n + i;
        return this.f7167a.subSequence(i6, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
