package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f5827a;

    public d(char c9) {
        this.f5827a = c9;
    }

    @Override // j$.time.format.f
    public final boolean e(p pVar, StringBuilder sb) {
        sb.append(this.f5827a);
        return true;
    }

    public final String toString() {
        char c9 = this.f5827a;
        if (c9 == '\'') {
            return "''";
        }
        return "'" + c9 + "'";
    }
}
