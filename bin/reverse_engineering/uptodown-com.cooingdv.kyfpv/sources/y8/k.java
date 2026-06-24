package y8;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends d9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f11849e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f11851b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9.i f11850a = new b9.i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11852c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f8.q f11853d = new f8.q(4);

    public k(Pattern pattern) {
        this.f11851b = pattern;
    }

    @Override // d9.a
    public final void a(CharSequence charSequence) {
        f8.q qVar = this.f11853d;
        StringBuilder sb = (StringBuilder) qVar.f4966c;
        if (qVar.f4965b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        qVar.f4965b++;
        Pattern pattern = this.f11851b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f11852c = true;
    }

    @Override // d9.a
    public final void c() {
        Object obj = this.f11853d.f4966c;
        this.f11853d = null;
    }

    @Override // d9.a
    public final b9.a d() {
        return this.f11850a;
    }

    @Override // d9.a
    public final a g(h hVar) {
        if (this.f11852c) {
            return null;
        }
        if (hVar.h && this.f11851b == null) {
            return null;
        }
        return a.a(hVar.f11834b);
    }
}
