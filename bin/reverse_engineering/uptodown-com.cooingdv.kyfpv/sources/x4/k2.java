package x4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11260b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11270u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q1.a f11258y = new q1.a(16);
    public static Parcelable.Creator<k2> CREATOR = new i0.l(19);

    public final Spanned a() {
        String str = this.f11264o;
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = j5.t.f6709a;
        return j5.t.a(l7.u.o0(str, "\n", "<br />", false));
    }

    public final boolean b() {
        return this.v == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11259a);
        parcel.writeLong(this.f11263n);
        parcel.writeString(this.f11261l);
        parcel.writeString(this.f11260b);
        parcel.writeString(this.f11262m);
        parcel.writeString(this.f11264o);
        parcel.writeInt(this.f11265p);
        parcel.writeInt(this.f11266q);
        parcel.writeString(this.f11267r);
        parcel.writeInt(this.f11268s);
        parcel.writeInt(this.f11269t);
        parcel.writeString(this.f11270u);
        parcel.writeInt(this.v);
        parcel.writeString(this.f11271w);
        parcel.writeInt(this.f11272x);
    }
}
