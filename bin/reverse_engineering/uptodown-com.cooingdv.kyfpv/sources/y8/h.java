package y8;

import b9.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final LinkedHashSet f11831p = new LinkedHashSet(Arrays.asList(b9.b.class, b9.h.class, b9.f.class, b9.i.class, w.class, b9.o.class, b9.l.class));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Map f11832q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f11833a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11836d;
    public boolean h;
    public final List i;
    public final q2.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f11838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f11839l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f11841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f11842o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11834b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11835c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11837e = 0;
    public int f = 0;
    public int g = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f11840m = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(b9.b.class, new b(0));
        map.put(b9.h.class, new b(2));
        map.put(b9.f.class, new b(1));
        map.put(b9.i.class, new b(3));
        map.put(w.class, new b(6));
        map.put(b9.o.class, new b(5));
        map.put(b9.l.class, new b(4));
        f11832q = DesugarCollections.unmodifiableMap(map);
    }

    public h(ArrayList arrayList, q2.e eVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f11841n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f11842o = linkedHashSet;
        this.i = arrayList;
        this.j = eVar;
        this.f11838k = arrayList2;
        g gVar = new g(0);
        this.f11839l = gVar;
        arrayList3.add(gVar);
        linkedHashSet.add(gVar);
    }

    public final void a(d9.a aVar) {
        while (!h().b(aVar.d())) {
            e(h());
        }
        h().d().b(aVar.d());
        this.f11841n.add(aVar);
        this.f11842o.add(aVar);
    }

    public final void b(r rVar) {
        n nVar = rVar.f11886b;
        nVar.a();
        ArrayList arrayList = nVar.f11874c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b9.n nVar2 = (b9.n) obj;
            b9.s sVar = rVar.f11885a;
            nVar2.f();
            b9.q qVar = sVar.f1124d;
            nVar2.f1124d = qVar;
            if (qVar != null) {
                qVar.f1125e = nVar2;
            }
            nVar2.f1125e = sVar;
            sVar.f1124d = nVar2;
            b9.q qVar2 = sVar.f1121a;
            nVar2.f1121a = qVar2;
            if (nVar2.f1124d == null) {
                qVar2.f1122b = nVar2;
            }
            String str = nVar2.f;
            LinkedHashMap linkedHashMap = this.f11840m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, nVar2);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.f11836d) {
            int i = this.f11834b + 1;
            CharSequence charSequence = this.f11833a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i6 = 4 - (this.f11835c % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i6);
            for (int i10 = 0; i10 < i6; i10++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f11833a;
            charSequenceSubSequence = charSequence2.subSequence(this.f11834b, charSequence2.length());
        }
        h().a(charSequenceSubSequence);
    }

    public final void d() {
        char cCharAt = this.f11833a.charAt(this.f11834b);
        int i = this.f11834b;
        if (cCharAt != '\t') {
            this.f11834b = i + 1;
            this.f11835c++;
        } else {
            this.f11834b = i + 1;
            int i6 = this.f11835c;
            this.f11835c = (4 - (i6 % 4)) + i6;
        }
    }

    public final void e(d9.a aVar) {
        if (h() == aVar) {
            this.f11841n.remove(r0.size() - 1);
        }
        if (aVar instanceof r) {
            b((r) aVar);
        }
        aVar.c();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((d9.a) list.get(size));
        }
    }

    public final void g() {
        int i = this.f11834b;
        int i6 = this.f11835c;
        this.h = true;
        int length = this.f11833a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.f11833a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i6 += 4 - (i6 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i6++;
            }
        }
        this.f11837e = i;
        this.f = i6;
        this.g = i6 - this.f11835c;
    }

    public final d9.a h() {
        return (d9.a) this.f11841n.get(r0.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ca, code lost:
    
        if (r3 < 1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cc, code lost:
    
        r3 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d2, code lost:
    
        if (r3 >= r13.length()) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d4, code lost:
    
        r6 = r13.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01da, code lost:
    
        if (r6 == '\t') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01de, code lost:
    
        if (r6 == ' ') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
    
        r6 = r13.subSequence(r8, r15).toString();
        r14 = new b9.r();
        r14.g = java.lang.Integer.parseInt(r6);
        r14.h = r5;
        r5 = new y8.o(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x05ec, code lost:
    
        k(r22.f11837e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x01b7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0328 A[PHI: r8 r21
      0x0328: PHI (r8v32 int) = (r8v6 int), (r8v6 int), (r8v6 int), (r8v33 int), (r8v34 int) binds: [B:301:0x0534, B:303:0x053a, B:305:0x0542, B:179:0x02fe, B:185:0x0327] A[DONT_GENERATE, DONT_INLINE]
      0x0328: PHI (r21v10 d9.a) = (r21v5 d9.a), (r21v5 d9.a), (r21v5 d9.a), (r21v11 d9.a), (r21v11 d9.a) binds: [B:301:0x0534, B:303:0x053a, B:305:0x0542, B:179:0x02fe, B:185:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0187  */
    /* JADX WARN: Type inference failed for: r22v0, types: [y8.h] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.h.i(java.lang.String):void");
    }

    public final void j(int i) {
        int i6;
        int i10 = this.f;
        if (i >= i10) {
            this.f11834b = this.f11837e;
            this.f11835c = i10;
        }
        int length = this.f11833a.length();
        while (true) {
            i6 = this.f11835c;
            if (i6 >= i || this.f11834b == length) {
                break;
            } else {
                d();
            }
        }
        if (i6 <= i) {
            this.f11836d = false;
            return;
        }
        this.f11834b--;
        this.f11835c = i;
        this.f11836d = true;
    }

    public final void k(int i) {
        int i6 = this.f11837e;
        if (i >= i6) {
            this.f11834b = i6;
            this.f11835c = this.f;
        }
        int length = this.f11833a.length();
        while (true) {
            int i10 = this.f11834b;
            if (i10 >= i || i10 == length) {
                break;
            } else {
                d();
            }
        }
        this.f11836d = false;
    }
}
