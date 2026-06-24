package com.google.gson.internal.bind;

import a4.x;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.internal.h;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import k0.k;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final j A;
    public static final j B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f3192a = new TypeAdapters$29(Class.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.i
        public final Object b(k3.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported")));
        }

        @Override // com.google.gson.i
        public final void c(k3.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3193b = new TypeAdapters$29(BitSet.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.i
        public final Object b(k3.a aVar) throws IOException {
            boolean zU;
            BitSet bitSet = new BitSet();
            aVar.b();
            int iH = aVar.H();
            int i6 = 0;
            while (iH != 2) {
                int iC = c.j.c(iH);
                if (iC == 5 || iC == 6) {
                    int iZ = aVar.z();
                    if (iZ == 0) {
                        zU = false;
                    } else {
                        if (iZ != 1) {
                            StringBuilder sbP = x.p(iZ, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbP.append(aVar.j(true));
                            throw new com.google.gson.e(sbP.toString());
                        }
                        zU = true;
                    }
                } else {
                    if (iC != 7) {
                        throw new com.google.gson.e("Invalid bitset value type: " + k.m(iH) + "; at path " + aVar.j(false));
                    }
                    zU = aVar.u();
                }
                if (zU) {
                    bitSet.set(i6);
                }
                i6++;
                iH = aVar.H();
            }
            aVar.f();
            return bitSet;
        }

        @Override // com.google.gson.i
        public final void c(k3.b bVar, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            bVar.c();
            int length = bitSet.length();
            for (int i6 = 0; i6 < length; i6++) {
                bVar.A(bitSet.get(i6) ? 1L : 0L);
            }
            bVar.f();
        }
    }.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f3194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f3195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f3196e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f3197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f3198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f3199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f3200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f3201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f3202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f3203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f3204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f3205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f3206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f3207u;
    public static final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f3208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f3209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f3210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final i f3211z;

    static {
        i iVar = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                int iH = aVar.H();
                if (iH != 9) {
                    return iH == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.F())) : Boolean.valueOf(aVar.u());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.n();
                    return;
                }
                bVar.E();
                bVar.b();
                bVar.f6966a.write(bool.booleanValue() ? "true" : "false");
            }
        };
        f3194c = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return Boolean.valueOf(aVar.F());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                bVar.C(bool == null ? "null" : bool.toString());
            }
        };
        f3195d = new TypeAdapters$30(Boolean.TYPE, Boolean.class, iVar);
        f3196e = new TypeAdapters$30(Byte.TYPE, Byte.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    int iZ = aVar.z();
                    if (iZ <= 255 && iZ >= -128) {
                        return Byte.valueOf((byte) iZ);
                    }
                    StringBuilder sbP = x.p(iZ, "Lossy conversion from ", " to byte; at path ");
                    sbP.append(aVar.j(true));
                    throw new com.google.gson.e(sbP.toString());
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.e(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.n();
                } else {
                    bVar.A(r4.byteValue());
                }
            }
        });
        f = new TypeAdapters$30(Short.TYPE, Short.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    int iZ = aVar.z();
                    if (iZ <= 65535 && iZ >= -32768) {
                        return Short.valueOf((short) iZ);
                    }
                    StringBuilder sbP = x.p(iZ, "Lossy conversion from ", " to short; at path ");
                    sbP.append(aVar.j(true));
                    throw new com.google.gson.e(sbP.toString());
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.e(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.n();
                } else {
                    bVar.A(r4.shortValue());
                }
            }
        });
        g = new TypeAdapters$30(Integer.TYPE, Integer.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.z());
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.e(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    bVar.n();
                } else {
                    bVar.A(r4.intValue());
                }
            }
        });
        h = new TypeAdapters$29(AtomicInteger.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) {
                try {
                    return new AtomicInteger(aVar.z());
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.e(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.A(((AtomicInteger) obj).get());
            }
        }.a());
        i = new TypeAdapters$29(AtomicBoolean.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) {
                return new AtomicBoolean(aVar.u());
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.D(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new TypeAdapters$29(AtomicIntegerArray.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.n()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.z()));
                    } catch (NumberFormatException e10) {
                        throw new com.google.gson.e(e10);
                    }
                }
                aVar.f();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i6 = 0; i6 < size; i6++) {
                    atomicIntegerArray.set(i6, ((Integer) arrayList.get(i6)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.c();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i6 = 0; i6 < length; i6++) {
                    bVar.A(r6.get(i6));
                }
                bVar.f();
            }
        }.a());
        f3197k = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.A());
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.e(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.n();
                } else {
                    bVar.A(number.longValue());
                }
            }
        };
        new i() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return Float.valueOf((float) aVar.y());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    bVar.n();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                bVar.B(numberValueOf);
            }
        };
        new i() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return Double.valueOf(aVar.y());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.n();
                } else {
                    bVar.z(number.doubleValue());
                }
            }
        };
        f3198l = new TypeAdapters$30(Character.TYPE, Character.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String strF = aVar.F();
                if (strF.length() == 1) {
                    return Character.valueOf(strF.charAt(0));
                }
                StringBuilder sbV = x.v("Expecting character, got: ", strF, "; at ");
                sbV.append(aVar.j(true));
                throw new com.google.gson.e(sbV.toString());
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Character ch = (Character) obj;
                bVar.C(ch == null ? null : String.valueOf(ch));
            }
        });
        i iVar2 = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                int iH = aVar.H();
                if (iH != 9) {
                    return iH == 8 ? Boolean.toString(aVar.u()) : aVar.F();
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.C((String) obj);
            }
        };
        f3199m = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String strF = aVar.F();
                try {
                    return f.i(strF);
                } catch (NumberFormatException e10) {
                    StringBuilder sbV = x.v("Failed parsing '", strF, "' as BigDecimal; at path ");
                    sbV.append(aVar.j(true));
                    throw new com.google.gson.e(sbV.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.B((BigDecimal) obj);
            }
        };
        f3200n = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String strF = aVar.F();
                try {
                    f.c(strF);
                    return new BigInteger(strF);
                } catch (NumberFormatException e10) {
                    StringBuilder sbV = x.v("Failed parsing '", strF, "' as BigInteger; at path ");
                    sbV.append(aVar.j(true));
                    throw new com.google.gson.e(sbV.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.B((BigInteger) obj);
            }
        };
        f3201o = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return new h(aVar.F());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.B((h) obj);
            }
        };
        f3202p = new TypeAdapters$29(String.class, iVar2);
        f3203q = new TypeAdapters$29(StringBuilder.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return new StringBuilder(aVar.F());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                bVar.C(sb == null ? null : sb.toString());
            }
        });
        f3204r = new TypeAdapters$29(StringBuffer.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return new StringBuffer(aVar.F());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.C(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f3205s = new TypeAdapters$29(URL.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String strF = aVar.F();
                if (strF.equals("null")) {
                    return null;
                }
                return new URL(strF);
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                URL url = (URL) obj;
                bVar.C(url == null ? null : url.toExternalForm());
            }
        });
        f3206t = new TypeAdapters$29(URI.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    String strF = aVar.F();
                    if (strF.equals("null")) {
                        return null;
                    }
                    return new URI(strF);
                } catch (URISyntaxException e10) {
                    throw new com.google.gson.e(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                URI uri = (URI) obj;
                bVar.C(uri == null ? null : uri.toASCIIString());
            }
        });
        final i iVar3 = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() != 9) {
                    return InetAddress.getByName(aVar.F());
                }
                aVar.D();
                return null;
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                bVar.C(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f3207u = new j() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                final Class<?> cls2 = typeToken.f3266a;
                if (cls.isAssignableFrom(cls2)) {
                    return new i() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.i
                        public final Object b(k3.a aVar) {
                            Object objB = iVar3.b(aVar);
                            if (objB != null) {
                                Class cls3 = cls2;
                                if (!cls3.isInstance(objB)) {
                                    throw new com.google.gson.e("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.j(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.i
                        public final void c(k3.b bVar2, Object obj) {
                            iVar3.c(bVar2, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + iVar3 + "]";
            }
        };
        v = new TypeAdapters$29(UUID.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String strF = aVar.F();
                try {
                    return UUID.fromString(strF);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbV = x.v("Failed parsing '", strF, "' as UUID; at path ");
                    sbV.append(aVar.j(true));
                    throw new com.google.gson.e(sbV.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                bVar.C(uuid == null ? null : uuid.toString());
            }
        });
        f3208w = new TypeAdapters$29(Currency.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) {
                String strF = aVar.F();
                try {
                    return Currency.getInstance(strF);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbV = x.v("Failed parsing '", strF, "' as Currency; at path ");
                    sbV.append(aVar.j(true));
                    throw new com.google.gson.e(sbV.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                bVar.C(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final i iVar4 = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                int iZ;
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                aVar.c();
                int i6 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (aVar.H() == 4) {
                        aVar.h();
                        return new GregorianCalendar(i6, i10, i11, i12, i13, i14);
                    }
                    String strB = aVar.B();
                    iZ = aVar.z();
                    switch (strB) {
                        case "dayOfMonth":
                            i11 = iZ;
                            break;
                        case "minute":
                            i13 = iZ;
                            break;
                        case "second":
                            i14 = iZ;
                            break;
                        case "year":
                            i6 = iZ;
                            break;
                        case "month":
                            i10 = iZ;
                            break;
                        case "hourOfDay":
                            i12 = iZ;
                            break;
                    }
                }
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                if (((Calendar) obj) == null) {
                    bVar.n();
                    return;
                }
                bVar.d();
                bVar.i("year");
                bVar.A(r4.get(1));
                bVar.i("month");
                bVar.A(r4.get(2));
                bVar.i("dayOfMonth");
                bVar.A(r4.get(5));
                bVar.i("hourOfDay");
                bVar.A(r4.get(11));
                bVar.i("minute");
                bVar.A(r4.get(12));
                bVar.i("second");
                bVar.A(r4.get(13));
                bVar.h();
            }
        };
        f3209x = new j() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                Class cls2 = typeToken.f3266a;
                if (cls2 == Calendar.class || cls2 == GregorianCalendar.class) {
                    return iVar4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + iVar4 + "]";
            }
        };
        f3210y = new TypeAdapters$29(Locale.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.i
            public final Object b(k3.a aVar) throws IOException {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.F(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.i
            public final void c(k3.b bVar, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                bVar.C(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f3147a;
        f3211z = jsonElementTypeAdapter;
        final Class<com.google.gson.d> cls2 = com.google.gson.d.class;
        A = new j() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                final Class cls22 = typeToken.f3266a;
                if (cls2.isAssignableFrom(cls22)) {
                    return new i() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.i
                        public final Object b(k3.a aVar) {
                            Object objB = jsonElementTypeAdapter.b(aVar);
                            if (objB != null) {
                                Class cls3 = cls22;
                                if (!cls3.isInstance(objB)) {
                                    throw new com.google.gson.e("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.j(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.i
                        public final void c(k3.b bVar2, Object obj) {
                            jsonElementTypeAdapter.c(bVar2, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        B = EnumTypeAdapter.f3140d;
    }

    public static j a(Class cls, i iVar) {
        return new TypeAdapters$29(cls, iVar);
    }

    public static j b(Class cls, Class cls2, i iVar) {
        return new TypeAdapters$30(cls, cls2, iVar);
    }
}
