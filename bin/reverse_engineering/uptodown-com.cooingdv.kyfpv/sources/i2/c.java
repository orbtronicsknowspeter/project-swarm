package i2;

import androidx.datastore.preferences.core.Preferences;
import d7.p;
import o7.a0;
import p6.x;
import r7.h;
import r7.k0;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5640b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Preferences.Key f5641l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Preferences.Key key, t6.c cVar) {
        super(2, cVar);
        this.f5640b = fVar;
        this.f5641l = key;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new c(this.f5640b, this.f5641l, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((a0) obj, (t6.c) obj2)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.f5639a;
        if (i == 0) {
            p6.a.e(obj);
            h data = this.f5640b.f5652c.getData();
            this.f5639a = 1;
            obj = k0.k(data, this);
            u6.a aVar = u6.a.f10763a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
        }
        Preferences preferences = (Preferences) obj;
        if (preferences == null || (obj2 = preferences.get(this.f5641l)) == null) {
            return -1L;
        }
        return obj2;
    }
}
