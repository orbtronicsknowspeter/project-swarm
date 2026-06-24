package androidx.datastore.core;

import t6.c;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public interface DataMigration<T> {
    Object cleanUp(c cVar);

    Object migrate(T t9, c cVar);

    Object shouldMigrate(T t9, c cVar);
}
