package m9;

import a3.d;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import b.h;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.model.ChoiceStyle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.l;
import o7.a0;
import o7.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f7842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7843b;

    public a(d dVar) {
        this.f7843b = dVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        WeakReference weakReference = this.f7842a;
        if (weakReference == null || !l.a((Activity) weakReference.get(), activity)) {
            if (!a.a.f0a) {
                h hVar = ChoiceCmp.g;
                if (hVar == null) {
                    l.i("viewModel");
                    throw null;
                }
                if (!hVar.f673k) {
                    ChoiceCmp.access$startLoadCmpInfo(ChoiceCmp.INSTANCE, (ChoiceStyle) this.f7843b.f63b);
                } else if (!ChoiceCmp.j) {
                    a0 a0VarB = ChoiceCmp.h;
                    if (a0VarB == null) {
                        a0VarB = c0.b(c0.d());
                    }
                    ChoiceCmp.h = a0VarB;
                    a0 a0Var = ChoiceCmp.h;
                    if (a0Var != null) {
                        c0.s(a0Var, null, null, new b.d(2, null, 3), 3);
                    }
                }
                a.a.f0a = true;
            }
            this.f7842a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        WeakReference weakReference = this.f7842a;
        if (l.a(weakReference == null ? null : (Activity) weakReference.get(), activity)) {
            if (a.a.f0a) {
                a0 a0Var = ChoiceCmp.h;
                if (a0Var != null) {
                    c0.h(a0Var);
                }
                ChoiceCmp.h = null;
                a.a.f0a = false;
            }
            this.f7842a = null;
        }
    }
}
