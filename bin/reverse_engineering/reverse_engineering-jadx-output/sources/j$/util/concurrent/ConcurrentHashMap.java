package j$.util.concurrent;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import j$.util.Map;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, Map {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final j$.sun.misc.a h;
    public static final long i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f5979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f5980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f5981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f5982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5983o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile transient l[] f5984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient l[] f5985b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient c[] f5986c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient i f5987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient s f5988e;
    public transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i6) {
        return (i6 ^ (i6 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f5726b;
        h = aVar;
        i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        f5979k = aVar.h(ConcurrentHashMap.class, "baseCount");
        f5980l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        f5981m = aVar.h(c.class, "value");
        f5982n = aVar.a(l[].class);
        int iB = aVar.b(l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f5983o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public static final int l(int i6) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i6 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        return iNumberOfLeadingZeros >= 1073741824 ? BasicMeasure.EXACTLY : iNumberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final l k(l[] lVarArr, int i6) {
        return (l) h.f(lVarArr, (((long) i6) << f5983o) + ((long) f5982n));
    }

    public static final boolean b(l[] lVarArr, int i6, l lVar) {
        j$.sun.misc.a aVar = h;
        return j$.com.android.tools.r8.a.z(aVar.f5727a, lVarArr, (((long) i6) << f5983o) + ((long) f5982n), lVar);
    }

    public static final void h(l[] lVarArr, int i6, l lVar) {
        h.j(lVarArr, (((long) i6) << f5983o) + ((long) f5982n), lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i6) {
        this(i6, 0.75f, 1);
    }

    public ConcurrentHashMap(int i6, float f, int i10) {
        if (f <= 0.0f || i6 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j6 = (long) (((double) ((i6 < i10 ? i10 : i6) / f)) + 1.0d);
        this.sizeCtl = j6 >= 1073741824 ? BasicMeasure.EXACTLY : l((int) j6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j6 = j();
        if (j6 < 0) {
            return 0;
        }
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        l lVarK;
        Object obj2;
        int i6 = i(obj.hashCode());
        l[] lVarArr = this.f5984a;
        if (lVarArr == null || (length = lVarArr.length) <= 0 || (lVarK = k(lVarArr, (length - 1) & i6)) == null) {
            return null;
        }
        int i10 = lVarK.f6000a;
        if (i10 == i6) {
            Object obj3 = lVarK.f6001b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) lVarK.f6002c;
            }
        } else if (i10 < 0) {
            l lVarA = lVarK.a(i6, obj);
            if (lVarA != null) {
                return (V) lVarA.f6002c;
            }
            return null;
        }
        while (true) {
            lVarK = lVarK.f6003d;
            if (lVarK == null) {
                return null;
            }
            if (lVarK.f6000a == i6 && ((obj2 = lVarK.f6001b) == obj || (obj2 != null && obj.equals(obj2)))) {
                break;
            }
        }
        return (V) lVarK.f6002c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f5984a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.f6002c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k5, V v) {
        return (V) f(k5, v, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f6002c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f6002c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lc2
            if (r10 == 0) goto Lc2
            int r1 = r9.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r8.f5984a
            r3 = 0
        L10:
            if (r2 == 0) goto Lbc
            int r4 = r2.length
            if (r4 != 0) goto L17
            goto Lbc
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.l r5 = k(r2, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.l r5 = new j$.util.concurrent.l
            r5.<init>(r1, r9, r10)
            boolean r4 = b(r2, r4, r5)
            if (r4 == 0) goto L10
            goto Lb4
        L2d:
            int r6 = r5.f6000a
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.l[] r2 = r8.d(r2, r5)
            goto L10
        L37:
            if (r11 == 0) goto L4c
            if (r6 != r1) goto L4c
            java.lang.Object r7 = r5.f6001b
            if (r7 == r9) goto L47
            if (r7 == 0) goto L4c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
        L47:
            java.lang.Object r7 = r5.f6002c
            if (r7 == 0) goto L4c
            return r7
        L4c:
            monitor-enter(r5)
            j$.util.concurrent.l r7 = k(r2, r4)     // Catch: java.lang.Throwable -> L68
            if (r7 != r5) goto La6
            if (r6 < 0) goto L81
            r3 = 1
            r6 = r5
        L57:
            int r7 = r6.f6000a     // Catch: java.lang.Throwable -> L68
            if (r7 != r1) goto L71
            java.lang.Object r7 = r6.f6001b     // Catch: java.lang.Throwable -> L68
            if (r7 == r9) goto L6a
            if (r7 == 0) goto L71
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L71
            goto L6a
        L68:
            r9 = move-exception
            goto Lba
        L6a:
            java.lang.Object r7 = r6.f6002c     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto La7
            r6.f6002c = r10     // Catch: java.lang.Throwable -> L68
            goto La7
        L71:
            j$.util.concurrent.l r7 = r6.f6003d     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L7d
            j$.util.concurrent.l r7 = new j$.util.concurrent.l     // Catch: java.lang.Throwable -> L68
            r7.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> L68
            r6.f6003d = r7     // Catch: java.lang.Throwable -> L68
            goto La6
        L7d:
            int r3 = r3 + 1
            r6 = r7
            goto L57
        L81:
            boolean r6 = r5 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L99
            r3 = r5
            j$.util.concurrent.q r3 = (j$.util.concurrent.q) r3     // Catch: java.lang.Throwable -> L68
            j$.util.concurrent.r r3 = r3.e(r1, r9, r10)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L96
            java.lang.Object r6 = r3.f6002c     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto L94
            r3.f6002c = r10     // Catch: java.lang.Throwable -> L68
        L94:
            r7 = r6
            goto L97
        L96:
            r7 = r0
        L97:
            r3 = 2
            goto La7
        L99:
            boolean r6 = r5 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L68
            if (r6 != 0) goto L9e
            goto La6
        L9e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = "Recursive update"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L68
            throw r9     // Catch: java.lang.Throwable -> L68
        La6:
            r7 = r0
        La7:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto Lb1
            r8.n(r2, r4)
        Lb1:
            if (r7 == 0) goto Lb4
            return r7
        Lb4:
            r9 = 1
            r8.a(r9, r3)
            return r0
        Lba:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
            throw r9
        Lbc:
            j$.util.concurrent.l[] r2 = r8.e()
            goto L10
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r9 = r5.f6002c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r15 == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r15.equals(r9) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r14 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r5.f6002c = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r5 = r5.f6003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r8 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        r8.f6003d = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        h(r1, r3, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r12.f5984a
        La:
            r2 = 0
            if (r1 == 0) goto Lbe
            int r3 = r1.length
            if (r3 == 0) goto Lbe
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lbe
        L1b:
            int r5 = r4.f6000a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Lad
            r7 = 1
            if (r5 < 0) goto L6c
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.f6000a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L63
            java.lang.Object r9 = r5.f6001b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L63
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L63
            goto L45
        L42:
            r13 = move-exception
            goto Lbc
        L45:
            java.lang.Object r9 = r5.f6002c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lae
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lae
        L53:
            if (r14 == 0) goto L58
            r5.f6002c = r14     // Catch: java.lang.Throwable -> L42
            goto Laf
        L58:
            j$.util.concurrent.l r5 = r5.f6003d
            if (r8 == 0) goto L5f
            r8.f6003d = r5     // Catch: java.lang.Throwable -> L42
            goto Laf
        L5f:
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Laf
        L63:
            j$.util.concurrent.l r8 = r5.f6003d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L68
            goto Lae
        L68:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6c:
            boolean r5 = r4 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La0
            r5 = r4
            j$.util.concurrent.q r5 = (j$.util.concurrent.q) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.r r8 = r5.f6013e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lae
            j$.util.concurrent.r r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lae
            java.lang.Object r9 = r8.f6002c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8b
            if (r15 == r9) goto L8b
            if (r9 == 0) goto Lae
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lae
        L8b:
            if (r14 == 0) goto L90
            r8.f6002c = r14     // Catch: java.lang.Throwable -> L42
            goto Laf
        L90:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Laf
            j$.util.concurrent.r r5 = r5.f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.l r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Laf
        La0:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La5
            goto Lad
        La5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L42
            throw r13     // Catch: java.lang.Throwable -> L42
        Lad:
            r7 = 0
        Lae:
            r9 = r2
        Laf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lbe
            if (r14 != 0) goto Lbb
            r13 = -1
            r12.a(r13, r6)
        Lbb:
            return r9
        Lbc:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l lVarK;
        l lVar;
        l[] lVarArrD = this.f5984a;
        long j6 = 0;
        loop0: while (true) {
            int i6 = 0;
            while (lVarArrD != null && i6 < lVarArrD.length) {
                lVarK = k(lVarArrD, i6);
                if (lVarK == null) {
                    i6++;
                } else {
                    int i10 = lVarK.f6000a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i6) == lVarK) {
                                if (i10 >= 0) {
                                    lVar = lVarK;
                                } else {
                                    lVar = lVarK instanceof q ? ((q) lVarK).f : null;
                                }
                                while (lVar != null) {
                                    j6--;
                                    lVar = lVar.f6003d;
                                }
                                h(lVarArrD, i6, null);
                                i6++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j6 != 0) {
            a(j6, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f5987d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f5987d = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f5988e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f5988e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f5984a;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f6002c.hashCode() ^ lVarA.f6001b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f5984a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.f6001b;
                Object obj2 = lVarA.f6002c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        l[] lVarArr = this.f5984a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA != null) {
                Object obj2 = lVarA.f6002c;
                Object obj3 = map.get(lVarA.f6001b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i6 = 0;
        int i10 = 1;
        while (i10 < 16) {
            i6++;
            i10 <<= 1;
        }
        int i11 = 32 - i6;
        int i12 = i10 - 1;
        n[] nVarArr = new n[16];
        for (int i13 = 0; i13 < 16; i13++) {
            nVarArr[i13] = new n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i11);
        putFieldPutFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f5984a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.f6001b);
                objectOutputStream.writeObject(lVarA.f6002c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j6;
        long j10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        l lVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j6 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j12++;
            lVar = new l(i(object.hashCode()), object, object2, lVar);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j13 = (long) (((double) (j12 / 0.75f)) + 1.0d);
        int iL = j13 >= 1073741824 ? BasicMeasure.EXACTLY : l((int) j13);
        l[] lVarArr = new l[iL];
        int i6 = iL - 1;
        while (lVar != null) {
            l lVar2 = lVar.f6003d;
            int i10 = lVar.f6000a;
            int i11 = i10 & i6;
            l lVarK = k(lVarArr, i11);
            boolean z9 = true;
            if (lVarK == null) {
                j10 = j6;
            } else {
                Object obj2 = lVar.f6001b;
                if (lVarK.f6000a < 0) {
                    if (((q) lVarK).e(i10, obj2, lVar.f6002c) == null) {
                        j11 += j6;
                    }
                    j10 = j6;
                } else {
                    j10 = j6;
                    int i12 = 0;
                    for (l lVar3 = lVarK; lVar3 != null; lVar3 = lVar3.f6003d) {
                        if (lVar3.f6000a == i10 && ((obj = lVar3.f6001b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z9 = false;
                            break;
                        }
                        i12++;
                    }
                    if (z9 && i12 >= 8) {
                        j11 += j10;
                        lVar.f6003d = lVarK;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            r rVar3 = new r(lVar4.f6000a, lVar4.f6001b, lVar4.f6002c, null, null);
                            rVar3.h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f6003d = rVar3;
                            }
                            lVar4 = lVar4.f6003d;
                            rVar2 = rVar3;
                        }
                        h(lVarArr, i11, new q(rVar));
                    }
                }
                z9 = false;
            }
            if (z9) {
                j11 += j10;
                lVar.f6003d = lVarK;
                h(lVarArr, i11, lVar);
            }
            lVar = lVar2;
            j6 = j10;
        }
        this.f5984a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j11;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k5, V v) {
        return (V) f(k5, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f5984a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f6001b, lVarA.f6002c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f5984a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.f6002c;
            Object obj2 = lVarA.f6001b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.f6002c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f5984a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f6000a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f6000a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f6001b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f6002c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f6002c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f6003d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f6003d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f6003d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f6013e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f6002c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f6002c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object objApply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i6 = i(obj.hashCode());
        l[] lVarArrE = this.f5984a;
        int i10 = 0;
        Object objApply2 = null;
        int i11 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i12 = (length - 1) & i6;
                    l lVarK = k(lVarArrE, i12);
                    if (lVarK == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArrE, i12, mVar)) {
                                    try {
                                        objApply2 = biFunction.apply(obj, null);
                                        if (objApply2 != null) {
                                            lVar = new l(i6, obj, objApply2);
                                            i11 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArrE, i12, lVar);
                                        i10 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArrE, i12, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i13 = lVarK.f6000a;
                        if (i13 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i12) == lVarK) {
                                        if (i13 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = lVarK;
                                            i10 = 1;
                                            while (true) {
                                                if (lVar3.f6000a == i6 && ((obj2 = lVar3.f6001b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar4 = lVar3.f6003d;
                                                if (lVar4 == null) {
                                                    objApply = biFunction.apply(obj, null);
                                                    if (objApply != null) {
                                                        if (lVar3.f6003d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar3.f6003d = new l(i6, obj, objApply);
                                                        i11 = 1;
                                                    }
                                                } else {
                                                    i10++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, lVar3.f6002c);
                                            if (objApply3 != null) {
                                                lVar3.f6002c = objApply3;
                                                objApply2 = objApply3;
                                            } else {
                                                l lVar5 = lVar3.f6003d;
                                                if (lVar2 != null) {
                                                    lVar2.f6003d = lVar5;
                                                } else {
                                                    h(lVarArrE, i12, lVar5);
                                                }
                                                objApply2 = objApply3;
                                                i11 = -1;
                                            }
                                        } else if (lVarK instanceof q) {
                                            q qVar = (q) lVarK;
                                            r rVar = qVar.f6013e;
                                            r rVarB = rVar != null ? rVar.b(i6, obj, null) : null;
                                            objApply = biFunction.apply(obj, rVarB == null ? null : rVarB.f6002c);
                                            if (objApply != null) {
                                                if (rVarB != null) {
                                                    rVarB.f6002c = objApply;
                                                } else {
                                                    qVar.e(i6, obj, objApply);
                                                    i11 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i12, p(qVar.f));
                                                }
                                                i11 = -1;
                                            }
                                            i10 = 1;
                                            objApply2 = objApply;
                                        } else if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArrE, i12);
                                }
                            }
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i11 != 0) {
            a(i11, i10);
        }
        return objApply2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public final l[] e() {
        while (true) {
            l[] lVarArr = this.f5984a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i6 = this.sizeCtl;
            if (i6 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i6, -1)) {
                try {
                    l[] lVarArr2 = this.f5984a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i10 = i6 > 0 ? i6 : 16;
                        l[] lVarArr3 = new l[i10];
                        this.f5984a = lVarArr3;
                        i6 = i10 - (i10 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i6;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i6;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0140, code lost:
    
        if (r1.f5986c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0142, code lost:
    
        r1.f5986c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r25, int r27) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    public final l[] d(l[] lVarArr, l lVar) {
        int i6;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).f5995e;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (lVarArr2 == this.f5985b && this.f5984a == lVarArr && (i6 = this.sizeCtl) < 0 && (i6 >>> 16) == iNumberOfLeadingZeros && i6 != iNumberOfLeadingZeros + 1 && i6 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
                if (h.c(this, i, i6, i6 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.f5984a;
    }

    public final void o(int i6) {
        int length;
        int iL = i6 >= 536870912 ? 1073741824 : l(i6 + (i6 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                break;
            }
            l[] lVarArr = this.f5984a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i11 = i10 > iL ? i10 : iL;
                if (h.c(this, i, i10, -1)) {
                    try {
                        if (this.f5984a == lVarArr) {
                            this.f5984a = new l[i11];
                            i10 = i11 - (i11 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i10;
                    }
                } else {
                    continue;
                }
            } else if (iL <= i10 || length >= 1073741824) {
                break;
            } else if (lVarArr == this.f5984a) {
                if (h.c(this, i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    m(lVarArr, null);
                }
            }
        }
    }

    public final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i6;
        int i10;
        int i11;
        int i12;
        boolean z9;
        char c9;
        int i13;
        int i14;
        l qVar;
        l qVar2;
        l lVar;
        int i15;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = lVarArr.length;
        int i16 = g;
        boolean z10 = true;
        int i17 = i16 > 1 ? (length >>> 3) / i16 : length;
        char c10 = 16;
        int i18 = i17 < 16 ? 16 : i17;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr4 = new l[length << 1];
                concurrentHashMap.f5985b = lVarArr4;
                concurrentHashMap.transferIndex = length;
                lVarArr3 = lVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar = new g(lVarArr3);
        boolean zB = true;
        int i19 = 0;
        int i20 = 0;
        boolean z11 = false;
        while (true) {
            if (zB) {
                int i21 = i19 - 1;
                if (i21 >= i20 || z11) {
                    i20 = i20;
                    i19 = i21;
                    zB = false;
                } else {
                    int i22 = concurrentHashMap.transferIndex;
                    if (i22 <= 0) {
                        i19 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        int i23 = i20;
                        long j6 = j;
                        if (i22 > i18) {
                            i10 = i23;
                            i11 = i22 - i18;
                            i6 = i21;
                        } else {
                            i6 = i21;
                            i10 = i23;
                            i11 = 0;
                        }
                        boolean zC = aVar.c(concurrentHashMap, j6, i22, i11);
                        i20 = i11;
                        if (zC) {
                            i19 = i22 - 1;
                        } else {
                            i20 = i10;
                            i19 = i6;
                        }
                    }
                    zB = false;
                }
            } else {
                int i24 = i20;
                r rVar = null;
                l lVar2 = null;
                if (i19 < 0 || i19 >= length || (i14 = i19 + length) >= length2) {
                    i12 = length;
                    z9 = z10;
                    c9 = c10;
                    i13 = i18;
                    if (z11) {
                        concurrentHashMap.f5985b = null;
                        concurrentHashMap.f5984a = lVarArr3;
                        concurrentHashMap.sizeCtl = (i12 << 1) - (i12 >>> 1);
                        return;
                    }
                    int i25 = i19;
                    j$.sun.misc.a aVar2 = h;
                    long j10 = i;
                    int i26 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j10, i26, i26 - 1)) {
                        i19 = i25;
                    } else {
                        if (i26 - 2 != ((Integer.numberOfLeadingZeros(i12) | 32768) << 16)) {
                            return;
                        }
                        zB = z9;
                        z11 = zB;
                        i19 = i12;
                    }
                } else {
                    l lVarK = k(lVarArr, i19);
                    if (lVarK == null) {
                        zB = b(lVarArr, i19, gVar);
                        i12 = length;
                        z9 = z10;
                        c9 = c10;
                        i13 = i18;
                    } else {
                        z9 = z10;
                        int i27 = lVarK.f6000a;
                        if (i27 == -1) {
                            i12 = length;
                            c9 = c10;
                            i13 = i18;
                            zB = z9;
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArr, i19) == lVarK) {
                                        if (i27 >= 0) {
                                            int i28 = i27 & length;
                                            l lVar3 = lVarK.f6003d;
                                            l lVar4 = lVarK;
                                            while (lVar3 != null) {
                                                char c11 = c10;
                                                int i29 = lVar3.f6000a & length;
                                                if (i29 != i28) {
                                                    lVar4 = lVar3;
                                                    i28 = i29;
                                                }
                                                lVar3 = lVar3.f6003d;
                                                c10 = c11;
                                            }
                                            c9 = c10;
                                            if (i28 == 0) {
                                                lVar = null;
                                                lVar2 = lVar4;
                                            } else {
                                                lVar = lVar4;
                                            }
                                            l lVar5 = lVarK;
                                            while (lVar5 != lVar4) {
                                                int i30 = lVar5.f6000a;
                                                Object obj = lVar5.f6001b;
                                                int i31 = length;
                                                Object obj2 = lVar5.f6002c;
                                                if ((i30 & i31) == 0) {
                                                    i15 = i18;
                                                    lVar2 = new l(i30, obj, obj2, lVar2);
                                                } else {
                                                    i15 = i18;
                                                    lVar = new l(i30, obj, obj2, lVar);
                                                }
                                                lVar5 = lVar5.f6003d;
                                                length = i31;
                                                i18 = i15;
                                            }
                                            i12 = length;
                                            i13 = i18;
                                            h(lVarArr3, i19, lVar2);
                                            h(lVarArr3, i14, lVar);
                                            h(lVarArr, i19, gVar);
                                        } else {
                                            i12 = length;
                                            c9 = c10;
                                            i13 = i18;
                                            if (lVarK instanceof q) {
                                                q qVar3 = (q) lVarK;
                                                r rVar2 = null;
                                                r rVar3 = null;
                                                l lVar6 = qVar3.f;
                                                int i32 = 0;
                                                int i33 = 0;
                                                r rVar4 = null;
                                                while (lVar6 != null) {
                                                    q qVar4 = qVar3;
                                                    int i34 = lVar6.f6000a;
                                                    r rVar5 = new r(i34, lVar6.f6001b, lVar6.f6002c, null, null);
                                                    if ((i34 & i12) == 0) {
                                                        rVar5.h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar = rVar5;
                                                        } else {
                                                            rVar3.f6003d = rVar5;
                                                        }
                                                        i32++;
                                                        rVar3 = rVar5;
                                                    } else {
                                                        rVar5.h = rVar2;
                                                        if (rVar2 == null) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            rVar2.f6003d = rVar5;
                                                        }
                                                        i33++;
                                                        rVar2 = rVar5;
                                                    }
                                                    lVar6 = lVar6.f6003d;
                                                    qVar3 = qVar4;
                                                }
                                                q qVar5 = qVar3;
                                                if (i32 <= 6) {
                                                    qVar = p(rVar);
                                                } else {
                                                    qVar = i33 != 0 ? new q(rVar) : qVar5;
                                                }
                                                if (i33 <= 6) {
                                                    qVar2 = p(rVar4);
                                                } else {
                                                    qVar2 = i32 != 0 ? new q(rVar4) : qVar5;
                                                }
                                                h(lVarArr3, i19, qVar);
                                                h(lVarArr3, i14, qVar2);
                                                h(lVarArr, i19, gVar);
                                            }
                                        }
                                        zB = z9;
                                    } else {
                                        i12 = length;
                                        c9 = c10;
                                        i13 = i18;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i20 = i24;
                z10 = z9;
                c10 = c9;
                length = i12;
                i18 = i13;
            }
        }
    }

    public final long j() {
        c[] cVarArr = this.f5986c;
        long j6 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j6 += cVar.value;
                }
            }
        }
        return j6;
    }

    public final void n(l[] lVarArr, int i6) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l lVarK = k(lVarArr, i6);
        if (lVarK == null || lVarK.f6000a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i6) == lVarK) {
                    r rVar = null;
                    r rVar2 = null;
                    l lVar = lVarK;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f6000a, lVar.f6001b, lVar.f6002c, null, null);
                        rVar3.h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f6003d = rVar3;
                        }
                        lVar = lVar.f6003d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i6, new q(rVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (l lVar3 = rVar; lVar3 != null; lVar3 = lVar3.f6003d) {
            l lVar4 = new l(lVar3.f6000a, lVar3.f6001b, lVar3.f6002c);
            if (lVar2 == null) {
                lVar = lVar4;
            } else {
                lVar2.f6003d = lVar4;
            }
            lVar2 = lVar4;
        }
        return lVar;
    }
}
