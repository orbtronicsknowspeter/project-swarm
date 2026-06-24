package p8;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f8478b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IOException f8479a;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f8478b = declaredMethod;
    }

    public b(IOException iOException) {
        super(iOException);
        this.f8479a = iOException;
    }
}
