package c4;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import com.uptodown.activities.MainActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1412b;

    public /* synthetic */ b3(int i, MainActivity mainActivity) {
        this.f1411a = i;
        this.f1412b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferences;
        int i = this.f1411a;
        int i6 = 0;
        MainActivity mainActivity = this.f1412b;
        switch (i) {
            case 0:
                int i10 = MainActivity.G0;
                ProgressBar progressBar = (ProgressBar) mainActivity.findViewById(2131363022);
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                }
                return;
            case 1:
                int i11 = MainActivity.G0;
                try {
                    sharedPreferences = mainActivity.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                boolean z9 = sharedPreferences.contains("is_device_tracking_registered") ? sharedPreferences.getBoolean("is_device_tracking_registered", false) : false;
                if (z9) {
                    mainActivity.f3309g0 = 0;
                    mainActivity.Q0();
                    return;
                }
                int i12 = mainActivity.f3309g0;
                if (i12 >= 5) {
                    mainActivity.f3309g0 = 0;
                    mainActivity.Q0();
                    return;
                }
                mainActivity.f3309g0 = i12 + 1;
                Handler handler = mainActivity.f3308f0;
                b3 b3Var = mainActivity.f3326y0;
                if (b3Var != null) {
                    handler.postDelayed(b3Var, 2000L);
                    return;
                } else {
                    kotlin.jvm.internal.l.i("checkRegisteredRunnable");
                    throw null;
                }
                break;
            default:
                int i13 = MainActivity.G0;
                new Handler(Looper.getMainLooper()).postDelayed(new b3(i6, mainActivity), 2000L);
                return;
        }
    }
}
