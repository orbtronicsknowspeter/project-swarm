package l7;

import a4.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f7163d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f7166c;

    static {
        d dVar = d.f7160a;
        e eVar = e.f7161b;
        f7163d = new f(false, dVar, eVar);
        new f(true, dVar, eVar);
    }

    public f(boolean z9, d dVar, e eVar) {
        dVar.getClass();
        eVar.getClass();
        this.f7164a = z9;
        this.f7165b = dVar;
        this.f7166c = eVar;
    }

    public final String toString() {
        StringBuilder sbT = x.t("HexFormat(\n    upperCase = ");
        sbT.append(this.f7164a);
        sbT.append(",\n    bytes = BytesHexFormat(\n");
        this.f7165b.a("        ", sbT);
        sbT.append('\n');
        sbT.append("    ),");
        sbT.append('\n');
        sbT.append("    number = NumberHexFormat(");
        sbT.append('\n');
        this.f7166c.a("        ", sbT);
        sbT.append('\n');
        sbT.append("    )");
        sbT.append('\n');
        sbT.append(")");
        return sbT.toString();
    }
}
