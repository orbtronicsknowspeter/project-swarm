package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import d7.l;
import java.io.File;
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
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessDataStoreFactory$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass1 extends m implements l {
        final /* synthetic */ a0 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a0 a0Var) {
            super(1);
            this.$scope = a0Var;
        }

        @Override // d7.l
        public final InterProcessCoordinator invoke(File file) {
            file.getClass();
            return new MultiProcessCoordinator(this.$scope.getCoroutineContext(), file);
        }
    }

    private MultiProcessDataStoreFactory() {
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, a0 a0Var, d7.a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = t.f8725a;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            e eVar = m0.f8289a;
            a0Var = c0.b(d.f10885a.plus(c0.d()));
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, a0Var, aVar);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, a0 a0Var, d7.a aVar) {
        serializer.getClass();
        list.getClass();
        a0Var.getClass();
        aVar.getClass();
        FileStorage fileStorage = new FileStorage(serializer, new AnonymousClass1(a0Var), aVar);
        List listH = a.a.H(DataMigrationInitializer.Companion.getInitializer(list));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, listH, replaceFileCorruptionHandler, a0Var);
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, a0 a0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = t.f8725a;
        }
        if ((i & 8) != 0) {
            e eVar = m0.f8289a;
            a0Var = c0.b(d.f10885a.plus(c0.d()));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, a0Var);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, d7.a aVar) {
        serializer.getClass();
        list.getClass();
        aVar.getClass();
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, aVar, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, d7.a aVar) {
        serializer.getClass();
        aVar.getClass();
        return create$default(this, serializer, null, null, null, aVar, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        storage.getClass();
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        storage.getClass();
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list) {
        storage.getClass();
        list.getClass();
        return create$default(this, storage, replaceFileCorruptionHandler, list, null, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, a0 a0Var) {
        storage.getClass();
        list.getClass();
        a0Var.getClass();
        List listH = a.a.H(DataMigrationInitializer.Companion.getInitializer(list));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, listH, replaceFileCorruptionHandler, a0Var);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, d7.a aVar) {
        serializer.getClass();
        aVar.getClass();
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, aVar, 12, null);
    }
}
