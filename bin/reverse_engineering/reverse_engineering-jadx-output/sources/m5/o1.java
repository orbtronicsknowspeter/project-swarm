package m5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f7494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f7495b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o1 f7496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o1 f7497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ o1[] f7498n;

    static {
        o1 o1Var = new o1("IDLE", 0);
        f7494a = o1Var;
        o1 o1Var2 = new o1("SHRINKING", 1);
        f7495b = o1Var2;
        o1 o1Var3 = new o1("SMALL", 2);
        f7496l = o1Var3;
        o1 o1Var4 = new o1("GROWING", 3);
        f7497m = o1Var4;
        f7498n = new o1[]{o1Var, o1Var2, o1Var3, o1Var4};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f7498n.clone();
    }
}
