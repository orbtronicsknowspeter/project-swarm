package e1;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final o f = new o((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f4170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f4172e;

    public o(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(i2.class);
        this.f4172e = enumMap;
        enumMap.put(i2.AD_USER_DATA, bool == null ? g2.UNINITIALIZED : bool.booleanValue() ? g2.GRANTED : g2.DENIED);
        this.f4168a = i;
        this.f4169b = d();
        this.f4170c = bool2;
        this.f4171d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(i2.class);
        i2[] i2VarArr = h2.DMA.f4021a;
        int length = i2VarArr.length;
        int i6 = 1;
        int i10 = 0;
        while (i10 < length) {
            enumMap.put(i2VarArr[i10], j2.e(strArrSplit[i6].charAt(0)));
            i10++;
            i6++;
        }
        return new o(enumMap, i, (Boolean) null, (String) null);
    }

    public static o c(int i, Bundle bundle) {
        if (bundle == null) {
            return new o((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(i2.class);
        for (i2 i2Var : h2.DMA.f4021a) {
            enumMap.put(i2Var, j2.d(bundle.getString(i2Var.f4039a)));
        }
        return new o(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final g2 a() {
        g2 g2Var = (g2) this.f4172e.get(i2.AD_USER_DATA);
        return g2Var == null ? g2.UNINITIALIZED : g2Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4168a);
        for (i2 i2Var : h2.DMA.f4021a) {
            sb.append(":");
            sb.append(j2.h((g2) this.f4172e.get(i2Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f4169b.equalsIgnoreCase(oVar.f4169b) && Objects.equals(this.f4170c, oVar.f4170c)) {
            return Objects.equals(this.f4171d, oVar.f4171d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f4170c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f4171d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f4169b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(j2.a(this.f4168a));
        for (i2 i2Var : h2.DMA.f4021a) {
            sb.append(",");
            sb.append(i2Var.f4039a);
            sb.append("=");
            g2 g2Var = (g2) this.f4172e.get(i2Var);
            if (g2Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = g2Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f4170c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f4171d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public o(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(i2.class);
        this.f4172e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f4168a = i;
        this.f4169b = d();
        this.f4170c = bool;
        this.f4171d = str;
    }
}
