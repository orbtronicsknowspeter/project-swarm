package k0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends l0.a {

    @NonNull
    public static final Parcelable.Creator<n> CREATOR = new i0.l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f6915b;

    public n(int i, List list) {
        this.f6914a = i;
        this.f6915b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(this.f6914a);
        a.a.V(parcel, 2, this.f6915b);
        a.a.a0(parcel, iY);
    }
}
