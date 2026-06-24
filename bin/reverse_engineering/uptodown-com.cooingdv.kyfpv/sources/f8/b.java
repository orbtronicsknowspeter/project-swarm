package f8;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4936a;

    static {
        Object jVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            jVar = l7.t.h0(property);
        } catch (Throwable th) {
            jVar = new p6.j(th);
        }
        if (jVar instanceof p6.j) {
            jVar = null;
        }
        Integer num = (Integer) jVar;
        f4936a = num != null ? num.intValue() : 2097152;
    }
}
