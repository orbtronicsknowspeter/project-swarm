package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j9.u;
import java.util.List;
import java.util.concurrent.Executor;
import n1.g;
import o7.w;
import q6.m;
import r1.b;
import r1.c;
import r1.d;
import s1.a;
import s1.i;
import s1.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        u uVarB = a.b(new r(r1.a.class, w.class));
        uVarB.c(new i(new r(r1.a.class, Executor.class), 1, 0));
        uVarB.f = g.f7914b;
        a aVarD = uVarB.d();
        u uVarB2 = a.b(new r(c.class, w.class));
        uVarB2.c(new i(new r(c.class, Executor.class), 1, 0));
        uVarB2.f = g.f7915l;
        a aVarD2 = uVarB2.d();
        u uVarB3 = a.b(new r(b.class, w.class));
        uVarB3.c(new i(new r(b.class, Executor.class), 1, 0));
        uVarB3.f = g.f7916m;
        a aVarD3 = uVarB3.d();
        u uVarB4 = a.b(new r(d.class, w.class));
        uVarB4.c(new i(new r(d.class, Executor.class), 1, 0));
        uVarB4.f = g.f7917n;
        return m.d0(aVarD, aVarD2, aVarD3, uVarB4.d());
    }
}
