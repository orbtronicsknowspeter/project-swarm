package c3;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements e3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f1317b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m6.a f1318l;

    public s(e3.c cVar, f0.i iVar) {
        this.f1316a = 2;
        this.f1318l = cVar;
        this.f1317b = iVar;
    }

    @Override // m6.a
    public final Object get() {
        DataStore dataStoreCreate;
        switch (this.f1316a) {
            case 0:
                Context context = (Context) this.f1317b.f4811b;
                t6.h hVar = (t6.h) this.f1318l.get();
                context.getClass();
                hVar.getClass();
                f3.h hVar2 = f3.h.f4851a;
                ReplaceFileCorruptionHandler replaceFileCorruptionHandler = new ReplaceFileCorruptionHandler(new androidx.room.f(20));
                t7.c cVarB = o7.c0.b(hVar);
                p pVar = new p(context, 0);
                q6.t tVar = q6.t.f8724a;
                try {
                    System.loadLibrary("datastore_shared_counter");
                    dataStoreCreate = MultiProcessDataStoreFactory.INSTANCE.create(hVar2, replaceFileCorruptionHandler, tVar, cVarB, pVar);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    dataStoreCreate = DataStoreFactory.INSTANCE.create(hVar2, replaceFileCorruptionHandler, tVar, cVarB, pVar);
                }
                if (dataStoreCreate != null) {
                    return dataStoreCreate;
                }
                com.google.gson.internal.a.i("Cannot return null from a non-@Nullable @Provides method");
                return null;
            case 1:
                return new d0((Context) this.f1317b.f4811b, (i1) this.f1318l.get());
            default:
                return new f3.d((b) this.f1318l.get(), (t6.h) this.f1317b.f4811b);
        }
    }

    public /* synthetic */ s(f0.i iVar, e3.c cVar, int i) {
        this.f1316a = i;
        this.f1317b = iVar;
        this.f1318l = cVar;
    }
}
