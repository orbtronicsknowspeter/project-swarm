package androidx.room.util;

import android.os.Build;
import androidx.sqlite.SQLiteStatement;
import l7.u;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        str.getClass();
        int iColumnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, str);
        if (iColumnIndexOfCommon >= 0) {
            return iColumnIndexOfCommon;
        }
        int iColumnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, "`" + str + '`');
        return iColumnIndexOfCommon2 >= 0 ? iColumnIndexOfCommon2 : findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(sQLiteStatement, str);
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(SQLiteStatement sQLiteStatement, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        String strConcat = ".".concat(str);
        String str2 = "." + str + '`';
        for (int i = 0; i < columnCount; i++) {
            String columnName = sQLiteStatement.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (u.k0(columnName, strConcat, false) || (columnName.charAt(0) == '`' && u.k0(columnName, str2, false)))) {
                return i;
            }
        }
        return -1;
    }
}
