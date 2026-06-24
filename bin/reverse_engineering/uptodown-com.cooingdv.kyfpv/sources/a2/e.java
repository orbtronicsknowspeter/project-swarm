package a2;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f14a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16c;

    public e(int i) {
        this.f16c = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f14a));
    }

    public final synchronized boolean c(String str, String str2) {
        String strB = b(this.f16c, str);
        if (this.f14a.size() >= this.f15b && !this.f14a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f15b, null);
            return false;
        }
        String strB2 = b(this.f16c, str2);
        String str3 = (String) this.f14a.get(strB);
        if (str3 == null ? strB2 == null : str3.equals(strB2)) {
            return false;
        }
        this.f14a.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.f16c, str);
                if (this.f14a.size() < this.f15b || this.f14a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.f14a.put(strB, str2 == null ? "" : b(this.f16c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f15b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
