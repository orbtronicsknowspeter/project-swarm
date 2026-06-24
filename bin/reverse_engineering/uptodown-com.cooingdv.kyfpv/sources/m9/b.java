package m9;

import android.net.ConnectivityManager;
import com.inmobi.cmp.ChoiceCmp;
import g5.f;
import g5.g;
import i9.i;
import j9.e;
import j9.h;
import j9.j;
import j9.l;
import j9.n;
import j9.s;
import j9.x;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m implements d7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7844b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f7845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f7846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f7847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f7848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f7849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f7850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f7851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f7852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f7853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f7854u;
    public static final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f7855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f7856x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7857a;

    static {
        int i = 0;
        f7844b = new b(i, 0);
        f7845l = new b(i, 1);
        f7846m = new b(i, 2);
        f7847n = new b(i, 3);
        f7848o = new b(i, 4);
        f7849p = new b(i, 5);
        f7850q = new b(i, 6);
        f7851r = new b(i, 7);
        f7852s = new b(i, 8);
        f7853t = new b(i, 9);
        f7854u = new b(i, 10);
        v = new b(i, 11);
        f7855w = new b(i, 12);
        f7856x = new b(i, 13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i6) {
        super(i);
        this.f7857a = i6;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f7857a) {
            case 0:
                return new e((i9.b) c.f7874w.getValue(), (l9.a) c.v.getValue(), (i) c.f7875x.getValue(), new b5.m(c.b(), c.a()));
            case 1:
                return new h((l9.a) c.v.getValue(), c.f(), ChoiceCmp.INSTANCE.getCallback());
            case 2:
                return new k9.a();
            case 3:
                return new j9.i((i9.b) c.f7874w.getValue(), (i) c.f7875x.getValue(), new k9.b());
            case 4:
                return new j((l9.a) c.v.getValue(), ChoiceCmp.INSTANCE.getCallback());
            case 5:
                return new l(c.a(), (i9.b) c.f7874w.getValue(), (l9.a) c.v.getValue(), (i) c.f7875x.getValue(), new k9.c(0));
            case 6:
                return new n((i9.b) c.f7874w.getValue(), (l9.a) c.v.getValue(), (i) c.f7875x.getValue(), new f(5));
            case 7:
                return new s(c.b(), (i9.b) c.f7874w.getValue(), c.a(), (l9.a) c.v.getValue(), (i) c.f7875x.getValue(), new f(c.a(), 7));
            case 8:
                Object systemService = c.b().getSystemService("connectivity");
                if (systemService != null) {
                    return new i9.b((ConnectivityManager) systemService);
                }
                com.google.gson.internal.a.i("null cannot be cast to non-null type android.net.ConnectivityManager");
                return null;
            case 9:
                i9.b bVar = (i9.b) c.f7874w.getValue();
                l9.a aVar = (l9.a) c.v.getValue();
                i iVar = (i) c.f7875x.getValue();
                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                return new x(bVar, aVar, iVar, new f(choiceCmp.getCallback(), 6), choiceCmp.getAppPackageId(), choiceCmp.getPCode());
            case 10:
                return new i();
            case 11:
                return new l9.a(c.b());
            case 12:
                u5.m mVarF = c.f();
                l8.n nVar = c.f;
                i9.b bVar2 = (i9.b) c.f7874w.getValue();
                i iVar2 = (i) c.f7875x.getValue();
                ChoiceCmp choiceCmp2 = ChoiceCmp.INSTANCE;
                return new f9.h(mVarF, nVar, bVar2, iVar2, choiceCmp2.getCallback(), (l9.a) c.v.getValue(), choiceCmp2.getAppPackageId());
            default:
                return new j9.f(c.a(), (i9.b) c.f7874w.getValue(), (l9.a) c.v.getValue(), (i) c.f7875x.getValue(), new g((k9.a) c.j.getValue()));
        }
    }
}
