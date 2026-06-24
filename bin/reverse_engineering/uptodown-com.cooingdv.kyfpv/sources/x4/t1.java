package x4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements Parcelable {
    public static Parcelable.Creator<t1> CREATOR = new i0.l(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11398b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f11404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f11405r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11397a);
        parcel.writeString(this.f11399l);
        parcel.writeLong(this.f11400m);
        parcel.writeString(this.f11401n);
        parcel.writeString(this.f11402o);
        parcel.writeString(this.f11403p);
        parcel.writeLong(this.f11398b);
    }
}
