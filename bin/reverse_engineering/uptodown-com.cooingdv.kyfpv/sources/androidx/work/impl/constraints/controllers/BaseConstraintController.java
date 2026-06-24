package androidx.work.impl.constraints.controllers;

import androidx.core.text.HtmlCompat;
import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BaseConstraintController;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import d0.b;
import d7.p;
import p6.x;
import q7.r;
import q7.s;
import r7.h;
import r7.k0;
import t6.c;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseConstraintController<T> implements ConstraintController {
    private final ConstraintTracker<T> tracker;

    /* JADX INFO: renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {HtmlCompat.FROM_HTML_MODE_COMPACT}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseConstraintController<T> baseConstraintController, c cVar) {
            super(2, cVar);
            this.this$0 = baseConstraintController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x invokeSuspend$lambda$0(BaseConstraintController baseConstraintController, BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1) {
            baseConstraintController.tracker.removeListener(baseConstraintController$track$1$listener$1);
            return x.f8464a;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // d7.p
        public final Object invoke(s sVar, c cVar) {
            return ((AnonymousClass1) create(sVar, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                final s sVar = (s) this.L$0;
                final BaseConstraintController<T> baseConstraintController = this.this$0;
                final ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T t9) {
                        Object constraintsNotMet = baseConstraintController.isConstrained(t9) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE;
                        r rVar = (r) sVar;
                        rVar.getClass();
                        rVar.p(constraintsNotMet);
                    }
                };
                ((BaseConstraintController) this.this$0).tracker.addListener(constraintListener);
                final BaseConstraintController<T> baseConstraintController2 = this.this$0;
                d7.a aVar = new d7.a() { // from class: androidx.work.impl.constraints.controllers.a
                    @Override // d7.a
                    public final Object invoke() {
                        return BaseConstraintController.AnonymousClass1.invokeSuspend$lambda$0(baseConstraintController2, constraintListener);
                    }
                };
                this.label = 1;
                Object objO = b.o(sVar, aVar, this);
                u6.a aVar2 = u6.a.f10763a;
                if (objO == aVar2) {
                    return aVar2;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return x.f8464a;
        }
    }

    public BaseConstraintController(ConstraintTracker<T> constraintTracker) {
        constraintTracker.getClass();
        this.tracker = constraintTracker;
    }

    public abstract int getReason();

    public boolean isConstrained(T t9) {
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        workSpec.getClass();
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public h track(Constraints constraints) {
        constraints.getClass();
        return k0.e(new AnonymousClass1(this, null));
    }

    public static /* synthetic */ void getReason$annotations() {
    }
}
