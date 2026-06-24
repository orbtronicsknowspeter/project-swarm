package y8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9.b f11814a = new b9.b();

    @Override // d9.a
    public final b9.a d() {
        return this.f11814a;
    }

    @Override // d9.a
    public final a g(h hVar) {
        char cCharAt;
        int i = hVar.f11837e;
        CharSequence charSequence = hVar.f11833a;
        if (hVar.g >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i6 = hVar.f11835c + hVar.g;
        int i10 = i6 + 1;
        CharSequence charSequence2 = hVar.f11833a;
        int i11 = i + 1;
        if (i11 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i11)) == '\t' || cCharAt == ' ')) {
            i10 = i6 + 2;
        }
        return new a(-1, i10, false);
    }
}
