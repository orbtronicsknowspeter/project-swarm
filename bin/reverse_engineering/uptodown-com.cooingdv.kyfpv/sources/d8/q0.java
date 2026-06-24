package d8;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class q0 implements b8.e, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f3696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3698d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f3699e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3700k;

    public q0(String str, x xVar, int i) {
        this.f3695a = str;
        this.f3696b = xVar;
        this.f3697c = i;
        String[] strArr = new String[i];
        for (int i6 = 0; i6 < i; i6++) {
            strArr[i6] = "[UNINITIALIZED]";
        }
        this.f3699e = strArr;
        int i10 = this.f3697c;
        this.f = new List[i10];
        this.g = new boolean[i10];
        this.h = q6.u.f8726a;
        final int i11 = 0;
        d7.a aVar = new d7.a(this) { // from class: d8.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f3691b;

            {
                this.f3691b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p6.f] */
            @Override // d7.a
            public final Object invoke() {
                z7.b[] bVarArrChildSerializers;
                ArrayList arrayList;
                z7.b[] bVarArrTypeParametersSerializers;
                switch (i11) {
                    case 0:
                        x xVar2 = this.f3691b.f3696b;
                        return (xVar2 == null || (bVarArrChildSerializers = xVar2.childSerializers()) == null) ? o0.f3685b : bVarArrChildSerializers;
                    case 1:
                        x xVar3 = this.f3691b.f3696b;
                        if (xVar3 == null || (bVarArrTypeParametersSerializers = xVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                            for (z7.b bVar : bVarArrTypeParametersSerializers) {
                                arrayList.add(bVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.f3691b;
                        return Integer.valueOf(o0.d(q0Var, (b8.e[]) q0Var.j.getValue()));
                }
            }
        };
        p6.g gVar = p6.g.f8439a;
        this.i = p6.a.c(gVar, aVar);
        final int i12 = 1;
        this.j = p6.a.c(gVar, new d7.a(this) { // from class: d8.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f3691b;

            {
                this.f3691b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p6.f] */
            @Override // d7.a
            public final Object invoke() {
                z7.b[] bVarArrChildSerializers;
                ArrayList arrayList;
                z7.b[] bVarArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        x xVar2 = this.f3691b.f3696b;
                        return (xVar2 == null || (bVarArrChildSerializers = xVar2.childSerializers()) == null) ? o0.f3685b : bVarArrChildSerializers;
                    case 1:
                        x xVar3 = this.f3691b.f3696b;
                        if (xVar3 == null || (bVarArrTypeParametersSerializers = xVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                            for (z7.b bVar : bVarArrTypeParametersSerializers) {
                                arrayList.add(bVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.f3691b;
                        return Integer.valueOf(o0.d(q0Var, (b8.e[]) q0Var.j.getValue()));
                }
            }
        });
        final int i13 = 2;
        this.f3700k = p6.a.c(gVar, new d7.a(this) { // from class: d8.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f3691b;

            {
                this.f3691b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p6.f] */
            @Override // d7.a
            public final Object invoke() {
                z7.b[] bVarArrChildSerializers;
                ArrayList arrayList;
                z7.b[] bVarArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        x xVar2 = this.f3691b.f3696b;
                        return (xVar2 == null || (bVarArrChildSerializers = xVar2.childSerializers()) == null) ? o0.f3685b : bVarArrChildSerializers;
                    case 1:
                        x xVar3 = this.f3691b.f3696b;
                        if (xVar3 == null || (bVarArrTypeParametersSerializers = xVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                            for (z7.b bVar : bVarArrTypeParametersSerializers) {
                                arrayList.add(bVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.f3691b;
                        return Integer.valueOf(o0.d(q0Var, (b8.e[]) q0Var.j.getValue()));
                }
            }
        });
    }

    @Override // b8.e
    public final String a() {
        return this.f3695a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // d8.k
    public final Set b() {
        return this.h.keySet();
    }

    @Override // b8.e
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // b8.e
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // b8.e
    public final int e() {
        return this.f3697c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, p6.f] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, p6.f] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            b8.e eVar = (b8.e) obj;
            if (this.f3695a.equals(eVar.a()) && Arrays.equals((b8.e[]) this.j.getValue(), (b8.e[]) ((q0) obj).j.getValue())) {
                int iE = eVar.e();
                int i = this.f3697c;
                if (i == iE) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (kotlin.jvm.internal.l.a(h(i6).a(), eVar.h(i6).a()) && kotlin.jvm.internal.l.a(h(i6).getKind(), eVar.h(i6).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b8.e
    public final String f(int i) {
        return this.f3699e[i];
    }

    @Override // b8.e
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? q6.t.f8725a : list;
    }

    @Override // b8.e
    public final List getAnnotations() {
        return q6.t.f8725a;
    }

    @Override // b8.e
    public z3 getKind() {
        return b8.i.h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p6.f] */
    @Override // b8.e
    public b8.e h(int i) {
        return ((z7.b[]) this.i.getValue())[i].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p6.f] */
    public int hashCode() {
        return ((Number) this.f3700k.getValue()).intValue();
    }

    @Override // b8.e
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override // b8.e
    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z9) {
        str.getClass();
        int i = this.f3698d + 1;
        this.f3698d = i;
        String[] strArr = this.f3699e;
        strArr[i] = str;
        this.g[i] = z9;
        this.f[i] = null;
        if (i == this.f3697c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                map.put(strArr[i6], Integer.valueOf(i6));
            }
            this.h = map;
        }
    }

    public String toString() {
        return q6.l.x0(t0.f.K(0, this.f3697c), ", ", this.f3695a.concat("("), ")", new androidx.room.b(this, 15), 24);
    }
}
