package e1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 extends l0.a {
    public static final Parcelable.Creator<j4> CREATOR = new android.support.v4.media.f(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4064b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4065l;

    public j4(String str, int i, long j) {
        this.f4063a = str;
        this.f4064b = j;
        this.f4065l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.T(parcel, 1, this.f4063a);
        a.a.X(parcel, 2, 8);
        parcel.writeLong(this.f4064b);
        a.a.X(parcel, 3, 4);
        parcel.writeInt(this.f4065l);
        a.a.a0(parcel, iY);
    }
}
