package e1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends l0.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.f(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3884b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x4 f3885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f3889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f3891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f3893t;

    public e(e eVar) {
        k0.y.g(eVar);
        this.f3883a = eVar.f3883a;
        this.f3884b = eVar.f3884b;
        this.f3885l = eVar.f3885l;
        this.f3886m = eVar.f3886m;
        this.f3887n = eVar.f3887n;
        this.f3888o = eVar.f3888o;
        this.f3889p = eVar.f3889p;
        this.f3890q = eVar.f3890q;
        this.f3891r = eVar.f3891r;
        this.f3892s = eVar.f3892s;
        this.f3893t = eVar.f3893t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.T(parcel, 2, this.f3883a);
        a.a.T(parcel, 3, this.f3884b);
        a.a.S(parcel, 4, this.f3885l, i);
        long j = this.f3886m;
        a.a.X(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z9 = this.f3887n;
        a.a.X(parcel, 6, 4);
        parcel.writeInt(z9 ? 1 : 0);
        a.a.T(parcel, 7, this.f3888o);
        a.a.S(parcel, 8, this.f3889p, i);
        long j6 = this.f3890q;
        a.a.X(parcel, 9, 8);
        parcel.writeLong(j6);
        a.a.S(parcel, 10, this.f3891r, i);
        a.a.X(parcel, 11, 8);
        parcel.writeLong(this.f3892s);
        a.a.S(parcel, 12, this.f3893t, i);
        a.a.a0(parcel, iY);
    }

    public e(String str, String str2, x4 x4Var, long j, boolean z9, String str3, u uVar, long j6, u uVar2, long j10, u uVar3) {
        this.f3883a = str;
        this.f3884b = str2;
        this.f3885l = x4Var;
        this.f3886m = j;
        this.f3887n = z9;
        this.f3888o = str3;
        this.f3889p = uVar;
        this.f3890q = j6;
        this.f3891r = uVar2;
        this.f3892s = j10;
        this.f3893t = uVar3;
    }
}
