package e1;

import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.r7;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f3781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f3782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f3783e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ c h;
    public final l5 i;

    public b(c cVar, String str, int i, l5 l5Var, int i6) {
        this.g = i6;
        this.h = cVar;
        this.f3779a = str;
        this.f3780b = i;
        this.i = l5Var;
    }

    public static Boolean c(Boolean bool, boolean z9) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.w1 w1Var, w0 w0Var) {
        List listT;
        k0.y.g(w1Var);
        if (str != null && w1Var.o() && w1Var.w() != 1 && (w1Var.w() != 7 ? w1Var.p() : w1Var.u() != 0)) {
            int iW = w1Var.w();
            boolean zS = w1Var.s();
            String strQ = (zS || iW == 2 || iW == 7) ? w1Var.q() : w1Var.q().toUpperCase(Locale.ENGLISH);
            if (w1Var.u() == 0) {
                listT = null;
            } else {
                listT = w1Var.t();
                if (!zS) {
                    ArrayList arrayList = new ArrayList(listT.size());
                    Iterator it = listT.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listT = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = iW == 2 ? strQ : null;
            if (iW != 7 ? strQ != null : listT != null && !listT.isEmpty()) {
                if (!zS && iW != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iW - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zS ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (w0Var != null) {
                                    w0Var.f4342r.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strQ));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strQ));
                    case 4:
                        return Boolean.valueOf(str.contains(strQ));
                    case 5:
                        return Boolean.valueOf(str.equals(strQ));
                    case 6:
                        if (listT != null) {
                            return Boolean.valueOf(listT.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.t1 r9, double r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.t1, double):java.lang.Boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c4 A[EDGE_INSN: B:234:0x03c4->B:161:0x03c4 BREAK  A[LOOP:3: B:89:0x0241->B:238:0x0241], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.b3 r24, long r25, e1.r r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.b3, long, e1.r, boolean):boolean");
    }

    public boolean b(Long l10, Long l11, com.google.android.gms.internal.measurement.s3 s3Var, boolean z9) {
        boolean z10;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        r7.a();
        t1 t1Var = this.h.f3875a;
        g gVar = t1Var.f4262m;
        q0 q0Var = t1Var.f4268s;
        w0 w0Var = t1Var.f4264o;
        boolean zQ = gVar.q(this.f3779a, f0.E0);
        com.google.android.gms.internal.measurement.v1 v1Var = (com.google.android.gms.internal.measurement.v1) this.i;
        boolean zS = v1Var.s();
        boolean zT = v1Var.t();
        boolean zV = v1Var.v();
        boolean z11 = zS || zT || zV;
        if (z9 && !z11) {
            t1.m(w0Var);
            w0Var.f4346w.d(Integer.valueOf(this.f3780b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", v1Var.o() ? Integer.valueOf(v1Var.p()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.q1 q1VarR = v1Var.r();
        boolean zT2 = q1VarR.t();
        if (!s3Var.t()) {
            z10 = zV;
            if (!s3Var.x()) {
                if (!s3Var.r()) {
                    t1.m(w0Var);
                    w0Var.f4342r.c(q0Var.c(s3Var.q()), "User property has no value, property");
                } else if (q1VarR.o()) {
                    String strS = s3Var.s();
                    com.google.android.gms.internal.measurement.w1 w1VarP = q1VarR.p();
                    t1.m(w0Var);
                    boolC = c(d(strS, w1VarP, w0Var), zT2);
                } else if (!q1VarR.q()) {
                    t1.m(w0Var);
                    w0Var.f4342r.c(q0Var.c(s3Var.q()), "No string or number filter defined. property");
                } else if (a1.M(s3Var.s())) {
                    String strS2 = s3Var.s();
                    com.google.android.gms.internal.measurement.t1 t1VarR = q1VarR.r();
                    if (a1.M(strS2)) {
                        try {
                            boolE = e(new BigDecimal(strS2), t1VarR, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                        boolC = c(boolE, zT2);
                    } else {
                        boolE = null;
                        boolC = c(boolE, zT2);
                    }
                } else {
                    t1.m(w0Var);
                    w0Var.f4342r.d(q0Var.c(s3Var.q()), "Invalid user property value for Numeric number filter. property, value", s3Var.s());
                }
                boolC = null;
            } else if (q1VarR.q()) {
                double dY = s3Var.y();
                try {
                    boolE2 = e(new BigDecimal(dY), q1VarR.r(), Math.ulp(dY));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zT2);
            } else {
                t1.m(w0Var);
                w0Var.f4342r.c(q0Var.c(s3Var.q()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (q1VarR.q()) {
            z10 = zV;
            try {
                boolE3 = e(new BigDecimal(s3Var.u()), q1VarR.r(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zT2);
        } else {
            t1.m(w0Var);
            w0Var.f4342r.c(q0Var.c(s3Var.q()), "No number filter for long property. property");
            z10 = zV;
            boolC = null;
        }
        t1.m(w0Var);
        w0Var.f4346w.c(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f3781c = Boolean.TRUE;
        if (!z10 || boolC.booleanValue()) {
            if (!z9 || v1Var.s()) {
                this.f3782d = boolC;
            }
            if (boolC.booleanValue() && z11 && s3Var.o()) {
                long jP = s3Var.p();
                if (l10 != null) {
                    jP = l10.longValue();
                }
                if (zQ && v1Var.s() && !v1Var.t() && l11 != null) {
                    jP = l11.longValue();
                }
                if (v1Var.t()) {
                    this.f = Long.valueOf(jP);
                } else {
                    this.f3783e = Long.valueOf(jP);
                }
            }
        }
        return true;
    }
}
