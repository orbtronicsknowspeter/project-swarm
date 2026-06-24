package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class z6 {
    public static final z6 DISTINCT;
    public static final z6 ORDERED;
    public static final z6 SHORT_CIRCUIT;
    public static final z6 SIZED;
    public static final z6 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f6443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f6444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f6445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f6446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f6447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f6448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f6449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f6450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f6451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f6452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f6453u;
    public static final /* synthetic */ z6[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6458e;

    public static z6 valueOf(String str) {
        return (z6) Enum.valueOf(z6.class, str);
    }

    public static z6[] values() {
        return (z6[]) v.clone();
    }

    static {
        y6 y6Var = y6.SPLITERATOR;
        j$.time.format.r rVarK = k(y6Var);
        y6 y6Var2 = y6.STREAM;
        rVarK.b(y6Var2);
        y6 y6Var3 = y6.OP;
        ((EnumMap) rVarK.f5860a).put(y6Var3, 3);
        z6 z6Var = new z6("DISTINCT", 0, 0, rVarK);
        DISTINCT = z6Var;
        j$.time.format.r rVarK2 = k(y6Var);
        rVarK2.b(y6Var2);
        ((EnumMap) rVarK2.f5860a).put(y6Var3, 3);
        z6 z6Var2 = new z6("SORTED", 1, 1, rVarK2);
        SORTED = z6Var2;
        j$.time.format.r rVarK3 = k(y6Var);
        rVarK3.b(y6Var2);
        ((EnumMap) rVarK3.f5860a).put(y6Var3, 3);
        y6 y6Var4 = y6.TERMINAL_OP;
        ((EnumMap) rVarK3.f5860a).put(y6Var4, 2);
        y6 y6Var5 = y6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) rVarK3.f5860a).put(y6Var5, 2);
        z6 z6Var3 = new z6("ORDERED", 2, 2, rVarK3);
        ORDERED = z6Var3;
        j$.time.format.r rVarK4 = k(y6Var);
        rVarK4.b(y6Var2);
        ((EnumMap) rVarK4.f5860a).put(y6Var3, 2);
        z6 z6Var4 = new z6("SIZED", 3, 3, rVarK4);
        SIZED = z6Var4;
        j$.time.format.r rVarK5 = k(y6Var3);
        rVarK5.b(y6Var4);
        int i6 = 0;
        z6 z6Var5 = new z6("SHORT_CIRCUIT", 4, 12, rVarK5);
        SHORT_CIRCUIT = z6Var5;
        v = new z6[]{z6Var, z6Var2, z6Var3, z6Var4, z6Var5};
        f = f(y6Var);
        g = f(y6Var2);
        h = f(y6Var3);
        f(y6Var4);
        f(y6Var5);
        for (z6 z6Var6 : values()) {
            i6 |= z6Var6.f6458e;
        }
        i = i6;
        int i10 = g;
        j = i10;
        int i11 = i10 << 1;
        f6443k = i11;
        f6444l = i10 | i11;
        z6 z6Var7 = DISTINCT;
        f6445m = z6Var7.f6456c;
        f6446n = z6Var7.f6457d;
        z6 z6Var8 = SORTED;
        f6447o = z6Var8.f6456c;
        f6448p = z6Var8.f6457d;
        z6 z6Var9 = ORDERED;
        f6449q = z6Var9.f6456c;
        f6450r = z6Var9.f6457d;
        z6 z6Var10 = SIZED;
        f6451s = z6Var10.f6456c;
        f6452t = z6Var10.f6457d;
        f6453u = SHORT_CIRCUIT.f6456c;
    }

    public static j$.time.format.r k(y6 y6Var) {
        j$.time.format.r rVar = new j$.time.format.r(1, new EnumMap(y6.class));
        rVar.b(y6Var);
        return rVar;
    }

    public z6(String str, int i6, int i10, j$.time.format.r rVar) {
        for (y6 y6Var : y6.values()) {
            j$.util.c.t(rVar.f5860a, y6Var, 0);
        }
        this.f6454a = rVar.f5860a;
        int i11 = i10 * 2;
        this.f6455b = i11;
        this.f6456c = 1 << i11;
        this.f6457d = 2 << i11;
        this.f6458e = 3 << i11;
    }

    public final boolean j(int i6) {
        return (i6 & this.f6458e) == this.f6456c;
    }

    public static int f(y6 y6Var) {
        int iIntValue = 0;
        for (z6 z6Var : values()) {
            iIntValue |= ((Integer) z6Var.f6454a.get(y6Var)).intValue() << z6Var.f6455b;
        }
        return iIntValue;
    }

    public static int e(int i6, int i10) {
        int i11;
        if (i6 == 0) {
            i11 = i;
        } else {
            i11 = ~(((j & i6) << 1) | i6 | ((f6443k & i6) >> 1));
        }
        return i6 | (i10 & i11);
    }

    public static int g(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i6 = iCharacteristics & 4;
        int i10 = f;
        return (i6 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i10 : iCharacteristics & i10 & (-5);
    }
}
