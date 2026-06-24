package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import q6.l;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityInsertAdapter<T> {
    public abstract void bind(SQLiteStatement sQLiteStatement, T t9);

    public abstract String createQuery();

    public final void insert(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        sQLiteConnection.getClass();
        if (tArr == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        int i = 0;
        while (i < tArr.length) {
            try {
                int i6 = i + 1;
                try {
                    T t9 = tArr[i];
                    if (t9 != null) {
                        bind(sQLiteStatementPrepare, t9);
                        sQLiteStatementPrepare.step();
                        sQLiteStatementPrepare.reset();
                    }
                    i = i6;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            } finally {
            }
        }
        t0.f.g(sQLiteStatementPrepare, null);
    }

    public final long insertAndReturnId(SQLiteConnection sQLiteConnection, T t9) throws Exception {
        sQLiteConnection.getClass();
        if (t9 == null) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t9);
            sQLiteStatementPrepare.step();
            t0.f.g(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        sQLiteConnection.getClass();
        if (collection == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object objP0 = l.p0(collection, i);
                if (objP0 != null) {
                    bind(sQLiteStatementPrepare, objP0);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i] = lastInsertedRowId;
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        sQLiteConnection.getClass();
        if (collection == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object objP0 = l.p0(collection, i);
                if (objP0 != null) {
                    bind(sQLiteStatementPrepare, objP0);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i] = Long.valueOf(lastInsertedRowId);
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        sQLiteConnection.getClass();
        if (collection == null) {
            return t.f8724a;
        }
        r6.c cVarT = a.a.t();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            for (T t9 : collection) {
                if (t9 != null) {
                    bind(sQLiteStatementPrepare, t9);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    cVarT.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection)));
                } else {
                    cVarT.add(-1L);
                }
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return a.a.m(cVarT);
        } finally {
        }
    }

    public final void insert(SQLiteConnection sQLiteConnection, T t9) {
        sQLiteConnection.getClass();
        if (t9 == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t9);
            sQLiteStatementPrepare.step();
            t0.f.g(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final void insert(SQLiteConnection sQLiteConnection, Iterable<? extends T> iterable) throws Exception {
        sQLiteConnection.getClass();
        if (iterable == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            for (T t9 : iterable) {
                if (t9 != null) {
                    bind(sQLiteStatementPrepare, t9);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            t0.f.g(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        sQLiteConnection.getClass();
        if (tArr == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            int length = tArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                T t9 = tArr[i];
                if (t9 != null) {
                    bind(sQLiteStatementPrepare, t9);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i] = lastInsertedRowId;
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        sQLiteConnection.getClass();
        if (tArr == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                T t9 = tArr[i];
                if (t9 != null) {
                    bind(sQLiteStatementPrepare, t9);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i] = Long.valueOf(lastInsertedRowId);
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        sQLiteConnection.getClass();
        if (tArr == null) {
            return t.f8724a;
        }
        r6.c cVarT = a.a.t();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            for (T t9 : tArr) {
                if (t9 != null) {
                    bind(sQLiteStatementPrepare, t9);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    cVarT.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection)));
                } else {
                    cVarT.add(-1L);
                }
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return a.a.m(cVarT);
        } finally {
        }
    }
}
