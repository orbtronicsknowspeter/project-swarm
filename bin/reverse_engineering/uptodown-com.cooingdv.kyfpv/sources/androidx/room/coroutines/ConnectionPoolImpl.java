package androidx.room.coroutines;

import a1.b;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import com.google.android.gms.internal.measurement.i5;
import d7.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.x;
import o7.a0;
import o7.c0;
import t6.c;
import t6.h;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionPoolImpl implements ConnectionPool {
    private final AtomicBoolean _isClosed;
    private final SQLiteDriver driver;
    private final Pool readers;
    private final ThreadLocal<PooledConnectionImpl> threadLocal;
    private long timeout;
    private final Pool writers;

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {171}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ x $connection;
        final /* synthetic */ Pool $this_acquireWithTimeout;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(x xVar, Pool pool, c cVar) {
            super(2, cVar);
            this.$connection = xVar;
            this.$this_acquireWithTimeout = pool;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass2(this.$connection, this.$this_acquireWithTimeout, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, c cVar) {
            return ((AnonymousClass2) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            x xVar;
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                xVar = this.$connection;
                Pool pool = this.$this_acquireWithTimeout;
                this.L$0 = xVar;
                this.label = 1;
                obj = pool.acquire(this);
                u6.a aVar = u6.a.f10763a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xVar = (x) this.L$0;
                p6.a.e(obj);
            }
            xVar.f7025a = obj;
            return p6.x.f8464a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {114, 118, 541, 147}, m = "useConnection")
    public static final class AnonymousClass1<R> extends v6.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {115}, m = "invokeSuspend")
    public static final class C00652 extends i implements p {
        final /* synthetic */ p $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00652(p pVar, PooledConnectionImpl pooledConnectionImpl, c cVar) {
            super(2, cVar);
            this.$block = pVar;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            return new C00652(this.$block, this.$confinedConnection, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, c cVar) {
            return ((C00652) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    p6.a.e(obj);
                    return obj;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            p pVar = this.$block;
            PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = pVar.invoke(pooledConnectionImpl, this);
            u6.a aVar = u6.a.f10763a;
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {147}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements p {
        final /* synthetic */ p $block;
        final /* synthetic */ x $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(p pVar, x xVar, c cVar) {
            super(2, cVar);
            this.$block = pVar;
            this.$connection = xVar;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass4(this.$block, this.$connection, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, c cVar) {
            return ((AnonymousClass4) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    p6.a.e(obj);
                    return obj;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            p pVar = this.$block;
            Object obj2 = this.$connection.f7025a;
            this.label = 1;
            Object objInvoke = pVar.invoke(obj2, this);
            u6.a aVar = u6.a.f10763a;
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    public ConnectionPoolImpl(final SQLiteDriver sQLiteDriver, final String str, int i, int i6) {
        sQLiteDriver.getClass();
        str.getClass();
        this.threadLocal = new ThreadLocal<>();
        final int i10 = 0;
        this._isClosed = new AtomicBoolean(false);
        int i11 = m7.a.f7658m;
        this.timeout = i5.N(30, m7.c.SECONDS);
        if (i <= 0) {
            com.google.gson.internal.a.p("Maximum number of readers must be greater than 0");
            throw null;
        }
        if (i6 <= 0) {
            com.google.gson.internal.a.p("Maximum number of writers must be greater than 0");
            throw null;
        }
        this.driver = sQLiteDriver;
        this.readers = new Pool(i, new d7.a() { // from class: androidx.room.coroutines.a
            @Override // d7.a
            public final Object invoke() {
                switch (i10) {
                }
                return sQLiteDriver.open(str);
            }
        });
        final int i12 = 1;
        this.writers = new Pool(i6, new d7.a() { // from class: androidx.room.coroutines.a
            @Override // d7.a
            public final Object invoke() {
                switch (i12) {
                }
                return sQLiteDriver.open(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    private final Object acquireWithTimeout(Pool pool, c cVar) {
        Object obj;
        x xVar = new x();
        try {
            obj = null;
            c0.D(this.timeout, new AnonymousClass2(xVar, pool, null), cVar);
        } catch (Throwable th) {
            obj = th;
        }
        return new p6.i(xVar.f7025a, obj);
    }

    private final h createConnectionContext(PooledConnectionImpl pooledConnectionImpl) {
        return new ConnectionElement(pooledConnectionImpl).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, pooledConnectionImpl));
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final Void throwTimeoutException(boolean z9) {
        String str = z9 ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.writers.dump(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.readers.dump(sb);
        SQLite.throwSQLiteException(5, sb.toString());
        throw new b();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }

    /* JADX INFO: renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name */
    public final long m86getTimeoutUwyO8pc$room_runtime_release() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m87setTimeoutLRDsOJo$room_runtime_release(long j) {
        this.timeout = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:88:0x0179, B:90:0x017f), top: B:112:0x0179 }] */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object useConnection(boolean r18, d7.p r19, t6.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.useConnection(boolean, d7.p, t6.c):java.lang.Object");
    }

    public ConnectionPoolImpl(final SQLiteDriver sQLiteDriver, final String str) {
        sQLiteDriver.getClass();
        str.getClass();
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        int i = m7.a.f7658m;
        this.timeout = i5.N(30, m7.c.SECONDS);
        this.driver = sQLiteDriver;
        final int i6 = 2;
        Pool pool = new Pool(1, new d7.a() { // from class: androidx.room.coroutines.a
            @Override // d7.a
            public final Object invoke() {
                switch (i6) {
                }
                return sQLiteDriver.open(str);
            }
        });
        this.readers = pool;
        this.writers = pool;
    }
}
