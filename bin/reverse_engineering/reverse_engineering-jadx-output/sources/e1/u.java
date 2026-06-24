package e1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends l0.a {
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.f(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f4290b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4292m;

    public u(u uVar, long j) {
        k0.y.g(uVar);
        this.f4289a = uVar.f4289a;
        this.f4290b = uVar.f4290b;
        this.f4291l = uVar.f4291l;
        this.f4292m = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4290b);
        String str = this.f4291l;
        int length = String.valueOf(str).length();
        String str2 = this.f4289a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        a4.x.B(sb, "origin=", str, ",name=", str2);
        return a4.x.n(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        android.support.v4.media.f.a(this, parcel, i);
    }

    public u(String str, t tVar, String str2, long j) {
        this.f4289a = str;
        this.f4290b = tVar;
        this.f4291l = str2;
        this.f4292m = j;
    }
}
