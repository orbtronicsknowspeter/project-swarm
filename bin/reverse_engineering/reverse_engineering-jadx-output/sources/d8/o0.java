package d8;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b8.e[] f3683a = new b8.e[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z7.b[] f3684b = new z7.b[0];

    public static final y a(String str, z7.b bVar) {
        return new y(str, new z(bVar));
    }

    public static final Set b(b8.e eVar) {
        eVar.getClass();
        if (eVar instanceof k) {
            return ((k) eVar).b();
        }
        HashSet hashSet = new HashSet(eVar.e());
        int iE = eVar.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(eVar.f(i));
        }
        return hashSet;
    }

    public static final b8.e[] c(List list) {
        b8.e[] eVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (b8.e[]) list.toArray(new b8.e[0])) == null) ? f3683a : eVarArr;
    }

    public static final int d(b8.e eVar, b8.e[] eVarArr) {
        eVarArr.getClass();
        int iHashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int iE = eVar.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i6 = iE - 1;
            int i10 = i * 31;
            String strA = eVar.h(eVar.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i10 + iHashCode2;
            iE = i6;
        }
        int iE2 = eVar.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i11 = iE2 - 1;
            int i12 = iHashCode3 * 31;
            z3 kind = eVar.h(eVar.e() - iE2).getKind();
            iHashCode3 = i12 + (kind != null ? kind.hashCode() : 0);
            iE2 = i11;
        }
    }

    public static final void e(b8.e eVar, int i, int i6) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i10 = (~i) & i6;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(eVar.f(i11));
            }
            i10 >>>= 1;
        }
        throw new z7.c(eVar.a(), arrayList);
    }

    public static final void f(String str, j7.c cVar) {
        String string;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        kotlin.jvm.internal.f fVar = (kotlin.jvm.internal.f) cVar;
        sb.append(fVar.c());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + string2 + '.';
        } else {
            StringBuilder sb2 = new StringBuilder("Serializer for subclass '");
            sb2.append(str);
            sb2.append("' is not found ");
            sb2.append(string2);
            sb2.append(".\nCheck if class with serial name '");
            a4.x.B(sb2, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb2.append(fVar.c());
            sb2.append("' has to be sealed and '@Serializable'.");
            string = sb2.toString();
        }
        throw new z7.g(string);
    }
}
