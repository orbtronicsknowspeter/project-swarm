package e1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends p4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AlarmManager f4084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d4 f4085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f4086o;

    public k4(u4 u4Var) {
        super(u4Var);
        this.f4084m = (AlarmManager) this.f3876a.f4260a.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Override // e1.p4
    public final void j() {
        AlarmManager alarmManager = this.f4084m;
        if (alarmManager != null) {
            alarmManager.cancel(o());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m();
        }
    }

    public final void k() {
        h();
        w0 w0Var = this.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4347w.b("Unscheduling upload");
        AlarmManager alarmManager = this.f4084m;
        if (alarmManager != null) {
            alarmManager.cancel(o());
        }
        l().c();
        if (Build.VERSION.SDK_INT >= 24) {
            m();
        }
    }

    public final n l() {
        if (this.f4085n == null) {
            this.f4085n = new d4(this, this.f4093b.f4317u, 1);
        }
        return this.f4085n;
    }

    public final void m() {
        JobScheduler jobScheduler = (JobScheduler) this.f3876a.f4260a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
    }

    public final int n() {
        if (this.f4086o == null) {
            this.f4086o = Integer.valueOf("measurement".concat(String.valueOf(this.f3876a.f4260a.getPackageName())).hashCode());
        }
        return this.f4086o.intValue();
    }

    public final PendingIntent o() {
        Context context = this.f3876a.f4260a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f2569a);
    }
}
