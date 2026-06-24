package e1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 extends l0.a {
    public static final Parcelable.Creator<m4> CREATOR = new android.support.v4.media.f(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f4132b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f4134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f4136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4137p;

    public m4(long j, byte[] bArr, String str, Bundle bundle, int i, long j6, String str2) {
        this.f4131a = j;
        this.f4132b = bArr;
        this.f4133l = str;
        this.f4134m = bundle;
        this.f4135n = i;
        this.f4136o = j6;
        this.f4137p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 8);
        parcel.writeLong(this.f4131a);
        byte[] bArr = this.f4132b;
        if (bArr != null) {
            int iY2 = a.a.Y(parcel, 2);
            parcel.writeByteArray(bArr);
            a.a.a0(parcel, iY2);
        }
        a.a.T(parcel, 3, this.f4133l);
        a.a.Q(4, this.f4134m, parcel);
        a.a.X(parcel, 5, 4);
        parcel.writeInt(this.f4135n);
        a.a.X(parcel, 6, 8);
        parcel.writeLong(this.f4136o);
        a.a.T(parcel, 7, this.f4137p);
        a.a.a0(parcel, iY);
    }
}
