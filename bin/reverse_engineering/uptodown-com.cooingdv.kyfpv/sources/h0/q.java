package h0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.z3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends l0.a {
    public static final Parcelable.Creator<q> CREATOR = new android.support.v4.media.f(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5440b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f5443n;

    public q(boolean z9, String str, int i, int i6, long j) {
        this.f5439a = z9;
        this.f5440b = str;
        this.f5441l = i5.R(i) - 1;
        this.f5442m = z3.T(i6) - 1;
        this.f5443n = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(this.f5439a ? 1 : 0);
        a.a.T(parcel, 2, this.f5440b);
        a.a.X(parcel, 3, 4);
        parcel.writeInt(this.f5441l);
        a.a.X(parcel, 4, 4);
        parcel.writeInt(this.f5442m);
        a.a.X(parcel, 5, 8);
        parcel.writeLong(this.f5443n);
        a.a.a0(parcel, iY);
    }
}
