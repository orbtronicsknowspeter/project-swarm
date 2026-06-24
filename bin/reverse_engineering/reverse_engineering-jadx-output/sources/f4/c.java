package f4;

import a4.x;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.internal.measurement.z3;
import e1.x2;
import java.io.File;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.d;
import m4.g;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends Application {
    public static boolean A;
    public static String B;
    public static String C;
    public static String D;
    public static String E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Activity f4875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static d f4876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f4877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f4878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f4879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f4880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static z4.d f4881u;
    public static d2.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Typeface f4882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Typeface f4883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static g f4884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static m4.b f4885z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f4886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f4887b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AtomicBoolean f4888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b4.g f4889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f4890n;

    public static void c(File file) {
        file.getClass();
        l4.c cVar = new l4.c();
        cVar.f7103a = file;
        cVar.f7104b = file.getName();
        cVar.f7105c = z3.x(file.getAbsolutePath());
        cVar.f7107e = file.length();
        cVar.f = x.k(Build.MANUFACTURER, " ", Build.MODEL);
        m4.b bVar = f4885z;
        bVar.getClass();
        Socket socket = bVar.f7283d;
        if (socket == null || socket.isClosed()) {
            bVar.f7280a.f1004a.b();
            return;
        }
        android.support.v4.media.g gVar = bVar.f7282c;
        gVar.getClass();
        new Thread(new m4.a(1, gVar, cVar)).start();
    }

    public final void a(Context context) {
        b4.g gVar = this.f4889m;
        context.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        string.getClass();
        if (string.length() > 16) {
            string = string.substring(0, 15);
        }
        int length = string.length();
        int i = 51 - length;
        String str = Build.MANUFACTURER;
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        String strSubstring = str + " " + str2;
        if (strSubstring.length() > i) {
            strSubstring = strSubstring.substring(0, 50 - length);
        }
        f4880t = strSubstring + "_d:_" + string + "_:d__t:_0";
        if (f4884y == null) {
            f4884y = new g(context, gVar);
        }
        f4885z = new m4.b(context, gVar);
    }

    public final void b() {
        NsdManager nsdManager;
        if (this.f4886a.compareAndSet(false, true)) {
            try {
                g gVar = f4884y;
                if (gVar != null && (nsdManager = gVar.f7291b) != null) {
                    nsdManager.unregisterService(this.f4890n);
                }
            } catch (Exception unused) {
            }
            m4.b bVar = f4885z;
            if (bVar != null) {
                bVar.e();
            }
            g gVar2 = f4884y;
            if (gVar2 != null) {
                gVar2.c();
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        AssetManager assets;
        super.onCreate();
        registerActivityLifecycleCallbacks(new x2(this, 1));
        try {
            assets = getAssets();
        } catch (Exception e10) {
            e10.printStackTrace();
            assets = null;
        }
        if (assets != null) {
            f4882w = Typeface.createFromAsset(assets, "fonts/Geomanist-Medium.ttf");
            f4883x = Typeface.createFromAsset(assets, "fonts/Geomanist-Regular.ttf");
        } else {
            Typeface typeface = Typeface.DEFAULT;
            f4882w = typeface;
            f4883x = typeface;
        }
    }
}
