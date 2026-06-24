package g2;

import android.text.TextUtils;
import android.util.Log;
import b5.m;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5108a;

    public static void a(m mVar, f fVar) {
        String str = fVar.f5128a;
        if (str != null) {
            mVar.E("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        mVar.E("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        mVar.E("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.4");
        mVar.E("Accept", "application/json");
        mVar.E("X-CRASHLYTICS-DEVICE-MODEL", fVar.f5129b);
        String str2 = fVar.f5130c;
        if (str2 != null) {
            mVar.E("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = fVar.f5131d;
        if (str3 != null) {
            mVar.E("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = fVar.f5132e.c().f11608a;
        if (str4 != null) {
            mVar.E("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(f fVar) {
        HashMap map = new HashMap();
        map.put("build_version", fVar.h);
        map.put("display_version", fVar.g);
        map.put("source", Integer.toString(fVar.i));
        String str = fVar.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(d2.a aVar) {
        String str = this.f5108a;
        int i = aVar.f3539a;
        v1.c cVar = v1.c.f10792a;
        cVar.c("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = aVar.f3540b;
            try {
                return new JSONObject(str2);
            } catch (Exception e10) {
                cVar.d("Failed to parse settings JSON from ".concat(str), e10);
                cVar.d("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (cVar.a(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }
}
