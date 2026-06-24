package a3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.OnActionClickedListener;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.work.WorkerKt;
import c4.ya;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MoreInfo;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import j1.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import o7.c0;
import o7.f0;
import o7.m0;
import y.f;
import y.g;
import y.h;
import y2.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements s1.d, CallbackToFutureAdapter.Resolver, OnActionClickedListener, s2.a, z.b, f, j1.d, j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f66l;

    public /* synthetic */ e(j jVar, String str) {
        this.f64a = 10;
        this.f66l = jVar;
        this.f65b = str;
    }

    @Override // y.f
    public Object apply(Object obj) {
        h hVar = (h) this.f65b;
        r.j jVar = (r.j) this.f66l;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        y.a aVar = hVar.f11591m;
        ArrayList arrayListE = hVar.e(sQLiteDatabase, jVar, aVar.f11576b);
        for (o.d dVar : o.d.values()) {
            if (dVar != jVar.f8834c) {
                int size = aVar.f11576b - arrayListE.size();
                if (size <= 0) {
                    break;
                }
                arrayListE.addAll(hVar.e(sQLiteDatabase, jVar.a(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListE.size(); i++) {
            sb.append(((y.b) arrayListE.get(i)).f11580a);
            if (i < arrayListE.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListE.listIterator();
        while (listIterator.hasNext()) {
            y.b bVar = (y.b) listIterator.next();
            long j6 = bVar.f11580a;
            if (map.containsKey(Long.valueOf(j6))) {
                r.h hVarC = bVar.f11582c.c();
                for (g gVar : (Set) map.get(Long.valueOf(j6))) {
                    hVarC.a(gVar.f11585a, gVar.f11586b);
                }
                listIterator.set(new y.b(j6, bVar.f11581b, hVarC.b()));
            }
        }
        return arrayListE;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f64a) {
            case 1:
                return CoroutineAdapterKt.asListenableFuture$lambda$0((f0) this.f65b, this.f66l, completer);
            default:
                return WorkerKt.future$lambda$2((Executor) this.f65b, (d7.a) this.f66l, completer);
        }
    }

    @Override // s2.a
    public void b(s2.b bVar) {
        s2.a aVar = (s2.a) this.f65b;
        s2.a aVar2 = (s2.a) this.f66l;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // s1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a4.d0 r4) {
        /*
            r3 = this;
            int r0 = r3.f64a
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f65b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f66l
            s1.a r1 = (s1.a) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1a
            s1.d r0 = r1.f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r0.c(r4)     // Catch: java.lang.Throwable -> L1a
            android.os.Trace.endSection()
            return r4
        L1a:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        L1f:
            java.lang.Object r0 = r3.f65b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f66l
            com.google.gson.internal.a r1 = (com.google.gson.internal.a) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r4 = r4.a(r2)
            android.content.Context r4 = (android.content.Context) r4
            int r1 = r1.f3128a
            switch(r1) {
                case 20: goto L91;
                case 21: goto L8c;
                case 22: goto L4a;
                default: goto L34;
            }
        L34:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r4 = r1.getInstallerPackageName(r4)
            if (r4 == 0) goto L47
            java.lang.String r4 = com.google.firebase.FirebaseCommonRegistrar.b(r4)
            goto L9d
        L47:
            java.lang.String r4 = ""
            goto L9d
        L4a:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.television"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L59
            java.lang.String r4 = "tv"
            goto L9d
        L59:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L68
            java.lang.String r4 = "watch"
            goto L9d
        L68:
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "android.hardware.type.automotive"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L77
            java.lang.String r4 = "auto"
            goto L9d
        L77:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L47
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r4 = r4.hasSystemFeature(r1)
            if (r4 == 0) goto L47
            java.lang.String r4 = "embedded"
            goto L9d
        L8c:
            java.lang.String r4 = com.google.firebase.FirebaseCommonRegistrar.a(r4)
            goto L9d
        L91:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            if (r4 == 0) goto L47
            int r4 = r4.targetSdkVersion
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L9d:
            a3.a r1 = new a3.a
            r1.<init>(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.e.c(a4.d0):java.lang.Object");
    }

    @Override // z.b
    public Object execute() {
        switch (this.f64a) {
            case 6:
                x.g gVar = (x.g) this.f65b;
                Iterable iterable = (Iterable) this.f66l;
                h hVar = (h) gVar.f11031c;
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in ".concat(h.i(iterable))).execute();
                    break;
                }
                break;
            default:
                x.g gVar2 = (x.g) this.f65b;
                for (Map.Entry entry : ((HashMap) this.f66l).entrySet()) {
                    ((h) gVar2.i).f(((Integer) entry.getValue()).intValue(), u.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // j1.a
    public Object g(p pVar) {
        j jVar = (j) this.f66l;
        String str = (String) this.f65b;
        synchronized (jVar) {
            ((ArrayMap) jVar.f11740b).remove(str);
        }
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.leanback.widget.OnActionClickedListener
    public void onActionClicked(Action action) {
        TvAppDetailFragment tvAppDetailFragment = (TvAppDetailFragment) this.f65b;
        FragmentActivity fragmentActivity = (FragmentActivity) this.f66l;
        action.getClass();
        if (action.getId() == 1) {
            int i = tvAppDetailFragment.f3416l;
            if (i != 0) {
                if (i == 1) {
                    tvAppDetailFragment.h();
                    return;
                }
                if (i == 2) {
                    tvAppDetailFragment.h();
                    return;
                }
                if (i == 3) {
                    tvAppDetailFragment.b();
                    return;
                } else if (i == 5) {
                    tvAppDetailFragment.h();
                    return;
                } else {
                    if (i != 6) {
                        return;
                    }
                    tvAppDetailFragment.h();
                    return;
                }
            }
            x4.g gVar = tvAppDetailFragment.f3414a;
            if (gVar == null || gVar.F == null || tvAppDetailFragment.getContext() == null) {
                return;
            }
            PackageManager packageManager = tvAppDetailFragment.requireContext().getPackageManager();
            x4.g gVar2 = tvAppDetailFragment.f3414a;
            gVar2.getClass();
            String str = gVar2.F;
            str.getClass();
            Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(str);
            if (leanbackLaunchIntentForPackage == null) {
                PackageManager packageManager2 = tvAppDetailFragment.requireContext().getPackageManager();
                x4.g gVar3 = tvAppDetailFragment.f3414a;
                gVar3.getClass();
                String str2 = gVar3.F;
                str2.getClass();
                leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(str2);
            }
            if (leanbackLaunchIntentForPackage != null) {
                tvAppDetailFragment.startActivity(leanbackLaunchIntentForPackage);
                return;
            }
            return;
        }
        if (action.getId() == 2) {
            x4.g gVar4 = tvAppDetailFragment.f3414a;
            if (gVar4 == null || gVar4.F == null) {
                return;
            }
            Context contextRequireContext = tvAppDetailFragment.requireContext();
            contextRequireContext.getClass();
            x4.g gVar5 = tvAppDetailFragment.f3414a;
            gVar5.getClass();
            String str3 = gVar5.F;
            str3.getClass();
            Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str3)));
            intent.addFlags(268435456);
            contextRequireContext.startActivity(intent);
            return;
        }
        if (action.getId() == 3) {
            if (tvAppDetailFragment.f3414a != null) {
                Intent intent2 = new Intent(fragmentActivity, (Class<?>) TvOldVersionsActivity.class);
                intent2.putExtra("appInfo", tvAppDetailFragment.f3414a);
                float f = UptodownApp.I;
                tvAppDetailFragment.startActivity(intent2, b4.d.a(fragmentActivity));
                return;
            }
            return;
        }
        Bundle bundleA = null;
        Object[] objArr = 0;
        if (action.getId() == 4) {
            if (tvAppDetailFragment.f3414a != null) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(tvAppDetailFragment);
                v7.e eVar = m0.f8289a;
                c0.s(lifecycleScope, v7.d.f10885a, null, new ya((Object) fragmentActivity, (Object) tvAppDetailFragment, (t6.c) (objArr == true ? 1 : 0), 11), 2);
                return;
            }
            return;
        }
        if (action.getId() != 5 || tvAppDetailFragment.f3414a == null) {
            return;
        }
        Intent intent3 = new Intent(tvAppDetailFragment.getContext(), (Class<?>) MoreInfo.class);
        intent3.putExtra("appInfo", tvAppDetailFragment.f3414a);
        FragmentActivity activity = tvAppDetailFragment.getActivity();
        if (activity != null) {
            float f10 = UptodownApp.I;
            bundleA = b4.d.a(activity);
        }
        tvAppDetailFragment.startActivity(intent3, bundleA);
    }

    @Override // j1.d
    public void s(p pVar) {
        ((FirebaseMessagingService) this.f65b).a((Intent) this.f66l);
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f64a = i;
        this.f65b = obj;
        this.f66l = obj2;
    }
}
