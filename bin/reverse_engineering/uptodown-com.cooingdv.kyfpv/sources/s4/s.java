package s4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.lifecycle.LifecycleCoroutineScope;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9289e;

    public s(Context context, w4.i iVar, LifecycleCoroutineScope lifecycleCoroutineScope) {
        iVar.getClass();
        lifecycleCoroutineScope.getClass();
        this.f9285a = context;
        this.f9288d = iVar;
        this.f9289e = lifecycleCoroutineScope;
        this.f9286b = -1;
        o7.c0.s(lifecycleCoroutineScope, null, null, new p9.c(this, (t6.c) null, 5), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final x4.p2 a(s4.s r7, x4.j r8, j5.v r9, j5.g r10) {
        /*
            boolean r7 = r8.f11228m
            r0 = 4
            r1 = 5
            r2 = 20
            if (r7 == 0) goto L11
            int r7 = r8.f11225a
            java.lang.String r3 = "floating_category_top_"
            java.lang.String r7 = androidx.lifecycle.l.u(r7, r3)
            goto L3d
        L11:
            boolean r7 = r8.f11229n
            int r3 = r8.f11225a
            if (r7 == 0) goto L1e
            java.lang.String r7 = "leaf_category_top_"
            java.lang.String r7 = androidx.lifecycle.l.u(r3, r7)
            goto L3d
        L1e:
            java.lang.String r7 = "category_top_"
            java.lang.String r7 = androidx.lifecycle.l.u(r3, r7)
            int r1 = r8.f11225a
            r3 = 521(0x209, float:7.3E-43)
            if (r1 == r3) goto L3c
            r3 = 523(0x20b, float:7.33E-43)
            if (r1 == r3) goto L36
            r3 = 524(0x20c, float:7.34E-43)
            if (r1 == r3) goto L3c
            r2 = 12
            r1 = 6
            goto L3d
        L36:
            float r1 = com.uptodown.UptodownApp.I
            r2 = 8
            r1 = r0
            goto L3d
        L3c:
            r1 = 1
        L3d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            x4.h2 r4 = r10.X(r7)
            if (r4 == 0) goto L57
            boolean r5 = r4.a()
            if (r5 == 0) goto L57
            x4.g2 r7 = r4.c()
            java.util.ArrayList r3 = j5.v.E(r7)
            goto La4
        L57:
            boolean r4 = r8.f11228m
            int r5 = r8.f11225a
            r6 = 0
            if (r4 == 0) goto L63
            x4.g2 r9 = r9.u(r5, r2, r6)
            goto L67
        L63:
            x4.g2 r9 = r9.t(r5, r2, r6)
        L67:
            boolean r2 = r9.b()
            if (r2 != 0) goto La4
            org.json.JSONObject r2 = r9.f11207d
            if (r2 == 0) goto La4
            java.util.ArrayList r3 = j5.v.E(r9)
            java.lang.String r9 = r9.f11204a
            r9.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r10.r(r7)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r6 = "type"
            r2.put(r6, r7)
            java.lang.String r7 = "json"
            r2.put(r7, r9)
            java.lang.String r7 = "timestamp"
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r2.put(r7, r9)
            android.database.sqlite.SQLiteDatabase r7 = r10.f6674a
            r7.getClass()
            java.lang.String r9 = "responses"
            r10 = 0
            r7.insert(r9, r10, r2)
        La4:
            x4.p2 r7 = new x4.p2
            r7.<init>(r8, r3, r0)
            r7.f11332c = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.a(s4.s, x4.j, j5.v, j5.g):x4.p2");
    }

    public static String d(n1.f fVar) {
        fVar.a();
        n1.h hVar = fVar.f7911c;
        String str = hVar.f7923e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = hVar.f7920b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String b() {
        try {
            if (((String) this.f9288d) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f9288d;
    }

    public synchronized String c() {
        try {
            if (((String) this.f9289e) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f9289e;
    }

    public PackageInfo e(String str) {
        try {
            return this.f9285a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003f, B:21:0x0045, B:24:0x004a, B:26:0x005d, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:35:0x007a, B:34:0x0078), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f9287c     // Catch: java.lang.Throwable -> L25
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7d
        La:
            android.content.Context r0 = r5.f9285a     // Catch: java.lang.Throwable -> L25
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L25
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r2
            goto L7d
        L25:
            r0 = move-exception
            goto L81
        L27:
            boolean r3 = p0.b.a()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L4a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L4a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
            if (r3 <= 0) goto L4a
            r5.f9287c = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r1
            goto L7d
        L4a:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L25
            r3 = 2
            if (r0 == 0) goto L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L68
            r5.f9287c = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r3
            goto L7d
        L68:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L25
            boolean r0 = p0.b.a()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L78
            r5.f9287c = r3     // Catch: java.lang.Throwable -> L25
            goto L7a
        L78:
            r5.f9287c = r1     // Catch: java.lang.Throwable -> L25
        L7a:
            int r0 = r5.f9287c     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
        L7d:
            if (r0 == 0) goto L80
            return r1
        L80:
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.f():boolean");
    }

    public synchronized void g() {
        PackageInfo packageInfoE = e(this.f9285a.getPackageName());
        if (packageInfoE != null) {
            this.f9288d = Integer.toString(packageInfoE.versionCode);
            this.f9289e = packageInfoE.versionName;
        }
    }

    public s(Context context) {
        this.f9287c = 0;
        this.f9285a = context;
    }
}
