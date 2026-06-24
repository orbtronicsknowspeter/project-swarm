package f0;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.i5;
import e1.c0;
import j0.o;
import k0.y;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends w0.b {
    public final RevocationBoundService j;

    public k(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.j = revocationBoundService;
    }

    @Override // w0.b
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult kVar;
        String strD;
        RevocationBoundService revocationBoundService = this.j;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            I();
            i.o(revocationBoundService).r();
            return true;
        }
        I();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.f2439t;
        if (googleSignInAccountB != null) {
            String strD2 = bVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsC = null;
            } else {
                try {
                    googleSignInOptionsC = GoogleSignInOptions.c(strD);
                } catch (JSONException unused) {
                    googleSignInOptionsC = null;
                }
            }
        }
        e0.a aVarW = i5.w(revocationBoundService, googleSignInOptionsC);
        if (googleSignInAccountB != null) {
            o oVar = aVarW.h;
            Context context = aVarW.f5614a;
            boolean z9 = aVarW.d() == 3;
            h.f4808a.b("Revoking access", new Object[0]);
            String strD3 = b.a(context).d("refreshToken");
            h.b(context);
            if (!z9) {
                g gVar = new g(oVar, 1);
                oVar.b(gVar);
                kVar = gVar;
            } else if (strD3 == null) {
                f8.o oVar2 = c.f4801l;
                Status status = new Status(4, null, null, null);
                y.a("Status code must not be SUCCESS", !false);
                kVar = new i0.k(status);
                kVar.e(status);
            } else {
                c cVar = new c(strD3);
                new Thread(cVar).start();
                kVar = cVar.f4803b;
            }
            kVar.a(new j0.j(kVar, new j1.i(), new c0(21)));
        } else {
            aVarW.c();
        }
        return true;
    }

    public final void I() {
        if (p0.b.b(this.j, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
