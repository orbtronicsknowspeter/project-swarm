package m9;

import android.app.Application;
import android.support.v4.media.g;
import androidx.core.os.ConfigurationCompat;
import com.inmobi.cmp.data.model.ChoiceStyle;
import h9.d;
import j9.u;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.l;
import l8.n;
import u5.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f7858a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h9.c f7860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f7861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static m f7862e;
    public static n f;
    public static k6.c g;
    public static j8.a h;
    public static l3.a i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static g f7863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static u f7864l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ChoiceStyle f7859b = new ChoiceStyle();
    public static final p6.m j = new p6.m(b.f7846m);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p6.m f7865m = new p6.m(b.f7851r);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p6.m f7866n = new p6.m(b.f7845l);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p6.m f7867o = new p6.m(b.f7844b);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p6.m f7868p = new p6.m(b.f7848o);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p6.m f7869q = new p6.m(b.f7853t);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p6.m f7870r = new p6.m(b.f7856x);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p6.m f7871s = new p6.m(b.f7850q);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p6.m f7872t = new p6.m(b.f7849p);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p6.m f7873u = new p6.m(b.f7847n);
    public static final p6.m v = new p6.m(b.v);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p6.m f7874w = new p6.m(b.f7852s);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p6.m f7875x = new p6.m(b.f7854u);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p6.m f7876y = new p6.m(b.f7855w);

    public static Locale a() {
        if (f7858a == null) {
            Locale locale = Locale.US;
            locale.getClass();
            return locale;
        }
        Locale locale2 = ConfigurationCompat.getLocales(b().getResources().getConfiguration()).get(0);
        if (locale2 == null) {
            locale2 = Locale.US;
        }
        locale2.getClass();
        return locale2;
    }

    public static Application b() {
        Application application = f7858a;
        if (application != null) {
            return application;
        }
        l.i("application");
        throw null;
    }

    public static l3.a c() {
        l3.a aVar = i;
        if (aVar != null) {
            return aVar;
        }
        l3.a aVar2 = new l3.a();
        aVar2.f7092a = new HashMap();
        aVar2.f7094c = false;
        aVar2.f7095d = true;
        i = aVar2;
        return aVar2;
    }

    public static j8.a d() {
        j8.a aVar = h;
        return aVar == null ? new j8.a(15, null, null) : aVar;
    }

    public static n e() {
        n nVar = f;
        return nVar == null ? new n(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 4194303) : nVar;
    }

    public static m f() {
        m mVar = f7862e;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        f7862e = mVar2;
        return mVar2;
    }
}
