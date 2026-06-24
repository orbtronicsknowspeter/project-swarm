package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import d7.p;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.e1;
import o7.l0;
import o7.u1;
import o7.w;
import o7.x0;
import p6.x;
import q6.n;
import q6.t;
import q6.u;
import q6.v;
import t6.h;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion(null);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private RoomConnectionManager connectionManager;
    private a0 coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected List<? extends Callback> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private h transactionContext;
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<j7.c, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class JournalMode {
        private static final /* synthetic */ w6.a $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC = new JournalMode("AUTOMATIC", 0);
        public static final JournalMode TRUNCATE = new JournalMode("TRUNCATE", 1);
        public static final JournalMode WRITE_AHEAD_LOGGING = new JournalMode("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ JournalMode[] $values() {
            return new JournalMode[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        static {
            JournalMode[] journalModeArr$values = $values();
            $VALUES = journalModeArr$values;
            $ENTRIES = t0.f.u(journalModeArr$values);
        }

        private JournalMode(String str, int i) {
        }

        public static w6.a getEntries() {
            return $ENTRIES;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            context.getClass();
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public interface QueryCallback {
        void onQuery(String str, List<? extends Object> list);
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {TypedValues.PositionType.TYPE_DRAWPATH}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        int label;

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
        @v6.e(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {TypedValues.PositionType.TYPE_PERCENT_WIDTH, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, TypedValues.PositionType.TYPE_PERCENT_X, 512, InputDeviceCompat.SOURCE_DPAD, 514}, m = "invokeSuspend")
        public static final class C00141 extends i implements p {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RoomDatabase this$0;

            /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
            @v6.e(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {TypedValues.PositionType.TYPE_CURVE_FIT, TypedValues.PositionType.TYPE_POSITION_TYPE}, m = "invokeSuspend")
            public static final class C00151 extends i implements p {
                final /* synthetic */ boolean $hasForeignKeys;
                final /* synthetic */ String[] $tableNames;
                int I$0;
                int I$1;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00151(boolean z9, String[] strArr, t6.c cVar) {
                    super(2, cVar);
                    this.$hasForeignKeys = z9;
                    this.$tableNames = strArr;
                }

                @Override // v6.a
                public final t6.c create(Object obj, t6.c cVar) {
                    C00151 c00151 = new C00151(this.$hasForeignKeys, this.$tableNames, cVar);
                    c00151.L$0 = obj;
                    return c00151;
                }

                @Override // d7.p
                public final Object invoke(TransactionScope<x> transactionScope, t6.c cVar) {
                    return ((C00151) create(transactionScope, cVar)).invokeSuspend(x.f8463a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r0, "PRAGMA defer_foreign_keys = TRUE", r9) == r3) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r6, r10, r9) == r3) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
                
                    return r3;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:20:0x0074). Please report as a decompilation issue!!! */
                @Override // v6.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        int r0 = r9.label
                        r1 = 2
                        r2 = 1
                        u6.a r3 = u6.a.f10762a
                        if (r0 == 0) goto L2b
                        if (r0 == r2) goto L23
                        if (r0 != r1) goto L1c
                        int r0 = r9.I$1
                        int r4 = r9.I$0
                        java.lang.Object r5 = r9.L$1
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r9.L$0
                        androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                        p6.a.e(r10)
                        goto L74
                    L1c:
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        androidx.privacysandbox.ads.adservices.customaudience.a.i(r10)
                        r10 = 0
                        return r10
                    L23:
                        java.lang.Object r0 = r9.L$0
                        androidx.room.TransactionScope r0 = (androidx.room.TransactionScope) r0
                        p6.a.e(r10)
                        goto L44
                    L2b:
                        p6.a.e(r10)
                        java.lang.Object r10 = r9.L$0
                        r0 = r10
                        androidx.room.TransactionScope r0 = (androidx.room.TransactionScope) r0
                        boolean r10 = r9.$hasForeignKeys
                        if (r10 == 0) goto L44
                        r9.L$0 = r0
                        r9.label = r2
                        java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r0, r10, r9)
                        if (r10 != r3) goto L44
                        goto L73
                    L44:
                        java.lang.String[] r10 = r9.$tableNames
                        int r4 = r10.length
                        r5 = 0
                        r6 = r0
                        r0 = r4
                        r4 = r5
                        r5 = r10
                    L4c:
                        if (r4 >= r0) goto L76
                        r10 = r5[r4]
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        java.lang.String r8 = "DELETE FROM `"
                        r7.<init>(r8)
                        r7.append(r10)
                        r10 = 96
                        r7.append(r10)
                        java.lang.String r10 = r7.toString()
                        r9.L$0 = r6
                        r9.L$1 = r5
                        r9.I$0 = r4
                        r9.I$1 = r0
                        r9.label = r1
                        java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r6, r10, r9)
                        if (r10 != r3) goto L74
                    L73:
                        return r3
                    L74:
                        int r4 = r4 + r2
                        goto L4c
                    L76:
                        p6.x r10 = p6.x.f8463a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C00141.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00141(RoomDatabase roomDatabase, boolean z9, String[] strArr, t6.c cVar) {
                super(2, cVar);
                this.this$0 = roomDatabase;
                this.$hasForeignKeys = z9;
                this.$tableNames = strArr;
            }

            @Override // v6.a
            public final t6.c create(Object obj, t6.c cVar) {
                C00141 c00141 = new C00141(this.this$0, this.$hasForeignKeys, this.$tableNames, cVar);
                c00141.L$0 = obj;
                return c00141;
            }

            @Override // d7.p
            public final Object invoke(Transactor transactor, t6.c cVar) {
                return ((C00141) create(transactor, cVar)).invokeSuspend(x.f8463a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r0, "VACUUM", r7) != r2) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[PHI: r0
              0x006e: PHI (r0v7 androidx.room.Transactor) = (r0v4 androidx.room.Transactor), (r0v4 androidx.room.Transactor), (r0v9 androidx.room.Transactor) binds: [B:17:0x005a, B:19:0x006b, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[PHI: r0
              0x0085: PHI (r0v10 androidx.room.Transactor) = (r0v7 androidx.room.Transactor), (r0v12 androidx.room.Transactor) binds: [B:22:0x0082, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[PHI: r0 r8
              0x0091: PHI (r0v13 androidx.room.Transactor) = (r0v10 androidx.room.Transactor), (r0v15 androidx.room.Transactor) binds: [B:25:0x008e, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
              0x0091: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x008e, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
            @Override // v6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 212
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C00141.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z9, String[] strArr, t6.c cVar) {
            super(2, cVar);
            this.$hasForeignKeys = z9;
            this.$tableNames = strArr;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return RoomDatabase.this.new AnonymousClass1(this.$hasForeignKeys, this.$tableNames, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass1) create(a0Var, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                RoomConnectionManager roomConnectionManager = RoomDatabase.this.connectionManager;
                if (roomConnectionManager == null) {
                    l.i("connectionManager");
                    throw null;
                }
                C00141 c00141 = new C00141(RoomDatabase.this, this.$hasForeignKeys, this.$tableNames, null);
                this.label = 1;
                Object objUseConnection = roomConnectionManager.useConnection(false, c00141, this);
                u6.a aVar = u6.a.f10762a;
                if (objUseConnection == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return x.f8463a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x beginTransaction$lambda$8(RoomDatabase roomDatabase, SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        roomDatabase.internalBeginTransaction();
        return x.f8463a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteOpenHelper createConnectionManager$lambda$1(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        databaseConfiguration.getClass();
        return roomDatabase.createOpenHelper(databaseConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x endTransaction$lambda$9(RoomDatabase roomDatabase, SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        roomDatabase.internalEndTransaction();
        return x.f8463a;
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime_release();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        a0 a0Var = this.coroutineScope;
        if (a0Var == null) {
            l.i("coroutineScope");
            throw null;
        }
        c0.h(a0Var);
        getInvalidationTracker().stop$room_runtime_release();
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            roomConnectionManager.close();
        } else {
            l.i("connectionManager");
            throw null;
        }
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            a3.b.r("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    private final <T extends SupportSQLiteOpenHelper> T unwrapOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (supportSQLiteOpenHelper == null) {
            return null;
        }
        l.h();
        throw null;
    }

    public final void addTypeConverter$room_runtime_release(j7.c cVar, Object obj) {
        cVar.getClass();
        obj.getClass();
        this.typeConverters.put(cVar, obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode$room_runtime_release() || inTransaction() || this.suspendingTransactionId.get() == null) {
            return;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new e(this, 2));
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        this.closeBarrier.close$room_runtime_release();
    }

    public SupportSQLiteStatement compileStatement(String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public List<Migration> createAutoMigrations(Map<j7.c, ? extends AutoMigrationSpec> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q6.a0.h0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(d0.b.F((j7.c) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final RoomConnectionManager createConnectionManager$room_runtime_release(DatabaseConfiguration databaseConfiguration) {
        RoomOpenDelegate roomOpenDelegate;
        databaseConfiguration.getClass();
        try {
            RoomOpenDelegateMarker roomOpenDelegateMarkerCreateOpenDelegate = createOpenDelegate();
            roomOpenDelegateMarkerCreateOpenDelegate.getClass();
            roomOpenDelegate = (RoomOpenDelegate) roomOpenDelegateMarkerCreateOpenDelegate;
        } catch (p6.h unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(databaseConfiguration, new e(this, 1)) : new RoomConnectionManager(databaseConfiguration, roomOpenDelegate);
    }

    public abstract InvalidationTracker createInvalidationTracker();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public RoomOpenDelegateMarker createOpenDelegate() {
        throw new p6.h(0);
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        databaseConfiguration.getClass();
        throw new p6.h(0);
    }

    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new e(this, 0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        map.getClass();
        return t.f8724a;
    }

    public final CloseBarrier getCloseBarrier$room_runtime_release() {
        return this.closeBarrier;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final a0 getCoroutineScope() {
        a0 a0Var = this.coroutineScope;
        if (a0Var != null) {
            return a0Var;
        }
        l.i("coroutineScope");
        throw null;
    }

    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        l.i("internalTracker");
        throw null;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            l.i("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            return supportOpenHelper$room_runtime_release;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final h getQueryContext() {
        a0 a0Var = this.coroutineScope;
        if (a0Var != null) {
            return a0Var.getCoroutineContext();
        }
        l.i("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        l.i("internalQueryExecutor");
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Set<j7.c> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(n.i0(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            cls.getClass();
            arrayList.add(y.a(cls));
        }
        return q6.l.J0(arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return v.f8726a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Map<j7.c, List<j7.c>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        int iH0 = q6.a0.h0(n.i0(setEntrySet, 10));
        if (iH0 < 16) {
            iH0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH0);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            cls.getClass();
            kotlin.jvm.internal.f fVarA = y.a(cls);
            List<Class> list2 = list;
            ArrayList arrayList = new ArrayList(n.i0(list2, 10));
            for (Class cls2 : list2) {
                cls2.getClass();
                arrayList.add(y.a(cls2));
            }
            linkedHashMap.put(fVarA, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<j7.c, List<j7.c>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return u.f8725a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final h getTransactionContext$room_runtime_release() {
        h hVar = this.transactionContext;
        if (hVar != null) {
            return hVar;
        }
        l.i("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        l.i("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        cls.getClass();
        return (T) this.typeConverters.get(y.a(cls));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            return roomConnectionManager.getSupportOpenHelper$room_runtime_release() != null;
        }
        l.i("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(DatabaseConfiguration databaseConfiguration) {
        Executor l0Var;
        h coroutineContext;
        databaseConfiguration.getClass();
        this.useTempTrackingTable = databaseConfiguration.getUseTempTrackingTable$room_runtime_release();
        this.connectionManager = createConnectionManager$room_runtime_release(databaseConfiguration);
        this.internalTracker = createInvalidationTracker();
        RoomDatabaseKt.validateAutoMigrations(this, databaseConfiguration);
        RoomDatabaseKt.validateTypeConverters(this, databaseConfiguration);
        h hVar = databaseConfiguration.queryCoroutineContext;
        if (hVar != null) {
            t6.f fVar = hVar.get(t6.d.f10313a);
            fVar.getClass();
            w wVar = (w) fVar;
            x0 x0Var = wVar instanceof x0 ? (x0) wVar : null;
            if (x0Var == null || (l0Var = x0Var.y()) == null) {
                l0Var = new l0(wVar);
            }
            this.internalQueryExecutor = l0Var;
            this.internalTransactionExecutor = new TransactionExecutor(l0Var);
            this.coroutineScope = c0.b(databaseConfiguration.queryCoroutineContext.plus(new u1((e1) databaseConfiguration.queryCoroutineContext.get(o7.x.f8327b))));
            boolean zInCompatibilityMode$room_runtime_release = inCompatibilityMode$room_runtime_release();
            a0 a0Var = this.coroutineScope;
            if (zInCompatibilityMode$room_runtime_release) {
                if (a0Var == null) {
                    l.i("coroutineScope");
                    throw null;
                }
                coroutineContext = a0Var.getCoroutineContext().plus(wVar.limitedParallelism(1));
            } else {
                if (a0Var == null) {
                    l.i("coroutineScope");
                    throw null;
                }
                coroutineContext = a0Var.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = databaseConfiguration.queryExecutor;
            this.internalTransactionExecutor = new TransactionExecutor(databaseConfiguration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                l.i("internalQueryExecutor");
                throw null;
            }
            t7.c cVarB = c0.b(c0.m(executor).plus(c0.d()));
            this.coroutineScope = cVarB;
            h hVar2 = cVarB.f10322a;
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                l.i("internalTransactionExecutor");
                throw null;
            }
            this.transactionContext = hVar2.plus(c0.m(executor2));
        }
        this.allowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            l.i("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            while (!(supportOpenHelper$room_runtime_release instanceof PrePackagedCopyOpenHelper)) {
                if (!(supportOpenHelper$room_runtime_release instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime_release = null;
                    break;
                }
                supportOpenHelper$room_runtime_release = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release = null;
            break;
        }
        PrePackagedCopyOpenHelper prePackagedCopyOpenHelper = (PrePackagedCopyOpenHelper) supportOpenHelper$room_runtime_release;
        if (prePackagedCopyOpenHelper != null) {
            prePackagedCopyOpenHelper.setDatabaseConfiguration(databaseConfiguration);
        }
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            l.i("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release2 = roomConnectionManager2.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release2 != null) {
            while (!(supportOpenHelper$room_runtime_release2 instanceof AutoClosingRoomOpenHelper)) {
                if (!(supportOpenHelper$room_runtime_release2 instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime_release2 = null;
                    break;
                }
                supportOpenHelper$room_runtime_release2 = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release2).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release2 = null;
            break;
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) supportOpenHelper$room_runtime_release2;
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.getAutoCloser$room_runtime_release();
            AutoCloser autoCloser$room_runtime_release = autoClosingRoomOpenHelper.getAutoCloser$room_runtime_release();
            a0 a0Var2 = this.coroutineScope;
            if (a0Var2 == null) {
                l.i("coroutineScope");
                throw null;
            }
            autoCloser$room_runtime_release.initCoroutineScope(a0Var2);
            getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.getAutoCloser$room_runtime_release());
        }
        if (databaseConfiguration.multiInstanceInvalidationServiceIntent != null) {
            if (databaseConfiguration.name != null) {
                getInvalidationTracker().initMultiInstanceInvalidation$room_runtime_release(databaseConfiguration.context, databaseConfiguration.name, databaseConfiguration.multiInstanceInvalidationServiceIntent);
            } else {
                com.google.gson.internal.a.p("Required value was null.");
            }
        }
    }

    public void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        internalInitInvalidationTracker(new SupportSQLiteConnection(supportSQLiteDatabase));
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            return roomConnectionManager.isSupportDatabaseOpen();
        }
        l.i("connectionManager");
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            return roomConnectionManager.isSupportDatabaseOpen();
        }
        l.i("connectionManager");
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void performClear(boolean z9, String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(z9, strArr, null));
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        supportSQLiteQuery.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().getWritableDatabase().query(supportSQLiteQuery, cancellationSignal) : getOpenHelper().getWritableDatabase().query(supportSQLiteQuery);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        callable.getClass();
        beginTransaction();
        try {
            V vCall = callable.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z9) {
        this.useTempTrackingTable = z9;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z9, p pVar, t6.c cVar) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            return roomConnectionManager.useConnection(z9, pVar, cVar);
        }
        l.i("connectionManager");
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private final List<AutoMigrationSpec> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SQLiteDriver driver;
        private final d7.a factory;
        private boolean inMemoryTrackingTableMode;
        private JournalMode journalMode;
        private final j7.c klass;
        private final MigrationContainer migrationContainer;
        private final Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private h queryCallbackCoroutineContext;
        private Executor queryCallbackExecutor;
        private h queryCoroutineContext;
        private Executor queryExecutor;
        private boolean requireMigration;
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        public Builder(Context context, Class<T> cls, String str) {
            context.getClass();
            cls.getClass();
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = y.a(cls);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        public Builder<T> addAutoMigrationSpec(AutoMigrationSpec autoMigrationSpec) {
            autoMigrationSpec.getClass();
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            callback.getClass();
            this.callbacks.add(callback);
            return this;
        }

        public Builder<T> addMigrations(Migration... migrationArr) {
            migrationArr.getClass();
            for (Migration migration : migrationArr) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
            return this;
        }

        public Builder<T> addTypeConverter(Object obj) {
            obj.getClass();
            this.typeConverters.add(obj);
            return this;
        }

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T build() {
            SupportSQLiteOpenHelper.Factory queryInterceptorOpenHelperFactory;
            SupportSQLiteOpenHelper.Factory factory;
            T t9;
            h hVarM;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.validateMigrationsNotRequired(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            } else {
                SupportSQLiteOpenHelper.Factory factory2 = this.supportOpenHelperFactory;
                if (sQLiteDriver == null) {
                    queryInterceptorOpenHelperFactory = factory2;
                } else {
                    if (factory2 != null) {
                        com.google.gson.internal.a.p("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                        return null;
                    }
                    queryInterceptorOpenHelperFactory = null;
                }
            }
            boolean z9 = this.autoCloseTimeout > 0;
            boolean z10 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z11 = this.queryCallback != null;
            if (queryInterceptorOpenHelperFactory != null) {
                if (z9) {
                    if (this.name == null) {
                        com.google.gson.internal.a.p("Cannot create auto-closing database for an in-memory database.");
                        return null;
                    }
                    long j = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        com.google.gson.internal.a.p("Required value was null.");
                        return null;
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j, timeUnit, null, 4, null));
                }
                if (z10) {
                    if (this.name == null) {
                        com.google.gson.internal.a.p("Cannot create from asset or file for an in-memory database.");
                        return null;
                    }
                    String str = this.copyFromAssetPath;
                    int i = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i6 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i + i6 + (callable != null ? 1 : 0) != 1) {
                        com.google.gson.internal.a.p("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        return null;
                    }
                    queryInterceptorOpenHelperFactory = new PrePackagedCopyOpenHelperFactory(str, file, callable, queryInterceptorOpenHelperFactory);
                }
                if (z11) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if (executor2 != null) {
                        hVarM = c0.m(executor2);
                    } else {
                        hVarM = this.queryCallbackCoroutineContext;
                        if (hVarM == null) {
                            com.google.gson.internal.a.p("Required value was null.");
                            return null;
                        }
                    }
                    t7.c cVarB = c0.b(hVarM);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback == null) {
                        com.google.gson.internal.a.p("Required value was null.");
                        return null;
                    }
                    queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, cVarB, queryCallback);
                }
                factory = queryInterceptorOpenHelperFactory;
            } else {
                factory = null;
            }
            if (factory == null) {
                if (z9) {
                    com.google.gson.internal.a.p("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                    return null;
                }
                if (z10) {
                    com.google.gson.internal.a.p("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                    return null;
                }
                if (z11) {
                    com.google.gson.internal.a.p("Query Callback is not supported when an SQLiteDriver is configured.");
                    return null;
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z12 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                com.google.gson.internal.a.p("Required value was null.");
                return null;
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                com.google.gson.internal.a.p("Required value was null.");
                return null;
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z12, journalModeResolve$room_runtime_release, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            databaseConfiguration.setUseTempTrackingTable$room_runtime_release(this.inMemoryTrackingTableMode);
            d7.a aVar = this.factory;
            if (aVar == null || (t9 = (T) aVar.invoke()) == null) {
                t9 = (T) KClassUtil.findAndInstantiateDatabaseImpl$default(d0.b.F(this.klass), null, 2, null);
            }
            t9.init(databaseConfiguration);
            return t9;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromAsset(String str, PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            str.getClass();
            prepackagedDatabaseCallback.getClass();
            this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.copyFromAssetPath = str;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        public Builder<T> createFromFile(File file, PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            file.getClass();
            prepackagedDatabaseCallback.getClass();
            this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.copyFromFile = file;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        public Builder<T> createFromInputStream(Callable<InputStream> callable, PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            callable.getClass();
            prepackagedDatabaseCallback.getClass();
            this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.copyFromInputStream = callable;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigration(boolean z9) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z9;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(boolean z9, int... iArr) {
            iArr.getClass();
            for (int i : iArr) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i));
            }
            this.allowDestructiveMigrationForAllTables = z9;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean z9) {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z9;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        @ExperimentalRoomApi
        public Builder<T> setAutoCloseTimeout(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (j < 0) {
                com.google.gson.internal.a.p("autoCloseTimeout must be >= 0");
                return null;
            }
            this.autoCloseTimeout = j;
            this.autoCloseTimeUnit = timeUnit;
            return this;
        }

        public final Builder<T> setDriver(SQLiteDriver sQLiteDriver) {
            sQLiteDriver.getClass();
            this.driver = sQLiteDriver;
            return this;
        }

        @ExperimentalRoomApi
        public final Builder<T> setInMemoryTrackingMode(boolean z9) {
            this.inMemoryTrackingTableMode = z9;
            return this;
        }

        public Builder<T> setJournalMode(JournalMode journalMode) {
            journalMode.getClass();
            this.journalMode = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        public Builder<T> setMultiInstanceInvalidationServiceIntent(Intent intent) {
            intent.getClass();
            if (this.name == null) {
                intent = null;
            }
            this.multiInstanceInvalidationIntent = intent;
            return this;
        }

        public Builder<T> setQueryCallback(QueryCallback queryCallback, Executor executor) {
            queryCallback.getClass();
            executor.getClass();
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            this.queryCallbackCoroutineContext = null;
            return this;
        }

        public final Builder<T> setQueryCoroutineContext(h hVar) {
            hVar.getClass();
            if (this.queryExecutor != null || this.transactionExecutor != null) {
                com.google.gson.internal.a.p("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
                return null;
            }
            if (hVar.get(t6.d.f10313a) != null) {
                this.queryCoroutineContext = hVar;
                return this;
            }
            com.google.gson.internal.a.p("It is required that the coroutine context contain a dispatcher.");
            return null;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            executor.getClass();
            if (this.queryCoroutineContext == null) {
                this.queryExecutor = executor;
                return this;
            }
            com.google.gson.internal.a.p("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            return null;
        }

        public Builder<T> setTransactionExecutor(Executor executor) {
            executor.getClass();
            if (this.queryCoroutineContext == null) {
                this.transactionExecutor = executor;
                return this;
            }
            com.google.gson.internal.a.p("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            return null;
        }

        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> createFromAsset(String str) {
            str.getClass();
            this.copyFromAssetPath = str;
            return this;
        }

        public Builder<T> createFromFile(File file) {
            file.getClass();
            this.copyFromFile = file;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromInputStream(Callable<InputStream> callable) {
            callable.getClass();
            this.copyFromInputStream = callable;
            return this;
        }

        public final Builder<T> setQueryCallback(h hVar, QueryCallback queryCallback) {
            hVar.getClass();
            queryCallback.getClass();
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = null;
            this.queryCallbackCoroutineContext = hVar;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(int... iArr) {
            iArr.getClass();
            for (int i : iArr) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i));
            }
            return this;
        }

        public Builder(j7.c cVar, String str, d7.a aVar, Context context) {
            cVar.getClass();
            context.getClass();
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = cVar;
            this.context = context;
            this.name = str;
            this.factory = aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void internalInitInvalidationTracker(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        getInvalidationTracker().internalInit$room_runtime_release(sQLiteConnection);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final <T> T getTypeConverter(j7.c cVar) {
        cVar.getClass();
        T t9 = (T) this.typeConverters.get(cVar);
        t9.getClass();
        return t9;
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static abstract class Callback {
        public void onCreate(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                onCreate(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }

        public void onDestructiveMigration(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                onDestructiveMigration(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }

        public void onOpen(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                onOpen(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.getClass();
        }

        public void onDestructiveMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.getClass();
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.getClass();
        }
    }

    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public void runInTransaction(Runnable runnable) {
        runnable.getClass();
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void addMigration(Migration migration) {
            migration.getClass();
            int i = migration.startVersion;
            int i6 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i);
            TreeMap<Integer, Migration> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i6))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i6)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i6), migration);
        }

        public void addMigrations(List<? extends Migration> list) {
            list.getClass();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int i, int i6) {
            return MigrationUtil.contains(this, i, i6);
        }

        public List<Migration> findMigrationPath(int i, int i6) {
            return MigrationUtil.findMigrationPath(this, i, i6);
        }

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public final p6.i getSortedDescendingNodes$room_runtime_release(int i) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i));
            if (treeMap == null) {
                return null;
            }
            return new p6.i(treeMap, treeMap.descendingKeySet());
        }

        public final p6.i getSortedNodes$room_runtime_release(int i) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i));
            if (treeMap == null) {
                return null;
            }
            return new p6.i(treeMap, treeMap.keySet());
        }

        public void addMigrations(Migration... migrationArr) {
            migrationArr.getClass();
            for (Migration migration : migrationArr) {
                addMigration(migration);
            }
        }
    }

    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(str, objArr));
    }

    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        supportSQLiteQuery.getClass();
        return query$default(this, supportSQLiteQuery, null, 2, null);
    }
}
