package a2;

import a4.x;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.documentfile.provider.DocumentFile;
import c4.w4;
import com.google.firebase.messaging.FirebaseMessaging;
import e1.g1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k0.y;
import o7.c0;
import o7.m0;
import w8.e0;
import w8.i0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f54c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f55d;

    public t(Context context, String str, k4.c cVar, boolean z9) {
        str.getClass();
        cVar.getClass();
        this.f53b = context;
        this.f54c = str;
        this.f55d = cVar;
        this.f52a = z9;
        v7.e eVar = m0.f8289a;
        c0.s(c0.b(v7.d.f10885a), null, null, new b.s(this, (t6.c) null, 23), 3);
    }

    public void a() {
        synchronized (((o8.f) this.f55d)) {
            try {
                if (this.f52a) {
                    throw new IllegalStateException();
                }
                if (((o8.d) this.f53b).f == this) {
                    ((o8.f) this.f55d).c(this, false);
                }
                this.f52a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0179, code lost:
    
        if (r2 == r15) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(l4.b r23, v6.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t.b(l4.b, v6.c):java.lang.Object");
    }

    public void c() {
        synchronized (((o8.f) this.f55d)) {
            try {
                if (this.f52a) {
                    throw new IllegalStateException();
                }
                if (((o8.d) this.f53b).f == this) {
                    ((o8.f) this.f55d).c(this, true);
                }
                this.f52a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        r7 = r18;
        r3 = true;
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e3 -> B:33:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.io.File r23, java.lang.Object r24, v6.c r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t.d(java.io.File, java.lang.Object, v6.c):java.lang.Object");
    }

    public void e() {
        o8.d dVar = (o8.d) this.f53b;
        if (dVar.f != this) {
            return;
        }
        int i = 0;
        while (true) {
            o8.f fVar = (o8.f) this.f55d;
            if (i >= fVar.f8363q) {
                dVar.f = null;
                return;
            } else {
                try {
                    fVar.f8356a.a(dVar.f8350d[i]);
                } catch (IOException unused) {
                }
                i++;
            }
        }
    }

    public String f(l4.b bVar) {
        String strReplaceAll;
        PackageInfo packageInfoE;
        PackageInfo packageInfoE2;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        w4 w4Var = (w4) this.f53b;
        boolean z9 = true;
        try {
            sharedPreferences2 = w4Var.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences2.contains("app_name_included") ? sharedPreferences2.getBoolean("app_name_included", true) : true;
        if (z10) {
            String str = bVar.f7102b;
            str.getClass();
            Pattern patternCompile = Pattern.compile("[/\\\\:*?\"<>|]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            String str2 = bVar.f7101a;
            str2.getClass();
            Pattern patternCompile2 = Pattern.compile("[/\\\\:*?\"<>|]");
            patternCompile2.getClass();
            strReplaceAll = patternCompile2.matcher(str2).replaceAll("");
            strReplaceAll.getClass();
        }
        try {
            SharedPreferences sharedPreferences3 = w4Var.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences3.contains("versioncode_included")) {
                z9 = sharedPreferences3.getBoolean("versioncode_included", true);
            }
        } catch (Exception unused2) {
        }
        if (z9) {
            try {
                PackageManager packageManager = w4Var.getPackageManager();
                packageManager.getClass();
                packageInfoE = n4.i.e(packageManager, bVar.f7101a, 0);
            } catch (Exception e10) {
                e10.printStackTrace();
                packageInfoE = null;
            }
            strReplaceAll = strReplaceAll + "_" + (packageInfoE != null ? n4.d.d(packageInfoE) : 0L);
        }
        try {
            sharedPreferences = w4Var.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused3) {
        }
        boolean z11 = sharedPreferences.contains("versionname_included") ? sharedPreferences.getBoolean("versionname_included", false) : false;
        if (!z11) {
            return strReplaceAll;
        }
        try {
            PackageManager packageManager2 = w4Var.getPackageManager();
            packageManager2.getClass();
            packageInfoE2 = n4.i.e(packageManager2, bVar.f7101a, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
            packageInfoE2 = null;
        }
        return x.k(strReplaceAll, "_", packageInfoE2 != null ? packageInfoE2.versionName : null);
    }

    public OutputStream g(Object obj) throws Exception {
        if (obj instanceof File) {
            return new FileOutputStream((File) obj);
        }
        if (!(obj instanceof DocumentFile)) {
            throw new Exception("getOutputStream: Illegal parameter type");
        }
        DocumentFile documentFile = (DocumentFile) obj;
        if (documentFile.getName() == null) {
            throw new Exception("getOutputStream: DocumentFile name is null");
        }
        ContentResolver contentResolver = ((w4) this.f53b).getContentResolver();
        OutputStream outputStreamOpenOutputStream = contentResolver != null ? contentResolver.openOutputStream(documentFile.getUri()) : null;
        outputStreamOpenOutputStream.getClass();
        return outputStreamOpenOutputStream;
    }

    public synchronized void h() {
        try {
            if (this.f52a) {
                return;
            }
            Boolean boolK = k();
            this.f54c = boolK;
            if (boolK == null) {
                s1.o oVar = new s1.o(28);
                s1.k kVar = (s1.k) ((p2.c) this.f53b);
                kVar.a(kVar.f9140c, oVar);
            }
            this.f52a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean i() {
        Boolean bool;
        try {
            h();
            bool = (Boolean) this.f54c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f55d).f3085a.h();
    }

    public e0 j(int i) {
        w8.b bVar;
        synchronized (((o8.f) this.f55d)) {
            try {
                if (this.f52a) {
                    throw new IllegalStateException();
                }
                o8.d dVar = (o8.d) this.f53b;
                if (dVar.f != this) {
                    return new w8.e();
                }
                int i6 = 1;
                if (!dVar.f8351e) {
                    ((boolean[]) this.f54c)[i] = true;
                }
                File file = dVar.f8350d[i];
                try {
                    ((o8.f) this.f55d).f8356a.getClass();
                    try {
                        Logger logger = w8.x.f11004a;
                        file.getClass();
                        bVar = new w8.b(i6, new FileOutputStream(file, false), new i0());
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger2 = w8.x.f11004a;
                        bVar = new w8.b(i6, new FileOutputStream(file, false), new i0());
                    }
                    return new o8.c(this, bVar, i6);
                } catch (FileNotFoundException unused2) {
                    return new w8.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Boolean k() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        n1.f fVar = ((FirebaseMessaging) this.f55d).f3085a;
        fVar.a();
        Context context = fVar.f7909a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean l(String str, String str2) {
        synchronized (this) {
            try {
                if (!((e) ((AtomicMarkableReference) this.f53b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f53b;
                atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                s sVar = new s(this, 0);
                AtomicReference atomicReference = (AtomicReference) this.f54c;
                while (!atomicReference.compareAndSet(null, sVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((z1.e) ((e2.d) this.f55d).f4469m).f11910b.a(sVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a7, code lost:
    
        r9 = r11;
        r11 = r18;
        r1 = r20;
        r17 = r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x004e, B:61:0x01fa, B:48:0x017b, B:50:0x018e, B:56:0x01a9, B:62:0x020b, B:45:0x013f, B:63:0x0229, B:20:0x007e, B:43:0x0138, B:25:0x008c, B:27:0x0096, B:29:0x00a7, B:39:0x00fc, B:64:0x022d, B:65:0x0234, B:30:0x00d2, B:32:0x00d6, B:34:0x00e0, B:35:0x00f0, B:36:0x00f7), top: B:69:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x004e, B:61:0x01fa, B:48:0x017b, B:50:0x018e, B:56:0x01a9, B:62:0x020b, B:45:0x013f, B:63:0x0229, B:20:0x007e, B:43:0x0138, B:25:0x008c, B:27:0x0096, B:29:0x00a7, B:39:0x00fc, B:64:0x022d, B:65:0x0234, B:30:0x00d2, B:32:0x00d6, B:34:0x00e0, B:35:0x00f0, B:36:0x00f7), top: B:69:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020b A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x004e, B:61:0x01fa, B:48:0x017b, B:50:0x018e, B:56:0x01a9, B:62:0x020b, B:45:0x013f, B:63:0x0229, B:20:0x007e, B:43:0x0138, B:25:0x008c, B:27:0x0096, B:29:0x00a7, B:39:0x00fc, B:64:0x022d, B:65:0x0234, B:30:0x00d2, B:32:0x00d6, B:34:0x00e0, B:35:0x00f0, B:36:0x00f7), top: B:69:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0229 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:13:0x004e, B:61:0x01fa, B:48:0x017b, B:50:0x018e, B:56:0x01a9, B:62:0x020b, B:45:0x013f, B:63:0x0229, B:20:0x007e, B:43:0x0138, B:25:0x008c, B:27:0x0096, B:29:0x00a7, B:39:0x00fc, B:64:0x022d, B:65:0x0234, B:30:0x00d2, B:32:0x00d6, B:34:0x00e0, B:35:0x00f0, B:36:0x00f7), top: B:69:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x013f -> B:46:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ea -> B:60:0x01f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.util.ArrayList r26, java.util.ArrayList r27, java.lang.String r28, long r29, v6.c r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.t.m(java.util.ArrayList, java.util.ArrayList, java.lang.String, long, v6.c):java.lang.Object");
    }

    public String n() {
        if (!this.f52a) {
            this.f52a = true;
            g1 g1Var = (g1) this.f55d;
            this.f54c = g1Var.k().getString((String) this.f53b, null);
        }
        return (String) this.f54c;
    }

    public void o(String str) {
        SharedPreferences.Editor editorEdit = ((g1) this.f55d).k().edit();
        editorEdit.putString((String) this.f53b, str);
        editorEdit.apply();
        this.f54c = str;
    }

    public t(g1 g1Var, String str) {
        this.f55d = g1Var;
        y.d(str);
        this.f53b = str;
    }

    public t(w4 w4Var, a3.d dVar) {
        this.f53b = w4Var;
        this.f54c = dVar;
    }

    public t(e2.d dVar, boolean z9) {
        this.f55d = dVar;
        this.f54c = new AtomicReference(null);
        this.f52a = z9;
        this.f53b = new AtomicMarkableReference(new e(z9 ? 8192 : 1024), false);
    }

    public t(FirebaseMessaging firebaseMessaging, p2.c cVar) {
        this.f55d = firebaseMessaging;
        this.f53b = cVar;
    }

    public t(o8.f fVar, o8.d dVar) {
        this.f55d = fVar;
        this.f53b = dVar;
        this.f54c = dVar.f8351e ? null : new boolean[fVar.f8363q];
    }
}
