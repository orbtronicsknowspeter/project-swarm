package j8;

import b2.t1;
import c.j;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.l;
import l8.k;
import l8.n;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6731a = {1, 2, 3, 4};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6732b = {5};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6733c = {6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f6734d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static n f6735e = null;
    public static l9.a f = null;
    public static s g = null;
    public static int h = 0;
    public static boolean i = false;
    public static int j = 1;

    public static int a(int i6, List list) {
        return (list.hashCode() + i6) * 31;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int b(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 3166:
                return !lowerCase.equals("ca") ? 16 : 1;
            case 3180:
                return !lowerCase.equals("co") ? 16 : 2;
            case 3185:
                return !lowerCase.equals("ct") ? 16 : 3;
            case 3201:
                return !lowerCase.equals("de") ? 16 : 10;
            case 3270:
                return !lowerCase.equals("fl") ? 16 : 6;
            case 3352:
                return !lowerCase.equals("ia") ? 16 : 11;
            case 3495:
                return !lowerCase.equals("mt") ? 16 : 7;
            case 3511:
                return !lowerCase.equals("ne") ? 16 : 12;
            case 3514:
                return !lowerCase.equals("nh") ? 16 : 13;
            case 3516:
                return !lowerCase.equals("nj") ? 16 : 14;
            case 3555:
                return !lowerCase.equals("or") ? 16 : 8;
            case 3706:
                return !lowerCase.equals("tn") ? 16 : 15;
            case 3716:
                return !lowerCase.equals("tx") ? 16 : 9;
            case 3743:
                return !lowerCase.equals("ut") ? 16 : 4;
            case 3755:
                return !lowerCase.equals("va") ? 16 : 5;
            default:
                return 16;
        }
    }

    public static String c(int i6) {
        if (i6 == 0) {
            throw null;
        }
        switch (j.c(i6)) {
            case 0:
                return "ca";
            case 1:
                return "co";
            case 2:
                return "ct";
            case 3:
                return "ut";
            case 4:
                return "va";
            case 5:
                return "fl";
            case 6:
                return "mt";
            case 7:
                return "or";
            case 8:
                return "tx";
            case 9:
                return "de";
            case 10:
                return "ia";
            case 11:
                return "ne";
            case 12:
                return "nh";
            case 13:
                return "nj";
            case 14:
                return "tn";
            default:
                return "";
        }
    }

    public static LinkedHashMap d(Vector vector) {
        vector.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        vector.forEach(new f(linkedHashMap, 0));
        return linkedHashMap;
    }

    public static LinkedHashMap e(Vector vector, Set set) {
        LinkedHashMap linkedHashMap;
        vector.getClass();
        if (set == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                linkedHashMap2.put(String.valueOf(iIntValue), Boolean.valueOf(vector.contains(iIntValue)));
            }
            linkedHashMap = linkedHashMap2;
        }
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        vector.forEach(new f(linkedHashMap3, 0));
        return linkedHashMap3;
    }

    public static l9.a f() {
        l9.a aVar = f;
        if (aVar != null) {
            return aVar;
        }
        l.i("sharedStorage");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
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
    public static void g(a aVar) {
        if (f6734d) {
            return;
        }
        i(aVar);
        ?? r42 = aVar.f6719d;
        if (r42 == 0) {
            return;
        }
        boolean z9 = f6734d;
        s sVar = g;
        d dVar = d.f6730a;
        if (sVar != 0) {
            sVar.h(r42, z9, new b6.b(dVar));
        } else {
            a.a.h(null, ChoiceError.UNEXPECTED_ERROR_OCCURRED.getMessage(), null, 5);
            dVar.invoke(null);
        }
    }

    public static int h() {
        int i6 = h;
        if (i6 != 0) {
            return i6;
        }
        int iB = b(t1.f946b);
        n nVar = f6735e;
        if (nVar == null) {
            l.i("portalConfig");
            throw null;
        }
        k kVar = nVar.f7240o;
        boolean z9 = kVar.f7219b;
        if (l.a(kVar.f7218a, "NATIONAL") || (z9 && j())) {
            iB = 16;
        } else if ((!z9 || iB == 16 || j()) && !z9 && iB == 16 && f().j(69).equals("STATE_AND_NATIONAL")) {
            iB = b(f().j(70));
        }
        h = iB;
        return iB;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Iterable, java.lang.Object] */
    public static void i(a aVar) {
        s aVar2;
        ?? r62;
        Object next;
        ?? r63;
        ?? r22;
        aVar.getClass();
        if (i) {
            return;
        }
        if ((j() && j == 1) || (f().j(69).equals("STATE_AND_NATIONAL") && j == 2 && b(f().j(70)) == h())) {
            Vector vectorK = f().k(71);
            if (vectorK != null && (r22 = aVar.f6719d) != 0) {
                for (b bVar : r22) {
                    int iIntValue = bVar.f6720a.intValue();
                    if (vectorK.contains(iIntValue)) {
                        bVar.f6722c = vectorK.get(iIntValue);
                    }
                }
            }
            Vector vectorK2 = f().k(72);
            if (vectorK2 != null && (r62 = aVar.f6719d) != 0) {
                Iterator it = r62.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((b) next).f6720a.intValue() == q6.j.i0(f6732b)) {
                        break;
                    }
                }
                b bVar2 = (b) next;
                if (bVar2 != null && (r63 = bVar2.f) != 0) {
                    for (c cVar : r63) {
                        int iIntValue2 = cVar.f6726b.intValue();
                        if (vectorK2.contains(iIntValue2)) {
                            cVar.f6728d = vectorK2.get(iIntValue2);
                        }
                    }
                }
            }
        }
        switch (j.c(h())) {
            case 0:
                aVar2 = new k8.a(0);
                break;
            case 1:
                aVar2 = new k8.a(1);
                break;
            case 2:
                aVar2 = new k8.a(2);
                break;
            case 3:
                aVar2 = new k8.a(13);
                break;
            case 4:
                aVar2 = new k8.a(14);
                break;
            case 5:
                aVar2 = new k8.a(4);
                break;
            case 6:
                aVar2 = new k8.a(6);
                break;
            case 7:
                aVar2 = new k8.a(10);
                break;
            case 8:
                aVar2 = new k8.a(12);
                break;
            case 9:
                aVar2 = new k8.a(3);
                break;
            case 10:
                aVar2 = new k8.a(5);
                break;
            case 11:
                aVar2 = new k8.a(7);
                break;
            case 12:
                aVar2 = new k8.a(8);
                break;
            case 13:
                aVar2 = new k8.a(9);
                break;
            case 14:
                aVar2 = new k8.a(11);
                break;
            default:
                aVar2 = new s(8);
                break;
        }
        g = aVar2;
        i = true;
    }

    public static boolean j() {
        return f().j(69).equals("NATIONAL");
    }
}
