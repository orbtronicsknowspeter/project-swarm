package v1;

import a4.x;
import android.util.Log;
import b2.k1;
import java.util.concurrent.atomic.AtomicReference;
import s1.p;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10789c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10791b = new AtomicReference(null);

    public b(p pVar) {
        this.f10790a = pVar;
        pVar.a(new androidx.core.view.inputmethod.a(this, 29));
    }

    public final c a() {
        b bVar = (b) this.f10791b.get();
        return bVar == null ? f10789c : bVar.a();
    }

    public final boolean b() {
        b bVar = (b) this.f10791b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c() {
        b bVar = (b) this.f10791b.get();
        return bVar != null && bVar.c();
    }

    public final void d(String str, long j, k1 k1Var) {
        String strJ = x.j("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strJ, null);
        }
        this.f10790a.a(new a(str, j, k1Var));
    }
}
