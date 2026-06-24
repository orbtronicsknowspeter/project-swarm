package e1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c5 extends l0.a {
    public static final Parcelable.Creator<c5> CREATOR = new android.support.v4.media.f(20);
    public final List A;
    public final String B;
    public final String C;
    public final String D;
    public final boolean E;
    public final long F;
    public final int G;
    public final String H;
    public final int I;
    public final long J;
    public final String K;
    public final String L;
    public final long M;
    public final int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3852b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f3856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f3862u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f3865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f3866z;

    public c5(String str, String str2, String str3, long j, String str4, long j6, long j10, String str5, boolean z9, boolean z10, String str6, long j11, int i, boolean z11, boolean z12, Boolean bool, long j12, List list, String str7, String str8, String str9, boolean z13, long j13, int i6, String str10, int i10, long j14, String str11, String str12, long j15, int i11) {
        k0.y.d(str);
        this.f3851a = str;
        this.f3852b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f3853l = str3;
        this.f3860s = j;
        this.f3854m = str4;
        this.f3855n = j6;
        this.f3856o = j10;
        this.f3857p = str5;
        this.f3858q = z9;
        this.f3859r = z10;
        this.f3861t = str6;
        this.f3862u = j11;
        this.v = i;
        this.f3863w = z11;
        this.f3864x = z12;
        this.f3865y = bool;
        this.f3866z = j12;
        this.A = list;
        this.B = str7;
        this.C = str8;
        this.D = str9;
        this.E = z13;
        this.F = j13;
        this.G = i6;
        this.H = str10;
        this.I = i10;
        this.J = j14;
        this.K = str11;
        this.L = str12;
        this.M = j15;
        this.N = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.T(parcel, 2, this.f3851a);
        a.a.T(parcel, 3, this.f3852b);
        a.a.T(parcel, 4, this.f3853l);
        a.a.T(parcel, 5, this.f3854m);
        a.a.X(parcel, 6, 8);
        parcel.writeLong(this.f3855n);
        a.a.X(parcel, 7, 8);
        parcel.writeLong(this.f3856o);
        a.a.T(parcel, 8, this.f3857p);
        a.a.X(parcel, 9, 4);
        parcel.writeInt(this.f3858q ? 1 : 0);
        a.a.X(parcel, 10, 4);
        parcel.writeInt(this.f3859r ? 1 : 0);
        a.a.X(parcel, 11, 8);
        parcel.writeLong(this.f3860s);
        a.a.T(parcel, 12, this.f3861t);
        a.a.X(parcel, 14, 8);
        parcel.writeLong(this.f3862u);
        a.a.X(parcel, 15, 4);
        parcel.writeInt(this.v);
        a.a.X(parcel, 16, 4);
        parcel.writeInt(this.f3863w ? 1 : 0);
        a.a.X(parcel, 18, 4);
        parcel.writeInt(this.f3864x ? 1 : 0);
        Boolean bool = this.f3865y;
        if (bool != null) {
            a.a.X(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        a.a.X(parcel, 22, 8);
        parcel.writeLong(this.f3866z);
        List<String> list = this.A;
        if (list != null) {
            int iY2 = a.a.Y(parcel, 23);
            parcel.writeStringList(list);
            a.a.a0(parcel, iY2);
        }
        a.a.T(parcel, 25, this.B);
        a.a.T(parcel, 26, this.C);
        a.a.T(parcel, 27, this.D);
        a.a.X(parcel, 28, 4);
        parcel.writeInt(this.E ? 1 : 0);
        a.a.X(parcel, 29, 8);
        parcel.writeLong(this.F);
        a.a.X(parcel, 30, 4);
        parcel.writeInt(this.G);
        a.a.T(parcel, 31, this.H);
        a.a.X(parcel, 32, 4);
        parcel.writeInt(this.I);
        a.a.X(parcel, 34, 8);
        parcel.writeLong(this.J);
        a.a.T(parcel, 35, this.K);
        a.a.T(parcel, 36, this.L);
        a.a.X(parcel, 37, 8);
        parcel.writeLong(this.M);
        a.a.X(parcel, 38, 4);
        parcel.writeInt(this.N);
        a.a.a0(parcel, iY);
    }

    public c5(String str, String str2, String str3, String str4, long j, long j6, String str5, boolean z9, boolean z10, long j10, String str6, long j11, int i, boolean z11, boolean z12, Boolean bool, long j12, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j13, int i6, String str10, int i10, long j14, String str11, String str12, long j15, int i11) {
        this.f3851a = str;
        this.f3852b = str2;
        this.f3853l = str3;
        this.f3860s = j10;
        this.f3854m = str4;
        this.f3855n = j;
        this.f3856o = j6;
        this.f3857p = str5;
        this.f3858q = z9;
        this.f3859r = z10;
        this.f3861t = str6;
        this.f3862u = j11;
        this.v = i;
        this.f3863w = z11;
        this.f3864x = z12;
        this.f3865y = bool;
        this.f3866z = j12;
        this.A = arrayList;
        this.B = str7;
        this.C = str8;
        this.D = str9;
        this.E = z13;
        this.F = j13;
        this.G = i6;
        this.H = str10;
        this.I = i10;
        this.J = j14;
        this.K = str11;
        this.L = str12;
        this.M = j15;
        this.N = i11;
    }
}
