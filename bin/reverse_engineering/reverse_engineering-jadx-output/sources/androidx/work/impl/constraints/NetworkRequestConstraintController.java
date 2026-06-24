package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Constraints;
import androidx.work.impl.constraints.NetworkRequestConstraintController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import d7.l;
import d7.p;
import kotlin.jvm.internal.g;
import o7.c0;
import o7.e1;
import o7.s1;
import p6.x;
import q7.r;
import q7.s;
import r7.h;
import r7.k0;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class NetworkRequestConstraintController implements ConstraintController {
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, t6.c cVar) {
            super(2, cVar);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x invokeSuspend$lambda$0(e1 e1Var, s sVar, ConstraintsState constraintsState) {
            e1Var.c(null);
            ((r) sVar).p(constraintsState);
            return x.f8463a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x invokeSuspend$lambda$1(d7.a aVar) {
            aVar.invoke();
            return x.f8463a;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constraints, this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // d7.p
        public final Object invoke(s sVar, t6.c cVar) {
            return ((AnonymousClass1) create(sVar, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            x xVar = x.f8463a;
            if (i != 0) {
                if (i == 1) {
                    p6.a.e(obj);
                    return xVar;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            final s sVar = (s) this.L$0;
            NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
            if (requiredNetworkRequest == null) {
                r rVar = (r) sVar;
                rVar.getClass();
                rVar.m(null);
                return xVar;
            }
            final s1 s1VarS = c0.s(sVar, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, sVar, null), 3);
            l lVar = new l() { // from class: androidx.work.impl.constraints.b
                @Override // d7.l
                public final Object invoke(Object obj2) {
                    return NetworkRequestConstraintController.AnonymousClass1.invokeSuspend$lambda$0(s1VarS, sVar, (ConstraintsState) obj2);
                }
            };
            final d7.a aVarAddCallback = Build.VERSION.SDK_INT >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(this.this$0.connManager, requiredNetworkRequest, lVar) : IndividualNetworkCallback.Companion.addCallback(this.this$0.connManager, requiredNetworkRequest, lVar);
            d7.a aVar = new d7.a() { // from class: androidx.work.impl.constraints.c
                @Override // d7.a
                public final Object invoke() {
                    return NetworkRequestConstraintController.AnonymousClass1.invokeSuspend$lambda$1(aVarAddCallback);
                }
            };
            this.label = 1;
            Object objO = d0.b.o(sVar, aVar, this);
            u6.a aVar2 = u6.a.f10762a;
            return objO == aVar2 ? aVar2 : xVar;
        }
    }

    public NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j) {
        connectivityManager.getClass();
        this.connManager = connectivityManager;
        this.timeoutMs = j;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        workSpec.getClass();
        return workSpec.constraints.getRequiredNetworkRequest() != null;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        workSpec.getClass();
        if (!hasConstraint(workSpec)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public h track(Constraints constraints) {
        constraints.getClass();
        return k0.e(new AnonymousClass1(constraints, this, null));
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j, int i, g gVar) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }
}
