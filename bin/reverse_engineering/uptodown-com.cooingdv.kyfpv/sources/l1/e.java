package l1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7057c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f7055a = obj;
        this.f7056b = obj2;
        this.f7057c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f7055a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f7056b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f7057c);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
