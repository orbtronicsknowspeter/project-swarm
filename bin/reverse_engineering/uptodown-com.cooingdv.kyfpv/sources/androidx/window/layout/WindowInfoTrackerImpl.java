package androidx.window.layout;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import d7.p;
import kotlin.jvm.internal.g;
import p6.x;
import r7.f0;
import r7.h;
import t6.c;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE, ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, c cVar) {
            super(2, cVar);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m232invokeSuspend$lambda0(q7.i iVar, WindowLayoutInfo windowLayoutInfo) {
            windowLayoutInfo.getClass();
            iVar.p(windowLayoutInfo);
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = WindowInfoTrackerImpl.this.new AnonymousClass1(this.$activity, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // d7.p
        public final Object invoke(r7.i iVar, c cVar) {
            return ((AnonymousClass1) create(iVar, cVar)).invokeSuspend(x.f8464a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        
            if (r5.emit(r11, r10) == r3) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0018, B:18:0x0063, B:22:0x0076, B:24:0x007e, B:14:0x0034, B:17:0x005e), top: B:31:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:8:0x001b). Please report as a decompilation issue!!! */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 2
                r2 = 1
                u6.a r3 = u6.a.f10763a
                if (r0 == 0) goto L38
                if (r0 == r2) goto L28
                if (r0 != r1) goto L21
                java.lang.Object r0 = r10.L$2
                q7.b r0 = (q7.b) r0
                java.lang.Object r4 = r10.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r10.L$0
                r7.i r5 = (r7.i) r5
                p6.a.e(r11)     // Catch: java.lang.Throwable -> L1e
            L1b:
                r11 = r5
                r5 = r0
                goto L63
            L1e:
                r11 = move-exception
                goto L9f
            L21:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r11)
                r11 = 0
                return r11
            L28:
                java.lang.Object r0 = r10.L$2
                q7.b r0 = (q7.b) r0
                java.lang.Object r4 = r10.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r10.L$0
                r7.i r5 = (r7.i) r5
                p6.a.e(r11)     // Catch: java.lang.Throwable -> L1e
                goto L76
            L38:
                p6.a.e(r11)
                java.lang.Object r11 = r10.L$0
                r7.i r11 = (r7.i) r11
                q7.a r0 = q7.a.f8731b
                r4 = 4
                r5 = 10
                q7.e r0 = com.google.android.gms.internal.measurement.i5.a(r5, r0, r4)
                androidx.window.layout.b r4 = new androidx.window.layout.b
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r10.$activity
                androidx.arch.core.executor.a r7 = new androidx.arch.core.executor.a
                r8 = 2
                r7.<init>(r8)
                r5.registerLayoutChangeCallback(r6, r7, r4)
                q7.b r5 = new q7.b     // Catch: java.lang.Throwable -> L1e
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            L63:
                r10.L$0 = r11     // Catch: java.lang.Throwable -> L1e
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L1e
                r10.L$2 = r5     // Catch: java.lang.Throwable -> L1e
                r10.label = r2     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r0 = r5.b(r10)     // Catch: java.lang.Throwable -> L1e
                if (r0 != r3) goto L72
                goto L92
            L72:
                r9 = r5
                r5 = r11
                r11 = r0
                r0 = r9
            L76:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1e
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1e
                if (r11 == 0) goto L93
                java.lang.Object r11 = r0.c()     // Catch: java.lang.Throwable -> L1e
                androidx.window.layout.WindowLayoutInfo r11 = (androidx.window.layout.WindowLayoutInfo) r11     // Catch: java.lang.Throwable -> L1e
                r10.L$0 = r5     // Catch: java.lang.Throwable -> L1e
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L1e
                r10.L$2 = r0     // Catch: java.lang.Throwable -> L1e
                r10.label = r1     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r11 = r5.emit(r11, r10)     // Catch: java.lang.Throwable -> L1e
                if (r11 != r3) goto L1b
            L92:
                return r3
            L93:
                androidx.window.layout.WindowInfoTrackerImpl r11 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r11 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r11)
                r11.unregisterLayoutChangeCallback(r4)
                p6.x r11 = p6.x.f8464a
                return r11
            L9f:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        windowMetricsCalculator.getClass();
        windowBackend.getClass();
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public h windowLayoutInfo(Activity activity) {
        activity.getClass();
        return new f0(new AnonymousClass1(activity, null));
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }
}
