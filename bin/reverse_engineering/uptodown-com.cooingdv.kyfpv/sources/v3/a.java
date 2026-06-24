package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10808b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f10809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f10810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f10811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f10812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f10813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f10814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a[] f10815r;

    static {
        a aVar = new a("UNKNOWN", 0);
        f10807a = aVar;
        a aVar2 = new a("SMALL", 1);
        f10808b = aVar2;
        a aVar3 = new a("MEDIUM", 2);
        f10809l = aVar3;
        a aVar4 = new a("LARGE", 3);
        f10810m = aVar4;
        a aVar5 = new a("HD720", 4);
        f10811n = aVar5;
        a aVar6 = new a("HD1080", 5);
        f10812o = aVar6;
        a aVar7 = new a("HIGH_RES", 6);
        f10813p = aVar7;
        a aVar8 = new a("DEFAULT", 7);
        f10814q = aVar8;
        f10815r = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10815r.clone();
    }
}
