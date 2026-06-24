package com.inmobi.cmp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import b.f;
import b.h;
import b.n;
import b.q;
import b.r;
import b.s;
import b2.t1;
import b6.g;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.DisplayInfo;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.Regulations;
import com.inmobi.cmp.presentation.components.CmpActivity;
import h8.b;
import h8.i;
import j9.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import o7.a0;
import o7.c0;
import o7.m0;
import o7.x;
import o7.z0;
import q6.v;
import t6.c;
import u5.m;
import u6.a;
import v7.d;
import v7.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoiceCmp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ChoiceCmpCallback f3269a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3270b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f3271c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static UUID f3273e;
    public static long f;
    public static h g;
    public static a0 h;
    public static boolean j;
    public static final ChoiceCmp INSTANCE = new ChoiceCmp();
    public static final r i = new r(x.f8327a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f3274k = Pattern.compile("^(p-)?([a-zA-Z0-9_-]{13})$");

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object access$handleBrandingLogo(ChoiceCmp choiceCmp, c cVar) throws Throwable {
        choiceCmp.getClass();
        h hVar = g;
        Object objC = null;
        Object[] objArr = 0;
        if (hVar == null) {
            l.i("viewModel");
            throw null;
        }
        Context applicationContext = m9.c.b().getApplicationContext();
        applicationContext.getClass();
        if (hVar.f678p.v.length() != 0) {
            e eVar = m0.f8289a;
            objC = c0.C(new n((Object) applicationContext, (Object) hVar, (c) (objArr == true ? 1 : 0), 1), d.f10885a, cVar);
        }
        return objC == a.f10763a ? objC : p6.x.f8464a;
    }

    public static final Object access$handleFonts(ChoiceCmp choiceCmp, l8.e eVar, c cVar) {
        choiceCmp.getClass();
        p6.x xVar = p6.x.f8464a;
        if (eVar == null) {
            a.a.h(null, "No font found", null, 5);
            return xVar;
        }
        Object objI = c0.i(new g(m9.c.b(), eVar, null), cVar);
        a aVar = a.f10763a;
        if (objI != aVar) {
            objI = xVar;
        }
        return objI == aVar ? objI : xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$handleGBC(com.inmobi.cmp.ChoiceCmp r5, l8.n r6, t6.c r7) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof b.c
            if (r0 == 0) goto L16
            r0 = r7
            b.c r0 = (b.c) r0
            int r1 = r0.f653l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f653l = r1
            goto L1b
        L16:
            b.c r0 = new b.c
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.f651a
            int r7 = r0.f653l
            java.lang.String r1 = "viewModel"
            p6.x r2 = p6.x.f8464a
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L33
            if (r7 != r3) goto L2d
            p6.a.e(r5)
            goto L56
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            return r4
        L33:
            p6.a.e(r5)
            l8.h r5 = r6.f7243q
            boolean r5 = r5.f7197a
            if (r5 != 0) goto L3d
            return r2
        L3d:
            b.h r5 = com.inmobi.cmp.ChoiceCmp.g
            if (r5 == 0) goto L72
            r0.f653l = r3
            v7.e r6 = o7.m0.f8289a
            v7.d r6 = v7.d.f10885a
            b.a r7 = new b.a
            r3 = 3
            r7.<init>(r5, r4, r3)
            java.lang.Object r5 = o7.c0.C(r7, r6, r0)
            u6.a r6 = u6.a.f10763a
            if (r5 != r6) goto L56
            return r6
        L56:
            k6.c r5 = (k6.c) r5
            android.app.Application r6 = m9.c.f7858a
            r5.getClass()
            m9.c.g = r5
            b.h r5 = com.inmobi.cmp.ChoiceCmp.g
            if (r5 == 0) goto L6e
            boolean r6 = l.g.f7045a
            l8.n r5 = r5.f678p
            l8.h r5 = r5.f7243q
            boolean r5 = r5.f7197a
            l.g.f7045a = r5
            return r2
        L6e:
            kotlin.jvm.internal.l.i(r1)
            throw r4
        L72:
            kotlin.jvm.internal.l.i(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$handleGBC(com.inmobi.cmp.ChoiceCmp, l8.n, t6.c):java.lang.Object");
    }

    public static final Object access$handleGDPR(ChoiceCmp choiceCmp, boolean z9, c cVar) {
        choiceCmp.getClass();
        Object objI = c0.i(new f(z9, null), cVar);
        return objI == a.f10763a ? objI : p6.x.f8464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$handleMSPA(com.inmobi.cmp.ChoiceCmp r4, l8.n r5, t6.c r6) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof b.g
            if (r0 == 0) goto L16
            r0 = r6
            b.g r0 = (b.g) r0
            int r1 = r0.f667l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f667l = r1
            goto L1b
        L16:
            b.g r0 = new b.g
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f665a
            int r6 = r0.f667l
            r1 = 0
            p6.x r2 = p6.x.f8464a
            r3 = 1
            if (r6 == 0) goto L31
            if (r6 != r3) goto L2b
            p6.a.e(r4)
            goto L6b
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            return r1
        L31:
            p6.a.e(r4)
            java.util.List r4 = r5.f7232a
            com.inmobi.cmp.model.Regulations r5 = com.inmobi.cmp.model.Regulations.MSPA
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L3f
            return r2
        L3f:
            l8.n r4 = m9.c.e()
            j8.e.f6736e = r4
            p6.m r4 = m9.c.v
            java.lang.Object r4 = r4.getValue()
            l9.a r4 = (l9.a) r4
            r4.getClass()
            j8.e.f = r4
            b.h r4 = com.inmobi.cmp.ChoiceCmp.g
            if (r4 == 0) goto L75
            r0.f667l = r3
            v7.e r5 = o7.m0.f8289a
            v7.d r5 = v7.d.f10885a
            b.e r6 = new b.e
            r3 = 0
            r6.<init>(r4, r1, r3)
            java.lang.Object r4 = o7.c0.C(r6, r5, r0)
            u6.a r5 = u6.a.f10763a
            if (r4 != r5) goto L6b
            return r5
        L6b:
            j8.a r4 = (j8.a) r4
            android.app.Application r5 = m9.c.f7858a
            r4.getClass()
            m9.c.h = r4
            return r2
        L75:
            java.lang.String r4 = "viewModel"
            kotlin.jvm.internal.l.i(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$handleMSPA(com.inmobi.cmp.ChoiceCmp, l8.n, t6.c):java.lang.Object");
    }

    public static final Object access$loadCmpInfo(ChoiceCmp choiceCmp, ChoiceStyle choiceStyle, c cVar) {
        choiceCmp.getClass();
        Object objI = c0.i(new n(choiceStyle, null, 0), cVar);
        return objI == a.f10763a ? objI : p6.x.f8464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$loadCmpList(com.inmobi.cmp.ChoiceCmp r5, t6.c r6) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof b.o
            if (r0 == 0) goto L16
            r0 = r6
            b.o r0 = (b.o) r0
            int r1 = r0.f702l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f702l = r1
            goto L1b
        L16:
            b.o r0 = new b.o
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r5 = r0.f700a
            int r6 = r0.f702l
            java.lang.String r1 = "viewModel"
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L31
            if (r6 != r2) goto L2b
            p6.a.e(r5)
            goto L4d
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            return r3
        L31:
            p6.a.e(r5)
            b.h r5 = com.inmobi.cmp.ChoiceCmp.g
            if (r5 == 0) goto L5f
            r0.f702l = r2
            v7.e r6 = o7.m0.f8289a
            v7.d r6 = v7.d.f10885a
            b.a r2 = new b.a
            r4 = 0
            r2.<init>(r5, r3, r4)
            java.lang.Object r5 = o7.c0.C(r2, r6, r0)
            u6.a r6 = u6.a.f10763a
            if (r5 != r6) goto L4d
            return r6
        L4d:
            u5.f r5 = (u5.f) r5
            b.h r6 = com.inmobi.cmp.ChoiceCmp.g
            if (r6 == 0) goto L5b
            r5.getClass()
            r6.f677o = r5
            p6.x r5 = p6.x.f8464a
            return r5
        L5b:
            kotlin.jvm.internal.l.i(r1)
            throw r3
        L5f:
            kotlin.jvm.internal.l.i(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$loadCmpList(com.inmobi.cmp.ChoiceCmp, t6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v66, types: [java.lang.Object, java.util.List] */
    public static final void access$loadDefaultValues(ChoiceCmp choiceCmp, List list) throws Throwable {
        String str;
        Throwable th;
        LinkedHashMap linkedHashMap;
        String str2;
        Iterator it;
        int i6;
        LinkedHashMap linkedHashMap2;
        int i10;
        Iterable iterableJ0;
        LinkedHashMap linkedHashMap3;
        int i11;
        LinkedHashMap linkedHashMap4;
        ?? r62;
        Iterator it2;
        int i12;
        LinkedHashMap linkedHashMap5;
        int i13;
        LinkedHashMap linkedHashMap6;
        LinkedHashMap linkedHashMap7;
        choiceCmp.getClass();
        h hVar = g;
        String str3 = "viewModel";
        if (hVar == null) {
            l.i("viewModel");
            throw null;
        }
        String strJ = hVar.f668a.j(63);
        if (strJ.length() > 0) {
            Application application = m9.c.f7858a;
            l3.a aVar = new l3.a();
            aVar.f7092a = new HashMap();
            aVar.f7093b = strJ;
            aVar.f7094c = false;
            aVar.f7095d = false;
            m9.c.i = aVar;
        }
        h hVar2 = g;
        if (hVar2 == null) {
            l.i("viewModel");
            throw null;
        }
        l9.a aVar2 = hVar2.f668a;
        if (hVar2.f678p.f7232a.contains(Regulations.USP)) {
            String strJ2 = aVar2.j(38);
            if (strJ2.length() > 0) {
                aVar2.f(37, strJ2);
            } else {
                l9.a.i(aVar2, aVar2.a(1, 2).equals("Y") ? 2 : 1, aVar2.a(2, 3).equals("Y") ? 2 : 1, hVar2.f678p.f7242p.f7181a.equals("Y") ? 2 : 1);
            }
        } else {
            aVar2.f(37, "1---");
        }
        if (list.contains(Regulations.GDPR)) {
            h hVar3 = g;
            if (hVar3 == null) {
                l.i("viewModel");
                throw null;
            }
            l9.a aVar3 = hVar3.f668a;
            m mVar = hVar3.f669b;
            Vector vector = mVar.D;
            Vector vector2 = mVar.A;
            h8.c cVar = mVar.f10738a;
            if (cVar != null && (linkedHashMap = cVar.h) != null) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((i) entry.getValue()).f5476e.isEmpty()) {
                        i iVar = (i) entry.getValue();
                        if (!iVar.f5475d.isEmpty() || !iVar.f5476e.isEmpty() || iVar.g.isEmpty()) {
                        }
                    }
                    if (!mVar.C.contains(((i) entry.getValue()).f5466a)) {
                        mVar.C.set(((i) entry.getValue()).f5466a);
                    }
                }
            }
            th = null;
            h8.c cVar2 = mVar.f10738a;
            if (cVar2 != null && (linkedHashMap7 = cVar2.h) != null) {
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap7.entrySet()) {
                    if (((i) entry2.getValue()).f5477k == null) {
                        linkedHashMap8.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry entry3 : linkedHashMap8.entrySet()) {
                    if (!mVar.f10757z.contains(((i) entry3.getValue()).f5466a)) {
                        mVar.E.set(((i) entry3.getValue()).f5466a);
                        mVar.f10757z.unset(((i) entry3.getValue()).f5466a);
                    }
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h8.c cVar3 = mVar.f10738a;
            if (cVar3 != null && (linkedHashMap6 = cVar3.h) != null) {
                Iterator it3 = linkedHashMap6.entrySet().iterator();
                while (it3.hasNext()) {
                    linkedHashSet.addAll(((i) ((Map.Entry) it3.next()).getValue()).f5475d);
                }
            }
            Iterator it4 = hVar3.f678p.f7240n.f7213t.f7229a.iterator();
            while (it4.hasNext()) {
                linkedHashSet.addAll(((l8.l) it4.next()).f);
            }
            h8.c cVar4 = mVar.f10738a;
            if (cVar4 != null) {
                ?? r13 = cVar4.f5463d;
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                for (Map.Entry entry4 : r13.entrySet()) {
                    if (linkedHashSet.contains(Integer.valueOf(((h8.f) entry4.getValue()).f5466a))) {
                        linkedHashMap9.put(entry4.getKey(), entry4.getValue());
                    }
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                for (Map.Entry entry5 : linkedHashMap9.entrySet()) {
                    if (hVar3.f678p.f7240n.g.contains(Integer.valueOf(((h8.f) entry5.getValue()).f5466a)) || hVar3.f678p.f7240n.f7205l.contains(Integer.valueOf(((h8.f) entry5.getValue()).f5466a))) {
                        linkedHashMap10.put(entry5.getKey(), entry5.getValue());
                    }
                }
                for (Map.Entry entry6 : linkedHashMap10.entrySet()) {
                    if (!mVar.f10750r.contains(((h8.f) entry6.getValue()).f5466a)) {
                        int i14 = ((h8.f) entry6.getValue()).f5466a;
                        h8.c cVar5 = mVar.f10738a;
                        if (cVar5 == null) {
                            continue;
                        } else {
                            ?? r14 = cVar5.f5463d;
                            LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                            for (Map.Entry entry7 : r14.entrySet()) {
                                if (((h8.f) entry7.getValue()).f5466a == i14) {
                                    linkedHashMap11.put(entry7.getKey(), entry7.getValue());
                                }
                            }
                            int i15 = 0;
                            for (Map.Entry entry8 : linkedHashMap11.entrySet()) {
                                h8.c cVar6 = mVar.f10738a;
                                if (cVar6 == null || (linkedHashMap2 = cVar6.h) == null) {
                                    str2 = str3;
                                } else {
                                    LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                    for (Map.Entry entry9 : linkedHashMap2.entrySet()) {
                                        if (((i) entry9.getValue()).f5477k == null) {
                                            linkedHashMap12.put(entry9.getKey(), entry9.getValue());
                                            str3 = str3;
                                        }
                                    }
                                    str2 = str3;
                                    Iterator it5 = linkedHashMap12.entrySet().iterator();
                                    while (it5.hasNext()) {
                                        Set set = ((i) ((Map.Entry) it5.next()).getValue()).f5475d;
                                        if (set == null || !set.isEmpty()) {
                                            Iterator it6 = set.iterator();
                                            i10 = 0;
                                            while (it6.hasNext()) {
                                                if (((Number) it6.next()).intValue() == i14 && (i10 = i10 + 1) < 0) {
                                                    q6.m.g0();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            i10 = 0;
                                        }
                                        i15 += i10;
                                    }
                                }
                                Iterator it7 = hVar3.f678p.f7240n.f7213t.f7229a.iterator();
                                while (it7.hasNext()) {
                                    ArrayList arrayList = ((l8.l) it7.next()).f;
                                    if (arrayList.isEmpty()) {
                                        it = it7;
                                        i6 = 0;
                                    } else {
                                        int size = arrayList.size();
                                        it = it7;
                                        int i16 = 0;
                                        i6 = 0;
                                        while (i16 < size) {
                                            Object obj = arrayList.get(i16);
                                            int i17 = i16 + 1;
                                            if (((Number) obj).intValue() == i14 && (i6 = i6 + 1) < 0) {
                                                q6.m.g0();
                                                throw null;
                                            }
                                            i16 = i17;
                                        }
                                    }
                                    i15 += i6;
                                    it7 = it;
                                }
                                Iterator it8 = hVar3.f678p.f7240n.f7205l.iterator();
                                while (it8.hasNext()) {
                                    if (((Number) it8.next()).intValue() == i14) {
                                        i15++;
                                    }
                                }
                                str3 = str2;
                            }
                            String str4 = str3;
                            if (i15 > 0) {
                                mVar.f10750r.unset(((h8.f) entry6.getValue()).f5466a);
                            }
                            str3 = str4;
                        }
                    }
                }
            }
            str = str3;
            l8.i iVar2 = hVar3.f678p.f7240n;
            h8.c cVar7 = mVar.f10738a;
            if (cVar7 != null) {
                ?? r32 = cVar7.f5463d;
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                for (Map.Entry entry10 : r32.entrySet()) {
                    if (iVar2.i.contains(Integer.valueOf(((h8.f) entry10.getValue()).f5466a)) || iVar2.f7206m.contains(Integer.valueOf(((h8.f) entry10.getValue()).f5466a))) {
                        linkedHashMap13.put(entry10.getKey(), entry10.getValue());
                    }
                }
                Iterator it9 = linkedHashMap13.entrySet().iterator();
                while (it9.hasNext()) {
                    Map.Entry entry11 = (Map.Entry) it9.next();
                    if (!mVar.f10751s.contains(((h8.f) entry11.getValue()).f5466a)) {
                        int i18 = ((h8.f) entry11.getValue()).f5466a;
                        h8.c cVar8 = mVar.f10738a;
                        if (cVar8 == null) {
                            r62 = 0;
                        } else {
                            ?? r63 = cVar8.f5463d;
                            r62 = r63;
                            if (!mVar.h.equals("DE")) {
                                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                                for (Map.Entry entry12 : r63.entrySet()) {
                                    if (((h8.f) entry12.getValue()).f5466a != 1) {
                                        linkedHashMap14.put(entry12.getKey(), entry12.getValue());
                                    }
                                }
                                r62 = linkedHashMap14;
                            }
                        }
                        if (r62 == 0) {
                            continue;
                        } else {
                            LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                            for (Map.Entry entry13 : r62.entrySet()) {
                                if (((h8.f) entry13.getValue()).f5466a == i18) {
                                    linkedHashMap15.put(entry13.getKey(), entry13.getValue());
                                }
                            }
                            int i19 = 0;
                            for (Map.Entry entry14 : linkedHashMap15.entrySet()) {
                                h8.c cVar9 = mVar.f10738a;
                                if (cVar9 != null && (linkedHashMap5 = cVar9.h) != null) {
                                    LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                                    for (Map.Entry entry15 : linkedHashMap5.entrySet()) {
                                        if (((i) entry15.getValue()).f5477k == null) {
                                            linkedHashMap16.put(entry15.getKey(), entry15.getValue());
                                        }
                                    }
                                    Iterator it10 = linkedHashMap16.entrySet().iterator();
                                    while (it10.hasNext()) {
                                        Set set2 = ((i) ((Map.Entry) it10.next()).getValue()).f5476e;
                                        if (set2 == null || !set2.isEmpty()) {
                                            Iterator it11 = set2.iterator();
                                            i13 = 0;
                                            while (it11.hasNext()) {
                                                if (((Number) it11.next()).intValue() == i18 && (i13 = i13 + 1) < 0) {
                                                    q6.m.g0();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            i13 = 0;
                                        }
                                        i19 += i13;
                                    }
                                }
                                Iterator it12 = hVar3.f678p.f7240n.f7213t.f7229a.iterator();
                                while (it12.hasNext()) {
                                    ArrayList arrayList2 = ((l8.l) it12.next()).g;
                                    if (arrayList2.isEmpty()) {
                                        it2 = it9;
                                        i12 = 0;
                                    } else {
                                        int size2 = arrayList2.size();
                                        it2 = it9;
                                        int i20 = 0;
                                        i12 = 0;
                                        while (i20 < size2) {
                                            Object obj2 = arrayList2.get(i20);
                                            int i21 = i20 + 1;
                                            if (((Number) obj2).intValue() == i18 && (i12 = i12 + 1) < 0) {
                                                q6.m.g0();
                                                throw null;
                                            }
                                            i20 = i21;
                                        }
                                    }
                                    i19 += i12;
                                    it9 = it2;
                                }
                                Iterator it13 = it9;
                                Iterator it14 = hVar3.f678p.f7240n.f7206m.iterator();
                                while (it14.hasNext()) {
                                    if (((Number) it14.next()).intValue() == i18) {
                                        i19++;
                                    }
                                }
                                it9 = it13;
                            }
                            Iterator it15 = it9;
                            if (i19 > 0) {
                                mVar.f10751s.set(((h8.f) entry11.getValue()).f5466a);
                            }
                            it9 = it15;
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            h8.c cVar10 = mVar.f10738a;
            if (cVar10 != null && (linkedHashMap4 = cVar10.h) != null) {
                Iterator it16 = linkedHashMap4.entrySet().iterator();
                while (it16.hasNext()) {
                    linkedHashSet2.addAll(((i) ((Map.Entry) it16.next()).getValue()).i);
                }
            }
            h8.c cVar11 = mVar.f10738a;
            if (cVar11 != null) {
                ?? r33 = cVar11.g;
                LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                for (Map.Entry entry16 : r33.entrySet()) {
                    if (linkedHashSet2.contains(Integer.valueOf(((b) entry16.getValue()).f5466a))) {
                        linkedHashMap17.put(entry16.getKey(), entry16.getValue());
                    }
                }
                LinkedHashMap linkedHashMap18 = new LinkedHashMap();
                for (Map.Entry entry17 : linkedHashMap17.entrySet()) {
                    if (hVar3.f678p.f7240n.j.contains(Integer.valueOf(((b) entry17.getValue()).f5466a)) || hVar3.f678p.f7240n.f7209p.contains(Integer.valueOf(((b) entry17.getValue()).f5466a))) {
                        linkedHashMap18.put(entry17.getKey(), entry17.getValue());
                    }
                }
                for (Map.Entry entry18 : linkedHashMap18.entrySet()) {
                    if (!mVar.f10749q.contains(((b) entry18.getValue()).f5466a)) {
                        int i22 = ((b) entry18.getValue()).f5466a;
                        h8.c cVar12 = mVar.f10738a;
                        if (cVar12 == null) {
                            continue;
                        } else {
                            ?? r64 = cVar12.g;
                            LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                            for (Map.Entry entry19 : r64.entrySet()) {
                                if (((b) entry19.getValue()).f5466a == i22) {
                                    linkedHashMap19.put(entry19.getKey(), entry19.getValue());
                                }
                            }
                            int i23 = 0;
                            for (Map.Entry entry20 : linkedHashMap19.entrySet()) {
                                h8.c cVar13 = mVar.f10738a;
                                if (cVar13 != null && (linkedHashMap3 = cVar13.h) != null) {
                                    LinkedHashMap linkedHashMap20 = new LinkedHashMap();
                                    for (Map.Entry entry21 : linkedHashMap3.entrySet()) {
                                        if (((i) entry21.getValue()).f5477k == null) {
                                            linkedHashMap20.put(entry21.getKey(), entry21.getValue());
                                        }
                                    }
                                    Iterator it17 = linkedHashMap20.entrySet().iterator();
                                    while (it17.hasNext()) {
                                        Set set3 = ((i) ((Map.Entry) it17.next()).getValue()).i;
                                        if (set3 == null || !set3.isEmpty()) {
                                            Iterator it18 = set3.iterator();
                                            i11 = 0;
                                            while (it18.hasNext()) {
                                                if (((Number) it18.next()).intValue() == i22 && (i11 = i11 + 1) < 0) {
                                                    q6.m.g0();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            i11 = 0;
                                        }
                                        i23 += i11;
                                    }
                                }
                                Iterator it19 = hVar3.f678p.f7240n.f7209p.iterator();
                                while (it19.hasNext()) {
                                    if (((Number) it19.next()).intValue() == i22) {
                                        i23++;
                                    }
                                }
                            }
                            if (i23 > 0) {
                                mVar.f10749q.unset(((b) entry18.getValue()).f5466a);
                            }
                        }
                    }
                }
            }
            for (l8.l lVar : hVar3.f678p.f7240n.f7213t.f7229a) {
                ArrayList arrayList3 = lVar.f;
                int i24 = lVar.f7224a;
                if (hVar3.d(q6.l.J0(arrayList3))) {
                    vector2.unset(i24);
                }
                if (!lVar.g.isEmpty()) {
                    vector.set(i24);
                }
            }
            Iterator it20 = hVar3.f678p.f7240n.f7205l.iterator();
            while (it20.hasNext()) {
                mVar.v.unset(((Number) it20.next()).intValue());
            }
            Iterator it21 = hVar3.f678p.f7240n.f7206m.iterator();
            while (it21.hasNext()) {
                mVar.f10754w.set(((Number) it21.next()).intValue());
            }
            aVar3.getClass();
            double d10 = (hVar3.f678p.f7239m - r2) / 86400000;
            if (aVar3.f7263a.getLong("GDPR_Consent_LastStoredTimeStamp", 0L) != 0 && d10 >= 395.0d) {
                hVar3.f();
                m9.c.c().b(2);
                hVar3.b();
                aVar3.b(81);
                aVar3.b(82);
                aVar3.b(83);
                aVar3.b(84);
                aVar3.b(85);
                String strC = m9.c.c().c();
                strC.getClass();
                aVar3.f(63, strC);
            }
            hVar3.l();
            String strJ3 = aVar3.j(31);
            if (strJ3.length() <= 0) {
                strJ3 = null;
            }
            if (strJ3 != null) {
                if (strJ3.length() <= 2) {
                    iterableJ0 = v.f8727a;
                } else {
                    List listG0 = l7.m.G0(strJ3.substring(2), new String[]{"."});
                    ArrayList arrayList4 = new ArrayList(q6.n.i0(listG0, 10));
                    Iterator it22 = listG0.iterator();
                    while (it22.hasNext()) {
                        arrayList4.add(Integer.valueOf(Integer.parseInt((String) it22.next())));
                    }
                    iterableJ0 = q6.l.J0(arrayList4);
                }
                Iterator it23 = iterableJ0.iterator();
                while (it23.hasNext()) {
                    mVar.B.set(((Number) it23.next()).intValue());
                }
            }
            if (aVar3.j(35).length() > 0) {
                vector2.setOwnedItems(d0.b.b(aVar3.j(35)));
                vector.unset(d0.b.b(aVar3.j(36)));
            }
            h hVar4 = g;
            if (hVar4 == null) {
                l.i(str);
                throw null;
            }
            l9.a aVar4 = hVar4.f668a;
            if (!hVar4.k()) {
                aVar4.c(25, hVar4.i());
                aVar4.d(26, System.currentTimeMillis());
            }
            if (!l.g(hVar4.g(), aVar4.j(23)).equals(aVar4.j(22))) {
                if (aVar4.j(23).equals("")) {
                    aVar4.f(23, t1.m(hVar4.f669b.A.toString()));
                }
                aVar4.f(24, hVar4.g());
                aVar4.f(22, l.g(hVar4.g(), aVar4.j(23)));
                aVar4.f(27, hVar4.f678p.f7240n.f7208o.toString());
            }
            String str5 = hVar4.f678p.f7240n.f7199a;
            if (l.a(str5, PrivacyEncodingMode.GPP.getValue())) {
                hVar4.m();
            } else if (l.a(str5, PrivacyEncodingMode.TCF.getValue())) {
                hVar4.n();
            } else {
                hVar4.m();
                hVar4.n();
            }
            if (d0.b.C()) {
                a();
            }
        } else {
            str = "viewModel";
            th = null;
        }
        if (list.contains(Regulations.USP)) {
            h hVar5 = g;
            if (hVar5 == null) {
                l.i(str);
                throw th;
            }
            l9.a aVar5 = hVar5.f668a;
            aVar5.getClass();
            boolean z9 = aVar5.f7263a.getBoolean("MSPAShown", false);
            j8.e.f6735d = z9;
            ((l9.a) m9.c.v.getValue()).g(67, z9);
        }
        boolean z10 = l.g.f7045a;
        if (z10) {
            h hVar6 = g;
            if (hVar6 == null) {
                l.i(str);
                throw th;
            }
            if (!z10) {
                hVar6.f668a.f(39, "");
            }
            h hVar7 = g;
            if (hVar7 == null) {
                l.i(str);
                throw th;
            }
            for (l8.g gVar : hVar7.f678p.f7243q.f7198b) {
                boolean z11 = l.g.f7045a;
                int i25 = gVar.f7195a;
                GBCConsentValue gBCConsentValue = gVar.f7196b;
                gBCConsentValue.getClass();
                if (gBCConsentValue == GBCConsentValue.GRANTED) {
                    l.g.f7046b.set(i25);
                } else {
                    l.g.f7046b.unset(i25);
                }
            }
        }
        h hVar8 = g;
        if (hVar8 == null) {
            l.i(str);
            throw th;
        }
        hVar8.f673k = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$loadPortalConfigAndInitialize(com.inmobi.cmp.ChoiceCmp r7, t6.c r8) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof b.p
            if (r0 == 0) goto L16
            r0 = r8
            b.p r0 = (b.p) r0
            int r1 = r0.f705l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f705l = r1
            goto L1b
        L16:
            b.p r0 = new b.p
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r7 = r0.f703a
            int r8 = r0.f705l
            r1 = 1
            java.lang.String r2 = "viewModel"
            r3 = 0
            if (r8 == 0) goto L31
            if (r8 != r1) goto L2b
            p6.a.e(r7)
            goto L4d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            return r3
        L31:
            p6.a.e(r7)
            b.h r7 = com.inmobi.cmp.ChoiceCmp.g
            if (r7 == 0) goto Lbc
            r0.f705l = r1
            v7.e r8 = o7.m0.f8289a
            v7.d r8 = v7.d.f10885a
            b.a r1 = new b.a
            r4 = 2
            r1.<init>(r7, r3, r4)
            java.lang.Object r7 = o7.c0.C(r1, r8, r0)
            u6.a r8 = u6.a.f10763a
            if (r7 != r8) goto L4d
            return r8
        L4d:
            l8.n r7 = (l8.n) r7
            java.lang.String r8 = r7.f7234c
            n6.a r0 = r7.j
            l8.i r1 = r7.f7240n
            boolean r8 = l7.m.z0(r8)
            if (r8 == 0) goto L5c
            return r3
        L5c:
            m9.c.f = r7
            b.h r8 = com.inmobi.cmp.ChoiceCmp.g
            if (r8 == 0) goto Lb8
            l9.a r4 = r8.f668a
            r8.f678p = r7
            j9.f r5 = r8.f
            r5.getClass()
            l8.j r6 = r1.f7212s
            r5.h = r6
            l8.r r6 = r7.f7244r
            r5.g = r6
            u5.m r5 = r8.f669b
            u5.h r5 = r5.G
            java.lang.Object r6 = r1.f7210q
            r5.getClass()
            r6.getClass()
            r5.f10719a = r6
            java.lang.Object r6 = r1.f7211r
            r6.getClass()
            r5.f10720b = r6
            r5 = 32
            boolean r1 = r1.f7200b
            r4.g(r5, r1)
            boolean r8 = r8.j()
            if (r8 == 0) goto L98
            java.lang.String r8 = "en"
            goto L9a
        L98:
            java.lang.String r8 = r7.f
        L9a:
            r1 = 33
            r4.f(r1, r8)
            long r4 = java.lang.System.currentTimeMillis()
            com.inmobi.cmp.ChoiceCmp.f = r4
            b.h r8 = com.inmobi.cmp.ChoiceCmp.g
            if (r8 == 0) goto Lb4
            r8.f675m = r0
            java.lang.String r8 = r0.f8107b
            b2.t1.f946b = r8
            java.lang.String r8 = r0.f8106a
            b2.t1.f947c = r8
            return r7
        Lb4:
            kotlin.jvm.internal.l.i(r2)
            throw r3
        Lb8:
            kotlin.jvm.internal.l.i(r2)
            throw r3
        Lbc:
            kotlin.jvm.internal.l.i(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$loadPortalConfigAndInitialize(com.inmobi.cmp.ChoiceCmp, t6.c):java.lang.Object");
    }

    public static final Object access$showCMP(ChoiceCmp choiceCmp, c cVar) throws Throwable {
        choiceCmp.getClass();
        if (a.a.f0a && m9.c.f7858a != null) {
            e eVar = m0.f8289a;
            Object objC = c0.C(new q(2, null), t7.n.f10349a.f8469l, cVar);
            if (objC == a.f10763a) {
                return objC;
            }
        }
        return p6.x.f8464a;
    }

    public static final void access$startLoadCmpInfo(ChoiceCmp choiceCmp, ChoiceStyle choiceStyle) {
        choiceCmp.getClass();
        a0 a0VarB = h;
        if (a0VarB == null) {
            a0VarB = c0.b(c0.d());
        }
        h = a0VarB;
        c0.s(a0VarB, i, null, new s(choiceStyle, (c) null, 0), 2);
    }

    public static final void forceDisplayUI(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (!choiceCmp.isViewModelAvailable$app_release()) {
            ChoiceCmpCallback choiceCmpCallback = f3269a;
            if (choiceCmpCallback == null) {
                return;
            }
            choiceCmpCallback.onCmpError(ChoiceError.MISSING_INITIALIZATION);
            return;
        }
        h hVar = g;
        if (hVar == null) {
            l.i("viewModel");
            throw null;
        }
        if (hVar.f678p.f7232a.contains(Regulations.GDPR)) {
            choiceCmp.a(activity, true);
            return;
        }
        ChoiceCmpCallback choiceCmpCallback2 = f3269a;
        if (choiceCmpCallback2 != null) {
            choiceCmpCallback2.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "GDPR not applicable", Regulations.NA, false, 8, null));
        }
        a.a.h(null, ChoiceError.GDPR_NA.getMessage(), null, 5);
    }

    public static final GDPRData getGDPRData(Set<Integer> set) {
        if (INSTANCE.isViewModelAvailable$app_release()) {
            return new GDPRData(set);
        }
        return null;
    }

    public static /* synthetic */ GDPRData getGDPRData$default(Set set, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            set = null;
        }
        return getGDPRData(set);
    }

    public static final NonIABData getNonIABData(Set<Integer> set) {
        Map<Integer, Boolean> map;
        if (!INSTANCE.isViewModelAvailable$app_release()) {
            return null;
        }
        h hVar = g;
        if (hVar == null) {
            l.i("viewModel");
            throw null;
        }
        l9.a aVar = hVar.f668a;
        aVar.getClass();
        boolean z9 = aVar.f7263a.getInt("IABTCF_gdprApplies", 0) == 1;
        String strJ = aVar.j(34);
        Map<Integer, Boolean> map2 = hVar.f669b.A.getMap();
        if (set == null) {
            map = map2;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Boolean> entry : map2.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        }
        return new NonIABData(z9, false, false, strJ, map);
    }

    public static /* synthetic */ NonIABData getNonIABData$default(Set set, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            set = null;
        }
        return getNonIABData(set);
    }

    public static final String getSDKVersion() {
        return "2.4.1";
    }

    public static final void setUserSubscriptionStatus(boolean z9) {
        j = false;
        f3272d = z9;
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release() && d0.b.C() && choiceCmp.isViewModelAvailable$app_release()) {
            a();
            if (!a.a.f0a || m9.c.f7858a == null || f3272d) {
                return;
            }
            choiceCmp.a(m9.c.b());
        }
    }

    public static final void showCCPAScreen(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            h hVar = g;
            if (hVar == null) {
                l.i("viewModel");
                throw null;
            }
            Regulations regulations = Regulations.USP;
            regulations.getClass();
            if (hVar.f678p.f7232a.contains(regulations)) {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_ACTION", "ACTION_SHOW_CCPA_SCREEN");
                choiceCmp.startCMPActivity$app_release(activity, bundle);
                return;
            }
        }
        ChoiceCmpCallback choiceCmpCallback = f3269a;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "CCPA not applicable", Regulations.NA, false, 8, null));
        }
        a.a.h(null, ChoiceError.US_PRIVACY_NOT_APPLICABLE.getMessage(), null, 5);
    }

    public static final void showGBCScreen(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (!choiceCmp.isViewModelAvailable$app_release()) {
            ChoiceCmpCallback choiceCmpCallback = f3269a;
            if (choiceCmpCallback == null) {
                return;
            }
            choiceCmpCallback.onCmpError(ChoiceError.MISSING_INITIALIZATION);
            return;
        }
        if (l.g.f7045a) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ACTION", "ACTION_SHOW_GBC_SCREEN");
            choiceCmp.startCMPActivity$app_release(activity, bundle);
        } else {
            ChoiceCmpCallback choiceCmpCallback2 = f3269a;
            if (choiceCmpCallback2 != null) {
                choiceCmpCallback2.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "GBC not applicable", Regulations.NA, false, 8, null));
            }
            a.a.h(null, ChoiceError.GBC_NOT_APPLICABLE.getMessage(), null, 5);
        }
    }

    public static final void showUSRegulationScreen(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            h hVar = g;
            if (hVar == null) {
                l.i("viewModel");
                throw null;
            }
            List list = hVar.f678p.f7232a;
            Regulations regulations = Regulations.MSPA;
            if (list.contains(regulations) || hVar.f678p.f7232a.contains(Regulations.USP)) {
                h hVar2 = g;
                if (hVar2 == null) {
                    l.i("viewModel");
                    throw null;
                }
                regulations.getClass();
                if (hVar2.f678p.f7232a.contains(regulations)) {
                    j8.e.g(m9.c.d());
                }
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN");
                bundle.putBoolean("EXTRA_FORCE", true);
                choiceCmp.startCMPActivity$app_release(activity, bundle);
                return;
            }
        }
        ChoiceCmpCallback choiceCmpCallback = f3269a;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "US regulations not applicable", Regulations.NA, false, 8, null));
        }
        a.a.h(null, ChoiceError.US_PRIVACY_NOT_APPLICABLE.getMessage(), null, 5);
    }

    public static final void startChoice(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle) {
        application.getClass();
        str.getClass();
        str2.getClass();
        choiceCmpCallback.getClass();
        choiceStyle.getClass();
        f3269a = choiceCmpCallback;
        f3270b = str;
        INSTANCE.getClass();
        Matcher matcher = f3274k.matcher(str2);
        c cVar = null;
        String strGroup = matcher.matches() ? matcher.group(2) : null;
        if (strGroup == null) {
            ChoiceCmpCallback choiceCmpCallback2 = f3269a;
            if (choiceCmpCallback2 != null) {
                choiceCmpCallback2.onCmpError(ChoiceError.INVALID_PCODE);
            }
            strGroup = null;
        }
        if (strGroup == null) {
            strGroup = null;
        }
        if (strGroup == null) {
            return;
        }
        f3271c = strGroup;
        m9.c.f7858a = application;
        if (g == null) {
            g = new h((l9.a) m9.c.v.getValue(), m9.c.f(), (j9.s) m9.c.f7865m.getValue(), (j9.e) m9.c.f7867o.getValue(), (j9.x) m9.c.f7869q.getValue(), (j9.f) m9.c.f7870r.getValue(), (j9.n) m9.c.f7871s.getValue(), (j9.l) m9.c.f7872t.getValue(), (j9.h) m9.c.f7866n.getValue(), (j) m9.c.f7868p.getValue());
            a0 a0VarB = h;
            if (a0VarB == null) {
                a0VarB = c0.b(c0.d());
            }
            h = a0VarB;
            c0.s(a0VarB, i, null, new s(choiceStyle, cVar, 0), 2);
        }
        application.registerActivityLifecycleCallbacks(new m9.a(new a3.d(choiceStyle, 3)));
        application.registerActivityLifecycleCallbacks(new b.b());
    }

    public static /* synthetic */ void startChoice$default(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            choiceStyle = new ChoiceStyle();
        }
        startChoice(application, str, str2, choiceCmpCallback, choiceStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r15) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.a(android.content.Context):void");
    }

    public final void b() {
        h hVar = g;
        if (hVar == null) {
            l.i("viewModel");
            throw null;
        }
        if (hVar.f678p.f7237k.f7184a.equals(Boolean.TRUE)) {
            h hVar2 = g;
            if (hVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            if (hVar2.o()) {
                sendNRVisitEvent$app_release();
            }
        }
        ChoiceCmpCallback choiceCmpCallback = f3269a;
        String str = "No regulations applicable";
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, str, Regulations.NA, false, 8, null));
        }
        a.a.h(null, "No regulations applicable", null, 5);
    }

    public final String getAppPackageId() {
        return f3270b;
    }

    public final ChoiceCmpCallback getCallback() {
        return f3269a;
    }

    public final UUID getCurrentSessionId() {
        return f3273e;
    }

    public final u5.d getGoogleVendorList$app_release() {
        h hVar = g;
        if (hVar != null) {
            return hVar.f674l;
        }
        l.i("viewModel");
        throw null;
    }

    public final String getPCode() {
        return f3271c;
    }

    public final m getTcModel$app_release() {
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        h hVar = g;
        if (hVar != null) {
            return hVar.f669b;
        }
        l.i("viewModel");
        throw null;
    }

    public final boolean getUserSubscribed() {
        return f3272d;
    }

    public final boolean isViewModelAvailable$app_release() {
        h hVar = g;
        return hVar != null && hVar.f673k;
    }

    public final void onAppClosing() {
        h hVar = g;
        if (hVar == null) {
            l.i("viewModel");
            throw null;
        }
        long j6 = f;
        hVar.f668a.d(79, (System.currentTimeMillis() - j6) + hVar.f678p.f7239m);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.cmp.model.PingReturn ping$app_release(boolean r16, com.inmobi.cmp.core.cmpapi.status.CmpStatus r17, com.inmobi.cmp.core.cmpapi.status.DisplayStatus r18) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.ping$app_release(boolean, com.inmobi.cmp.core.cmpapi.status.CmpStatus, com.inmobi.cmp.core.cmpapi.status.DisplayStatus):com.inmobi.cmp.model.PingReturn");
    }

    public final void sendNRVisitEvent$app_release() {
        if (l.g.f7045a) {
            UUID uuid = f9.q.f5066a;
            e eVar = m0.f8289a;
            c0.s(z0.f8336a, d.f10885a, null, new f((String) null, f9.d.NR, false, (c) null), 2);
        }
    }

    public final void setAppPackageId(String str) {
        str.getClass();
        f3270b = str;
    }

    public final void setCallback(ChoiceCmpCallback choiceCmpCallback) {
        f3269a = choiceCmpCallback;
    }

    public final void setCurrentSessionId(UUID uuid) {
        f3273e = uuid;
    }

    public final void setLoginProcessStart() {
        j = true;
    }

    public final void setPCode(String str) {
        str.getClass();
        f3271c = str;
    }

    public final void setUserSubscribed(boolean z9) {
        f3272d = z9;
    }

    @VisibleForTesting
    public final void startCMPActivity$app_release(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtras(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r8, boolean r9) {
        /*
            r7 = this;
            b.h r0 = com.inmobi.cmp.ChoiceCmp.g
            java.lang.String r1 = "viewModel"
            r2 = 0
            if (r0 == 0) goto L98
            boolean r0 = r0.p()
            if (r0 == 0) goto L1d
            b.h r0 = com.inmobi.cmp.ChoiceCmp.g
            if (r0 == 0) goto L19
            boolean r0 = r0.j()
            if (r0 != 0) goto L1d
            r0 = 1
            goto L1e
        L19:
            kotlin.jvm.internal.l.i(r1)
            throw r2
        L1d:
            r0 = 0
        L1e:
            if (r9 != 0) goto L66
            b.h r3 = com.inmobi.cmp.ChoiceCmp.g
            if (r3 == 0) goto L62
            l8.n r3 = r3.f678p
            l8.d r3 = r3.f7237k
            java.lang.Boolean r3 = r3.f7184a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L66
            b.h r3 = com.inmobi.cmp.ChoiceCmp.g
            if (r3 == 0) goto L5e
            boolean r3 = r3.o()
            if (r3 == 0) goto L66
            java.util.UUID r3 = f9.q.f5066a
            b.h r3 = com.inmobi.cmp.ChoiceCmp.g
            if (r3 == 0) goto L5a
            l9.a r1 = r3.f668a
            f9.d r3 = f9.d.GDPR
            java.lang.String r1 = d0.b.d(r3, r1)
            v7.e r4 = o7.m0.f8289a
            v7.d r4 = v7.d.f10885a
            b.f r5 = new b.f
            r5.<init>(r1, r3, r0, r2)
            r1 = 2
            o7.z0 r3 = o7.z0.f8336a
            o7.c0.s(r3, r4, r2, r5, r1)
            goto L66
        L5a:
            kotlin.jvm.internal.l.i(r1)
            throw r2
        L5e:
            kotlin.jvm.internal.l.i(r1)
            throw r2
        L62:
            kotlin.jvm.internal.l.i(r1)
            throw r2
        L66:
            if (r0 != 0) goto L83
            if (r9 == 0) goto L6b
            goto L83
        L6b:
            com.inmobi.cmp.ChoiceCmpCallback r8 = com.inmobi.cmp.ChoiceCmp.f3269a
            if (r8 != 0) goto L70
            return
        L70:
            com.inmobi.cmp.model.DisplayInfo r0 = new com.inmobi.cmp.model.DisplayInfo
            com.inmobi.cmp.core.cmpapi.status.DisplayStatus r1 = com.inmobi.cmp.core.cmpapi.status.DisplayStatus.HIDDEN
            com.inmobi.cmp.model.Regulations r3 = com.inmobi.cmp.model.Regulations.GDPR
            r5 = 8
            r6 = 0
            java.lang.String r2 = "GDPR is applicable but no need to re-trigger the screen"
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.onCMPUIStatusChanged(r0)
            return
        L83:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "EXTRA_ACTION"
            java.lang.String r2 = "ACTION_SHOW_CMP_DIALOG"
            r0.putString(r1, r2)
            java.lang.String r1 = "EXTRA_FORCE"
            r0.putBoolean(r1, r9)
            r7.startCMPActivity$app_release(r8, r0)
            return
        L98:
            kotlin.jvm.internal.l.i(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.a(android.content.Context, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0.p() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.a():void");
    }
}
