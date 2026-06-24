package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11015b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f11016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c[] f11017m;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f11014a = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f11015b = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f11016l = cVar3;
        f11017m = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11017m.clone();
    }
}
