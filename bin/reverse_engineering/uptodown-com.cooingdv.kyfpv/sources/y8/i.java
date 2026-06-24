package y8;

import b2.t1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends d9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9.f f11843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f11845c;

    public i(char c9, int i, int i6) {
        b9.f fVar = new b9.f();
        this.f11843a = fVar;
        this.f11845c = new StringBuilder();
        fVar.f = c9;
        fVar.g = i;
        fVar.h = i6;
    }

    @Override // d9.a
    public final void a(CharSequence charSequence) {
        if (this.f11844b == null) {
            this.f11844b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f11845c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // d9.a
    public final void c() {
        String strA = a9.a.a(this.f11844b.trim());
        b9.f fVar = this.f11843a;
        fVar.i = strA;
        fVar.j = this.f11845c.toString();
    }

    @Override // d9.a
    public final b9.a d() {
        return this.f11843a;
    }

    @Override // d9.a
    public final a g(h hVar) {
        int i = hVar.f11837e;
        int i6 = hVar.f11834b;
        CharSequence charSequence = hVar.f11833a;
        int i10 = hVar.g;
        b9.f fVar = this.f11843a;
        if (i10 < 4) {
            char c9 = fVar.f;
            int i11 = fVar.g;
            int iM = t1.M(c9, i, charSequence.length(), charSequence) - i;
            if (iM >= i11 && t1.N(charSequence, i + iM, charSequence.length()) == charSequence.length()) {
                return new a(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i12 = fVar.h; i12 > 0 && i6 < length && charSequence.charAt(i6) == ' '; i12--) {
            i6++;
        }
        return a.a(i6);
    }
}
