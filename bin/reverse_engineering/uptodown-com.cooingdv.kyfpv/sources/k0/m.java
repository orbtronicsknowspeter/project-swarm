package k0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends l0.a {

    @NonNull
    public static final Parcelable.Creator<m> CREATOR = new i0.l(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6910b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6913n;

    public m(int i, int i6, int i10, boolean z9, boolean z10) {
        this.f6909a = i;
        this.f6910b = z9;
        this.f6911l = z10;
        this.f6912m = i6;
        this.f6913n = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(this.f6909a);
        a.a.X(parcel, 2, 4);
        parcel.writeInt(this.f6910b ? 1 : 0);
        a.a.X(parcel, 3, 4);
        parcel.writeInt(this.f6911l ? 1 : 0);
        a.a.X(parcel, 4, 4);
        parcel.writeInt(this.f6912m);
        a.a.X(parcel, 5, 4);
        parcel.writeInt(this.f6913n);
        a.a.a0(parcel, iY);
    }
}
