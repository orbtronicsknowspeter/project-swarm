package g5;

import android.os.Process;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.uptodown.tv.ui.fragment.TvSearchFragment;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5322a;

    public /* synthetic */ h0(TvSearchFragment tvSearchFragment) {
        this.f5322a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5322a) {
            case 0:
                int i = TvSearchFragment.f3445m;
                break;
            case 1:
                Process.killProcess(Process.myPid());
                break;
            default:
                int i6 = AlarmManagerSchedulerBroadcastReceiver.f2425a;
                break;
        }
    }
}
