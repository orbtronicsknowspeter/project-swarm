package e1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends l0.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.f(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3868b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3869l;

    public d(int i, long j, long j6) {
        this.f3867a = j;
        this.f3868b = i;
        this.f3869l = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 8);
        parcel.writeLong(this.f3867a);
        a.a.X(parcel, 2, 4);
        parcel.writeInt(this.f3868b);
        a.a.X(parcel, 3, 8);
        parcel.writeLong(this.f3869l);
        a.a.a0(parcel, iY);
    }
}
