package x4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements Parcelable {
    public static Parcelable.Creator<y1> CREATOR = new i0.l(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11467a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11470m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11468b = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11469l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11471n = -1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11467a);
        parcel.writeInt(this.f11468b);
        parcel.writeInt(this.f11469l);
        parcel.writeString(this.f11470m);
        parcel.writeInt(this.f11471n);
    }
}
