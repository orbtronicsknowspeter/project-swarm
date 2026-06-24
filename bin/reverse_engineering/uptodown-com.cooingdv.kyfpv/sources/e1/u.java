package e1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends l0.a {
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.f(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f4291b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4293m;

    public u(u uVar, long j) {
        k0.y.g(uVar);
        this.f4290a = uVar.f4290a;
        this.f4291b = uVar.f4291b;
        this.f4292l = uVar.f4292l;
        this.f4293m = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4291b);
        String str = this.f4292l;
        int length = String.valueOf(str).length();
        String str2 = this.f4290a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        a4.x.B(sb, "origin=", str, ",name=", str2);
        return a4.x.n(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        android.support.v4.media.f.a(this, parcel, i);
    }

    public u(String str, t tVar, String str2, long j) {
        this.f4290a = str;
        this.f4291b = tVar;
        this.f4292l = str2;
        this.f4293m = j;
    }
}
