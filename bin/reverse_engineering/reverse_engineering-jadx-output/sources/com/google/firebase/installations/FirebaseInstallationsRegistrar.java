package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j9.u;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n1.f;
import q2.e;
import r1.a;
import s1.b;
import s1.o;
import s1.r;
import t1.i;
import t2.c;
import t2.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((f) bVar.a(f.class), bVar.c(q2.f.class), (ExecutorService) bVar.e(new r(a.class, ExecutorService.class)), new i((Executor) bVar.e(new r(r1.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s1.a> getComponents() {
        u uVarA = s1.a.a(d.class);
        uVarA.f6817c = LIBRARY_NAME;
        uVarA.c(s1.i.a(f.class));
        uVarA.c(new s1.i(0, 1, q2.f.class));
        uVarA.c(new s1.i(new r(a.class, ExecutorService.class), 1, 0));
        uVarA.c(new s1.i(new r(r1.b.class, Executor.class), 1, 0));
        uVarA.f = new o(6);
        s1.a aVarD = uVarA.d();
        e eVar = new e(0);
        u uVarA2 = s1.a.a(e.class);
        uVarA2.f6816b = 1;
        uVarA2.f = new androidx.core.view.inputmethod.a(eVar, 25);
        return Arrays.asList(aVarD, uVarA2.d(), a.a.s(LIBRARY_NAME, "19.0.1"));
    }
}
