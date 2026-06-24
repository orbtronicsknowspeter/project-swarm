package j5;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.FragmentActivity;
import com.uptodown.UptodownApp;
import com.uptodown.activities.CustomWebView;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static AlertDialog a(AlertDialog alertDialog, FragmentActivity fragmentActivity) {
        SharedPreferences sharedPreferences;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        boolean z9 = false;
        try {
            sharedPreferences = fragmentActivity.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences.contains("is_in_eea") ? sharedPreferences.getBoolean("is_in_eea", true) : true;
        if (!z10) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences2 = fragmentActivity.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences2.contains("gdpr_tracking_allowed")) {
                z9 = sharedPreferences2.getBoolean("gdpr_tracking_allowed", false);
            }
        } catch (Exception unused2) {
        }
        if (z9) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(fragmentActivity);
        builder.setMessage(fragmentActivity.getString(2131952663));
        builder.setPositiveButton(2131952044, new d4.p(fragmentActivity, 3));
        builder.setNegativeButton(R.string.cancel, new f5.b(12));
        builder.setCancelable(true);
        AlertDialog alertDialogCreate = builder.create();
        if (!fragmentActivity.isFinishing()) {
            alertDialogCreate.show();
        }
        return alertDialogCreate;
    }

    public static void b(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        try {
            if (str.equalsIgnoreCase(str2)) {
                Iterator it = a.a.E(context).iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    File file = (File) next;
                    String name = file.getName();
                    name.getClass();
                    String strC = a.a.C(name);
                    if (strC != null && strC.equalsIgnoreCase(str2)) {
                        String absolutePath = file.getAbsolutePath();
                        if (file.delete()) {
                            g gVarL = g.D.l(context);
                            gVarL.b();
                            absolutePath.getClass();
                            SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
                            sQLiteDatabase.getClass();
                            sQLiteDatabase.delete("deep_link_files", "path=?", new String[]{absolutePath});
                            gVarL.c();
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String c(int i) {
        if (i >= 1000000) {
            double d10 = ((double) i) / 1000000.0d;
            int i6 = (int) d10;
            if (d10 != i6) {
                return l7.u.o0(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1)), ",0", "", false).concat("M");
            }
            return i6 + "M";
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        double d11 = ((double) i) / 1000.0d;
        int i10 = (int) d11;
        if (d11 != i10) {
            return l7.u.o0(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1)), ",0", "", false).concat("K");
        }
        return i10 + "K";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.net.Uri r5) {
        /*
            java.lang.String r0 = r5.toString()
            r0.getClass()
            java.lang.String r1 = "utd://"
            r2 = 0
            boolean r1 = l7.u.p0(r0, r1, r2)
            r3 = 6
            if (r1 == 0) goto L16
            java.lang.String r5 = r0.substring(r3)
            return r5
        L16:
            java.lang.String r1 = r5.toString()
            r1.getClass()
            java.lang.String r4 = "market://"
            boolean r1 = l7.u.p0(r1, r4, r2)
            if (r1 != 0) goto L43
            java.lang.String r1 = r5.toString()
            r1.getClass()
            java.lang.String r4 = "http://play.google.com"
            boolean r1 = l7.u.p0(r1, r4, r2)
            if (r1 != 0) goto L43
            java.lang.String r1 = r5.toString()
            r1.getClass()
            java.lang.String r4 = "https://play.google.com"
            boolean r1 = l7.u.p0(r1, r4, r2)
            if (r1 == 0) goto L6e
        L43:
            java.lang.String r1 = r5.toString()
            r1.getClass()
            java.lang.String r4 = "details?id="
            boolean r1 = l7.m.q0(r1, r4, r2)
            if (r1 == 0) goto L6e
            int r5 = l7.m.y0(r0, r4, r2, r2, r3)
            int r5 = r5 + 11
            java.lang.String r1 = "&"
            boolean r4 = l7.m.q0(r0, r1, r2)
            if (r4 == 0) goto L69
            int r1 = l7.m.y0(r0, r1, r2, r2, r3)
            java.lang.String r5 = r0.substring(r5, r1)
            return r5
        L69:
            java.lang.String r5 = r0.substring(r5)
            return r5
        L6e:
            java.lang.String r5 = r5.toString()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.c.d(android.net.Uri):java.lang.String");
    }

    public static void e(Activity activity, String str, String str2) {
        activity.getClass();
        str.getClass();
        if (l7.m.q0(str, ".uptodown.com/", false)) {
            str = (l7.m.q0(str, "?", false) ? str.concat("&") : str.concat("?")).concat("userAgent=uptodownandroid");
        }
        try {
            new CustomTabsIntent.Builder().build().launchUrl(activity, Uri.parse(str));
        } catch (Exception unused) {
            Intent intent = new Intent(activity, (Class<?>) CustomWebView.class);
            if (str2 != null) {
                intent.putExtra("title", str2);
            }
            intent.putExtra("url", str);
            float f = UptodownApp.I;
            activity.startActivity(intent, b4.d.a(activity));
        }
    }
}
