package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5 f2726a;

    static {
        j6 j6Var = j6.f2671c;
        f2726a = new j5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b(Object obj, Object obj2) {
        l5 l5Var = (l5) obj;
        r6 r6Var = l5Var.zzc;
        r6 r6Var2 = ((l5) obj2).zzc;
        r6 r6Var3 = r6.f;
        if (!r6Var3.equals(r6Var2)) {
            if (r6Var3.equals(r6Var)) {
                int i = r6Var.f2780a + r6Var2.f2780a;
                int[] iArrCopyOf = Arrays.copyOf(r6Var.f2781b, i);
                System.arraycopy(r6Var2.f2781b, 0, iArrCopyOf, r6Var.f2780a, r6Var2.f2780a);
                Object[] objArrCopyOf = Arrays.copyOf(r6Var.f2782c, i);
                System.arraycopy(r6Var2.f2782c, 0, objArrCopyOf, r6Var.f2780a, r6Var2.f2780a);
                r6Var = new r6(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                r6Var.getClass();
                if (!r6Var2.equals(r6Var3)) {
                    if (!r6Var.f2784e) {
                        com.google.gson.internal.a.q();
                        return;
                    }
                    int i6 = r6Var.f2780a + r6Var2.f2780a;
                    r6Var.e(i6);
                    System.arraycopy(r6Var2.f2781b, 0, r6Var.f2781b, r6Var.f2780a, r6Var2.f2780a);
                    System.arraycopy(r6Var2.f2782c, 0, r6Var.f2782c, r6Var.f2780a, r6Var2.f2780a);
                    r6Var.f2780a = i6;
                }
            }
        }
        l5Var.zzc = r6Var;
    }

    public static void c(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        if (list instanceof c5) {
            com.google.gson.internal.a.o();
            return;
        }
        int i6 = 0;
        if (!z9) {
            while (i6 < list.size()) {
                b5Var.h(i, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).getClass();
            i10 += 8;
        }
        b5Var.m(i10);
        while (i6 < list.size()) {
            b5Var.p(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
            i6++;
        }
    }

    public static void d(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        if (list instanceof h5) {
            com.google.gson.internal.a.o();
            return;
        }
        int i6 = 0;
        if (!z9) {
            while (i6 < list.size()) {
                b5Var.f(i, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).getClass();
            i10 += 4;
        }
        b5Var.m(i10);
        while (i6 < list.size()) {
            b5Var.n(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
            i6++;
        }
    }

    public static void e(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof y5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.g(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iA += b5.a(((Long) list.get(i10)).longValue());
            }
            b5Var.m(iA);
            while (i6 < list.size()) {
                b5Var.o(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z9) {
            while (i6 < y5Var.f2918l) {
                b5Var.g(i, y5Var.c(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < y5Var.f2918l; i11++) {
            iA2 += b5.a(y5Var.c(i11));
        }
        b5Var.m(iA2);
        while (i6 < y5Var.f2918l) {
            b5Var.o(y5Var.c(i6));
            i6++;
        }
    }

    public static void f(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof y5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.g(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iA += b5.a(((Long) list.get(i10)).longValue());
            }
            b5Var.m(iA);
            while (i6 < list.size()) {
                b5Var.o(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z9) {
            while (i6 < y5Var.f2918l) {
                b5Var.g(i, y5Var.c(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < y5Var.f2918l; i11++) {
            iA2 += b5.a(y5Var.c(i11));
        }
        b5Var.m(iA2);
        while (i6 < y5Var.f2918l) {
            b5Var.o(y5Var.c(i6));
            i6++;
        }
    }

    public static void g(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof y5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    long jLongValue = ((Long) list.get(i6)).longValue();
                    b5Var.g(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long jLongValue2 = ((Long) list.get(i10)).longValue();
                iA += b5.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            b5Var.m(iA);
            while (i6 < list.size()) {
                long jLongValue3 = ((Long) list.get(i6)).longValue();
                b5Var.o((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i6++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z9) {
            while (i6 < y5Var.f2918l) {
                long jC = y5Var.c(i6);
                b5Var.g(i, (jC >> 63) ^ (jC + jC));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < y5Var.f2918l; i11++) {
            long jC2 = y5Var.c(i11);
            iA2 += b5.a((jC2 >> 63) ^ (jC2 + jC2));
        }
        b5Var.m(iA2);
        while (i6 < y5Var.f2918l) {
            long jC3 = y5Var.c(i6);
            b5Var.o((jC3 >> 63) ^ (jC3 + jC3));
            i6++;
        }
    }

    public static void h(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof y5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.h(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).getClass();
                i10 += 8;
            }
            b5Var.m(i10);
            while (i6 < list.size()) {
                b5Var.p(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z9) {
            while (i6 < y5Var.f2918l) {
                b5Var.h(i, y5Var.c(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < y5Var.f2918l; i13++) {
            y5Var.c(i13);
            i12 += 8;
        }
        b5Var.m(i12);
        while (i6 < y5Var.f2918l) {
            b5Var.p(y5Var.c(i6));
            i6++;
        }
    }

    public static void i(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof y5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.h(i, ((Long) list.get(i6)).longValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).getClass();
                i10 += 8;
            }
            b5Var.m(i10);
            while (i6 < list.size()) {
                b5Var.p(((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        y5 y5Var = (y5) list;
        if (!z9) {
            while (i6 < y5Var.f2918l) {
                b5Var.h(i, y5Var.c(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < y5Var.f2918l; i13++) {
            y5Var.c(i13);
            i12 += 8;
        }
        b5Var.m(i12);
        while (i6 < y5Var.f2918l) {
            b5Var.p(y5Var.c(i6));
            i6++;
        }
    }

    public static void j(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof m5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.d(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iA += b5.a(((Integer) list.get(i10)).intValue());
            }
            b5Var.m(iA);
            while (i6 < list.size()) {
                b5Var.l(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        m5 m5Var = (m5) list;
        if (!z9) {
            while (i6 < m5Var.f2713l) {
                b5Var.d(i, m5Var.d(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < m5Var.f2713l; i11++) {
            iA2 += b5.a(m5Var.d(i11));
        }
        b5Var.m(iA2);
        while (i6 < m5Var.f2713l) {
            b5Var.l(m5Var.d(i6));
            i6++;
        }
    }

    public static void k(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof m5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.e(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iS = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iS += b5.s(((Integer) list.get(i10)).intValue());
            }
            b5Var.m(iS);
            while (i6 < list.size()) {
                b5Var.m(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        m5 m5Var = (m5) list;
        if (!z9) {
            while (i6 < m5Var.f2713l) {
                b5Var.e(i, m5Var.d(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iS2 = 0;
        for (int i11 = 0; i11 < m5Var.f2713l; i11++) {
            iS2 += b5.s(m5Var.d(i11));
        }
        b5Var.m(iS2);
        while (i6 < m5Var.f2713l) {
            b5Var.m(m5Var.d(i6));
            i6++;
        }
    }

    public static void l(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof m5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    int iIntValue = ((Integer) list.get(i6)).intValue();
                    b5Var.e(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iS = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int iIntValue2 = ((Integer) list.get(i10)).intValue();
                iS += b5.s((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            b5Var.m(iS);
            while (i6 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i6)).intValue();
                b5Var.m((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i6++;
            }
            return;
        }
        m5 m5Var = (m5) list;
        if (!z9) {
            while (i6 < m5Var.f2713l) {
                int iD = m5Var.d(i6);
                b5Var.e(i, (iD >> 31) ^ (iD + iD));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iS2 = 0;
        for (int i11 = 0; i11 < m5Var.f2713l; i11++) {
            int iD2 = m5Var.d(i11);
            iS2 += b5.s((iD2 >> 31) ^ (iD2 + iD2));
        }
        b5Var.m(iS2);
        while (i6 < m5Var.f2713l) {
            int iD3 = m5Var.d(i6);
            b5Var.m((iD3 >> 31) ^ (iD3 + iD3));
            i6++;
        }
    }

    public static void m(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof m5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.f(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            b5Var.m(i10);
            while (i6 < list.size()) {
                b5Var.n(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        m5 m5Var = (m5) list;
        if (!z9) {
            while (i6 < m5Var.f2713l) {
                b5Var.f(i, m5Var.d(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < m5Var.f2713l; i13++) {
            m5Var.d(i13);
            i12 += 4;
        }
        b5Var.m(i12);
        while (i6 < m5Var.f2713l) {
            b5Var.n(m5Var.d(i6));
            i6++;
        }
    }

    public static void n(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof m5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.f(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            b5Var.m(i10);
            while (i6 < list.size()) {
                b5Var.n(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        m5 m5Var = (m5) list;
        if (!z9) {
            while (i6 < m5Var.f2713l) {
                b5Var.f(i, m5Var.d(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < m5Var.f2713l; i13++) {
            m5Var.d(i13);
            i12 += 4;
        }
        b5Var.m(i12);
        while (i6 < m5Var.f2713l) {
            b5Var.n(m5Var.d(i6));
            i6++;
        }
    }

    public static void o(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        int i6 = 0;
        if (!(list instanceof m5)) {
            if (!z9) {
                while (i6 < list.size()) {
                    b5Var.d(i, ((Integer) list.get(i6)).intValue());
                    i6++;
                }
                return;
            }
            b5Var.c(i, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iA += b5.a(((Integer) list.get(i10)).intValue());
            }
            b5Var.m(iA);
            while (i6 < list.size()) {
                b5Var.l(((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        m5 m5Var = (m5) list;
        if (!z9) {
            while (i6 < m5Var.f2713l) {
                b5Var.d(i, m5Var.d(i6));
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < m5Var.f2713l; i11++) {
            iA2 += b5.a(m5Var.d(i11));
        }
        b5Var.m(iA2);
        while (i6 < m5Var.f2713l) {
            b5Var.l(m5Var.d(i6));
            i6++;
        }
    }

    public static void p(int i, List list, z5 z5Var, boolean z9) throws a7.b {
        if (list == null || list.isEmpty()) {
            return;
        }
        b5 b5Var = (b5) z5Var.f2934a;
        if (list instanceof w4) {
            com.google.gson.internal.a.o();
            return;
        }
        int i6 = 0;
        if (!z9) {
            while (i6 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i6)).booleanValue();
                b5Var.m(i << 3);
                b5Var.k(zBooleanValue ? (byte) 1 : (byte) 0);
                i6++;
            }
            return;
        }
        b5Var.c(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            i10++;
        }
        b5Var.m(i10);
        while (i6 < list.size()) {
            b5Var.k(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y5)) {
            int iA = 0;
            while (i < size) {
                iA += b5.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        y5 y5Var = (y5) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += b5.a(y5Var.c(i));
            i++;
        }
        return iA2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y5)) {
            int iA = 0;
            while (i < size) {
                iA += b5.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        y5 y5Var = (y5) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += b5.a(y5Var.c(i));
            i++;
        }
        return iA2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y5)) {
            int iA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iA += b5.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iA;
        }
        y5 y5Var = (y5) list;
        int iA2 = 0;
        while (i < size) {
            long jC = y5Var.c(i);
            iA2 += b5.a((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iA2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m5)) {
            int iA = 0;
            while (i < size) {
                iA += b5.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        m5 m5Var = (m5) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += b5.a(m5Var.d(i));
            i++;
        }
        return iA2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m5)) {
            int iA = 0;
            while (i < size) {
                iA += b5.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        m5 m5Var = (m5) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += b5.a(m5Var.d(i));
            i++;
        }
        return iA2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m5)) {
            int iS = 0;
            while (i < size) {
                iS += b5.s(((Integer) list.get(i)).intValue());
                i++;
            }
            return iS;
        }
        m5 m5Var = (m5) list;
        int iS2 = 0;
        while (i < size) {
            iS2 += b5.s(m5Var.d(i));
            i++;
        }
        return iS2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m5)) {
            int iS = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iS += b5.s((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iS;
        }
        m5 m5Var = (m5) list;
        int iS2 = 0;
        while (i < size) {
            int iD = m5Var.d(i);
            iS2 += b5.s((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iS2;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b5.s(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b5.s(i << 3) + 8) * size;
    }
}
