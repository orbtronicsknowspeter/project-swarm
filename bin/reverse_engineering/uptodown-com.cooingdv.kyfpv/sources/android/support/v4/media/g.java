package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import c4.k0;
import c4.rc;
import c4.w4;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.z3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inmobi.cmp.data.model.ChoiceColor;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.UserDeviceDetailsActivity;
import com.uptodown.activities.UserDevicesActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import com.uptodown.views.FullHeightImageView;
import e1.b3;
import e1.f0;
import e1.f4;
import e1.g1;
import e1.j4;
import e1.o2;
import e1.t1;
import e1.w0;
import g0.m;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j1.p;
import j5.r;
import j5.s;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k0.y;
import kotlin.jvm.internal.x;
import o7.c0;
import org.json.JSONObject;
import w4.o;
import x4.d3;
import x4.g2;
import x4.l2;
import x4.z2;
import y1.n;
import y1.q;
import y1.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public class g implements k4.c, k4.a, o, j1.a, j1.h, h2.a, j1.d, a4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f247b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f248l;

    public g(Context context, int i) {
        this.f246a = i;
        switch (i) {
            case 24:
                y.g(context);
                Resources resources = context.getResources();
                this.f247b = resources;
                this.f248l = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
            default:
                this.f247b = context;
                if (context != null) {
                    u1.c cVar = (u1.c) n1.f.c().b(u1.c.class);
                    if (cVar == null) {
                        com.google.gson.internal.a.i("FirebaseCrashlytics component is not present.");
                        throw null;
                    }
                    boolean zP = z3.p(context, "gdpr_crashlytics_allowed", false);
                    q qVar = cVar.f10399a;
                    Boolean boolValueOf = Boolean.valueOf(zP);
                    t tVar = qVar.f11661b;
                    synchronized (tVar) {
                        tVar.f = false;
                        tVar.g = boolValueOf;
                        SharedPreferences.Editor editorEdit = tVar.f11680a.edit();
                        editorEdit.putBoolean("firebase_crashlytics_collection_enabled", zP);
                        editorEdit.apply();
                        synchronized (tVar.f11682c) {
                            try {
                                boolean zA = tVar.a();
                                boolean z9 = tVar.f11684e;
                                if (zA) {
                                    if (!z9) {
                                        tVar.f11683d.c(null);
                                        tVar.f11684e = true;
                                    }
                                } else if (z9) {
                                    tVar.f11683d = new j1.i();
                                    tVar.f11684e = false;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
                    this.f248l = firebaseAnalytics;
                    if (z3.p(context, "gdpr_analytics_allowed", false)) {
                        if (firebaseAnalytics != null) {
                            k1 k1Var = firebaseAnalytics.f3072a;
                            Boolean bool = Boolean.TRUE;
                            k1Var.getClass();
                            k1Var.a(new x0(k1Var, bool));
                            return;
                        }
                        return;
                    }
                    if (firebaseAnalytics != null) {
                        k1 k1Var2 = firebaseAnalytics.f3072a;
                        Boolean bool2 = Boolean.FALSE;
                        k1Var2.getClass();
                        k1Var2.a(new x0(k1Var2, bool2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public static final boolean b(g gVar, String str) {
        m4.b bVar = (m4.b) gVar.f248l;
        b4.g gVar2 = (b4.g) gVar.f247b;
        try {
            Socket socket = bVar.f7284d;
            if (socket == null) {
                gVar2.f1004a.b();
                return false;
            }
            if (socket.isClosed()) {
                gVar2.f1004a.b();
                return false;
            }
            Socket socket2 = bVar.f7284d;
            socket2.getClass();
            DataOutputStream dataOutputStream = new DataOutputStream(socket2.getOutputStream());
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            return true;
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
            gVar2.f1004a.b();
            return false;
        } catch (IOException e11) {
            e11.printStackTrace();
            gVar2.f1004a.b();
            return false;
        } catch (Exception e12) {
            e12.printStackTrace();
            gVar2.f1004a.b();
            return false;
        }
    }

    public String D(String str) {
        String str2 = (String) this.f248l;
        Resources resources = (Resources) this.f247b;
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(android.os.Bundle r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.g.E(android.os.Bundle, java.lang.String):void");
    }

    public void F(String str, Exception exc) {
        Context context = (Context) this.f247b;
        if (context != null) {
            boolean z9 = false;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("gdpr_crashlytics_allowed")) {
                    z9 = sharedPreferences.getBoolean("gdpr_crashlytics_allowed", false);
                }
            } catch (Exception unused) {
            }
            if (z9) {
                u1.c cVar = (u1.c) n1.f.c().b(u1.c.class);
                if (cVar == null) {
                    com.google.gson.internal.a.i("FirebaseCrashlytics component is not present.");
                    return;
                }
                q qVar = cVar.f10399a;
                z1.e eVar = qVar.f11669o;
                eVar.f11909a.a(new n(0, qVar, str));
                Map map = Collections.EMPTY_MAP;
                eVar.f11909a.a(new n(qVar, exc));
            }
        }
    }

    public void G(String str, Bundle bundle, g2 g2Var, String str2) {
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            bundle = bundle2;
        }
        if (g2Var != null) {
            int i = g2Var.f11205b;
            if (i > 0) {
                bundle.putString("responseCode", String.valueOf(i));
            }
            String str3 = g2Var.f11206c;
            if (str3 != null) {
                bundle.putString("exception", str3);
            }
        }
        if (str2 != null) {
            bundle.putString("workRequest", str2);
        }
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        E(bundle, "tracking");
    }

    public void H(Throwable th) {
        j4 j4Var = (j4) this.f247b;
        b3 b3Var = (b3) this.f248l;
        b3Var.g();
        b3Var.f3816r = false;
        t1 t1Var = b3Var.f3876a;
        e1.g gVar = t1Var.f4263m;
        w0 w0Var = t1Var.f4265o;
        int i = 2;
        if (gVar.q(null, f0.U0)) {
            String message = th.getMessage();
            b3Var.f3820w = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        b3Var.f3820w = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i6 = i - 1;
        if (i6 == 0) {
            t1.m(w0Var);
            w0Var.f4343r.d(w0.o(t1Var.r().m()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", w0.o(th.toString()));
            b3Var.f3817s = 1;
            b3Var.E().add(j4Var);
            return;
        }
        if (i6 != 1) {
            t1.m(w0Var);
            w0Var.f4340o.d(w0.o(t1Var.r().m()), "registerTriggerAsync failed. Dropping URI. App ID, Throwable", th);
            J();
            b3Var.f3817s = 1;
            b3Var.F();
            return;
        }
        b3Var.E().add(j4Var);
        if (b3Var.f3817s > ((Integer) f0.f3963x0.a(null)).intValue()) {
            b3Var.f3817s = 1;
            t1.m(w0Var);
            w0Var.f4343r.d(w0.o(t1Var.r().m()), "registerTriggerAsync failed. May try later. App ID, throwable", w0.o(th.toString()));
            return;
        }
        t1.m(w0Var);
        w0Var.f4343r.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", w0.o(t1Var.r().m()), w0.o(String.valueOf(b3Var.f3817s)), w0.o(th.toString()));
        int i10 = b3Var.f3817s;
        if (b3Var.f3818t == null) {
            b3Var.f3818t = new o2(b3Var, t1Var, 1);
        }
        b3Var.f3818t.b(((long) i10) * 1000);
        int i11 = b3Var.f3817s;
        b3Var.f3817s = i11 + i11;
    }

    public void I(boolean z9, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f247b)) {
            map = new HashMap((Map) this.f247b);
        }
        synchronized (((Map) this.f248l)) {
            map2 = new HashMap((Map) this.f248l);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j1.i) entry2.getKey()).b(new m(status));
            }
        }
    }

    public void J() {
        t1 t1Var = ((b3) this.f248l).f3876a;
        g1 g1Var = t1Var.f4264n;
        t1.k(g1Var);
        SparseArray sparseArrayM = g1Var.m();
        j4 j4Var = (j4) this.f247b;
        sparseArrayM.put(j4Var.f4065l, Long.valueOf(j4Var.f4064b));
        g1 g1Var2 = t1Var.f4264n;
        t1.k(g1Var2);
        int[] iArr = new int[sparseArrayM.size()];
        long[] jArr = new long[sparseArrayM.size()];
        for (int i = 0; i < sparseArrayM.size(); i++) {
            iArr[i] = sparseArrayM.keyAt(i);
            jArr[i] = ((Long) sparseArrayM.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        g1Var2.f3992w.K(bundle);
    }

    @Override // w4.o
    public void a(int i) {
        UserDevicesActivity userDevicesActivity = (UserDevicesActivity) this.f247b;
        Object obj = ((rc) ((r) ((s) this.f248l)).f6708a).f2059b.get(i);
        obj.getClass();
        int i6 = UserDevicesActivity.R;
        Intent intent = new Intent(userDevicesActivity, (Class<?>) UserDeviceDetailsActivity.class);
        intent.putExtra("user_device", (z2) obj);
        ActivityResultLauncher activityResultLauncher = userDevicesActivity.Q;
        float f = UptodownApp.I;
        activityResultLauncher.launch(intent, b4.d.b(userDevicesActivity));
    }

    @Override // k4.c
    public void c(File file, ArrayList arrayList) {
        k0 k0Var = (k0) this.f247b;
        k0Var.r0(file);
        new n4.h(k0Var).k(arrayList, false);
        c0.s(LifecycleOwnerKt.getLifecycleScope(k0Var), null, null, new b.n(k0Var, file, (t6.c) null, 10), 3);
        j5.g gVarL = j5.g.D.l(k0Var);
        gVarL.b();
        String name = file.getName();
        name.getClass();
        x4.r rVarG = gVarL.G(name);
        gVarL.c();
        k0Var.X(rVarG);
    }

    @Override // h2.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        h2.a[] aVarArr = (h2.a[]) this.f247b;
        StackTraceElement[] stackTraceElementArrD = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            h2.a aVar = aVarArr[i];
            if (stackTraceElementArrD.length <= 1024) {
                break;
            }
            stackTraceElementArrD = aVar.d(stackTraceElementArr);
        }
        return stackTraceElementArrD.length > 1024 ? ((e1.c0) this.f248l).d(stackTraceElementArrD) : stackTraceElementArrD;
    }

    @Override // k4.c
    public void e(int i) {
        ((k0) this.f247b).q0((File) this.f248l);
    }

    @Override // k4.a
    public void f(DocumentFile documentFile) {
        int i = this.f246a;
    }

    @Override // j1.a
    public Object g(p pVar) {
        Bundle bundle;
        g0.b bVar = (g0.b) this.f247b;
        Bundle bundle2 = (Bundle) this.f248l;
        bVar.getClass();
        return (pVar.i() && (bundle = (Bundle) pVar.g()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).j(g0.h.f5082l, g0.d.f5077m) : pVar;
    }

    @Override // a4.i
    public void h(Exception exc) {
        int i = this.f246a;
        exc.getClass();
        switch (i) {
            case 28:
                exc.printStackTrace();
                y2.s sVar = ((m5.w0) this.f247b).f7626a;
                l2 l2Var = (l2) this.f248l;
                sVar.getClass();
                ((ArrayList) sVar.f11757l).remove(l2Var);
                e4.k0 k0Var = (e4.k0) ((x) sVar.f11758m).f7025a;
                if (k0Var != null) {
                    k0Var.a(l2Var);
                }
                break;
            default:
                exc.printStackTrace();
                y2.s sVar2 = ((m5.w0) this.f247b).f7626a;
                d3 d3Var = (d3) this.f248l;
                sVar2.getClass();
                ((ArrayList) sVar2.f11759n).remove(d3Var);
                e4.k0 k0Var2 = (e4.k0) ((x) sVar2.f11758m).f7025a;
                if (k0Var2 != null) {
                    k0Var2.a(d3Var);
                }
                break;
        }
    }

    @Override // k4.a
    public void k(Object obj, int i, int i6, long j) {
        int i10 = this.f246a;
        obj.getClass();
    }

    @Override // k4.c
    public void l() {
        k0 k0Var = (k0) this.f247b;
        String string = k0Var.getString(R.string.msg_install_from_unknown_source, k0Var.getString(R.string.app_name));
        string.getClass();
        k0Var.N(string);
    }

    @Override // k4.a
    public void m(File file) {
        int i = this.f246a;
        file.getClass();
    }

    @Override // k4.a
    public void n(DocumentFile documentFile) {
        int i = this.f246a;
    }

    @Override // k4.a
    public void o(int i, String str, long j, long j6) {
        int i6 = this.f246a;
        str.getClass();
    }

    @Override // a4.i
    public void onSuccess() {
        switch (this.f246a) {
            case 28:
                m5.w0 w0Var = (m5.w0) this.f247b;
                w0Var.itemView.setVisibility(0);
                if (w0Var.f7627b == 0) {
                    View view = w0Var.itemView;
                    view.getClass();
                    if (((FullHeightImageView) view).getWidth() > 0) {
                        View view2 = w0Var.itemView;
                        view2.getClass();
                        w0Var.f7627b = ((FullHeightImageView) view2).getWidth();
                    }
                }
                break;
            default:
                ((m5.w0) this.f247b).itemView.setVisibility(0);
                break;
        }
    }

    public void p(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f247b).add(a4.x.o(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // j1.h
    public p q(Object obj) throws Throwable {
        FileWriter fileWriter;
        g2.e eVar = (g2.e) this.f248l;
        JSONObject jSONObject = (JSONObject) ((z1.e) this.f247b).f11911c.f11904a.submit(new androidx.work.impl.utils.d(this, 1)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            g2.d dVarK = ((f0.i) eVar.f5121m).k(jSONObject);
            f0.i iVar = (f0.i) eVar.f5123o;
            long j = dVarK.f5115c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) iVar.f4812b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        y1.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                y1.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            y1.g.b(fileWriter, "Failed to close settings writer.");
            g2.e.d(jSONObject, "Loaded settings: ");
            String str = ((g2.f) eVar.f5120l).f;
            SharedPreferences.Editor editorEdit = ((Context) eVar.f5119b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) eVar.f5126r).set(dVarK);
            ((j1.i) ((AtomicReference) eVar.f5127s).get()).c(dVarK);
        }
        return b2.t1.x(null);
    }

    @Override // k4.a
    public void r(File file) {
        int i = this.f246a;
        file.getClass();
    }

    @Override // j1.d
    public void s(p pVar) {
        ((Map) ((g) this.f248l).f248l).remove((j1.i) this.f247b);
    }

    @Override // k4.c
    public void t() {
        k0 k0Var = (k0) this.f247b;
        String string = k0Var.getString(R.string.core_kill_this_app, k0Var.getString(R.string.app_name));
        string.getClass();
        k0Var.N(string);
    }

    public String toString() {
        switch (this.f246a) {
            case 23:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f248l.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f247b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // k4.c
    public void v() {
        ((k0) this.f247b).q0((File) this.f248l);
    }

    @Override // k4.c
    public void w() {
        k0 k0Var = (k0) this.f247b;
        String string = k0Var.getString(R.string.error_unzipping);
        string.getClass();
        k0Var.N(string);
    }

    @Override // k4.a
    public void x(Object obj) {
        int i = this.f246a;
        obj.getClass();
    }

    @Override // k4.a
    public void y() {
        switch (this.f246a) {
            case 3:
                w4 w4Var = (w4) this.f247b;
                File file = new File(w4Var.getExternalFilesDir(null), "tmp");
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str = ((l4.b) ((ArrayList) this.f248l).get(0)).f7103c;
                str.getClass();
                File file2 = new File(file, str);
                w4Var.W = file2;
                m4.g gVar = f4.c.f4885y;
                if ((gVar != null ? gVar.f : null) != null) {
                    if (file2.exists()) {
                        File file3 = w4Var.W;
                        file3.getClass();
                        if (!file3.isDirectory()) {
                            new UptodownApp();
                            File file4 = w4Var.W;
                            file4.getClass();
                            f4.c.c(file4);
                        }
                    }
                    w4Var.i(w4Var.getString(R.string.error_generico));
                } else {
                    w4Var.D();
                }
                break;
            default:
                float f = UptodownApp.I;
                File file5 = (File) this.f247b;
                file5.getClass();
                FragmentActivity fragmentActivityRequireActivity = ((TvAppDetailFragment) this.f248l).requireActivity();
                fragmentActivityRequireActivity.getClass();
                b4.d.r(fragmentActivityRequireActivity, file5);
                break;
        }
    }

    @Override // k4.c
    public void z() {
        ((k0) this.f247b).j();
    }

    private final void A(DocumentFile documentFile) {
    }

    private final void B(DocumentFile documentFile) {
    }

    private final void C(DocumentFile documentFile) {
    }

    private final void u(DocumentFile documentFile) {
    }

    @Override // k4.c
    public void i(File file) {
    }

    @Override // k4.c
    public void j(File file) {
    }

    public /* synthetic */ g(int i, boolean z9) {
        this.f246a = i;
    }

    public /* synthetic */ g(Object obj, Object obj2, int i, boolean z9) {
        this.f246a = i;
        this.f247b = obj2;
        this.f248l = obj;
    }

    public g(int i) {
        this.f246a = i;
        switch (i) {
            case 25:
                h0.e eVar = h0.e.f5408d;
                this.f247b = new SparseIntArray();
                this.f248l = eVar;
                break;
            default:
                this.f247b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f248l = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public g(IBinder iBinder) throws RemoteException {
        this.f246a = 10;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f247b = new Messenger(iBinder);
            this.f248l = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f248l = new g0.g(iBinder);
            this.f247b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public g(ChoiceColor choiceColor, ChoiceColor choiceColor2, e1.c0 c0Var) {
        this.f246a = 22;
        this.f247b = choiceColor;
        this.f248l = choiceColor2;
    }

    public g(f4 f4Var) {
        this.f246a = 8;
        this.f248l = f4Var;
    }

    public /* synthetic */ g(Object obj) {
        this.f246a = 23;
        this.f248l = obj;
        this.f247b = new ArrayList();
    }

    public g(String str, d0.b bVar, e1.c0 c0Var) {
        this.f246a = 16;
        this.f248l = str;
        this.f247b = bVar;
    }

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f246a = i;
        this.f247b = obj;
        this.f248l = obj2;
    }

    public g(b4.g gVar, m4.b bVar) {
        this.f246a = 27;
        gVar.getClass();
        this.f247b = gVar;
        this.f248l = bVar;
    }

    public g(UptodownApp uptodownApp) {
        this.f246a = 21;
        this.f247b = uptodownApp;
        this.f248l = new j5.n(this);
    }

    public g(h2.a[] aVarArr) {
        this.f246a = 15;
        this.f247b = aVarArr;
        this.f248l = new e1.c0(13);
    }
}
