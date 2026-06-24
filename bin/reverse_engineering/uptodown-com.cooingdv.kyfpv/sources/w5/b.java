package w5;

import b2.t1;
import com.google.android.gms.internal.measurement.z3;
import d7.p;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import u5.g;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f10915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(x xVar, int i) {
        super(2);
        this.f10914a = i;
        this.f10915b = xVar;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f10914a;
        p6.x xVar = p6.x.f8464a;
        x xVar2 = this.f10915b;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (iIntValue > 0 && iIntValue <= l7.m.u0((CharSequence) xVar2.f7025a) + 1) {
                    StringBuilder sb = new StringBuilder((String) xVar2.f7025a);
                    sb.setCharAt(iIntValue - 1, zBooleanValue ? '1' : '0');
                    xVar2.f7025a = sb.toString();
                }
                break;
            default:
                String str = (String) obj;
                Set set = (Set) obj2;
                str.getClass();
                set.getClass();
                g gVarB = z3.b(str);
                String str2 = (String) xVar2.f7025a;
                Integer numValueOf = Integer.valueOf(gVarB.f10717a);
                Object obj3 = c.f10916a;
                ?? r52 = c.f10917b;
                Integer num = (Integer) r52.get(d.f10925p);
                String strG = l.g(t1.c(numValueOf, num == null ? 0 : num.intValue()), str2);
                xVar2.f7025a = strG;
                Integer numValueOf2 = Integer.valueOf(gVarB.f10718b.f10727a);
                Integer num2 = (Integer) r52.get(d.f10926q);
                xVar2.f7025a = l.g(t1.c(numValueOf2, num2 == null ? 0 : num2.intValue()), strG);
                List listB0 = q6.l.B0(set);
                int size = listB0.size();
                String strG2 = "";
                int i6 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i6 < size) {
                    int i12 = i6 + 1;
                    int iIntValue2 = ((Number) listB0.get(i6)).intValue();
                    if (i11 == 0) {
                        i10++;
                        i11 = iIntValue2;
                    }
                    if (i6 == listB0.size() - 1 || ((Number) listB0.get(i12)).intValue() > iIntValue2 + 1) {
                        boolean z9 = iIntValue2 != i11;
                        String strG3 = l.g(z9 ? "1" : "0", strG2);
                        Integer numValueOf3 = Integer.valueOf(i11);
                        Object obj4 = c.f10916a;
                        ?? r10 = c.f10917b;
                        d dVar = d.f10929t;
                        Integer num3 = (Integer) r10.get(dVar);
                        strG2 = l.g(t1.c(numValueOf3, num3 == null ? 0 : num3.intValue()), strG3);
                        if (z9) {
                            Integer numValueOf4 = Integer.valueOf(iIntValue2);
                            Integer num4 = (Integer) r10.get(dVar);
                            strG2 = l.g(t1.c(numValueOf4, num4 == null ? 0 : num4.intValue()), strG2);
                        }
                        i11 = 0;
                    }
                    i6 = i12;
                }
                String str3 = (String) xVar2.f7025a;
                Integer numValueOf5 = Integer.valueOf(i10);
                Object obj5 = c.f10916a;
                Integer num5 = (Integer) c.f10917b.get(d.f10923n);
                String strG4 = l.g(t1.c(numValueOf5, num5 != null ? num5.intValue() : 0), str3);
                xVar2.f7025a = strG4;
                xVar2.f7025a = l.g(strG2, strG4);
                break;
        }
        return xVar;
    }
}
