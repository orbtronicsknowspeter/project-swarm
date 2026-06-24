package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f6155d;

    public abstract void clear();

    public c() {
        this.f6152a = 4;
    }

    public c(int i) {
        if (i < 0) {
            j$.time.g.i("Illegal Capacity: ", i);
            throw null;
        }
        this.f6152a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final long count() {
        int i = this.f6154c;
        if (i == 0) {
            return this.f6153b;
        }
        return this.f6155d[i] + ((long) this.f6153b);
    }
}
