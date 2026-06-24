package androidx.room.support;

import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.model.WorkSpecDao_Impl;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f492b;

    public /* synthetic */ b(int i, int i6) {
        this.f491a = i6;
        this.f492b = i;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f491a) {
            case 0:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaxSqlCacheSize$lambda$11(this.f492b, (SupportSQLiteDatabase) obj);
            case 1:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_version_$lambda$1(this.f492b, (SupportSQLiteDatabase) obj);
            case 2:
                return Boolean.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.needUpgrade$lambda$9(this.f492b, (SupportSQLiteDatabase) obj));
            case 3:
                return WorkSpecDao_Impl.getAllEligibleWorkSpecsForScheduling$lambda$29("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", this.f492b, (SQLiteConnection) obj);
            case 4:
                return WorkSpecDao_Impl.getEligibleWorkForScheduling$lambda$25("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", this.f492b, (SQLiteConnection) obj);
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f492b + '.');
        }
    }
}
