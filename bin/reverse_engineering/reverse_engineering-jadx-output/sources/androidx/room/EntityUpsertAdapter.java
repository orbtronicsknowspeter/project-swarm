package androidx.room;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import java.util.Collection;
import java.util.List;
import l7.m;
import q6.l;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class EntityUpsertAdapter<T> {
    public static final Companion Companion = new Companion(null);
    private static final String ErrorMsg = "unique";
    private static final String SQLITE_CONSTRAINT_PRIMARYKEY = "1555";
    private static final String SQLITE_CONSTRAINT_UNIQUE = "2067";
    private final EntityInsertAdapter<T> entityInsertAdapter;
    private final EntityDeleteOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertAdapter(EntityInsertAdapter<T> entityInsertAdapter, EntityDeleteOrUpdateAdapter<T> entityDeleteOrUpdateAdapter) {
        entityInsertAdapter.getClass();
        entityDeleteOrUpdateAdapter.getClass();
        this.entityInsertAdapter = entityInsertAdapter;
        this.updateAdapter = entityDeleteOrUpdateAdapter;
    }

    private final void checkUniquenessException(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!m.q0(message, ErrorMsg, true) && !m.q0(message, SQLITE_CONSTRAINT_UNIQUE, false) && !m.q0(message, SQLITE_CONSTRAINT_PRIMARYKEY, false)) {
            throw sQLException;
        }
    }

    public final void upsert(SQLiteConnection sQLiteConnection, Iterable<? extends T> iterable) {
        sQLiteConnection.getClass();
        if (iterable == null) {
            return;
        }
        for (T t9 : iterable) {
            try {
                this.entityInsertAdapter.insert(sQLiteConnection, t9);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, t9);
            }
        }
    }

    public final long upsertAndReturnId(SQLiteConnection sQLiteConnection, T t9) {
        sQLiteConnection.getClass();
        try {
            return this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, t9);
        } catch (SQLException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(sQLiteConnection, t9);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long jInsertAndReturnId;
        sQLiteConnection.getClass();
        if (collection == null) {
            return new long[0];
        }
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, (T) l.p0(collection, i));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, (T) l.p0(collection, i));
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long jInsertAndReturnId;
        sQLiteConnection.getClass();
        if (collection == null) {
            return new Long[0];
        }
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, (T) l.p0(collection, i));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, (T) l.p0(collection, i));
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) {
        sQLiteConnection.getClass();
        if (collection == null) {
            return t.f8724a;
        }
        r6.c cVarT = a.a.t();
        for (T t9 : collection) {
            try {
                cVarT.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, t9)));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, t9);
                cVarT.add(-1L);
            }
        }
        return a.a.m(cVarT);
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void upsert(SQLiteConnection sQLiteConnection, T[] tArr) {
        sQLiteConnection.getClass();
        if (tArr == null) {
            return;
        }
        for (T t9 : tArr) {
            try {
                this.entityInsertAdapter.insert(sQLiteConnection, t9);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, t9);
            }
        }
    }

    public final void upsert(SQLiteConnection sQLiteConnection, T t9) {
        sQLiteConnection.getClass();
        try {
            this.entityInsertAdapter.insert(sQLiteConnection, t9);
        } catch (SQLException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(sQLiteConnection, t9);
        }
    }

    public final long[] upsertAndReturnIdsArray(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long jInsertAndReturnId;
        sQLiteConnection.getClass();
        if (tArr == null) {
            return new long[0];
        }
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, tArr[i]);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, tArr[i]);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long jInsertAndReturnId;
        sQLiteConnection.getClass();
        if (tArr == null) {
            return new Long[0];
        }
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, tArr[i]);
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, tArr[i]);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection sQLiteConnection, T[] tArr) {
        sQLiteConnection.getClass();
        if (tArr == null) {
            return t.f8724a;
        }
        r6.c cVarT = a.a.t();
        for (T t9 : tArr) {
            try {
                cVarT.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, t9)));
            } catch (SQLException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(sQLiteConnection, t9);
                cVarT.add(-1L);
            }
        }
        return a.a.m(cVarT);
    }
}
