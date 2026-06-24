package e1;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.work.WorkRequest;
import c4.n5;
import com.google.android.gms.internal.measurement.f8;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b3 extends h0 {
    public final s1 A;
    public boolean B;
    public o2 C;
    public a3 D;
    public o2 E;
    public final a3.d F;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x2 f3809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.support.v4.media.g f3810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet f3811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f3813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f3814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o2 f3817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o2 f3818u;
    public PriorityQueue v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j2 f3820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicLong f3821y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f3822z;

    public b3(t1 t1Var) {
        super(t1Var);
        this.f3811n = new CopyOnWriteArraySet();
        this.f3814q = new Object();
        this.f3815r = false;
        this.f3816s = 1;
        this.B = true;
        this.F = new a3.d(this, 24);
        this.f3813p = new AtomicReference();
        this.f3820x = j2.f4054c;
        this.f3822z = -1L;
        this.f3821y = new AtomicLong(0L);
        this.A = new s1(t1Var);
    }

    public final void A(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        g2 g2Var;
        h();
        j2 j2Var = j2.f4054c;
        i2[] i2VarArr = h2.STORAGE.f4020a;
        int length = i2VarArr.length;
        int i6 = 0;
        while (true) {
            bool = null;
            if (i6 >= length) {
                string = null;
                break;
            }
            String str = i2VarArr[i6].f4038a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i6++;
        }
        t1 t1Var = this.f3875a;
        if (string != null) {
            w0 w0Var = t1Var.f4264o;
            t1.m(w0Var);
            w0Var.f4344t.c(string, "Ignoring invalid consent setting");
            w0 w0Var2 = t1Var.f4264o;
            t1.m(w0Var2);
            w0Var2.f4344t.b("Valid consent values are 'granted', 'denied'");
        }
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        boolean zM = q1Var.m();
        j2 j2VarB = j2.b(i, bundle);
        Iterator it = j2VarB.f4055a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g2Var = g2.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((g2) it.next()) != g2Var) {
                C(j2VarB, zM);
                break;
            }
        }
        o oVarC = o.c(i, bundle);
        Iterator it2 = oVarC.f4171e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((g2) it2.next()) != g2Var) {
                B(oVarC, zM);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = j2.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM) {
                r(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                q(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void B(o oVar, boolean z9) {
        m1.a aVar = new m1.a(this, oVar, 9, false);
        if (z9) {
            g();
            aVar.run();
        } else {
            q1 q1Var = this.f3875a.f4265p;
            t1.m(q1Var);
            q1Var.p(aVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x010c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void C(e1.j2 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b3.C(e1.j2, boolean):void");
    }

    public final void D() {
        f8.a();
        t1 t1Var = this.f3875a;
        g gVar = t1Var.f4262m;
        q1 q1Var = t1Var.f4265p;
        w0 w0Var = t1Var.f4264o;
        if (gVar.q(null, f0.R0)) {
            t1.m(q1Var);
            if (q1Var.m()) {
                t1.m(w0Var);
                w0Var.f4339o.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (q2.e.g()) {
                t1.m(w0Var);
                w0Var.f4339o.b("Cannot get trigger URIs from main thread");
                return;
            }
            h();
            t1.m(w0Var);
            w0Var.f4346w.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            t1.m(q1Var);
            q1Var.q(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "get trigger URIs", new u2(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                t1.m(w0Var);
                w0Var.f4341q.b("Timed out waiting for get trigger URIs");
            } else {
                t1.m(q1Var);
                q1Var.p(new Runnable() { // from class: e1.y2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b3 b3Var = this.f4416a;
                        b3Var.g();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        g1 g1Var = b3Var.f3875a.f4263n;
                        t1.k(g1Var);
                        SparseArray sparseArrayM = g1Var.m();
                        for (j4 j4Var : list) {
                            int i = j4Var.f4064l;
                            if (!sparseArrayM.contains(i) || ((Long) sparseArrayM.get(i)).longValue() < j4Var.f4063b) {
                                b3Var.E().add(j4Var);
                            }
                        }
                        b3Var.F();
                    }
                });
            }
        }
    }

    public final PriorityQueue E() {
        if (this.v == null) {
            this.v = new PriorityQueue(Comparator$CC.comparing(z2.f4457a, n5.f1901b));
        }
        return this.v;
    }

    public final void F() {
        j4 j4Var;
        g();
        this.f3819w = false;
        if (E().isEmpty() || this.f3815r || (j4Var = (j4) E().poll()) == null) {
            return;
        }
        t1 t1Var = this.f3875a;
        a5 a5Var = t1Var.f4267r;
        t1.k(a5Var);
        if (a5Var.f3776o == null) {
            a5Var.f3776o = MeasurementManagerFutures.from(a5Var.f3875a.f4259a);
        }
        MeasurementManagerFutures measurementManagerFutures = a5Var.f3776o;
        if (measurementManagerFutures != null) {
            this.f3815r = true;
            w0 w0Var = t1Var.f4264o;
            t1.m(w0Var);
            u0 u0Var = w0Var.f4346w;
            String str = j4Var.f4062a;
            u0Var.c(str, "Registering trigger URI");
            m1.b bVarRegisterTriggerAsync = measurementManagerFutures.registerTriggerAsync(Uri.parse(str));
            if (bVarRegisterTriggerAsync != null) {
                bVarRegisterTriggerAsync.addListener(new m1.a(0, bVarRegisterTriggerAsync, new android.support.v4.media.g(this, j4Var, 7, false)), new p2(this, 0));
            } else {
                this.f3815r = false;
                E().add(j4Var);
            }
        }
    }

    @Override // e1.h0
    public final boolean j() {
        return false;
    }

    public final void k(j2 j2Var) {
        g();
        boolean z9 = (j2Var.i(i2.ANALYTICS_STORAGE) && j2Var.i(i2.AD_STORAGE)) || this.f3875a.p().p();
        t1 t1Var = this.f3875a;
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        q1Var.g();
        if (z9 != t1Var.I) {
            q1 q1Var2 = t1Var.f4265p;
            t1.m(q1Var2);
            q1Var2.g();
            t1Var.I = z9;
            g1 g1Var = this.f3875a.f4263n;
            t1.k(g1Var);
            g1Var.g();
            Boolean boolValueOf = g1Var.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(g1Var.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z9 || boolValueOf == null || boolValueOf.booleanValue()) {
                x(Boolean.valueOf(z9), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b3.l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void m() {
        w0 w0Var;
        String str;
        int i;
        int i6;
        int i10;
        int i11;
        g4 g4Var;
        g4 g4Var2;
        b3 b3Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str2;
        com.google.android.gms.internal.measurement.r4 r4Var;
        l1.n nVarA;
        g();
        t1 t1Var = this.f3875a;
        w0 w0Var2 = t1Var.f4264o;
        p0.a aVar = t1Var.f4269t;
        t1.m(w0Var2);
        w0Var2.v.b("Handle tcf update.");
        g1 g1Var = t1Var.f4263n;
        t1.k(g1Var);
        SharedPreferences sharedPreferencesL = g1Var.l();
        HashMap map = new HashMap();
        e0 e0Var = f0.f3914a1;
        int i19 = 2;
        int i20 = 1;
        if (((Boolean) e0Var.a(null)).booleanValue()) {
            l1.i iVar = i4.f4047a;
            com.google.android.gms.internal.measurement.q4 q4Var = com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            w0Var = w0Var2;
            h4 h4Var = h4.f4027a;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(q4Var, h4Var);
            com.google.android.gms.internal.measurement.q4 q4Var2 = com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            h4 h4Var2 = h4.f4028b;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(q4Var2, h4Var2);
            com.google.android.gms.internal.measurement.q4 q4Var3 = com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(q4Var3, h4Var);
            com.google.android.gms.internal.measurement.q4 q4Var4 = com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(q4Var4, h4Var);
            com.google.android.gms.internal.measurement.q4 q4Var5 = com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(q4Var5, h4Var2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, h4Var2), new AbstractMap.SimpleImmutableEntry(com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, h4Var2));
            f8.o oVar = new f8.o(listAsList instanceof Collection ? listAsList.size() : 4);
            oVar.f(listAsList);
            l1.n nVarA2 = oVar.a();
            int i21 = l1.g.f7060l;
            l1.p pVar = new l1.p("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesL.contains("IABTCF_TCString");
            try {
                i12 = sharedPreferencesL.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i12 = -1;
            }
            try {
                i13 = sharedPreferencesL.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i13 = -1;
            }
            try {
                i14 = sharedPreferencesL.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i14 = -1;
            }
            int i22 = i13;
            try {
                i15 = sharedPreferencesL.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i15 = -1;
            }
            try {
                i16 = sharedPreferencesL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i16 = -1;
            }
            String strA = i4.a(sharedPreferencesL, "IABTCF_PublisherCC");
            int i23 = i12;
            f8.o oVar2 = new f8.o(4);
            l1.l lVar = nVarA2.f7058b;
            if (lVar == null) {
                str2 = strA;
                i17 = i15;
                i18 = i16;
                l1.l lVar2 = new l1.l(nVarA2, new l1.m(nVarA2.f7078n, 0, nVarA2.f7079o));
                nVarA2.f7058b = lVar2;
                lVar = lVar2;
            } else {
                i17 = i15;
                i18 = i16;
                str2 = strA;
            }
            l1.q qVarM = lVar.iterator();
            while (true) {
                boolean zHasNext = qVarM.hasNext();
                r4Var = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_UNDEFINED;
                if (!zHasNext) {
                    break;
                }
                com.google.android.gms.internal.measurement.q4 q4Var6 = (com.google.android.gms.internal.measurement.q4) qVarM.next();
                int iA = q4Var6.a();
                l1.q qVar = qVarM;
                l1.n nVar = nVarA2;
                StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iA);
                String strA2 = i4.a(sharedPreferencesL, sb.toString());
                if (!TextUtils.isEmpty(strA2) && strA2.length() >= 755) {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    com.google.android.gms.internal.measurement.r4 r4Var2 = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.r4.values().length || iDigit == 0) {
                        r4Var = r4Var2;
                    } else if (iDigit == i20) {
                        r4Var = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (iDigit == i19) {
                        r4Var = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                oVar2.e(q4Var6, r4Var);
                qVarM = qVar;
                nVarA2 = nVar;
                i19 = 2;
                i20 = 1;
            }
            l1.n nVar2 = nVarA2;
            l1.n nVarA3 = oVar2.a();
            String strA3 = i4.a(sharedPreferencesL, "IABTCF_PurposeConsents");
            String strA4 = i4.a(sharedPreferencesL, "IABTCF_VendorConsents");
            boolean z9 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = i4.a(sharedPreferencesL, "IABTCF_PurposeLegitimateInterests");
            String strA6 = i4.a(sharedPreferencesL, "IABTCF_VendorLegitimateInterests");
            boolean z10 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                com.google.android.gms.internal.measurement.r4 r4Var3 = (com.google.android.gms.internal.measurement.r4) nVarA3.get(q4Var);
                com.google.android.gms.internal.measurement.r4 r4Var4 = (com.google.android.gms.internal.measurement.r4) nVarA3.get(q4Var3);
                com.google.android.gms.internal.measurement.r4 r4Var5 = (com.google.android.gms.internal.measurement.r4) nVarA3.get(q4Var4);
                com.google.android.gms.internal.measurement.r4 r4Var6 = (com.google.android.gms.internal.measurement.r4) nVarA3.get(q4Var5);
                f8.o oVar3 = new f8.o(4);
                oVar3.e("Version", ExifInterface.GPS_MEASUREMENT_2D);
                boolean z11 = z9;
                oVar3.e("VendorConsent", true != z9 ? "0" : "1");
                boolean z12 = z10;
                oVar3.e("VendorLegitimateInterest", true != z10 ? "0" : "1");
                oVar3.e("gdprApplies", i14 != 1 ? "0" : "1");
                int i24 = i18;
                oVar3.e("EnableAdvertiserConsentMode", i24 != 1 ? "0" : "1");
                oVar3.e("PolicyVersion", String.valueOf(i22));
                oVar3.e("CmpSdkID", String.valueOf(i23));
                int i25 = i17;
                oVar3.e("PurposeOneTreatment", i25 != 1 ? "0" : "1");
                String str3 = str2;
                oVar3.e("PublisherCC", str3);
                oVar3.e("PublisherRestrictions1", String.valueOf(r4Var3 != null ? r4Var3.a() : r4Var.a()));
                oVar3.e("PublisherRestrictions3", String.valueOf(r4Var4 != null ? r4Var4.a() : r4Var.a()));
                oVar3.e("PublisherRestrictions4", String.valueOf(r4Var5 != null ? r4Var5.a() : r4Var.a()));
                oVar3.e("PublisherRestrictions7", String.valueOf(r4Var6 != null ? r4Var6.a() : r4Var.a()));
                oVar3.f(l1.n.a(4, new Object[]{"Purpose1", i4.d(q4Var, strA3, strA5), "Purpose3", i4.d(q4Var3, strA3, strA5), "Purpose4", i4.d(q4Var4, strA3, strA5), "Purpose7", i4.d(q4Var5, strA3, strA5)}, null).entrySet());
                int i26 = i14;
                oVar3.f(l1.n.a(5, new Object[]{"AuthorizePurpose1", true != i4.b(q4Var, nVar2, nVarA3, pVar, cArr, i24, i26, i25, str3, strA3, strA5, z11, z12) ? "0" : "1", "AuthorizePurpose3", true != i4.b(q4Var3, nVar2, nVarA3, pVar, cArr, i24, i26, i25, str3, strA3, strA5, z11, z12) ? "0" : "1", "AuthorizePurpose4", true != i4.b(q4Var4, nVar2, nVarA3, pVar, cArr, i24, i26, i25, str3, strA3, strA5, z11, z12) ? "0" : "1", "AuthorizePurpose7", true != i4.b(q4Var5, nVar2, nVarA3, pVar, cArr, i24, i26, i25, str3, strA3, strA5, z11, z12) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                nVarA = oVar3.a();
            } else {
                nVarA = l1.n.f7076p;
            }
            g4Var = new g4(nVarA);
            str = "";
        } else {
            w0Var = w0Var2;
            String strA7 = i4.a(sharedPreferencesL, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i = sharedPreferencesL.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i6 = sharedPreferencesL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i6 = -1;
            }
            if (i6 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i6));
            }
            try {
                i10 = sharedPreferencesL.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i10 = -1;
            }
            if (i10 != -1) {
                map.put("PolicyVersion", String.valueOf(i10));
            }
            String strA8 = i4.a(sharedPreferencesL, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i11 = sharedPreferencesL.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i11 = -1;
            }
            if (i11 != -1) {
                map.put("CmpSdkID", String.valueOf(i11));
            }
            g4Var = new g4(map);
        }
        t1.m(w0Var);
        w0 w0Var3 = w0Var;
        u0 u0Var = w0Var3.f4346w;
        u0Var.c(g4Var, "Tcf preferences read");
        if (!t1Var.f4262m.q(null, e0Var)) {
            if (g1Var.o(g4Var)) {
                Bundle bundleB = g4Var.b();
                t1.m(w0Var3);
                u0Var.c(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    aVar.getClass();
                    A(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", g4Var.c());
                n("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        g1Var.g();
        String string = g1Var.k().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            g4Var2 = new g4(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split("=");
                if (strArrSplit.length >= 2 && i4.f4047a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            g4Var2 = new g4(map2);
        }
        if (g1Var.o(g4Var)) {
            Bundle bundleB2 = g4Var.b();
            t1.m(w0Var3);
            u0Var.c(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                aVar.getClass();
                b3Var = this;
                b3Var.A(bundleB2, -30, System.currentTimeMillis());
            } else {
                b3Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = g4Var2.f4002a;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = g4Var.b();
            Bundle bundleB4 = g4Var2.b();
            bundle2.putString("_tcfm", str5.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) g4Var.f4002a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", g4Var.c());
            b3Var.n("auto", "_tcf", bundle2);
        }
    }

    public final void n(String str, String str2, Bundle bundle) {
        g();
        this.f3875a.f4269t.getClass();
        o(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void o(long j, Bundle bundle, String str, String str2) {
        g();
        boolean z9 = true;
        if (this.f3810m != null && !a5.F(str2)) {
            z9 = false;
        }
        p(str, str2, j, bundle, true, z9, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
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
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r32, java.lang.String r33, long r34, android.os.Bundle r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b3.p(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b3.q(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b3.r(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void s() {
        g();
        h();
        t1 t1Var = this.f3875a;
        if (t1Var.h()) {
            g gVar = t1Var.f4262m;
            gVar.f3875a.getClass();
            Boolean boolS = gVar.s("google_analytics_deferred_deep_link_enabled");
            if (boolS != null && boolS.booleanValue()) {
                w0 w0Var = t1Var.f4264o;
                t1.m(w0Var);
                w0Var.v.b("Deferred Deep Link feature enabled.");
                q1 q1Var = t1Var.f4265p;
                t1.m(q1Var);
                q1Var.p(new n2(this, 2));
            }
            w3 w3VarP = t1Var.p();
            w3VarP.g();
            w3VarP.h();
            c5 c5VarW = w3VarP.w(true);
            w3VarP.s();
            t1 t1Var2 = w3VarP.f3875a;
            t1Var2.f4262m.q(null, f0.f3919c1);
            t1Var2.o().n(3, new byte[0]);
            w3VarP.u(new r3(w3VarP, c5VarW, 1));
            this.B = false;
            g1 g1Var = t1Var.f4263n;
            t1.k(g1Var);
            g1Var.g();
            String string = g1Var.k().getString("previous_os_version", null);
            g1Var.f3875a.q().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = g1Var.k().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            t1Var.q().i();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            n("auto", "_ou", bundle);
        }
    }

    public final void t(Bundle bundle, long j) {
        k0.y.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        t1 t1Var = this.f3875a;
        if (!zIsEmpty) {
            w0 w0Var = t1Var.f4264o;
            t1.m(w0Var);
            w0Var.f4342r.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        k2.e(bundle2, "app_id", String.class, null);
        k2.e(bundle2, "origin", String.class, null);
        k2.e(bundle2, "name", String.class, null);
        k2.e(bundle2, "value", Object.class, null);
        k2.e(bundle2, "trigger_event_name", String.class, null);
        k2.e(bundle2, "trigger_timeout", Long.class, 0L);
        k2.e(bundle2, "timed_out_event_name", String.class, null);
        k2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        k2.e(bundle2, "triggered_event_name", String.class, null);
        k2.e(bundle2, "triggered_event_params", Bundle.class, null);
        k2.e(bundle2, "time_to_live", Long.class, 0L);
        k2.e(bundle2, "expired_event_name", String.class, null);
        k2.e(bundle2, "expired_event_params", Bundle.class, null);
        k0.y.d(bundle2.getString("name"));
        k0.y.d(bundle2.getString("origin"));
        k0.y.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        a5 a5Var = t1Var.f4267r;
        q0 q0Var = t1Var.f4268s;
        w0 w0Var2 = t1Var.f4264o;
        t1.k(a5Var);
        if (a5Var.m0(string) != 0) {
            t1.m(w0Var2);
            w0Var2.f4339o.c(q0Var.c(string), "Invalid conditional user property name");
            return;
        }
        t1.k(a5Var);
        if (a5Var.t(obj, string) != 0) {
            t1.m(w0Var2);
            w0Var2.f4339o.d(q0Var.c(string), "Invalid conditional user property value", obj);
            return;
        }
        Object objU = a5Var.u(obj, string);
        if (objU == null) {
            t1.m(w0Var2);
            w0Var2.f4339o.d(q0Var.c(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        k2.c(bundle2, objU);
        long j6 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j6 > 15552000000L || j6 < 1)) {
            t1.m(w0Var2);
            w0Var2.f4339o.d(q0Var.c(string), "Invalid conditional user property timeout", Long.valueOf(j6));
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            t1.m(w0Var2);
            w0Var2.f4339o.d(q0Var.c(string), "Invalid conditional user property time to live", Long.valueOf(j10));
        } else {
            q1 q1Var = t1Var.f4265p;
            t1.m(q1Var);
            q1Var.p(new v2(this, bundle2, 0));
        }
    }

    public final void u(String str, String str2, Bundle bundle) {
        t1 t1Var = this.f3875a;
        t1Var.f4269t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        k0.y.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        q1Var.p(new v2(this, bundle2, 1));
    }

    public final String v() {
        t1 t1Var = this.f3875a;
        try {
            return k2.b(t1Var.f4259a, t1Var.f4273y);
        } catch (IllegalStateException e10) {
            w0 w0Var = t1Var.f4264o;
            t1.m(w0Var);
            w0Var.f4339o.c(e10, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void w(j2 j2Var, long j, boolean z9) {
        int i = j2Var.f4056b;
        g();
        h();
        t1 t1Var = this.f3875a;
        g1 g1Var = t1Var.f4263n;
        w0 w0Var = t1Var.f4264o;
        t1.k(g1Var);
        j2 j2VarN = g1Var.n();
        if (j <= this.f3822z && j2.l(j2VarN.f4056b, i)) {
            t1.m(w0Var);
            w0Var.f4345u.c(j2Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        g1 g1Var2 = t1Var.f4263n;
        t1.k(g1Var2);
        g1Var2.g();
        if (!j2.l(i, g1Var2.k().getInt("consent_source", 100))) {
            t1.m(w0Var);
            w0Var.f4345u.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = g1Var2.k().edit();
        editorEdit.putString("consent_settings", j2Var.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        t1.m(w0Var);
        w0Var.f4346w.c(j2Var, "Setting storage consent(FE)");
        this.f3822z = j;
        if (t1Var.p().q()) {
            w3 w3VarP = t1Var.p();
            w3VarP.g();
            w3VarP.h();
            w3VarP.u(new u3(w3VarP, 2));
        } else {
            w3 w3VarP2 = t1Var.p();
            w3VarP2.g();
            w3VarP2.h();
            if (w3VarP2.p()) {
                w3VarP2.u(new r3(w3VarP2, w3VarP2.w(false)));
            }
        }
        if (z9) {
            t1Var.p().k(new AtomicReference());
        }
    }

    public final void x(Boolean bool, boolean z9) {
        g();
        h();
        t1 t1Var = this.f3875a;
        w0 w0Var = t1Var.f4264o;
        t1.m(w0Var);
        w0Var.v.c(bool, "Setting app measurement enabled (FE)");
        g1 g1Var = t1Var.f4263n;
        t1.k(g1Var);
        g1Var.g();
        SharedPreferences.Editor editorEdit = g1Var.k().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z9) {
            g1Var.g();
            SharedPreferences.Editor editorEdit2 = g1Var.k().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        q1Var.g();
        if (t1Var.I || !(bool == null || bool.booleanValue())) {
            y();
        }
    }

    public final void y() {
        g();
        t1 t1Var = this.f3875a;
        g1 g1Var = t1Var.f4263n;
        w0 w0Var = t1Var.f4264o;
        p0.a aVar = t1Var.f4269t;
        t1.k(g1Var);
        String strN = g1Var.v.n();
        if (strN != null) {
            if ("unset".equals(strN)) {
                aVar.getClass();
                r(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strN) ? 0L : 1L);
                aVar.getClass();
                r(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!t1Var.d() || !this.B) {
            t1.m(w0Var);
            w0Var.v.b("Updating Scion state (FE)");
            w3 w3VarP = t1Var.p();
            w3VarP.g();
            w3VarP.h();
            w3VarP.u(new r3(w3VarP, w3VarP.w(true), 3));
            return;
        }
        t1.m(w0Var);
        w0Var.v.b("Recording app launch after enabling measurement for the first time (FE)");
        s();
        f4 f4Var = t1Var.f4266q;
        t1.l(f4Var);
        f4Var.f3974n.G();
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        q1Var.p(new n2(this, 1));
    }

    public final void z() {
        t1 t1Var = this.f3875a;
        if (!(t1Var.f4259a.getApplicationContext() instanceof Application) || this.f3809l == null) {
            return;
        }
        ((Application) t1Var.f4259a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f3809l);
    }
}
