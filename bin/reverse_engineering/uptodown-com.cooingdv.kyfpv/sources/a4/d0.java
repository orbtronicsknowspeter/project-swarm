package a4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import c3.h1;
import com.uptodown.R;
import com.uptodown.core.activities.InstallerActivity;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements e3.b, s1.b, ViewBinding, t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f81b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f82l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f83m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f84n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f85o;

    public d0(s1.a aVar, s1.b bVar) {
        this.f80a = 6;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<s1.i> set = aVar.f9116c;
        Set set2 = aVar.g;
        for (s1.i iVar : set) {
            int i = iVar.f9137c;
            int i6 = iVar.f9136b;
            boolean z9 = i == 0;
            s1.r rVar = iVar.f9135a;
            if (z9) {
                if (i6 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i == 2) {
                hashSet3.add(rVar);
            } else if (i6 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(s1.r.a(p2.b.class));
        }
        this.f81b = DesugarCollections.unmodifiableSet(hashSet);
        this.f82l = DesugarCollections.unmodifiableSet(hashSet2);
        this.f83m = DesugarCollections.unmodifiableSet(hashSet3);
        this.f84n = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f85o = bVar;
    }

    public static d0 g(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.sc_preference_switch;
        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, R.id.sc_preference_switch);
        if (switchCompat != null) {
            i = R.id.tv_preference_switch_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_preference_switch_description);
            if (textView != null) {
                i = R.id.tv_preference_switch_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_preference_switch_title);
                if (textView2 != null) {
                    return new d0(relativeLayout, relativeLayout, switchCompat, textView, textView2, 10);
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static d0 i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        d0 d0Var = new d0(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) d0Var.f84n)) {
            try {
                ((ArrayDeque) d0Var.f84n).clear();
                String string = ((SharedPreferences) d0Var.f81b).getString((String) d0Var.f82l, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) d0Var.f83m)) {
                    String[] strArrSplit = string.split((String) d0Var.f83m, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) d0Var.f84n).add(str);
                        }
                    }
                    return d0Var;
                }
                return d0Var;
            } finally {
            }
        }
    }

    public static d0 k(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_generic_accept_cancel, (ViewGroup) null, false);
        int i = R.id.cb_dont_show_again;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, R.id.cb_dont_show_again);
        if (checkBox != null) {
            i = R.id.tv_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel);
            if (textView != null) {
                i = R.id.tv_msg;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_msg);
                if (textView2 != null) {
                    i = R.id.tv_ok;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok);
                    if (textView3 != null) {
                        return new d0((LinearLayout) viewInflate, checkBox, textView, textView2, textView3, 7);
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static boolean l(l4.n nVar, int i) {
        int i6;
        return i == -1 || (i6 = nVar.f) == -1 || i6 == i;
    }

    @Override // s1.b
    public Object a(Class cls) {
        if (!((Set) this.f81b).contains(s1.r.a(cls))) {
            s1.o.l(cls, "Attempting to request an undeclared dependency ", ".");
            return null;
        }
        Object objA = ((s1.b) this.f85o).a(cls);
        if (!cls.equals(p2.b.class)) {
            return objA;
        }
        return new s1.s();
    }

    @Override // s1.b
    public s2.b b(s1.r rVar) {
        if (((Set) this.f82l).contains(rVar)) {
            return ((s1.b) this.f85o).b(rVar);
        }
        s1.o.l(rVar, "Attempting to request an undeclared dependency Provider<", ">.");
        return null;
    }

    @Override // s1.b
    public s2.b c(Class cls) {
        return b(s1.r.a(cls));
    }

    @Override // s1.b
    public Set d(s1.r rVar) {
        if (((Set) this.f84n).contains(rVar)) {
            return ((s1.b) this.f85o).d(rVar);
        }
        s1.o.l(rVar, "Attempting to request an undeclared dependency Set<", ">.");
        return null;
    }

    @Override // s1.b
    public Object e(s1.r rVar) {
        if (((Set) this.f81b).contains(rVar)) {
            return ((s1.b) this.f85o).e(rVar);
        }
        s1.o.l(rVar, "Attempting to request an undeclared dependency ", ".");
        return null;
    }

    @Override // s1.b
    public s1.p f(s1.r rVar) {
        if (((Set) this.f83m).contains(rVar)) {
            return ((s1.b) this.f85o).f(rVar);
        }
        s1.o.l(rVar, "Attempting to request an undeclared dependency Deferred<", ">.");
        return null;
    }

    @Override // m6.a
    public Object get() {
        switch (this.f80a) {
            case 1:
                return new c3.s0((n1.f) ((f0.i) this.f81b).f4812b, (t2.d) ((m6.a) this.f82l).get(), (f3.j) ((m6.a) this.f83m).get(), (c3.l) ((e3.c) this.f84n).get(), (t6.h) ((m6.a) this.f85o).get());
            case 2:
            default:
                return new w.a((Executor) ((m6.a) this.f81b).get(), (s.d) ((m6.a) this.f82l).get(), (t4.n0) ((t4.n0) this.f83m).get(), (y.d) ((m6.a) this.f84n).get(), (z.c) ((m6.a) this.f85o).get());
            case 3:
                return new f3.c((h1) ((m6.a) this.f81b).get(), (t2.d) ((m6.a) this.f82l).get(), (c3.b) ((m6.a) this.f83m).get(), (f3.d) ((m6.a) this.f84n).get(), (f3.n) ((e3.c) this.f85o).get());
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f80a) {
        }
        return (RelativeLayout) this.f81b;
    }

    public g0 h() {
        long blockCountLong;
        Context context = (Context) this.f81b;
        if (((f0.i) this.f82l) == null) {
            StringBuilder sb = t0.f177a;
            File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
            } catch (IllegalArgumentException unused) {
                blockCountLong = 5242880;
            }
            long jMax = Math.max(Math.min(blockCountLong, 52428800L), 5242880L);
            m8.w wVar = new m8.w();
            wVar.i = new m8.g(file, jMax);
            this.f82l = new f0.i(new m8.x(wVar), 1);
        }
        if (((a3.d) this.f84n) == null) {
            this.f84n = new a3.d(context);
        }
        if (((j0) this.f83m) == null) {
            this.f83m = new j0(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new s0());
        }
        if (((f0) this.f85o) == null) {
            this.f85o = f0.f91a;
        }
        o0 o0Var = new o0((a3.d) this.f84n);
        return new g0(context, new q(context, (j0) this.f83m, g0.j, (f0.i) this.f82l, (a3.d) this.f84n, o0Var), (a3.d) this.f84n, (f0) this.f85o, o0Var);
    }

    public s1.p j(Class cls) {
        return f(s1.r.a(cls));
    }

    public String m() {
        String str;
        synchronized (((ArrayDeque) this.f84n)) {
            str = (String) ((ArrayDeque) this.f84n).peek();
        }
        return str;
    }

    public boolean n(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f84n)) {
            zRemove = ((ArrayDeque) this.f84n).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f85o).execute(new a2.s(this, 18));
            }
        }
        return zRemove;
    }

    public void o(o.a aVar, o.g gVar) {
        r.r rVar = (r.r) this.f85o;
        r.j jVar = (r.j) this.f81b;
        String str = (String) this.f82l;
        o.e eVar = (o.e) this.f84n;
        if (eVar == null) {
            com.google.gson.internal.a.i("Null transformer");
            return;
        }
        o.c cVar = (o.c) this.f83m;
        w.a aVar2 = rVar.f8852c;
        r.j jVarA = jVar.a(aVar.f8123b);
        r.h hVar = new r.h();
        hVar.f8824r = new HashMap();
        hVar.f8822p = Long.valueOf(rVar.f8850a.f());
        hVar.f8823q = Long.valueOf(rVar.f8851b.f());
        hVar.f8817b = str;
        hVar.f8821o = new r.m(cVar, (byte[]) eVar.apply(aVar.f8122a));
        hVar.f8819m = null;
        o.b bVar = aVar.f8124c;
        if (bVar != null) {
            hVar.f8820n = bVar.f8125a;
        }
        aVar2.f10907b.execute(new a2.r(aVar2, jVarA, gVar, hVar.b(), 3));
    }

    public Set p(Class cls) {
        return d(s1.r.a(cls));
    }

    public d0(InstallerActivity installerActivity) {
        this.f80a = 4;
        this.f82l = new ArrayList();
        this.f83m = new ArrayList();
        this.f84n = new ArrayList();
        this.f85o = new ArrayList();
    }

    public d0(e2.d dVar) {
        this.f80a = 2;
        this.f81b = (d6.f) dVar.f4467b;
        this.f82l = (e1.c0) dVar.f4469m;
        this.f83m = (q2.e) dVar.f4470n;
        this.f84n = (e1.c0) dVar.f4471o;
        this.f85o = (a3.d) dVar.f4473q;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f80a = i;
        this.f81b = obj;
        this.f82l = obj2;
        this.f83m = obj3;
        this.f84n = obj4;
        this.f85o = obj5;
    }

    public d0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f80a = 13;
        this.f84n = new ArrayDeque();
        this.f81b = sharedPreferences;
        this.f82l = "topic_operation_queue";
        this.f83m = ",";
        this.f85o = scheduledThreadPoolExecutor;
    }

    public d0(Context context) {
        this.f80a = 0;
        if (context != null) {
            this.f81b = context.getApplicationContext();
        } else {
            com.google.gson.internal.a.p("Context must not be null.");
            throw null;
        }
    }
}
