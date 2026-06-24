package x4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements Parcelable {
    public static Parcelable.Creator<d1> CREATOR = new i0.l(15);
    public long A;
    public long B;
    public String C;
    public String D;
    public String E;
    public String F;
    public int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11093b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f11099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f11101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11103u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f11105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f11106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f11107z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11092a);
        parcel.writeString(this.f11093b);
        parcel.writeLong(this.f11094l);
        parcel.writeString(this.f11095m);
        parcel.writeInt(this.f11096n);
        parcel.writeString(this.f11097o);
        parcel.writeInt(this.f11098p);
        parcel.writeString(this.f11099q);
        parcel.writeString(this.f11100r);
        parcel.writeString(this.f11101s);
        parcel.writeLong(this.f11102t);
        parcel.writeString(this.f11103u);
        parcel.writeInt(this.v);
        parcel.writeString(this.f11104w);
        parcel.writeLong(this.f11105x);
        parcel.writeString(this.f11106y);
        parcel.writeString(this.f11107z);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
    }
}
