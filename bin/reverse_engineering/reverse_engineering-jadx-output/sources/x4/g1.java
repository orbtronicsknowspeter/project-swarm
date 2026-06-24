package x4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements Parcelable {
    public static final f1 CREATOR = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11200b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11202m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11199a);
        parcel.writeString(this.f11200b);
        parcel.writeInt(this.f11201l);
        parcel.writeInt(this.f11202m);
    }
}
