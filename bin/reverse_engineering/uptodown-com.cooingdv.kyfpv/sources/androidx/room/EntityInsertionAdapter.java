package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import q6.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        roomDatabase.getClass();
    }

    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t9);

    public final void insert(Iterable<? extends T> iterable) {
        iterable.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long insertAndReturnId(T t9) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t9);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        collection.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t9 : collection) {
                int i6 = i + 1;
                if (i < 0) {
                    m.h0();
                    throw null;
                }
                bind(supportSQLiteStatementAcquire, t9);
                jArr[i] = supportSQLiteStatementAcquire.executeInsert();
                i = i6;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        tArr.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            int i = 0;
            int i6 = 0;
            while (i < length) {
                int i10 = i6 + 1;
                try {
                    bind(supportSQLiteStatementAcquire, tArr[i6]);
                    lArr[i] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                    i++;
                    i6 = i10;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        collection.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            r6.c cVarT = a.a.t();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                cVarT.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            r6.c cVarM = a.a.m(cVarT);
            release(supportSQLiteStatementAcquire);
            return cVarM;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final void insert(T[] tArr) {
        tArr.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t9 : tArr) {
                bind(supportSQLiteStatementAcquire, t9);
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T t9) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t9);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        collection.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        tArr.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            r6.c cVarT = a.a.t();
            for (T t9 : tArr) {
                bind(supportSQLiteStatementAcquire, t9);
                cVarT.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            r6.c cVarM = a.a.m(cVarT);
            release(supportSQLiteStatementAcquire);
            return cVarM;
        } catch (Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        tArr.getClass();
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int length = tArr.length;
            int i = 0;
            int i6 = 0;
            while (i < length) {
                int i10 = i6 + 1;
                bind(supportSQLiteStatementAcquire, tArr[i]);
                jArr[i6] = supportSQLiteStatementAcquire.executeInsert();
                i++;
                i6 = i10;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}
