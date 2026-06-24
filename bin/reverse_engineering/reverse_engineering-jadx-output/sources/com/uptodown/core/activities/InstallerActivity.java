package com.uptodown.core.activities;

import a2.t;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwnerKt;
import b6.g;
import c4.b;
import c4.ya;
import com.uptodown.core.activities.InstallerActivity;
import f0.i;
import f4.c;
import g4.a0;
import g4.e0;
import g4.f0;
import g4.h;
import g4.h0;
import g4.k0;
import g4.l0;
import h4.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import l4.l;
import l7.m;
import l7.u;
import m8.q;
import n4.d;
import o7.c0;
import o7.m0;
import o7.s1;
import q6.r;
import t0.f;
import v7.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class InstallerActivity extends h {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f3394j0 = 0;
    public TextView A;
    public ImageView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public LinearLayout F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public ImageView O;
    public ImageView P;
    public String Q;
    public ArrayList R;
    public String S;
    public Uri T;
    public AlertDialog U;
    public AlertDialog V;
    public ArrayList W;
    public s1 X;
    public i Y;
    public boolean Z;
    public LinearLayout a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f3395b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f3396c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f3397d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f3398e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f3399f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final b f3400g0 = new b(this, 9);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final h0 f3401h0 = new h0(this);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final h0 f3402i0 = new h0(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ProgressBar f3403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f3404z;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (o7.c0.C(r1, r10, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.uptodown.core.activities.InstallerActivity r7, android.net.Uri r8, java.lang.String r9, v6.c r10) {
        /*
            boolean r0 = r10 instanceof g4.m0
            if (r0 == 0) goto L13
            r0 = r10
            g4.m0 r0 = (g4.m0) r0
            int r1 = r0.f5224n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5224n = r1
            goto L18
        L13:
            g4.m0 r0 = new g4.m0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f5222l
            int r1 = r0.f5224n
            r2 = 2
            r3 = 1
            r4 = 0
            u6.a r5 = u6.a.f10762a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p6.a.e(r10)
            goto L6a
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            return r4
        L31:
            java.lang.String r9 = r0.f5221b
            android.net.Uri r8 = r0.f5220a
            p6.a.e(r10)
            goto L54
        L39:
            p6.a.e(r10)
            v7.e r10 = o7.m0.f8288a
            p7.c r10 = t7.n.f10348a
            c4.g r1 = new c4.g
            r6 = 11
            r1.<init>(r7, r4, r6)
            r0.f5220a = r8
            r0.f5221b = r9
            r0.f5224n = r3
            java.lang.Object r10 = o7.c0.C(r1, r10, r0)
            if (r10 != r5) goto L54
            goto L69
        L54:
            v7.e r10 = o7.m0.f8288a
            v7.d r10 = v7.d.f10884a
            g4.l0 r1 = new g4.l0
            r1.<init>(r9, r7, r8, r4)
            r0.f5220a = r4
            r0.f5221b = r4
            r0.f5224n = r2
            java.lang.Object r7 = o7.c0.C(r1, r10, r0)
            if (r7 != r5) goto L6a
        L69:
            return r5
        L6a:
            p6.x r7 = p6.x.f8463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.C(com.uptodown.core.activities.InstallerActivity, android.net.Uri, java.lang.String, v6.c):java.lang.Object");
    }

    public final void D() {
        Activity activity = c.f4875o;
        f.f(this, null);
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file != null && file.exists()) {
                    file.delete();
                }
            }
        }
        finish();
    }

    public final void E() {
        TextView textView;
        InstallerActivity installerActivity;
        String str;
        ImageView imageView;
        setContentView(2131558583);
        try {
            this.Z = false;
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                this.T = data;
                if (data != null) {
                    this.Q = d.b(data, this);
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (extras.containsKey("realPath")) {
                        this.S = extras.getString("realPath");
                    }
                    if (extras.containsKey("newFeatures")) {
                        this.f3396c0 = extras.getString("newFeatures");
                    }
                    if (extras.containsKey("requireUserAction")) {
                        this.f3397d0 = extras.getBoolean("requireUserAction");
                    }
                    if (extras.containsKey("notificationId")) {
                        int i = extras.getInt("notificationId");
                        Object systemService = getSystemService("notification");
                        systemService.getClass();
                        ((NotificationManager) systemService).cancel(i);
                    }
                    if (extras.containsKey("backgroundInstallation")) {
                        this.f3398e0 = extras.getBoolean("backgroundInstallation");
                    }
                }
            }
            this.a0 = (LinearLayout) findViewById(2131362675);
            ImageView imageView2 = (ImageView) findViewById(2131362367);
            this.P = imageView2;
            imageView2.getClass();
            imageView2.setOnClickListener(new a0(this, 5));
            this.O = (ImageView) findViewById(2131362412);
            TextView textView2 = (TextView) findViewById(2131363643);
            this.E = textView2;
            if (textView2 != null) {
                textView2.setTypeface(c.f4882w);
            }
            String str2 = this.Q;
            if (str2 != null) {
                TextView textView3 = this.G;
                if (textView3 != null) {
                    textView3.setText(str2);
                }
                String str3 = this.Q;
                str3.getClass();
                if (u.k0(str3, ".apk", false)) {
                    ImageView imageView3 = this.O;
                    if (imageView3 != null) {
                        imageView3.setImageResource(2131230918);
                    }
                } else {
                    String str4 = this.Q;
                    str4.getClass();
                    if (u.k0(str4, ".xapk", false) && (imageView = this.O) != null) {
                        imageView.setImageResource(2131230965);
                    }
                }
            } else {
                String str5 = this.S;
                if (str5 != null && (textView = this.G) != null) {
                    str5.getClass();
                    textView.setText(str5.substring(m.A0("/", str5, 6) + 1));
                }
            }
            this.F = (LinearLayout) findViewById(2131362670);
            TextView textView4 = (TextView) findViewById(2131363873);
            if (textView4 != null) {
                textView4.setTypeface(c.f4883x);
            }
            TextView textView5 = (TextView) findViewById(2131363872);
            this.G = textView5;
            if (textView5 != null) {
                textView5.setTypeface(c.f4882w);
            }
            TextView textView6 = (TextView) findViewById(2131364309);
            if (textView6 != null) {
                textView6.setTypeface(c.f4883x);
            }
            TextView textView7 = (TextView) findViewById(2131364307);
            this.H = textView7;
            if (textView7 != null) {
                textView7.setTypeface(c.f4882w);
            }
            TextView textView8 = (TextView) findViewById(2131364569);
            if (textView8 != null) {
                textView8.setTypeface(c.f4883x);
            }
            TextView textView9 = (TextView) findViewById(2131364568);
            this.I = textView9;
            if (textView9 != null) {
                textView9.setTypeface(c.f4882w);
            }
            ProgressBar progressBar = (ProgressBar) findViewById(2131363000);
            this.f3403y = progressBar;
            progressBar.getClass();
            progressBar.setInterpolator(new AccelerateDecelerateInterpolator());
            TextView textView10 = (TextView) findViewById(2131364016);
            this.f3404z = textView10;
            if (textView10 != null) {
                textView10.setTypeface(c.f4883x);
            }
            TextView textView11 = (TextView) findViewById(2131364018);
            this.L = textView11;
            if (textView11 != null) {
                textView11.setTypeface(c.f4883x);
            }
            TextView textView12 = (TextView) findViewById(2131363911);
            this.M = textView12;
            if (textView12 != null) {
                textView12.setTypeface(c.f4882w);
            }
            TextView textView13 = this.M;
            if (textView13 != null) {
                textView13.setVisibility(8);
            }
            TextView textView14 = this.M;
            if (textView14 != null) {
                textView14.setOnClickListener(new a0(this, 6));
            }
            TextView textView15 = (TextView) findViewById(2131363699);
            this.N = textView15;
            if (textView15 != null) {
                textView15.setTypeface(c.f4882w);
            }
            TextView textView16 = this.N;
            if (textView16 != null) {
                textView16.setVisibility(8);
            }
            TextView textView17 = this.N;
            if (textView17 != null) {
                textView17.setOnClickListener(new a0(this, 7));
            }
            String str6 = this.f3396c0;
            if (str6 == null || str6.length() == 0) {
                installerActivity = this;
            } else {
                TextView textView18 = this.f3404z;
                textView18.getClass();
                textView18.setVisibility(8);
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                LinearLayout linearLayout = (LinearLayout) findViewById(2131362738);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(2131362774);
                TextView textView19 = (TextView) findViewById(2131364572);
                ImageView imageView4 = (ImageView) findViewById(2131362547);
                textView19.setTypeface(c.f4882w);
                TextView textView20 = (TextView) findViewById(2131364573);
                textView20.setTypeface(c.f4883x);
                textView20.setText(this.f3396c0);
                textView20.setVisibility(8);
                linearLayout2.setVisibility(0);
                installerActivity = this;
                try {
                    linearLayout.setOnClickListener(new f0(uVar, textView19, installerActivity, imageView4, textView20));
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    return;
                }
            }
            installerActivity.Y = new i(this, 28);
            installerActivity.W = J();
            if (installerActivity.T == null || (str = installerActivity.Q) == null || !(u.k0(str, ".apk", true) || u.k0(str, ".xapk", true) || u.k0(str, ".apks", true) || u.k0(str, ".apkm", true) || u.k0(str, ".zip", true))) {
                L(installerActivity.S);
                return;
            }
            Uri uri = installerActivity.T;
            uri.getClass();
            String str7 = installerActivity.Q;
            str7.getClass();
            e eVar = m0.f8288a;
            c0.s(c0.b(v7.d.f10884a), null, null, new l0(this, uri, str7, (t6.c) null), 3);
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void F(File file) {
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        n4.h hVar = new n4.h(applicationContext);
        hVar.f7969b = this.f3397d0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        e eVar = m0.f8288a;
        c0.s(c0.b(v7.d.f10884a), null, null, new ya(hVar, arrayList, (t6.c) null, 21), 3);
    }

    public final void G(Activity activity, final File file) {
        a aVar = new a(activity);
        final int i = 0;
        boolean zC = aVar.c("device_rooted", false);
        boolean zC2 = aVar.c("system_app", false);
        if (!this.Z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            if (I(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(file);
                N(arrayList2);
                return;
            }
        }
        if (!zC && !zC2) {
            F(file);
            return;
        }
        final int i6 = 1;
        if (!aVar.c("user_asked_for_show_permissions", false)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(2131952803));
            builder.setMessage(2131952270);
            builder.setCancelable(false);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(this) { // from class: g4.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InstallerActivity f5152b;

                {
                    this.f5152b = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    int i11 = i;
                    File file2 = file;
                    InstallerActivity installerActivity = this.f5152b;
                    switch (i11) {
                        case 0:
                            int i12 = InstallerActivity.f3394j0;
                            h4.a aVar2 = new h4.a(installerActivity);
                            aVar2.i(true);
                            aVar2.e("install_apk_as_root_system", true);
                            installerActivity.G(installerActivity, file2);
                            break;
                        default:
                            int i13 = InstallerActivity.f3394j0;
                            h4.a aVar3 = new h4.a(installerActivity);
                            aVar3.i(true);
                            aVar3.e("install_apk_as_root_system", false);
                            installerActivity.G(installerActivity, file2);
                            break;
                    }
                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: g4.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InstallerActivity f5152b;

                {
                    this.f5152b = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    int i11 = i6;
                    File file2 = file;
                    InstallerActivity installerActivity = this.f5152b;
                    switch (i11) {
                        case 0:
                            int i12 = InstallerActivity.f3394j0;
                            h4.a aVar2 = new h4.a(installerActivity);
                            aVar2.i(true);
                            aVar2.e("install_apk_as_root_system", true);
                            installerActivity.G(installerActivity, file2);
                            break;
                        default:
                            int i13 = InstallerActivity.f3394j0;
                            h4.a aVar3 = new h4.a(installerActivity);
                            aVar3.i(true);
                            aVar3.e("install_apk_as_root_system", false);
                            installerActivity.G(installerActivity, file2);
                            break;
                    }
                }
            });
            builder.create().show();
            return;
        }
        if (!aVar.c("install_apk_as_root_system", false)) {
            F(file);
            return;
        }
        t6.c cVar = null;
        if (aVar.c("device_rooted", false)) {
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            c0.s(c0.b(m0.f8288a), null, null, new g(absolutePath, activity, this.f3402i0, cVar, 19), 3);
            return;
        }
        if (aVar.c("system_app", false)) {
            q qVar = new q(i6, activity, this.f3401h0);
            e eVar = m0.f8288a;
            c0.s(c0.b(v7.d.f10884a), null, null, new ya(qVar, file, cVar, 22), 3);
        }
    }

    public final void H(Activity activity, ArrayList arrayList) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        activity.getClass();
        int i = 0;
        try {
            sharedPreferences3 = activity.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences3.contains("device_rooted") ? sharedPreferences3.getBoolean("device_rooted", false) : false;
        try {
            sharedPreferences2 = activity.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused2) {
        }
        boolean z10 = sharedPreferences2.contains("system_app") ? sharedPreferences2.getBoolean("system_app", false) : false;
        if (!this.Z && I(arrayList)) {
            N(arrayList);
            return;
        }
        int i6 = 1;
        if (z9 || z10) {
            try {
                sharedPreferences = activity.getSharedPreferences("CoreSettings", 0);
            } catch (Exception unused3) {
            }
            boolean z11 = sharedPreferences.contains("user_asked_for_show_permissions") ? sharedPreferences.getBoolean("user_asked_for_show_permissions", false) : false;
            if (!z11) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(getString(2131952803));
                builder.setMessage(2131952270);
                builder.setCancelable(false);
                builder.setPositiveButton(R.string.ok, new g4.c0(this, arrayList, i));
                builder.setNegativeButton(R.string.cancel, new g4.c0(this, arrayList, i6));
                builder.create().show();
                return;
            }
        }
        if (!this.f3398e0) {
            runOnUiThread(new e0(this, i6));
        }
        new n4.h(activity).k(arrayList, this.f3397d0);
    }

    public final boolean I(ArrayList arrayList) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences.contains("warn_installed") ? sharedPreferences.getBoolean("warn_installed", true) : true) {
            try {
                if (arrayList.size() == 1) {
                    String name = ((File) arrayList.get(0)).getName();
                    name.getClass();
                    if (u.k0(name, ".apk", false)) {
                        PackageManager packageManager = getPackageManager();
                        packageManager.getClass();
                        String absolutePath = ((File) arrayList.get(0)).getAbsolutePath();
                        absolutePath.getClass();
                        PackageInfo packageInfoD = n4.i.d(packageManager, absolutePath, 0);
                        if (packageInfoD != null) {
                            PackageManager packageManager2 = getPackageManager();
                            packageManager2.getClass();
                            String str = packageInfoD.packageName;
                            str.getClass();
                            if (d.d(n4.i.e(packageManager2, str, 0)) == d.d(packageInfoD)) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public final ArrayList J() {
        String string = getString(2131951718);
        string.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            String[] stringArray = getResources().getStringArray(2130903046);
            stringArray.getClass();
            for (String str : stringArray) {
                str.getClass();
                if (str.length() > 0) {
                    if (m.q0(str, "%s", false)) {
                        arrayList.add(u.o0(str, "%s", string, false));
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            String[] stringArray2 = getResources().getStringArray(2130903047);
            stringArray2.getClass();
            for (String str2 : stringArray2) {
                str2.getClass();
                if (str2.length() > 0) {
                    if (m.q0(str2, "%s", false)) {
                        arrayList.add(u.o0(str2, "%s", string, false));
                    } else {
                        arrayList.add(str2);
                    }
                }
            }
            return arrayList;
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x069b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.io.File r20, java.util.ArrayList r21) {
        /*
            Method dump skipped, instruction units count: 2276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.K(java.io.File, java.util.ArrayList):void");
    }

    public final void L(String str) {
        if (str == null || !new File(str).exists()) {
            String string = getString(2131952085);
            string.getClass();
            A(string);
            finish();
            return;
        }
        if (new File(str).isDirectory()) {
            ArrayList arrayList = new ArrayList();
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                r.l0(arrayList, fileArrListFiles);
                K(null, arrayList);
                return;
            }
            return;
        }
        if (u.k0(str, ".xapk", true) || u.k0(str, ".apks", true) || u.k0(str, ".apkm", true) || u.k0(str, ".zip", true)) {
            i iVar = this.Y;
            iVar.getClass();
            new t(this, str, iVar, m());
        } else {
            if (u.k0(str, ".apk", false)) {
                G(this, new File(str));
                return;
            }
            String string2 = getString(2131952085);
            string2.getClass();
            A(string2);
            finish();
        }
    }

    public final void M(String str) {
        str.getClass();
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(str);
        }
        ProgressBar progressBar = this.f3403y;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
        getWindow().clearFlags(128);
        s1 s1Var = this.X;
        if (s1Var != null) {
            s1Var.c(null);
        }
        TextView textView2 = this.f3404z;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        TextView textView3 = this.N;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        TextView textView4 = this.N;
        if (textView4 != null) {
            textView4.setOnClickListener(new a0(this, 4));
        }
        A(str);
    }

    public final void N(ArrayList arrayList) {
        android.app.AlertDialog alertDialog;
        android.app.AlertDialog alertDialog2 = this.V;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            android.app.AlertDialog alertDialog3 = this.V;
            alertDialog3.getClass();
            alertDialog3.dismiss();
        }
        View viewInflate = getLayoutInflater().inflate(2131558509, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(2131364017)).setTypeface(c.f4883x);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(2131362005);
        checkBox.setTypeface(c.f4883x);
        TextView textView = (TextView) viewInflate.findViewById(2131363907);
        textView.setTypeface(c.f4882w);
        textView.setOnClickListener(new c4.t(this, checkBox, arrayList, 12));
        TextView textView2 = (TextView) viewInflate.findViewById(2131363688);
        textView2.setTypeface(c.f4882w);
        textView2.setOnClickListener(new a0(this, 1));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(viewInflate);
        builder.setCancelable(false);
        android.app.AlertDialog alertDialogCreate = builder.create();
        this.V = alertDialogCreate;
        Window window = alertDialogCreate != null ? alertDialogCreate.getWindow() : null;
        window.getClass();
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (isFinishing() || (alertDialog = this.V) == null) {
            return;
        }
        alertDialog.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (o7.c0.C(r4, r12, r0) == r10) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(int r12, v6.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof g4.o0
            if (r0 == 0) goto L13
            r0 = r13
            g4.o0 r0 = (g4.o0) r0
            int r1 = r0.f5237n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5237n = r1
            goto L18
        L13:
            g4.o0 r0 = new g4.o0
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f5235l
            int r1 = r0.f5237n
            r2 = 2
            r3 = 1
            r8 = 0
            u6.a r10 = u6.a.f10762a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2b
            p6.a.e(r13)
            goto L72
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r12)
            r12 = 0
            return r12
        L32:
            int r12 = r0.f5233a
            kotlin.jvm.internal.x r1 = r0.f5234b
            p6.a.e(r13)
        L39:
            r6 = r12
            r7 = r1
            goto L5a
        L3c:
            p6.a.e(r13)
            kotlin.jvm.internal.x r1 = new kotlin.jvm.internal.x
            r1.<init>()
            v7.e r13 = o7.m0.f8288a
            v7.d r13 = v7.d.f10884a
            g4.n0 r4 = new g4.n0
            r4.<init>(r11, r1, r8, r3)
            r0.f5234b = r1
            r0.f5233a = r12
            r0.f5237n = r3
            java.lang.Object r13 = o7.c0.C(r4, r13, r0)
            if (r13 != r10) goto L39
            goto L71
        L5a:
            v7.e r12 = o7.m0.f8288a
            p7.c r12 = t7.n.f10348a
            c4.ya r4 = new c4.ya
            r9 = 6
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f5234b = r8
            r0.f5233a = r6
            r0.f5237n = r2
            java.lang.Object r12 = o7.c0.C(r4, r12, r0)
            if (r12 != r10) goto L72
        L71:
            return r10
        L72:
            p6.x r12 = p6.x.f8463a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.O(int, v6.c):java.lang.Object");
    }

    @Override // g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        f4.a aVar = f4.a.f4869a;
        int i = 1;
        t6.c cVar = null;
        if (aVar.c() == null && c.v == null) {
            E();
        } else {
            setContentView(2131558584);
            this.f3395b0 = true;
            f4.a.f4872d.n(l.f7119a);
            TextView textView2 = (TextView) findViewById(2131363896);
            this.A = textView2;
            textView2.getClass();
            textView2.setTypeface(c.f4882w);
            this.B = (ImageView) findViewById(2131362293);
            TextView textView3 = (TextView) findViewById(2131363655);
            this.C = textView3;
            textView3.getClass();
            textView3.setTypeface(c.f4882w);
            TextView textView4 = (TextView) findViewById(2131363654);
            this.D = textView4;
            textView4.getClass();
            textView4.setTypeface(c.f4883x);
            TextView textView5 = (TextView) findViewById(2131363913);
            this.J = textView5;
            textView5.getClass();
            textView5.setTypeface(c.f4883x);
            TextView textView6 = (TextView) findViewById(2131363699);
            this.N = textView6;
            textView6.getClass();
            textView6.setTypeface(c.f4882w);
            TextView textView7 = this.N;
            textView7.getClass();
            textView7.setOnClickListener(new a0(this, 0));
            TextView textView8 = (TextView) findViewById(2131363911);
            this.M = textView8;
            textView8.getClass();
            textView8.setTypeface(c.f4882w);
            TextView textView9 = this.M;
            textView9.getClass();
            textView9.setOnClickListener(new a0(this, 3));
            this.f3403y = (ProgressBar) findViewById(2131363000);
            TextView textView10 = (TextView) findViewById(2131363912);
            this.K = textView10;
            textView10.getClass();
            textView10.setTypeface(c.f4883x);
            l4.a aVarC = aVar.c();
            String str = aVarC != null ? aVarC.f7097c : null;
            if (str != null && (textView = this.K) != null) {
                textView.setText(str);
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f3400g0);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k0(this, cVar, i), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        s1 s1Var = this.X;
        if (s1Var != null) {
            s1Var.c(null);
        }
        getWindow().clearFlags(128);
    }

    @Override // g4.h
    public final void w() {
        i iVar;
        if (!m() || new File("/Android/obb").canRead() || (iVar = this.Y) == null) {
            return;
        }
        iVar.t();
    }

    @Override // g4.h
    public final void p() {
    }

    @Override // g4.h
    public final void q() {
    }

    @Override // g4.h
    public final void r() {
    }

    @Override // g4.h
    public final void s() {
    }

    @Override // g4.h
    public final void u() {
    }
}
