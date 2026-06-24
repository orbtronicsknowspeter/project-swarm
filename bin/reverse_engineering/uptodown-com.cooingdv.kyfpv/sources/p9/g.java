package p9;

import a4.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable {
    public static final f CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8518b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f8520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8521n;

    public g(String str, String str2, String str3, String str4, String str5) {
        str3.getClass();
        this.f8517a = str;
        this.f8518b = str2;
        this.f8519l = str3;
        this.f8520m = str4;
        this.f8521n = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f8517a.equals(gVar.f8517a) && this.f8518b.equals(gVar.f8518b) && kotlin.jvm.internal.l.a(this.f8519l, gVar.f8519l) && this.f8520m.equals(gVar.f8520m) && this.f8521n.equals(gVar.f8521n);
    }

    public final int hashCode() {
        return this.f8521n.hashCode() + androidx.lifecycle.l.o(i5.b(androidx.lifecycle.l.o(this.f8517a.hashCode() * 31, 31, this.f8518b), this.f8519l), 31, this.f8520m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclosureInfo(name=");
        sb.append(this.f8517a);
        sb.append(", type=");
        sb.append(this.f8518b);
        sb.append(", maxAge=");
        sb.append(this.f8519l);
        sb.append(", domain=");
        sb.append(this.f8520m);
        sb.append(", purposes=");
        return x.m(sb, this.f8521n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f8517a);
        parcel.writeString(this.f8518b);
        parcel.writeString(this.f8519l);
        parcel.writeString(this.f8520m);
        parcel.writeString(this.f8521n);
    }
}
