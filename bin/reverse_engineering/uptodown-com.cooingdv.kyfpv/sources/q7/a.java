package q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8731b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f8732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a[] f8733m;

    static {
        a aVar = new a("SUSPEND", 0);
        f8730a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f8731b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f8732l = aVar3;
        f8733m = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8733m.clone();
    }
}
