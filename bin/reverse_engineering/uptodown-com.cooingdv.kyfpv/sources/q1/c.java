package q1;

import android.os.Bundle;
import e1.k2;
import e1.l2;
import java.util.HashSet;
import l1.g;
import m8.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8642b;

    public /* synthetic */ c(Object obj, int i) {
        this.f8641a = i;
        this.f8642b = obj;
    }

    @Override // e1.l2
    public final void a(long j, Bundle bundle, String str, String str2) {
        int i = this.f8641a;
        Object obj = this.f8642b;
        switch (i) {
            case 0:
                q qVar = (q) obj;
                if (((HashSet) qVar.f7781b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    g gVar = b.f8637a;
                    String strG = k2.g(str2, k2.f4075c, k2.f4073a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((q) qVar.f7782l).n(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !b.f8637a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((q) ((g5.g) obj).f5316b).n(3, bundle3);
                    break;
                }
                break;
        }
    }
}
