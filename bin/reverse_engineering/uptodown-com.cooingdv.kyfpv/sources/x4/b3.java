package x4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements Parcelable {
    public static Parcelable.Creator<b3> CREATOR = new i0.l(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11067b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11071o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11066a);
        parcel.writeString(this.f11067b);
        parcel.writeInt(this.f11069m);
        parcel.writeInt(this.f11070n);
        parcel.writeInt(this.f11068l);
        parcel.writeInt(this.f11071o);
    }
}
