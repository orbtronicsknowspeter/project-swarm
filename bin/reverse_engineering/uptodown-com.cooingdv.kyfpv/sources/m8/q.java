package m8;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import b2.t1;
import c4.k0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.core.activities.InstallerActivity;
import g4.h0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import t4.n0;
import u4.z1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class q implements w4.g, t.b, ViewBinding, a4.i, j1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7781b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f7782l;

    public q(q qVar) {
        this.f7780a = 20;
        Context context = (Context) qVar.f7781b;
        int iD = y1.g.d(context, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
        if (iD != 0) {
            this.f7781b = "Unity";
            String string = context.getResources().getString(iD);
            this.f7782l = string;
            String strJ = a4.x.j("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strJ, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f7781b = "Flutter";
                this.f7782l = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f7781b = null;
        this.f7782l = null;
    }

    public static final void a(q qVar, File file) {
        long length;
        Activity activity = (Activity) qVar.f7781b;
        h0 h0Var = (h0) qVar.f7782l;
        try {
            try {
                PackageManager packageManager = activity.getPackageManager();
                packageManager.getClass();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                PackageInfo packageInfoD = n4.i.d(packageManager, absolutePath, 128);
                if ((packageInfoD != null ? packageInfoD.applicationInfo : null) == null) {
                    if (h0Var != null) {
                        String name = file.getName();
                        name.getClass();
                        h0Var.f5191a.M(name.concat(" could not be parsed."));
                    }
                    if (f4.c.f4882u != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("fileName", file.getName());
                        z4.d dVar = f4.c.f4882u;
                        if (dVar != null) {
                            dVar.send(353, bundle);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ApplicationInfo applicationInfo = packageInfoD.applicationInfo;
                applicationInfo.getClass();
                String str = applicationInfo.packageName;
                long jD = n4.d.d(packageInfoD);
                int i = 0;
                try {
                    PackageManager packageManager2 = activity.getPackageManager();
                    packageManager2.getClass();
                    str.getClass();
                    if (n4.d.d(n4.i.e(packageManager2, str, 0)) > jD) {
                        if (h0Var != null) {
                            file.getName().getClass();
                            h0Var.f5191a.M("invalid version code");
                        }
                        if (f4.c.f4882u != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("packageName", str);
                            bundle2.putLong("versionCode", jD);
                            z4.d dVar2 = f4.c.f4882u;
                            if (dVar2 != null) {
                                dVar2.send(353, bundle2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (h0Var != null) {
                    file.getName().getClass();
                    InstallerActivity installerActivity = h0Var.f5191a;
                    installerActivity.runOnUiThread(new g4.e0(installerActivity, i));
                }
                if (f4.c.f4882u != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("packageName", str);
                    bundle3.putLong("versionCode", jD);
                    z4.d dVar3 = f4.c.f4882u;
                    if (dVar3 != null) {
                        dVar3.send(351, bundle3);
                    }
                }
                ApplicationInfo applicationInfo2 = packageInfoD.applicationInfo;
                applicationInfo2.getClass();
                String absolutePath2 = file.getAbsolutePath();
                absolutePath2.getClass();
                applicationInfo2.sourceDir = absolutePath2;
                applicationInfo2.publicSourceDir = absolutePath2;
                String string = packageManager.getApplicationLabel(applicationInfo2).toString();
                long jD2 = n4.d.d(packageInfoD);
                String absolutePath3 = file.getAbsolutePath();
                absolutePath3.getClass();
                try {
                    length = new File(absolutePath3).length();
                } catch (Exception unused2) {
                    length = -1;
                }
                long j = length;
                f4.a aVar = f4.a.f4870a;
                String str2 = packageInfoD.packageName;
                str2.getClass();
                aVar.d(jD2, j, str2, string);
                packageManager.getClass().getMethod("installPackage", (Class[]) Arrays.copyOf(new Class[]{Uri.class, IPackageInstallObserver.class, Integer.TYPE, String.class}, 4)).invoke(packageManager, Uri.fromFile(file), new n4.n(qVar), 2, null);
            } catch (Error e10) {
                f4.a.f4870a.a();
                if (h0Var != null) {
                    file.getName().getClass();
                    String message = e10.getMessage();
                    InstallerActivity installerActivity2 = h0Var.f5191a;
                    if (message != null) {
                        installerActivity2.M(message);
                    } else {
                        String string2 = installerActivity2.getString(R.string.error_unknown);
                        string2.getClass();
                        installerActivity2.M(string2);
                    }
                }
                if (f4.c.f4882u != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("fileName", file.getName());
                    z4.d dVar4 = f4.c.f4882u;
                    if (dVar4 != null) {
                        dVar4.send(353, bundle4);
                    }
                }
            }
        } catch (Exception e11) {
            f4.a.f4870a.a();
            if (h0Var != null) {
                file.getName().getClass();
                String message2 = e11.getMessage();
                InstallerActivity installerActivity3 = h0Var.f5191a;
                if (message2 != null) {
                    installerActivity3.M(message2);
                } else {
                    String string3 = installerActivity3.getString(R.string.error_unknown);
                    string3.getClass();
                    installerActivity3.M(string3);
                }
            }
            if (f4.c.f4882u != null) {
                Bundle bundle5 = new Bundle();
                bundle5.putString("fileName", file.getName());
                z4.d dVar5 = f4.c.f4882u;
                if (dVar5 != null) {
                    dVar5.send(353, bundle5);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m8.q b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            m8.q r2 = new m8.q     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 8
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.q.b(android.content.Context):m8.q");
    }

    public static q c(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_preference_category);
        if (textView != null) {
            return new q(14, (RelativeLayout) view, textView);
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_preference_category)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(m8.c0 r2, m8.a0 r3) {
        /*
            int r0 = r2.f7695l
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L4f
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L4f
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L4f
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L4f
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L4f
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L4f
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L2e
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L4f
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L4f
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L4f
            switch(r0) {
                case 300: goto L4f;
                case 301: goto L4f;
                case 302: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L6a
        L2e:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r2.c(r0)
            if (r0 != 0) goto L4f
            m8.i r0 = r2.b()
            int r0 = r0.f7738c
            r1 = -1
            if (r0 != r1) goto L4f
            m8.i r0 = r2.b()
            boolean r0 = r0.f
            if (r0 != 0) goto L4f
            m8.i r0 = r2.b()
            boolean r0 = r0.f7740e
            if (r0 == 0) goto L6a
        L4f:
            m8.i r2 = r2.b()
            boolean r2 = r2.f7737b
            if (r2 != 0) goto L6a
            m8.i r2 = r3.f7678e
            if (r2 == 0) goto L5c
            goto L64
        L5c:
            m8.s r2 = r3.f7676c
            m8.i r2 = m8.i.a(r2)
            r3.f7678e = r2
        L64:
            boolean r2 = r2.f7737b
            if (r2 != 0) goto L6a
            r2 = 1
            return r2
        L6a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.q.m(m8.c0, m8.a0):boolean");
    }

    @Override // w4.g
    public void A(String str) {
        switch (this.f7780a) {
            case 2:
                ((k0) this.f7782l).N(str);
                break;
            case 17:
                u4.d dVar = (u4.d) this.f7781b;
                if (dVar.getActivity() instanceof k0) {
                    FragmentActivity activity = dVar.getActivity();
                    activity.getClass();
                    ((k0) activity).N(str);
                }
                break;
            default:
                z1 z1Var = (z1) this.f7781b;
                if (z1Var.getActivity() instanceof k0) {
                    FragmentActivity activity2 = z1Var.getActivity();
                    activity2.getClass();
                    ((k0) activity2).N(str);
                }
                break;
        }
    }

    public void d() {
        String str = (String) this.f7781b;
        try {
            e2.d dVar = (e2.d) this.f7782l;
            dVar.getClass();
            new File((File) dVar.f4469m, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public synchronized void e(z zVar) {
        ((ArrayDeque) this.f7782l).add(zVar);
    }

    public void f(z zVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7782l;
        synchronized (this) {
            try {
                if (!arrayDeque.remove(zVar)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w4.g
    public void g(x4.r rVar) {
        switch (this.f7780a) {
            case 2:
                n5.d dVar = (n5.d) this.f7781b;
                File fileG = rVar.g();
                if (fileG != null) {
                    k0 k0Var = (k0) this.f7782l;
                    float f = UptodownApp.I;
                    b4.d.q(k0Var, null, fileG);
                    dVar.g();
                }
                android.support.v4.media.g gVar = dVar.f8072c;
                dVar.f8070a.getClass();
                ((d7.a) gVar.f247b).invoke();
                break;
            case 17:
                u4.d dVar2 = (u4.d) this.f7781b;
                if (dVar2.getContext() != null) {
                    float f10 = UptodownApp.I;
                    File fileG2 = rVar.g();
                    fileG2.getClass();
                    Context contextRequireContext = dVar2.requireContext();
                    contextRequireContext.getClass();
                    b4.d.q(contextRequireContext, null, fileG2);
                }
                break;
            default:
                z1 z1Var = (z1) this.f7781b;
                if (z1Var.getContext() != null) {
                    float f11 = UptodownApp.I;
                    File fileG3 = rVar.g();
                    fileG3.getClass();
                    Context contextRequireContext2 = z1Var.requireContext();
                    contextRequireContext2.getClass();
                    b4.d.q(contextRequireContext2, null, fileG3);
                }
                break;
        }
    }

    @Override // m6.a
    public Object get() {
        switch (this.f7780a) {
            case 6:
                return new s.d((Context) ((g5.f) this.f7781b).f5310b, (b5.m) ((g5.g) this.f7782l).get());
            default:
                q2.e eVar = new q2.e(2);
                q2.e eVar2 = new q2.e(1);
                Object obj = ((m6.a) this.f7781b).get();
                m6.a aVar = (m6.a) this.f7782l;
                return new y.h(eVar, eVar2, y.a.f, (y.j) obj, aVar);
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f7780a) {
            case 9:
                return (RelativeLayout) this.f7781b;
            case 10:
                return (LinearLayout) this.f7781b;
            case 11:
                return (LinearLayout) this.f7781b;
            case 12:
                return (TextView) this.f7781b;
            case 13:
                return (LinearLayout) this.f7781b;
            default:
                return (RelativeLayout) this.f7781b;
        }
    }

    @Override // a4.i
    public void h(Exception exc) {
        exc.getClass();
        exc.printStackTrace();
        u4.f0 f0Var = (u4.f0) this.f7781b;
        t4.b bVar = f0Var.f10474b;
        bVar.getClass();
        u4.f0.g(f0Var, bVar.T.f9653b, (Context) this.f7782l);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory i(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.q.i(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public File j() {
        if (((File) this.f7781b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f7781b) == null) {
                        n1.f fVar = (n1.f) this.f7782l;
                        fVar.a();
                        this.f7781b = new File(fVar.f7909a.getFilesDir(), "PersistedInstallation." + ((n1.f) this.f7782l).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f7781b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(int r5, v6.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s4.t
            if (r0 == 0) goto L13
            r0 = r6
            s4.t r0 = (s4.t) r0
            int r1 = r0.f9294l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9294l = r1
            goto L18
        L13:
            s4.t r0 = new s4.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9292a
            int r1 = r0.f9294l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r6)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            return r2
        L2c:
            p6.a.e(r6)
            v7.e r6 = o7.m0.f8289a
            v7.d r6 = v7.d.f10885a
            p9.c r1 = new p9.c
            r1.<init>(r4, r5, r2)
            r0.f9294l = r3
            java.lang.Object r6 = o7.c0.C(r1, r6, r0)
            u6.a r5 = u6.a.f10763a
            if (r6 != r5) goto L43
            return r5
        L43:
            p6.k r6 = (p6.k) r6
            java.lang.Object r5 = r6.f8445a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.q.k(int, v6.c):java.lang.Object");
    }

    public void l(u2.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f10405a);
            jSONObject.put("Status", c.j.c(bVar.f10406b));
            jSONObject.put("AuthToken", bVar.f10407c);
            jSONObject.put("RefreshToken", bVar.f10408d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.f10409e);
            jSONObject.put("FisError", bVar.g);
            n1.f fVar = (n1.f) this.f7782l;
            fVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f7909a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(j())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void n(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            w1.b bVar = "clx".equals(bundle2.getString("_o")) ? (n0) this.f7781b : (g5.g) this.f7782l;
            if (bVar == null) {
                return;
            }
            bVar.g(bundle2, string);
        }
    }

    public u2.b o() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i6 = u2.b.h;
        byte b7 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = c.j.e(5)[iOptInt];
        if (i10 == 0) {
            com.google.gson.internal.a.i("Null registrationStatus");
            return null;
        }
        byte b10 = (byte) (((byte) (b7 | 2)) | 1);
        if (b10 == 3 && i10 != 0) {
            return new u2.b(strOptString, i10, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i10 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b10 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }

    @Override // a4.i
    public void onSuccess() {
        u4.f0 f0Var = (u4.f0) this.f7781b;
        t4.b bVar = f0Var.f10474b;
        bVar.getClass();
        u4.f0.g(f0Var, bVar.T.f9653b, (Context) this.f7782l);
    }

    @Override // w4.g
    public void p(String str) {
        int i = this.f7780a;
        str.getClass();
        switch (i) {
            case 2:
                n5.d dVar = (n5.d) this.f7781b;
                k0 k0Var = (k0) this.f7782l;
                dVar.c(k0Var);
                j5.c.e(k0Var, str, null);
                break;
            case 17:
                u4.d dVar2 = (u4.d) this.f7781b;
                if (dVar2.getActivity() instanceof k0) {
                    FragmentActivity fragmentActivityRequireActivity = dVar2.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    j5.c.e((k0) fragmentActivityRequireActivity, str, null);
                }
                break;
            default:
                z1 z1Var = (z1) this.f7781b;
                if (z1Var.getActivity() instanceof k0) {
                    FragmentActivity fragmentActivityRequireActivity2 = z1Var.requireActivity();
                    fragmentActivityRequireActivity2.getClass();
                    j5.c.e((k0) fragmentActivityRequireActivity2, str, null);
                }
                break;
        }
    }

    @Override // j1.h
    public j1.p q(Object obj) {
        Boolean bool = (Boolean) obj;
        y1.l lVar = (y1.l) this.f7782l;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            y1.t tVar = lVar.f11638b;
            if (zBooleanValue) {
                tVar.h.c(null);
                return ((j1.p) this.f7781b).j(lVar.f11641e.f11909a, new g5.g(this, 18));
            }
            tVar.getClass();
            androidx.privacysandbox.ads.adservices.customaudience.a.i("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        e2.d dVar = lVar.g;
        Iterator it = e2.d.n(((File) dVar.f4469m).listFiles(y1.l.f11635r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        e2.d dVar2 = ((e2.b) lVar.f11644m.f4468l).f4462b;
        e2.b.a(e2.d.n(((File) dVar2.f4471o).listFiles()));
        e2.b.a(e2.d.n(((File) dVar2.f4472p).listFiles()));
        e2.b.a(e2.d.n(((File) dVar2.f4473q).listFiles()));
        lVar.f11648q.c(null);
        return t1.x(null);
    }

    public void r() {
        try {
            ((FileLock) this.f7782l).release();
            ((FileChannel) this.f7781b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public synchronized void s() {
        ((ArrayDeque) this.f7781b).size();
        ((ArrayDeque) this.f7782l).size();
    }

    @Override // w4.g
    public void u(x4.r rVar) {
        switch (this.f7780a) {
            case 2:
                n5.d dVar = (n5.d) this.f7781b;
                android.support.v4.media.g gVar = dVar.f8072c;
                dVar.f8070a.getClass();
                ((d7.a) gVar.f247b).invoke();
                break;
            case 17:
                ((u4.d) this.f7781b).a(((x4.g) this.f7782l).F);
                break;
            default:
                ((z1) this.f7781b).g(((x4.g) this.f7782l).F);
                break;
        }
    }

    public /* synthetic */ q(Context context, int i) {
        this.f7780a = i;
        this.f7782l = null;
        this.f7781b = context;
    }

    public q(f0.i iVar, q qVar) {
        this.f7780a = 4;
        this.f7782l = qVar;
        iVar.n(new q1.c(this, 0));
        this.f7781b = new HashSet();
    }

    public q(Context context, x4.g gVar) {
        this.f7780a = 7;
        gVar.getClass();
        this.f7781b = context;
        this.f7782l = gVar;
    }

    public q(LinearLayout linearLayout, EditText editText, TextView textView, TextView textView2, TextView textView3) {
        this.f7780a = 11;
        this.f7781b = linearLayout;
        this.f7782l = editText;
    }

    public q(LinearLayout linearLayout, NumberPicker numberPicker, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f7780a = 10;
        this.f7781b = linearLayout;
        this.f7782l = numberPicker;
    }

    public q(int i) {
        this.f7780a = i;
        switch (i) {
            case 15:
                break;
            case 25:
                this.f7781b = new AtomicInteger();
                this.f7782l = new AtomicInteger();
                break;
            default:
                new ArrayDeque();
                this.f7781b = new ArrayDeque();
                this.f7782l = new ArrayDeque();
                break;
        }
    }

    public q(n1.f fVar) {
        this.f7780a = 16;
        this.f7782l = fVar;
    }

    public /* synthetic */ q(int i, Object obj, Object obj2) {
        this.f7780a = i;
        this.f7781b = obj;
        this.f7782l = obj2;
    }

    public q(y1.l lVar, j1.p pVar) {
        this.f7780a = 23;
        this.f7782l = lVar;
        this.f7781b = pVar;
    }
}
