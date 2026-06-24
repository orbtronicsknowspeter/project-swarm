package e1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 extends l0.a {
    public static final Parcelable.Creator<x4> CREATOR = new android.support.v4.media.f(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4403b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f4404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f4405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f4407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f4408p;

    public x4(long j, Object obj, String str, String str2) {
        k0.y.d(str);
        this.f4402a = 2;
        this.f4403b = str;
        this.f4404l = j;
        this.f4407o = str2;
        if (obj == null) {
            this.f4405m = null;
            this.f4408p = null;
            this.f4406n = null;
            return;
        }
        if (obj instanceof Long) {
            this.f4405m = (Long) obj;
            this.f4408p = null;
            this.f4406n = null;
        } else if (obj instanceof String) {
            this.f4405m = null;
            this.f4408p = null;
            this.f4406n = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                com.google.gson.internal.a.p("User attribute given of un-supported type");
                throw null;
            }
            this.f4405m = null;
            this.f4408p = (Double) obj;
            this.f4406n = null;
        }
    }

    public final Object c() {
        Long l10 = this.f4405m;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f4408p;
        if (d10 != null) {
            return d10;
        }
        String str = this.f4406n;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        android.support.v4.media.f.b(this, parcel);
    }

    public x4(int i, String str, long j, Long l10, Float f, String str2, String str3, Double d10) {
        this.f4402a = i;
        this.f4403b = str;
        this.f4404l = j;
        this.f4405m = l10;
        this.f4408p = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d10;
        this.f4406n = str2;
        this.f4407o = str3;
    }

    public x4(y4 y4Var) {
        this(y4Var.f4429d, y4Var.f4430e, y4Var.f4428c, y4Var.f4427b);
    }
}
