package k0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends l0.a {
    public static final Parcelable.Creator<s> CREATOR = new i0.l(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f6927b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0.b f6928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6930n;

    public s(int i, IBinder iBinder, h0.b bVar, boolean z9, boolean z10) {
        this.f6926a = i;
        this.f6927b = iBinder;
        this.f6928l = bVar;
        this.f6929m = z9;
        this.f6930n = z10;
    }

    public final boolean equals(Object obj) {
        Object l0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f6928l.equals(sVar.f6928l)) {
            return false;
        }
        Object l0Var2 = null;
        IBinder iBinder = this.f6927b;
        if (iBinder == null) {
            l0Var = null;
        } else {
            int i = a.j;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        IBinder iBinder2 = sVar.f6927b;
        if (iBinder2 != null) {
            int i6 = a.j;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var2 = iInterfaceQueryLocalInterface2 instanceof i ? (i) iInterfaceQueryLocalInterface2 : new l0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        return y.j(l0Var, l0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(this.f6926a);
        a.a.R(parcel, 2, this.f6927b);
        a.a.S(parcel, 3, this.f6928l, i);
        a.a.X(parcel, 4, 4);
        parcel.writeInt(this.f6929m ? 1 : 0);
        a.a.X(parcel, 5, 4);
        parcel.writeInt(this.f6930n ? 1 : 0);
        a.a.a0(parcel, iY);
    }
}
