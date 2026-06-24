package c3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f1190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f1191b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a1[] f1192l;

    static {
        a1 a1Var = new a1("GENERAL", 0);
        f1190a = a1Var;
        a1 a1Var2 = new a1("FALLBACK", 1);
        f1191b = a1Var2;
        f1192l = new a1[]{a1Var, a1Var2};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f1192l.clone();
    }
}
