package j5;

import android.app.AppOpsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.measurement.z3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static long a(Context context) {
        context.getClass();
        boolean z9 = false;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("stats_enabled")) {
                z9 = sharedPreferences.getBoolean("stats_enabled", false);
            }
        } catch (Exception unused) {
        }
        if (z9) {
            Object systemService = context.getSystemService("usagestats");
            systemService.getClass();
            UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jT = z3.t(jCurrentTimeMillis - ((long) 86400000), context, "lastTimeUsageGetted");
            if (jCurrentTimeMillis - jT >= 82800000) {
                z3.Q(jCurrentTimeMillis, context, "lastTimeUsageGetted");
                List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(0, jT, jCurrentTimeMillis);
                listQueryUsageStats.getClass();
                long totalTimeVisible = 0;
                for (UsageStats usageStats : listQueryUsageStats) {
                    if (usageStats.getPackageName().equals(context.getPackageName())) {
                        totalTimeVisible += Build.VERSION.SDK_INT >= 29 ? usageStats.getTotalTimeVisible() : usageStats.getTotalTimeInForeground();
                    }
                }
                return totalTimeVisible >= 0 ? totalTimeVisible / ((long) 1000) : totalTimeVisible;
            }
        }
        return 0L;
    }

    public static boolean b(Context context) {
        Integer numValueOf;
        context.getClass();
        AppOpsManager appOpsManager = (AppOpsManager) ContextCompat.getSystemService(context, AppOpsManager.class);
        if (Build.VERSION.SDK_INT >= 29) {
            numValueOf = appOpsManager != null ? Integer.valueOf(appOpsManager.unsafeCheckOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName())) : null;
            return numValueOf != null && numValueOf.intValue() == 0;
        }
        numValueOf = appOpsManager != null ? Integer.valueOf(appOpsManager.checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName())) : null;
        return numValueOf != null && numValueOf.intValue() == 0;
    }
}
