package u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10523b;

    public /* synthetic */ l(f0 f0Var, int i) {
        this.f10522a = i;
        this.f10523b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10522a) {
            case 0:
                f0 f0Var = this.f10523b;
                if (f0Var.getContext() != null) {
                    Context contextRequireContext = f0Var.requireContext();
                    contextRequireContext.getClass();
                    boolean z9 = false;
                    try {
                        SharedPreferences sharedPreferences = contextRequireContext.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences.contains("is_device_tracking_registered")) {
                            z9 = sharedPreferences.getBoolean("is_device_tracking_registered", false);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    if (!z9) {
                        f0Var.a0();
                    } else {
                        t4.b bVar = f0Var.f10474b;
                        bVar.getClass();
                        if (bVar.f9616n.getChildCount() != 0) {
                            t4.b bVar2 = f0Var.f10474b;
                            bVar2.getClass();
                            bVar2.f9616n.removeAllViews();
                        }
                    }
                }
                break;
            default:
                f0 f0Var2 = this.f10523b;
                r7.o0 o0Var = f0Var2.G().Q;
                t4.b bVar3 = f0Var2.f10474b;
                bVar3.getClass();
                Integer numValueOf = Integer.valueOf(((View) bVar3.D.f8823q).getMeasuredWidth());
                o0Var.getClass();
                o0Var.g(null, numValueOf);
                if (((Boolean) f0Var2.G().N.getValue()).booleanValue()) {
                    f0Var2.w0();
                }
                break;
        }
    }
}
