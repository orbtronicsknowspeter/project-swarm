package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4 f4028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h4 f4029b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h4[] f4030l;

    static {
        h4 h4Var = new h4("CONSENT", 0);
        f4028a = h4Var;
        h4 h4Var2 = new h4("LEGITIMATE_INTEREST", 1);
        h4 h4Var3 = new h4("FLEXIBLE_CONSENT", 2);
        h4 h4Var4 = new h4("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f4029b = h4Var4;
        f4030l = new h4[]{h4Var, h4Var2, h4Var3, h4Var4};
    }

    public static h4[] values() {
        return (h4[]) f4030l.clone();
    }
}
