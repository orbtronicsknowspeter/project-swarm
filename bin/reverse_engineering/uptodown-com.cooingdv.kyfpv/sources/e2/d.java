package e2;

import a2.e;
import a2.f;
import a2.p;
import a2.q;
import a2.t;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.datastore.core.DataStore;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import b2.a0;
import b2.b0;
import b2.c1;
import b2.c2;
import b2.d1;
import b2.f0;
import b2.f1;
import b2.g1;
import b2.j2;
import b2.o0;
import b2.p0;
import b2.q0;
import b2.r0;
import b2.t1;
import b2.u0;
import b2.v0;
import b2.z0;
import c3.d0;
import c3.h1;
import c3.s0;
import c3.t0;
import com.uptodown.R;
import e1.x1;
import f3.j;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k0.k;
import s1.o;
import t4.n0;
import t6.h;
import y1.g;
import y1.i;
import y1.r;
import y1.w;
import y1.x;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements e3.b, ViewBinding, t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4467b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f4468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f4469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f4470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f4471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f4472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f4473q;

    public d(Context context) {
        String string;
        this.f4466a = 0;
        String str = ((z0) v1.d.f10793a.b(context)).f988a;
        this.f4467b = str;
        File filesDir = context.getFilesDir();
        this.f4468l = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? g.h(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        l(file);
        this.f4469m = file;
        File file2 = new File(file, "open-sessions");
        l(file2);
        this.f4470n = file2;
        File file3 = new File(file, "reports");
        l(file3);
        this.f4471o = file3;
        File file4 = new File(file, "priority-reports");
        l(file4);
        this.f4472p = file4;
        File file5 = new File(file, "native-reports");
        l(file5);
        this.f4473q = file5;
    }

    public static p0 a(p0 p0Var, f fVar, d dVar, Map map) {
        Map mapUnmodifiableMap;
        o0 o0VarA = p0Var.a();
        String strC = ((a2.d) fVar.f19b).c();
        if (strC != null) {
            o0VarA.f896e = new c1(strC);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        t tVar = (t) dVar.f4470n;
        if (zIsEmpty) {
            mapUnmodifiableMap = ((e) ((AtomicMarkableReference) tVar.f53b).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((e) ((AtomicMarkableReference) tVar.f53b).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = e.b(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB)) {
                    map2.put(strB, e.b(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
        }
        List listI = i(mapUnmodifiableMap);
        List listI2 = i(((e) ((AtomicMarkableReference) ((t) dVar.f4471o).f53b).getReference()).a());
        if (!listI.isEmpty() || !listI2.isEmpty()) {
            q0 q0Var = (q0) p0Var.f903c;
            o0VarA.f894c = new q0(q0Var.f911a, listI, listI2, q0Var.f914d, q0Var.f915e, q0Var.f, q0Var.g);
        }
        return o0VarA.a();
    }

    public static j2 b(p0 p0Var, d dVar) {
        List listA = ((q) dVar.f4472p).a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            p pVar = (p) listA.get(i);
            pVar.getClass();
            d1 d1Var = new d1();
            a2.b bVar = (a2.b) pVar;
            String str = bVar.f10e;
            if (str == null) {
                com.google.gson.internal.a.i("Null variantId");
                return null;
            }
            String str2 = bVar.f7b;
            if (str2 == null) {
                com.google.gson.internal.a.i("Null rolloutId");
                return null;
            }
            d1Var.f767a = new f1(str2, str);
            String str3 = bVar.f8c;
            if (str3 == null) {
                com.google.gson.internal.a.i("Null parameterKey");
                return null;
            }
            d1Var.f768b = str3;
            d1Var.f769c = bVar.f9d;
            d1Var.f770d = bVar.f;
            d1Var.f771e = (byte) (d1Var.f771e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 o0VarA = p0Var.a();
        o0VarA.f = new g1(arrayList);
        return o0VarA.a();
    }

    public static d c(View view) {
        int i = R.id.iv_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_item);
        if (imageView != null) {
            i = R.id.iv_see_more_list;
            if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_see_more_list)) != null) {
                i = R.id.ll_apps_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_apps_container);
                if (linearLayout != null) {
                    i = R.id.loading_view_list;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_view_list);
                    if (progressBar != null) {
                        i = R.id.rl_apps_container;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_apps_container);
                        if (relativeLayout != null) {
                            i = R.id.tv_app_count;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_count);
                            if (textView != null) {
                                i = R.id.tv_list_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_list_title);
                                if (textView2 != null) {
                                    return new d((LinearLayout) view, imageView, linearLayout, progressBar, relativeLayout, textView, textView2, 8);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static d d(View view) {
        int i = R.id.iv_more_public_profile_top;
        if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_more_public_profile_top)) != null) {
            i = R.id.rl_no_items_public_profile_top;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_no_items_public_profile_top);
            if (relativeLayout != null) {
                i = R.id.rl_title_public_profile_top;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title_public_profile_top);
                if (relativeLayout2 != null) {
                    i = R.id.rv_public_profile_top;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_public_profile_top);
                    if (recyclerView != null) {
                        i = R.id.tv_explore_public_profile_top;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_explore_public_profile_top);
                        if (textView != null) {
                            i = R.id.tv_no_items_public_profile_top;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items_public_profile_top);
                            if (textView2 != null) {
                                i = R.id.tv_title_public_profile_top;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_public_profile_top);
                                if (textView3 != null) {
                                    return new d((LinearLayout) view, relativeLayout, relativeLayout2, recyclerView, textView, textView2, textView3, 10);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    public static d g(Context context, x xVar, d dVar, y1.a aVar, f fVar, d dVar2, android.support.v4.media.g gVar, g2.e eVar, m8.q qVar, i iVar, z1.e eVar2) {
        r rVar = new r(context, xVar, aVar, gVar, eVar);
        b bVar = new b(dVar, eVar, iVar);
        c2.c cVar = f2.a.f4818b;
        r.r.b(context);
        return new d(rVar, bVar, new f2.a(new f2.c(r.r.a().c(new p.a(f2.a.f4819c, f2.a.f4820d)).a("FIREBASE_CRASHLYTICS_REPORT", new o.c("json"), f2.a.f4821e), eVar.b(), qVar)), fVar, dVar2, xVar, eVar2, 12);
    }

    public static List i(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                com.google.gson.internal.a.i("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                com.google.gson.internal.a.i("Null value");
                return null;
            }
            arrayList.add(new f0(str, str2));
        }
        Collections.sort(arrayList, new androidx.constraintlayout.core.utils.a(13));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static d j(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_no_wifi_connection, (ViewGroup) null, false);
        int i = R.id.cb_dont_show_again_no_wifi;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, R.id.cb_dont_show_again_no_wifi);
        if (checkBox != null) {
            i = R.id.tv_cancel_dialog_no_wifi_connection;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel_dialog_no_wifi_connection);
            if (textView != null) {
                i = R.id.tv_description_dialog_no_wifi_connection;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_description_dialog_no_wifi_connection);
                if (textView2 != null) {
                    i = R.id.tv_ok_dialog_no_wifi_connection;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok_dialog_no_wifi_connection);
                    if (textView3 != null) {
                        i = R.id.tv_settings_dialog_no_wifi_connection;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_settings_dialog_no_wifi_connection);
                        if (textView4 != null) {
                            i = R.id.tv_title_dialog_no_wifi_connection;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_no_wifi_connection);
                            if (textView5 != null) {
                                return new d((RelativeLayout) viewInflate, checkBox, textView, textView2, textView3, textView4, textView5, 6);
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static synchronized void l(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean m(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m(file2);
            }
        }
        return file.delete();
    }

    public static List n(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void e(String str) {
        File file = new File((File) this.f4468l, str);
        if (file.exists() && m(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    @Override // m6.a
    public Object get() {
        switch (this.f4466a) {
            case 2:
                return new c3.d1((j) ((m6.a) this.f4467b).get(), (t0) ((m6.a) this.f4468l).get(), (s0) ((m6.a) this.f4469m).get(), (h1) ((m6.a) this.f4470n).get(), (DataStore) ((m6.a) this.f4471o).get(), (d0) ((e3.c) this.f4472p).get(), (h) ((m6.a) this.f4473q).get());
            default:
                return new x.g((Context) ((m6.a) this.f4467b).get(), (s.d) ((m6.a) this.f4468l).get(), (y.d) ((m6.a) this.f4469m).get(), (n0) ((n0) this.f4470n).get(), (Executor) ((m6.a) this.f4471o).get(), (z.c) ((m6.a) this.f4472p).get(), new q2.e(2), new q2.e(1), (y.c) ((m6.a) this.f4473q).get());
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f4466a) {
            case 6:
                return (RelativeLayout) this.f4467b;
            case 7:
                return (LinearLayout) this.f4467b;
            case 8:
                return (LinearLayout) this.f4467b;
            case 9:
                return (RelativeLayout) this.f4467b;
            default:
                return (LinearLayout) this.f4467b;
        }
    }

    public File h(String str, String str2) {
        File file = new File((File) this.f4470n, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void k(Throwable th, Thread thread, String str, final a2.c cVar, boolean z9) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b7;
        final boolean zEquals = str.equals("crash");
        r rVar = (r) this.f4467b;
        long j = cVar.f12b;
        Context context = rVar.f11670a;
        int i = context.getResources().getConfiguration().orientation;
        android.support.v4.media.g gVar = rVar.f11673d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        s sVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            sVar = new s(th2.getLocalizedMessage(), th2.getClass().getName(), gVar.d(th2.getStackTrace()), sVar, 6);
        }
        s sVar2 = sVar;
        o0 o0Var = new o0();
        o0Var.f893b = str;
        o0Var.f892a = j;
        o0Var.g = (byte) (o0Var.g | 1);
        c2 c2VarB = v1.d.f10793a.b(context);
        int i6 = ((z0) c2VarB).f990c;
        Boolean boolValueOf = i6 > 0 ? Boolean.valueOf(i6 != 100) : null;
        ArrayList arrayListA = v1.d.a(context);
        byte b10 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar2.f11758m;
        String name = thread.getName();
        if (name == null) {
            com.google.gson.internal.a.i("Null name");
            return;
        }
        byte b11 = (byte) 1;
        List listD = r.d(stackTraceElementArr, 4);
        if (listD == null) {
            com.google.gson.internal.a.i("Null frames");
            return;
        }
        if (b11 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b11 == 0) {
                sb.append(" importance");
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.i(k.h("Missing required properties:", sb));
            return;
        }
        arrayList.add(new v0(name, 4, listD));
        if (z9) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b7 = b11;
                } else {
                    StackTraceElement[] stackTraceElementArrD = gVar.d(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        com.google.gson.internal.a.i("Null name");
                        return;
                    }
                    it = it2;
                    List listD2 = r.d(stackTraceElementArrD, 0);
                    if (listD2 == null) {
                        com.google.gson.internal.a.i("Null frames");
                        return;
                    }
                    if (b11 != 1) {
                        byte b12 = b11;
                        StringBuilder sb2 = new StringBuilder();
                        if (b12 == 0) {
                            sb2.append(" importance");
                        }
                        androidx.privacysandbox.ads.adservices.customaudience.a.i(k.h("Missing required properties:", sb2));
                        return;
                    }
                    b7 = b11;
                    arrayList.add(new v0(name2, 0, listD2));
                }
                it2 = it;
                b11 = b7;
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        b2.t0 t0VarC = r.c(sVar2, 0);
        u0 u0VarE = r.e();
        List listA = rVar.a();
        if (listA == null) {
            com.google.gson.internal.a.i("Null binaries");
            return;
        }
        r0 r0Var = new r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b10 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b10 == 0) {
                sb3.append(" uiOrientation");
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.i(k.h("Missing required properties:", sb3));
            return;
        }
        o0Var.f894c = new q0(r0Var, null, null, boolValueOf, c2VarB, arrayListA, i);
        o0Var.f895d = rVar.b(i);
        p0 p0VarA = o0Var.a();
        Map map = cVar.f13c;
        f fVar = (f) this.f4470n;
        d dVar = (d) this.f4471o;
        final j2 j2VarB = b(a(p0VarA, fVar, dVar, map), dVar);
        if (z9) {
            ((b) this.f4468l).d(j2VarB, cVar.f11a, zEquals);
        } else {
            ((z1.e) this.f4473q).f11910b.a(new Runnable() { // from class: y1.y
                @Override // java.lang.Runnable
                public final void run() {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    ((e2.b) this.f11695a.f4468l).d(j2VarB, cVar.f11a, zEquals);
                }
            });
        }
    }

    public j1.p o(String str, Executor executor) {
        j1.i iVar;
        ArrayList arrayListB = ((b) this.f4468l).b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            int i6 = i + 1;
            File file = (File) arrayListB.get(i);
            try {
                c2.c cVar = b.g;
                String strE = b.e(file);
                cVar.getClass();
                arrayList.add(new y1.b(c2.c.i(strE), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i = i6;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            y1.b bVar = (y1.b) obj;
            if (str == null || str.equals(bVar.f11606b)) {
                f2.a aVar = (f2.a) this.f4469m;
                b0 b0Var = bVar.f11605a;
                if (b0Var.f == null || b0Var.g == null) {
                    w wVarB = ((x) this.f4472p).b(true);
                    b0 b0Var2 = bVar.f11605a;
                    String str2 = wVarB.f11688a;
                    a0 a0VarA = b0Var2.a();
                    a0VarA.f719e = str2;
                    b0 b0VarA = a0VarA.a();
                    String str3 = wVarB.f11689b;
                    a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f = str3;
                    bVar = new y1.b(a0VarA2.a(), bVar.f11606b, bVar.f11607c);
                }
                boolean z9 = str != null;
                f2.c cVar2 = aVar.f4822a;
                synchronized (cVar2.f) {
                    try {
                        iVar = new j1.i();
                        if (z9) {
                            ((AtomicInteger) cVar2.i.f7781b).getAndIncrement();
                            if (cVar2.f.size() < cVar2.f4831e) {
                                v1.c cVar3 = v1.c.f10792a;
                                cVar3.b("Enqueueing report: " + bVar.f11606b);
                                cVar3.b("Queue size: " + cVar2.f.size());
                                cVar2.g.execute(new x1(cVar2, bVar, iVar, 9));
                                cVar3.b("Closing task for report: " + bVar.f11606b);
                                iVar.c(bVar);
                            } else {
                                cVar2.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f11606b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar2.i.f7782l).getAndIncrement();
                                iVar.c(bVar);
                            }
                        } else {
                            cVar2.b(bVar, iVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(iVar.f6540a.d(executor, new o(this, 24)));
            }
        }
        return t1.Q(arrayList2);
    }

    public void p() {
        Thread thread = (Thread) this.f4472p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new m4.c(this, 0));
            this.f4472p = thread2;
            thread2.start();
        }
    }

    public d(int i) {
        this.f4466a = i;
        switch (i) {
            case 4:
                this.f4467b = new AtomicBoolean();
                this.f4468l = null;
                this.f4469m = new HashMap(16, 1.0f);
                this.f4470n = new HashMap(16, 1.0f);
                this.f4471o = new HashMap(16, 1.0f);
                this.f4472p = new HashMap(16, 1.0f);
                this.f4473q = null;
                break;
        }
    }

    public d(Context context, b4.g gVar, m4.b bVar) {
        this.f4466a = 5;
        context.getClass();
        gVar.getClass();
        this.f4467b = context;
        this.f4468l = gVar;
        this.f4469m = bVar;
        Thread thread = new Thread(new m4.c(this, 2));
        this.f4471o = thread;
        thread.start();
    }

    public d(LinearLayout linearLayout, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView, TextView textView2, TextView textView3) {
        this.f4466a = 7;
        this.f4467b = linearLayout;
        this.f4468l = editText;
        this.f4469m = imageView2;
        this.f4470n = imageView3;
        this.f4471o = imageView4;
        this.f4472p = imageView5;
        this.f4473q = imageView6;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f4466a = i;
        this.f4467b = obj;
        this.f4468l = obj2;
        this.f4469m = obj3;
        this.f4470n = obj4;
        this.f4471o = obj5;
        this.f4472p = obj6;
        this.f4473q = obj7;
    }

    public d(String str, d dVar, z1.e eVar) {
        this.f4466a = 1;
        this.f4470n = new t(this, false);
        this.f4471o = new t(this, true);
        this.f4472p = new q();
        this.f4473q = new AtomicMarkableReference(null, false);
        this.f4467b = str;
        this.f4468l = new a2.h(dVar);
        this.f4469m = eVar;
    }
}
