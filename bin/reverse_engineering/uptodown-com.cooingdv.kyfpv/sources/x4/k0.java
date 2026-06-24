package x4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable {
    public static Parcelable.Creator<k0> CREATOR = new i0.l(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11254b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11256m;

    public final void a(Context context, String str) {
        context.getClass();
        String str2 = this.f11255l;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        j5.v vVar = new j5.v(context);
        long j = this.f11254b;
        String str3 = this.f11255l;
        str3.getClass();
        vVar.C(j, str, str3, this.f11256m);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String toString() {
        return "{id='" + this.f11253a + "'appID='" + this.f11254b + "'categoryType='" + this.f11255l + "'promotedIndex='" + this.f11256m + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f11253a);
        parcel.writeLong(this.f11254b);
        parcel.writeString(this.f11255l);
        parcel.writeInt(this.f11256m);
    }
}
