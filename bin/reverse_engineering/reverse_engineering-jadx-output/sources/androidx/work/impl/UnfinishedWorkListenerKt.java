package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import d7.p;
import d7.r;
import o7.a0;
import o7.c0;
import p6.x;
import r7.k0;
import r7.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        strTagWithPrefix.getClass();
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = 3600000L;
    }

    public static final void maybeLaunchUnfinishedWorkListener(a0 a0Var, Context context, Configuration configuration, WorkDatabase workDatabase) {
        a0Var.getClass();
        context.getClass();
        configuration.getClass();
        workDatabase.getClass();
        if (ProcessUtils.isDefaultProcess(context, configuration)) {
            k0.n(new o(k0.h(k0.g(new o(workDatabase.workSpecDao().hasUnfinishedWorkFlow(), new AnonymousClass1(null), 2))), new AnonymousClass2(context, null)), a0Var);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends v6.i implements p {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, t6.c cVar) {
            super(2, cVar);
            this.$appContext = context;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$appContext, cVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z9, t6.c cVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z9), cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return x.f8463a;
        }

        @Override // d7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (t6.c) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v6.i implements r {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(t6.c cVar) {
            super(4, cVar);
        }

        @Override // d7.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((r7.i) obj, (Throwable) obj2, ((Number) obj3).longValue(), (t6.c) obj4);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                Throwable th = (Throwable) this.L$0;
                long j = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
                long jMin = Math.min(j * ((long) UnfinishedWorkListenerKt.DELAY_MS), UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                Object objJ = c0.j(jMin, this);
                u6.a aVar = u6.a.f10762a;
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return Boolean.TRUE;
        }

        public final Object invoke(r7.i iVar, Throwable th, long j, t6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = th;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(x.f8463a);
        }
    }
}
