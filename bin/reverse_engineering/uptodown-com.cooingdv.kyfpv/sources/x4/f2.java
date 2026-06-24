package x4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements Parcelable {
    public static final e2 CREATOR = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11153b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f11157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11158p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11152a);
        parcel.writeInt(this.f11154l);
        parcel.writeInt(this.f11155m);
        parcel.writeString(this.f11156n);
        parcel.writeList(this.f11157o);
        parcel.writeString(this.f11153b);
        parcel.writeString(this.f11158p);
    }
}
