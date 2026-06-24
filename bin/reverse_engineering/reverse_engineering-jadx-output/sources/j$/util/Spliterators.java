package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Spliterators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f5963a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f5964b = new n1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f5965c = new o1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f5966d = new m1();

    public static void a(int i, int i6, int i10) {
        if (i6 <= i10) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException(i6);
            }
            if (i10 > i) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i6 + ") > fence(" + i10 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        return new r1((java.util.Collection) Objects.requireNonNull(collection), i);
    }
}
