package k0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends l0.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new i0.l(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6857b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f6859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f6861o;

    public f(m mVar, boolean z9, boolean z10, int[] iArr, int i, int[] iArr2) {
        this.f6856a = mVar;
        this.f6857b = z9;
        this.f6858l = z10;
        this.f6859m = iArr;
        this.f6860n = i;
        this.f6861o = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.S(parcel, 1, this.f6856a, i);
        a.a.X(parcel, 2, 4);
        parcel.writeInt(this.f6857b ? 1 : 0);
        a.a.X(parcel, 3, 4);
        parcel.writeInt(this.f6858l ? 1 : 0);
        int[] iArr = this.f6859m;
        if (iArr != null) {
            int iY2 = a.a.Y(parcel, 4);
            parcel.writeIntArray(iArr);
            a.a.a0(parcel, iY2);
        }
        a.a.X(parcel, 5, 4);
        parcel.writeInt(this.f6860n);
        int[] iArr2 = this.f6861o;
        if (iArr2 != null) {
            int iY3 = a.a.Y(parcel, 6);
            parcel.writeIntArray(iArr2);
            a.a.a0(parcel, iY3);
        }
        a.a.a0(parcel, iY);
    }
}
