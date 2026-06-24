package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6401a;

    static {
        int[] iArr = new int[a7.values().length];
        f6401a = iArr;
        try {
            iArr[a7.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6401a[a7.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6401a[a7.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6401a[a7.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
