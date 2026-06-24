package n4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import c4.ya;
import com.uptodown.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import o7.c0;
import o7.m0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f7967c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f7968d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7970b;

    public h(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f7969a = applicationContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n4.h r5, int r6, v6.c r7) {
        /*
            boolean r0 = r7 instanceof n4.e
            if (r0 == 0) goto L13
            r0 = r7
            n4.e r0 = (n4.e) r0
            int r1 = r0.f7948m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7948m = r1
            goto L18
        L13:
            n4.e r0 = new n4.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.f7946b
            int r7 = r0.f7948m
            j$.util.concurrent.ConcurrentHashMap r1 = n4.h.f7967c
            r2 = 1
            if (r7 == 0) goto L32
            if (r7 != r2) goto L2b
            int r6 = r0.f7945a
            p6.a.e(r5)     // Catch: java.lang.Throwable -> L29
            goto L66
        L29:
            r5 = move-exception
            goto L7d
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            r5 = 0
            return r5
        L32:
            p6.a.e(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            java.lang.Object r7 = r1.get(r5)
            if (r7 != 0) goto L4c
            o7.r r7 = o7.c0.a()
            java.lang.Object r5 = r1.putIfAbsent(r5, r7)
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r7 = r5
        L4c:
            o7.q r7 = (o7.q) r7
            b.s r5 = new b.s     // Catch: java.lang.Throwable -> L29
            r3 = 25
            r4 = 0
            r5.<init>(r7, r4, r3)     // Catch: java.lang.Throwable -> L29
            r0.f7945a = r6     // Catch: java.lang.Throwable -> L29
            r0.f7948m = r2     // Catch: java.lang.Throwable -> L29
            r2 = 600000(0x927c0, double:2.964394E-318)
            java.lang.Object r5 = o7.c0.E(r2, r5, r0)     // Catch: java.lang.Throwable -> L29
            u6.a r7 = u6.a.f10763a
            if (r5 != r7) goto L66
            return r7
        L66:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L6f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L29
            goto L70
        L6f:
            r5 = 0
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r1.remove(r7)
            return r5
        L7d:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r1.remove(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h.a(n4.h, int, v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(n4.h r4, int r5, v6.c r6) {
        /*
            boolean r0 = r6 instanceof n4.f
            if (r0 == 0) goto L13
            r0 = r6
            n4.f r0 = (n4.f) r0
            int r1 = r0.f7952m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7952m = r1
            goto L18
        L13:
            n4.f r0 = new n4.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f7950b
            int r6 = r0.f7952m
            j$.util.concurrent.ConcurrentHashMap r1 = n4.h.f7968d
            r2 = 1
            if (r6 == 0) goto L32
            if (r6 != r2) goto L2b
            int r5 = r0.f7949a
            p6.a.e(r4)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r4 = move-exception
            goto L66
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            r4 = 0
            return r4
        L32:
            p6.a.e(r4)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            java.lang.Object r6 = r1.get(r4)
            if (r6 != 0) goto L4c
            o7.r r6 = o7.c0.a()
            java.lang.Object r4 = r1.putIfAbsent(r4, r6)
            if (r4 != 0) goto L4b
            goto L4c
        L4b:
            r6 = r4
        L4c:
            o7.q r6 = (o7.q) r6
            r0.f7949a = r5     // Catch: java.lang.Throwable -> L29
            r0.f7952m = r2     // Catch: java.lang.Throwable -> L29
            o7.r r6 = (o7.r) r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.w(r0)     // Catch: java.lang.Throwable -> L29
            u6.a r6 = u6.a.f10763a
            if (r4 != r6) goto L5d
            return r6
        L5d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r1.remove(r6)
            return r4
        L66:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r1.remove(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h.b(n4.h, int, v6.c):java.lang.Object");
    }

    public static final void c(h hVar, PackageInstaller packageInstaller) {
        Iterator<PackageInstaller.SessionInfo> it = packageInstaller.getMySessions().iterator();
        while (it.hasNext()) {
            try {
                packageInstaller.abandonSession(it.next().getSessionId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static final Object d(h hVar, File file, File file2, g gVar) throws Throwable {
        v7.e eVar = m0.f8289a;
        Object objC = c0.C(new b6.g(file2, file, hVar, (t6.c) null, 18), v7.d.f10885a, gVar);
        return objC == u6.a.f10763a ? objC : p6.x.f8464a;
    }

    public static final String f(h hVar, int i, PackageInstaller.Session session, int i6) {
        Context context = hVar.f7969a;
        if (i == 0) {
            String string = context.getString(R.string.error_code_installation_status_failure, "102");
            string.getClass();
            return string;
        }
        if (session == null) {
            String string2 = context.getString(R.string.error_code_installation_status_failure, "103");
            string2.getClass();
            return string2;
        }
        if (i6 == 0) {
            String string3 = context.getString(R.string.installation_status_failure_storage);
            string3.getClass();
            return string3;
        }
        if (i6 == 1) {
            String string4 = context.getString(R.string.error_code_installation_status_failure, "105");
            string4.getClass();
            return string4;
        }
        if (i6 == 2) {
            String string5 = context.getString(R.string.error_code_installation_status_failure, "106");
            string5.getClass();
            return string5;
        }
        if (i6 == 3) {
            String string6 = context.getString(R.string.error_code_installation_status_failure, "107");
            string6.getClass();
            return string6;
        }
        if (i6 == 4) {
            String string7 = context.getString(R.string.error_code_installation_status_failure, "108");
            string7.getClass();
            return string7;
        }
        String string8 = context.getString(R.string.error_code_installation_status_failure, "101");
        string8.getClass();
        return string8;
    }

    public static final OutputStream g(h hVar, PackageInstaller.Session session, File file) throws IOException {
        OutputStream outputStreamOpenWrite = session.openWrite(file.getName(), 0L, file.length());
        outputStreamOpenWrite.getClass();
        return outputStreamOpenWrite;
    }

    public static final int h(h hVar, String str, Long l10, ArrayList arrayList) {
        PackageInfo packageInfoE;
        if (str == null) {
            return 1;
        }
        try {
            PackageManager packageManager = hVar.f7969a.getPackageManager();
            packageManager.getClass();
            packageInfoE = i.e(packageManager, str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoE = null;
        }
        if (packageInfoE != null) {
            return (l10 != null && d.d(packageInfoE) == l10.longValue() && arrayList.size() > 1) ? 2 : 1;
        }
        return 1;
    }

    public static boolean l(int i) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 31) {
            return false;
        }
        if (i6 == 31 && i >= 29) {
            return true;
        }
        if (i6 == 32 && i >= 29) {
            return true;
        }
        if (i6 != 33 || i < 30) {
            return i6 >= 34 && i >= 31;
        }
        return true;
    }

    public final void k(ArrayList arrayList, boolean z9) {
        this.f7970b = z9;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        v7.e eVar = m0.f8289a;
        c0.s(c0.b(v7.d.f10885a), null, null, new ya(this, arrayList2, (t6.c) null, 21), 3);
    }
}
