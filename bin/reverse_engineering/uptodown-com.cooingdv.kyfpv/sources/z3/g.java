package z3;

import a4.x;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import v3.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements v3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f11948b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11949c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11950d = new LinkedHashSet();

    public g(f fVar, j jVar) {
        this.f11947a = fVar;
    }

    public final boolean a(w3.a aVar) {
        boolean zAdd;
        aVar.getClass();
        synchronized (this.f11949c) {
            zAdd = this.f11950d.add(aVar);
        }
        return zAdd;
    }

    public final void b(String str, float f) {
        str.getClass();
        c(this.f11947a, "cueVideo", str, Float.valueOf(f));
    }

    public final void c(f fVar, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj instanceof String ? x.m(new StringBuilder("'"), (String) obj, '\'') : obj.toString());
        }
        this.f11948b.post(new androidx.work.impl.c(fVar, str, arrayList, 5));
    }

    public final void d(String str, float f) {
        str.getClass();
        c(this.f11947a, "loadVideo", str, Float.valueOf(f));
    }

    public final void e() {
        c(this.f11947a, "pauseVideo", new Object[0]);
    }

    public final void f() {
        c(this.f11947a, "playVideo", new Object[0]);
    }
}
