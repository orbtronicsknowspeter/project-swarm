package f8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c0 f4942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c0 f4943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c0 f4944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c0 f4945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c0[] f4946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w6.b f4947q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f4949b;

    static {
        c0 c0Var = new c0("OBJ", 0, '{', '}');
        f4942l = c0Var;
        c0 c0Var2 = new c0("LIST", 1, '[', ']');
        f4943m = c0Var2;
        c0 c0Var3 = new c0("MAP", 2, '{', '}');
        f4944n = c0Var3;
        c0 c0Var4 = new c0("POLY_OBJ", 3, '[', ']');
        f4945o = c0Var4;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4};
        f4946p = c0VarArr;
        f4947q = new w6.b(c0VarArr);
    }

    public c0(String str, int i, char c9, char c10) {
        this.f4948a = c9;
        this.f4949b = c10;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f4946p.clone();
    }
}
