package k0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends l0.a {
    public static final Parcelable.Creator<r> CREATOR = new i0.l(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f6924b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final GoogleSignInAccount f6926m;

    public r(int i, Account account, int i6, GoogleSignInAccount googleSignInAccount) {
        this.f6923a = i;
        this.f6924b = account;
        this.f6925l = i6;
        this.f6926m = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(this.f6923a);
        a.a.S(parcel, 2, this.f6924b, i);
        a.a.X(parcel, 3, 4);
        parcel.writeInt(this.f6925l);
        a.a.S(parcel, 4, this.f6926m, i);
        a.a.a0(parcel, iY);
    }
}
