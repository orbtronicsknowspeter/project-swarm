package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f3580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f3581b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f3582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k[] f3583m;

    static {
        k kVar = new k("TODAY", 0);
        f3580a = kVar;
        k kVar2 = new k("WEEK", 1);
        f3581b = kVar2;
        k kVar3 = new k("MONTHLY", 2);
        f3582l = kVar3;
        f3583m = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f3583m.clone();
    }
}
