package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Iterator, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7015b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7016l;

    public b(Object[] objArr) {
        this.f7014a = 0;
        objArr.getClass();
        this.f7016l = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7014a) {
            case 0:
                return this.f7015b < ((Object[]) this.f7016l).length;
            case 1:
                return this.f7015b < ((byte[]) this.f7016l).length;
            case 2:
                return this.f7015b < ((int[]) this.f7016l).length;
            case 3:
                return this.f7015b < ((long[]) this.f7016l).length;
            case 4:
                return this.f7015b < ((short[]) this.f7016l).length;
            case 5:
                return this.f7015b < ((q6.e) this.f7016l).size();
            default:
                return ((Iterator) this.f7016l).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7014a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f7016l;
                    int i = this.f7015b;
                    this.f7015b = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f7015b--;
                    androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                    return null;
                }
            case 1:
                int i6 = this.f7015b;
                byte[] bArr = (byte[]) this.f7016l;
                if (i6 < bArr.length) {
                    this.f7015b = i6 + 1;
                    return new p6.o(bArr[i6]);
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.s(String.valueOf(i6));
                return null;
            case 2:
                int i10 = this.f7015b;
                int[] iArr = (int[]) this.f7016l;
                if (i10 < iArr.length) {
                    this.f7015b = i10 + 1;
                    return new p6.q(iArr[i10]);
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.s(String.valueOf(i10));
                return null;
            case 3:
                int i11 = this.f7015b;
                long[] jArr = (long[]) this.f7016l;
                if (i11 < jArr.length) {
                    this.f7015b = i11 + 1;
                    return new p6.s(jArr[i11]);
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.s(String.valueOf(i11));
                return null;
            case 4:
                int i12 = this.f7015b;
                short[] sArr = (short[]) this.f7016l;
                if (i12 < sArr.length) {
                    this.f7015b = i12 + 1;
                    return new p6.v(sArr[i12]);
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.s(String.valueOf(i12));
                return null;
            case 5:
                if (!hasNext()) {
                    com.google.gson.internal.a.l();
                    return null;
                }
                q6.e eVar = (q6.e) this.f7016l;
                int i13 = this.f7015b;
                this.f7015b = i13 + 1;
                return eVar.get(i13);
            default:
                int i14 = this.f7015b;
                this.f7015b = i14 + 1;
                if (i14 >= 0) {
                    return new q6.w(i14, ((Iterator) this.f7016l).next());
                }
                q6.m.h0();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7014a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f7014a = i;
        this.f7016l = obj;
    }

    public b(Iterator it) {
        this.f7014a = 6;
        it.getClass();
        this.f7016l = it;
    }
}
