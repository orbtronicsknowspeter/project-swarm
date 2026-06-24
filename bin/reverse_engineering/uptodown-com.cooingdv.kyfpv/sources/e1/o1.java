package e1;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4177b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q1 f4179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, Callable callable, boolean z9) {
        super(callable);
        this.f4179m = q1Var;
        long andIncrement = q1.f4203t.getAndIncrement();
        this.f4176a = andIncrement;
        this.f4178l = "Task exception on worker thread";
        this.f4177b = z9;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            w0 w0Var = q1Var.f3876a.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o1 o1Var = (o1) obj;
        boolean z9 = o1Var.f4177b;
        boolean z10 = this.f4177b;
        if (z10 != z9) {
            return !z10 ? 1 : -1;
        }
        long j = o1Var.f4176a;
        long j6 = this.f4176a;
        if (j6 < j) {
            return -1;
        }
        if (j6 > j) {
            return 1;
        }
        w0 w0Var = this.f4179m.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4341p.c(Long.valueOf(j6), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        w0 w0Var = this.f4179m.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4340o.c(th, this.f4178l);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, Runnable runnable, boolean z9, String str) {
        super(runnable, null);
        this.f4179m = q1Var;
        long andIncrement = q1.f4203t.getAndIncrement();
        this.f4176a = andIncrement;
        this.f4178l = str;
        this.f4177b = z9;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            w0 w0Var = q1Var.f3876a.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.b("Tasks index overflow");
        }
    }
}
