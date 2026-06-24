package x4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z2 implements Parcelable {
    public static Parcelable.Creator<z2> CREATOR = new i0.l(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11483b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f11489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f11491s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f11492t = new ArrayList();

    public z2(Parcel parcel) {
        this.f11482a = parcel.readLong();
        this.f11483b = parcel.readString();
        this.f11484l = parcel.readString();
        this.f11485m = parcel.readString();
        this.f11486n = parcel.readString();
        this.f11487o = parcel.readInt();
        this.f11488p = parcel.readString();
        this.f11489q = parcel.readLong();
        this.f11490r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11482a);
        parcel.writeString(this.f11483b);
        parcel.writeString(this.f11484l);
        parcel.writeString(this.f11485m);
        parcel.writeString(this.f11486n);
        parcel.writeInt(this.f11487o);
        parcel.writeString(this.f11488p);
        parcel.writeLong(this.f11489q);
        parcel.writeInt(this.f11490r);
    }

    public z2() {
    }
}
