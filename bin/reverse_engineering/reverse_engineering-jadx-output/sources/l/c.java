package l;

import androidx.lifecycle.ViewModel;
import c.i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l8.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.a f7029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f7030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6.c f7031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f7032d;

    public c(l9.a aVar, ChoiceCmpCallback choiceCmpCallback, k6.c cVar, n nVar) {
        aVar.getClass();
        this.f7029a = aVar;
        this.f7030b = choiceCmpCallback;
        this.f7031c = cVar;
        this.f7032d = nVar;
    }

    public static GBCConsentValue a(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((i) next).f1160a.f5465a == g.d(str)) {
                break;
            }
        }
        i iVar = (i) next;
        return iVar == null ? GBCConsentValue.DENIED : l.a(iVar.f1161b, Boolean.TRUE) ? GBCConsentValue.GRANTED : GBCConsentValue.DENIED;
    }
}
