package androidx.room;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.lifecycle.k;
import androidx.lifecycle.viewmodel.CreationExtrasKt;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.serialization.SavedStateConfigurationKt;
import androidx.savedstate.serialization.SavedStateConfiguration_androidKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.Data;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.utils.PreferenceUtils;
import b8.j;
import com.uptodown.activities.MainActivity;
import d7.l;
import f3.h;
import f8.b0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l7.i;
import o7.w;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f488a;

    public /* synthetic */ f(int i) {
        this.f488a = i;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f488a) {
            case 0:
                return RoomRawQuery._init_$lambda$0((SQLiteStatement) obj);
            case 1:
                return Boolean.valueOf(TransactorKt.execSQL$lambda$0((SQLiteStatement) obj));
            case 2:
                return TriggerBasedInvalidationTracker.checkInvalidatedTables$lambda$14((SQLiteStatement) obj);
            case 3:
                return SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE$lambda$1$lambda$0((List) obj);
            case 4:
                return SavedStateConfiguration_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            case 5:
                return Data.toString$lambda$7$lambda$6((Map.Entry) obj);
            case 6:
                return WorkConstraintsTracker.areAllConstraintsMet$lambda$5((ConstraintController) obj);
            case 7:
                return SystemIdInfoDao_Impl.getWorkSpecIds$lambda$2("SELECT DISTINCT work_spec_id FROM SystemIdInfo", (SQLiteConnection) obj);
            case 8:
                return WorkProgressDao_Impl.deleteAll$lambda$3("DELETE FROM WorkProgress", (SQLiteConnection) obj);
            case 9:
                return WorkSpecDao_Impl.getAllUnfinishedWork$lambda$21("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", (SQLiteConnection) obj);
            case 10:
                return Integer.valueOf(WorkSpecDao_Impl.countNonFinishedContentUriTriggerWorkers$lambda$36("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", (SQLiteConnection) obj));
            case 11:
                return WorkSpecDao_Impl.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", (SQLiteConnection) obj);
            case 12:
                return Boolean.valueOf(WorkSpecDao_Impl.hasUnfinishedWorkFlow$lambda$22("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", (SQLiteConnection) obj));
            case 13:
                return Integer.valueOf(WorkSpecDao_Impl.resetScheduledState$lambda$48("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)", (SQLiteConnection) obj));
            case 14:
                return WorkSpecDao_Impl.getScheduledWork$lambda$31("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", (SQLiteConnection) obj);
            case 15:
                return WorkSpecDao_Impl.getAllWorkSpecIds$lambda$5("SELECT id FROM workspec", (SQLiteConnection) obj);
            case 16:
                return WorkSpecDao_Impl.getAllWorkSpecIdsLiveData$lambda$6("SELECT id FROM workspec", (SQLiteConnection) obj);
            case 17:
                return WorkSpecDao_Impl.getRunningWork$lambda$33("SELECT * FROM workspec WHERE state=1", (SQLiteConnection) obj);
            case 18:
                return WorkSpecDao_Impl.getEligibleWorkForSchedulingWithContentUris$lambda$27("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", (SQLiteConnection) obj);
            case 19:
                return PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
            case 20:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException);
                return h.f4853b;
            case 21:
                return (CharSequence) ((l7.h) ((i) obj).a()).get(1);
            case 22:
                i iVar = (i) obj;
                int i = MainActivity.G0;
                iVar.getClass();
                return (CharSequence) ((l7.h) iVar.a()).get(1);
            case 23:
                i iVar2 = (i) obj;
                int i6 = MainActivity.G0;
                iVar2.getClass();
                return (CharSequence) ((l7.h) iVar2.a()).get(1);
            case 24:
                b8.a aVar = (b8.a) obj;
                aVar.getClass();
                b8.a.a(aVar, "JsonPrimitive", new j(new k(13)));
                b8.a.a(aVar, "JsonNull", new j(new k(14)));
                b8.a.a(aVar, "JsonLiteral", new j(new k(15)));
                b8.a.a(aVar, "JsonObject", new j(new k(16)));
                b8.a.a(aVar, "JsonArray", new j(new k(17)));
                return x.f8464a;
            case 25:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                e8.k kVar = (e8.k) entry.getValue();
                StringBuilder sb = new StringBuilder();
                b0.a(str, sb);
                sb.append(':');
                sb.append(kVar);
                return sb.toString();
            case 26:
                return CreationExtrasKt.CreationExtras$lambda$0((MutableCreationExtras) obj);
            case 27:
                Byte b7 = (Byte) obj;
                b7.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b7}, 1));
            case 28:
                return Boolean.valueOf(obj == null);
            default:
                t6.f fVar = (t6.f) obj;
                if (fVar instanceof w) {
                    return (w) fVar;
                }
                return null;
        }
    }
}
