package j0;

import a4.c0;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends w0.b implements i0.e, i0.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d0.b f6526q = g1.b.f5106a;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f6527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0.b f6528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f6529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g4.v f6530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h1.a f6531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g8.g f6532p;

    public t(Context context, c0 c0Var, g4.v vVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.j = context;
        this.f6527k = c0Var;
        this.f6530n = vVar;
        this.f6529m = (Set) vVar.f5275b;
        this.f6528l = f6526q;
    }

    @Override // i0.f
    public final void a(h0.b bVar) {
        this.f6532p.l(bVar);
    }

    @Override // i0.e
    public final void c(int i) {
        g8.g gVar = this.f6532p;
        m mVar = (m) ((e) gVar.f5386o).f6499s.get((a) gVar.f5383l);
        if (mVar != null) {
            if (mVar.f6513q) {
                mVar.p(new h0.b(null, null, 17));
            } else {
                mVar.c(i);
            }
        }
    }

    @Override // i0.e
    public final void d() {
        h1.a aVar = this.f6531o;
        aVar.getClass();
        boolean z9 = false;
        try {
            aVar.J.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? f0.b.a(aVar.f6841l).b() : null;
            Integer num = aVar.L;
            y.g(num);
            k0.r rVar = new k0.r(2, account, num.intValue(), googleSignInAccountB);
            h1.c cVar = (h1.c) aVar.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f2893k);
            int i = x0.a.f11033a;
            parcelObtain.writeInt(1);
            int iY = a.a.Y(parcelObtain, 20293);
            a.a.X(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            a.a.S(parcelObtain, 2, rVar, 0);
            a.a.a0(parcelObtain, iY);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cVar.j.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f6527k.post(new m1.a(this, new h1.e(1, new h0.b(null, null, 8), null), 21, z9));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}
