package b;

import android.content.SharedPreferences;
import android.util.Log;
import b2.t1;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.Regulations;
import j$.util.DesugarTimeZone;
import j9.x;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import l7.u;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.a f668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.m f669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.s f670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.e f671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f672e;
    public final j9.f f;
    public final j9.n g;
    public final j9.l h;
    public final j9.h i;
    public final j9.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u5.d f674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n6.a f675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u5.f f677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l8.n f678p;

    public h(l9.a aVar, u5.m mVar, j9.s sVar, j9.e eVar, x xVar, j9.f fVar, j9.n nVar, j9.l lVar, j9.h hVar, j9.j jVar) {
        aVar.getClass();
        sVar.getClass();
        eVar.getClass();
        xVar.getClass();
        fVar.getClass();
        nVar.getClass();
        lVar.getClass();
        hVar.getClass();
        jVar.getClass();
        this.f668a = aVar;
        this.f669b = mVar;
        this.f670c = sVar;
        this.f671d = eVar;
        this.f672e = xVar;
        this.f = fVar;
        this.g = nVar;
        this.h = lVar;
        this.i = hVar;
        this.j = jVar;
        this.f674l = new u5.d();
        this.f676n = -1;
        this.f677o = new u5.f();
        this.f678p = new l8.n(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 4194303);
        this.f676n = h();
    }

    public static Vector a(Object obj) {
        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
        Vector vector = new Vector(null, 1, null);
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList.get(i6);
                i6++;
                int i10 = i + 1;
                if (i < 0) {
                    q6.m.h0();
                    throw null;
                }
                if (kotlin.jvm.internal.l.a(obj2 instanceof Boolean ? (Boolean) obj2 : null, Boolean.TRUE)) {
                    vector.set(i10);
                }
                i = i10;
            }
        }
        return vector;
    }

    public static Vector e(Object obj) {
        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
        Vector vector = new Vector(null, 1, null);
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                if (num != null) {
                    vector.set(num.intValue());
                }
            }
        }
        return vector;
    }

    public final void b() {
        l9.a aVar = this.f668a;
        aVar.b(43);
        aVar.b(44);
        aVar.b(45);
        aVar.b(46);
        aVar.b(47);
        aVar.b(48);
        aVar.b(49);
        aVar.b(51);
        aVar.b(52);
        aVar.b(53);
        aVar.b(54);
        aVar.b(55);
        aVar.b(56);
        aVar.b(57);
        aVar.b(58);
        aVar.b(59);
        aVar.b(60);
    }

    public final void c(boolean z9) {
        l9.a aVar = this.f668a;
        if (z9) {
            aVar.f(76, "Reject");
        } else {
            aVar.f(76, "");
            aVar.b(75);
        }
        if (l.g.f7044a) {
            if (z9) {
                aVar.f(93, "Reject");
            } else {
                aVar.f(93, "");
                aVar.b(92);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final boolean d(Set set) {
        ?? r02 = this.f678p.f7239n.g;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (r02.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        l9.a aVar = this.f668a;
        aVar.b(1);
        aVar.b(2);
        aVar.b(3);
        aVar.b(4);
        aVar.b(5);
        aVar.b(6);
        aVar.b(7);
        aVar.b(8);
        aVar.b(50);
        aVar.b(9);
        aVar.b(10);
        aVar.b(11);
        aVar.b(12);
        aVar.b(13);
        aVar.b(14);
        aVar.b(15);
        aVar.b(16);
        aVar.b(17);
        aVar.b(18);
    }

    public final String g() {
        l8.i iVar = this.f678p.f7239n;
        return t1.m(iVar.f7212t.f7230c + iVar.f7202e + iVar.f7207o + iVar.f7208p + iVar.f7206n + iVar.f7204l + iVar.f7205m);
    }

    public final int h() {
        l9.a aVar = this.f668a;
        aVar.getClass();
        int i = aVar.f7262a.getInt("IABTCF_PolicyVersion", 0);
        if (i != 0) {
            return i;
        }
        aVar.getClass();
        return aVar.f7262a.getInt("IABGPP_TCFEU2_PolicyVersion", 0);
    }

    public final int i() {
        h8.c cVar = this.f669b.f10737a;
        Integer num = cVar == null ? null : cVar.f5460b;
        if (num != null) {
            return num.intValue();
        }
        l9.a aVar = this.f668a;
        aVar.getClass();
        return aVar.f7262a.getInt("gvl_version", 0);
    }

    public final boolean j() {
        n6.a aVar = this.f675m;
        return u.m0(aVar == null ? null : aVar.f8105a, "USA", true);
    }

    public final boolean k() {
        l9.a aVar = this.f668a;
        aVar.getClass();
        SharedPreferences sharedPreferences = aVar.f7262a;
        return (System.currentTimeMillis() - sharedPreferences.getLong("gvl_last_updated", 0L)) / 86400000 < ((long) this.f678p.f7239n.f) || i() <= sharedPreferences.getInt("gvl_version", 0);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public final void l() {
        List list;
        String strSubstring;
        String[] strArr;
        int i;
        int i6;
        String str;
        int i10;
        int i11;
        int i12;
        int iIntValue;
        int i13;
        int iIntValue2;
        int i14;
        int iIntValue3;
        String str2;
        int iIntValue4;
        int i15;
        int iIntValue5;
        int i16;
        int iIntValue6;
        int i17;
        int iIntValue7;
        String str3;
        int iIntValue8;
        int i18;
        int iIntValue9;
        int i19;
        int iIntValue10;
        Integer num;
        boolean zG = m9.c.c().g();
        l9.a aVar = this.f668a;
        int i20 = 1;
        u5.m mVar = this.f669b;
        boolean z9 = false;
        if (zG) {
            s3.a aVarE = m9.c.c().e((String) s3.b.f9158b.get(2));
            Vector vector = mVar.f10749r;
            List list2 = r3.f.f8864a;
            Object objD = aVarE.d("PurposeConsents");
            objD.getClass();
            vector.set(a(objD));
            Vector vector2 = mVar.f10750s;
            vector2.unsetAllOwnedItems();
            Object objD2 = aVarE.d("PurposeLegitimateInterests");
            objD2.getClass();
            vector2.set(a(objD2));
            Vector vector3 = mVar.f10748q;
            Object objD3 = aVarE.d("SpecialFeatureOptins");
            objD3.getClass();
            vector3.set(a(objD3));
            Vector vector4 = mVar.f10756z;
            vector4.unsetAllOwnedItems();
            Object objD4 = aVarE.d("VendorConsents");
            objD4.getClass();
            vector4.setOwnedItems(e(objD4));
            Vector vector5 = mVar.C;
            vector5.unsetAllOwnedItems();
            Object objD5 = aVarE.d("VendorLegitimateInterests");
            objD5.getClass();
            vector5.setOwnedItems(e(objD5));
            Vector vector6 = mVar.v;
            vector6.unsetAllOwnedItems();
            Object objD6 = aVarE.d("PublisherConsents");
            objD6.getClass();
            vector6.setOwnedItems(a(objD6));
            Vector vector7 = mVar.f10753w;
            vector7.unsetAllOwnedItems();
            Object objD7 = aVarE.d("PublisherLegitimateInterests");
            objD7.getClass();
            vector7.setOwnedItems(a(objD7));
        } else {
            String strJ = aVar.j(8);
            if (strJ.length() <= 0) {
                strJ = null;
            }
            if (strJ != null) {
                List listG0 = l7.m.G0(strJ, new String[]{"."});
                int size = listG0.size();
                u5.m mVar2 = new u5.m();
                int i21 = 0;
                while (i21 < size) {
                    int i22 = i21 + 1;
                    String str4 = (String) listG0.get(i21);
                    Object obj = w5.a.f10912a;
                    String strD = i5.d(String.valueOf(str4.charAt(z9 ? 1 : 0)));
                    Object obj2 = w5.c.f10915a;
                    ?? r13 = w5.c.f10916b;
                    w5.d dVar = w5.d.f10926r;
                    Integer num2 = (Integer) r13.get(dVar);
                    String strSubstring2 = strD.substring(z9 ? 1 : 0, num2 == null ? z9 ? 1 : 0 : num2.intValue());
                    Set set = u5.k.f10733a;
                    Integer num3 = (Integer) r13.get(dVar);
                    u5.j jVar = (u5.j) q6.l.p0(set, t1.b(num3 == null ? z9 ? 1 : 0 : num3.intValue(), strSubstring2));
                    jVar.getClass();
                    String str5 = jVar.f10732a;
                    String strD2 = i5.d(str4);
                    u5.j jVar2 = u5.j.CORE;
                    if (jVar == jVar2) {
                        ?? r15 = w5.c.f10915a;
                        u5.a aVar2 = u5.a.I;
                        Integer num4 = (Integer) r15.get(aVar2);
                        String strSubstring3 = strD2.substring(z9 ? 1 : 0, num4 == null ? z9 ? 1 : 0 : num4.intValue());
                        Integer num5 = (Integer) r15.get(aVar2);
                        mVar2.i = t1.b(num5 == null ? z9 ? 1 : 0 : num5.intValue(), strSubstring3);
                    }
                    int iIntValue11 = (jVar == jVar2 || (num = (Integer) w5.c.f10917c.get("segmentType")) == null) ? z9 ? 1 : 0 : num.intValue();
                    String[] strArr2 = mVar2.i == i20 ? (String[]) a6.a.f206a.get(str5) : (String[]) a6.a.f207b.get(str5);
                    if (strArr2 != null) {
                        int length = strArr2.length;
                        int i23 = z9 ? 1 : 0;
                        ?? r62 = z9;
                        while (i23 < length) {
                            String str6 = strArr2[i23];
                            int i24 = i23 + 1;
                            Object obj3 = y5.a.f11806a;
                            str6.getClass();
                            Integer numValueOf = (Integer) w5.c.f10917c.get(str6);
                            if (numValueOf == null) {
                                list = listG0;
                                if (l7.m.y0(str6, "publisherCustom", r62, r62, 6) == 0) {
                                    numValueOf = Integer.valueOf(mVar2.f10747p);
                                }
                            } else {
                                list = listG0;
                            }
                            if ((numValueOf != null && numValueOf.intValue() == 0) || numValueOf == null) {
                                str = strD2;
                                i10 = i22;
                                i11 = length;
                                i12 = i24;
                                listG0 = list;
                                strArr2 = strArr2;
                                size = size;
                                iIntValue11 = iIntValue11 == true ? 1 : 0;
                            } else {
                                try {
                                    strSubstring = strD2.substring(iIntValue11, numValueOf.intValue() + iIntValue11);
                                } catch (IndexOutOfBoundsException unused) {
                                    strSubstring = l7.m.C0(numValueOf.intValue() + iIntValue11, strD2).substring(iIntValue11, numValueOf.intValue() + iIntValue11);
                                }
                                if (str6.equals("version")) {
                                    mVar2.i = t1.b(numValueOf.intValue(), strSubstring);
                                    i = iIntValue11;
                                    strArr = strArr2;
                                } else {
                                    if (str6.equals("created")) {
                                        strArr = strArr2;
                                        mVar2.f10738b = t0.f.a(numValueOf.intValue(), strSubstring);
                                    } else {
                                        strArr = strArr2;
                                        if (str6.equals("lastUpdated")) {
                                            mVar2.f10739c = t0.f.a(numValueOf.intValue(), strSubstring);
                                        } else if (str6.equals("cmpId")) {
                                            int iB = t1.b(numValueOf.intValue(), strSubstring);
                                            if (iB > -1) {
                                                mVar2.f10744m = iB;
                                            } else {
                                                u5.n nVar = new u5.n("cmpId", String.valueOf(iB));
                                                ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                                                if (callback != null) {
                                                    callback.onCmpError(ChoiceError.TC_MODEL_PROPERTY_ERROR);
                                                }
                                                String message = nVar.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                Object obj4 = Boolean.TRUE;
                                                if (obj4.equals(obj4)) {
                                                    Log.e("f.u", message, nVar);
                                                }
                                            }
                                        } else if (str6.equals("cmpVersion")) {
                                            int iB2 = t1.b(numValueOf.intValue(), strSubstring);
                                            if (iB2 > -1) {
                                                mVar2.f10745n = iB2;
                                            } else {
                                                u5.n nVar2 = new u5.n("cmpVersion", String.valueOf(iB2));
                                                ChoiceCmpCallback callback2 = ChoiceCmp.INSTANCE.getCallback();
                                                if (callback2 != null) {
                                                    callback2.onCmpError(ChoiceError.TC_MODEL_PROPERTY_ERROR);
                                                }
                                                String message2 = nVar2.getMessage();
                                                if (message2 == null) {
                                                    message2 = "";
                                                }
                                                Object obj5 = Boolean.TRUE;
                                                if (obj5.equals(obj5)) {
                                                    Log.e("f.u", message2, nVar2);
                                                }
                                            }
                                        } else if (str6.equals("consentScreen")) {
                                            int iB3 = t1.b(numValueOf.intValue(), strSubstring);
                                            if (iB3 > -1) {
                                                mVar2.j = iB3;
                                            } else {
                                                u5.n nVar3 = new u5.n("consentScreen", String.valueOf(iB3));
                                                ChoiceCmpCallback callback3 = ChoiceCmp.INSTANCE.getCallback();
                                                if (callback3 != null) {
                                                    callback3.onCmpError(ChoiceError.TC_MODEL_PROPERTY_ERROR);
                                                }
                                                String message3 = nVar3.getMessage();
                                                if (message3 == null) {
                                                    message3 = "";
                                                }
                                                Object obj6 = Boolean.TRUE;
                                                if (obj6.equals(obj6)) {
                                                    Log.e("f.u", message3, nVar3);
                                                }
                                            }
                                        } else if (str6.equals("consentLanguage")) {
                                            mVar2.f10743l = z3.a(numValueOf.intValue(), strSubstring);
                                        } else if (str6.equals("vendorListVersion")) {
                                            int iB4 = t1.b(numValueOf.intValue(), strSubstring);
                                            mVar2.f10746o = iB4;
                                            if (iB4 < 0) {
                                                u5.n nVar4 = new u5.n("vendorListVersion", String.valueOf(iB4));
                                                ChoiceCmpCallback callback4 = ChoiceCmp.INSTANCE.getCallback();
                                                if (callback4 != null) {
                                                    callback4.onCmpError(ChoiceError.TC_MODEL_PROPERTY_ERROR);
                                                }
                                                String message4 = nVar4.getMessage();
                                                if (message4 == null) {
                                                    message4 = "";
                                                }
                                                Object obj7 = Boolean.TRUE;
                                                if (obj7.equals(obj7)) {
                                                    Log.e("f.u", message4, nVar4);
                                                }
                                            }
                                        } else if (str6.equals("policyVersion")) {
                                            int iB5 = t1.b(numValueOf.intValue(), strSubstring);
                                            mVar2.f10742k = iB5;
                                            if (iB5 < 0) {
                                                u5.n nVar5 = new u5.n("policyVersion", String.valueOf(iB5));
                                                ChoiceCmpCallback callback5 = ChoiceCmp.INSTANCE.getCallback();
                                                if (callback5 != null) {
                                                    callback5.onCmpError(ChoiceError.TC_MODEL_PROPERTY_ERROR);
                                                }
                                                String message5 = nVar5.getMessage();
                                                if (message5 == null) {
                                                    message5 = "";
                                                }
                                                Object obj8 = Boolean.TRUE;
                                                if (obj8.equals(obj8)) {
                                                    Log.e("f.u", message5, nVar5);
                                                }
                                            }
                                        } else {
                                            String str7 = "1";
                                            if (str6.equals("isServiceSpecific")) {
                                                mVar2.f10741e = strSubstring.equals("1");
                                            } else if (str6.equals("useNonStandardStacks")) {
                                                mVar2.f = strSubstring.equals("1");
                                            } else if (str6.equals("specialFeatureOptions")) {
                                                mVar2.f10748q = a.a.b(numValueOf.intValue(), strSubstring);
                                            } else if (str6.equals("purposeConsents")) {
                                                mVar2.f10749r = a.a.b(numValueOf.intValue(), strSubstring);
                                            } else if (str6.equals("purposeLegitimateInterests")) {
                                                mVar2.f10750s = a.a.b(numValueOf.intValue(), strSubstring);
                                            } else if (str6.equals("purposeOneTreatment")) {
                                                mVar2.g = strSubstring.equals("1");
                                            } else if (str6.equals("publisherCountryCode")) {
                                                mVar2.a(z3.a(numValueOf.intValue(), strSubstring));
                                            } else if (str6.equals("vendorConsents")) {
                                                Vector vectorC = i5.c(strD2.substring(iIntValue11));
                                                mVar2.f10756z = vectorC;
                                                numValueOf = Integer.valueOf(vectorC.getBitLength());
                                            } else if (str6.equals("vendorLegitimateInterests")) {
                                                Vector vectorC2 = i5.c(strD2.substring(iIntValue11));
                                                mVar2.C = vectorC2;
                                                numValueOf = Integer.valueOf(vectorC2.getBitLength());
                                            } else {
                                                if (str6.equals("publisherRestrictions")) {
                                                    u5.h hVar = new u5.h(new h8.c());
                                                    Object obj9 = w5.c.f10915a;
                                                    ?? r42 = w5.c.f10916b;
                                                    w5.d dVar2 = w5.d.f10923o;
                                                    Integer num6 = (Integer) r42.get(dVar2);
                                                    if (num6 == null) {
                                                        i = iIntValue11;
                                                        iIntValue = 0;
                                                    } else {
                                                        i = iIntValue11;
                                                        iIntValue = num6.intValue();
                                                    }
                                                    i6 = size;
                                                    String strSubstring4 = strSubstring.substring(0, iIntValue);
                                                    Integer num7 = (Integer) r42.get(dVar2);
                                                    int iB6 = t1.b(num7 == null ? 0 : num7.intValue(), strSubstring4);
                                                    Integer num8 = (Integer) r42.get(dVar2);
                                                    int iIntValue12 = num8 == null ? 0 : num8.intValue();
                                                    int i25 = 0;
                                                    while (i25 < iB6) {
                                                        int i26 = i25 + 1;
                                                        Object obj10 = w5.c.f10915a;
                                                        ?? r14 = w5.c.f10916b;
                                                        int i27 = iB6;
                                                        w5.d dVar3 = w5.d.f10924p;
                                                        Integer num9 = (Integer) r14.get(dVar3);
                                                        if (num9 == null) {
                                                            i13 = i26;
                                                            iIntValue2 = 0;
                                                        } else {
                                                            i13 = i26;
                                                            iIntValue2 = num9.intValue();
                                                        }
                                                        String strSubstring5 = strSubstring.substring(iIntValue12, iIntValue2);
                                                        Integer num10 = (Integer) r14.get(dVar3);
                                                        if (num10 == null) {
                                                            i14 = iIntValue12;
                                                            iIntValue3 = 0;
                                                        } else {
                                                            i14 = iIntValue12;
                                                            iIntValue3 = num10.intValue();
                                                        }
                                                        int iB7 = t1.b(iIntValue3, strSubstring5);
                                                        Integer num11 = (Integer) r14.get(dVar3);
                                                        int iIntValue13 = i14 + (num11 == null ? 0 : num11.intValue());
                                                        w5.d dVar4 = w5.d.f10925q;
                                                        Integer num12 = (Integer) r14.get(dVar4);
                                                        if (num12 == null) {
                                                            str2 = strD2;
                                                            iIntValue4 = 0;
                                                        } else {
                                                            str2 = strD2;
                                                            iIntValue4 = num12.intValue();
                                                        }
                                                        String strSubstring6 = strSubstring.substring(iIntValue13, iIntValue4);
                                                        Integer num13 = (Integer) r14.get(dVar4);
                                                        if (num13 == null) {
                                                            i15 = iIntValue13;
                                                            iIntValue5 = 0;
                                                        } else {
                                                            i15 = iIntValue13;
                                                            iIntValue5 = num13.intValue();
                                                        }
                                                        int iB8 = t1.b(iIntValue5, strSubstring6);
                                                        Integer num14 = (Integer) r14.get(dVar4);
                                                        int iIntValue14 = i15 + (num14 == null ? 0 : num14.intValue());
                                                        u5.g gVar = new u5.g(iB7, u5.i.valueOf(String.valueOf(iB8)));
                                                        w5.d dVar5 = w5.d.f10922n;
                                                        Integer num15 = (Integer) r14.get(dVar5);
                                                        String strSubstring7 = strSubstring.substring(iIntValue14, num15 == null ? 0 : num15.intValue());
                                                        Integer num16 = (Integer) r14.get(dVar5);
                                                        if (num16 == null) {
                                                            i16 = iIntValue14;
                                                            iIntValue6 = 0;
                                                        } else {
                                                            i16 = iIntValue14;
                                                            iIntValue6 = num16.intValue();
                                                        }
                                                        int iB9 = t1.b(iIntValue6, strSubstring7);
                                                        Integer num17 = (Integer) r14.get(dVar5);
                                                        int iIntValue15 = i16 + (num17 == null ? 0 : num17.intValue());
                                                        if (iB9 >= 0) {
                                                            int i28 = 0;
                                                            while (true) {
                                                                int i29 = i28 + 1;
                                                                Object obj11 = w5.c.f10915a;
                                                                int i30 = i22;
                                                                ?? r11 = w5.c.f10916b;
                                                                int i31 = length;
                                                                w5.d dVar6 = w5.d.f10918a;
                                                                Integer num18 = (Integer) r11.get(dVar6);
                                                                if (num18 == null) {
                                                                    i17 = i24;
                                                                    iIntValue7 = 0;
                                                                } else {
                                                                    i17 = i24;
                                                                    iIntValue7 = num18.intValue();
                                                                }
                                                                boolean zEquals = strSubstring.substring(iIntValue15, iIntValue7).equals(str7);
                                                                Integer num19 = (Integer) r11.get(dVar6);
                                                                int iIntValue16 = iIntValue15 + (num19 == null ? 0 : num19.intValue());
                                                                w5.d dVar7 = w5.d.f10928t;
                                                                Integer num20 = (Integer) r11.get(dVar7);
                                                                if (num20 == null) {
                                                                    str3 = str7;
                                                                    iIntValue8 = 0;
                                                                } else {
                                                                    str3 = str7;
                                                                    iIntValue8 = num20.intValue();
                                                                }
                                                                String strSubstring8 = strSubstring.substring(iIntValue16, iIntValue8);
                                                                Integer num21 = (Integer) r11.get(dVar7);
                                                                if (num21 == null) {
                                                                    i18 = iIntValue16;
                                                                    iIntValue9 = 0;
                                                                } else {
                                                                    i18 = iIntValue16;
                                                                    iIntValue9 = num21.intValue();
                                                                }
                                                                int iB10 = t1.b(iIntValue9, strSubstring8);
                                                                Integer num22 = (Integer) r11.get(dVar7);
                                                                int iIntValue17 = i18 + (num22 == null ? 0 : num22.intValue());
                                                                if (zEquals) {
                                                                    Integer num23 = (Integer) r11.get(dVar7);
                                                                    String strSubstring9 = strSubstring.substring(iIntValue17, num23 == null ? 0 : num23.intValue());
                                                                    Integer num24 = (Integer) r11.get(dVar7);
                                                                    if (num24 == null) {
                                                                        i19 = iIntValue17;
                                                                        iIntValue10 = 0;
                                                                    } else {
                                                                        i19 = iIntValue17;
                                                                        iIntValue10 = num24.intValue();
                                                                    }
                                                                    int iB11 = t1.b(iIntValue10, strSubstring9);
                                                                    Integer num25 = (Integer) r11.get(dVar7);
                                                                    int iIntValue18 = i19 + (num25 == null ? 0 : num25.intValue());
                                                                    if (iB11 < iB10) {
                                                                        throw new w5.e("h.k: Invalid RangeEntry: endVendorId " + iB11 + " is less than " + iB10);
                                                                    }
                                                                    if (iB10 <= iB11) {
                                                                        while (true) {
                                                                            int i32 = iB10 + 1;
                                                                            hVar.a(iB10, gVar);
                                                                            if (iB10 == iB11) {
                                                                                break;
                                                                            } else {
                                                                                iB10 = i32;
                                                                            }
                                                                        }
                                                                    }
                                                                    iIntValue15 = iIntValue18;
                                                                } else {
                                                                    hVar.a(iB10, gVar);
                                                                    iIntValue15 = iIntValue17;
                                                                }
                                                                if (i28 == iB9) {
                                                                    iIntValue12 = iIntValue15;
                                                                    iB6 = i27;
                                                                    i22 = i30;
                                                                    i25 = i13;
                                                                    strD2 = str2;
                                                                    length = i31;
                                                                    i24 = i17;
                                                                    str7 = str3;
                                                                    break;
                                                                }
                                                                i28 = i29;
                                                                i22 = i30;
                                                                length = i31;
                                                                i24 = i17;
                                                                str7 = str3;
                                                            }
                                                        } else {
                                                            iIntValue12 = iIntValue15;
                                                            iB6 = i27;
                                                            i25 = i13;
                                                            strD2 = str2;
                                                        }
                                                    }
                                                    str = strD2;
                                                    i10 = i22;
                                                    i11 = length;
                                                    i12 = i24;
                                                    mVar2.G = hVar;
                                                } else {
                                                    i = iIntValue11;
                                                    i6 = size;
                                                    str = strD2;
                                                    i10 = i22;
                                                    i11 = length;
                                                    i12 = i24;
                                                    if (str6.equals("publisherConsents")) {
                                                        mVar2.v = a.a.b(numValueOf.intValue(), strSubstring);
                                                    } else if (str6.equals("publisherLegitimateInterests")) {
                                                        mVar2.f10753w = a.a.b(numValueOf.intValue(), strSubstring);
                                                    } else if (str6.equals("numCustomPurposes")) {
                                                        mVar2.f10747p = t1.b(numValueOf.intValue(), strSubstring);
                                                    } else if (str6.equals("publisherCustomConsents")) {
                                                        mVar2.f10754x = a.a.b(numValueOf.intValue(), strSubstring);
                                                    } else if (str6.equals("publisherCustomLegitimateInterests")) {
                                                        mVar2.f10755y = a.a.b(numValueOf.intValue(), strSubstring);
                                                    } else if (str6.equals("vendorsAllowed")) {
                                                        mVar2.F = i5.c(strSubstring);
                                                    } else {
                                                        if (!str6.equals("vendorsDisclosed")) {
                                                            throw new w5.e(androidx.lifecycle.l.w("g.i: Unable to find: ", str6, " field on TCModel, segment"));
                                                        }
                                                        mVar2.E = i5.c(strSubstring);
                                                    }
                                                }
                                                iIntValue11 = numValueOf.intValue() + i;
                                                listG0 = list;
                                                strArr2 = strArr;
                                                size = i6;
                                            }
                                        }
                                    }
                                    i = iIntValue11;
                                }
                                i6 = size;
                                str = strD2;
                                i10 = i22;
                                i11 = length;
                                i12 = i24;
                                iIntValue11 = numValueOf.intValue() + i;
                                listG0 = list;
                                strArr2 = strArr;
                                size = i6;
                            }
                            i22 = i10;
                            strD2 = str;
                            length = i11;
                            i23 = i12;
                            r62 = 0;
                        }
                    }
                    listG0 = listG0;
                    size = size;
                    i21 = i22;
                    i20 = 1;
                    z9 = false;
                }
                mVar.f10749r.set(mVar2.f10749r);
                Vector vector8 = mVar.f10750s;
                vector8.unsetAllOwnedItems();
                vector8.set(mVar2.f10750s);
                mVar.f10748q.set(mVar2.f10748q);
                Vector vector9 = mVar.f10756z;
                vector9.unsetAllOwnedItems();
                vector9.setOwnedItems(mVar2.f10756z);
                Vector vector10 = mVar.C;
                vector10.unsetAllOwnedItems();
                vector10.setOwnedItems(mVar2.C);
                Vector vector11 = mVar.v;
                vector11.unsetAllOwnedItems();
                vector11.set(mVar2.v);
                Vector vector12 = mVar.f10753w;
                vector12.unsetAllOwnedItems();
                vector12.set(mVar2.f10753w);
            }
        }
        if (m9.c.c().g() || aVar.j(8).length() > 0) {
            String str8 = this.f678p.f7239n.f7198a;
            j9.h hVar2 = this.i;
            if (str8 != null) {
                PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
                if (str8.equals(privacyEncodingMode.getValue())) {
                    if (!m9.c.c().g()) {
                        hVar2.b(privacyEncodingMode, false, false);
                    }
                    f();
                    return;
                }
            }
            String str9 = this.f678p.f7239n.f7198a;
            if (str9 != null) {
                PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
                if (str9.equals(privacyEncodingMode2.getValue())) {
                    m9.c.c().b(2);
                    b();
                    String strC = m9.c.c().c();
                    strC.getClass();
                    aVar.f(63, strC);
                    if (aVar.j(8).length() == 0) {
                        hVar2.b(privacyEncodingMode2, false, false);
                        return;
                    }
                    return;
                }
            }
            if (!m9.c.c().g()) {
                hVar2.b(PrivacyEncodingMode.GPP, false, false);
            }
            if (aVar.j(8).length() == 0) {
                hVar2.b(PrivacyEncodingMode.TCF, false, false);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        u5.m mVar = this.f669b;
        int i = mVar.f10744m;
        l9.a aVar = this.f668a;
        aVar.c(43, i);
        aVar.c(44, mVar.f10745n);
        aVar.c(45, mVar.d());
        aVar.c(46, this.f678p.f7231a.contains(Regulations.GDPR) ? 1 : 0);
        aVar.f(47, this.f678p.f7234d);
        aVar.c(48, mVar.g ? 1 : 0);
        aVar.c(49, mVar.f ? 1 : 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n() {
        u5.m mVar = this.f669b;
        int i = mVar.f10744m;
        l9.a aVar = this.f668a;
        aVar.c(1, i);
        aVar.c(2, mVar.f10745n);
        aVar.c(3, mVar.d());
        if (this.f676n <= 0) {
            this.f676n = mVar.d();
        }
        aVar.c(4, this.f678p.f7231a.contains(Regulations.GDPR) ? 1 : 0);
        aVar.f(5, this.f678p.f7234d);
        aVar.c(6, mVar.g ? 1 : 0);
        aVar.c(7, mVar.f ? 1 : 0);
    }

    public final boolean o() {
        long j = this.f678p.f7238m;
        l9.a aVar = this.f668a;
        aVar.getClass();
        long j6 = aVar.f7262a.getLong("LastVisitTime", 0L);
        boolean z9 = ((double) (j - j6)) / ((double) 60000) >= 30.0d;
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j6);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j);
        boolean z10 = calendar.get(6) != calendar2.get(6);
        aVar.d(79, this.f678p.f7238m);
        return z9 || z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.p():boolean");
    }
}
