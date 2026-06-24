package k0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends l0.a {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new i0.l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6892b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6899r;

    public j(int i, int i6, int i10, long j, long j6, String str, String str2, int i11, int i12) {
        this.f6891a = i;
        this.f6892b = i6;
        this.f6893l = i10;
        this.f6894m = j;
        this.f6895n = j6;
        this.f6896o = str;
        this.f6897p = str2;
        this.f6898q = i11;
        this.f6899r = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(this.f6891a);
        a.a.X(parcel, 2, 4);
        parcel.writeInt(this.f6892b);
        a.a.X(parcel, 3, 4);
        parcel.writeInt(this.f6893l);
        a.a.X(parcel, 4, 8);
        parcel.writeLong(this.f6894m);
        a.a.X(parcel, 5, 8);
        parcel.writeLong(this.f6895n);
        a.a.T(parcel, 6, this.f6896o);
        a.a.T(parcel, 7, this.f6897p);
        a.a.X(parcel, 8, 4);
        parcel.writeInt(this.f6898q);
        a.a.X(parcel, 9, 4);
        parcel.writeInt(this.f6899r);
        a.a.a0(parcel, iY);
    }
}
