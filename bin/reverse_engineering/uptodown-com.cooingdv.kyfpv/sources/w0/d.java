package w0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.v4.media.g;
import android.util.Base64;
import g4.v;
import j0.m;
import k0.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends h {
    public final d0.c I;

    public d(Context context, Looper looper, v vVar, d0.c cVar, m mVar, m mVar2) {
        super(context, looper, 68, vVar, mVar, mVar2, 0);
        cVar = cVar == null ? d0.c.f3536l : cVar;
        g gVar = new g(5, false);
        gVar.f247b = Boolean.FALSE;
        gVar.f247b = Boolean.valueOf(cVar.f3537a);
        gVar.f248l = cVar.f3538b;
        byte[] bArr = new byte[16];
        a.f10911a.nextBytes(bArr);
        gVar.f248l = Base64.encodeToString(bArr, 11);
        this.I = new d0.c(gVar);
    }

    @Override // k0.e
    public final int i() {
        return 12800000;
    }

    @Override // k0.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // k0.e
    public final Bundle r() {
        d0.c cVar = this.I;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", cVar.f3537a);
        bundle.putString("log_session_id", cVar.f3538b);
        return bundle;
    }

    @Override // k0.e
    public final String u() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // k0.e
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
