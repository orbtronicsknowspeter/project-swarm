package j5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.core.content.ContextCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f6708a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f6709b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f6710c = new ArrayList();

    public static Spanned a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned spannedFromHtml = Html.fromHtml(str, 0);
            spannedFromHtml.getClass();
            return spannedFromHtml;
        }
        Spanned spannedFromHtml2 = Html.fromHtml(str);
        spannedFromHtml2.getClass();
        return spannedFromHtml2;
    }

    public static Drawable b(Context context, String str) {
        Drawable drawableLoadIcon;
        context.getClass();
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = f6708a;
            drawableLoadIcon = (Drawable) concurrentHashMap.get(str);
            if (drawableLoadIcon == null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    packageManager.getClass();
                    ApplicationInfo applicationInfo = n4.i.e(packageManager, str, 0).applicationInfo;
                    if (applicationInfo != null) {
                        drawableLoadIcon = applicationInfo.loadIcon(context.getPackageManager());
                        concurrentHashMap.put(str, drawableLoadIcon);
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            drawableLoadIcon = null;
        }
        return drawableLoadIcon == null ? ContextCompat.getDrawable(context, 2131231475) : drawableLoadIcon;
    }
}
