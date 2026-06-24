package x4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11317e;
    public String f;
    public int g;
    public int h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f11318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f11320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f11321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f11322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f11327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11328u;

    public static ArrayList c(Context context, ArrayList arrayList) {
        arrayList.getClass();
        context.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                String str = (String) next;
                boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature(str);
                if (!zHasSystemFeature && str.equalsIgnoreCase("android.hardware.ram.low")) {
                    zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.ram.normal");
                }
                boolean z9 = false;
                if (!zHasSystemFeature && systemSharedLibraryNames != null) {
                    int i = 0;
                    while (true) {
                        if (!(i < systemSharedLibraryNames.length)) {
                            break;
                        }
                        int i6 = i + 1;
                        try {
                            if (str.equalsIgnoreCase(systemSharedLibraryNames[i])) {
                                z9 = true;
                                break;
                            }
                            i = i6;
                        } catch (ArrayIndexOutOfBoundsException e10) {
                            androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                            return null;
                        }
                    }
                }
                if (!zHasSystemFeature && !z9) {
                    arrayList2.add(str);
                }
            }
        }
        return arrayList2;
    }

    public final String a() {
        String strConcat = this.f11313a + this.g;
        String str = this.f11314b;
        if (str != null) {
            strConcat = strConcat.concat(str);
        }
        String str2 = this.f11315c;
        if (str2 != null) {
            strConcat = strConcat.concat(str2);
        }
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = strConcat.getBytes(charsetForName);
        bytes.getClass();
        return z3.w(bytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r6) {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r6 = "success"
            boolean r1 = r0.isNull(r6)
            r2 = 0
            if (r1 != 0) goto L79
            int r6 = r0.optInt(r6)
            r1 = 1
            if (r6 != r1) goto L79
            java.lang.String r6 = "data"
            org.json.JSONObject r6 = r0.optJSONObject(r6)
            if (r6 == 0) goto L79
            java.lang.String r0 = "sdk"
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L2f
            int r3 = r5.g
            int r0 = r6.optInt(r0)
            if (r3 != r0) goto L2f
            r0 = r1
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L78
            java.lang.String r0 = "userID"
            boolean r3 = r6.isNull(r0)
            r4 = 0
            if (r3 != 0) goto L47
            java.lang.String r0 = r6.optString(r0)
            java.lang.String r3 = "0"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L48
        L47:
            r0 = r4
        L48:
            java.lang.String r3 = r5.f11314b
            if (r0 != 0) goto L50
            if (r3 == 0) goto L50
        L4e:
            r0 = r2
            goto L59
        L50:
            if (r0 == 0) goto L55
            if (r3 != 0) goto L55
            goto L4e
        L55:
            boolean r0 = l7.u.m0(r0, r3, r1)
        L59:
            if (r0 == 0) goto L78
            java.lang.String r0 = "language"
            boolean r3 = r6.isNull(r0)
            if (r3 != 0) goto L67
            java.lang.String r4 = r6.optString(r0)
        L67:
            java.lang.String r6 = r5.f11315c
            if (r4 != 0) goto L6e
            if (r6 == 0) goto L6e
            goto L79
        L6e:
            if (r4 == 0) goto L73
            if (r6 != 0) goto L73
            goto L79
        L73:
            boolean r6 = l7.u.m0(r4, r6, r1)
            return r6
        L78:
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.p.b(java.lang.String):boolean");
    }

    public final boolean d(r rVar) {
        List listH;
        String str = rVar.f11365t;
        if (str == null || this.f11320m == null) {
            return true;
        }
        Pattern patternCompile = Pattern.compile(",");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listH = arrayList;
        } else {
            listH = a.a.H(str.toString());
        }
        String[] strArr = (String[]) listH.toArray(new String[0]);
        String[] strArr2 = this.f11320m;
        strArr2.getClass();
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!l7.u.m0(strArr2[i], "arm64-v8a", true)) {
                i++;
            } else if (Build.VERSION.SDK_INT > 34) {
                boolean z9 = false;
                for (String str2 : strArr) {
                    if (l7.u.m0(str2, "arm64-v8a", true)) {
                        z9 = true;
                    }
                }
                return z9;
            }
        }
        String[] strArr3 = this.f11320m;
        strArr3.getClass();
        boolean z10 = false;
        for (String str3 : strArr3) {
            if (z10) {
                break;
            }
            for (String str4 : strArr) {
                if (l7.u.m0(str4, "universal", true) || l7.u.m0(str3, str4, true)) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    public final boolean e(r rVar) {
        ArrayList arrayList = rVar.f11369y;
        if (arrayList == null || arrayList.size() <= 0) {
            return true;
        }
        ArrayList arrayList2 = rVar.f11369y;
        arrayList2.getClass();
        Iterator it = arrayList2.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            String str = (String) next;
            if (Integer.parseInt(str) == this.f11326s || Integer.parseInt(str) == 65534 || Integer.parseInt(str) == 65535) {
                return true;
            }
        }
        return false;
    }

    public final void f(Context context) {
        context.getClass();
        this.f11313a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        w2 w2VarH = u2.h(context);
        if ((w2VarH != null ? w2VarH.f11432a : null) != null) {
            this.f11314b = w2VarH.f11432a;
        } else {
            this.f11314b = null;
        }
        this.g = Build.VERSION.SDK_INT;
        boolean z9 = false;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains("device_rooted")) {
                z9 = sharedPreferences.getBoolean("device_rooted", false);
            }
        } catch (Exception unused) {
        }
        if (z9) {
            this.f11324q = 1;
        }
    }

    public final void g(Context context) {
        context.getClass();
        f(context);
        this.h = context.getResources().getDisplayMetrics().widthPixels;
        this.i = context.getResources().getDisplayMetrics().heightPixels;
        this.j = context.getResources().getDisplayMetrics().density;
        this.f11326s = context.getResources().getDisplayMetrics().densityDpi;
        this.f11327t = context.getString(R.string.dpi_device);
        this.f11315c = Locale.getDefault().getLanguage();
        this.f11316d = Build.BRAND;
        this.f = Build.MANUFACTURER;
        this.f11317e = Build.MODEL;
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        this.f11318k = ((TelephonyManager) systemService).getNetworkOperatorName();
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService2 = context.getSystemService("activity");
            systemService2.getClass();
            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
            this.f11319l = memoryInfo.totalMem;
        } catch (Error e10) {
            e10.getMessage();
        } catch (Exception e11) {
            e11.getMessage();
        }
        this.f11320m = Build.SUPPORTED_ABIS;
        this.f11321n = Build.SUPPORTED_32_BIT_ABIS;
        this.f11322o = Build.SUPPORTED_64_BIT_ABIS;
        this.f11323p = context.getString(R.string.version, context.getString(R.string.app_name), "7.28", "728");
        this.f11325r = Build.HARDWARE;
        float f = UptodownApp.I;
        if (b4.d.n(context)) {
            this.f11328u = 1;
        } else {
            this.f11328u = 0;
        }
    }

    public final JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f11313a);
        jSONObject.put("userID", this.f11314b);
        jSONObject.put("country", z3.g);
        jSONObject.put("language", this.f11315c);
        jSONObject.put("brand", this.f11316d);
        jSONObject.put("model", this.f11317e);
        jSONObject.put("manufacturer", this.f);
        int i = this.g;
        if (i > 0) {
            jSONObject.put("sdk", i);
        }
        int i6 = this.h;
        if (i6 > 0) {
            jSONObject.put("displayWidth", i6);
        }
        int i10 = this.i;
        if (i10 > 0) {
            jSONObject.put("displayHeight", i10);
        }
        float f = this.j;
        if (f > 0.0f) {
            jSONObject.put("displayDensity", f);
        }
        String str = this.f11327t;
        if (str != null && str.length() > 0) {
            jSONObject.put("density", this.f11327t);
        }
        long j = this.f11319l;
        if (j > 0) {
            jSONObject.put("ram", j);
        }
        jSONObject.put("operador", this.f11318k);
        String[] strArr = this.f11320m;
        if (strArr != null && strArr.length != 0) {
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                if (!(i11 < strArr.length)) {
                    break;
                }
                int i12 = i11 + 1;
                try {
                    jSONArray.put(strArr[i11]);
                    i11 = i12;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                    return null;
                }
            }
            jSONObject.put("supportedABIs", jSONArray);
        }
        String[] strArr2 = this.f11321n;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            int i13 = 0;
            while (true) {
                if (!(i13 < strArr2.length)) {
                    break;
                }
                int i14 = i13 + 1;
                try {
                    jSONArray2.put(strArr2[i13]);
                    i13 = i14;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.s(e11.getMessage());
                    return null;
                }
            }
            jSONObject.put("supported32BitsABIs", jSONArray2);
        }
        String[] strArr3 = this.f11322o;
        if (strArr3 != null && strArr3.length != 0) {
            JSONArray jSONArray3 = new JSONArray();
            int i15 = 0;
            while (true) {
                if (!(i15 < strArr3.length)) {
                    break;
                }
                int i16 = i15 + 1;
                try {
                    jSONArray3.put(strArr3[i15]);
                    i15 = i16;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.s(e12.getMessage());
                    return null;
                }
            }
            jSONObject.put("supported64BitsABIs", jSONArray3);
        }
        jSONObject.put("appVersion", this.f11323p);
        jSONObject.put("rooted", this.f11324q);
        jSONObject.put("isTV", this.f11328u);
        return jSONObject;
    }

    public final String toString() {
        String str = this.f11313a;
        String str2 = this.f11314b;
        String str3 = this.f11315c;
        String str4 = this.f11316d;
        String str5 = this.f11317e;
        String str6 = this.f;
        int i = this.g;
        int i6 = this.h;
        int i10 = this.i;
        float f = this.j;
        int i11 = this.f11326s;
        String str7 = this.f11327t;
        String str8 = this.f11318k;
        long j = this.f11319l;
        String string = Arrays.toString(this.f11320m);
        string.getClass();
        String string2 = Arrays.toString(this.f11321n);
        string2.getClass();
        String string3 = Arrays.toString(this.f11322o);
        string3.getClass();
        String str9 = this.f11323p;
        int i12 = this.f11324q;
        String str10 = this.f11325r;
        int i13 = this.f11328u;
        StringBuilder sb = new StringBuilder("DeviceInfo(identifier=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", language=");
        a4.x.B(sb, str3, ", brand=", str4, ", model=");
        a4.x.B(sb, str5, ", manufacturer=", str6, ", sdk=");
        sb.append(i);
        sb.append(", displayWidth=");
        sb.append(i6);
        sb.append(", displayHeight=");
        sb.append(i10);
        sb.append(", displayDensity=");
        sb.append(f);
        sb.append(", densityDpi=");
        sb.append(i11);
        sb.append(", density=");
        sb.append(str7);
        sb.append(", operador=");
        sb.append(str8);
        sb.append(", ram=");
        sb.append(j);
        a4.x.B(sb, ", supportedAbis=", string, ", supported32BitsAbis=", string2);
        a4.x.B(sb, ", supported64BitsAbis=", string3, ", appVersion=", str9);
        sb.append(", rooted=");
        sb.append(i12);
        sb.append(", hardware=");
        sb.append(str10);
        sb.append(", isTv=");
        sb.append(i13);
        sb.append(")");
        return sb.toString();
    }
}
