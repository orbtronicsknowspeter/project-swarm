package j9;

import com.google.android.gms.internal.measurement.i5;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f6817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6819e;
    public Object f;
    public final Object g;

    public u(Class cls, Class[] clsArr) {
        this.f6817c = null;
        HashSet hashSet = new HashSet();
        this.f6818d = hashSet;
        this.f6819e = new HashSet();
        this.f6815a = 0;
        this.f6816b = 0;
        this.g = new HashSet();
        hashSet.add(s1.r.a(cls));
        for (Class cls2 : clsArr) {
            i5.i(cls2, "Null interface");
            ((HashSet) this.f6818d).add(s1.r.a(cls2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(v6.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j9.t
            if (r0 == 0) goto L13
            r0 = r5
            j9.t r0 = (j9.t) r0
            int r1 = r0.f6814m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6814m = r1
            goto L18
        L13:
            j9.t r0 = new j9.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6812b
            int r1 = r0.f6814m
            r2 = 1
            r3 = 42
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            j9.u r0 = r0.f6811a
            p6.a.e(r5)     // Catch: r5.a -> L6f
            goto L53
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            r5 = 0
            return r5
        L30:
            p6.a.e(r5)
            java.lang.Object r5 = r4.f6818d     // Catch: r5.a -> L6e
            i9.b r5 = (i9.b) r5     // Catch: r5.a -> L6e
            boolean r5 = r5.a()     // Catch: r5.a -> L6e
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.f6819e     // Catch: r5.a -> L6e
            i9.i r5 = (i9.i) r5     // Catch: r5.a -> L6e
            java.lang.String r1 = r4.b()     // Catch: r5.a -> L6e
            r0.f6811a = r4     // Catch: r5.a -> L6e
            r0.f6814m = r2     // Catch: r5.a -> L6e
            java.lang.Object r5 = r5.b(r1, r0)     // Catch: r5.a -> L6e
            u6.a r0 = u6.a.f10762a
            if (r5 != r0) goto L52
            return r0
        L52:
            r0 = r4
        L53:
            java.lang.String r5 = (java.lang.String) r5     // Catch: r5.a -> L6f
            goto L77
        L56:
            com.inmobi.cmp.ChoiceCmp r5 = com.inmobi.cmp.ChoiceCmp.INSTANCE     // Catch: r5.a -> L6e
            com.inmobi.cmp.ChoiceCmpCallback r5 = r5.getCallback()     // Catch: r5.a -> L6e
            if (r5 != 0) goto L5f
            goto L64
        L5f:
            com.inmobi.cmp.model.ChoiceError r0 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: r5.a -> L6e
            r5.onCmpError(r0)     // Catch: r5.a -> L6e
        L64:
            java.lang.Object r5 = r4.f     // Catch: r5.a -> L6e
            l9.a r5 = (l9.a) r5     // Catch: r5.a -> L6e
            java.lang.String r5 = r5.j(r3)     // Catch: r5.a -> L6e
            r0 = r4
            goto L77
        L6e:
            r0 = r4
        L6f:
            java.lang.Object r5 = r0.f
            l9.a r5 = (l9.a) r5
            java.lang.String r5 = r5.j(r3)
        L77:
            java.lang.Object r1 = r0.f
            l9.a r1 = (l9.a) r1
            r1.f(r3, r5)
            java.lang.Object r0 = r0.g
            k9.c r0 = (k9.c) r0
            java.lang.Object r5 = r0.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.a(v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            r4 = this;
            int r0 = r4.f6816b
            int r1 = r4.f6815a
            r2 = 1
            r3 = 2
            if (r1 != r3) goto L2c
            if (r0 == 0) goto L2a
            java.lang.String r1 = j8.e.c(r0)
            int r1 = r1.length()
            if (r1 <= 0) goto L2c
            j8.e.j = r3
            java.lang.String r0 = j8.e.c(r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            r1[r3] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r1 = "us-mspa/v1/purposes-state-%s-"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            goto L30
        L2a:
            r0 = 0
            throw r0
        L2c:
            j8.e.j = r2
            java.lang.String r0 = "us-mspa/v1/purposes-national-"
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://cmp.inmobi.com/"
            r1.<init>(r2)
            r1.append(r0)
            java.io.Serializable r0 = r4.f6817c
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r2 = "en"
            java.lang.String r0 = r2.toLowerCase(r0)
            r0.getClass()
            r1.append(r0)
            java.lang.String r0 = ".json"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.u.b():java.lang.String");
    }

    public void c(s1.i iVar) {
        if (((HashSet) this.f6818d).contains(iVar.f9134a)) {
            com.google.gson.internal.a.p("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.f6819e).add(iVar);
        }
    }

    public s1.a d() {
        if (((s1.d) this.f) != null) {
            return new s1.a((String) this.f6817c, new HashSet((HashSet) this.f6818d), new HashSet((HashSet) this.f6819e), this.f6815a, this.f6816b, (s1.d) this.f, (HashSet) this.g);
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Missing required property: factory.");
        return null;
    }

    public void e(int i) {
        if (this.f6815a == 0) {
            this.f6815a = i;
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Instantiation type has already been set.");
        }
    }

    public u(Locale locale, i9.b bVar, i9.i iVar, l9.a aVar, int i, int i6, k9.c cVar) {
        bVar.getClass();
        iVar.getClass();
        aVar.getClass();
        if (i != 0 && i6 != 0) {
            this.f6817c = locale;
            this.f6818d = bVar;
            this.f6819e = iVar;
            this.f = aVar;
            this.f6815a = i;
            this.f6816b = i6;
            this.g = cVar;
            return;
        }
        throw null;
    }

    public u(s1.r rVar, s1.r[] rVarArr) {
        this.f6817c = null;
        HashSet hashSet = new HashSet();
        this.f6818d = hashSet;
        this.f6819e = new HashSet();
        this.f6815a = 0;
        this.f6816b = 0;
        this.g = new HashSet();
        hashSet.add(rVar);
        for (s1.r rVar2 : rVarArr) {
            i5.i(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f6818d, rVarArr);
    }
}
