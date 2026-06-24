package androidx.work.impl.model;

import a4.x;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import d7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q6.a0;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkSpec> __insertAdapterOfWorkSpec;
    private final EntityDeleteOrUpdateAdapter<WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        roomDatabase.getClass();
        this.__db = roomDatabase;
        this.__insertAdapterOfWorkSpec = new EntityInsertAdapter<WorkSpec>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement sQLiteStatement, WorkSpec workSpec) {
                sQLiteStatement.getClass();
                workSpec.getClass();
                sQLiteStatement.mo92bindText(1, workSpec.id);
                sQLiteStatement.mo90bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                sQLiteStatement.mo92bindText(3, workSpec.workerClassName);
                sQLiteStatement.mo92bindText(4, workSpec.inputMergerClassName);
                Data.Companion companion = Data.Companion;
                sQLiteStatement.mo88bindBlob(5, companion.toByteArrayInternalV1(workSpec.input));
                sQLiteStatement.mo88bindBlob(6, companion.toByteArrayInternalV1(workSpec.output));
                sQLiteStatement.mo90bindLong(7, workSpec.initialDelay);
                sQLiteStatement.mo90bindLong(8, workSpec.intervalDuration);
                sQLiteStatement.mo90bindLong(9, workSpec.flexDuration);
                sQLiteStatement.mo90bindLong(10, workSpec.runAttemptCount);
                sQLiteStatement.mo90bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                sQLiteStatement.mo90bindLong(12, workSpec.backoffDelayDuration);
                sQLiteStatement.mo90bindLong(13, workSpec.lastEnqueueTime);
                sQLiteStatement.mo90bindLong(14, workSpec.minimumRetentionDuration);
                sQLiteStatement.mo90bindLong(15, workSpec.scheduleRequestedAt);
                sQLiteStatement.mo90bindLong(16, workSpec.expedited ? 1L : 0L);
                sQLiteStatement.mo90bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                sQLiteStatement.mo90bindLong(18, workSpec.getPeriodCount());
                sQLiteStatement.mo90bindLong(19, workSpec.getGeneration());
                sQLiteStatement.mo90bindLong(20, workSpec.getNextScheduleTimeOverride());
                sQLiteStatement.mo90bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
                sQLiteStatement.mo90bindLong(22, workSpec.getStopReason());
                String traceTag = workSpec.getTraceTag();
                if (traceTag == null) {
                    sQLiteStatement.mo91bindNull(23);
                } else {
                    sQLiteStatement.mo92bindText(23, traceTag);
                }
                Boolean backOffOnSystemInterruptions = workSpec.getBackOffOnSystemInterruptions();
                if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.mo91bindNull(24);
                } else {
                    sQLiteStatement.mo90bindLong(24, r0.intValue());
                }
                Constraints constraints = workSpec.constraints;
                sQLiteStatement.mo90bindLong(25, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                sQLiteStatement.mo88bindBlob(26, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat$work_runtime_release()));
                sQLiteStatement.mo90bindLong(27, constraints.requiresCharging() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(28, constraints.requiresDeviceIdle() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(29, constraints.requiresBatteryNotLow() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(30, constraints.requiresStorageNotLow() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(31, constraints.getContentTriggerUpdateDelayMillis());
                sQLiteStatement.mo90bindLong(32, constraints.getContentTriggerMaxDelayMillis());
                sQLiteStatement.mo88bindBlob(33, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
            }

            @Override // androidx.room.EntityInsertAdapter
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfWorkSpec = new EntityDeleteOrUpdateAdapter<WorkSpec>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement sQLiteStatement, WorkSpec workSpec) {
                sQLiteStatement.getClass();
                workSpec.getClass();
                sQLiteStatement.mo92bindText(1, workSpec.id);
                sQLiteStatement.mo90bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                sQLiteStatement.mo92bindText(3, workSpec.workerClassName);
                sQLiteStatement.mo92bindText(4, workSpec.inputMergerClassName);
                Data.Companion companion = Data.Companion;
                sQLiteStatement.mo88bindBlob(5, companion.toByteArrayInternalV1(workSpec.input));
                sQLiteStatement.mo88bindBlob(6, companion.toByteArrayInternalV1(workSpec.output));
                sQLiteStatement.mo90bindLong(7, workSpec.initialDelay);
                sQLiteStatement.mo90bindLong(8, workSpec.intervalDuration);
                sQLiteStatement.mo90bindLong(9, workSpec.flexDuration);
                sQLiteStatement.mo90bindLong(10, workSpec.runAttemptCount);
                sQLiteStatement.mo90bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                sQLiteStatement.mo90bindLong(12, workSpec.backoffDelayDuration);
                sQLiteStatement.mo90bindLong(13, workSpec.lastEnqueueTime);
                sQLiteStatement.mo90bindLong(14, workSpec.minimumRetentionDuration);
                sQLiteStatement.mo90bindLong(15, workSpec.scheduleRequestedAt);
                sQLiteStatement.mo90bindLong(16, workSpec.expedited ? 1L : 0L);
                sQLiteStatement.mo90bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                sQLiteStatement.mo90bindLong(18, workSpec.getPeriodCount());
                sQLiteStatement.mo90bindLong(19, workSpec.getGeneration());
                sQLiteStatement.mo90bindLong(20, workSpec.getNextScheduleTimeOverride());
                sQLiteStatement.mo90bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
                sQLiteStatement.mo90bindLong(22, workSpec.getStopReason());
                String traceTag = workSpec.getTraceTag();
                if (traceTag == null) {
                    sQLiteStatement.mo91bindNull(23);
                } else {
                    sQLiteStatement.mo92bindText(23, traceTag);
                }
                Boolean backOffOnSystemInterruptions = workSpec.getBackOffOnSystemInterruptions();
                if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.mo91bindNull(24);
                } else {
                    sQLiteStatement.mo90bindLong(24, r0.intValue());
                }
                Constraints constraints = workSpec.constraints;
                sQLiteStatement.mo90bindLong(25, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                sQLiteStatement.mo88bindBlob(26, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat$work_runtime_release()));
                sQLiteStatement.mo90bindLong(27, constraints.requiresCharging() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(28, constraints.requiresDeviceIdle() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(29, constraints.requiresBatteryNotLow() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(30, constraints.requiresStorageNotLow() ? 1L : 0L);
                sQLiteStatement.mo90bindLong(31, constraints.getContentTriggerUpdateDelayMillis());
                sQLiteStatement.mo90bindLong(32, constraints.getContentTriggerMaxDelayMillis());
                sQLiteStatement.mo88bindBlob(33, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
                sQLiteStatement.mo92bindText(34, workSpec.id);
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }
        };
    }

    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(SQLiteConnection sQLiteConnection, ArrayMap<String, List<Data>> arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new i(this, sQLiteConnection, 0));
            return;
        }
        StringBuilder sbT = x.t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sbT, setKeySet.size());
        sbT.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbT.toString());
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo92bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                List<Data> list = arrayMap.get(sQLiteStatementPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(0)));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$53(WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        arrayMap.getClass();
        workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap);
        return p6.x.f8463a;
    }

    private final void __fetchRelationshipWorkTagAsjavaLangString(SQLiteConnection sQLiteConnection, ArrayMap<String, List<String>> arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new i(this, sQLiteConnection, 1));
            return;
        }
        StringBuilder sbT = x.t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sbT, setKeySet.size());
        sbT.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbT.toString());
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo92bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                List<String> list = arrayMap.get(sQLiteStatementPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(sQLiteStatementPrepare.getText(0));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x __fetchRelationshipWorkTagAsjavaLangString$lambda$52(WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        arrayMap.getClass();
        workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
        return p6.x.f8463a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countNonFinishedContentUriTriggerWorkers$lambda$36(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            return sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x delete$lambda$37(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllEligibleWorkSpecsForScheduling$lambda$29(String str, int i, SQLiteConnection sQLiteConnection) {
        int i6;
        Integer numValueOf;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i10 = columnIndexOrThrow13;
                int i11 = columnIndexOrThrow14;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j12 = sQLiteStatementPrepare.getLong(i10);
                long j13 = sQLiteStatementPrepare.getLong(i11);
                int i15 = columnIndexOrThrow15;
                long j14 = sQLiteStatementPrepare.getLong(i15);
                columnIndexOrThrow15 = i15;
                int i16 = columnIndexOrThrow16;
                int i17 = columnIndexOrThrow3;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(i16)) != 0;
                int i18 = columnIndexOrThrow17;
                int i19 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i18));
                int i20 = columnIndexOrThrow18;
                int i21 = (int) sQLiteStatementPrepare.getLong(i20);
                int i22 = columnIndexOrThrow19;
                int i23 = (int) sQLiteStatementPrepare.getLong(i22);
                int i24 = columnIndexOrThrow20;
                long j15 = sQLiteStatementPrepare.getLong(i24);
                int i25 = columnIndexOrThrow21;
                int i26 = (int) sQLiteStatementPrepare.getLong(i25);
                columnIndexOrThrow21 = i25;
                int i27 = columnIndexOrThrow22;
                int i28 = (int) sQLiteStatementPrepare.getLong(i27);
                int i29 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                int i30 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i6 = i29;
                    columnIndexOrThrow22 = i27;
                    numValueOf = null;
                } else {
                    i6 = i29;
                    columnIndexOrThrow22 = i27;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = columnIndexOrThrow25;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i32));
                int i33 = columnIndexOrThrow27;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                int i34 = columnIndexOrThrow28;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(i34)) != 0;
                int i35 = columnIndexOrThrow29;
                boolean z12 = ((int) sQLiteStatementPrepare.getLong(i35)) != 0;
                columnIndexOrThrow29 = i35;
                int i36 = columnIndexOrThrow30;
                int i37 = columnIndexOrThrow31;
                int i38 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i37;
                int i39 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j, j6, j10, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, ((int) sQLiteStatementPrepare.getLong(i36)) != 0, sQLiteStatementPrepare.getLong(i37), sQLiteStatementPrepare.getLong(i38), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i39))), i12, backoffPolicyIntToBackoffPolicy, j11, j12, j13, j14, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i21, i23, j15, i26, i28, text4, bool));
                columnIndexOrThrow28 = i34;
                columnIndexOrThrow4 = i19;
                columnIndexOrThrow17 = i18;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow20 = i24;
                columnIndexOrThrow23 = i6;
                columnIndexOrThrow24 = i30;
                columnIndexOrThrow25 = i31;
                columnIndexOrThrow26 = i32;
                columnIndexOrThrow27 = i33;
                columnIndexOrThrow33 = i39;
                columnIndexOrThrow32 = i38;
                columnIndexOrThrow30 = i36;
                columnIndexOrThrow = i13;
                columnIndexOrThrow13 = i10;
                columnIndexOrThrow14 = i11;
                columnIndexOrThrow2 = i14;
                columnIndexOrThrow3 = i17;
                columnIndexOrThrow16 = i16;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllUnfinishedWork$lambda$21(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllWorkSpecIds$lambda$5(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllWorkSpecIdsLiveData$lambda$6(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getEligibleWorkForScheduling$lambda$25(String str, int i, SQLiteConnection sQLiteConnection) {
        int i6;
        Integer numValueOf;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i10 = columnIndexOrThrow13;
                int i11 = columnIndexOrThrow14;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i13 = columnIndexOrThrow;
                int i14 = columnIndexOrThrow2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j12 = sQLiteStatementPrepare.getLong(i10);
                long j13 = sQLiteStatementPrepare.getLong(i11);
                int i15 = columnIndexOrThrow15;
                long j14 = sQLiteStatementPrepare.getLong(i15);
                columnIndexOrThrow15 = i15;
                int i16 = columnIndexOrThrow16;
                int i17 = columnIndexOrThrow3;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(i16)) != 0;
                int i18 = columnIndexOrThrow17;
                int i19 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i18));
                int i20 = columnIndexOrThrow18;
                int i21 = (int) sQLiteStatementPrepare.getLong(i20);
                int i22 = columnIndexOrThrow19;
                int i23 = (int) sQLiteStatementPrepare.getLong(i22);
                int i24 = columnIndexOrThrow20;
                long j15 = sQLiteStatementPrepare.getLong(i24);
                int i25 = columnIndexOrThrow21;
                int i26 = (int) sQLiteStatementPrepare.getLong(i25);
                columnIndexOrThrow21 = i25;
                int i27 = columnIndexOrThrow22;
                int i28 = (int) sQLiteStatementPrepare.getLong(i27);
                int i29 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                int i30 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i6 = i29;
                    columnIndexOrThrow22 = i27;
                    numValueOf = null;
                } else {
                    i6 = i29;
                    columnIndexOrThrow22 = i27;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i31 = columnIndexOrThrow25;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i32));
                int i33 = columnIndexOrThrow27;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                int i34 = columnIndexOrThrow28;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(i34)) != 0;
                int i35 = columnIndexOrThrow29;
                boolean z12 = ((int) sQLiteStatementPrepare.getLong(i35)) != 0;
                columnIndexOrThrow29 = i35;
                int i36 = columnIndexOrThrow30;
                int i37 = columnIndexOrThrow31;
                int i38 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i37;
                int i39 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j, j6, j10, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, ((int) sQLiteStatementPrepare.getLong(i36)) != 0, sQLiteStatementPrepare.getLong(i37), sQLiteStatementPrepare.getLong(i38), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i39))), i12, backoffPolicyIntToBackoffPolicy, j11, j12, j13, j14, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i21, i23, j15, i26, i28, text4, bool));
                columnIndexOrThrow28 = i34;
                columnIndexOrThrow4 = i19;
                columnIndexOrThrow17 = i18;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow20 = i24;
                columnIndexOrThrow23 = i6;
                columnIndexOrThrow24 = i30;
                columnIndexOrThrow25 = i31;
                columnIndexOrThrow26 = i32;
                columnIndexOrThrow27 = i33;
                columnIndexOrThrow33 = i39;
                columnIndexOrThrow32 = i38;
                columnIndexOrThrow30 = i36;
                columnIndexOrThrow = i13;
                columnIndexOrThrow13 = i10;
                columnIndexOrThrow14 = i11;
                columnIndexOrThrow2 = i14;
                columnIndexOrThrow3 = i17;
                columnIndexOrThrow16 = i16;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getEligibleWorkForSchedulingWithContentUris$lambda$27(String str, SQLiteConnection sQLiteConnection) {
        int i;
        int i6;
        Integer numValueOf;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i10 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j13 = sQLiteStatementPrepare.getLong(i10);
                int i14 = columnIndexOrThrow15;
                long j14 = sQLiteStatementPrepare.getLong(i14);
                int i15 = columnIndexOrThrow;
                int i16 = columnIndexOrThrow16;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(i16)) != 0;
                int i17 = columnIndexOrThrow17;
                int i18 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i17));
                int i19 = columnIndexOrThrow18;
                int i20 = columnIndexOrThrow5;
                int i21 = (int) sQLiteStatementPrepare.getLong(i19);
                int i22 = columnIndexOrThrow19;
                int i23 = (int) sQLiteStatementPrepare.getLong(i22);
                int i24 = columnIndexOrThrow20;
                long j15 = sQLiteStatementPrepare.getLong(i24);
                int i25 = columnIndexOrThrow21;
                int i26 = (int) sQLiteStatementPrepare.getLong(i25);
                int i27 = columnIndexOrThrow22;
                int i28 = (int) sQLiteStatementPrepare.getLong(i27);
                int i29 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                int i30 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i = i26;
                    i6 = i27;
                    numValueOf = null;
                } else {
                    i = i26;
                    i6 = i27;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i32));
                columnIndexOrThrow25 = i31;
                columnIndexOrThrow26 = i32;
                int i33 = columnIndexOrThrow27;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                columnIndexOrThrow27 = i33;
                int i34 = columnIndexOrThrow28;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(i34)) != 0;
                int i35 = columnIndexOrThrow29;
                boolean z12 = ((int) sQLiteStatementPrepare.getLong(i35)) != 0;
                columnIndexOrThrow29 = i35;
                int i36 = columnIndexOrThrow30;
                int i37 = columnIndexOrThrow31;
                int i38 = columnIndexOrThrow32;
                int i39 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i39;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j, j6, j10, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, ((int) sQLiteStatementPrepare.getLong(i36)) != 0, sQLiteStatementPrepare.getLong(i37), sQLiteStatementPrepare.getLong(i38), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i39))), i11, backoffPolicyIntToBackoffPolicy, j11, j12, j13, j14, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i21, i23, j15, i, i28, text4, bool));
                columnIndexOrThrow30 = i36;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow17 = i17;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow22 = i6;
                columnIndexOrThrow24 = i30;
                columnIndexOrThrow31 = i37;
                columnIndexOrThrow32 = i38;
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow14 = i10;
                columnIndexOrThrow3 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow = i15;
                columnIndexOrThrow15 = i14;
                columnIndexOrThrow16 = i16;
                columnIndexOrThrow20 = i24;
                columnIndexOrThrow21 = i25;
                columnIndexOrThrow23 = i29;
                columnIndexOrThrow28 = i34;
                columnIndexOrThrow5 = i20;
                columnIndexOrThrow18 = i19;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getInputsFromPrerequisites$lambda$18(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(0)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRecentlyCompletedWork$lambda$35(String str, long j, SQLiteConnection sQLiteConnection) {
        int i;
        Integer numValueOf;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i6 = columnIndexOrThrow13;
                int i10 = columnIndexOrThrow14;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i12 = columnIndexOrThrow;
                int i13 = columnIndexOrThrow2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j13 = sQLiteStatementPrepare.getLong(i6);
                long j14 = sQLiteStatementPrepare.getLong(i10);
                int i14 = columnIndexOrThrow15;
                long j15 = sQLiteStatementPrepare.getLong(i14);
                columnIndexOrThrow15 = i14;
                int i15 = columnIndexOrThrow16;
                int i16 = columnIndexOrThrow3;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(i15)) != 0;
                int i17 = columnIndexOrThrow17;
                int i18 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i17));
                int i19 = columnIndexOrThrow18;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = columnIndexOrThrow19;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow20;
                long j16 = sQLiteStatementPrepare.getLong(i23);
                int i24 = columnIndexOrThrow21;
                int i25 = (int) sQLiteStatementPrepare.getLong(i24);
                columnIndexOrThrow21 = i24;
                int i26 = columnIndexOrThrow22;
                int i27 = (int) sQLiteStatementPrepare.getLong(i26);
                int i28 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28);
                int i29 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i29)) {
                    i = i28;
                    columnIndexOrThrow22 = i26;
                    numValueOf = null;
                } else {
                    i = i28;
                    columnIndexOrThrow22 = i26;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i29));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i30 = columnIndexOrThrow25;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i30));
                int i31 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i31));
                int i32 = columnIndexOrThrow27;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(i32)) != 0;
                int i33 = columnIndexOrThrow28;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                int i34 = columnIndexOrThrow29;
                boolean z12 = ((int) sQLiteStatementPrepare.getLong(i34)) != 0;
                columnIndexOrThrow29 = i34;
                int i35 = columnIndexOrThrow30;
                int i36 = columnIndexOrThrow31;
                int i37 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i36;
                int i38 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j6, j10, j11, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, ((int) sQLiteStatementPrepare.getLong(i35)) != 0, sQLiteStatementPrepare.getLong(i36), sQLiteStatementPrepare.getLong(i37), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i38))), i11, backoffPolicyIntToBackoffPolicy, j12, j13, j14, j15, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i20, i22, j16, i25, i27, text4, bool));
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow17 = i17;
                columnIndexOrThrow18 = i19;
                columnIndexOrThrow19 = i21;
                columnIndexOrThrow20 = i23;
                columnIndexOrThrow23 = i;
                columnIndexOrThrow24 = i29;
                columnIndexOrThrow25 = i30;
                columnIndexOrThrow26 = i31;
                columnIndexOrThrow27 = i32;
                columnIndexOrThrow28 = i33;
                columnIndexOrThrow33 = i38;
                columnIndexOrThrow32 = i37;
                columnIndexOrThrow30 = i35;
                columnIndexOrThrow = i12;
                columnIndexOrThrow13 = i6;
                columnIndexOrThrow14 = i10;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow3 = i16;
                columnIndexOrThrow16 = i15;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRunningWork$lambda$33(String str, SQLiteConnection sQLiteConnection) {
        int i;
        int i6;
        Integer numValueOf;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i10 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j13 = sQLiteStatementPrepare.getLong(i10);
                int i14 = columnIndexOrThrow15;
                long j14 = sQLiteStatementPrepare.getLong(i14);
                int i15 = columnIndexOrThrow;
                int i16 = columnIndexOrThrow16;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(i16)) != 0;
                int i17 = columnIndexOrThrow17;
                int i18 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i17));
                int i19 = columnIndexOrThrow18;
                int i20 = columnIndexOrThrow5;
                int i21 = (int) sQLiteStatementPrepare.getLong(i19);
                int i22 = columnIndexOrThrow19;
                int i23 = (int) sQLiteStatementPrepare.getLong(i22);
                int i24 = columnIndexOrThrow20;
                long j15 = sQLiteStatementPrepare.getLong(i24);
                int i25 = columnIndexOrThrow21;
                int i26 = (int) sQLiteStatementPrepare.getLong(i25);
                int i27 = columnIndexOrThrow22;
                int i28 = (int) sQLiteStatementPrepare.getLong(i27);
                int i29 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                int i30 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i = i26;
                    i6 = i27;
                    numValueOf = null;
                } else {
                    i = i26;
                    i6 = i27;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i32));
                columnIndexOrThrow25 = i31;
                columnIndexOrThrow26 = i32;
                int i33 = columnIndexOrThrow27;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                columnIndexOrThrow27 = i33;
                int i34 = columnIndexOrThrow28;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(i34)) != 0;
                int i35 = columnIndexOrThrow29;
                boolean z12 = ((int) sQLiteStatementPrepare.getLong(i35)) != 0;
                columnIndexOrThrow29 = i35;
                int i36 = columnIndexOrThrow30;
                int i37 = columnIndexOrThrow31;
                int i38 = columnIndexOrThrow32;
                int i39 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i39;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j, j6, j10, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, ((int) sQLiteStatementPrepare.getLong(i36)) != 0, sQLiteStatementPrepare.getLong(i37), sQLiteStatementPrepare.getLong(i38), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i39))), i11, backoffPolicyIntToBackoffPolicy, j11, j12, j13, j14, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i21, i23, j15, i, i28, text4, bool));
                columnIndexOrThrow30 = i36;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow17 = i17;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow22 = i6;
                columnIndexOrThrow24 = i30;
                columnIndexOrThrow31 = i37;
                columnIndexOrThrow32 = i38;
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow14 = i10;
                columnIndexOrThrow3 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow = i15;
                columnIndexOrThrow15 = i14;
                columnIndexOrThrow16 = i16;
                columnIndexOrThrow20 = i24;
                columnIndexOrThrow21 = i25;
                columnIndexOrThrow23 = i29;
                columnIndexOrThrow28 = i34;
                columnIndexOrThrow5 = i20;
                columnIndexOrThrow18 = i19;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getScheduleRequestedAtLiveData$lambda$23(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            Long lValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(0));
            }
            return lValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getScheduledWork$lambda$31(String str, SQLiteConnection sQLiteConnection) {
        int i;
        int i6;
        Integer numValueOf;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i10 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i12 = columnIndexOrThrow2;
                int i13 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j13 = sQLiteStatementPrepare.getLong(i10);
                int i14 = columnIndexOrThrow15;
                long j14 = sQLiteStatementPrepare.getLong(i14);
                int i15 = columnIndexOrThrow;
                int i16 = columnIndexOrThrow16;
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(i16)) != 0;
                int i17 = columnIndexOrThrow17;
                int i18 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i17));
                int i19 = columnIndexOrThrow18;
                int i20 = columnIndexOrThrow5;
                int i21 = (int) sQLiteStatementPrepare.getLong(i19);
                int i22 = columnIndexOrThrow19;
                int i23 = (int) sQLiteStatementPrepare.getLong(i22);
                int i24 = columnIndexOrThrow20;
                long j15 = sQLiteStatementPrepare.getLong(i24);
                int i25 = columnIndexOrThrow21;
                int i26 = (int) sQLiteStatementPrepare.getLong(i25);
                int i27 = columnIndexOrThrow22;
                int i28 = (int) sQLiteStatementPrepare.getLong(i27);
                int i29 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29);
                int i30 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i = i26;
                    i6 = i27;
                    numValueOf = null;
                } else {
                    i = i26;
                    i6 = i27;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i31 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i31));
                int i32 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i32));
                columnIndexOrThrow25 = i31;
                columnIndexOrThrow26 = i32;
                int i33 = columnIndexOrThrow27;
                boolean z10 = ((int) sQLiteStatementPrepare.getLong(i33)) != 0;
                columnIndexOrThrow27 = i33;
                int i34 = columnIndexOrThrow28;
                boolean z11 = ((int) sQLiteStatementPrepare.getLong(i34)) != 0;
                int i35 = columnIndexOrThrow29;
                boolean z12 = ((int) sQLiteStatementPrepare.getLong(i35)) != 0;
                columnIndexOrThrow29 = i35;
                int i36 = columnIndexOrThrow30;
                int i37 = columnIndexOrThrow31;
                int i38 = columnIndexOrThrow32;
                int i39 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i39;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j, j6, j10, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, ((int) sQLiteStatementPrepare.getLong(i36)) != 0, sQLiteStatementPrepare.getLong(i37), sQLiteStatementPrepare.getLong(i38), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i39))), i11, backoffPolicyIntToBackoffPolicy, j11, j12, j13, j14, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i21, i23, j15, i, i28, text4, bool));
                columnIndexOrThrow30 = i36;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow17 = i17;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow22 = i6;
                columnIndexOrThrow24 = i30;
                columnIndexOrThrow31 = i37;
                columnIndexOrThrow32 = i38;
                columnIndexOrThrow2 = i12;
                columnIndexOrThrow14 = i10;
                columnIndexOrThrow3 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow = i15;
                columnIndexOrThrow15 = i14;
                columnIndexOrThrow16 = i16;
                columnIndexOrThrow20 = i24;
                columnIndexOrThrow21 = i25;
                columnIndexOrThrow23 = i29;
                columnIndexOrThrow28 = i34;
                columnIndexOrThrow5 = i20;
                columnIndexOrThrow18 = i19;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkInfo.State getState$lambda$7(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            WorkInfo.State stateIntToState = null;
            if (sQLiteStatementPrepare.step()) {
                Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    stateIntToState = WorkTypeConverters.intToState(numValueOf.intValue());
                }
            }
            return stateIntToState;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUnfinishedWorkWithName$lambda$20(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUnfinishedWorkWithTag$lambda$19(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkSpec getWorkSpec$lambda$3(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            WorkSpec workSpec = null;
            Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow5);
                Data.Companion companion = Data.Companion;
                Data dataFromByteArray = companion.fromByteArray(blob);
                Data dataFromByteArray2 = companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j10 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j11 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j12 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j13 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                long j14 = sQLiteStatementPrepare.getLong(columnIndexOrThrow15);
                boolean z9 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)) != 0;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17));
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow18);
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19);
                long j15 = sQLiteStatementPrepare.getLong(columnIndexOrThrow20);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21);
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                workSpec = new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j, j6, j10, new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(columnIndexOrThrow26)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow30)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow31), sQLiteStatementPrepare.getLong(columnIndexOrThrow32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(columnIndexOrThrow33))), i, backoffPolicyIntToBackoffPolicy, j11, j12, j13, j14, z9, outOfQuotaPolicyIntToOutOfQuotaPolicy, i6, i10, j15, i11, i12, text4, boolValueOf);
            }
            sQLiteStatementPrepare.close();
            return workSpec;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkSpecIdAndStatesForName$lambda$4(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new WorkSpec.IdAndState(sQLiteStatementPrepare.getText(0), WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(1))));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoFlowDataForIds$lambda$11(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i6 = 1;
            int i10 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo92bindText(i10, (String) it.next());
                i10++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i11 = (int) sQLiteStatementPrepare.getLong(3);
                int i12 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i13 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i14 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                List list2 = (List) objG0;
                Object objG02 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i11, backoffPolicyIntToBackoffPolicy, j11, j12, i13, i12, j13, i14, list2, (List) objG02));
                arrayMap2 = arrayMap3;
                i6 = 1;
                i = 0;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoFlowForName$lambda$17(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i6 = 1;
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i10 = (int) sQLiteStatementPrepare.getLong(3);
                int i11 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i12 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i13 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i10, backoffPolicyIntToBackoffPolicy, j11, j12, i12, i11, j13, i13, (List) objG0, (List) objG02));
                arrayMap = arrayMap3;
                i = 0;
                i6 = 1;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoFlowForTag$lambda$13(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i6 = 1;
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i10 = (int) sQLiteStatementPrepare.getLong(3);
                int i11 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i12 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i13 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i10, backoffPolicyIntToBackoffPolicy, j11, j12, i12, i11, j13, i13, (List) objG0, (List) objG02));
                arrayMap = arrayMap3;
                i = 0;
                i6 = 1;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkSpec.WorkInfoPojo getWorkStatusPojoForId$lambda$8(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        WorkSpec.WorkInfoPojo workInfoPojo;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            if (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(0);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(1));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i = (int) sQLiteStatementPrepare.getLong(3);
                int i6 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i10 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i11 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                workInfoPojo = new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i, backoffPolicyIntToBackoffPolicy, j11, j12, i10, i6, j13, i11, (List) objG0, (List) objG02);
            } else {
                workInfoPojo = null;
            }
            sQLiteStatementPrepare.close();
            return workInfoPojo;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoForIds$lambda$9(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i6 = 1;
            int i10 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo92bindText(i10, (String) it.next());
                i10++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i11 = (int) sQLiteStatementPrepare.getLong(3);
                int i12 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i13 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i14 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                List list2 = (List) objG0;
                Object objG02 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i11, backoffPolicyIntToBackoffPolicy, j11, j12, i13, i12, j13, i14, list2, (List) objG02));
                arrayMap2 = arrayMap3;
                i6 = 1;
                i = 0;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoForName$lambda$15(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i6 = 1;
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i10 = (int) sQLiteStatementPrepare.getLong(3);
                int i11 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i12 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i13 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i10, backoffPolicyIntToBackoffPolicy, j11, j12, i12, i11, j13, i13, (List) objG0, (List) objG02));
                arrayMap = arrayMap3;
                i = 0;
                i6 = 1;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoForTag$lambda$12(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i6 = 1;
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i10 = (int) sQLiteStatementPrepare.getLong(3);
                int i11 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i12 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i13 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i10, backoffPolicyIntToBackoffPolicy, j11, j12, i12, i11, j13, i13, (List) objG0, (List) objG02));
                arrayMap = arrayMap3;
                i = 0;
                i6 = 1;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoLiveDataForIds$lambda$10(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i6 = 1;
            int i10 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo92bindText(i10, (String) it.next());
                i10++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i11 = (int) sQLiteStatementPrepare.getLong(3);
                int i12 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i13 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i14 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                List list2 = (List) objG0;
                Object objG02 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i11, backoffPolicyIntToBackoffPolicy, j11, j12, i13, i12, j13, i14, list2, (List) objG02));
                arrayMap2 = arrayMap3;
                i6 = 1;
                i = 0;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoLiveDataForName$lambda$16(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i6 = 1;
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i10 = (int) sQLiteStatementPrepare.getLong(3);
                int i11 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i12 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i13 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i10, backoffPolicyIntToBackoffPolicy, j11, j12, i12, i11, j13, i13, (List) objG0, (List) objG02));
                arrayMap = arrayMap3;
                i = 0;
                i6 = 1;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoLiveDataForTag$lambda$14(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i;
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i6 = 1;
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i6));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i10 = (int) sQLiteStatementPrepare.getLong(3);
                int i11 = (int) sQLiteStatementPrepare.getLong(4);
                long j = sQLiteStatementPrepare.getLong(14);
                long j6 = sQLiteStatementPrepare.getLong(15);
                long j10 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j11 = sQLiteStatementPrepare.getLong(18);
                long j12 = sQLiteStatementPrepare.getLong(19);
                int i12 = (int) sQLiteStatementPrepare.getLong(20);
                long j13 = sQLiteStatementPrepare.getLong(21);
                int i13 = (int) sQLiteStatementPrepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objG0 = a0.g0(arrayMap3, sQLiteStatementPrepare.getText(0));
                objG0.getClass();
                Object objG02 = a0.g0(arrayMap2, sQLiteStatementPrepare.getText(0));
                objG02.getClass();
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j, j6, j10, constraints, i10, backoffPolicyIntToBackoffPolicy, j11, j12, i12, i11, j13, i13, (List) objG0, (List) objG02));
                arrayMap = arrayMap3;
                i = 0;
                i6 = 1;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasUnfinishedWorkFlow$lambda$22(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            boolean z9 = false;
            if (sQLiteStatementPrepare.step()) {
                if (((int) sQLiteStatementPrepare.getLong(0)) != 0) {
                    z9 = true;
                }
            }
            return z9;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x incrementGeneration$lambda$50(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x incrementPeriodCount$lambda$40(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int incrementWorkSpecRunAttemptCount$lambda$43(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x insertWorkSpec$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        workSpecDao_Impl.__insertAdapterOfWorkSpec.insert(sQLiteConnection, workSpec);
        return p6.x.f8463a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int markWorkSpecScheduled$lambda$47(String str, long j, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, j);
            sQLiteStatementPrepare.mo92bindText(2, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int resetScheduledState$lambda$48(String str, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x resetWorkSpecNextScheduleTimeOverride$lambda$46(String str, String str2, int i, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.mo90bindLong(2, i);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int resetWorkSpecRunAttemptCount$lambda$44(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setCancelledState$lambda$39(String str, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo92bindText(1, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x setLastEnqueueTime$lambda$42(String str, long j, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, j);
            sQLiteStatementPrepare.mo92bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x setNextScheduleTimeOverride$lambda$45(String str, long j, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, j);
            sQLiteStatementPrepare.mo92bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x setOutput$lambda$41(String str, Data data, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo88bindBlob(1, Data.Companion.toByteArrayInternalV1(data));
            sQLiteStatementPrepare.mo92bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setState$lambda$38(String str, WorkInfo.State state, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, WorkTypeConverters.stateToInt(state));
            sQLiteStatementPrepare.mo92bindText(2, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x setStopReason$lambda$51(String str, int i, String str2, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo90bindLong(1, i);
            sQLiteStatementPrepare.mo92bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return p6.x.f8463a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p6.x updateWorkSpec$lambda$1(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        workSpecDao_Impl.__updateAdapterOfWorkSpec.handle(sQLiteConnection, workSpec);
        return p6.x.f8463a;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        return ((Number) DBUtil.performBlocking(this.__db, true, false, new androidx.room.f(10))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new androidx.room.support.e(str, 12));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.b(i, 3));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.f(9));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.f(15));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, (l) new androidx.room.f(16));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.b(i, 4));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.f(18));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.e(str, 18));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.c(2, j));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.f(17));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, (l) new androidx.room.support.e(str, 24));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.f(14));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        str.getClass();
        return (WorkInfo.State) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.e(str, 23));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.e(str, 14));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.e(str, 21));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) {
        str.getClass();
        return (WorkSpec) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.e(str, 17));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, false, new androidx.room.support.e(str, 13));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public r7.h getWorkStatusPojoFlowDataForIds(List<String> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new f(sb.toString(), list, this, 0));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public r7.h getWorkStatusPojoFlowForName(String str) {
        str.getClass();
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new e(str, this, 4));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public r7.h getWorkStatusPojoFlowForTag(String str) {
        str.getClass();
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new e(str, this, 0));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        str.getClass();
        return (WorkSpec.WorkInfoPojo) DBUtil.performBlocking(this.__db, true, true, new e(str, this, 5));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        return (List) DBUtil.performBlocking(this.__db, true, true, new f(sb.toString(), list, this, 2));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, true, new e(str, this, 3));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        str.getClass();
        return (List) DBUtil.performBlocking(this.__db, true, true, new e(str, this, 1));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, (l) new f(sb.toString(), list, this, 1));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, (l) new e(str, this, 2));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, (l) new e(str, this, 6));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public r7.h hasUnfinishedWorkFlow() {
        return FlowUtil.createFlow(this.__db, false, new String[]{"workspec"}, new androidx.room.f(12));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String str) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new androidx.room.support.e(str, 19));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String str) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new androidx.room.support.e(str, 16));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        str.getClass();
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new androidx.room.support.e(str, 22))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        workSpec.getClass();
        DBUtil.performBlocking(this.__db, false, true, new g(this, workSpec, 1));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j) {
        str.getClass();
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new h(str, 1, j))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        DBUtil.performBlocking(this.__db, false, true, new androidx.room.f(11));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new androidx.room.f(13))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(String str, int i) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new d(str, i, 3));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        str.getClass();
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new androidx.room.support.e(str, 15))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(String str) {
        str.getClass();
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new androidx.room.support.e(str, 20))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(String str, long j) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new h(str, 2, j));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(String str, long j) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new h(str, 0, j));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) {
        str.getClass();
        data.getClass();
        DBUtil.performBlocking(this.__db, false, true, new a(5, data, str));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String str) {
        state.getClass();
        str.getClass();
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new a(6, state, str))).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(String str, int i) {
        str.getClass();
        DBUtil.performBlocking(this.__db, false, true, new d(i, str));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec) {
        workSpec.getClass();
        DBUtil.performBlocking(this.__db, false, true, new g(this, workSpec, 0));
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final List<j7.c> getRequiredConverters() {
            return t.f8724a;
        }

        private Companion() {
        }
    }
}
