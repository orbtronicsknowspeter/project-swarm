package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityDeleteOrUpdateAdapter<T> {
    public abstract void bind(SQLiteStatement sQLiteStatement, T t9);

    public abstract String createQuery();

    public final int handle(SQLiteConnection sQLiteConnection, T t9) {
        sQLiteConnection.getClass();
        if (t9 == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, t9);
            sQLiteStatementPrepare.step();
            t0.f.g(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
        }
    }

    public final int handleMultiple(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        sQLiteConnection.getClass();
        int totalChangedRows = 0;
        if (tArr == null) {
            return 0;
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
                        totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
                    }
                    i = i6;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            } finally {
            }
        }
        t0.f.g(sQLiteStatementPrepare, null);
        return totalChangedRows;
    }

    public final int handleMultiple(SQLiteConnection sQLiteConnection, Iterable<? extends T> iterable) throws Exception {
        sQLiteConnection.getClass();
        int totalChangedRows = 0;
        if (iterable == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            for (T t9 : iterable) {
                if (t9 != null) {
                    bind(sQLiteStatementPrepare, t9);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
                }
            }
            t0.f.g(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }
}
