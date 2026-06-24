package x4;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements Parcelable {
    public static Parcelable.Creator<l2> CREATOR = new i0.l(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11279b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11281m;

    public final String a() {
        String str = this.f11278a;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.O, ":webp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11278a);
        parcel.writeInt(this.f11279b);
        parcel.writeInt(this.f11280l);
        parcel.writeInt(this.f11281m);
    }
}
