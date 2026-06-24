package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import d7.l;
import f7.a;
import java.util.List;
import kotlin.jvm.internal.m;
import o7.a0;
import o7.c0;
import o7.m0;
import q6.t;
import v7.d;
import v7.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {
    public static final a preferencesDataStore(String str, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, l lVar, a0 a0Var) {
        str.getClass();
        lVar.getClass();
        a0Var.getClass();
        return new PreferenceDataStoreSingletonDelegate(str, replaceFileCorruptionHandler, lVar, a0Var);
    }

    public static a preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, l lVar, a0 a0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        if ((i & 8) != 0) {
            e eVar = m0.f8289a;
            a0Var = c0.b(d.f10885a.plus(c0.d()));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, lVar, a0Var);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass1 extends m implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // d7.l
        public final List<DataMigration<Preferences>> invoke(Context context) {
            context.getClass();
            return t.f8725a;
        }
    }
}
