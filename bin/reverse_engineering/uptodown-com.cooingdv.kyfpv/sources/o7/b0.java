package o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f8234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f8235b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f8236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b0 f8237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b0[] f8238n;

    static {
        b0 b0Var = new b0("DEFAULT", 0);
        f8234a = b0Var;
        b0 b0Var2 = new b0("LAZY", 1);
        f8235b = b0Var2;
        b0 b0Var3 = new b0("ATOMIC", 2);
        f8236l = b0Var3;
        b0 b0Var4 = new b0("UNDISPATCHED", 3);
        f8237m = b0Var4;
        f8238n = new b0[]{b0Var, b0Var2, b0Var3, b0Var4};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f8238n.clone();
    }
}
