package s4;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9203b;

    public g(ArrayList arrayList, Context context) {
        context.getClass();
        this.f9202a = arrayList;
        this.f9203b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(v6.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s4.f
            if (r0 == 0) goto L13
            r0 = r6
            s4.f r0 = (s4.f) r0
            int r1 = r0.f9198l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9198l = r1
            goto L18
        L13:
            s4.f r0 = new s4.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9196a
            int r1 = r0.f9198l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r6)
            goto L45
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
            return r2
        L2c:
            p6.a.e(r6)
            v7.e r6 = o7.m0.f8289a
            v7.d r6 = v7.d.f10885a
            c4.g r1 = new c4.g
            r4 = 19
            r1.<init>(r5, r2, r4)
            r0.f9198l = r3
            java.lang.Object r6 = o7.c0.C(r1, r6, r0)
            u6.a r0 = u6.a.f10763a
            if (r6 != r0) goto L45
            return r0
        L45:
            p6.k r6 = (p6.k) r6
            java.lang.Object r6 = r6.f8445a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g.a(v6.c):java.lang.Object");
    }

    public g(Context context, ArrayList arrayList) {
        this.f9203b = context;
        this.f9202a = arrayList;
    }
}
