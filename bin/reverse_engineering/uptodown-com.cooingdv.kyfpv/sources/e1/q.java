package e1;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4198e;
    public final t f;

    public q(t1 t1Var, String str, String str2, String str3, long j, long j6, Bundle bundle) {
        t tVar;
        k0.y.d(str2);
        k0.y.d(str3);
        this.f4194a = str2;
        this.f4195b = str3;
        this.f4196c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4197d = j;
        this.f4198e = j6;
        if (j6 != 0 && j6 > j) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4343r.c(w0.o(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w0 w0Var2 = t1Var.f4265o;
                    t1.m(w0Var2);
                    w0Var2.f4340o.b("Param name can't be null");
                    it.remove();
                } else {
                    a5 a5Var = t1Var.f4268r;
                    t1.k(a5Var);
                    Object objN = a5Var.n(bundle2.get(next), next);
                    if (objN == null) {
                        w0 w0Var3 = t1Var.f4265o;
                        t1.m(w0Var3);
                        w0Var3.f4343r.c(t1Var.f4269s.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        a5 a5Var2 = t1Var.f4268r;
                        t1.k(a5Var2);
                        a5Var2.v(objN, next, bundle2);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.f = tVar;
    }

    public final q a(t1 t1Var, long j) {
        return new q(t1Var, this.f4196c, this.f4194a, this.f4195b, this.f4197d, j, this.f);
    }

    public final String toString() {
        String string = this.f.toString();
        String str = this.f4194a;
        int length = String.valueOf(str).length();
        String str2 = this.f4195b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        a4.x.B(sb, "Event{appId='", str, "', name='", str2);
        return a4.x.o(sb, "', params=", string, "}");
    }

    public q(t1 t1Var, String str, String str2, String str3, long j, long j6, t tVar) {
        k0.y.d(str2);
        k0.y.d(str3);
        k0.y.g(tVar);
        this.f4194a = str2;
        this.f4195b = str3;
        this.f4196c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4197d = j;
        this.f4198e = j6;
        if (j6 != 0 && j6 > j) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4343r.d(w0.o(str2), "Event created with reverse previous/current timestamps. appId, name", w0.o(str3));
        }
        this.f = tVar;
    }
}
