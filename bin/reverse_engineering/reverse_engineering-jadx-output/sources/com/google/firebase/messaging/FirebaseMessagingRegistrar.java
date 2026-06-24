package com.google.firebase.messaging;

import a3.c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j9.u;
import java.util.Arrays;
import java.util.List;
import n1.f;
import q2.g;
import r2.a;
import s1.b;
import s1.i;
import s1.r;
import t2.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, b bVar) {
        f fVar = (f) bVar.a(f.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(fVar, bVar.c(c.class), bVar.c(g.class), (d) bVar.a(d.class), bVar.b(rVar), (p2.c) bVar.a(p2.c.class));
        }
        com.google.gson.internal.a.o();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<s1.a> getComponents() {
        r rVar = new r(j2.b.class, o.f.class);
        u uVarA = s1.a.a(FirebaseMessaging.class);
        uVarA.f6817c = LIBRARY_NAME;
        uVarA.c(i.a(f.class));
        uVarA.c(new i(0, 0, a.class));
        uVarA.c(new i(0, 1, c.class));
        uVarA.c(new i(0, 1, g.class));
        uVarA.c(i.a(d.class));
        uVarA.c(new i(rVar, 0, 1));
        uVarA.c(i.a(p2.c.class));
        uVarA.f = new q2.b(rVar, 1);
        uVarA.e(1);
        return Arrays.asList(uVarA.d(), a.a.s(LIBRARY_NAME, "25.0.1"));
    }
}
