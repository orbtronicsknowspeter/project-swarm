package x5;

import a4.x;
import android.os.Parcel;
import android.os.Parcelable;
import c.j;
import com.google.android.gms.internal.measurement.i5;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final a CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11494b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f11496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f11497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f11499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f11504u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f11508z;

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i6, String str13, String str14, String str15, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & 128) != 0 ? "" : str8, (i10 & 256) != 0 ? "" : str9, (i10 & 512) != 0 ? "" : str10, (i10 & 1024) != 0 ? "" : str11, (i10 & 2048) != 0 ? "" : str12, (i10 & 4096) != 0 ? 0 : i, (i10 & 8192) != 0 ? 1 : i6, (i10 & 16384) != 0 ? "" : str13, (i10 & 32768) != 0 ? "" : str14, (i10 & 65536) != 0 ? "" : str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f11493a, bVar.f11493a) && l.a(this.f11494b, bVar.f11494b) && l.a(this.f11495l, bVar.f11495l) && l.a(this.f11496m, bVar.f11496m) && l.a(this.f11497n, bVar.f11497n) && l.a(this.f11498o, bVar.f11498o) && l.a(this.f11499p, bVar.f11499p) && l.a(this.f11500q, bVar.f11500q) && l.a(this.f11501r, bVar.f11501r) && l.a(this.f11502s, bVar.f11502s) && l.a(this.f11503t, bVar.f11503t) && l.a(this.f11504u, bVar.f11504u) && this.v == bVar.v && this.f11505w == bVar.f11505w && l.a(this.f11506x, bVar.f11506x) && l.a(this.f11507y, bVar.f11507y) && l.a(this.f11508z, bVar.f11508z);
    }

    public final int hashCode() {
        int iHashCode = this.f11493a.hashCode() * 31;
        String str = this.f11494b;
        return this.f11508z.hashCode() + i5.b(i5.b((j.c(this.f11505w) + ((this.v + i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b(i5.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f11495l), this.f11496m), this.f11497n), this.f11498o), this.f11499p), this.f11500q), this.f11501r), this.f11502s), this.f11503t), this.f11504u)) * 31)) * 31, this.f11506x), this.f11507y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnersDetailDialogArgs(name=");
        sb.append(this.f11493a);
        sb.append(", description=");
        sb.append((Object) this.f11494b);
        sb.append(", purposes=");
        sb.append(this.f11495l);
        sb.append(", legitimateInterests=");
        sb.append(this.f11496m);
        sb.append(", specialPurposes=");
        sb.append(this.f11497n);
        sb.append(", features=");
        sb.append(this.f11498o);
        sb.append(", specialFeatures=");
        sb.append(this.f11499p);
        sb.append(", dataDeclarations=");
        sb.append(this.f11500q);
        sb.append(", privacyPolicy=");
        sb.append(this.f11501r);
        sb.append(", cookieMaxAge=");
        sb.append(this.f11502s);
        sb.append(", usesNonCookieAccess=");
        sb.append(this.f11503t);
        sb.append(", dataRetention=");
        sb.append(this.f11504u);
        sb.append(", vendorId=");
        sb.append(this.v);
        sb.append(", switchItemType=");
        sb.append(j.d(this.f11505w));
        sb.append(", disclosuresUrl=");
        sb.append(this.f11506x);
        sb.append(", disclosuresErrorLabel=");
        sb.append(this.f11507y);
        sb.append(", legInterestPrivacyLink=");
        return x.m(sb, this.f11508z, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i6;
        parcel.getClass();
        parcel.writeString(this.f11493a);
        parcel.writeString(this.f11494b);
        parcel.writeString(this.f11495l);
        parcel.writeString(this.f11496m);
        parcel.writeString(this.f11497n);
        parcel.writeString(this.f11498o);
        parcel.writeString(this.f11499p);
        parcel.writeString(this.f11500q);
        parcel.writeString(this.f11501r);
        parcel.writeString(this.f11502s);
        parcel.writeString(this.f11503t);
        parcel.writeString(this.f11504u);
        parcel.writeInt(this.v);
        switch (this.f11505w) {
            case 1:
                i6 = 1;
                break;
            case 2:
                i6 = 2;
                break;
            case 3:
                i6 = 3;
                break;
            case 4:
                i6 = 4;
                break;
            case 5:
                i6 = 5;
                break;
            case 6:
                i6 = 6;
                break;
            case 7:
                i6 = 7;
                break;
            case 8:
                i6 = 8;
                break;
            case 9:
                i6 = 9;
                break;
            case 10:
                i6 = 10;
                break;
            case 11:
                i6 = 11;
                break;
            case 12:
                i6 = 12;
                break;
            default:
                throw null;
        }
        parcel.writeInt(i6);
        parcel.writeString(this.f11506x);
        parcel.writeString(this.f11507y);
        parcel.writeString(this.f11508z);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i6, String str13, String str14, String str15) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        if (i6 == 0) {
            throw null;
        }
        str13.getClass();
        str14.getClass();
        str15.getClass();
        this.f11493a = str;
        this.f11494b = str2;
        this.f11495l = str3;
        this.f11496m = str4;
        this.f11497n = str5;
        this.f11498o = str6;
        this.f11499p = str7;
        this.f11500q = str8;
        this.f11501r = str9;
        this.f11502s = str10;
        this.f11503t = str11;
        this.f11504u = str12;
        this.v = i;
        this.f11505w = i6;
        this.f11506x = str13;
        this.f11507y = str14;
        this.f11508z = str15;
    }
}
