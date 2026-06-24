package e0;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import e1.c0;
import f0.g;
import f0.h;
import j0.i;
import j0.j;
import j0.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i0.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f3728k = 1;

    public final Intent b() {
        int iD = d();
        int i = iD - 1;
        if (iD == 0) {
            throw null;
        }
        i0.a aVar = this.f5617d;
        Context context = this.f5614a;
        if (i == 2) {
            h.f4808a.b("getFallbackSignInIntent()", new Object[0]);
            Intent intentA = h.a(context, (GoogleSignInOptions) aVar);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return intentA;
        }
        if (i == 3) {
            return h.a(context, (GoogleSignInOptions) aVar);
        }
        h.f4808a.b("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentA2 = h.a(context, (GoogleSignInOptions) aVar);
        intentA2.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentA2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        BasePendingResult basePendingResult;
        boolean z9 = d() == 3;
        h.f4808a.b("Signing out", new Object[0]);
        h.b(this.f5614a);
        o oVar = this.h;
        if (z9) {
            i iVar = new i(oVar);
            iVar.e(Status.f2469n);
            basePendingResult = iVar;
        } else {
            g gVar = new g(oVar, 0);
            oVar.b(gVar);
            basePendingResult = gVar;
        }
        basePendingResult.a(new j(basePendingResult, new j1.i(), new c0(21)));
    }

    public final synchronized int d() {
        int i;
        try {
            i = f3728k;
            if (i == 1) {
                Context context = this.f5614a;
                h0.e eVar = h0.e.f5407d;
                int iB = eVar.b(context, 12451000);
                if (iB == 0) {
                    i = 4;
                    f3728k = 4;
                } else if (eVar.a(context, iB, null) != null || t0.e.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    f3728k = 2;
                } else {
                    i = 3;
                    f3728k = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
