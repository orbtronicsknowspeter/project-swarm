package o3;

import com.google.android.gms.internal.measurement.i5;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;
import p3.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, int i) {
        super(false);
        this.f8152d = i;
        switch (i) {
            case 5:
                super(true);
                setValue(arrayList);
                break;
            default:
                setValue(arrayList);
                break;
        }
    }

    @Override // o3.a
    public final void a(String str) {
        switch (this.f8152d) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = 12;
                    int iA = p3.e.a(str.substring(0, 12));
                    for (int i = 0; i < iA; i++) {
                        int i6 = length + 6;
                        int iA2 = p3.e.a(str.substring(length, i6));
                        int i10 = length + 8;
                        int iA3 = p3.e.a(str.substring(i6, i10));
                        int i11 = length + 20;
                        try {
                            int iA4 = p3.e.a(str.substring(i10, i11));
                            for (int i12 = 0; i12 < iA4; i12++) {
                                i11 = str.charAt(i11) == '1' ? i11 + 33 : i11 + 17;
                            }
                            String strSubstring = str.substring(i10, i11);
                            ArrayList arrayListA = p3.g.a(strSubstring);
                            length = strSubstring.length() + i10;
                            arrayList.add(new f(arrayListA, iA2, iA3));
                        } catch (Exception e10) {
                            throw new g(e10);
                        }
                    }
                    this.f8151c = arrayList;
                    return;
                } catch (Exception e11) {
                    throw new q3.a(e11);
                }
            case 1:
                try {
                    this.f8151c = Boolean.valueOf(i5.k(str));
                    return;
                } catch (Exception e12) {
                    throw new q3.a(e12);
                }
            case 2:
                try {
                    this.f8151c = p3.a.a(str);
                    return;
                } catch (Exception e13) {
                    throw new q3.a(e13);
                }
            case 3:
                try {
                    this.f8151c = p3.c.a(str);
                    return;
                } catch (Exception e14) {
                    throw new q3.a(e14);
                }
            case 4:
                try {
                    this.f8151c = p3.i.a(str);
                    return;
                } catch (Exception e15) {
                    throw new q3.a(e15);
                }
            default:
                try {
                    this.f8151c = j.a(str);
                    return;
                } catch (Exception e16) {
                    throw new q3.a(e16);
                }
        }
    }

    @Override // o3.a
    public final String b() {
        switch (this.f8152d) {
            case 0:
                try {
                    List<f> list = (List) this.f8151c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(p3.e.b(list.size(), 12));
                    for (f fVar : list) {
                        sb.append(p3.e.b(fVar.f8156a, 6));
                        sb.append(p3.e.b(fVar.f8157b, 2));
                        sb.append(p3.g.b(fVar.f8158c));
                    }
                    return sb.toString();
                } catch (Exception e10) {
                    throw new a1.b(e10);
                }
            case 1:
                try {
                    return i5.p((Boolean) this.f8151c);
                } catch (Exception e11) {
                    throw new a1.b(e11);
                }
            case 2:
                try {
                    ZonedDateTime zonedDateTime = (ZonedDateTime) this.f8151c;
                    Pattern pattern = p3.a.f8420a;
                    return zonedDateTime != null ? p3.h.a(zonedDateTime.toInstant().toEpochMilli() / 100) : p3.h.a(0L);
                } catch (Exception e12) {
                    throw new a1.b(e12);
                }
            case 3:
                try {
                    return p3.c.b((List) this.f8151c);
                } catch (Exception e13) {
                    throw new a1.b(e13);
                }
            case 4:
                try {
                    return p3.i.b((String) this.f8151c);
                } catch (Exception e14) {
                    throw new a1.b(e14);
                }
            default:
                try {
                    return j.b((List) this.f8151c);
                } catch (Exception e15) {
                    throw new a1.b(e15);
                }
        }
    }

    @Override // o3.a
    public final String c(int i, String str) throws g {
        switch (this.f8152d) {
            case 0:
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.substring(i, i + 12));
                    int iA = p3.e.a(sb.toString());
                    int length = i + sb.length();
                    for (int i6 = 0; i6 < iA; i6++) {
                        String strSubstring = str.substring(length, length + 6);
                        int length2 = length + strSubstring.length();
                        sb.append(strSubstring);
                        String strSubstring2 = str.substring(length2, length2 + 2);
                        int length3 = length2 + strSubstring2.length();
                        sb.append(strSubstring2);
                        int i10 = length3 + 12;
                        try {
                            int iA2 = p3.e.a(str.substring(length3, i10));
                            for (int i11 = 0; i11 < iA2; i11++) {
                                i10 = str.charAt(i10) == '1' ? i10 + 33 : i10 + 17;
                            }
                            String strSubstring3 = str.substring(length3, i10);
                            length = length3 + strSubstring3.length();
                            sb.append(strSubstring3);
                        } catch (Exception e10) {
                            throw new g(e10);
                        }
                    }
                    return sb.toString();
                } catch (Exception e11) {
                    throw new g(e11);
                }
            case 1:
                try {
                    return str.substring(i, i + 1);
                } catch (Exception e12) {
                    throw new g(e12);
                }
            case 2:
                try {
                    return str.substring(i, i + 36);
                } catch (Exception e13) {
                    throw new g(e13);
                }
            case 3:
                int iIndexOf = i + 12;
                try {
                    int iA3 = p3.e.a(str.substring(i, iIndexOf));
                    for (int i12 = 0; i12 < iA3; i12++) {
                        iIndexOf = (str.charAt(iIndexOf) == '1' ? str.indexOf("11", str.indexOf("11", iIndexOf + 1) + 2) : str.indexOf("11", iIndexOf + 1)) + 2;
                    }
                    return str.substring(i, iIndexOf);
                } catch (Exception e14) {
                    throw new g(e14);
                }
            case 4:
                try {
                    return str.substring(i, 12 + i);
                } catch (Exception e15) {
                    throw new g(e15);
                }
            default:
                int i13 = i + 16;
                try {
                    int iA4 = p3.e.a(str.substring(i, i13));
                    if (str.charAt(i13) != '1') {
                        return str.substring(i, i + 17 + iA4);
                    }
                    int i14 = i + 17;
                    String strSubstring4 = str.substring(i, i14);
                    int i15 = i + 29;
                    try {
                        int iA5 = p3.e.a(str.substring(i14, i15));
                        for (int i16 = 0; i16 < iA5; i16++) {
                            i15 = str.charAt(i15) == '1' ? i15 + 33 : i15 + 17;
                        }
                        return strSubstring4.concat(str.substring(i14, i15));
                    } catch (Exception e16) {
                        throw new g(e16);
                    }
                } catch (Exception e17) {
                    throw new g(e17);
                }
        }
    }

    @Override // o3.a, o3.b
    public Object getValue() {
        switch (this.f8152d) {
            case 3:
                return new ArrayList((Collection) this.f8151c);
            case 4:
            default:
                return super.getValue();
            case 5:
                return new ArrayList((Collection) this.f8151c);
        }
    }

    @Override // o3.a, o3.b
    public void setValue(Object obj) {
        switch (this.f8152d) {
            case 3:
                super.setValue(new ArrayList(new TreeSet((List) obj)));
                break;
            case 4:
            default:
                super.setValue(obj);
                break;
            case 5:
                super.setValue(new ArrayList(new TreeSet((List) obj)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Boolean bool) {
        super(true);
        this.f8152d = 1;
        setValue(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ZonedDateTime zonedDateTime) {
        super(true);
        this.f8152d = 2;
        setValue(zonedDateTime);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(true);
        this.f8152d = 4;
        setValue(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z9) {
        super(z9);
        this.f8152d = 3;
    }
}
