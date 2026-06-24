package com.uptodown.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c4.d;
import c4.k0;
import com.uptodown.UptodownApp;
import f4.c;
import java.util.ArrayList;
import p6.m;
import t4.q;
import t4.w;
import u4.z1;
import x4.g;
import x4.j;
import x4.v1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class MoreInfo extends k0 {
    public static final /* synthetic */ int V = 0;
    public g Q;
    public ArrayList R;
    public ArrayList S;
    public ArrayList T;
    public final LifecycleCoroutineScope O = LifecycleOwnerKt.getLifecycleScope(this);
    public final m P = new m(new androidx.room.g(this, 23));
    public final int U = 2;

    public static final void A0(MoreInfo moreInfo, ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        arrayList.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = ((v1) arrayList.get(i)).f11421a;
            if (str != null && str.length() != 0) {
                q qVarA = q.a(LayoutInflater.from(moreInfo.getApplicationContext()));
                View view = qVarA.f10060b;
                TextView textView = qVarA.f10061l;
                view.setLayoutParams(layoutParams);
                textView.setTypeface(c.f4883x);
                textView.setText(((v1) arrayList.get(i)).f11421a);
                textView.setOnClickListener(new d(qVarA, 7));
                linearLayout.addView(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (o7.c0.C(r3, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y0(com.uptodown.activities.MoreInfo r7, v6.c r8) {
        /*
            boolean r0 = r8 instanceof c4.y3
            if (r0 == 0) goto L13
            r0 = r8
            c4.y3 r0 = (c4.y3) r0
            int r1 = r0.f2340m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2340m = r1
            goto L18
        L13:
            c4.y3 r0 = new c4.y3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2338b
            int r1 = r0.f2340m
            r2 = 2
            r3 = 1
            r4 = 0
            u6.a r5 = u6.a.f10762a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p6.a.e(r8)
            goto L67
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            return r4
        L31:
            kotlin.jvm.internal.x r1 = r0.f2337a
            p6.a.e(r8)
            goto L53
        L37:
            p6.a.e(r8)
            kotlin.jvm.internal.x r1 = new kotlin.jvm.internal.x
            r1.<init>()
            v7.e r8 = o7.m0.f8288a
            v7.d r8 = v7.d.f10884a
            c4.z3 r6 = new c4.z3
            r6.<init>(r7, r1, r4)
            r0.f2337a = r1
            r0.f2340m = r3
            java.lang.Object r8 = o7.c0.C(r6, r8, r0)
            if (r8 != r5) goto L53
            goto L66
        L53:
            v7.e r8 = o7.m0.f8288a
            p7.c r8 = t7.n.f10348a
            c4.z3 r3 = new c4.z3
            r3.<init>(r1, r7, r4)
            r0.f2337a = r4
            r0.f2340m = r2
            java.lang.Object r7 = o7.c0.C(r3, r8, r0)
            if (r7 != r5) goto L67
        L66:
            return r5
        L67:
            p6.x r7 = p6.x.f8463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.y0(com.uptodown.activities.MoreInfo, v6.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (o7.c0.C(r3, r9, r0) != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z0(com.uptodown.activities.MoreInfo r8, v6.c r9) {
        /*
            boolean r0 = r9 instanceof c4.a4
            if (r0 == 0) goto L13
            r0 = r9
            c4.a4 r0 = (c4.a4) r0
            int r1 = r0.f1375m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1375m = r1
            goto L18
        L13:
            c4.a4 r0 = new c4.a4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f1373b
            int r1 = r0.f1375m
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            u6.a r6 = u6.a.f10762a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            p6.a.e(r9)
            goto L85
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r8)
            return r5
        L34:
            kotlin.jvm.internal.v r1 = r0.f1372a
            p6.a.e(r9)
            goto L71
        L3a:
            kotlin.jvm.internal.v r1 = r0.f1372a
            p6.a.e(r9)
            goto L5d
        L40:
            p6.a.e(r9)
            kotlin.jvm.internal.v r9 = new kotlin.jvm.internal.v
            r9.<init>()
            v7.e r1 = o7.m0.f8288a
            p7.c r1 = t7.n.f10348a
            c4.w3 r7 = new c4.w3
            r7.<init>(r8, r5, r4)
            r0.f1372a = r9
            r0.f1375m = r4
            java.lang.Object r1 = o7.c0.C(r7, r1, r0)
            if (r1 != r6) goto L5c
            goto L84
        L5c:
            r1 = r9
        L5d:
            v7.e r9 = o7.m0.f8288a
            v7.d r9 = v7.d.f10884a
            c4.b4 r4 = new c4.b4
            r4.<init>(r8, r1, r5)
            r0.f1372a = r1
            r0.f1375m = r3
            java.lang.Object r9 = o7.c0.C(r4, r9, r0)
            if (r9 != r6) goto L71
            goto L84
        L71:
            v7.e r9 = o7.m0.f8288a
            p7.c r9 = t7.n.f10348a
            c4.b4 r3 = new c4.b4
            r3.<init>(r1, r8, r5)
            r0.f1372a = r5
            r0.f1375m = r2
            java.lang.Object r8 = o7.c0.C(r3, r9, r0)
            if (r8 != r6) goto L85
        L84:
            return r6
        L85:
            p6.x r8 = p6.x.f8463a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.z0(com.uptodown.activities.MoreInfo, v6.c):java.lang.Object");
    }

    public final w B0() {
        return (w) this.P.getValue();
    }

    public final void C0(j jVar) {
        jVar.getClass();
        if (T()) {
            z1 z1Var = new z1();
            z1Var.f10683m = jVar;
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            float f = UptodownApp.I;
            fragmentTransactionBeginTransaction.getClass();
            b4.d.C(fragmentTransactionBeginTransaction, this);
            fragmentTransactionBeginTransaction.add(B0().D.getId(), z1Var, (String) null).addToBackStack(String.valueOf(jVar.f11224a)).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0290  */
    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.onCreate(android.os.Bundle):void");
    }
}
