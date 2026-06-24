package e1;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s1 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f4244a;

    public /* synthetic */ s1(t1 t1Var) {
        this.f4244a = t1Var;
    }

    public void a(Bundle bundle, String str) {
        String string;
        t1 t1Var = this.f4244a;
        q1 q1Var = t1Var.f4265p;
        g1 g1Var = t1Var.f4263n;
        t1.m(q1Var);
        q1Var.g();
        if (t1Var.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        t1.k(g1Var);
        g1Var.F.o(string);
        e1 e1Var = g1Var.G;
        t1Var.f4269t.getClass();
        e1Var.b(System.currentTimeMillis());
    }

    public boolean b() {
        if (!d()) {
            return false;
        }
        t1 t1Var = this.f4244a;
        t1Var.f4269t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        g1 g1Var = t1Var.f4263n;
        t1.k(g1Var);
        return jCurrentTimeMillis - g1Var.G.a() > t1Var.f4262m.n(null, f0.f3936k0);
    }

    @Override // e1.d3, e1.y0
    public /* synthetic */ void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.f4244a.i(i, th, bArr);
    }

    public boolean d() {
        g1 g1Var = this.f4244a.f4263n;
        t1.k(g1Var);
        return g1Var.G.a() > 0;
    }
}
