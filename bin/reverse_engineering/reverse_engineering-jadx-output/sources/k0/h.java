package k0;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends e implements i0.b {
    public final Set H;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, Looper looper, int i, g4.v vVar, i0.e eVar, i0.f fVar, int i6) {
        k0 k0VarA = k0.a(context);
        h0.e eVar2 = h0.e.f5407d;
        y.g(eVar);
        y.g(fVar);
        super(context, looper, k0VarA, eVar2, i, new l(eVar), new l(fVar), (String) vVar.f5278n);
        Set set = (Set) vVar.f5276l;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.H = set;
    }

    @Override // i0.b
    public final Set a() {
        return l() ? this.H : Collections.EMPTY_SET;
    }

    @Override // k0.e
    public final Account p() {
        return null;
    }

    @Override // k0.e
    public final Set s() {
        return this.H;
    }
}
