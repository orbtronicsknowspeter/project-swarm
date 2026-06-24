package l1;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.gms.internal.measurement.z3;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends a implements Set {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f7060l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient d f7061b;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return BasicMeasure.EXACTLY;
        }
        com.google.gson.internal.a.p("collection too large");
        return 0;
    }

    public static g k(int i, Object... objArr) {
        if (i == 0) {
            return o.f7081s;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new p(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i6 = iH - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i12);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iS = z3.S(iHashCode);
            while (true) {
                int i13 = iS & i6;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iS++;
            }
        }
        Arrays.fill(objArr, i11, i, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p(obj4);
        }
        if (h(i11) < iH / 2) {
            return k(i11, objArr);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new o(i10, i6, i11, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof o) && (((g) obj) instanceof o) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public d g() {
        d dVar = this.f7061b;
        if (dVar != null) {
            return dVar;
        }
        d dVarL = l();
        this.f7061b = dVarL;
        return dVarL;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public d l() {
        Object[] array = toArray(a.f7046a);
        b bVar = d.f7053b;
        return d.g(array.length, array);
    }
}
