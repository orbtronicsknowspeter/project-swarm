package h0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f5444d = new s(true, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f5447c;

    public s(boolean z9, String str, Exception exc) {
        this.f5445a = z9;
        this.f5446b = str;
        this.f5447c = exc;
    }

    public static s b(String str) {
        return new s(false, str, null);
    }

    public static s c(String str, Exception exc) {
        return new s(false, str, exc);
    }

    public String a() {
        return this.f5446b;
    }
}
