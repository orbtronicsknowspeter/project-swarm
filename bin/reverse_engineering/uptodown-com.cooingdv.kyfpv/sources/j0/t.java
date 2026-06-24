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
    public static final d0.b f6527q = g1.b.f5107a;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f6528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0.b f6529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f6530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g4.v f6531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h1.a f6532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g8.g f6533p;

    public t(Context context, c0 c0Var, g4.v vVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.j = context;
        this.f6528k = c0Var;
        this.f6531n = vVar;
        this.f6530m = (Set) vVar.f5276b;
        this.f6529l = f6527q;
    }

    @Override // i0.f
    public final void a(h0.b bVar) {
        this.f6533p.l(bVar);
    }

    @Override // i0.e
    public final void c(int i) {
        g8.g gVar = this.f6533p;
        m mVar = (m) ((e) gVar.f5387o).f6500s.get((a) gVar.f5384l);
        if (mVar != null) {
            if (mVar.f6514q) {
                mVar.p(new h0.b(null, null, 17));
            } else {
                mVar.c(i);
            }
        }
    }

    @Override // i0.e
    public final void d() {
        h1.a aVar = this.f6532o;
        aVar.getClass();
        boolean z9 = false;
        try {
            aVar.J.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? f0.b.a(aVar.f6842l).b() : null;
            Integer num = aVar.L;
            y.g(num);
            k0.r rVar = new k0.r(2, account, num.intValue(), googleSignInAccountB);
            h1.c cVar = (h1.c) aVar.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f2893k);
            int i = x0.a.f11034a;
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
                this.f6528k.post(new m1.a(this, new h1.e(1, new h0.b(null, null, 8), null), 21, z9));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}
