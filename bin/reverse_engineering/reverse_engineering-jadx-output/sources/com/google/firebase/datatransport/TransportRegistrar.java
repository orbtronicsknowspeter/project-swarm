package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import j9.u;
import java.util.Arrays;
import java.util.List;
import o.f;
import p.a;
import r.r;
import s1.b;
import s1.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        r.b((Context) bVar.a(Context.class));
        return r.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        r.b((Context) bVar.a(Context.class));
        return r.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        r.b((Context) bVar.a(Context.class));
        return r.a().c(a.f8392e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<s1.a> getComponents() {
        u uVarA = s1.a.a(f.class);
        uVarA.f6817c = LIBRARY_NAME;
        uVarA.c(i.a(Context.class));
        uVarA.f = new com.google.gson.internal.a(10);
        s1.a aVarD = uVarA.d();
        u uVarB = s1.a.b(new s1.r(j2.a.class, f.class));
        uVarB.c(i.a(Context.class));
        uVarB.f = new com.google.gson.internal.a(11);
        s1.a aVarD2 = uVarB.d();
        u uVarB2 = s1.a.b(new s1.r(j2.b.class, f.class));
        uVarB2.c(i.a(Context.class));
        uVarB2.f = new com.google.gson.internal.a(12);
        return Arrays.asList(aVarD, aVarD2, uVarB2.d(), a.a.s(LIBRARY_NAME, "19.0.0"));
    }
}
