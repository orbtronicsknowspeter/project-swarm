package t3;

import androidx.lifecycle.l;
import java.util.Arrays;
import java.util.List;
import k0.k;
import r3.t;
import r3.u;
import r3.v;
import r3.w;
import s1.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9567e;
    public m3.c f;
    public n3.a g;

    public /* synthetic */ f(int i) {
        this.f9567e = i;
    }

    @Override // t3.a
    public final void b(String str, r3.b bVar) {
        switch (this.f9567e) {
            case 0:
                r3.a aVar = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9558a).c(aVar);
                }
                try {
                    this.f.getClass();
                    String strA = m3.b.a(str);
                    n3.a aVar2 = this.g;
                    List list = t.f8895b;
                    aVar2.getClass();
                    n3.a.a(strA, list, aVar);
                } catch (Exception e10) {
                    o.m(l.w("Unable to decode UsTnGpcSegment '", str, "'"), e10);
                    return;
                }
                break;
            case 1:
                r3.a aVar3 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9558a).c(aVar3);
                }
                try {
                    this.f.getClass();
                    String strA2 = m3.b.a(str);
                    n3.a aVar4 = this.g;
                    List list2 = u.f8896a;
                    aVar4.getClass();
                    n3.a.a(strA2, list2, aVar3);
                } catch (Exception e11) {
                    o.m(l.w("Unable to decode UsTxCoreSegment '", str, "'"), e11);
                    return;
                }
                break;
            case 2:
                r3.a aVar5 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9558a).c(aVar5);
                }
                try {
                    this.f.getClass();
                    String strA3 = m3.b.a(str);
                    n3.a aVar6 = this.g;
                    List list3 = u.f8897b;
                    aVar6.getClass();
                    n3.a.a(strA3, list3, aVar5);
                } catch (Exception e12) {
                    o.m(l.w("Unable to decode UsTxGpcSegment '", str, "'"), e12);
                    return;
                }
                break;
            case 3:
                r3.a aVar7 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9558a).c(aVar7);
                }
                try {
                    this.f.getClass();
                    String strA4 = m3.b.a(str);
                    n3.a aVar8 = this.g;
                    List list4 = v.f8898a;
                    aVar8.getClass();
                    n3.a.a(strA4, list4, aVar7);
                } catch (Exception e13) {
                    o.m(l.w("Unable to decode UsUtCoreSegment '", str, "'"), e13);
                    return;
                }
                break;
            default:
                r3.a aVar9 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9558a).c(aVar9);
                }
                try {
                    this.f.getClass();
                    String strA5 = m3.b.a(str);
                    n3.a aVar10 = this.g;
                    List list5 = w.f8899a;
                    aVar10.getClass();
                    n3.a.a(strA5, list5, aVar9);
                } catch (Exception e14) {
                    o.m(l.w("Unable to decode UsVaCoreSegment '", str, "'"), e14);
                }
                break;
        }
    }

    @Override // t3.a
    public final String d(r3.b bVar) {
        switch (this.f9567e) {
            case 0:
                n3.a aVar = this.g;
                List list = t.f8895b;
                aVar.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list));
            case 1:
                n3.a aVar2 = this.g;
                List list2 = u.f8896a;
                aVar2.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list2));
            case 2:
                n3.a aVar3 = this.g;
                List list3 = u.f8897b;
                aVar3.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list3));
            case 3:
                n3.a aVar4 = this.g;
                List list4 = v.f8898a;
                aVar4.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list4));
            default:
                n3.a aVar5 = this.g;
                List list5 = w.f8899a;
                aVar5.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list5));
        }
    }

    @Override // t3.a
    public final r3.b f() {
        switch (this.f9567e) {
            case 0:
                r3.a aVar = new r3.a();
                List list = t.f8894a;
                aVar.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar;
            case 1:
                e eVar = new e(13);
                e eVar2 = new e(14);
                e eVar3 = new e(15);
                r3.a aVar2 = new r3.a();
                List list2 = u.f8896a;
                aVar2.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar = new o3.d(2, (Integer) 0);
                dVar.f8150b = eVar;
                o3.d dVarK = k.k(aVar2, "ProcessingNotice", dVar, 2, 0);
                dVarK.f8150b = eVar;
                o3.d dVarK2 = k.k(aVar2, "SaleOptOutNotice", dVarK, 2, 0);
                dVarK2.f8150b = eVar;
                o3.d dVarK3 = k.k(aVar2, "TargetedAdvertisingOptOutNotice", dVarK2, 2, 0);
                dVarK3.f8150b = eVar;
                o3.d dVarK4 = k.k(aVar2, "SaleOptOut", dVarK3, 2, 0);
                dVarK4.f8150b = eVar;
                aVar2.b("TargetedAdvertisingOptOut", dVarK4);
                o3.d dVar2 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar2.f8150b = eVar3;
                aVar2.b("SensitiveDataProcessing", dVar2);
                o3.d dVar3 = new o3.d(2, (Integer) 0);
                dVar3.f8150b = eVar;
                o3.d dVarK5 = k.k(aVar2, "KnownChildSensitiveDataConsents", dVar3, 2, 0);
                dVarK5.f8150b = eVar;
                o3.d dVarK6 = k.k(aVar2, "AdditionalDataProcessingConsent", dVarK5, 2, 1);
                dVarK6.f8150b = eVar2;
                o3.d dVarK7 = k.k(aVar2, "MspaCoveredTransaction", dVarK6, 2, 0);
                dVarK7.f8150b = eVar;
                o3.d dVarK8 = k.k(aVar2, "MspaOptOutOptionMode", dVarK7, 2, 0);
                dVarK8.f8150b = eVar;
                aVar2.b("MspaServiceProviderMode", dVarK8);
                return aVar2;
            case 2:
                r3.a aVar3 = new r3.a();
                List list3 = u.f8896a;
                aVar3.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar3.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar3.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar3;
            case 3:
                e eVar4 = new e(16);
                e eVar5 = new e(17);
                e eVar6 = new e(18);
                r3.a aVar4 = new r3.a();
                List list4 = v.f8898a;
                aVar4.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar4 = new o3.d(2, (Integer) 0);
                dVar4.f8150b = eVar4;
                o3.d dVarK9 = k.k(aVar4, "SharingNotice", dVar4, 2, 0);
                dVarK9.f8150b = eVar4;
                o3.d dVarK10 = k.k(aVar4, "SaleOptOutNotice", dVarK9, 2, 0);
                dVarK10.f8150b = eVar4;
                o3.d dVarK11 = k.k(aVar4, "TargetedAdvertisingOptOutNotice", dVarK10, 2, 0);
                dVarK11.f8150b = eVar4;
                o3.d dVarK12 = k.k(aVar4, "SensitiveDataProcessingOptOutNotice", dVarK11, 2, 0);
                dVarK12.f8150b = eVar4;
                o3.d dVarK13 = k.k(aVar4, "SaleOptOut", dVarK12, 2, 0);
                dVarK13.f8150b = eVar4;
                aVar4.b("TargetedAdvertisingOptOut", dVarK13);
                o3.d dVar5 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar5.f8150b = eVar6;
                aVar4.b("SensitiveDataProcessing", dVar5);
                o3.d dVar6 = new o3.d(2, (Integer) 0);
                dVar6.f8150b = eVar4;
                o3.d dVarK14 = k.k(aVar4, "KnownChildSensitiveDataConsents", dVar6, 2, 1);
                dVarK14.f8150b = eVar5;
                o3.d dVarK15 = k.k(aVar4, "MspaCoveredTransaction", dVarK14, 2, 0);
                dVarK15.f8150b = eVar4;
                o3.d dVarK16 = k.k(aVar4, "MspaOptOutOptionMode", dVarK15, 2, 0);
                dVarK16.f8150b = eVar4;
                aVar4.b("MspaServiceProviderMode", dVarK16);
                return aVar4;
            default:
                e eVar7 = new e(19);
                e eVar8 = new e(20);
                e eVar9 = new e(21);
                r3.a aVar5 = new r3.a();
                List list5 = w.f8899a;
                aVar5.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar7 = new o3.d(2, (Integer) 0);
                dVar7.f8150b = eVar7;
                o3.d dVarK17 = k.k(aVar5, "SharingNotice", dVar7, 2, 0);
                dVarK17.f8150b = eVar7;
                o3.d dVarK18 = k.k(aVar5, "SaleOptOutNotice", dVarK17, 2, 0);
                dVarK18.f8150b = eVar7;
                o3.d dVarK19 = k.k(aVar5, "TargetedAdvertisingOptOutNotice", dVarK18, 2, 0);
                dVarK19.f8150b = eVar7;
                o3.d dVarK20 = k.k(aVar5, "SaleOptOut", dVarK19, 2, 0);
                dVarK20.f8150b = eVar7;
                aVar5.b("TargetedAdvertisingOptOut", dVarK20);
                o3.d dVar8 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar8.f8150b = eVar9;
                aVar5.b("SensitiveDataProcessing", dVar8);
                o3.d dVar9 = new o3.d(2, (Integer) 0);
                dVar9.f8150b = eVar7;
                o3.d dVarK21 = k.k(aVar5, "KnownChildSensitiveDataConsents", dVar9, 2, 1);
                dVarK21.f8150b = eVar8;
                o3.d dVarK22 = k.k(aVar5, "MspaCoveredTransaction", dVarK21, 2, 0);
                dVarK22.f8150b = eVar7;
                o3.d dVarK23 = k.k(aVar5, "MspaOptOutOptionMode", dVarK22, 2, 0);
                dVarK23.f8150b = eVar7;
                aVar5.b("MspaServiceProviderMode", dVarK23);
                return aVar5;
        }
    }
}
