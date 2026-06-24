package u4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements w4.a, w4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f10438a;

    public /* synthetic */ c(d dVar) {
        this.f10438a = dVar;
    }

    @Override // w4.c
    public void d(x4.g gVar) {
        gVar.getClass();
        float f = UptodownApp.I;
        if (b4.d.t()) {
            d dVar = this.f10438a;
            if (dVar.getActivity() != null && (dVar.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = dVar.getActivity();
                activity.getClass();
                ((MainActivity) activity).i0(gVar.f11159a);
            } else {
                if (dVar.getActivity() == null || !(dVar.getActivity() instanceof c4.k0)) {
                    return;
                }
                FragmentActivity activity2 = dVar.getActivity();
                activity2.getClass();
                ((c4.k0) activity2).i0(gVar.f11159a);
            }
        }
    }

    @Override // w4.a
    public void e(x4.g gVar) {
        gVar.getClass();
        d dVar = this.f10438a;
        if ((dVar.getActivity() instanceof MainActivity) || (dVar.getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity = dVar.getActivity();
            activity.getClass();
            ((c4.k0) activity).t0(gVar, new androidx.work.impl.utils.c(12, gVar, dVar));
        }
    }

    @Override // w4.a
    public void f(x4.g gVar) {
        SharedPreferences sharedPreferences;
        gVar.getClass();
        float f = UptodownApp.I;
        if (b4.d.t()) {
            d dVar = this.f10438a;
            FragmentActivity activity = dVar.getActivity();
            activity.getClass();
            if (((c4.k0) activity).T()) {
                Context contextRequireContext = dVar.requireContext();
                contextRequireContext.getClass();
                int i = 0;
                SharedPreferences sharedPreferences2 = contextRequireContext.getSharedPreferences("SharedPreferencesUser", 0);
                t6.c cVar = null;
                try {
                    sharedPreferences = contextRequireContext.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                if (string == null && sharedPreferences2.getString("is_turbo", null) == null) {
                    dVar.startActivity(new Intent(dVar.requireContext(), (Class<?>) LoginActivity.class));
                    return;
                }
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(dVar);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new b(dVar, gVar, cVar, i), 2);
            }
        }
    }
}
