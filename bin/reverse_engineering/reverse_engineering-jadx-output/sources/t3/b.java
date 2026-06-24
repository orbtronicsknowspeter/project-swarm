package t3;

import androidx.lifecycle.l;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r3.h;
import r3.i;
import r3.j;
import r3.k;
import r3.m;
import r3.n;
import r3.p;
import r3.q;
import r3.r;
import r3.s;
import r3.t;
import s1.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9561e;
    public m3.c f;
    public n3.a g;

    public /* synthetic */ b(int i) {
        this.f9561e = i;
    }

    @Override // t3.a
    public final void b(String str, r3.b bVar) {
        switch (this.f9561e) {
            case 0:
                r3.a aVar = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar);
                }
                try {
                    this.f.getClass();
                    String strA = m3.b.a(str);
                    n3.a aVar2 = this.g;
                    List list = r3.d.f8860a;
                    aVar2.getClass();
                    n3.a.a(strA, list, aVar);
                } catch (Exception e10) {
                    o.m(l.w("Unable to decode HeaderV1CoreSegment '", str, "'"), e10);
                    return;
                }
                break;
            case 1:
                r3.a aVar3 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar3);
                }
                try {
                    this.f.getClass();
                    String strA2 = m3.b.a(str);
                    n3.a aVar4 = this.g;
                    List list2 = r3.e.f8861a;
                    aVar4.getClass();
                    n3.a.a(strA2, list2, aVar3);
                } catch (Exception e11) {
                    o.m(l.w("Unable to decode TcfCaV1CoreSegment '", str, "'"), e11);
                    return;
                }
                break;
            case 2:
                r3.a aVar5 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar5);
                }
                try {
                    this.f.getClass();
                    String strA3 = m3.b.a(str);
                    n3.a aVar6 = this.g;
                    List list3 = r3.e.f8863c;
                    aVar6.getClass();
                    n3.a.a(strA3, list3, aVar5);
                } catch (Exception e12) {
                    o.m(l.w("Unable to decode TcfCaV1DisclosedVendorsSegment '", str, "'"), e12);
                    return;
                }
                break;
            case 3:
                r3.a aVar7 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar7);
                }
                try {
                    this.f.getClass();
                    String strA4 = m3.b.a(str);
                    n3.a aVar8 = this.g;
                    List list4 = r3.e.f8862b;
                    aVar8.getClass();
                    n3.a.a(strA4, list4, aVar7);
                } catch (Exception e13) {
                    o.m(l.w("Unable to decode TcfCaV1PublisherPurposesSegment '", str, "'"), e13);
                    return;
                }
                break;
            case 4:
                r3.a aVar9 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar9);
                }
                try {
                    this.f.getClass();
                    String strA5 = m3.b.a(str);
                    n3.a aVar10 = this.g;
                    List list5 = r3.g.f8868a;
                    aVar10.getClass();
                    n3.a.a(strA5, list5, aVar9);
                } catch (Exception e14) {
                    o.m(l.w("Unable to decode UsCaCoreSegment '", str, "'"), e14);
                    return;
                }
                break;
            case 5:
                r3.a aVar11 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar11);
                }
                try {
                    this.f.getClass();
                    String strA6 = m3.b.a(str);
                    n3.a aVar12 = this.g;
                    List list6 = r3.g.f8869b;
                    aVar12.getClass();
                    n3.a.a(strA6, list6, aVar11);
                } catch (Exception e15) {
                    o.m(l.w("Unable to decode UsCaGpcSegment '", str, "'"), e15);
                    return;
                }
                break;
            case 6:
                r3.a aVar13 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar13);
                }
                try {
                    this.f.getClass();
                    String strA7 = m3.b.a(str);
                    n3.a aVar14 = this.g;
                    List list7 = h.f8870a;
                    aVar14.getClass();
                    n3.a.a(strA7, list7, aVar13);
                } catch (Exception e16) {
                    o.m(l.w("Unable to decode UsCoCoreSegment '", str, "'"), e16);
                    return;
                }
                break;
            case 7:
                r3.a aVar15 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar15);
                }
                try {
                    this.f.getClass();
                    String strA8 = m3.b.a(str);
                    n3.a aVar16 = this.g;
                    List list8 = h.f8871b;
                    aVar16.getClass();
                    n3.a.a(strA8, list8, aVar15);
                } catch (Exception e17) {
                    o.m(l.w("Unable to decode UsCoGpcSegment '", str, "'"), e17);
                    return;
                }
                break;
            case 8:
                r3.a aVar17 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar17);
                }
                try {
                    this.f.getClass();
                    String strA9 = m3.b.a(str);
                    n3.a aVar18 = this.g;
                    List list9 = i.f8872a;
                    aVar18.getClass();
                    n3.a.a(strA9, list9, aVar17);
                } catch (Exception e18) {
                    o.m(l.w("Unable to decode UsCtCoreSegment '", str, "'"), e18);
                    return;
                }
                break;
            case 9:
                r3.a aVar19 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar19);
                }
                try {
                    this.f.getClass();
                    String strA10 = m3.b.a(str);
                    n3.a aVar20 = this.g;
                    List list10 = i.f8873b;
                    aVar20.getClass();
                    n3.a.a(strA10, list10, aVar19);
                } catch (Exception e19) {
                    o.m(l.w("Unable to decode UsCtGpcSegment '", str, "'"), e19);
                    return;
                }
                break;
            case 10:
                r3.a aVar21 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar21);
                }
                try {
                    this.f.getClass();
                    String strA11 = m3.b.a(str);
                    n3.a aVar22 = this.g;
                    List list11 = j.f8874a;
                    aVar22.getClass();
                    n3.a.a(strA11, list11, aVar21);
                } catch (Exception e20) {
                    o.m(l.w("Unable to decode UsDeCoreSegment '", str, "'"), e20);
                    return;
                }
                break;
            case 11:
                r3.a aVar23 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar23);
                }
                try {
                    this.f.getClass();
                    String strA12 = m3.b.a(str);
                    n3.a aVar24 = this.g;
                    List list12 = j.f8875b;
                    aVar24.getClass();
                    n3.a.a(strA12, list12, aVar23);
                } catch (Exception e21) {
                    o.m(l.w("Unable to decode UsDeGpcSegment '", str, "'"), e21);
                    return;
                }
                break;
            case 12:
                r3.a aVar25 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar25);
                }
                try {
                    this.f.getClass();
                    String strA13 = m3.b.a(str);
                    n3.a aVar26 = this.g;
                    List list13 = k.f8876a;
                    aVar26.getClass();
                    n3.a.a(strA13, list13, aVar25);
                } catch (Exception e22) {
                    o.m(l.w("Unable to decode UsFlCoreSegment '", str, "'"), e22);
                    return;
                }
                break;
            case 13:
                r3.a aVar27 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar27);
                }
                try {
                    this.f.getClass();
                    String strA14 = m3.b.a(str);
                    n3.a aVar28 = this.g;
                    List list14 = r3.l.f8877a;
                    aVar28.getClass();
                    n3.a.a(strA14, list14, aVar27);
                } catch (Exception e23) {
                    o.m(l.w("Unable to decode UsIaCoreSegment '", str, "'"), e23);
                    return;
                }
                break;
            case 14:
                r3.a aVar29 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar29);
                }
                try {
                    this.f.getClass();
                    String strA15 = m3.b.a(str);
                    n3.a aVar30 = this.g;
                    List list15 = r3.l.f8878b;
                    aVar30.getClass();
                    n3.a.a(strA15, list15, aVar29);
                } catch (Exception e24) {
                    o.m(l.w("Unable to decode UsIaGpcSegment '", str, "'"), e24);
                    return;
                }
                break;
            case 15:
                r3.a aVar31 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar31);
                }
                try {
                    this.f.getClass();
                    String strA16 = m3.b.a(str);
                    n3.a aVar32 = this.g;
                    List list16 = m.f8879a;
                    aVar32.getClass();
                    n3.a.a(strA16, list16, aVar31);
                } catch (Exception e25) {
                    o.m(l.w("Unable to decode UsMnCoreSegment '", str, "'"), e25);
                    return;
                }
                break;
            case 16:
                r3.a aVar33 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar33);
                }
                try {
                    this.f.getClass();
                    String strA17 = m3.b.a(str);
                    n3.a aVar34 = this.g;
                    List list17 = m.f8880b;
                    aVar34.getClass();
                    n3.a.a(strA17, list17, aVar33);
                } catch (Exception e26) {
                    o.m(l.w("Unable to decode UsMnGpcSegment '", str, "'"), e26);
                    return;
                }
                break;
            case 17:
                r3.a aVar35 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar35);
                }
                try {
                    this.f.getClass();
                    String strA18 = m3.b.a(str);
                    n3.a aVar36 = this.g;
                    List list18 = n.f8881a;
                    aVar36.getClass();
                    n3.a.a(strA18, list18, aVar35);
                } catch (Exception e27) {
                    o.m(l.w("Unable to decode UsMtCoreSegment '", str, "'"), e27);
                    return;
                }
                break;
            case 18:
                r3.a aVar37 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar37);
                }
                try {
                    this.f.getClass();
                    String strA19 = m3.b.a(str);
                    n3.a aVar38 = this.g;
                    List list19 = n.f8882b;
                    aVar38.getClass();
                    n3.a.a(strA19, list19, aVar37);
                } catch (Exception e28) {
                    o.m(l.w("Unable to decode UsMtGpcSegment '", str, "'"), e28);
                    return;
                }
                break;
            case 19:
                r3.a aVar39 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar39);
                }
                try {
                    this.f.getClass();
                    String strA20 = m3.b.a(str);
                    if (strA20.length() == 60) {
                        strA20 = strA20.substring(0, 48) + "00000000" + strA20.substring(48, 52) + "00" + strA20.substring(52, 60) + "00";
                    } else if (strA20.length() == 66) {
                        strA20 = strA20.substring(0, 48) + "00000000" + strA20.substring(48, 52) + "00" + strA20.substring(52, 62);
                    }
                    n3.a aVar40 = this.g;
                    List list20 = r3.o.f8883a;
                    aVar40.getClass();
                    n3.a.a(strA20, list20, aVar39);
                } catch (Exception e29) {
                    o.m(l.w("Unable to decode UsNatCoreSegment '", str, "'"), e29);
                    return;
                }
                break;
            case 20:
                r3.a aVar41 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar41);
                }
                try {
                    this.f.getClass();
                    String strA21 = m3.b.a(str);
                    n3.a aVar42 = this.g;
                    List list21 = r3.o.f8884b;
                    aVar42.getClass();
                    n3.a.a(strA21, list21, aVar41);
                } catch (Exception e30) {
                    o.m(l.w("Unable to decode UsNatGpcSegment '", str, "'"), e30);
                    return;
                }
                break;
            case 21:
                r3.a aVar43 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar43);
                }
                try {
                    this.f.getClass();
                    String strA22 = m3.b.a(str);
                    n3.a aVar44 = this.g;
                    List list22 = p.f8885a;
                    aVar44.getClass();
                    n3.a.a(strA22, list22, aVar43);
                } catch (Exception e31) {
                    o.m(l.w("Unable to decode UsNeCoreSegment '", str, "'"), e31);
                    return;
                }
                break;
            case 22:
                r3.a aVar45 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar45);
                }
                try {
                    this.f.getClass();
                    String strA23 = m3.b.a(str);
                    n3.a aVar46 = this.g;
                    List list23 = p.f8886b;
                    aVar46.getClass();
                    n3.a.a(strA23, list23, aVar45);
                } catch (Exception e32) {
                    o.m(l.w("Unable to decode UsNeGpcSegment '", str, "'"), e32);
                    return;
                }
                break;
            case 23:
                r3.a aVar47 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar47);
                }
                try {
                    this.f.getClass();
                    String strA24 = m3.b.a(str);
                    n3.a aVar48 = this.g;
                    List list24 = q.f8887a;
                    aVar48.getClass();
                    n3.a.a(strA24, list24, aVar47);
                } catch (Exception e33) {
                    o.m(l.w("Unable to decode UsNhCoreSegment '", str, "'"), e33);
                    return;
                }
                break;
            case 24:
                r3.a aVar49 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar49);
                }
                try {
                    this.f.getClass();
                    String strA25 = m3.b.a(str);
                    n3.a aVar50 = this.g;
                    List list25 = q.f8888b;
                    aVar50.getClass();
                    n3.a.a(strA25, list25, aVar49);
                } catch (Exception e34) {
                    o.m(l.w("Unable to decode UsNhGpcSegment '", str, "'"), e34);
                    return;
                }
                break;
            case 25:
                r3.a aVar51 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar51);
                }
                try {
                    this.f.getClass();
                    String strA26 = m3.b.a(str);
                    n3.a aVar52 = this.g;
                    List list26 = r.f8889a;
                    aVar52.getClass();
                    n3.a.a(strA26, list26, aVar51);
                } catch (Exception e35) {
                    o.m(l.w("Unable to decode UsNjCoreSegment '", str, "'"), e35);
                    return;
                }
                break;
            case 26:
                r3.a aVar53 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar53);
                }
                try {
                    this.f.getClass();
                    String strA27 = m3.b.a(str);
                    n3.a aVar54 = this.g;
                    List list27 = r.f8890b;
                    aVar54.getClass();
                    n3.a.a(strA27, list27, aVar53);
                } catch (Exception e36) {
                    o.m(l.w("Unable to decode UsNjGpcSegment '", str, "'"), e36);
                    return;
                }
                break;
            case 27:
                r3.a aVar55 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar55);
                }
                try {
                    this.f.getClass();
                    String strA28 = m3.b.a(str);
                    n3.a aVar56 = this.g;
                    List list28 = s.f8891a;
                    aVar56.getClass();
                    n3.a.a(strA28, list28, aVar55);
                } catch (Exception e37) {
                    o.m(l.w("Unable to decode UsOrCoreSegment '", str, "'"), e37);
                    return;
                }
                break;
            case 28:
                r3.a aVar57 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar57);
                }
                try {
                    this.f.getClass();
                    String strA29 = m3.b.a(str);
                    n3.a aVar58 = this.g;
                    List list29 = s.f8892b;
                    aVar58.getClass();
                    n3.a.a(strA29, list29, aVar57);
                } catch (Exception e38) {
                    o.m(l.w("Unable to decode UsOrGpcSegment '", str, "'"), e38);
                    return;
                }
                break;
            default:
                r3.a aVar59 = (r3.a) bVar;
                if (str == null || str.isEmpty()) {
                    ((r3.a) this.f9557a).c(aVar59);
                }
                try {
                    this.f.getClass();
                    String strA30 = m3.b.a(str);
                    n3.a aVar60 = this.g;
                    List list30 = t.f8893a;
                    aVar60.getClass();
                    n3.a.a(strA30, list30, aVar59);
                } catch (Exception e39) {
                    o.m(l.w("Unable to decode UsTnCoreSegment '", str, "'"), e39);
                }
                break;
        }
    }

    @Override // t3.a
    public final String d(r3.b bVar) {
        switch (this.f9561e) {
            case 0:
                n3.a aVar = this.g;
                List list = r3.d.f8860a;
                aVar.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list));
            case 1:
                n3.a aVar2 = this.g;
                List list2 = r3.e.f8861a;
                aVar2.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list2));
            case 2:
                n3.a aVar3 = this.g;
                List list3 = r3.e.f8863c;
                aVar3.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list3));
            case 3:
                n3.a aVar4 = this.g;
                List list4 = r3.e.f8862b;
                aVar4.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list4));
            case 4:
                n3.a aVar5 = this.g;
                List list5 = r3.g.f8868a;
                aVar5.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list5));
            case 5:
                n3.a aVar6 = this.g;
                List list6 = r3.g.f8869b;
                aVar6.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list6));
            case 6:
                n3.a aVar7 = this.g;
                List list7 = h.f8870a;
                aVar7.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list7));
            case 7:
                n3.a aVar8 = this.g;
                List list8 = h.f8871b;
                aVar8.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list8));
            case 8:
                n3.a aVar9 = this.g;
                List list9 = i.f8872a;
                aVar9.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list9));
            case 9:
                n3.a aVar10 = this.g;
                List list10 = i.f8873b;
                aVar10.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list10));
            case 10:
                n3.a aVar11 = this.g;
                List list11 = j.f8874a;
                aVar11.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list11));
            case 11:
                n3.a aVar12 = this.g;
                List list12 = j.f8875b;
                aVar12.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list12));
            case 12:
                n3.a aVar13 = this.g;
                List list13 = k.f8876a;
                aVar13.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list13));
            case 13:
                n3.a aVar14 = this.g;
                List list14 = r3.l.f8877a;
                aVar14.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list14));
            case 14:
                n3.a aVar15 = this.g;
                List list15 = r3.l.f8878b;
                aVar15.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list15));
            case 15:
                n3.a aVar16 = this.g;
                List list16 = m.f8879a;
                aVar16.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list16));
            case 16:
                n3.a aVar17 = this.g;
                List list17 = m.f8880b;
                aVar17.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list17));
            case 17:
                n3.a aVar18 = this.g;
                List list18 = n.f8881a;
                aVar18.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list18));
            case 18:
                n3.a aVar19 = this.g;
                List list19 = n.f8882b;
                aVar19.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list19));
            case 19:
                n3.a aVar20 = this.g;
                List list20 = r3.o.f8883a;
                aVar20.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list20));
            case 20:
                n3.a aVar21 = this.g;
                List list21 = r3.o.f8884b;
                aVar21.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list21));
            case 21:
                n3.a aVar22 = this.g;
                List list22 = p.f8885a;
                aVar22.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list22));
            case 22:
                n3.a aVar23 = this.g;
                List list23 = p.f8886b;
                aVar23.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list23));
            case 23:
                n3.a aVar24 = this.g;
                List list24 = q.f8887a;
                aVar24.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list24));
            case 24:
                n3.a aVar25 = this.g;
                List list25 = q.f8888b;
                aVar25.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list25));
            case 25:
                n3.a aVar26 = this.g;
                List list26 = r.f8889a;
                aVar26.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list26));
            case 26:
                n3.a aVar27 = this.g;
                List list27 = r.f8890b;
                aVar27.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list27));
            case 27:
                n3.a aVar28 = this.g;
                List list28 = s.f8891a;
                aVar28.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list28));
            case 28:
                n3.a aVar29 = this.g;
                List list29 = s.f8892b;
                aVar29.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list29));
            default:
                n3.a aVar30 = this.g;
                List list30 = t.f8893a;
                aVar30.getClass();
                return this.f.b(n3.a.b((r3.a) bVar, list30));
        }
    }

    @Override // t3.a
    public final r3.b f() {
        switch (this.f9561e) {
            case 0:
                r3.a aVar = new r3.a();
                List list = r3.d.f8860a;
                aVar.b("Id", new o3.d(6, (Integer) 3));
                aVar.b("Version", new o3.d(6, (Integer) 1));
                ArrayList arrayList = new ArrayList();
                o3.c cVar = new o3.c(true);
                cVar.setValue(arrayList);
                aVar.b("SectionIds", cVar);
                return aVar;
            case 1:
                ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
                r3.a aVar2 = new r3.a();
                List list2 = r3.e.f8861a;
                aVar2.b("Version", new o3.d(6, (Integer) 1));
                aVar2.b("Created", new o3.c(zonedDateTimeNow));
                aVar2.b("LastUpdated", new o3.c(zonedDateTimeNow));
                aVar2.b("ConsentScreen", k0.k.k(aVar2, "CmpVersion", k0.k.k(aVar2, "CmpId", new o3.d(12, (Integer) 0), 12, 0), 6, 0));
                aVar2.b("ConsentLanguage", new o3.c("EN"));
                aVar2.b("VendorListVersion", new o3.d(12, (Integer) 0));
                aVar2.b("TcfPolicyVersion", new o3.d(6, (Integer) 2));
                Boolean bool = Boolean.FALSE;
                aVar2.b("UseNonStandardStacks", new o3.c(bool));
                aVar2.b("SpecialFeatureExpressConsent", new o3.d(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool), 0));
                aVar2.b("PurposesExpressConsent", new o3.d(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool), 0));
                aVar2.b("PurposesImpliedConsent", new o3.d(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool), 0));
                aVar2.b("VendorExpressConsent", new o3.c(new ArrayList(), 5));
                aVar2.b("VendorImpliedConsent", new o3.c(new ArrayList(), 5));
                aVar2.b("PubRestrictions", new o3.c(new ArrayList(), 0));
                return aVar2;
            case 2:
                r3.a aVar3 = new r3.a();
                List list3 = r3.e.f8861a;
                aVar3.b("DisclosedVendorsSegmentType", new o3.d(3, (Integer) 1));
                aVar3.b("DisclosedVendors", new o3.c(new ArrayList(), 5));
                return aVar3;
            case 3:
                r3.a aVar4 = new r3.a();
                List list4 = r3.e.f8861a;
                aVar4.b("PubPurposesSegmentType", new o3.d(3, (Integer) 3));
                Boolean bool2 = Boolean.FALSE;
                aVar4.b("PubPurposesExpressConsent", new o3.d(Arrays.asList(bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2), 0));
                aVar4.b("PubPurposesImpliedConsent", new o3.d(Arrays.asList(bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2, bool2), 0));
                o3.d dVar = new o3.d(6, (Integer) 0);
                aVar4.b("NumCustomPurposes", dVar);
                c cVar2 = new c(dVar, 0);
                aVar4.b("CustomPurposesExpressConsent", new o3.e(cVar2, new ArrayList()));
                aVar4.b("CustomPurposesImpliedConsent", new o3.e(cVar2, new ArrayList()));
                return aVar4;
            case 4:
                o3.i iVar = new o3.i(1);
                o3.i iVar2 = new o3.i(2);
                o3.i iVar3 = new o3.i(3);
                r3.a aVar5 = new r3.a();
                List list5 = r3.g.f8868a;
                aVar5.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar2 = new o3.d(2, (Integer) 0);
                dVar2.f8149b = iVar;
                o3.d dVarK = k0.k.k(aVar5, "SaleOptOutNotice", dVar2, 2, 0);
                dVarK.f8149b = iVar;
                o3.d dVarK2 = k0.k.k(aVar5, "SharingOptOutNotice", dVarK, 2, 0);
                dVarK2.f8149b = iVar;
                o3.d dVarK3 = k0.k.k(aVar5, "SensitiveDataLimitUseNotice", dVarK2, 2, 0);
                dVarK3.f8149b = iVar;
                o3.d dVarK4 = k0.k.k(aVar5, "SaleOptOut", dVarK3, 2, 0);
                dVarK4.f8149b = iVar;
                aVar5.b("SharingOptOut", dVarK4);
                o3.d dVar3 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar3.f8149b = iVar3;
                aVar5.b("SensitiveDataProcessing", dVar3);
                o3.d dVar4 = new o3.d(Arrays.asList(0, 0), 2);
                dVar4.f8149b = iVar3;
                aVar5.b("KnownChildSensitiveDataConsents", dVar4);
                o3.d dVar5 = new o3.d(2, (Integer) 0);
                dVar5.f8149b = iVar;
                o3.d dVarK5 = k0.k.k(aVar5, "PersonalDataConsents", dVar5, 2, 1);
                dVarK5.f8149b = iVar2;
                o3.d dVarK6 = k0.k.k(aVar5, "MspaCoveredTransaction", dVarK5, 2, 0);
                dVarK6.f8149b = iVar;
                o3.d dVarK7 = k0.k.k(aVar5, "MspaOptOutOptionMode", dVarK6, 2, 0);
                dVarK7.f8149b = iVar;
                aVar5.b("MspaServiceProviderMode", dVarK7);
                return aVar5;
            case 5:
                r3.a aVar6 = new r3.a();
                List list6 = r3.g.f8868a;
                aVar6.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar6.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar6.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar6;
            case 6:
                o3.i iVar4 = new o3.i(4);
                o3.i iVar5 = new o3.i(5);
                o3.i iVar6 = new o3.i(6);
                r3.a aVar7 = new r3.a();
                List list7 = h.f8870a;
                aVar7.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar6 = new o3.d(2, (Integer) 0);
                dVar6.f8149b = iVar4;
                o3.d dVarK8 = k0.k.k(aVar7, "SharingNotice", dVar6, 2, 0);
                dVarK8.f8149b = iVar4;
                o3.d dVarK9 = k0.k.k(aVar7, "SaleOptOutNotice", dVarK8, 2, 0);
                dVarK9.f8149b = iVar4;
                o3.d dVarK10 = k0.k.k(aVar7, "TargetedAdvertisingOptOutNotice", dVarK9, 2, 0);
                dVarK10.f8149b = iVar4;
                o3.d dVarK11 = k0.k.k(aVar7, "SaleOptOut", dVarK10, 2, 0);
                dVarK11.f8149b = iVar4;
                aVar7.b("TargetedAdvertisingOptOut", dVarK11);
                o3.d dVar7 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0), 2);
                dVar7.f8149b = iVar6;
                aVar7.b("SensitiveDataProcessing", dVar7);
                o3.d dVar8 = new o3.d(2, (Integer) 0);
                dVar8.f8149b = iVar4;
                o3.d dVarK12 = k0.k.k(aVar7, "KnownChildSensitiveDataConsents", dVar8, 2, 1);
                dVarK12.f8149b = iVar5;
                o3.d dVarK13 = k0.k.k(aVar7, "MspaCoveredTransaction", dVarK12, 2, 0);
                dVarK13.f8149b = iVar4;
                o3.d dVarK14 = k0.k.k(aVar7, "MspaOptOutOptionMode", dVarK13, 2, 0);
                dVarK14.f8149b = iVar4;
                aVar7.b("MspaServiceProviderMode", dVarK14);
                return aVar7;
            case 7:
                r3.a aVar8 = new r3.a();
                List list8 = h.f8870a;
                aVar8.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar8.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar8.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar8;
            case 8:
                o3.i iVar7 = new o3.i(7);
                o3.i iVar8 = new o3.i(8);
                o3.i iVar9 = new o3.i(9);
                r3.a aVar9 = new r3.a();
                List list9 = i.f8872a;
                aVar9.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar9 = new o3.d(2, (Integer) 0);
                dVar9.f8149b = iVar7;
                o3.d dVarK15 = k0.k.k(aVar9, "SharingNotice", dVar9, 2, 0);
                dVarK15.f8149b = iVar7;
                o3.d dVarK16 = k0.k.k(aVar9, "SaleOptOutNotice", dVarK15, 2, 0);
                dVarK16.f8149b = iVar7;
                o3.d dVarK17 = k0.k.k(aVar9, "TargetedAdvertisingOptOutNotice", dVarK16, 2, 0);
                dVarK17.f8149b = iVar7;
                o3.d dVarK18 = k0.k.k(aVar9, "SaleOptOut", dVarK17, 2, 0);
                dVarK18.f8149b = iVar7;
                aVar9.b("TargetedAdvertisingOptOut", dVarK18);
                o3.d dVar10 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar10.f8149b = iVar9;
                aVar9.b("SensitiveDataProcessing", dVar10);
                o3.d dVar11 = new o3.d(Arrays.asList(0, 0, 0), 2);
                dVar11.f8149b = iVar9;
                aVar9.b("KnownChildSensitiveDataConsents", dVar11);
                o3.d dVar12 = new o3.d(2, (Integer) 1);
                dVar12.f8149b = iVar8;
                o3.d dVarK19 = k0.k.k(aVar9, "MspaCoveredTransaction", dVar12, 2, 0);
                dVarK19.f8149b = iVar7;
                o3.d dVarK20 = k0.k.k(aVar9, "MspaOptOutOptionMode", dVarK19, 2, 0);
                dVarK20.f8149b = iVar7;
                aVar9.b("MspaServiceProviderMode", dVarK20);
                return aVar9;
            case 9:
                r3.a aVar10 = new r3.a();
                List list10 = i.f8872a;
                aVar10.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar10.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar10.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar10;
            case 10:
                o3.i iVar10 = new o3.i(10);
                o3.i iVar11 = new o3.i(11);
                o3.i iVar12 = new o3.i(12);
                r3.a aVar11 = new r3.a();
                List list11 = j.f8874a;
                aVar11.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar13 = new o3.d(2, (Integer) 0);
                dVar13.f8149b = iVar10;
                o3.d dVarK21 = k0.k.k(aVar11, "ProcessingNotice", dVar13, 2, 0);
                dVarK21.f8149b = iVar10;
                o3.d dVarK22 = k0.k.k(aVar11, "SaleOptOutNotice", dVarK21, 2, 0);
                dVarK22.f8149b = iVar10;
                o3.d dVarK23 = k0.k.k(aVar11, "TargetedAdvertisingOptOutNotice", dVarK22, 2, 0);
                dVarK23.f8149b = iVar10;
                o3.d dVarK24 = k0.k.k(aVar11, "SaleOptOut", dVarK23, 2, 0);
                dVarK24.f8149b = iVar10;
                aVar11.b("TargetedAdvertisingOptOut", dVarK24);
                o3.d dVar14 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar14.f8149b = iVar12;
                aVar11.b("SensitiveDataProcessing", dVar14);
                o3.d dVar15 = new o3.d(Arrays.asList(0, 0, 0, 0, 0), 2);
                dVar15.f8149b = iVar12;
                aVar11.b("KnownChildSensitiveDataConsents", dVar15);
                o3.d dVar16 = new o3.d(2, (Integer) 0);
                dVar16.f8149b = iVar10;
                o3.d dVarK25 = k0.k.k(aVar11, "AdditionalDataProcessingConsent", dVar16, 2, 1);
                dVarK25.f8149b = iVar11;
                o3.d dVarK26 = k0.k.k(aVar11, "MspaCoveredTransaction", dVarK25, 2, 0);
                dVarK26.f8149b = iVar10;
                o3.d dVarK27 = k0.k.k(aVar11, "MspaOptOutOptionMode", dVarK26, 2, 0);
                dVarK27.f8149b = iVar10;
                aVar11.b("MspaServiceProviderMode", dVarK27);
                return aVar11;
            case 11:
                r3.a aVar12 = new r3.a();
                List list12 = j.f8874a;
                aVar12.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar12.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar12.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar12;
            case 12:
                o3.i iVar13 = new o3.i(13);
                o3.i iVar14 = new o3.i(14);
                o3.i iVar15 = new o3.i(15);
                r3.a aVar13 = new r3.a();
                List list13 = k.f8876a;
                aVar13.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar17 = new o3.d(2, (Integer) 0);
                dVar17.f8149b = iVar13;
                o3.d dVarK28 = k0.k.k(aVar13, "ProcessingNotice", dVar17, 2, 0);
                dVarK28.f8149b = iVar13;
                o3.d dVarK29 = k0.k.k(aVar13, "SaleOptOutNotice", dVarK28, 2, 0);
                dVarK29.f8149b = iVar13;
                o3.d dVarK30 = k0.k.k(aVar13, "TargetedAdvertisingOptOutNotice", dVarK29, 2, 0);
                dVarK30.f8149b = iVar13;
                o3.d dVarK31 = k0.k.k(aVar13, "SaleOptOut", dVarK30, 2, 0);
                dVarK31.f8149b = iVar13;
                aVar13.b("TargetedAdvertisingOptOut", dVarK31);
                o3.d dVar18 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar18.f8149b = iVar15;
                aVar13.b("SensitiveDataProcessing", dVar18);
                o3.d dVar19 = new o3.d(Arrays.asList(0, 0, 0), 2);
                dVar19.f8149b = iVar15;
                aVar13.b("KnownChildSensitiveDataConsents", dVar19);
                o3.d dVar20 = new o3.d(2, (Integer) 0);
                dVar20.f8149b = iVar13;
                o3.d dVarK32 = k0.k.k(aVar13, "AdditionalDataProcessingConsent", dVar20, 2, 1);
                dVarK32.f8149b = iVar14;
                o3.d dVarK33 = k0.k.k(aVar13, "MspaCoveredTransaction", dVarK32, 2, 0);
                dVarK33.f8149b = iVar13;
                o3.d dVarK34 = k0.k.k(aVar13, "MspaOptOutOptionMode", dVarK33, 2, 0);
                dVarK34.f8149b = iVar13;
                aVar13.b("MspaServiceProviderMode", dVarK34);
                return aVar13;
            case 13:
                o3.i iVar16 = new o3.i(16);
                o3.i iVar17 = new o3.i(17);
                o3.i iVar18 = new o3.i(18);
                r3.a aVar14 = new r3.a();
                List list14 = r3.l.f8877a;
                aVar14.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar21 = new o3.d(2, (Integer) 0);
                dVar21.f8149b = iVar16;
                o3.d dVarK35 = k0.k.k(aVar14, "ProcessingNotice", dVar21, 2, 0);
                dVarK35.f8149b = iVar16;
                o3.d dVarK36 = k0.k.k(aVar14, "SaleOptOutNotice", dVarK35, 2, 0);
                dVarK36.f8149b = iVar16;
                o3.d dVarK37 = k0.k.k(aVar14, "TargetedAdvertisingOptOutNotice", dVarK36, 2, 0);
                dVarK37.f8149b = iVar16;
                o3.d dVarK38 = k0.k.k(aVar14, "SensitiveDataOptOutNotice", dVarK37, 2, 0);
                dVarK38.f8149b = iVar16;
                o3.d dVarK39 = k0.k.k(aVar14, "SaleOptOut", dVarK38, 2, 0);
                dVarK39.f8149b = iVar16;
                aVar14.b("TargetedAdvertisingOptOut", dVarK39);
                o3.d dVar22 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar22.f8149b = iVar18;
                aVar14.b("SensitiveDataProcessing", dVar22);
                o3.d dVar23 = new o3.d(2, (Integer) 0);
                dVar23.f8149b = iVar16;
                o3.d dVarK40 = k0.k.k(aVar14, "KnownChildSensitiveDataConsents", dVar23, 2, 1);
                dVarK40.f8149b = iVar17;
                o3.d dVarK41 = k0.k.k(aVar14, "MspaCoveredTransaction", dVarK40, 2, 0);
                dVarK41.f8149b = iVar16;
                o3.d dVarK42 = k0.k.k(aVar14, "MspaOptOutOptionMode", dVarK41, 2, 0);
                dVarK42.f8149b = iVar16;
                aVar14.b("MspaServiceProviderMode", dVarK42);
                return aVar14;
            case 14:
                r3.a aVar15 = new r3.a();
                List list15 = r3.l.f8877a;
                aVar15.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar15.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar15.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar15;
            case 15:
                o3.i iVar19 = new o3.i(19);
                o3.i iVar20 = new o3.i(20);
                o3.i iVar21 = new o3.i(21);
                r3.a aVar16 = new r3.a();
                List list16 = m.f8879a;
                aVar16.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar24 = new o3.d(2, (Integer) 0);
                dVar24.f8149b = iVar19;
                o3.d dVarK43 = k0.k.k(aVar16, "ProcessingNotice", dVar24, 2, 0);
                dVarK43.f8149b = iVar19;
                o3.d dVarK44 = k0.k.k(aVar16, "SaleOptOutNotice", dVarK43, 2, 0);
                dVarK44.f8149b = iVar19;
                o3.d dVarK45 = k0.k.k(aVar16, "TargetedAdvertisingOptOutNotice", dVarK44, 2, 0);
                dVarK45.f8149b = iVar19;
                o3.d dVarK46 = k0.k.k(aVar16, "SaleOptOut", dVarK45, 2, 0);
                dVarK46.f8149b = iVar19;
                aVar16.b("TargetedAdvertisingOptOut", dVarK46);
                o3.d dVar25 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar25.f8149b = iVar21;
                aVar16.b("SensitiveDataProcessing", dVar25);
                o3.d dVar26 = new o3.d(2, (Integer) 0);
                dVar26.f8149b = iVar19;
                o3.d dVarK47 = k0.k.k(aVar16, "KnownChildSensitiveDataConsents", dVar26, 2, 0);
                dVarK47.f8149b = iVar19;
                o3.d dVarK48 = k0.k.k(aVar16, "AdditionalDataProcessingConsent", dVarK47, 2, 1);
                dVarK48.f8149b = iVar20;
                o3.d dVarK49 = k0.k.k(aVar16, "MspaCoveredTransaction", dVarK48, 2, 0);
                dVarK49.f8149b = iVar19;
                o3.d dVarK50 = k0.k.k(aVar16, "MspaOptOutOptionMode", dVarK49, 2, 0);
                dVarK50.f8149b = iVar19;
                aVar16.b("MspaServiceProviderMode", dVarK50);
                return aVar16;
            case 16:
                r3.a aVar17 = new r3.a();
                List list17 = m.f8879a;
                aVar17.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar17.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar17.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar17;
            case 17:
                o3.i iVar22 = new o3.i(22);
                o3.i iVar23 = new o3.i(23);
                o3.i iVar24 = new o3.i(24);
                r3.a aVar18 = new r3.a();
                List list18 = n.f8881a;
                aVar18.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar27 = new o3.d(2, (Integer) 0);
                dVar27.f8149b = iVar22;
                o3.d dVarK51 = k0.k.k(aVar18, "SharingNotice", dVar27, 2, 0);
                dVarK51.f8149b = iVar22;
                o3.d dVarK52 = k0.k.k(aVar18, "SaleOptOutNotice", dVarK51, 2, 0);
                dVarK52.f8149b = iVar22;
                o3.d dVarK53 = k0.k.k(aVar18, "TargetedAdvertisingOptOutNotice", dVarK52, 2, 0);
                dVarK53.f8149b = iVar22;
                o3.d dVarK54 = k0.k.k(aVar18, "SaleOptOut", dVarK53, 2, 0);
                dVarK54.f8149b = iVar22;
                aVar18.b("TargetedAdvertisingOptOut", dVarK54);
                o3.d dVar28 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar28.f8149b = iVar24;
                aVar18.b("SensitiveDataProcessing", dVar28);
                o3.d dVar29 = new o3.d(Arrays.asList(0, 0, 0), 2);
                dVar29.f8149b = iVar24;
                aVar18.b("KnownChildSensitiveDataConsents", dVar29);
                o3.d dVar30 = new o3.d(2, (Integer) 0);
                dVar30.f8149b = iVar22;
                o3.d dVarK55 = k0.k.k(aVar18, "AdditionalDataProcessingConsent", dVar30, 2, 1);
                dVarK55.f8149b = iVar23;
                o3.d dVarK56 = k0.k.k(aVar18, "MspaCoveredTransaction", dVarK55, 2, 0);
                dVarK56.f8149b = iVar22;
                o3.d dVarK57 = k0.k.k(aVar18, "MspaOptOutOptionMode", dVarK56, 2, 0);
                dVarK57.f8149b = iVar22;
                aVar18.b("MspaServiceProviderMode", dVarK57);
                return aVar18;
            case 18:
                r3.a aVar19 = new r3.a();
                List list19 = n.f8881a;
                aVar19.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar19.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar19.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar19;
            case 19:
                o3.i iVar25 = new o3.i(25);
                o3.i iVar26 = new o3.i(26);
                o3.i iVar27 = new o3.i(27);
                r3.a aVar20 = new r3.a();
                List list20 = r3.o.f8883a;
                aVar20.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar31 = new o3.d(2, (Integer) 0);
                dVar31.f8149b = iVar25;
                o3.d dVarK58 = k0.k.k(aVar20, "SharingNotice", dVar31, 2, 0);
                dVarK58.f8149b = iVar25;
                o3.d dVarK59 = k0.k.k(aVar20, "SaleOptOutNotice", dVarK58, 2, 0);
                dVarK59.f8149b = iVar25;
                o3.d dVarK60 = k0.k.k(aVar20, "SharingOptOutNotice", dVarK59, 2, 0);
                dVarK60.f8149b = iVar25;
                o3.d dVarK61 = k0.k.k(aVar20, "TargetedAdvertisingOptOutNotice", dVarK60, 2, 0);
                dVarK61.f8149b = iVar25;
                o3.d dVarK62 = k0.k.k(aVar20, "SensitiveDataProcessingOptOutNotice", dVarK61, 2, 0);
                dVarK62.f8149b = iVar25;
                o3.d dVarK63 = k0.k.k(aVar20, "SensitiveDataLimitUseNotice", dVarK62, 2, 0);
                dVarK63.f8149b = iVar25;
                o3.d dVarK64 = k0.k.k(aVar20, "SaleOptOut", dVarK63, 2, 0);
                dVarK64.f8149b = iVar25;
                o3.d dVarK65 = k0.k.k(aVar20, "SharingOptOut", dVarK64, 2, 0);
                dVarK65.f8149b = iVar25;
                aVar20.b("TargetedAdvertisingOptOut", dVarK65);
                o3.d dVar32 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar32.f8149b = iVar27;
                aVar20.b("SensitiveDataProcessing", dVar32);
                o3.d dVar33 = new o3.d(Arrays.asList(0, 0, 0), 2);
                dVar33.f8149b = iVar27;
                aVar20.b("KnownChildSensitiveDataConsents", dVar33);
                o3.d dVar34 = new o3.d(2, (Integer) 0);
                dVar34.f8149b = iVar25;
                o3.d dVarK66 = k0.k.k(aVar20, "PersonalDataConsents", dVar34, 2, 1);
                dVarK66.f8149b = iVar26;
                o3.d dVarK67 = k0.k.k(aVar20, "MspaCoveredTransaction", dVarK66, 2, 0);
                dVarK67.f8149b = iVar25;
                o3.d dVarK68 = k0.k.k(aVar20, "MspaOptOutOptionMode", dVarK67, 2, 0);
                dVarK68.f8149b = iVar25;
                aVar20.b("MspaServiceProviderMode", dVarK68);
                return aVar20;
            case 20:
                r3.a aVar21 = new r3.a();
                List list21 = r3.o.f8883a;
                aVar21.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar21.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar21.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar21;
            case 21:
                o3.i iVar28 = new o3.i(28);
                o3.i iVar29 = new o3.i(29);
                e eVar = new e(0);
                r3.a aVar22 = new r3.a();
                List list22 = p.f8885a;
                aVar22.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar35 = new o3.d(2, (Integer) 0);
                dVar35.f8149b = iVar28;
                o3.d dVarK69 = k0.k.k(aVar22, "ProcessingNotice", dVar35, 2, 0);
                dVarK69.f8149b = iVar28;
                o3.d dVarK70 = k0.k.k(aVar22, "SaleOptOutNotice", dVarK69, 2, 0);
                dVarK70.f8149b = iVar28;
                o3.d dVarK71 = k0.k.k(aVar22, "TargetedAdvertisingOptOutNotice", dVarK70, 2, 0);
                dVarK71.f8149b = iVar28;
                o3.d dVarK72 = k0.k.k(aVar22, "SaleOptOut", dVarK71, 2, 0);
                dVarK72.f8149b = iVar28;
                aVar22.b("TargetedAdvertisingOptOut", dVarK72);
                o3.d dVar36 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar36.f8149b = eVar;
                aVar22.b("SensitiveDataProcessing", dVar36);
                o3.d dVar37 = new o3.d(2, (Integer) 0);
                dVar37.f8149b = iVar28;
                o3.d dVarK73 = k0.k.k(aVar22, "KnownChildSensitiveDataConsents", dVar37, 2, 0);
                dVarK73.f8149b = iVar28;
                o3.d dVarK74 = k0.k.k(aVar22, "AdditionalDataProcessingConsent", dVarK73, 2, 1);
                dVarK74.f8149b = iVar29;
                o3.d dVarK75 = k0.k.k(aVar22, "MspaCoveredTransaction", dVarK74, 2, 0);
                dVarK75.f8149b = iVar28;
                o3.d dVarK76 = k0.k.k(aVar22, "MspaOptOutOptionMode", dVarK75, 2, 0);
                dVarK76.f8149b = iVar28;
                aVar22.b("MspaServiceProviderMode", dVarK76);
                return aVar22;
            case 22:
                r3.a aVar23 = new r3.a();
                List list23 = p.f8885a;
                aVar23.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar23.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar23.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar23;
            case 23:
                e eVar2 = new e(1);
                e eVar3 = new e(2);
                e eVar4 = new e(3);
                r3.a aVar24 = new r3.a();
                List list24 = q.f8887a;
                aVar24.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar38 = new o3.d(2, (Integer) 0);
                dVar38.f8149b = eVar2;
                o3.d dVarK77 = k0.k.k(aVar24, "ProcessingNotice", dVar38, 2, 0);
                dVarK77.f8149b = eVar2;
                o3.d dVarK78 = k0.k.k(aVar24, "SaleOptOutNotice", dVarK77, 2, 0);
                dVarK78.f8149b = eVar2;
                o3.d dVarK79 = k0.k.k(aVar24, "TargetedAdvertisingOptOutNotice", dVarK78, 2, 0);
                dVarK79.f8149b = eVar2;
                o3.d dVarK80 = k0.k.k(aVar24, "SaleOptOut", dVarK79, 2, 0);
                dVarK80.f8149b = eVar2;
                aVar24.b("TargetedAdvertisingOptOut", dVarK80);
                o3.d dVar39 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar39.f8149b = eVar4;
                aVar24.b("SensitiveDataProcessing", dVar39);
                o3.d dVar40 = new o3.d(Arrays.asList(0, 0, 0), 2);
                dVar40.f8149b = eVar4;
                aVar24.b("KnownChildSensitiveDataConsents", dVar40);
                o3.d dVar41 = new o3.d(2, (Integer) 0);
                dVar41.f8149b = eVar2;
                o3.d dVarK81 = k0.k.k(aVar24, "AdditionalDataProcessingConsent", dVar41, 2, 1);
                dVarK81.f8149b = eVar3;
                o3.d dVarK82 = k0.k.k(aVar24, "MspaCoveredTransaction", dVarK81, 2, 0);
                dVarK82.f8149b = eVar2;
                o3.d dVarK83 = k0.k.k(aVar24, "MspaOptOutOptionMode", dVarK82, 2, 0);
                dVarK83.f8149b = eVar2;
                aVar24.b("MspaServiceProviderMode", dVarK83);
                return aVar24;
            case 24:
                r3.a aVar25 = new r3.a();
                List list25 = q.f8887a;
                aVar25.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar25.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar25.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar25;
            case 25:
                e eVar5 = new e(4);
                e eVar6 = new e(5);
                e eVar7 = new e(6);
                r3.a aVar26 = new r3.a();
                List list26 = r.f8889a;
                aVar26.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar42 = new o3.d(2, (Integer) 0);
                dVar42.f8149b = eVar5;
                o3.d dVarK84 = k0.k.k(aVar26, "ProcessingNotice", dVar42, 2, 0);
                dVarK84.f8149b = eVar5;
                o3.d dVarK85 = k0.k.k(aVar26, "SaleOptOutNotice", dVarK84, 2, 0);
                dVarK85.f8149b = eVar5;
                o3.d dVarK86 = k0.k.k(aVar26, "TargetedAdvertisingOptOutNotice", dVarK85, 2, 0);
                dVarK86.f8149b = eVar5;
                o3.d dVarK87 = k0.k.k(aVar26, "SaleOptOut", dVarK86, 2, 0);
                dVarK87.f8149b = eVar5;
                aVar26.b("TargetedAdvertisingOptOut", dVarK87);
                o3.d dVar43 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar43.f8149b = eVar7;
                aVar26.b("SensitiveDataProcessing", dVar43);
                o3.d dVar44 = new o3.d(Arrays.asList(0, 0, 0, 0, 0), 2);
                dVar44.f8149b = eVar7;
                aVar26.b("KnownChildSensitiveDataConsents", dVar44);
                o3.d dVar45 = new o3.d(2, (Integer) 0);
                dVar45.f8149b = eVar5;
                o3.d dVarK88 = k0.k.k(aVar26, "AdditionalDataProcessingConsent", dVar45, 2, 1);
                dVarK88.f8149b = eVar6;
                o3.d dVarK89 = k0.k.k(aVar26, "MspaCoveredTransaction", dVarK88, 2, 0);
                dVarK89.f8149b = eVar5;
                o3.d dVarK90 = k0.k.k(aVar26, "MspaOptOutOptionMode", dVarK89, 2, 0);
                dVarK90.f8149b = eVar5;
                aVar26.b("MspaServiceProviderMode", dVarK90);
                return aVar26;
            case 26:
                r3.a aVar27 = new r3.a();
                List list27 = r.f8889a;
                aVar27.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar27.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar27.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar27;
            case 27:
                e eVar8 = new e(7);
                e eVar9 = new e(8);
                e eVar10 = new e(9);
                r3.a aVar28 = new r3.a();
                List list28 = s.f8891a;
                aVar28.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar46 = new o3.d(2, (Integer) 0);
                dVar46.f8149b = eVar8;
                o3.d dVarK91 = k0.k.k(aVar28, "ProcessingNotice", dVar46, 2, 0);
                dVarK91.f8149b = eVar8;
                o3.d dVarK92 = k0.k.k(aVar28, "SaleOptOutNotice", dVarK91, 2, 0);
                dVarK92.f8149b = eVar8;
                o3.d dVarK93 = k0.k.k(aVar28, "TargetedAdvertisingOptOutNotice", dVarK92, 2, 0);
                dVarK93.f8149b = eVar8;
                o3.d dVarK94 = k0.k.k(aVar28, "SaleOptOut", dVarK93, 2, 0);
                dVarK94.f8149b = eVar8;
                aVar28.b("TargetedAdvertisingOptOut", dVarK94);
                o3.d dVar47 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar47.f8149b = eVar10;
                aVar28.b("SensitiveDataProcessing", dVar47);
                o3.d dVar48 = new o3.d(Arrays.asList(0, 0, 0), 2);
                dVar48.f8149b = eVar10;
                aVar28.b("KnownChildSensitiveDataConsents", dVar48);
                o3.d dVar49 = new o3.d(2, (Integer) 0);
                dVar49.f8149b = eVar8;
                o3.d dVarK95 = k0.k.k(aVar28, "AdditionalDataProcessingConsent", dVar49, 2, 1);
                dVarK95.f8149b = eVar9;
                o3.d dVarK96 = k0.k.k(aVar28, "MspaCoveredTransaction", dVarK95, 2, 0);
                dVarK96.f8149b = eVar8;
                o3.d dVarK97 = k0.k.k(aVar28, "MspaOptOutOptionMode", dVarK96, 2, 0);
                dVarK97.f8149b = eVar8;
                aVar28.b("MspaServiceProviderMode", dVarK97);
                return aVar28;
            case 28:
                r3.a aVar29 = new r3.a();
                List list29 = s.f8891a;
                aVar29.b("GpcSegmentType", new o3.d(2, (Integer) 1));
                aVar29.b("GpcSegmentIncluded", new o3.c(Boolean.TRUE));
                aVar29.b("Gpc", new o3.c(Boolean.FALSE));
                return aVar29;
            default:
                e eVar11 = new e(10);
                e eVar12 = new e(11);
                e eVar13 = new e(12);
                r3.a aVar30 = new r3.a();
                List list30 = t.f8893a;
                aVar30.b("Version", new o3.d(6, (Integer) 1));
                o3.d dVar50 = new o3.d(2, (Integer) 0);
                dVar50.f8149b = eVar11;
                o3.d dVarK98 = k0.k.k(aVar30, "ProcessingNotice", dVar50, 2, 0);
                dVarK98.f8149b = eVar11;
                o3.d dVarK99 = k0.k.k(aVar30, "SaleOptOutNotice", dVarK98, 2, 0);
                dVarK99.f8149b = eVar11;
                o3.d dVarK100 = k0.k.k(aVar30, "TargetedAdvertisingOptOutNotice", dVarK99, 2, 0);
                dVarK100.f8149b = eVar11;
                o3.d dVarK101 = k0.k.k(aVar30, "SaleOptOut", dVarK100, 2, 0);
                dVarK101.f8149b = eVar11;
                aVar30.b("TargetedAdvertisingOptOut", dVarK101);
                o3.d dVar51 = new o3.d(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), 2);
                dVar51.f8149b = eVar13;
                aVar30.b("SensitiveDataProcessing", dVar51);
                o3.d dVar52 = new o3.d(2, (Integer) 0);
                dVar52.f8149b = eVar11;
                o3.d dVarK102 = k0.k.k(aVar30, "KnownChildSensitiveDataConsents", dVar52, 2, 0);
                dVarK102.f8149b = eVar11;
                o3.d dVarK103 = k0.k.k(aVar30, "AdditionalDataProcessingConsent", dVarK102, 2, 1);
                dVarK103.f8149b = eVar12;
                o3.d dVarK104 = k0.k.k(aVar30, "MspaCoveredTransaction", dVarK103, 2, 0);
                dVarK104.f8149b = eVar11;
                o3.d dVarK105 = k0.k.k(aVar30, "MspaOptOutOptionMode", dVarK104, 2, 0);
                dVarK105.f8149b = eVar11;
                aVar30.b("MspaServiceProviderMode", dVarK105);
                return aVar30;
        }
    }
}
