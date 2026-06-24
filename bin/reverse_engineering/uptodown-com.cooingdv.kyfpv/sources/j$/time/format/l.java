package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5843a;

    public l(String str) {
        this.f5843a = str;
    }

    @Override // j$.time.format.f
    public final boolean e(p pVar, StringBuilder sb) {
        sb.append(this.f5843a);
        return true;
    }

    public final String toString() {
        return "'" + this.f5843a.replace("'", "''") + "'";
    }
}
