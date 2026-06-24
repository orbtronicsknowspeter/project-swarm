package x4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Parcelable {
    public static Parcelable.Creator<j0> CREATOR = new i0.l(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11237m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f11241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f11243s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11234a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11235b = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11236l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11238n = -1;

    public final long a() {
        return this.f11238n;
    }

    public final void b(String str) {
        this.f11241q = str;
    }

    public final void c(long j) {
        this.f11239o = j;
    }

    public final void d(long j) {
        this.f11238n = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String toString() {
        long j = this.f11234a;
        long j6 = this.f11235b;
        long j10 = this.f11236l;
        String str = this.f11237m;
        long j11 = this.f11238n;
        long j12 = this.f11239o;
        String str2 = this.f11240p;
        String str3 = this.f11241q;
        int i = this.f11242r;
        long j13 = this.f11243s;
        StringBuilder sb = new StringBuilder("{id='");
        sb.append(j);
        sb.append("', downloadId='");
        sb.append(j6);
        sb.append("', fileId='");
        sb.append(j10);
        sb.append("', type=");
        sb.append(str);
        sb.append(", sizeExpected='");
        sb.append(j11);
        sb.append("', sizeDownloaded='");
        sb.append(j12);
        sb.append("', filehashExpected='");
        a4.x.B(sb, str2, "', absolutePath='", str3, "', attempts=");
        sb.append(i);
        sb.append(", nextAttemptTimeStamp=");
        sb.append(j13);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11234a);
        parcel.writeLong(this.f11235b);
        parcel.writeLong(this.f11236l);
        parcel.writeString(this.f11237m);
        parcel.writeLong(this.f11238n);
        parcel.writeLong(this.f11239o);
        parcel.writeString(this.f11240p);
        parcel.writeString(this.f11241q);
        parcel.writeInt(this.f11242r);
        parcel.writeLong(this.f11243s);
    }
}
