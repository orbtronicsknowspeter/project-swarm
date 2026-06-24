package androidx.work.impl.model;

import androidx.room.AmbiguousColumnResolver;
import androidx.sqlite.SQLiteConnection;
import d7.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f609b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f610l;

    public /* synthetic */ d(int i, String str) {
        this.f608a = 2;
        this.f610l = i;
        this.f609b = str;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f608a) {
            case 0:
                return SystemIdInfoDao_Impl.removeSystemIdInfo$lambda$3("DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?", (String) this.f609b, this.f610l, (SQLiteConnection) obj);
            case 1:
                return SystemIdInfoDao_Impl.getSystemIdInfo$lambda$1("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", (String) this.f609b, this.f610l, (SQLiteConnection) obj);
            case 2:
                return WorkSpecDao_Impl.setStopReason$lambda$51("UPDATE workspec SET stop_reason=? WHERE id=?", this.f610l, (String) this.f609b, (SQLiteConnection) obj);
            case 3:
                return WorkSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride$lambda$46("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)", (String) this.f609b, this.f610l, (SQLiteConnection) obj);
            default:
                return AmbiguousColumnResolver.resolve$lambda$16$lambda$15((ArrayList) this.f609b, this.f610l, (List) obj);
        }
    }

    public /* synthetic */ d(Serializable serializable, int i, int i6) {
        this.f608a = i6;
        this.f609b = serializable;
        this.f610l = i;
    }
}
