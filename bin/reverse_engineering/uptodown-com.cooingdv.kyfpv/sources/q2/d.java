package q2;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import b2.t1;
import j1.p;
import java.util.Set;
import java.util.concurrent.Executor;
import s1.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements f, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2.b f8651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f8652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f8653e;

    public d(Context context, String str, Set set, s2.b bVar, Executor executor) {
        this.f8649a = new m(new n1.b(context, str));
        this.f8652d = set;
        this.f8653e = executor;
        this.f8651c = bVar;
        this.f8650b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        i iVar = (i) this.f8649a.get();
        if (!iVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        iVar.g();
        return 3;
    }

    public final p b() {
        if (!UserManagerCompat.isUserUnlocked(this.f8650b)) {
            return t1.x("");
        }
        return t1.q(this.f8653e, new c(this, 0));
    }

    public final void c() {
        if (this.f8652d.size() <= 0) {
            t1.x(null);
        } else if (!UserManagerCompat.isUserUnlocked(this.f8650b)) {
            t1.x(null);
        } else {
            t1.q(this.f8653e, new c(this, 1));
        }
    }
}
