package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10827b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f10828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f10829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f10830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f10831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c[] f10832p;

    static {
        c cVar = new c("UNKNOWN", 0);
        f10826a = cVar;
        c cVar2 = new c("INVALID_PARAMETER_IN_REQUEST", 1);
        f10827b = cVar2;
        c cVar3 = new c("HTML_5_PLAYER", 2);
        f10828l = cVar3;
        c cVar4 = new c("VIDEO_NOT_FOUND", 3);
        f10829m = cVar4;
        c cVar5 = new c("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        f10830n = cVar5;
        c cVar6 = new c("REQUEST_MISSING_HTTP_REFERER", 5);
        f10831o = cVar6;
        f10832p = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10832p.clone();
    }
}
