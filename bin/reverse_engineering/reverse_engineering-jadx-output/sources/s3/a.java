package s3;

import androidx.lifecycle.l;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m3.c;
import r3.e;
import r3.f;
import r3.g;
import r3.h;
import r3.i;
import r3.j;
import r3.m;
import r3.n;
import r3.o;
import r3.p;
import r3.q;
import r3.r;
import r3.s;
import r3.t;
import r3.u;
import t3.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f9152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9156e;

    public a() {
        this.f9153b = null;
        this.f9154c = false;
        this.f9155d = true;
        this.f9152a = f();
    }

    public final void a(String str) {
        this.f9153b = str;
        this.f9154c = false;
        this.f9155d = false;
    }

    public final ArrayList b(String str) {
        char c9 = 'P';
        int i = 0;
        switch (this.f9156e) {
            case 0:
                ArrayList arrayListF = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit = str.split("\\.");
                    for (int i6 = 0; i6 < arrayListF.size(); i6++) {
                        if (strArrSplit.length > i6) {
                            ((t3.a) arrayListF.get(i6)).a(strArrSplit[i6]);
                        }
                    }
                }
                return arrayListF;
            case 1:
                ArrayList arrayListF2 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit2 = str.split("\\.");
                    int i10 = 0;
                    while (i10 < strArrSplit2.length) {
                        String str2 = strArrSplit2[i10];
                        if (!str2.isEmpty()) {
                            char cCharAt = str2.charAt(i);
                            if (cCharAt >= 'A' && cCharAt <= 'H') {
                                ((t3.a) arrayListF2.get(i)).a(strArrSplit2[i10]);
                            } else if (cCharAt < 'I' || cCharAt > 'P') {
                                if ((cCharAt < 'Y' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'f')) {
                                    throw new q3.a(l.w("Invalid segment '", str2, "'"));
                                }
                                ((t3.a) arrayListF2.get(1)).a(strArrSplit2[i10]);
                            } else {
                                ((t3.a) arrayListF2.get(2)).a(strArrSplit2[i10]);
                            }
                        }
                        i10++;
                        i = 0;
                    }
                }
                return arrayListF2;
            case 2:
                ArrayList arrayListF3 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit3 = str.split("\\.");
                    int i11 = 0;
                    while (i11 < strArrSplit3.length) {
                        String str3 = strArrSplit3[i11];
                        if (!str3.isEmpty()) {
                            char cCharAt2 = str3.charAt(0);
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'H') {
                                ((t3.a) arrayListF3.get(0)).a(strArrSplit3[i11]);
                            } else if (cCharAt2 >= 'I' && cCharAt2 <= c9) {
                                ((t3.a) arrayListF3.get(3)).a(strArrSplit3[i11]);
                            } else if (cCharAt2 >= 'Q' && cCharAt2 <= 'X') {
                                ((t3.a) arrayListF3.get(2)).a(strArrSplit3[i11]);
                            } else {
                                if ((cCharAt2 < 'Y' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'f')) {
                                    throw new q3.a(l.w("Invalid segment '", str3, "'"));
                                }
                                ((t3.a) arrayListF3.get(1)).a(strArrSplit3[i11]);
                            }
                        }
                        i11++;
                        c9 = 'P';
                    }
                }
                return arrayListF3;
            case 3:
                ArrayList arrayListF4 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit4 = str.split("\\.");
                    if (strArrSplit4.length > 0) {
                        ((t3.a) arrayListF4.get(0)).a(strArrSplit4[0]);
                    }
                    if (strArrSplit4.length > 1) {
                        t3.a aVar = (t3.a) arrayListF4.get(1);
                        List list = g.f8868a;
                        aVar.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF4.get(1)).a(strArrSplit4[1]);
                    } else {
                        t3.a aVar2 = (t3.a) arrayListF4.get(1);
                        List list2 = g.f8868a;
                        aVar2.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF4;
            case 4:
                ArrayList arrayListF5 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit5 = str.split("\\.");
                    if (strArrSplit5.length > 0) {
                        ((t3.a) arrayListF5.get(0)).a(strArrSplit5[0]);
                    }
                    if (strArrSplit5.length > 1) {
                        t3.a aVar3 = (t3.a) arrayListF5.get(1);
                        List list3 = h.f8870a;
                        aVar3.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF5.get(1)).a(strArrSplit5[1]);
                    } else {
                        t3.a aVar4 = (t3.a) arrayListF5.get(1);
                        List list4 = h.f8870a;
                        aVar4.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF5;
            case 5:
                ArrayList arrayListF6 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit6 = str.split("\\.");
                    if (strArrSplit6.length > 0) {
                        ((t3.a) arrayListF6.get(0)).a(strArrSplit6[0]);
                    }
                    if (strArrSplit6.length > 1) {
                        t3.a aVar5 = (t3.a) arrayListF6.get(1);
                        List list5 = i.f8872a;
                        aVar5.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF6.get(1)).a(strArrSplit6[1]);
                    } else {
                        t3.a aVar6 = (t3.a) arrayListF6.get(1);
                        List list6 = i.f8872a;
                        aVar6.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF6;
            case 6:
                ArrayList arrayListF7 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit7 = str.split("\\.");
                    if (strArrSplit7.length > 0) {
                        ((t3.a) arrayListF7.get(0)).a(strArrSplit7[0]);
                    }
                    if (strArrSplit7.length > 1) {
                        t3.a aVar7 = (t3.a) arrayListF7.get(1);
                        List list7 = j.f8874a;
                        aVar7.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF7.get(1)).a(strArrSplit7[1]);
                    } else {
                        t3.a aVar8 = (t3.a) arrayListF7.get(1);
                        List list8 = j.f8874a;
                        aVar8.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF7;
            case 7:
                ArrayList arrayListF8 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit8 = str.split("\\.");
                    while (i < arrayListF8.size()) {
                        if (strArrSplit8.length > i) {
                            ((t3.a) arrayListF8.get(i)).a(strArrSplit8[i]);
                        }
                        i++;
                    }
                }
                return arrayListF8;
            case 8:
                ArrayList arrayListF9 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit9 = str.split("\\.");
                    if (strArrSplit9.length > 0) {
                        ((t3.a) arrayListF9.get(0)).a(strArrSplit9[0]);
                    }
                    if (strArrSplit9.length > 1) {
                        t3.a aVar9 = (t3.a) arrayListF9.get(1);
                        List list9 = r3.l.f8877a;
                        aVar9.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF9.get(1)).a(strArrSplit9[1]);
                    } else {
                        t3.a aVar10 = (t3.a) arrayListF9.get(1);
                        List list10 = r3.l.f8877a;
                        aVar10.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF9;
            case 9:
                ArrayList arrayListF10 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit10 = str.split("\\.");
                    if (strArrSplit10.length > 0) {
                        ((t3.a) arrayListF10.get(0)).a(strArrSplit10[0]);
                    }
                    if (strArrSplit10.length > 1) {
                        t3.a aVar11 = (t3.a) arrayListF10.get(1);
                        List list11 = m.f8879a;
                        aVar11.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF10.get(1)).a(strArrSplit10[1]);
                    } else {
                        t3.a aVar12 = (t3.a) arrayListF10.get(1);
                        List list12 = m.f8879a;
                        aVar12.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF10;
            case 10:
                ArrayList arrayListF11 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit11 = str.split("\\.");
                    if (strArrSplit11.length > 0) {
                        ((t3.a) arrayListF11.get(0)).a(strArrSplit11[0]);
                    }
                    if (strArrSplit11.length > 1) {
                        t3.a aVar13 = (t3.a) arrayListF11.get(1);
                        List list13 = n.f8881a;
                        aVar13.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF11.get(1)).a(strArrSplit11[1]);
                    } else {
                        t3.a aVar14 = (t3.a) arrayListF11.get(1);
                        List list14 = n.f8881a;
                        aVar14.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF11;
            case 11:
                ArrayList arrayListF12 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit12 = str.split("\\.");
                    if (strArrSplit12.length > 0) {
                        ((t3.a) arrayListF12.get(0)).a(strArrSplit12[0]);
                    }
                    if (strArrSplit12.length > 1) {
                        t3.a aVar15 = (t3.a) arrayListF12.get(1);
                        List list15 = o.f8883a;
                        aVar15.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF12.get(1)).a(strArrSplit12[1]);
                    } else {
                        t3.a aVar16 = (t3.a) arrayListF12.get(1);
                        List list16 = o.f8883a;
                        aVar16.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF12;
            case 12:
                ArrayList arrayListF13 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit13 = str.split("\\.");
                    if (strArrSplit13.length > 0) {
                        ((t3.a) arrayListF13.get(0)).a(strArrSplit13[0]);
                    }
                    if (strArrSplit13.length > 1) {
                        t3.a aVar17 = (t3.a) arrayListF13.get(1);
                        List list17 = p.f8885a;
                        aVar17.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF13.get(1)).a(strArrSplit13[1]);
                    } else {
                        t3.a aVar18 = (t3.a) arrayListF13.get(1);
                        List list18 = p.f8885a;
                        aVar18.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF13;
            case 13:
                ArrayList arrayListF14 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit14 = str.split("\\.");
                    if (strArrSplit14.length > 0) {
                        ((t3.a) arrayListF14.get(0)).a(strArrSplit14[0]);
                    }
                    if (strArrSplit14.length > 1) {
                        t3.a aVar19 = (t3.a) arrayListF14.get(1);
                        List list19 = q.f8887a;
                        aVar19.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF14.get(1)).a(strArrSplit14[1]);
                    } else {
                        t3.a aVar20 = (t3.a) arrayListF14.get(1);
                        List list20 = q.f8887a;
                        aVar20.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF14;
            case 14:
                ArrayList arrayListF15 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit15 = str.split("\\.");
                    if (strArrSplit15.length > 0) {
                        ((t3.a) arrayListF15.get(0)).a(strArrSplit15[0]);
                    }
                    if (strArrSplit15.length > 1) {
                        t3.a aVar21 = (t3.a) arrayListF15.get(1);
                        List list21 = r.f8889a;
                        aVar21.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF15.get(1)).a(strArrSplit15[1]);
                    } else {
                        t3.a aVar22 = (t3.a) arrayListF15.get(1);
                        List list22 = r.f8889a;
                        aVar22.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF15;
            case 15:
                ArrayList arrayListF16 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit16 = str.split("\\.");
                    if (strArrSplit16.length > 0) {
                        ((t3.a) arrayListF16.get(0)).a(strArrSplit16[0]);
                    }
                    if (strArrSplit16.length > 1) {
                        t3.a aVar23 = (t3.a) arrayListF16.get(1);
                        List list23 = s.f8891a;
                        aVar23.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF16.get(1)).a(strArrSplit16[1]);
                    } else {
                        t3.a aVar24 = (t3.a) arrayListF16.get(1);
                        List list24 = s.f8891a;
                        aVar24.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF16;
            case 16:
                ArrayList arrayListF17 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit17 = str.split("\\.");
                    if (strArrSplit17.length > 0) {
                        ((t3.a) arrayListF17.get(0)).a(strArrSplit17[0]);
                    }
                    if (strArrSplit17.length > 1) {
                        t3.a aVar25 = (t3.a) arrayListF17.get(1);
                        List list25 = t.f8893a;
                        aVar25.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF17.get(1)).a(strArrSplit17[1]);
                    } else {
                        t3.a aVar26 = (t3.a) arrayListF17.get(1);
                        List list26 = t.f8893a;
                        aVar26.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF17;
            case 17:
                ArrayList arrayListF18 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit18 = str.split("\\.");
                    if (strArrSplit18.length > 0) {
                        ((t3.a) arrayListF18.get(0)).a(strArrSplit18[0]);
                    }
                    if (strArrSplit18.length > 1) {
                        t3.a aVar27 = (t3.a) arrayListF18.get(1);
                        List list27 = u.f8895a;
                        aVar27.g("GpcSegmentIncluded", Boolean.TRUE);
                        ((t3.a) arrayListF18.get(1)).a(strArrSplit18[1]);
                    } else {
                        t3.a aVar28 = (t3.a) arrayListF18.get(1);
                        List list28 = u.f8895a;
                        aVar28.g("GpcSegmentIncluded", Boolean.FALSE);
                    }
                }
                return arrayListF18;
            case 18:
                ArrayList arrayListF19 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit19 = str.split("\\.");
                    while (i < arrayListF19.size()) {
                        if (strArrSplit19.length > i) {
                            ((t3.a) arrayListF19.get(i)).a(strArrSplit19[i]);
                        }
                        i++;
                    }
                }
                return arrayListF19;
            case 19:
                ArrayList arrayListF20 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit20 = str.split("\\.");
                    while (i < arrayListF20.size()) {
                        if (strArrSplit20.length > i) {
                            ((t3.a) arrayListF20.get(i)).a(strArrSplit20[i]);
                        }
                        i++;
                    }
                }
                return arrayListF20;
            default:
                ArrayList arrayListF21 = f();
                if (str != null && !str.isEmpty()) {
                    String[] strArrSplit21 = str.split("\\.");
                    while (i < arrayListF21.size()) {
                        if (strArrSplit21.length > i) {
                            ((t3.a) arrayListF21.get(i)).a(strArrSplit21[i]);
                        }
                        i++;
                    }
                }
                return arrayListF21;
        }
    }

    public final String c() {
        String string;
        String str = this.f9153b;
        if (str == null || str.isEmpty() || this.f9154c) {
            List list = this.f9152a;
            switch (this.f9156e) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((t3.a) it.next()).c());
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it2.next());
                            if (it2.hasNext()) {
                                sb.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb.toString();
                    break;
                case 1:
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(((t3.a) list.get(0)).c());
                    arrayList2.add(((t3.a) list.get(1)).c());
                    List list2 = e.f8861a;
                    if (!((List) d("DisclosedVendors")).isEmpty()) {
                        arrayList2.add(((t3.a) list.get(2)).c());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it3 = arrayList2.iterator();
                    if (it3.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it3.next());
                            if (it3.hasNext()) {
                                sb2.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb2.toString();
                    break;
                case 2:
                    ArrayList arrayList3 = new ArrayList();
                    if (list.size() >= 1) {
                        arrayList3.add(((t3.a) list.get(0)).c());
                        List list3 = f.f8864a;
                        if (((Boolean) d("IsServiceSpecific")).booleanValue()) {
                            if (list.size() >= 2) {
                                arrayList3.add(((t3.a) list.get(1)).c());
                            }
                        } else if (list.size() >= 2) {
                            arrayList3.add(((t3.a) list.get(2)).c());
                            if (list.size() >= 3) {
                                arrayList3.add(((t3.a) list.get(3)).c());
                            }
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    Iterator it4 = arrayList3.iterator();
                    if (it4.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it4.next());
                            if (it4.hasNext()) {
                                sb3.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb3.toString();
                    break;
                case 3:
                    ArrayList arrayList4 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList4.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar = (t3.a) list.get(1);
                            List list4 = g.f8868a;
                            if (aVar.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList4.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb4 = new StringBuilder();
                    Iterator it5 = arrayList4.iterator();
                    if (it5.hasNext()) {
                        while (true) {
                            sb4.append((CharSequence) it5.next());
                            if (it5.hasNext()) {
                                sb4.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb4.toString();
                    break;
                case 4:
                    ArrayList arrayList5 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList5.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar2 = (t3.a) list.get(1);
                            List list5 = h.f8870a;
                            if (aVar2.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList5.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb5 = new StringBuilder();
                    Iterator it6 = arrayList5.iterator();
                    if (it6.hasNext()) {
                        while (true) {
                            sb5.append((CharSequence) it6.next());
                            if (it6.hasNext()) {
                                sb5.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb5.toString();
                    break;
                case 5:
                    ArrayList arrayList6 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList6.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar3 = (t3.a) list.get(1);
                            List list6 = i.f8872a;
                            if (aVar3.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList6.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb6 = new StringBuilder();
                    Iterator it7 = arrayList6.iterator();
                    if (it7.hasNext()) {
                        while (true) {
                            sb6.append((CharSequence) it7.next());
                            if (it7.hasNext()) {
                                sb6.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb6.toString();
                    break;
                case 6:
                    ArrayList arrayList7 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList7.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar4 = (t3.a) list.get(1);
                            List list7 = j.f8874a;
                            if (aVar4.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList7.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb7 = new StringBuilder();
                    Iterator it8 = arrayList7.iterator();
                    if (it8.hasNext()) {
                        while (true) {
                            sb7.append((CharSequence) it8.next());
                            if (it8.hasNext()) {
                                sb7.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb7.toString();
                    break;
                case 7:
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList8.add(((t3.a) it9.next()).c());
                    }
                    StringBuilder sb8 = new StringBuilder();
                    Iterator it10 = arrayList8.iterator();
                    if (it10.hasNext()) {
                        while (true) {
                            sb8.append((CharSequence) it10.next());
                            if (it10.hasNext()) {
                                sb8.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb8.toString();
                    break;
                case 8:
                    ArrayList arrayList9 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList9.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar5 = (t3.a) list.get(1);
                            List list8 = r3.l.f8877a;
                            if (aVar5.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList9.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb9 = new StringBuilder();
                    Iterator it11 = arrayList9.iterator();
                    if (it11.hasNext()) {
                        while (true) {
                            sb9.append((CharSequence) it11.next());
                            if (it11.hasNext()) {
                                sb9.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb9.toString();
                    break;
                case 9:
                    ArrayList arrayList10 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList10.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar6 = (t3.a) list.get(1);
                            List list9 = m.f8879a;
                            if (aVar6.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList10.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb10 = new StringBuilder();
                    Iterator it12 = arrayList10.iterator();
                    if (it12.hasNext()) {
                        while (true) {
                            sb10.append((CharSequence) it12.next());
                            if (it12.hasNext()) {
                                sb10.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb10.toString();
                    break;
                case 10:
                    ArrayList arrayList11 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList11.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar7 = (t3.a) list.get(1);
                            List list10 = n.f8881a;
                            if (aVar7.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList11.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb11 = new StringBuilder();
                    Iterator it13 = arrayList11.iterator();
                    if (it13.hasNext()) {
                        while (true) {
                            sb11.append((CharSequence) it13.next());
                            if (it13.hasNext()) {
                                sb11.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb11.toString();
                    break;
                case 11:
                    ArrayList arrayList12 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList12.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar8 = (t3.a) list.get(1);
                            List list11 = o.f8883a;
                            if (aVar8.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList12.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb12 = new StringBuilder();
                    Iterator it14 = arrayList12.iterator();
                    if (it14.hasNext()) {
                        while (true) {
                            sb12.append((CharSequence) it14.next());
                            if (it14.hasNext()) {
                                sb12.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb12.toString();
                    break;
                case 12:
                    ArrayList arrayList13 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList13.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar9 = (t3.a) list.get(1);
                            List list12 = p.f8885a;
                            if (aVar9.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList13.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb13 = new StringBuilder();
                    Iterator it15 = arrayList13.iterator();
                    if (it15.hasNext()) {
                        while (true) {
                            sb13.append((CharSequence) it15.next());
                            if (it15.hasNext()) {
                                sb13.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb13.toString();
                    break;
                case 13:
                    ArrayList arrayList14 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList14.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar10 = (t3.a) list.get(1);
                            List list13 = q.f8887a;
                            if (aVar10.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList14.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb14 = new StringBuilder();
                    Iterator it16 = arrayList14.iterator();
                    if (it16.hasNext()) {
                        while (true) {
                            sb14.append((CharSequence) it16.next());
                            if (it16.hasNext()) {
                                sb14.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb14.toString();
                    break;
                case 14:
                    ArrayList arrayList15 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList15.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar11 = (t3.a) list.get(1);
                            List list14 = r.f8889a;
                            if (aVar11.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList15.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb15 = new StringBuilder();
                    Iterator it17 = arrayList15.iterator();
                    if (it17.hasNext()) {
                        while (true) {
                            sb15.append((CharSequence) it17.next());
                            if (it17.hasNext()) {
                                sb15.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb15.toString();
                    break;
                case 15:
                    ArrayList arrayList16 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList16.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar12 = (t3.a) list.get(1);
                            List list15 = s.f8891a;
                            if (aVar12.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList16.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb16 = new StringBuilder();
                    Iterator it18 = arrayList16.iterator();
                    if (it18.hasNext()) {
                        while (true) {
                            sb16.append((CharSequence) it18.next());
                            if (it18.hasNext()) {
                                sb16.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb16.toString();
                    break;
                case 16:
                    ArrayList arrayList17 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList17.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar13 = (t3.a) list.get(1);
                            List list16 = t.f8893a;
                            if (aVar13.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList17.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb17 = new StringBuilder();
                    Iterator it19 = arrayList17.iterator();
                    if (it19.hasNext()) {
                        while (true) {
                            sb17.append((CharSequence) it19.next());
                            if (it19.hasNext()) {
                                sb17.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb17.toString();
                    break;
                case 17:
                    ArrayList arrayList18 = new ArrayList();
                    if (!list.isEmpty()) {
                        arrayList18.add(((t3.a) list.get(0)).c());
                        if (list.size() >= 2) {
                            t3.a aVar14 = (t3.a) list.get(1);
                            List list17 = u.f8895a;
                            if (aVar14.e("GpcSegmentIncluded").equals(Boolean.TRUE)) {
                                arrayList18.add(((t3.a) list.get(1)).c());
                            }
                        }
                    }
                    StringBuilder sb18 = new StringBuilder();
                    Iterator it20 = arrayList18.iterator();
                    if (it20.hasNext()) {
                        while (true) {
                            sb18.append((CharSequence) it20.next());
                            if (it20.hasNext()) {
                                sb18.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb18.toString();
                    break;
                case 18:
                    ArrayList arrayList19 = new ArrayList();
                    Iterator it21 = list.iterator();
                    while (it21.hasNext()) {
                        arrayList19.add(((t3.a) it21.next()).c());
                    }
                    StringBuilder sb19 = new StringBuilder();
                    Iterator it22 = arrayList19.iterator();
                    if (it22.hasNext()) {
                        while (true) {
                            sb19.append((CharSequence) it22.next());
                            if (it22.hasNext()) {
                                sb19.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb19.toString();
                    break;
                case 19:
                    ArrayList arrayList20 = new ArrayList();
                    Iterator it23 = list.iterator();
                    while (it23.hasNext()) {
                        arrayList20.add(((t3.a) it23.next()).c());
                    }
                    StringBuilder sb20 = new StringBuilder();
                    Iterator it24 = arrayList20.iterator();
                    if (it24.hasNext()) {
                        while (true) {
                            sb20.append((CharSequence) it24.next());
                            if (it24.hasNext()) {
                                sb20.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb20.toString();
                    break;
                default:
                    ArrayList arrayList21 = new ArrayList();
                    Iterator it25 = list.iterator();
                    while (it25.hasNext()) {
                        arrayList21.add(((t3.a) it25.next()).c());
                    }
                    StringBuilder sb21 = new StringBuilder();
                    Iterator it26 = arrayList21.iterator();
                    if (it26.hasNext()) {
                        while (true) {
                            sb21.append((CharSequence) it26.next());
                            if (it26.hasNext()) {
                                sb21.append((CharSequence) ".");
                            }
                        }
                    }
                    string = sb21.toString();
                    break;
            }
            this.f9153b = string;
            this.f9154c = false;
            this.f9155d = true;
        }
        return this.f9153b;
    }

    public final Object d(String str) {
        if (!this.f9155d) {
            this.f9152a = b(this.f9153b);
            this.f9154c = false;
            this.f9155d = true;
        }
        for (t3.a aVar : this.f9152a) {
            if (aVar.f9557a.a(str)) {
                return aVar.e(str);
            }
        }
        throw new q3.b(l.w("Invalid field: '", str, "'"));
    }

    public final int e() {
        switch (this.f9156e) {
            case 0:
                return 3;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                return 8;
            case 4:
                return 10;
            case 5:
                return 12;
            case 6:
                return 17;
            case 7:
                return 13;
            case 8:
                return 18;
            case 9:
                return 23;
            case 10:
                return 14;
            case 11:
                return 7;
            case 12:
                return 19;
            case 13:
                return 20;
            case 14:
                return 21;
            case 15:
                return 15;
            case 16:
                return 22;
            case 17:
                return 16;
            case 18:
                return 11;
            case 19:
                return 9;
            default:
                return 6;
        }
    }

    public final ArrayList f() {
        switch (this.f9156e) {
            case 0:
                ArrayList arrayList = new ArrayList();
                t3.b bVar = new t3.b(0);
                bVar.f = c.f7275d;
                bVar.g = n3.a.f7936a;
                arrayList.add(bVar);
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                t3.b bVar2 = new t3.b(1);
                c cVar = c.f7275d;
                bVar2.f = cVar;
                n3.a aVar = n3.a.f7936a;
                bVar2.g = aVar;
                arrayList2.add(bVar2);
                t3.b bVar3 = new t3.b(3);
                bVar3.f = cVar;
                bVar3.g = aVar;
                arrayList2.add(bVar3);
                t3.b bVar4 = new t3.b(2);
                bVar4.f = cVar;
                bVar4.g = aVar;
                arrayList2.add(bVar4);
                return arrayList2;
            case 2:
                ArrayList arrayList3 = new ArrayList();
                d dVar = new d(0);
                m3.d dVar2 = m3.d.f7276d;
                dVar.f = dVar2;
                n3.a aVar2 = n3.a.f7936a;
                dVar.g = aVar2;
                arrayList3.add(dVar);
                d dVar3 = new d(1);
                dVar3.f = dVar2;
                dVar3.g = aVar2;
                arrayList3.add(dVar3);
                d dVar4 = new d(2);
                dVar4.f = dVar2;
                dVar4.g = aVar2;
                arrayList3.add(dVar4);
                d dVar5 = new d(3);
                dVar5.f = dVar2;
                dVar5.g = aVar2;
                arrayList3.add(dVar5);
                return arrayList3;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                t3.b bVar5 = new t3.b(4);
                c cVar2 = c.f7275d;
                bVar5.f = cVar2;
                n3.a aVar3 = n3.a.f7936a;
                bVar5.g = aVar3;
                arrayList4.add(bVar5);
                t3.b bVar6 = new t3.b(5);
                bVar6.f = cVar2;
                bVar6.g = aVar3;
                arrayList4.add(bVar6);
                return arrayList4;
            case 4:
                ArrayList arrayList5 = new ArrayList();
                t3.b bVar7 = new t3.b(6);
                c cVar3 = c.f7275d;
                bVar7.f = cVar3;
                n3.a aVar4 = n3.a.f7936a;
                bVar7.g = aVar4;
                arrayList5.add(bVar7);
                t3.b bVar8 = new t3.b(7);
                bVar8.f = cVar3;
                bVar8.g = aVar4;
                arrayList5.add(bVar8);
                return arrayList5;
            case 5:
                ArrayList arrayList6 = new ArrayList();
                t3.b bVar9 = new t3.b(8);
                c cVar4 = c.f7275d;
                bVar9.f = cVar4;
                n3.a aVar5 = n3.a.f7936a;
                bVar9.g = aVar5;
                arrayList6.add(bVar9);
                t3.b bVar10 = new t3.b(9);
                bVar10.f = cVar4;
                bVar10.g = aVar5;
                arrayList6.add(bVar10);
                return arrayList6;
            case 6:
                ArrayList arrayList7 = new ArrayList();
                t3.b bVar11 = new t3.b(10);
                c cVar5 = c.f7275d;
                bVar11.f = cVar5;
                n3.a aVar6 = n3.a.f7936a;
                bVar11.g = aVar6;
                arrayList7.add(bVar11);
                t3.b bVar12 = new t3.b(11);
                bVar12.f = cVar5;
                bVar12.g = aVar6;
                arrayList7.add(bVar12);
                return arrayList7;
            case 7:
                ArrayList arrayList8 = new ArrayList();
                t3.b bVar13 = new t3.b(12);
                bVar13.f = c.f7275d;
                bVar13.g = n3.a.f7936a;
                arrayList8.add(bVar13);
                return arrayList8;
            case 8:
                ArrayList arrayList9 = new ArrayList();
                t3.b bVar14 = new t3.b(13);
                c cVar6 = c.f7275d;
                bVar14.f = cVar6;
                n3.a aVar7 = n3.a.f7936a;
                bVar14.g = aVar7;
                arrayList9.add(bVar14);
                t3.b bVar15 = new t3.b(14);
                bVar15.f = cVar6;
                bVar15.g = aVar7;
                arrayList9.add(bVar15);
                return arrayList9;
            case 9:
                ArrayList arrayList10 = new ArrayList();
                t3.b bVar16 = new t3.b(15);
                c cVar7 = c.f7275d;
                bVar16.f = cVar7;
                n3.a aVar8 = n3.a.f7936a;
                bVar16.g = aVar8;
                arrayList10.add(bVar16);
                t3.b bVar17 = new t3.b(16);
                bVar17.f = cVar7;
                bVar17.g = aVar8;
                arrayList10.add(bVar17);
                return arrayList10;
            case 10:
                ArrayList arrayList11 = new ArrayList();
                t3.b bVar18 = new t3.b(17);
                c cVar8 = c.f7275d;
                bVar18.f = cVar8;
                n3.a aVar9 = n3.a.f7936a;
                bVar18.g = aVar9;
                arrayList11.add(bVar18);
                t3.b bVar19 = new t3.b(18);
                bVar19.f = cVar8;
                bVar19.g = aVar9;
                arrayList11.add(bVar19);
                return arrayList11;
            case 11:
                ArrayList arrayList12 = new ArrayList();
                t3.b bVar20 = new t3.b(19);
                c cVar9 = c.f7275d;
                bVar20.f = cVar9;
                n3.a aVar10 = n3.a.f7936a;
                bVar20.g = aVar10;
                arrayList12.add(bVar20);
                t3.b bVar21 = new t3.b(20);
                bVar21.f = cVar9;
                bVar21.g = aVar10;
                arrayList12.add(bVar21);
                return arrayList12;
            case 12:
                ArrayList arrayList13 = new ArrayList();
                t3.b bVar22 = new t3.b(21);
                c cVar10 = c.f7275d;
                bVar22.f = cVar10;
                n3.a aVar11 = n3.a.f7936a;
                bVar22.g = aVar11;
                arrayList13.add(bVar22);
                t3.b bVar23 = new t3.b(22);
                bVar23.f = cVar10;
                bVar23.g = aVar11;
                arrayList13.add(bVar23);
                return arrayList13;
            case 13:
                ArrayList arrayList14 = new ArrayList();
                t3.b bVar24 = new t3.b(23);
                c cVar11 = c.f7275d;
                bVar24.f = cVar11;
                n3.a aVar12 = n3.a.f7936a;
                bVar24.g = aVar12;
                arrayList14.add(bVar24);
                t3.b bVar25 = new t3.b(24);
                bVar25.f = cVar11;
                bVar25.g = aVar12;
                arrayList14.add(bVar25);
                return arrayList14;
            case 14:
                ArrayList arrayList15 = new ArrayList();
                t3.b bVar26 = new t3.b(25);
                c cVar12 = c.f7275d;
                bVar26.f = cVar12;
                n3.a aVar13 = n3.a.f7936a;
                bVar26.g = aVar13;
                arrayList15.add(bVar26);
                t3.b bVar27 = new t3.b(26);
                bVar27.f = cVar12;
                bVar27.g = aVar13;
                arrayList15.add(bVar27);
                return arrayList15;
            case 15:
                ArrayList arrayList16 = new ArrayList();
                t3.b bVar28 = new t3.b(27);
                c cVar13 = c.f7275d;
                bVar28.f = cVar13;
                n3.a aVar14 = n3.a.f7936a;
                bVar28.g = aVar14;
                arrayList16.add(bVar28);
                t3.b bVar29 = new t3.b(28);
                bVar29.f = cVar13;
                bVar29.g = aVar14;
                arrayList16.add(bVar29);
                return arrayList16;
            case 16:
                ArrayList arrayList17 = new ArrayList();
                t3.b bVar30 = new t3.b(29);
                c cVar14 = c.f7275d;
                bVar30.f = cVar14;
                n3.a aVar15 = n3.a.f7936a;
                bVar30.g = aVar15;
                arrayList17.add(bVar30);
                t3.f fVar = new t3.f(0);
                fVar.f = cVar14;
                fVar.g = aVar15;
                arrayList17.add(fVar);
                return arrayList17;
            case 17:
                ArrayList arrayList18 = new ArrayList();
                t3.f fVar2 = new t3.f(1);
                c cVar15 = c.f7275d;
                fVar2.f = cVar15;
                n3.a aVar16 = n3.a.f7936a;
                fVar2.g = aVar16;
                arrayList18.add(fVar2);
                t3.f fVar3 = new t3.f(2);
                fVar3.f = cVar15;
                fVar3.g = aVar16;
                arrayList18.add(fVar3);
                return arrayList18;
            case 18:
                ArrayList arrayList19 = new ArrayList();
                t3.f fVar4 = new t3.f(3);
                fVar4.f = c.f7275d;
                fVar4.g = n3.a.f7936a;
                arrayList19.add(fVar4);
                return arrayList19;
            case 19:
                ArrayList arrayList20 = new ArrayList();
                t3.f fVar5 = new t3.f(4);
                fVar5.f = c.f7275d;
                fVar5.g = n3.a.f7936a;
                arrayList20.add(fVar5);
                return arrayList20;
            default:
                ArrayList arrayList21 = new ArrayList();
                arrayList21.add(new t3.g());
                return arrayList21;
        }
    }

    public void g(String str, Object obj) {
        switch (this.f9156e) {
            case 1:
                h(obj, str);
                List list = e.f8861a;
                if (!str.equals("Created") && !str.equals("LastUpdated")) {
                    ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("UTC"));
                    h(zonedDateTimeNow, "Created");
                    h(zonedDateTimeNow, "LastUpdated");
                    break;
                }
                break;
            case 2:
                h(obj, str);
                List list2 = f.f8864a;
                if (!str.equals("Created") && !str.equals("LastUpdated")) {
                    ZonedDateTime zonedDateTimeNow2 = ZonedDateTime.now(ZoneId.of("UTC"));
                    h(zonedDateTimeNow2, "Created");
                    h(zonedDateTimeNow2, "LastUpdated");
                    break;
                }
                break;
            default:
                h(obj, str);
                break;
        }
    }

    public final void h(Object obj, String str) {
        if (!this.f9155d) {
            this.f9152a = b(this.f9153b);
            this.f9154c = false;
            this.f9155d = true;
        }
        for (t3.a aVar : this.f9152a) {
            if (aVar.f9557a.a(str)) {
                aVar.g(str, obj);
                this.f9154c = true;
                return;
            }
        }
        throw new q3.b(l.w("Invalid field: '", str, "'"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        this();
        this.f9156e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this();
        this.f9156e = 2;
        a(str);
    }
}
