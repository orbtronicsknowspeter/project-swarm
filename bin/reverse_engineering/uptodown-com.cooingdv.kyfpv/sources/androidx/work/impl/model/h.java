package androidx.work.impl.model;

import androidx.sqlite.SQLiteConnection;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f622b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f623l;

    public /* synthetic */ h(String str, int i, long j) {
        this.f621a = i;
        this.f622b = j;
        this.f623l = str;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f621a) {
            case 0:
                return WorkSpecDao_Impl.setNextScheduleTimeOverride$lambda$45("UPDATE workspec SET next_schedule_time_override=? WHERE id=?", this.f622b, this.f623l, (SQLiteConnection) obj);
            case 1:
                return Integer.valueOf(WorkSpecDao_Impl.markWorkSpecScheduled$lambda$47("UPDATE workspec SET schedule_requested_at=? WHERE id=?", this.f622b, this.f623l, (SQLiteConnection) obj));
            default:
                return WorkSpecDao_Impl.setLastEnqueueTime$lambda$42("UPDATE workspec SET last_enqueue_time=? WHERE id=?", this.f622b, this.f623l, (SQLiteConnection) obj);
        }
    }
}
