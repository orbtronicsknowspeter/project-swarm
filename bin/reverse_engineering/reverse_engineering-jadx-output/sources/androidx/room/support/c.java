package androidx.room.support;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.model.WorkSpecDao_Impl;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f494b;

    public /* synthetic */ c(int i, long j) {
        this.f493a = i;
        this.f494b = j;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f493a) {
            case 0:
                return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaximumSize$lambda$2(this.f494b, (SupportSQLiteDatabase) obj));
            case 1:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_pageSize_$lambda$3(this.f494b, (SupportSQLiteDatabase) obj);
            case 2:
                return WorkSpecDao_Impl.getRecentlyCompletedWork$lambda$35("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", this.f494b, (SQLiteConnection) obj);
            default:
                ((MutablePreferences) obj).set(q2.i.f8673b, Long.valueOf(this.f494b));
                return null;
        }
    }
}
