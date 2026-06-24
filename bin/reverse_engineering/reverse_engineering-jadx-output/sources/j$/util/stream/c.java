package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f6154d;

    public abstract void clear();

    public c() {
        this.f6151a = 4;
    }

    public c(int i) {
        if (i < 0) {
            j$.time.g.i("Illegal Capacity: ", i);
            throw null;
        }
        this.f6151a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final long count() {
        int i = this.f6153c;
        if (i == 0) {
            return this.f6152b;
        }
        return this.f6154d[i] + ((long) this.f6152b);
    }
}
