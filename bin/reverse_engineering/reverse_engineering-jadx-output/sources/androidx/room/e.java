package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f487b;

    public /* synthetic */ e(RoomDatabase roomDatabase, int i) {
        this.f486a = i;
        this.f487b = roomDatabase;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f486a) {
            case 0:
                return RoomDatabase.endTransaction$lambda$9(this.f487b, (SupportSQLiteDatabase) obj);
            case 1:
                return RoomDatabase.createConnectionManager$lambda$1(this.f487b, (DatabaseConfiguration) obj);
            default:
                return RoomDatabase.beginTransaction$lambda$8(this.f487b, (SupportSQLiteDatabase) obj);
        }
    }
}
