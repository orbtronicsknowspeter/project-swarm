package a3;

import a4.u;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import b2.t1;
import c4.t0;
import c4.t4;
import c4.v8;
import c4.w4;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.FeedActivity;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.PublicListActivity;
import com.uptodown.activities.RecommendedActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.core.activities.FileExplorerActivity;
import e1.b3;
import e1.f4;
import e1.g1;
import e1.g2;
import e1.j2;
import e1.u4;
import e1.w0;
import e1.y0;
import e1.z4;
import e4.h0;
import e4.j0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import o7.a0;
import o7.c0;
import o7.m0;
import t7.n;
import w4.g;
import w4.h;
import w4.k;
import w4.p;
import x4.d1;
import x4.d2;
import x4.k2;
import x4.r;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h, w4.b, p, k, w4.c, g, z4, y0, j1.d, k4.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile d f61l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f63b;

    public d(int i) {
        this.f62a = i;
        switch (i) {
            case 20:
                Map map = Collections.EMPTY_MAP;
                this.f63b = Collections.EMPTY_LIST;
                break;
            case 21:
                this.f63b = new androidx.lifecycle.k(11);
                break;
            case 27:
                this.f63b = new ConcurrentHashMap(16);
                break;
            default:
                this.f63b = new HashSet();
                break;
        }
    }

    public static String F(Calendar calendar) {
        return String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }

    public static d I(String str) {
        return new d((TextUtils.isEmpty(str) || str.length() > 1) ? g2.UNINITIALIZED : j2.e(str.charAt(0)), 22);
    }

    public static String q(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // w4.g
    public void A(String str) {
        switch (this.f62a) {
            case 12:
                ((PublicListActivity) this.f63b).N(str);
                break;
            case 13:
                ((RecommendedActivity) this.f63b).N(str);
                break;
            default:
                ((WishlistActivity) this.f63b).N(str);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.m B(com.google.gson.reflect.TypeToken r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.d.B(com.google.gson.reflect.TypeToken, boolean):com.google.gson.internal.m");
    }

    public Set C() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f63b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f63b);
        }
        return setUnmodifiableSet;
    }

    public void D(int i) {
        RepliesActivity repliesActivity = (RepliesActivity) this.f63b;
        float f = UptodownApp.I;
        if (b4.d.t() && repliesActivity.T()) {
            if (u2.h(repliesActivity) == null) {
                String string = repliesActivity.getString(R.string.login_required_follow_title);
                string.getClass();
                String string2 = repliesActivity.getString(R.string.login_required_follow_msg);
                string2.getClass();
                t1.v(repliesActivity, string, string2);
                return;
            }
            if (i == -1 && repliesActivity.z0().f2220m.getValue() != null) {
                Object value = repliesActivity.z0().f2220m.getValue();
                value.getClass();
                String str = ((k2) value).f11260b;
                if (str != null && str.length() != 0) {
                    v8 v8VarZ0 = repliesActivity.z0();
                    Object value2 = repliesActivity.z0().f2220m.getValue();
                    value2.getClass();
                    int i6 = ((k2) value2).f11272x;
                    Object value3 = repliesActivity.z0().f2220m.getValue();
                    value3.getClass();
                    String str2 = ((k2) value3).f11260b;
                    str2.getClass();
                    v8VarZ0.a(repliesActivity, i6, str2);
                    return;
                }
            }
            if (repliesActivity.Q != null) {
                v8 v8VarZ02 = repliesActivity.z0();
                h0 h0Var = repliesActivity.Q;
                h0Var.getClass();
                int i10 = ((d2) h0Var.f4550a.get(i)).f11119u;
                h0 h0Var2 = repliesActivity.Q;
                h0Var2.getClass();
                String str3 = ((d2) h0Var2.f4550a.get(i)).f11110l;
                str3.getClass();
                v8VarZ02.a(repliesActivity, i10, str3);
            }
        }
    }

    public void E(int i) {
        w4 w4Var = (w4) this.f63b;
        TextView textView = w4Var.Q;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        }
        ProgressBar progressBar = w4Var.O;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    public void G() {
        f4 f4Var = (f4) this.f63b;
        f4Var.g();
        e1.t1 t1Var = f4Var.f3876a;
        g1 g1Var = t1Var.f4264n;
        e1.t1.k(g1Var);
        t1Var.f4270t.getClass();
        if (g1Var.q(System.currentTimeMillis())) {
            g1 g1Var2 = t1Var.f4264n;
            e1.t1.k(g1Var2);
            g1Var2.f3991u.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                w0 w0Var = t1Var.f4265o;
                e1.t1.m(w0Var);
                w0Var.f4347w.b("Detected application was in foreground");
                J(System.currentTimeMillis());
            }
        }
    }

    public void H(long j) {
        f4 f4Var = (f4) this.f63b;
        f4Var.g();
        f4Var.k();
        e1.t1 t1Var = f4Var.f3876a;
        g1 g1Var = t1Var.f4264n;
        e1.t1.k(g1Var);
        if (g1Var.q(j)) {
            e1.t1.k(g1Var);
            g1Var.f3991u.b(true);
            t1Var.r().l();
        }
        e1.t1.k(g1Var);
        g1Var.f3994y.b(j);
        if (g1Var.f3991u.a()) {
            J(j);
        }
    }

    public void J(long j) {
        f4 f4Var = (f4) this.f63b;
        f4Var.g();
        e1.t1 t1Var = f4Var.f3876a;
        if (t1Var.d()) {
            g1 g1Var = t1Var.f4264n;
            e1.t1.k(g1Var);
            g1Var.f3994y.b(j);
            t1Var.f4270t.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            w0 w0Var = t1Var.f4265o;
            e1.t1.m(w0Var);
            w0Var.f4347w.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j6 = j / 1000;
            Long lValueOf = Long.valueOf(j6);
            b3 b3Var = t1Var.v;
            e1.t1.l(b3Var);
            b3Var.r(j, lValueOf, "auto", "_sid");
            e1.t1.k(g1Var);
            g1Var.f3995z.b(j6);
            g1Var.f3991u.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j6);
            e1.t1.l(b3Var);
            b3Var.o(j, bundle, "auto", "_s");
            String strN = g1Var.E.n();
            if (TextUtils.isEmpty(strN)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strN);
            e1.t1.l(b3Var);
            b3Var.o(j, bundle2, "auto", "_ssr");
        }
    }

    @Override // e1.z4
    public void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        b3 b3Var = (b3) this.f63b;
        if (zIsEmpty) {
            b3Var.f3876a.f4270t.getClass();
            b3Var.l("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            b3Var.getClass();
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Unexpected call on client side");
        }
    }

    @Override // w4.b
    public void b(int i) {
        e4.e eVar;
        x4.e eVar2;
        String str;
        j0 j0Var;
        int i6 = this.f62a;
        Object obj = this.f63b;
        switch (i6) {
            case 6:
                FreeUpSpaceActivity freeUpSpaceActivity = (FreeUpSpaceActivity) obj;
                float f = UptodownApp.I;
                if (b4.d.t() && (eVar = freeUpSpaceActivity.Q) != null && (eVar2 = (x4.e) eVar.a().get(i)) != null && (str = eVar2.f11124l) != null) {
                    Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str)));
                    intent.addFlags(268435456);
                    freeUpSpaceActivity.startActivity(intent);
                    break;
                }
                break;
            default:
                RollbackActivity rollbackActivity = (RollbackActivity) obj;
                float f10 = UptodownApp.I;
                if (b4.d.t() && (j0Var = rollbackActivity.f3347c0) != null && i < j0Var.f4571a.size()) {
                    j0 j0Var2 = rollbackActivity.f3347c0;
                    j0Var2.getClass();
                    if (((x4.e) j0Var2.f4571a.get(i)).F != 0) {
                        j0 j0Var3 = rollbackActivity.f3347c0;
                        j0Var3.getClass();
                        Object obj2 = j0Var3.f4571a.get(i);
                        obj2.getClass();
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(rollbackActivity);
                        v7.e eVar3 = m0.f8289a;
                        c0.s(lifecycleScope, n.f10349a, null, new t4(rollbackActivity, (x4.e) obj2, null, 1), 2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // e1.y0
    public /* synthetic */ void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((u4) this.f63b).A(str, i, th, bArr, map);
    }

    @Override // w4.c
    public void d(x4.g gVar) {
        gVar.getClass();
        float f = UptodownApp.I;
        if (b4.d.t()) {
            ((OrganizationActivity) this.f63b).i0(gVar.f11159a);
        }
    }

    @Override // w4.h
    public void e() {
        FeedActivity feedActivity = (FeedActivity) this.f63b;
        float f = UptodownApp.I;
        if (b4.d.t() && feedActivity.T()) {
            String string = feedActivity.getString(R.string.url_turbo);
            string.getClass();
            j5.c.e(feedActivity, string, feedActivity.getString(R.string.uptodown_turbo));
        }
    }

    @Override // w4.g
    public void g(r rVar) {
        int i = this.f62a;
        Object obj = this.f63b;
        switch (i) {
            case 12:
                float f = UptodownApp.I;
                File fileG = rVar.g();
                fileG.getClass();
                b4.d.q((PublicListActivity) obj, null, fileG);
                break;
            case 13:
                float f10 = UptodownApp.I;
                File fileG2 = rVar.g();
                fileG2.getClass();
                b4.d.q((RecommendedActivity) obj, null, fileG2);
                break;
            default:
                float f11 = UptodownApp.I;
                File fileG3 = rVar.g();
                fileG3.getClass();
                b4.d.q((WishlistActivity) obj, null, fileG3);
                break;
        }
    }

    @Override // w4.k
    public void i() {
        float f = UptodownApp.I;
        if (b4.d.t()) {
            MyApps myApps = (MyApps) this.f63b;
            String string = myApps.getString(R.string.disabled_apps_explanation);
            string.getClass();
            myApps.N(string);
        }
    }

    @Override // w4.h
    public void j(long j) {
        FeedActivity feedActivity = (FeedActivity) this.f63b;
        float f = UptodownApp.I;
        if (b4.d.t() && feedActivity.T()) {
            feedActivity.y0().f9898b.setVisibility(0);
            c0.s(LifecycleOwnerKt.getLifecycleScope(feedActivity), null, null, new c4.c(feedActivity, j, null, 1), 3);
        }
    }

    @Override // k4.a
    public void k(Object obj, int i, int i6, long j) {
        obj.getClass();
        boolean z9 = obj instanceof File;
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f63b;
        if (z9) {
            FileExplorerActivity.J(fileExplorerActivity, ((File) obj).getName(), i, i6, j);
        } else if (obj instanceof DocumentFile) {
            FileExplorerActivity.J(fileExplorerActivity, ((DocumentFile) obj).getName(), i, i6, j);
        } else {
            FileExplorerActivity.J(fileExplorerActivity, fileExplorerActivity.getString(R.string.copying), i, i6, j);
        }
    }

    @Override // w4.p
    public void l() {
        MainActivity mainActivity = (MainActivity) this.f63b;
        mainActivity.t1();
        mainActivity.r1();
    }

    @Override // k4.a
    public void m(File file) {
        file.getClass();
    }

    @Override // k4.a
    public void o(int i, String str, long j, long j6) {
        str.getClass();
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f63b;
        AlertDialog alertDialog = fileExplorerActivity.f5177a;
        if (alertDialog == null || alertDialog.findViewById(R.id.pb_dialog_copying) == null) {
            return;
        }
        AlertDialog alertDialog2 = fileExplorerActivity.f5177a;
        alertDialog2.getClass();
        ((ProgressBar) alertDialog2.findViewById(R.id.pb_dialog_copying)).setProgress(i);
        AlertDialog alertDialog3 = fileExplorerActivity.f5177a;
        alertDialog3.getClass();
        ((TextView) alertDialog3.findViewById(R.id.tv_size_dialog_copying)).setText(fileExplorerActivity.getString(R.string.size_of_total_size, i5.G(j), i5.G(j6)));
        AlertDialog alertDialog4 = fileExplorerActivity.f5177a;
        alertDialog4.getClass();
        ((TextView) alertDialog4.findViewById(R.id.tv_percentage_dialog_copying)).setText(i + fileExplorerActivity.getString(R.string.percentage));
        AlertDialog alertDialog5 = fileExplorerActivity.f5177a;
        alertDialog5.getClass();
        ((TextView) alertDialog5.findViewById(R.id.tv_files_dialog_copying)).setText(str);
    }

    @Override // w4.g
    public void p(String str) {
        int i = this.f62a;
        str.getClass();
        switch (i) {
            case 12:
                j5.c.e((PublicListActivity) this.f63b, str, null);
                break;
            case 13:
                j5.c.e((RecommendedActivity) this.f63b, str, null);
                break;
            default:
                j5.c.e((WishlistActivity) this.f63b, str, null);
                break;
        }
    }

    @Override // k4.a
    public void r(File file) {
        file.getClass();
    }

    @Override // j1.d
    public void s(j1.p pVar) {
        ((CountDownLatch) this.f63b).countDown();
    }

    @Override // w4.h
    public void t(long j, String str) {
        FeedActivity feedActivity = (FeedActivity) this.f63b;
        float f = UptodownApp.I;
        if (b4.d.t() && feedActivity.T()) {
            w2 w2Var = new w2();
            w2Var.f11432a = String.valueOf(j);
            w2Var.f11435m = str;
            Intent intent = new Intent(feedActivity, (Class<?>) PublicListActivity.class);
            intent.putExtra("user", w2Var);
            feedActivity.startActivity(intent, b4.d.a(feedActivity));
        }
    }

    public String toString() {
        switch (this.f62a) {
            case 20:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    @Override // w4.g
    public void u(r rVar) {
        switch (this.f62a) {
            case 12:
                ((PublicListActivity) this.f63b).P0(rVar != null ? rVar.f11356b : null);
                break;
            case 13:
                ((RecommendedActivity) this.f63b).Q0(rVar != null ? rVar.f11356b : null);
                break;
            default:
                ((WishlistActivity) this.f63b).Q0(rVar != null ? rVar.f11356b : null);
                break;
        }
    }

    @Override // w4.h
    public void v(d1 d1Var) {
        FeedActivity feedActivity = (FeedActivity) this.f63b;
        float f = UptodownApp.I;
        if (b4.d.t() && feedActivity.T()) {
            k2 k2Var = new k2();
            k2Var.f11259a = d1Var.A;
            k2Var.f11260b = String.valueOf(d1Var.f11102t);
            k2Var.f11261l = d1Var.f11095m;
            k2Var.f11271w = d1Var.f11101s;
            k2Var.f11264o = d1Var.f11103u;
            k2Var.v = d1Var.f11098p;
            k2Var.f11265p = d1Var.v;
            k2Var.f11262m = d1Var.f11099q;
            k2Var.f11267r = d1Var.f11100r;
            k2Var.f11270u = d1Var.C;
            k2Var.f11268s = d1Var.G;
            k2Var.f11272x = 1;
            k2Var.f11263n = d1Var.B;
            Intent intent = new Intent(feedActivity, (Class<?>) RepliesActivity.class);
            intent.putExtra("review", k2Var);
            intent.putExtra("appId", d1Var.B);
            intent.putExtra("appName", d1Var.C);
            intent.putExtra("appIconUrl", d1Var.F);
            intent.putExtra("appUrl", d1Var.D);
            feedActivity.startActivity(intent, b4.d.a(feedActivity));
        }
    }

    @Override // w4.h
    public void w(long j) {
        FeedActivity feedActivity = (FeedActivity) this.f63b;
        float f = UptodownApp.I;
        if (b4.d.t() && feedActivity.T()) {
            t0 t0VarZ0 = feedActivity.z0();
            String strValueOf = String.valueOf(j);
            t0VarZ0.getClass();
            strValueOf.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(t0VarZ0);
            v7.e eVar = m0.f8289a;
            c0.s(viewModelScope, v7.d.f10885a, null, new b6.g(t0VarZ0, feedActivity, strValueOf, (t6.c) null, 4), 2);
        }
    }

    @Override // k4.a
    public void x(Object obj) {
        obj.getClass();
    }

    @Override // k4.a
    public void y() {
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f63b;
        fileExplorerActivity.f3385f0 = null;
        fileExplorerActivity.U();
        fileExplorerActivity.W(true);
        AlertDialog alertDialog = fileExplorerActivity.f5177a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        fileExplorerActivity.f5177a = null;
    }

    @Override // w4.h
    public void z(long j, String str) {
        float f = UptodownApp.I;
        if (b4.d.t()) {
            ((FeedActivity) this.f63b).j0(j, str);
        }
    }

    @Override // k4.a
    public void f(DocumentFile documentFile) {
    }

    @Override // k4.a
    public void n(DocumentFile documentFile) {
    }

    public d(Context context) {
        this.f62a = 1;
        StringBuilder sb = a4.t0.f177a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f63b = new u((int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7));
    }

    public /* synthetic */ d(Object obj, int i) {
        this.f62a = i;
        this.f63b = obj;
    }
}
