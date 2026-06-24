package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import c4.j1;
import c4.k1;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import e1.c0;
import java.io.File;
import java.lang.Character;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import x4.e1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static long a(ApplicationInfo applicationInfo) {
        File parentFile;
        long jK;
        applicationInfo.getClass();
        long jK2 = 0;
        if (applicationInfo.sourceDir == null || (parentFile = new File(applicationInfo.sourceDir).getParentFile()) == null || !parentFile.isDirectory()) {
            return 0L;
        }
        long jK3 = c0.k(parentFile);
        String str = applicationInfo.packageName;
        str.getClass();
        try {
            jK = c0.k(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + str + "/"));
        } catch (Exception e10) {
            e10.printStackTrace();
            jK = 0;
        }
        long j = jK3 + jK;
        String str2 = applicationInfo.packageName;
        str2.getClass();
        try {
            jK2 = c0.k(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + str2 + "/"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return j + jK2;
    }

    public static String b(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(str).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9 A[EDGE_INSN: B:66:0x00a9->B:53:0x00a9 BREAK  A[LOOP:1: B:24:0x0057->B:31:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(android.content.pm.PackageManager r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.c(android.content.pm.PackageManager, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005d -> B:29:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.pm.PackageManager r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L35
            r2 = 28
            r3 = 0
            if (r1 < r2) goto L48
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r4 = n4.i.e(r4, r5, r1)     // Catch: java.lang.Exception -> L35
            android.content.pm.SigningInfo r4 = r4.signingInfo     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L60
            boolean r5 = r4.hasPastSigningCertificates()     // Catch: java.lang.Exception -> L35
            if (r5 == 0) goto L37
            android.content.pm.Signature[] r5 = r4.getSigningCertificateHistory()     // Catch: java.lang.Exception -> L35
            r5.getClass()     // Catch: java.lang.Exception -> L35
            int r5 = r5.length     // Catch: java.lang.Exception -> L35
            if (r5 != 0) goto L23
            goto L37
        L23:
            android.content.pm.Signature[] r5 = r4.getSigningCertificateHistory()     // Catch: java.lang.Exception -> L35
            int r5 = r5.length     // Catch: java.lang.Exception -> L35
            int r5 = r5 + (-1)
            android.content.pm.Signature[] r4 = r4.getSigningCertificateHistory()     // Catch: java.lang.Exception -> L35
            r4 = r4[r5]     // Catch: java.lang.Exception -> L35
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Exception -> L35
            goto L61
        L35:
            r4 = move-exception
            goto L5d
        L37:
            android.content.pm.Signature[] r4 = r4.getApkContentsSigners()     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L60
            int r5 = r4.length     // Catch: java.lang.Exception -> L35
            if (r5 != 0) goto L41
            goto L60
        L41:
            r4 = r4[r3]     // Catch: java.lang.Exception -> L35
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Exception -> L35
            goto L61
        L48:
            r1 = 64
            android.content.pm.PackageInfo r4 = n4.i.e(r4, r5, r1)     // Catch: java.lang.Exception -> L35
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L60
            int r5 = r4.length     // Catch: java.lang.Exception -> L35
            if (r5 != 0) goto L56
            goto L60
        L56:
            r4 = r4[r3]     // Catch: java.lang.Exception -> L35
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Exception -> L35
            goto L61
        L5d:
            r4.printStackTrace()
        L60:
            r4 = r0
        L61:
            if (r4 == 0) goto L7c
            java.lang.String r5 = "MD5"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L70
            java.lang.String r0 = com.google.android.gms.internal.measurement.z3.D(r4)
            goto L7c
        L70:
            java.lang.String r5 = "SHA256"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L7c
            java.lang.String r0 = com.google.android.gms.internal.measurement.z3.w(r4)
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.d(android.content.pm.PackageManager, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            x4.e eVar = (x4.e) next;
            String str = eVar.B;
            if (str != null) {
                arrayList2.add(str);
                ArrayList arrayList3 = eVar.I;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = eVar.I;
                    arrayList4.getClass();
                    Iterator it2 = arrayList4.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        next2.getClass();
                        String str2 = ((e1) next2).f11139a;
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                }
                ArrayList arrayList5 = eVar.J;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    ArrayList arrayList6 = eVar.J;
                    arrayList6.getClass();
                    Iterator it3 = arrayList6.iterator();
                    it3.getClass();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        next3.getClass();
                        String str3 = ((e1) next3).f11139a;
                        if (str3 != null) {
                            arrayList2.add(str3);
                        }
                    }
                }
            }
        }
        q6.q.j0(arrayList2, new k1(new j1(3), 4));
        Iterator it4 = arrayList2.iterator();
        it4.getClass();
        String str4 = null;
        while (it4.hasNext()) {
            Object next4 = it4.next();
            next4.getClass();
            String str5 = (String) next4;
            str4 = str4 == null ? str5 : String.format("%s%s", Arrays.copyOf(new Object[]{str4, str5}, 2));
        }
        if (str4 == null) {
            return str4;
        }
        byte[] bytes = (str4 + Build.VERSION.SDK_INT).getBytes(l7.a.f7152a);
        bytes.getClass();
        return z3.D(bytes);
    }

    public static boolean f(Context context) {
        context.getClass();
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        if (!l7.u.m0(str, "Xiaomi", true) && !l7.u.m0(str2, "Xiaomi", true) && !l7.u.m0(str, "Poco", true)) {
            g gVarL = g.D.l(context);
            gVarL.b();
            ArrayList arrayListE = gVarL.E();
            gVarL.c();
            Iterator it = arrayListE.iterator();
            it.getClass();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                x4.e eVar = (x4.e) next;
                if (eVar.f11124l != null && (eVar.c() || eVar.d())) {
                    String str3 = eVar.f11124l;
                    str3.getClass();
                    if (l7.u.p0(str3, "com.miui.", false) || l7.u.p0(str3, "com.xiaomi.", false)) {
                        i++;
                        if (i > 5) {
                            break;
                        }
                    }
                }
            }
            if (i <= 5) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x4.e g(android.content.pm.ApplicationInfo r23, x4.e r24, android.content.pm.PackageInfo r25, j5.g r26, android.content.Context r27, android.content.pm.PackageManager r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.g(android.content.pm.ApplicationInfo, x4.e, android.content.pm.PackageInfo, j5.g, android.content.Context, android.content.pm.PackageManager, boolean, boolean):x4.e");
    }

    public static x4.e h(Context context, String str) {
        PackageInfo packageInfoE;
        ApplicationInfo applicationInfoB;
        SharedPreferences sharedPreferences;
        context.getClass();
        synchronized (UptodownApp.f3299l0) {
            x4.e eVarG = null;
            if (str == null) {
                return null;
            }
            g gVarL = g.D.l(context);
            gVarL.b();
            PackageManager packageManager = context.getPackageManager();
            boolean z9 = false;
            try {
                PackageManager packageManager2 = context.getPackageManager();
                packageManager2.getClass();
                packageInfoE = n4.i.e(packageManager2, str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                try {
                    sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused2) {
                }
                boolean z10 = sharedPreferences.contains("show_system_apps") ? sharedPreferences.getBoolean("show_system_apps", false) : false;
                try {
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("SettingsPreferences", 0);
                    if (sharedPreferences2.contains("show_system_services")) {
                        z9 = sharedPreferences2.getBoolean("show_system_services", false);
                    }
                } catch (Exception unused3) {
                }
                boolean z11 = z9;
                try {
                    PackageManager packageManager3 = context.getPackageManager();
                    packageManager3.getClass();
                    applicationInfoB = n4.i.b(packageManager3, str, 128);
                } catch (PackageManager.NameNotFoundException unused4) {
                    applicationInfoB = null;
                }
                if (applicationInfoB != null) {
                    String str2 = applicationInfoB.packageName;
                    str2.getClass();
                    x4.e eVarB = gVarL.B(str2);
                    packageManager.getClass();
                    eVarG = g(applicationInfoB, eVarB, packageInfoE, gVarL, context, packageManager, z10, z11);
                }
            }
            gVarL.c();
            return eVarG;
        }
    }

    public static ArrayList i(Context context) {
        ArrayList arrayList;
        PackageInfo packageInfoE;
        Iterator it;
        int i;
        x4.e eVar;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        Context context2 = context;
        context2.getClass();
        synchronized (UptodownApp.f3299l0) {
            arrayList = new ArrayList();
            g gVarL = g.D.l(context2);
            gVarL.b();
            PackageManager packageManager = context2.getPackageManager();
            packageManager.getClass();
            List listC = n4.i.c(packageManager);
            ArrayList arrayListE = gVarL.E();
            int i6 = 0;
            try {
                sharedPreferences2 = context2.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            boolean z9 = sharedPreferences2.contains("show_system_apps") ? sharedPreferences2.getBoolean("show_system_apps", false) : false;
            try {
                sharedPreferences = context2.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused2) {
            }
            boolean z10 = sharedPreferences.contains("show_system_services") ? sharedPreferences.getBoolean("show_system_services", false) : false;
            Iterator it2 = listC.iterator();
            while (it2.hasNext()) {
                ApplicationInfo applicationInfo = (ApplicationInfo) it2.next();
                try {
                    String str = applicationInfo.packageName;
                    str.getClass();
                    packageInfoE = n4.i.e(packageManager, str, i6);
                } catch (PackageManager.NameNotFoundException unused3) {
                    packageInfoE = null;
                }
                if (packageInfoE != null) {
                    Iterator it3 = arrayListE.iterator();
                    int i10 = i6;
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            i = i6;
                            i10 = -1;
                            eVar = null;
                            break;
                        }
                        int i11 = i10 + 1;
                        x4.e eVar2 = (x4.e) it3.next();
                        it = it2;
                        i = 0;
                        if (l7.u.m0(eVar2.f11124l, applicationInfo.packageName, false)) {
                            eVar = eVar2;
                            break;
                        }
                        i6 = 0;
                        i10 = i11;
                        it2 = it;
                    }
                    if (i10 >= 0) {
                        arrayListE.remove(i10);
                    }
                    arrayList.add(g(applicationInfo, eVar, packageInfoE, gVarL, context2, packageManager, z9, z10));
                    context2 = context;
                    i6 = i;
                    it2 = it;
                } else {
                    context2 = context;
                }
            }
            Iterator it4 = arrayListE.iterator();
            it4.getClass();
            while (it4.hasNext()) {
                Object next = it4.next();
                next.getClass();
                x4.e eVar3 = (x4.e) next;
                gVarL.f(eVar3);
                String str2 = eVar3.f11124l;
                if (str2 != null) {
                    gVarL.s(str2);
                }
            }
            gVarL.c();
        }
        return arrayList;
    }

    public static void j(x4.e eVar, PackageInfo packageInfo, Context context) {
        eVar.getClass();
        context.getClass();
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                eVar.f11123b = applicationInfo.loadLabel(context.getPackageManager()).toString();
            }
        } catch (Exception unused) {
            eVar.f11123b = eVar.f11124l;
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setLocale(new Locale("xx"));
            if (packageInfo.applicationInfo != null) {
                PackageManager packageManager = context.getPackageManager();
                ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                applicationInfo2.getClass();
                Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo2.packageName);
                resourcesForApplication.getClass();
                resourcesForApplication.updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                ApplicationInfo applicationInfo3 = packageInfo.applicationInfo;
                applicationInfo3.getClass();
                eVar.f11137z = resourcesForApplication.getString(applicationInfo3.labelRes);
            }
        } catch (Exception unused2) {
            eVar.f11137z = eVar.f11123b;
        }
        String str = eVar.f11137z;
        str.getClass();
        int length = str.length();
        boolean z9 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (Build.VERSION.SDK_INT >= 24 ? Character.UnicodeScript.of(cCharAt) == Character.UnicodeScript.HAN : Character.isIdeographic(cCharAt)) {
                z9 = true;
                break;
            }
            i++;
        }
        if (z9) {
            eVar.f11137z = eVar.f11124l;
        } else {
            String strReplaceAll = eVar.f11137z;
            strReplaceAll.getClass();
            Normalizer.Form form = Normalizer.Form.NFD;
            if (!Normalizer.isNormalized(strReplaceAll, form)) {
                String strNormalize = Normalizer.normalize(strReplaceAll, form);
                strNormalize.getClass();
                Pattern patternCompile = Pattern.compile("[\\p{InCombiningDiacriticalMarks}]");
                patternCompile.getClass();
                strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
                strReplaceAll.getClass();
            }
            eVar.f11137z = strReplaceAll;
        }
        if (l7.u.m0(eVar.f11137z, "null", true)) {
            eVar.f11136y = 1;
        }
    }
}
