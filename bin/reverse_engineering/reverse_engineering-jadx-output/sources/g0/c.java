package g0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5073a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5073a) {
            case 0:
                int iL = t0.f.L(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iL) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        t0.f.H(parcel, i);
                    } else {
                        intent = (Intent) t0.f.o(parcel, i, Intent.CREATOR);
                    }
                }
                t0.f.t(parcel, iL);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f5073a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
