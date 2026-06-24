package j9;

import b2.t1;
import com.google.android.gms.internal.measurement.z3;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.a f6762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.m f6763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f6764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5.f f6765d;

    public h(l9.a aVar, u5.m mVar, ChoiceCmpCallback choiceCmpCallback) {
        aVar.getClass();
        this.f6762a = aVar;
        this.f6763b = mVar;
        this.f6764c = choiceCmpCallback;
        this.f6765d = new w5.f(q6.m.e0(u5.j.CORE, u5.j.VENDORS_DISCLOSED, u5.j.PUBLISHER_TC));
    }

    public final void a() throws w5.e, NoSuchAlgorithmException {
        u5.c cVar;
        u5.m mVar = this.f6763b;
        Vector vector = mVar.A;
        int i = 0;
        try {
            l3.a aVarC = m9.c.c();
            l9.a aVar = (l9.a) m9.c.v.getValue();
            List list = r3.f.f8865a;
            aVarC.h("tcfeuv2", "Version", Integer.valueOf(mVar.i));
            aVarC.h("tcfeuv2", "CmpId", Integer.valueOf(mVar.f10745m));
            aVarC.h("tcfeuv2", "CmpVersion", Integer.valueOf(mVar.f10746n));
            aVarC.h("tcfeuv2", "ConsentScreen", Integer.valueOf(mVar.j));
            aVarC.h("tcfeuv2", "ConsentLanguage", mVar.f10744l);
            h8.c cVar2 = mVar.f10738a;
            Integer num = cVar2 == null ? null : cVar2.f5461b;
            aVarC.h("tcfeuv2", "VendorListVersion", Integer.valueOf(num == null ? mVar.f10747o : num.intValue()));
            aVarC.h("tcfeuv2", "PolicyVersion", Integer.valueOf(mVar.d()));
            aVarC.h("tcfeuv2", "IsServiceSpecific", Boolean.valueOf(mVar.f10742e));
            aVarC.h("tcfeuv2", "UseNonStandardStacks", Boolean.valueOf(mVar.f));
            aVarC.h("tcfeuv2", "SpecialFeatureOptins", t1.e(12, mVar.f10749q));
            aVarC.h("tcfeuv2", "PurposeConsents", t1.e(24, mVar.f10750r));
            aVarC.h("tcfeuv2", "PurposeLegitimateInterests", t1.e(24, mVar.f10751s));
            aVarC.h("tcfeuv2", "PurposeOneTreatment", Boolean.valueOf(mVar.g));
            aVarC.h("tcfeuv2", "PublisherCountryCode", mVar.h);
            aVarC.h("tcfeuv2", "VendorConsents", q6.l.G0(mVar.f10757z.getAcceptedItems()));
            aVarC.h("tcfeuv2", "VendorLegitimateInterests", q6.l.G0(mVar.C.getAcceptedItems()));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mVar.G.f10721c.entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                u5.g gVarB = z3.b(str);
                arrayList.add(new o3.f(q6.l.G0(set), gVarB.f10717a, gVarB.f10718b.f10727a));
            }
            List list2 = r3.f.f8865a;
            aVarC.h("tcfeuv2", "PublisherRestrictions", arrayList);
            aVarC.h("tcfeuv2", "PublisherConsents", t1.e(24, mVar.v));
            aVarC.h("tcfeuv2", "PublisherLegitimateInterests", t1.e(24, mVar.f10754w));
            int i6 = mVar.f10748p;
            aVarC.h("tcfeuv2", "NumCustomPurposes", Integer.valueOf(i6));
            aVarC.h("tcfeuv2", "PublisherCustomConsents", t1.e(i6, mVar.f10755x));
            aVarC.h("tcfeuv2", "PublisherCustomLegitimateInterests", t1.e(i6, mVar.f10756y));
            aVarC.h("tcfeuv2", "VendorsAllowed", q6.l.G0(mVar.F.getAcceptedItems()));
            aVarC.h("tcfeuv2", "VendorsDisclosed", q6.l.G0(mVar.E.getAcceptedItems()));
            aVarC.d();
            aVar.f(61, String.valueOf(1));
            aVar.f(62, aVarC.f().toString());
            aVar.f(64, q6.l.x0(aVarC.f(), "_", null, null, null, 62));
            String strO0 = l7.u.o0("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(2), false);
            String strC = aVarC.e("tcfeuv2").c();
            strC.getClass();
            aVar.h(strO0, strC);
            ZonedDateTime zonedDateTime = mVar.f10741d;
            if (zonedDateTime != null) {
                aVarC.h("tcfeuv2", "Created", zonedDateTime);
                aVarC.h("tcfeuv2", "LastUpdated", mVar.f10741d);
            }
            m9.c.i = aVarC;
            cVar = new u5.c(aVarC.c(), strC);
        } catch (Exception e10) {
            a.a.h("GPPString", kotlin.jvm.internal.l.g(e10.getMessage(), "Error while encoding GPP String: "), e10, 8);
            ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
            if (callback != null) {
                callback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
            }
            cVar = new u5.c("", "");
        }
        String str2 = cVar.f10709a;
        String str3 = str2 != null ? str2 : "";
        String strC2 = d0.b.c(vector);
        String strM = t1.m(vector.toString());
        String strC3 = d0.b.c(mVar.D);
        Set<Integer> acceptedItems = mVar.B.getAcceptedItems();
        acceptedItems.getClass();
        String strG = "1~";
        for (Object obj : acceptedItems) {
            int i10 = i + 1;
            if (i < 0) {
                q6.m.h0();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            strG = kotlin.jvm.internal.l.g(i != 0 ? kotlin.jvm.internal.l.g(Integer.valueOf(iIntValue), ".") : Integer.valueOf(iIntValue), strG);
            i = i10;
        }
        String strC4 = d0.b.c(mVar.f10757z);
        String strC5 = d0.b.c(mVar.C);
        String strC6 = d0.b.c(mVar.f10750r);
        String strC7 = d0.b.c(mVar.f10751s);
        String strC8 = d0.b.c(mVar.f10749q);
        String string = mVar.G.f10721c.toString();
        String strC9 = d0.b.c(mVar.v);
        String strC10 = d0.b.c(mVar.f10754w);
        String strC11 = d0.b.c(mVar.f10755x);
        String strC12 = d0.b.c(mVar.f10756y);
        l9.a aVar2 = this.f6762a;
        aVar2.getClass();
        strC2.getClass();
        strC3.getClass();
        strC4.getClass();
        strC5.getClass();
        strC6.getClass();
        strC7.getClass();
        strC8.getClass();
        string.getClass();
        strC9.getClass();
        strC10.getClass();
        strC11.getClass();
        strC12.getClass();
        aVar2.f(63, str3);
        aVar2.f(50, cVar.f10710b);
        aVar2.f(35, strC2);
        aVar2.f(23, t1.m(strM));
        aVar2.f(36, strC3);
        aVar2.f(22, kotlin.jvm.internal.l.g(aVar2.j(24), aVar2.j(23)));
        aVar2.f(31, strG);
        aVar2.f(51, strC4);
        aVar2.f(52, strC5);
        aVar2.f(53, strC6);
        aVar2.f(54, strC7);
        aVar2.f(55, strC8);
        aVar2.f(56, string);
        aVar2.f(57, strC9);
        aVar2.f(58, strC10);
        aVar2.f(59, strC11);
        aVar2.f(60, strC12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.h.b(com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0390, code lost:
    
        throw new w5.e("h.i: invalid language code: ".concat(r3));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ea A[LOOP:4: B:226:0x04c1->B:236:0x04ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws w5.e, java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.h.c():void");
    }
}
