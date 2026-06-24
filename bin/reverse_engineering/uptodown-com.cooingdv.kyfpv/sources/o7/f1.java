package o7;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient m1 f8261a;

    public f1(String str, Throwable th, m1 m1Var) {
        super(str);
        this.f8261a = m1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.l.a(f1Var.getMessage(), getMessage()) && kotlin.jvm.internal.l.a(f1Var.f8261a, this.f8261a) && kotlin.jvm.internal.l.a(f1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (this.f8261a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8261a;
    }
}
