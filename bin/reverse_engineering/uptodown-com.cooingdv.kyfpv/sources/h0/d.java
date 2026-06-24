package h0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends l0.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.f(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5404b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5406m;

    public d(String str, int i, long j, boolean z9) {
        this.f5403a = str;
        this.f5404b = i;
        this.f5405l = j;
        this.f5406m = z9;
    }

    public final long c() {
        long j = this.f5405l;
        return j == -1 ? this.f5404b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (y.j(this.f5403a, dVar.f5403a) && c() == dVar.c() && this.f5406m == dVar.f5406m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5403a, Long.valueOf(c()), Boolean.valueOf(this.f5406m)});
    }

    public final String toString() {
        android.support.v4.media.g gVar = new android.support.v4.media.g(this);
        gVar.p(this.f5403a, "name");
        gVar.p(Long.valueOf(c()), "version");
        gVar.p(Boolean.valueOf(this.f5406m), "is_fully_rolled_out");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.T(parcel, 1, this.f5403a);
        a.a.X(parcel, 2, 4);
        parcel.writeInt(this.f5404b);
        long jC = c();
        a.a.X(parcel, 3, 8);
        parcel.writeLong(jC);
        a.a.X(parcel, 4, 4);
        parcel.writeInt(this.f5406m ? 1 : 0);
        a.a.a0(parcel, iY);
    }
}
