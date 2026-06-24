package e0;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import t0.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3739a;

    public /* synthetic */ e(int i) {
        this.f3739a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3739a) {
            case 0:
                int iL = f.L(parcel);
                String strP = null;
                String strP2 = null;
                String strP3 = null;
                String strP4 = null;
                Uri uri = null;
                String strP5 = null;
                String strP6 = null;
                ArrayList arrayListR = null;
                String strP7 = null;
                String strP8 = null;
                long jF = 0;
                int iE = 0;
                while (parcel.dataPosition() < iL) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iE = f.E(parcel, i);
                            break;
                        case 2:
                            strP = f.p(parcel, i);
                            break;
                        case 3:
                            strP2 = f.p(parcel, i);
                            break;
                        case 4:
                            strP3 = f.p(parcel, i);
                            break;
                        case 5:
                            strP4 = f.p(parcel, i);
                            break;
                        case 6:
                            uri = (Uri) f.o(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strP5 = f.p(parcel, i);
                            break;
                        case '\b':
                            jF = f.F(parcel, i);
                            break;
                        case '\t':
                            strP6 = f.p(parcel, i);
                            break;
                        case '\n':
                            arrayListR = f.r(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strP7 = f.p(parcel, i);
                            break;
                        case '\f':
                            strP8 = f.p(parcel, i);
                            break;
                        default:
                            f.H(parcel, i);
                            break;
                    }
                }
                f.t(parcel, iL);
                return new GoogleSignInAccount(iE, strP, strP2, strP3, strP4, uri, strP5, jF, strP6, arrayListR, strP7, strP8);
            case 1:
                int iL2 = f.L(parcel);
                ArrayList arrayListR2 = null;
                ArrayList arrayListR3 = null;
                Account account = null;
                String strP9 = null;
                String strP10 = null;
                String strP11 = null;
                int iE2 = 0;
                boolean zC = false;
                boolean zC2 = false;
                boolean zC3 = false;
                while (parcel.dataPosition() < iL2) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iE2 = f.E(parcel, i6);
                            break;
                        case 2:
                            arrayListR3 = f.r(parcel, i6, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) f.o(parcel, i6, Account.CREATOR);
                            break;
                        case 4:
                            zC = f.C(parcel, i6);
                            break;
                        case 5:
                            zC2 = f.C(parcel, i6);
                            break;
                        case 6:
                            zC3 = f.C(parcel, i6);
                            break;
                        case 7:
                            strP9 = f.p(parcel, i6);
                            break;
                        case '\b':
                            strP10 = f.p(parcel, i6);
                            break;
                        case '\t':
                            arrayListR2 = f.r(parcel, i6, f0.a.CREATOR);
                            break;
                        case '\n':
                            strP11 = f.p(parcel, i6);
                            break;
                        default:
                            f.H(parcel, i6);
                            break;
                    }
                }
                f.t(parcel, iL2);
                return new GoogleSignInOptions(iE2, arrayListR3, account, zC, zC2, zC3, strP9, strP10, GoogleSignInOptions.d(arrayListR2), strP11);
            default:
                int iL3 = f.L(parcel);
                String strP12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strP13 = "";
                while (parcel.dataPosition() < iL3) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 4) {
                        strP12 = f.p(parcel, i10);
                    } else if (c9 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) f.o(parcel, i10, GoogleSignInAccount.CREATOR);
                    } else if (c9 != '\b') {
                        f.H(parcel, i10);
                    } else {
                        strP13 = f.p(parcel, i10);
                    }
                }
                f.t(parcel, iL3);
                return new SignInAccount(strP12, googleSignInAccount, strP13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f3739a) {
            case 0:
                return new GoogleSignInAccount[i];
            case 1:
                return new GoogleSignInOptions[i];
            default:
                return new SignInAccount[i];
        }
    }
}
