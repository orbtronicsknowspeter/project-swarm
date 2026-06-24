package x4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11109b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f11118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11119u;
    public static final q1.a v = new q1.a(15);
    public static Parcelable.Creator<d2> CREATOR = new i0.l(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11108a);
        parcel.writeLong(this.f11112n);
        parcel.writeString(this.f11109b);
        parcel.writeString(this.f11110l);
        parcel.writeString(this.f11111m);
        parcel.writeString(this.f11113o);
        parcel.writeString(this.f11114p);
        parcel.writeInt(this.f11115q);
        parcel.writeInt(this.f11116r);
        parcel.writeInt(this.f11117s);
        parcel.writeString(this.f11118t);
        parcel.writeInt(this.f11119u);
    }
}
