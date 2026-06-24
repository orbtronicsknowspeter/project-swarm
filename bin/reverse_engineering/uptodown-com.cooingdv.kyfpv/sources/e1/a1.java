package e1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.t5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends p4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3760m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(u4 u4Var, int i) {
        super(u4Var);
        this.f3760m = i;
    }

    public static boolean M(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean N(p5 p5Var, int i) {
        if (i < p5Var.size() * 64) {
            return ((1 << (i % 64)) & ((Long) p5Var.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i6 = 0; i6 < 64; i6++) {
                int i10 = (i * 64) + i6;
                if (i10 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i10)) {
                    j |= 1 << i6;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static k5 T(k5 k5Var, byte[] bArr) throws t5 {
        com.google.android.gms.internal.measurement.d5 d5VarU;
        com.google.android.gms.internal.measurement.d5 d5Var = com.google.android.gms.internal.measurement.d5.f2539a;
        if (d5Var == null) {
            synchronized (com.google.android.gms.internal.measurement.d5.class) {
                try {
                    d5VarU = com.google.android.gms.internal.measurement.d5.f2539a;
                    if (d5VarU == null) {
                        j6 j6Var = j6.f2671c;
                        d5VarU = i5.U();
                        com.google.android.gms.internal.measurement.d5.f2539a = d5VarU;
                    }
                } finally {
                }
            }
            d5Var = d5VarU;
        }
        if (d5Var != null) {
            k5Var.getClass();
            k5Var.f(bArr, bArr.length, d5Var);
            return k5Var;
        }
        k5Var.getClass();
        int length = bArr.length;
        com.google.android.gms.internal.measurement.d5 d5Var2 = com.google.android.gms.internal.measurement.d5.f2539a;
        j6 j6Var2 = j6.f2671c;
        k5Var.f(bArr, length, com.google.android.gms.internal.measurement.d5.f2540b);
        return k5Var;
    }

    public static int U(com.google.android.gms.internal.measurement.i3 i3Var, String str) {
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).U1(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).V1(i).q())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] V(q5 q5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = q5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            if (e3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.e3 e3Var2 : e3Var.y()) {
                    if (e3Var2.q()) {
                        bundle.putString(e3Var2.p(), e3Var2.r());
                    } else if (e3Var2.s()) {
                        bundle.putLong(e3Var2.p(), e3Var2.t());
                    } else if (e3Var2.w()) {
                        bundle.putDouble(e3Var2.p(), e3Var2.x());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap W(boolean z9, Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z9) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(W(false, (Bundle) parcelable));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(W(false, (Bundle) obj2));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(W(false, (Bundle) obj));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static u k(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleL = l(bVar.f2510c, true);
        String string = (!bundleL.containsKey("_o") || (obj = bundleL.get("_o")) == null) ? "app" : obj.toString();
        String strG = k2.g(bVar.f2508a, k2.f4073a, k2.f4075c);
        if (strG == null) {
            strG = bVar.f2508a;
        }
        return new u(strG, new t(bundleL), string, bVar.f2509b);
    }

    public static Bundle l(Map map, boolean z9) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z9) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(l((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void m(com.google.android.gms.internal.measurement.a3 a3Var, String str, Long l10) {
        List listG = a3Var.g();
        int i = 0;
        while (true) {
            if (i >= listG.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.e3) listG.get(i)).p())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.d3 d3VarA = com.google.android.gms.internal.measurement.e3.A();
        d3VarA.g(str);
        d3VarA.i(l10.longValue());
        if (i < 0) {
            a3Var.k(d3VarA);
        } else {
            a3Var.b();
            ((com.google.android.gms.internal.measurement.b3) a3Var.f2687b).z(i, (com.google.android.gms.internal.measurement.e3) d3VarA.d());
        }
    }

    public static final Bundle n(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            String strP = e3Var.p();
            if (e3Var.w()) {
                bundle.putDouble(strP, e3Var.x());
            } else if (e3Var.u()) {
                bundle.putFloat(strP, e3Var.v());
            } else if (e3Var.q()) {
                bundle.putString(strP, e3Var.r());
            } else if (e3Var.s()) {
                bundle.putLong(strP, e3Var.t());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.e3 o(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.o()) {
            if (e3Var.p().equals(str)) {
                return e3Var;
            }
        }
        return null;
    }

    public static final Serializable p(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        com.google.android.gms.internal.measurement.e3 e3VarO = o(b3Var, str);
        if (e3VarO == null) {
            return null;
        }
        return v(e3VarO);
    }

    public static final void s(int i, StringBuilder sb) {
        for (int i6 = 0; i6 < i; i6++) {
            sb.append("  ");
        }
    }

    public static final void t(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String u(boolean z9, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable v(com.google.android.gms.internal.measurement.e3 e3Var) {
        if (e3Var.q()) {
            return e3Var.r();
        }
        if (e3Var.s()) {
            return Long.valueOf(e3Var.t());
        }
        if (e3Var.w()) {
            return Double.valueOf(e3Var.x());
        }
        if (e3Var.z() > 0) {
            return V((q5) e3Var.y());
        }
        return null;
    }

    public static final void w(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                t(builder, str3, string, set);
            }
        }
    }

    public static final void x(StringBuilder sb, String str, com.google.android.gms.internal.measurement.m3 m3Var) {
        if (m3Var == null) {
            return;
        }
        s(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (m3Var.r() != 0) {
            s(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l10 : m3Var.q()) {
                int i6 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i = i6;
            }
            sb.append('\n');
        }
        if (m3Var.p() != 0) {
            s(4, sb);
            sb.append("status: ");
            int i10 = 0;
            for (Long l11 : m3Var.o()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (m3Var.t() != 0) {
            s(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (com.google.android.gms.internal.measurement.z2 z2Var : m3Var.s()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(z2Var.o() ? Integer.valueOf(z2Var.p()) : null);
                sb.append(":");
                sb.append(z2Var.q() ? Long.valueOf(z2Var.r()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (m3Var.v() != 0) {
            s(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.o3 o3Var : m3Var.u()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(o3Var.o() ? Integer.valueOf(o3Var.p()) : null);
                sb.append(": [");
                Iterator it = o3Var.q().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        s(3, sb);
        sb.append("}\n");
    }

    public static final void y(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        s(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void z(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        s(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (t1Var.o()) {
            int iY = t1Var.y();
            y(sb, i, "comparison_type", iY != 1 ? iY != 2 ? iY != 3 ? iY != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (t1Var.p()) {
            y(sb, i, "match_as_float", Boolean.valueOf(t1Var.q()));
        }
        if (t1Var.r()) {
            y(sb, i, "comparison_value", t1Var.s());
        }
        if (t1Var.t()) {
            y(sb, i, "min_comparison_value", t1Var.u());
        }
        if (t1Var.v()) {
            y(sb, i, "max_comparison_value", t1Var.w());
        }
        s(i, sb);
        sb.append("}\n");
    }

    public boolean A() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f3876a.f4260a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void E(com.google.android.gms.internal.measurement.r3 r3Var, Object obj) {
        k0.y.g(obj);
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.f2687b).D();
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.f2687b).F();
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.f2687b).H();
        if (obj instanceof String) {
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.f2687b).C((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.f2687b).E(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.f2687b).G(dDoubleValue);
        } else {
            w0 w0Var = this.f3876a.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void F(String str, q4 q4Var, com.google.android.gms.internal.measurement.h3 h3Var, y0 y0Var) {
        String str2;
        URL url;
        byte[] bArrA;
        q1 q1Var;
        Map map;
        String str3 = q4Var.f4220a;
        t1 t1Var = this.f3876a;
        g();
        h();
        try {
            url = new URI(str3).toURL();
            this.f4093b.j0();
            bArrA = h3Var.a();
            q1Var = t1Var.f4266p;
            t1.m(q1Var);
            map = q4Var.f4221b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            q1Var.s(new z0(this, str2, url, bArrA, map, y0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.d(w0.o(str2), "Failed to parse URL. Not uploading MeasurementBatch. appId", str3);
        }
    }

    public void G(com.google.android.gms.internal.measurement.d3 d3Var, Object obj) {
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).D();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).F();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).H();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).K();
        if (obj instanceof String) {
            d3Var.h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            d3Var.i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            d3Var.b();
            ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).G(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            w0 w0Var = this.f3876a.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.d3 d3VarA = com.google.android.gms.internal.measurement.e3.A();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.d3 d3VarA2 = com.google.android.gms.internal.measurement.e3.A();
                    d3VarA2.g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        d3VarA2.i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        d3VarA2.h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        d3VarA2.b();
                        ((com.google.android.gms.internal.measurement.e3) d3VarA2.f2687b).G(dDoubleValue2);
                    }
                    d3VarA.b();
                    ((com.google.android.gms.internal.measurement.e3) d3VarA.f2687b).I((com.google.android.gms.internal.measurement.e3) d3VarA2.d());
                }
                if (((com.google.android.gms.internal.measurement.e3) d3VarA.f2687b).z() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.e3) d3VarA.d());
                }
            }
        }
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).J(arrayList);
    }

    public j4 H(String str, com.google.android.gms.internal.measurement.i3 i3Var, com.google.android.gms.internal.measurement.a3 a3Var, String str2) {
        int iIndexOf;
        f8.a();
        t1 t1Var = this.f3876a;
        g gVar = t1Var.f4263m;
        if (!gVar.q(str, f0.Q0)) {
            return null;
        }
        t1Var.f4270t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = gVar.m(str, f0.f3959v0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                c2.a.h(str3, "duplicate element: ");
                return null;
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        u4 u4Var = this.f4093b;
        r4 r4Var = u4Var.f4315s;
        m1 m1Var = u4Var.f4306a;
        m1 m1Var2 = r4Var.f4093b.f4306a;
        u4.U(m1Var2);
        String strT = m1Var2.t(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = r4Var.f3876a.f4263m;
        builder.scheme(gVar2.m(str, f0.f3946o0));
        if (TextUtils.isEmpty(strT)) {
            builder.authority(gVar2.m(str, f0.f3948p0));
        } else {
            String strM = gVar2.m(str, f0.f3948p0);
            StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(strM).length());
            sb.append(strT);
            sb.append(".");
            sb.append(strM);
            builder.authority(sb.toString());
        }
        builder.path(gVar2.m(str, f0.f3950q0));
        t(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).D(), setUnmodifiableSet);
        gVar.l();
        t(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strX = ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).x();
        e0 e0Var = f0.T0;
        if (gVar.q(str, e0Var)) {
            u4.U(m1Var);
            if (m1Var.z(str)) {
                strX = "";
            }
        }
        t(builder, "app_instance_id", strX, setUnmodifiableSet);
        t(builder, "rdid", ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).u(), setUnmodifiableSet);
        t(builder, "bundle_id", i3Var.n(), setUnmodifiableSet);
        String strM2 = a3Var.m();
        String strG = k2.g(strM2, k2.f4075c, k2.f4073a);
        if (true != TextUtils.isEmpty(strG)) {
            strM2 = strG;
        }
        t(builder, "app_event_name", strM2, setUnmodifiableSet);
        t(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).J()), setUnmodifiableSet);
        String strH2 = ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).h2();
        if (gVar.q(str, e0Var)) {
            u4.U(m1Var);
            if (m1Var.y(str) && !TextUtils.isEmpty(strH2) && (iIndexOf = strH2.indexOf(".")) != -1) {
                strH2 = strH2.substring(0, iIndexOf);
            }
        }
        t(builder, "os_version", strH2, setUnmodifiableSet);
        t(builder, "timestamp", String.valueOf(a3Var.n()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).w()) {
            t(builder, "lat", "1", setUnmodifiableSet);
        }
        t(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).F0()), setUnmodifiableSet);
        t(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        t(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        t(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.e3> listG = a3Var.g();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.e3 e3Var : listG) {
            String strP = e3Var.p();
            if (e3Var.w()) {
                bundle.putString(strP, String.valueOf(e3Var.x()));
            } else if (e3Var.u()) {
                bundle.putString(strP, String.valueOf(e3Var.v()));
            } else if (e3Var.q()) {
                bundle.putString(strP, e3Var.r());
            } else if (e3Var.s()) {
                bundle.putString(strP, String.valueOf(e3Var.t()));
            }
        }
        w(builder, gVar.m(str, f0.f3958u0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.s3> listUnmodifiableList = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).T1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.s3 s3Var : listUnmodifiableList) {
            String strQ = s3Var.q();
            if (s3Var.x()) {
                bundle2.putString(strQ, String.valueOf(s3Var.y()));
            } else if (s3Var.v()) {
                bundle2.putString(strQ, String.valueOf(s3Var.w()));
            } else if (s3Var.r()) {
                bundle2.putString(strQ, s3Var.s());
            } else if (s3Var.t()) {
                bundle2.putString(strQ, String.valueOf(s3Var.u()));
            }
        }
        w(builder, gVar.m(str, f0.f3956t0).split("\\|"), bundle2, setUnmodifiableSet);
        t(builder, "dma", true != ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).C0() ? "0" : "1", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).E0().isEmpty()) {
            t(builder, "dma_cps", ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).E0(), setUnmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).K0()) {
            com.google.android.gms.internal.measurement.o2 o2VarL0 = ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).L0();
            if (!o2VarL0.y().isEmpty()) {
                t(builder, "dl_gclid", o2VarL0.y(), setUnmodifiableSet);
            }
            if (!o2VarL0.A().isEmpty()) {
                t(builder, "dl_gbraid", o2VarL0.A(), setUnmodifiableSet);
            }
            if (!o2VarL0.C().isEmpty()) {
                t(builder, "dl_gs", o2VarL0.C(), setUnmodifiableSet);
            }
            if (o2VarL0.E() > 0) {
                t(builder, "dl_ss_ts", String.valueOf(o2VarL0.E()), setUnmodifiableSet);
            }
            if (!o2VarL0.G().isEmpty()) {
                t(builder, "mr_gclid", o2VarL0.G(), setUnmodifiableSet);
            }
            if (!o2VarL0.I().isEmpty()) {
                t(builder, "mr_gbraid", o2VarL0.I(), setUnmodifiableSet);
            }
            if (!o2VarL0.K().isEmpty()) {
                t(builder, "mr_gs", o2VarL0.K(), setUnmodifiableSet);
            }
            if (o2VarL0.M() > 0) {
                t(builder, "mr_click_ts", String.valueOf(o2VarL0.M()), setUnmodifiableSet);
            }
        }
        return new j4(builder.build().toString(), 1, jCurrentTimeMillis);
    }

    public com.google.android.gms.internal.measurement.b3 I(q qVar) {
        com.google.android.gms.internal.measurement.a3 a3VarY = com.google.android.gms.internal.measurement.b3.y();
        long j = qVar.f4198e;
        a3VarY.b();
        ((com.google.android.gms.internal.measurement.b3) a3VarY.f2687b).G(j);
        t tVar = qVar.f;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.f4252a;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.d3 d3VarA = com.google.android.gms.internal.measurement.e3.A();
            d3VarA.g(str);
            Object obj = bundle.get(str);
            k0.y.g(obj);
            G(d3VarA, obj);
            a3VarY.k(d3VarA);
        }
        String str2 = qVar.f4196c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.d3 d3VarA2 = com.google.android.gms.internal.measurement.e3.A();
            d3VarA2.g("_o");
            d3VarA2.h(str2);
            a3VarY.j((com.google.android.gms.internal.measurement.e3) d3VarA2.d());
        }
        return (com.google.android.gms.internal.measurement.b3) a3VarY.d();
    }

    public String J(com.google.android.gms.internal.measurement.h3 h3Var) {
        com.google.android.gms.internal.measurement.r2 r2VarH0;
        StringBuilder sbT = a4.x.t("\nbatch {\n");
        if (h3Var.t()) {
            y(sbT, 0, "upload_subdomain", h3Var.u());
        }
        if (h3Var.r()) {
            y(sbT, 0, "sgtm_join_id", h3Var.s());
        }
        for (com.google.android.gms.internal.measurement.j3 j3Var : h3Var.o()) {
            if (j3Var != null) {
                s(1, sbT);
                sbT.append("bundle {\n");
                if (j3Var.O()) {
                    y(sbT, 1, "protocol_version", Integer.valueOf(j3Var.O0()));
                }
                t1 t1Var = this.f3876a;
                g gVar = t1Var.f4263m;
                q0 q0Var = t1Var.f4269s;
                if (gVar.q(j3Var.o(), f0.N0) && j3Var.u0()) {
                    y(sbT, 1, "session_stitching_token", j3Var.v0());
                }
                y(sbT, 1, "platform", j3Var.g2());
                if (j3Var.q()) {
                    y(sbT, 1, "gmp_version", Long.valueOf(j3Var.r()));
                }
                if (j3Var.s()) {
                    y(sbT, 1, "uploading_gmp_version", Long.valueOf(j3Var.t()));
                }
                if (j3Var.q0()) {
                    y(sbT, 1, "dynamite_version", Long.valueOf(j3Var.r0()));
                }
                if (j3Var.K()) {
                    y(sbT, 1, "config_version", Long.valueOf(j3Var.L()));
                }
                y(sbT, 1, "gmp_app_id", j3Var.D());
                y(sbT, 1, "app_id", j3Var.o());
                y(sbT, 1, "app_version", j3Var.p());
                if (j3Var.I()) {
                    y(sbT, 1, "app_version_major", Integer.valueOf(j3Var.J()));
                }
                y(sbT, 1, "firebase_instance_id", j3Var.H());
                if (j3Var.y()) {
                    y(sbT, 1, "dev_cert_hash", Long.valueOf(j3Var.z()));
                }
                y(sbT, 1, "app_store", j3Var.m2());
                if (j3Var.W1()) {
                    y(sbT, 1, "upload_timestamp_millis", Long.valueOf(j3Var.X1()));
                }
                if (j3Var.Y1()) {
                    y(sbT, 1, "start_timestamp_millis", Long.valueOf(j3Var.Z1()));
                }
                if (j3Var.a2()) {
                    y(sbT, 1, "end_timestamp_millis", Long.valueOf(j3Var.b2()));
                }
                if (j3Var.c2()) {
                    y(sbT, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(j3Var.d2()));
                }
                if (j3Var.e2()) {
                    y(sbT, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(j3Var.f2()));
                }
                y(sbT, 1, "app_instance_id", j3Var.x());
                y(sbT, 1, "resettable_device_id", j3Var.u());
                y(sbT, 1, "ds_id", j3Var.N());
                if (j3Var.v()) {
                    y(sbT, 1, "limited_ad_tracking", Boolean.valueOf(j3Var.w()));
                }
                y(sbT, 1, "os_version", j3Var.h2());
                y(sbT, 1, "device_model", j3Var.i2());
                y(sbT, 1, "user_default_language", j3Var.j2());
                if (j3Var.k2()) {
                    y(sbT, 1, "time_zone_offset_minutes", Integer.valueOf(j3Var.l2()));
                }
                if (j3Var.A()) {
                    y(sbT, 1, "bundle_sequential_index", Integer.valueOf(j3Var.B()));
                }
                if (j3Var.I0()) {
                    y(sbT, 1, "delivery_index", Integer.valueOf(j3Var.J0()));
                }
                if (j3Var.E()) {
                    y(sbT, 1, "service_upload", Boolean.valueOf(j3Var.F()));
                }
                y(sbT, 1, "health_monitor", j3Var.C());
                if (j3Var.o0()) {
                    y(sbT, 1, "retry_counter", Integer.valueOf(j3Var.p0()));
                }
                if (j3Var.s0()) {
                    y(sbT, 1, "consent_signals", j3Var.t0());
                }
                if (j3Var.B0()) {
                    y(sbT, 1, "is_dma_region", Boolean.valueOf(j3Var.C0()));
                }
                if (j3Var.D0()) {
                    y(sbT, 1, "core_platform_services", j3Var.E0());
                }
                if (j3Var.z0()) {
                    y(sbT, 1, "consent_diagnostics", j3Var.A0());
                }
                if (j3Var.w0()) {
                    y(sbT, 1, "target_os_version", Long.valueOf(j3Var.x0()));
                }
                f8.a();
                if (t1Var.f4263m.q(j3Var.o(), f0.Q0)) {
                    y(sbT, 1, "ad_services_version", Integer.valueOf(j3Var.F0()));
                    if (j3Var.G0() && (r2VarH0 = j3Var.H0()) != null) {
                        s(2, sbT);
                        sbT.append("attribution_eligibility_status {\n");
                        y(sbT, 2, "eligible", Boolean.valueOf(r2VarH0.o()));
                        y(sbT, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(r2VarH0.p()));
                        y(sbT, 2, "pre_r", Boolean.valueOf(r2VarH0.q()));
                        y(sbT, 2, "r_extensions_too_old", Boolean.valueOf(r2VarH0.r()));
                        y(sbT, 2, "adservices_extension_too_old", Boolean.valueOf(r2VarH0.s()));
                        y(sbT, 2, "ad_storage_not_allowed", Boolean.valueOf(r2VarH0.t()));
                        y(sbT, 2, "measurement_manager_disabled", Boolean.valueOf(r2VarH0.u()));
                        s(2, sbT);
                        sbT.append("}\n");
                    }
                }
                if (j3Var.K0()) {
                    com.google.android.gms.internal.measurement.o2 o2VarL0 = j3Var.L0();
                    s(2, sbT);
                    sbT.append("ad_campaign_info {\n");
                    if (o2VarL0.x()) {
                        y(sbT, 2, "deep_link_gclid", o2VarL0.y());
                    }
                    if (o2VarL0.z()) {
                        y(sbT, 2, "deep_link_gbraid", o2VarL0.A());
                    }
                    if (o2VarL0.B()) {
                        y(sbT, 2, "deep_link_gad_source", o2VarL0.C());
                    }
                    if (o2VarL0.D()) {
                        y(sbT, 2, "deep_link_session_millis", Long.valueOf(o2VarL0.E()));
                    }
                    if (o2VarL0.F()) {
                        y(sbT, 2, "market_referrer_gclid", o2VarL0.G());
                    }
                    if (o2VarL0.H()) {
                        y(sbT, 2, "market_referrer_gbraid", o2VarL0.I());
                    }
                    if (o2VarL0.J()) {
                        y(sbT, 2, "market_referrer_gad_source", o2VarL0.K());
                    }
                    if (o2VarL0.L()) {
                        y(sbT, 2, "market_referrer_click_millis", Long.valueOf(o2VarL0.M()));
                    }
                    s(2, sbT);
                    sbT.append("}\n");
                }
                if (j3Var.P()) {
                    y(sbT, 1, "batching_timestamp_millis", Long.valueOf(j3Var.Q()));
                }
                if (j3Var.M0()) {
                    com.google.android.gms.internal.measurement.q3 q3VarN0 = j3Var.N0();
                    s(2, sbT);
                    sbT.append("sgtm_diagnostics {\n");
                    int iS = q3VarN0.s();
                    y(sbT, 2, "upload_type", iS != 1 ? iS != 2 ? iS != 3 ? iS != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    y(sbT, 2, "client_upload_eligibility", androidx.lifecycle.l.F(q3VarN0.o()));
                    int iT = q3VarN0.t();
                    y(sbT, 2, "service_upload_eligibility", iT != 1 ? iT != 2 ? iT != 3 ? iT != 4 ? iT != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    s(2, sbT);
                    sbT.append("}\n");
                }
                if (j3Var.R()) {
                    com.google.android.gms.internal.measurement.x2 x2VarS = j3Var.S();
                    s(2, sbT);
                    sbT.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.w2 w2Var : x2VarS.o()) {
                        s(3, sbT);
                        sbT.append("limited_data_modes {\n");
                        int iP = w2Var.p();
                        y(sbT, 3, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, iP != 1 ? iP != 2 ? iP != 3 ? iP != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iQ = w2Var.q();
                        y(sbT, 3, "mode", iQ != 1 ? iQ != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        s(3, sbT);
                        sbT.append("}\n");
                    }
                    s(2, sbT);
                    sbT.append("}\n");
                }
                q5<com.google.android.gms.internal.measurement.s3> q5VarT1 = j3Var.T1();
                if (q5VarT1 != null) {
                    for (com.google.android.gms.internal.measurement.s3 s3Var : q5VarT1) {
                        if (s3Var != null) {
                            s(2, sbT);
                            sbT.append("user_property {\n");
                            y(sbT, 2, "set_timestamp_millis", s3Var.o() ? Long.valueOf(s3Var.p()) : null);
                            y(sbT, 2, "name", q0Var.c(s3Var.q()));
                            y(sbT, 2, "string_value", s3Var.s());
                            y(sbT, 2, "int_value", s3Var.t() ? Long.valueOf(s3Var.u()) : null);
                            y(sbT, 2, "double_value", s3Var.x() ? Double.valueOf(s3Var.y()) : null);
                            s(2, sbT);
                            sbT.append("}\n");
                        }
                    }
                }
                q5<com.google.android.gms.internal.measurement.t2> q5VarG = j3Var.G();
                if (q5VarG != null) {
                    for (com.google.android.gms.internal.measurement.t2 t2Var : q5VarG) {
                        if (t2Var != null) {
                            s(2, sbT);
                            sbT.append("audience_membership {\n");
                            if (t2Var.o()) {
                                y(sbT, 2, "audience_id", Integer.valueOf(t2Var.p()));
                            }
                            if (t2Var.t()) {
                                y(sbT, 2, "new_audience", Boolean.valueOf(t2Var.u()));
                            }
                            x(sbT, "current_data", t2Var.q());
                            if (t2Var.r()) {
                                x(sbT, "previous_data", t2Var.s());
                            }
                            s(2, sbT);
                            sbT.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.b3> listO1 = j3Var.O1();
                if (listO1 != null) {
                    for (com.google.android.gms.internal.measurement.b3 b3Var : listO1) {
                        if (b3Var != null) {
                            s(2, sbT);
                            sbT.append("event {\n");
                            y(sbT, 2, "name", q0Var.a(b3Var.r()));
                            if (b3Var.s()) {
                                y(sbT, 2, "timestamp_millis", Long.valueOf(b3Var.t()));
                            }
                            if (b3Var.u()) {
                                y(sbT, 2, "previous_timestamp_millis", Long.valueOf(b3Var.v()));
                            }
                            if (b3Var.w()) {
                                y(sbT, 2, "count", Integer.valueOf(b3Var.x()));
                            }
                            if (b3Var.p() != 0) {
                                q(sbT, 2, (q5) b3Var.o());
                            }
                            s(2, sbT);
                            sbT.append("}\n");
                        }
                    }
                }
                s(1, sbT);
                sbT.append("}\n");
            }
        }
        sbT.append("} // End-of-batch\n");
        return sbT.toString();
    }

    public String K(com.google.android.gms.internal.measurement.v1 v1Var) {
        StringBuilder sbT = a4.x.t("\nproperty_filter {\n");
        if (v1Var.o()) {
            y(sbT, 0, "filter_id", Integer.valueOf(v1Var.p()));
        }
        y(sbT, 0, "property_name", this.f3876a.f4269s.c(v1Var.q()));
        String strU = u(v1Var.s(), v1Var.t(), v1Var.v());
        if (!strU.isEmpty()) {
            y(sbT, 0, "filter_type", strU);
        }
        r(sbT, 1, v1Var.r());
        sbT.append("}\n");
        return sbT.toString();
    }

    public Parcelable L(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (l0.b unused) {
                w0 w0Var = this.f3876a.f4265o;
                t1.m(w0Var);
                w0Var.f4340o.b("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public List P(p5 p5Var, List list) {
        int i;
        ArrayList arrayList = new ArrayList(p5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            t1 t1Var = this.f3876a;
            if (iIntValue < 0) {
                w0 w0Var = t1Var.f4265o;
                t1.m(w0Var);
                w0Var.f4343r.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    w0 w0Var2 = t1Var.f4265o;
                    t1.m(w0Var2);
                    w0Var2.f4343r.d(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i6 = size2;
            i = size;
            size = i6;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean Q(long j, long j6) {
        if (j == 0 || j6 <= 0) {
            return true;
        }
        this.f3876a.f4270t.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j6;
    }

    public long R(byte[] bArr) {
        k0.y.g(bArr);
        t1 t1Var = this.f3876a;
        a5 a5Var = t1Var.f4268r;
        t1.k(a5Var);
        a5Var.g();
        MessageDigest messageDigestX = a5.x();
        if (messageDigestX != null) {
            return a5.y(messageDigestX.digest(bArr));
        }
        w0 w0Var = t1Var.f4265o;
        t1.m(w0Var);
        w0Var.f4340o.b("Failed to get MD5");
        return 0L;
    }

    public byte[] S(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            w0 w0Var = this.f3876a.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.c(e10, "Failed to gzip content");
            throw e10;
        }
    }

    @Override // e1.p4
    public final void j() {
        int i = this.f3760m;
    }

    public void q(StringBuilder sb, int i, q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        int i6 = i + 1;
        Iterator it = q5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            if (e3Var != null) {
                s(i6, sb);
                sb.append("param {\n");
                y(sb, i6, "name", e3Var.o() ? this.f3876a.f4269s.b(e3Var.p()) : null);
                y(sb, i6, "string_value", e3Var.q() ? e3Var.r() : null);
                y(sb, i6, "int_value", e3Var.s() ? Long.valueOf(e3Var.t()) : null);
                y(sb, i6, "double_value", e3Var.w() ? Double.valueOf(e3Var.x()) : null);
                if (e3Var.z() > 0) {
                    q(sb, i6, (q5) e3Var.y());
                }
                s(i6, sb);
                sb.append("}\n");
            }
        }
    }

    public void r(StringBuilder sb, int i, com.google.android.gms.internal.measurement.q1 q1Var) {
        String str;
        if (q1Var == null) {
            return;
        }
        s(i, sb);
        sb.append("filter {\n");
        if (q1Var.s()) {
            y(sb, i, "complement", Boolean.valueOf(q1Var.t()));
        }
        if (q1Var.u()) {
            y(sb, i, "param_name", this.f3876a.f4269s.b(q1Var.v()));
        }
        if (q1Var.o()) {
            int i6 = i + 1;
            com.google.android.gms.internal.measurement.w1 w1VarP = q1Var.p();
            if (w1VarP != null) {
                s(i6, sb);
                sb.append("string_filter {\n");
                if (w1VarP.o()) {
                    switch (w1VarP.w()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    y(sb, i6, "match_type", str);
                }
                if (w1VarP.p()) {
                    y(sb, i6, "expression", w1VarP.q());
                }
                if (w1VarP.r()) {
                    y(sb, i6, "case_sensitive", Boolean.valueOf(w1VarP.s()));
                }
                if (w1VarP.u() > 0) {
                    s(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : w1VarP.t()) {
                        s(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                s(i6, sb);
                sb.append("}\n");
            }
        }
        if (q1Var.q()) {
            z(sb, i + 1, "number_filter", q1Var.r());
        }
        s(i, sb);
        sb.append("}\n");
    }

    private final void B() {
    }

    private final void C() {
    }

    private final void D() {
    }
}
