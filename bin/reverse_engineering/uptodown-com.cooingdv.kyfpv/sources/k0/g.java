package k0;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends l0.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new i0.l(8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Scope[] f6862x = new Scope[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h0.d[] f6863y = new h0.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6865b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IBinder f6868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Scope[] f6869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f6870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Account f6871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h0.d[] f6872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h0.d[] f6873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6874t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6875u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6876w;

    public g(int i, int i6, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, h0.d[] dVarArr, h0.d[] dVarArr2, boolean z9, int i11, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f6862x : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        h0.d[] dVarArr3 = f6863y;
        h0.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f6864a = i;
        this.f6865b = i6;
        this.f6866l = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f6867m = "com.google.android.gms";
        } else {
            this.f6867m = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i12 = a.j;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i l0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var2 = (l0) l0Var;
                        Parcel parcelC = l0Var2.c(l0Var2.G(), 2);
                        Account account3 = (Account) z0.g.a(parcelC, Account.CREATOR);
                        parcelC.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.f6871q = account2;
        } else {
            this.f6868n = iBinder;
            this.f6871q = account;
        }
        this.f6869o = scopeArr2;
        this.f6870p = bundle2;
        this.f6872r = dVarArr4;
        this.f6873s = dVarArr3;
        this.f6874t = z9;
        this.f6875u = i11;
        this.v = z10;
        this.f6876w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i0.l.a(this, parcel, i);
    }
}
