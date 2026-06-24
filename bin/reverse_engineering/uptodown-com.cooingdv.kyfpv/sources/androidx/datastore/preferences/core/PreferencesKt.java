package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import androidx.privacysandbox.ads.adservices.customaudience.a;
import d7.p;
import p6.x;
import t6.c;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ p $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p pVar, c cVar) {
            super(2, cVar);
            this.$transform = pVar;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // d7.p
        public final Object invoke(Preferences preferences, c cVar) {
            return ((AnonymousClass2) create(preferences, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                p6.a.e(obj);
                return mutablePreferences;
            }
            p6.a.e(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            p pVar = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            Object objInvoke = pVar.invoke(mutablePreferences2, this);
            u6.a aVar = u6.a.f10763a;
            return objInvoke == aVar ? aVar : mutablePreferences2;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, p pVar, c cVar) {
        return dataStore.updateData(new AnonymousClass2(pVar, null), cVar);
    }
}
