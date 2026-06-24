package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v6 extends c implements Iterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6401e;
    public Object[] f;

    public abstract Object newArray(int i);

    public abstract void p(Object obj, int i, int i6, Object obj2);

    public abstract int q(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract Object[] t();

    public v6(int i) {
        super(i);
        this.f6401e = newArray(1 << this.f6151a);
    }

    public v6() {
        this.f6401e = newArray(16);
    }

    public final void s(long j) {
        long jQ;
        int i = this.f6153c;
        if (i == 0) {
            jQ = q(this.f6401e);
        } else {
            jQ = ((long) q(this.f[i])) + this.f6154d[i];
        }
        if (j > jQ) {
            if (this.f == null) {
                Object[] objArrT = t();
                this.f = objArrT;
                this.f6154d = new long[8];
                objArrT[0] = this.f6401e;
            }
            int i6 = this.f6153c + 1;
            while (j > jQ) {
                Object[] objArr = this.f;
                if (i6 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.f6154d = Arrays.copyOf(this.f6154d, length);
                }
                int iMin = this.f6151a;
                if (i6 != 0 && i6 != 1) {
                    iMin = Math.min((iMin + i6) - 1, 30);
                }
                int i10 = 1 << iMin;
                this.f[i6] = newArray(i10);
                long[] jArr = this.f6154d;
                int i11 = i6 - 1;
                jArr[i6] = jArr[i11] + ((long) q(this.f[i11]));
                jQ += (long) i10;
                i6++;
            }
        }
    }

    public final int r(long j) {
        if (this.f6153c == 0) {
            if (j < this.f6152b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.f6153c; i++) {
            if (j < this.f6154d[i] + ((long) q(this.f[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public void f(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > q(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f6153c == 0) {
            System.arraycopy(this.f6401e, 0, obj, i, this.f6152b);
            return;
        }
        for (int i6 = 0; i6 < this.f6153c; i6++) {
            Object obj2 = this.f[i6];
            System.arraycopy(obj2, 0, obj, i, q(obj2));
            i += q(this.f[i6]);
        }
        int i10 = this.f6152b;
        if (i10 > 0) {
            System.arraycopy(this.f6401e, 0, obj, i, i10);
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) jCount);
        f(0, objNewArray);
        return objNewArray;
    }

    public final void u() {
        long jQ;
        if (this.f6152b == q(this.f6401e)) {
            if (this.f == null) {
                Object[] objArrT = t();
                this.f = objArrT;
                this.f6154d = new long[8];
                objArrT[0] = this.f6401e;
            }
            int i = this.f6153c;
            int i6 = i + 1;
            Object[] objArr = this.f;
            if (i6 >= objArr.length || objArr[i6] == null) {
                if (i == 0) {
                    jQ = q(this.f6401e);
                } else {
                    jQ = ((long) q(objArr[i])) + this.f6154d[i];
                }
                s(jQ + 1);
            }
            this.f6152b = 0;
            int i10 = this.f6153c + 1;
            this.f6153c = i10;
            this.f6401e = this.f[i10];
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.f6401e = objArr[0];
            this.f = null;
            this.f6154d = null;
        }
        this.f6152b = 0;
        this.f6153c = 0;
    }

    public void g(Object obj) {
        for (int i = 0; i < this.f6153c; i++) {
            Object obj2 = this.f[i];
            p(obj2, 0, q(obj2), obj);
        }
        p(this.f6401e, 0, this.f6152b, obj);
    }
}
