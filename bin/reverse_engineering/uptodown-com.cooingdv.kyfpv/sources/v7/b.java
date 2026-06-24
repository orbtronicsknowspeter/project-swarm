package v7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10869b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f10870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f10871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f10872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b[] f10873o;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f10868a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f10869b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f10870l = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f10871m = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f10872n = bVar5;
        f10873o = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10873o.clone();
    }
}
