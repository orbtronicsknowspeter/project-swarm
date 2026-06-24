package com.google.firebase.sessions;

import a4.d0;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import c3.i;
import c3.k0;
import c3.m;
import c3.o;
import c3.s;
import c3.t;
import c3.u0;
import c3.v;
import com.google.firebase.components.ComponentRegistrar;
import e3.c;
import j9.u;
import java.util.List;
import n1.f;
import o7.w;
import r1.a;
import r1.b;
import s1.r;
import t2.d;
import t6.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final v Companion = new v();
    private static final r appContext = r.a(Context.class);
    private static final r firebaseApp = r.a(f.class);
    private static final r firebaseInstallationsApi = r.a(d.class);
    private static final r backgroundDispatcher = new r(a.class, w.class);
    private static final r blockingDispatcher = new r(b.class, w.class);
    private static final r transportFactory = r.a(o.f.class);
    private static final r firebaseSessionsComponent = r.a(c3.r.class);

    static {
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(s1.b bVar) {
        return (o) ((i) ((c3.r) bVar.e(firebaseSessionsComponent))).f1266p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c3.r getComponents$lambda$1(s1.b bVar) {
        Object objE = bVar.e(appContext);
        objE.getClass();
        Object objE2 = bVar.e(backgroundDispatcher);
        objE2.getClass();
        Object objE3 = bVar.e(blockingDispatcher);
        objE3.getClass();
        Object objE4 = bVar.e(firebaseApp);
        objE4.getClass();
        Object objE5 = bVar.e(firebaseInstallationsApi);
        objE5.getClass();
        s2.b bVarB = bVar.b(transportFactory);
        bVarB.getClass();
        i iVar = new i();
        iVar.f1256a = f0.i.f((f) objE4);
        f0.i iVarF = f0.i.f((Context) objE);
        iVar.f1257b = iVarF;
        iVar.f1258c = e3.a.a(new m(iVarF, 1));
        iVar.f1259d = e3.a.a(t.f1324a);
        iVar.f1260e = f0.i.f((d) objE5);
        iVar.f = e3.a.a(new f0.i(iVar.f1256a, 3));
        f0.i iVarF2 = f0.i.f((h) objE3);
        iVar.g = iVarF2;
        iVar.h = e3.a.a(new s(iVar.f, iVarF2));
        iVar.i = f0.i.f((h) objE2);
        iVar.j = e3.a.a(new u0(iVar.f1258c, e3.a.a(new d0(iVar.f1259d, iVar.f1260e, iVar.f, iVar.h, e3.a.a(new b5.m(iVar.i, iVar.f1259d, e3.a.a(new s(iVar.f1257b, iVar.g, 0)), 12)), 3)), 1));
        c cVarA = e3.a.a(t.f1325b);
        iVar.f1261k = cVarA;
        iVar.f1262l = e3.a.a(new u0(iVar.f1259d, cVarA, 0));
        int i = 0;
        iVar.f1263m = e3.a.a(new d0(iVar.f1256a, iVar.f1260e, iVar.j, e3.a.a(new m(f0.i.f(bVarB), i)), iVar.i, 1));
        iVar.f1264n = e3.a.a(new b5.m(iVar.f1257b, iVar.g, e3.a.a(new k0(iVar.f1262l, i)), 1));
        c cVarA2 = e3.a.a(new e2.d(iVar.j, iVar.f1262l, iVar.f1263m, iVar.f1259d, iVar.f1264n, e3.a.a(new s(iVar.f1257b, iVar.f1261k, 1)), iVar.i, 2));
        iVar.f1265o = cVarA2;
        iVar.f1266p = e3.a.a(new y2.s(iVar.f1256a, iVar.j, iVar.i, e3.a.a(new f0.i(cVarA2, 4)), 1));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s1.a> getComponents() {
        u uVarA = s1.a.a(o.class);
        uVarA.f6818c = LIBRARY_NAME;
        uVarA.c(s1.i.b(firebaseSessionsComponent));
        uVarA.f = new c2.a(6);
        uVarA.e(2);
        s1.a aVarD = uVarA.d();
        u uVarA2 = s1.a.a(c3.r.class);
        uVarA2.f6818c = "fire-sessions-component";
        uVarA2.c(s1.i.b(appContext));
        uVarA2.c(s1.i.b(backgroundDispatcher));
        uVarA2.c(s1.i.b(blockingDispatcher));
        uVarA2.c(s1.i.b(firebaseApp));
        uVarA2.c(s1.i.b(firebaseInstallationsApi));
        uVarA2.c(new s1.i(transportFactory, 1, 1));
        uVarA2.f = new c2.a(7);
        return q6.m.d0(aVarD, uVarA2.d(), a.a.s(LIBRARY_NAME, "3.0.4"));
    }
}
