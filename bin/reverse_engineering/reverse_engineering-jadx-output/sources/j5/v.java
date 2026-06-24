package j5;

import a4.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.UptodownApp;
import com.uptodown.util.NativeApiKey;
import e1.x0;
import j$.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x4.g2;
import x4.k2;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6711b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f6712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f6713d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6714a;

    public v(Context context) {
        context.getClass();
        this.f6714a = context;
    }

    public static void B() {
        synchronized (f6711b) {
            f6712c = null;
            f6713d = 0L;
        }
    }

    public static ArrayList E(g2 g2Var) {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        if (!g2Var.b() && (jSONObject = g2Var.f11206d) != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject2 = g2Var.f11206d;
            jSONObject2.getClass();
            if (jSONObject2.optInt("success") == 1 && jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    jSONObjectOptJSONObject.getClass();
                    x4.g gVar = new x4.g();
                    gVar.a(null, jSONObjectOptJSONObject);
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }

    public static HashMap g() {
        HashMap map = new HashMap();
        String str = z3.g;
        if (str != null && str.length() != 0) {
            String str2 = z3.g;
            str2.getClass();
            map.put("countryIsoCode", str2);
        }
        return map;
    }

    public static String n(HashMap map) {
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (z9) {
                z9 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "UTF-8"));
        }
        return sb.toString();
    }

    public final g2 A(long j) {
        g2 g2VarK = k(k0.k.g(j, "https://www.uptodown.app:443/eapi/apps/", "/video"), null, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/apps/appId/video");
        return g2VarK;
    }

    public final void C(long j, String str, String str2, int i) {
        str2.getClass();
        HashMap map = new HashMap();
        map.put("appID", String.valueOf(j));
        map.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        map.put(TypedValues.TransitionType.S_FROM, str2);
        map.put("position", String.valueOf(i));
        map.putAll(g());
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/promo-track"), map, ShareTarget.METHOD_POST, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/promo-track");
    }

    public final g2 D(String str, String str2) {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EMAIL, str);
        map.put("password", str2);
        Context context = this.f6714a;
        context.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            map.put("deviceIdentifier", string);
        }
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/v2/user/login"), map, ShareTarget.METHOD_POST, false);
        if (g2VarK.b()) {
            g2VarK.f11206d = j(g2VarK, "/eapi/v2/user/login");
            return g2VarK;
        }
        g2VarK.f11206d = i(g2VarK, "/eapi/v2/user/login");
        return g2VarK;
    }

    public final g2 F(long j, k2 k2Var) {
        String str;
        Context context = this.f6714a;
        HashMap map = new HashMap();
        String str2 = k2Var.f11263o;
        if (str2 != null && str2.length() > 0) {
            String str3 = k2Var.f11263o;
            str3.getClass();
            map.put("text", str3);
        }
        map.put("rating", String.valueOf(k2Var.f11264p));
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            String packageName = context.getPackageName();
            packageName.getClass();
            str = " " + n4.i.e(packageManager, packageName, 0).versionName;
        } catch (Exception e10) {
            e10.printStackTrace();
            str = "";
        }
        map.put("uagent", "uptodownandroid".concat(str));
        w2 w2VarH = u2.h(context);
        if ((w2VarH != null ? w2VarH.f11431a : null) != null) {
            String str4 = w2VarH.f11431a;
            str4.getClass();
            map.put("id_user", str4);
        }
        g2 g2VarK = k(k0.k.g(j, "https://www.uptodown.app:443/eapi/apps/", "/comments"), map, ShareTarget.METHOD_POST, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/apps/appId/comments/post");
        return g2VarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x4.g2 G(java.lang.String r18, java.util.ArrayList r19, boolean r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.v.G(java.lang.String, java.util.ArrayList, boolean):x4.g2");
    }

    public final g2 H(int i, int i6, String str) {
        String strReplaceAll;
        UnsupportedEncodingException e10;
        String strEncode;
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i));
        map.put("page[offset]", String.valueOf(i6));
        map.putAll(g());
        try {
            Pattern patternCompile = Pattern.compile("\\n");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll(" ");
            strReplaceAll.getClass();
            try {
                int length = strReplaceAll.length() - 1;
                int i10 = 0;
                boolean z9 = false;
                while (i10 <= length) {
                    boolean z10 = kotlin.jvm.internal.l.c(strReplaceAll.charAt(!z9 ? i10 : length), 32) <= 0;
                    if (z9) {
                        if (!z10) {
                            break;
                        }
                        length--;
                    } else if (z10) {
                        i10++;
                    } else {
                        z9 = true;
                    }
                }
                strEncode = URLEncoder.encode(strReplaceAll.subSequence(i10, length + 1).toString(), "UTF-8");
            } catch (UnsupportedEncodingException e11) {
                e10 = e11;
                e10.printStackTrace();
                strEncode = strReplaceAll;
            }
        } catch (UnsupportedEncodingException e12) {
            strReplaceAll = null;
            e10 = e12;
        }
        g2 g2VarK = k(x.j("https://www.uptodown.app:443/eapi/v2/apps/search/", strEncode), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/v2/apps/search");
        return g2VarK;
    }

    public final g2 I(String str) {
        str.getClass();
        HashMap map = new HashMap();
        map.put("fcmToken", str);
        Context context = this.f6714a;
        context.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            map.put("identifier", string);
        }
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/v3/device/fcm-token"), map, ShareTarget.METHOD_POST, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/v3/device/fcm-token");
        return g2VarK;
    }

    public final g2 J(String str) {
        str.getClass();
        HashMap map = new HashMap();
        map.put("provider", "google");
        map.put("accessToken", str);
        Context context = this.f6714a;
        context.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            map.put("deviceIdentifier", string);
        }
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/user/usertokenSignup"), map, ShareTarget.METHOD_POST, false);
        if (g2VarK.b()) {
            g2VarK.f11206d = j(g2VarK, "/eapi/user/usertokenSignup");
            return g2VarK;
        }
        g2VarK.f11206d = i(g2VarK, "/eapi/user/usertokenSignup");
        return g2VarK;
    }

    public final g2 a(long j) {
        g2 g2VarK = k(k0.k.g(j, "https://www.uptodown.app:443/eapi/app/", "/pre-register/add"), g(), ShareTarget.METHOD_POST, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/app/appID/pre-register/add");
        return g2VarK;
    }

    public final g2 b(long j) {
        g2 g2VarK = k(k0.k.g(j, "https://www.uptodown.app:443/eapi/app/", "/pre-register/cancel"), g(), ShareTarget.METHOD_POST, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/app/appID/pre-register/cancel");
        return g2VarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(x4.g2 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "seconds"
            r10.getClass()
            boolean r1 = r10.b()
            r2 = 0
            if (r1 == 0) goto L6d
            int r1 = r10.f11204b
            r3 = 503(0x1f7, float:7.05E-43)
            if (r1 != r3) goto L6c
            java.lang.String r1 = r10.f11203a
            if (r1 == 0) goto L36
            int r1 = r1.length()
            if (r1 != 0) goto L1d
            goto L36
        L1d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32
            java.lang.String r10 = r10.f11203a     // Catch: java.lang.Exception -> L32
            r10.getClass()     // Catch: java.lang.Exception -> L32
            r1.<init>(r10)     // Catch: java.lang.Exception -> L32
            boolean r10 = r1.isNull(r0)     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L36
            long r0 = r1.optLong(r0)     // Catch: java.lang.Exception -> L32
            goto L38
        L32:
            r10 = move-exception
            r10.printStackTrace()
        L36:
            r0 = 7200(0x1c20, double:3.5573E-320)
        L38:
            android.content.Context r10 = r9.f6714a
            r10.getClass()
            java.lang.String r3 = "SharedPreferencesTracking"
            android.content.SharedPreferences r3 = r10.getSharedPreferences(r3, r2)     // Catch: java.lang.Exception -> L59
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Exception -> L59
            java.lang.String r4 = "maintenance_time"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L59
            r7 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r7     // Catch: java.lang.Exception -> L59
            long r0 = r0 * r7
            long r0 = r0 + r5
            r3.putLong(r4, r0)     // Catch: java.lang.Exception -> L59
            r3.apply()     // Catch: java.lang.Exception -> L59
            goto L5d
        L59:
            r0 = move-exception
            r0.printStackTrace()
        L5d:
            e1.c0 r0 = j5.g.D
            j5.g r10 = r0.l(r10)
            r10.b()
            r10.u()
            r10.c()
        L6c:
            return r2
        L6d:
            java.lang.String r10 = r10.f11203a
            r0 = 1
            if (r10 == 0) goto L78
            int r10 = r10.length()
            if (r10 != 0) goto L79
        L78:
            r2 = r0
        L79:
            r10 = r2 ^ 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.v.c(x4.g2):boolean");
    }

    public final String d() throws NoSuchAlgorithmException, InvalidKeyException {
        HashMap map = new HashMap();
        float f = UptodownApp.I;
        String authApikey = NativeApiKey.f3448a.getAuthApikey();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        strValueOf.getClass();
        authApikey.getClass();
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = l7.a.f7151a;
        byte[] bytes = authApikey.getBytes(charset);
        bytes.getClass();
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = strValueOf.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        bArrDoFinal.getClass();
        map.put("hmac", q6.j.k0(bArrDoFinal, "", new androidx.room.f(27), 30));
        map.put("unixtime", strValueOf);
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/auth/token"), map, ShareTarget.METHOD_POST, false);
        if (g2VarK.f11204b == 200 && g2VarK.f11203a != null) {
            String str = g2VarK.f11203a;
            str.getClass();
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.isNull("token") ? null : jSONObject.getString("token");
            f6712c = string;
            if (string != null) {
                byte[] bArrDecode = Base64.getUrlDecoder().decode((String) l7.m.G0(string, new String[]{"."}).get(1));
                bArrDecode.getClass();
                f6713d = new JSONObject(new String(bArrDecode, charset)).getLong("exp");
            }
        }
        return string;
    }

    public final g2 e(String str) {
        str.getClass();
        g2 g2VarK = k("https://www.uptodown.app:443/eapi/apps/byPackagename/".concat(str), null, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/apps/byPackagename");
        return g2VarK;
    }

    public final g2 f(int i) {
        String strG = x.g(i, "/eapi/v2/categories/", "/leaf-categories");
        g2 g2VarK = k("https://www.uptodown.app:443".concat(strG), null, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, strG);
        return g2VarK;
    }

    public final g2 h(int i) {
        HashMap map = new HashMap();
        map.putAll(g());
        String str = "/eapi/category/" + i + "/features";
        g2 g2VarK = k("https://www.uptodown.app:443".concat(str), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, str);
        return g2VarK;
    }

    public final JSONObject i(g2 g2Var, String str) {
        String str2;
        g2Var.getClass();
        if (!g2Var.b() && (str2 = g2Var.f11203a) != null && str2.length() != 0) {
            try {
                String str3 = g2Var.f11203a;
                str3.getClass();
                return new JSONObject(str3);
            } catch (JSONException unused) {
                new android.support.v4.media.g(this.f6714a, 20).E(k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "jsonException", "url", str), "apiRead");
            }
        }
        return null;
    }

    public final JSONObject j(g2 g2Var, String str) {
        String str2 = g2Var.f11203a;
        if (str2 != null && str2.length() != 0) {
            try {
                String str3 = g2Var.f11203a;
                str3.getClass();
                return new JSONObject(str3);
            } catch (JSONException unused) {
                new android.support.v4.media.g(this.f6714a, 20).E(k0.k.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "jsonException", "url", str), "apiRead");
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(2:152|4)(1:7)|8|9|(6:144|11|150|12|(2:14|15)(1:18)|19)|32|(1:34)|35|(1:38)|39|40|(1:42)(2:44|(9:48|49|(3:51|146|52)|56|(1:58)|59|148|60|(16:62|142|63|72|(1:77)|(1:82)|83|(1:87)|88|(1:92)|93|(1:98)(1:97)|99|(2:100|(1:102)(1:153))|103|(5:112|(1:114)(1:115)|116|(1:118)|131)(4:108|109|110|111))(12:67|71|72|(2:74|77)|(2:79|82)|83|(2:85|87)|88|(2:90|92)|93|(10:95|98|99|(3:100|(0)(0)|102)|103|(0)|112|(0)(0)|116|(0))(0)|131))(1:47))|43|49|(0)|56|(0)|59|148|60|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed A[Catch: all -> 0x0054, Exception -> 0x0059, IOException -> 0x005d, SSLHandshakeException -> 0x0061, ProtocolException -> 0x0065, MalformedURLException -> 0x0069, NullPointerException -> 0x006d, SecurityException -> 0x0071, IllegalArgumentException -> 0x0075, IllegalStateException -> 0x0079, SocketTimeoutException -> 0x007d, LOOP:0: B:100:0x01e7->B:102:0x01ed, LOOP_END, TryCatch #20 {all -> 0x0054, blocks: (B:11:0x0031, B:12:0x0036, B:14:0x0040, B:19:0x004c, B:17:0x0048, B:32:0x0081, B:34:0x0087, B:35:0x008c, B:38:0x00a1, B:39:0x00a4, B:42:0x00b1, B:49:0x00f1, B:51:0x00f5, B:52:0x00f7, B:55:0x00fc, B:56:0x00ff, B:58:0x0122, B:60:0x0126, B:63:0x0131, B:72:0x0140, B:74:0x0161, B:77:0x0168, B:79:0x016d, B:82:0x0174, B:83:0x0179, B:85:0x017f, B:87:0x0185, B:88:0x018e, B:90:0x0194, B:92:0x019a, B:93:0x01b6, B:97:0x01c5, B:99:0x01e2, B:100:0x01e7, B:102:0x01ed, B:103:0x01f1, B:106:0x0202, B:108:0x0208, B:98:0x01d4, B:70:0x013c, B:44:0x00c9, B:47:0x00d1), top: B:144:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021f A[Catch: all -> 0x0022, Exception -> 0x0236, IOException -> 0x023c, SSLHandshakeException -> 0x0242, ProtocolException -> 0x0248, MalformedURLException -> 0x024e, NullPointerException -> 0x0254, SecurityException -> 0x025a, IllegalArgumentException -> 0x0260, IllegalStateException -> 0x0266, SocketTimeoutException -> 0x026c, TryCatch #9 {IllegalArgumentException -> 0x0260, IllegalStateException -> 0x0266, NullPointerException -> 0x0254, SecurityException -> 0x025a, MalformedURLException -> 0x024e, ProtocolException -> 0x0248, SocketTimeoutException -> 0x026c, SSLHandshakeException -> 0x0242, IOException -> 0x023c, Exception -> 0x0236, all -> 0x0022, blocks: (B:4:0x001b, B:8:0x0026, B:110:0x020d, B:112:0x0212, B:114:0x021f, B:118:0x0230), top: B:152:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0230 A[Catch: all -> 0x0022, Exception -> 0x0236, IOException -> 0x023c, SSLHandshakeException -> 0x0242, ProtocolException -> 0x0248, MalformedURLException -> 0x024e, NullPointerException -> 0x0254, SecurityException -> 0x025a, IllegalArgumentException -> 0x0260, IllegalStateException -> 0x0266, SocketTimeoutException -> 0x026c, TRY_LEAVE, TryCatch #9 {IllegalArgumentException -> 0x0260, IllegalStateException -> 0x0266, NullPointerException -> 0x0254, SecurityException -> 0x025a, MalformedURLException -> 0x024e, ProtocolException -> 0x0248, SocketTimeoutException -> 0x026c, SSLHandshakeException -> 0x0242, IOException -> 0x023c, Exception -> 0x0236, all -> 0x0022, blocks: (B:4:0x001b, B:8:0x0026, B:110:0x020d, B:112:0x0212, B:114:0x021f, B:118:0x0230), top: B:152:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1 A[EDGE_INSN: B:153:0x01f1->B:103:0x01f1 BREAK  A[LOOP:0: B:100:0x01e7->B:102:0x01ed], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[Catch: all -> 0x0054, Exception -> 0x0059, IOException -> 0x005d, SSLHandshakeException -> 0x0061, ProtocolException -> 0x0065, MalformedURLException -> 0x0069, NullPointerException -> 0x006d, SecurityException -> 0x0071, IllegalArgumentException -> 0x0075, IllegalStateException -> 0x0079, SocketTimeoutException -> 0x007d, TRY_LEAVE, TryCatch #20 {all -> 0x0054, blocks: (B:11:0x0031, B:12:0x0036, B:14:0x0040, B:19:0x004c, B:17:0x0048, B:32:0x0081, B:34:0x0087, B:35:0x008c, B:38:0x00a1, B:39:0x00a4, B:42:0x00b1, B:49:0x00f1, B:51:0x00f5, B:52:0x00f7, B:55:0x00fc, B:56:0x00ff, B:58:0x0122, B:60:0x0126, B:63:0x0131, B:72:0x0140, B:74:0x0161, B:77:0x0168, B:79:0x016d, B:82:0x0174, B:83:0x0179, B:85:0x017f, B:87:0x0185, B:88:0x018e, B:90:0x0194, B:92:0x019a, B:93:0x01b6, B:97:0x01c5, B:99:0x01e2, B:100:0x01e7, B:102:0x01ed, B:103:0x01f1, B:106:0x0202, B:108:0x0208, B:98:0x01d4, B:70:0x013c, B:44:0x00c9, B:47:0x00d1), top: B:144:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122 A[Catch: all -> 0x0054, Exception -> 0x0059, IOException -> 0x005d, SSLHandshakeException -> 0x0061, ProtocolException -> 0x0065, MalformedURLException -> 0x0069, NullPointerException -> 0x006d, SecurityException -> 0x0071, IllegalArgumentException -> 0x0075, IllegalStateException -> 0x0079, SocketTimeoutException -> 0x007d, TRY_LEAVE, TryCatch #20 {all -> 0x0054, blocks: (B:11:0x0031, B:12:0x0036, B:14:0x0040, B:19:0x004c, B:17:0x0048, B:32:0x0081, B:34:0x0087, B:35:0x008c, B:38:0x00a1, B:39:0x00a4, B:42:0x00b1, B:49:0x00f1, B:51:0x00f5, B:52:0x00f7, B:55:0x00fc, B:56:0x00ff, B:58:0x0122, B:60:0x0126, B:63:0x0131, B:72:0x0140, B:74:0x0161, B:77:0x0168, B:79:0x016d, B:82:0x0174, B:83:0x0179, B:85:0x017f, B:87:0x0185, B:88:0x018e, B:90:0x0194, B:92:0x019a, B:93:0x01b6, B:97:0x01c5, B:99:0x01e2, B:100:0x01e7, B:102:0x01ed, B:103:0x01f1, B:106:0x0202, B:108:0x0208, B:98:0x01d4, B:70:0x013c, B:44:0x00c9, B:47:0x00d1), top: B:144:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d4 A[Catch: all -> 0x0054, Exception -> 0x0059, IOException -> 0x005d, SSLHandshakeException -> 0x0061, ProtocolException -> 0x0065, MalformedURLException -> 0x0069, NullPointerException -> 0x006d, SecurityException -> 0x0071, IllegalArgumentException -> 0x0075, IllegalStateException -> 0x0079, SocketTimeoutException -> 0x007d, TryCatch #20 {all -> 0x0054, blocks: (B:11:0x0031, B:12:0x0036, B:14:0x0040, B:19:0x004c, B:17:0x0048, B:32:0x0081, B:34:0x0087, B:35:0x008c, B:38:0x00a1, B:39:0x00a4, B:42:0x00b1, B:49:0x00f1, B:51:0x00f5, B:52:0x00f7, B:55:0x00fc, B:56:0x00ff, B:58:0x0122, B:60:0x0126, B:63:0x0131, B:72:0x0140, B:74:0x0161, B:77:0x0168, B:79:0x016d, B:82:0x0174, B:83:0x0179, B:85:0x017f, B:87:0x0185, B:88:0x018e, B:90:0x0194, B:92:0x019a, B:93:0x01b6, B:97:0x01c5, B:99:0x01e2, B:100:0x01e7, B:102:0x01ed, B:103:0x01f1, B:106:0x0202, B:108:0x0208, B:98:0x01d4, B:70:0x013c, B:44:0x00c9, B:47:0x00d1), top: B:144:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x4.g2 k(java.lang.String r18, java.util.HashMap r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.v.k(java.lang.String, java.util.HashMap, java.lang.String, boolean):x4.g2");
    }

    public final g2 l(String str, HashMap map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        Context context = this.f6714a;
        context.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            HashMap map2 = new HashMap();
            map2.put("identifier", string);
            str = x.k(str, "?", n(map2));
        }
        String strZ = z();
        g2 g2Var = new g2();
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            x0 x0Var = new x0();
            x0Var.k("lang", d0.b.A(z3.y(context, "Language")));
            String string2 = jSONObject.toString();
            string2.getClass();
            byte[] bArrY = d0.b.y(string2);
            x0Var.h(strValueOf, bArrY);
            x0Var.j();
            x0Var.d(new URL(str), strValueOf, strZ);
            x0Var.c("lang", d0.b.A(z3.y(context, "Language")));
            x0Var.a(strValueOf, bArrY);
            x0Var.e();
            g2Var = x0Var.f(true);
        } catch (Exception unused) {
            g2Var.f11205c = "Exception";
        }
        g2Var.a(context);
        return g2Var;
    }

    public final g2 m(int i, int i6) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i));
        map.put("page[offset]", String.valueOf(i6));
        map.putAll(g());
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/apps/new-releases"), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/apps/new-releases");
        return g2VarK;
    }

    public final g2 o(long j) throws JSONException {
        if (j == 0) {
            g2 g2Var = new g2();
            g2Var.f11204b = 404;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", 0);
            g2Var.f11203a = jSONObject.toString();
            return g2Var;
        }
        Context context = this.f6714a;
        context.getClass();
        return k("https://www.uptodown.app:443/eapi/v3/apps/" + j + "/device/" + Settings.Secure.getString(context.getContentResolver(), "android_id"), g(), ShareTarget.METHOD_GET, false);
    }

    public final g2 p(int i, int i6, int i10) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i6));
        map.put("page[offset]", String.valueOf(i10));
        map.putAll(g());
        String strG = x.g(i, "/eapi/categories/", "/apps/news");
        g2 g2VarK = k("https://www.uptodown.app:443".concat(strG), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, strG);
        return g2VarK;
    }

    public final g2 q(int i, int i6, String str) {
        str.getClass();
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i));
        map.put("page[offset]", String.valueOf(i6));
        map.putAll(g());
        g2 g2VarK = k(androidx.lifecycle.l.w("https://www.uptodown.app:443/eapi/user/", str, "/recommended-list"), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/user/" + str + "/recommended-list");
        return g2VarK;
    }

    public final g2 r(long j) {
        g2 g2VarK = k(k0.k.g(j, "https://www.uptodown.app:443/eapi/app/", "/screenshots"), null, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/app/appId/screenshots");
        return g2VarK;
    }

    public final g2 s(int i, int i6) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i));
        map.put("page[offset]", String.valueOf(i6));
        map.putAll(g());
        g2 g2VarK = k("https://www.uptodown.app:443".concat("/eapi/v2/app/top-platform"), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/v2/app/top-platform");
        return g2VarK;
    }

    public final g2 t(int i, int i6, int i10) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i6));
        map.put("page[offset]", String.valueOf(i10));
        map.putAll(g());
        String strG = x.g(i, "/eapi/category/", "/apps/top");
        g2 g2VarK = k("https://www.uptodown.app:443".concat(strG), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, strG);
        return g2VarK;
    }

    public final g2 u(int i, int i6, int i10) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i6));
        map.put("page[offset]", String.valueOf(i10));
        map.putAll(g());
        String strG = x.g(i, "/eapi/floating-category/", "/apps");
        g2 g2VarK = k("https://www.uptodown.app:443".concat(strG), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, strG);
        return g2VarK;
    }

    public final g2 v(int i, int i6, int i10) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i6));
        map.put("page[offset]", String.valueOf(i10));
        map.putAll(g());
        String strG = x.g(i, "/eapi/v3/leaf-category/", "/apps/top");
        g2 g2VarK = k("https://www.uptodown.app:443".concat(strG), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, strG);
        return g2VarK;
    }

    public final g2 w(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        HashMap map = new HashMap();
        map.put("update", String.valueOf(i));
        StringBuilder sb = new StringBuilder("https://www.uptodown.app:443/eapi/apps/");
        sb.append(str2);
        return k(x.o(sb, "/file/", str, "/downloadUrl"), map, ShareTarget.METHOD_GET, false);
    }

    public final g2 x(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        HashMap map = new HashMap();
        map.put("update", String.valueOf(i));
        StringBuilder sb = new StringBuilder("https://www.uptodown.app:443/eapi/apps/");
        sb.append(str2);
        return k(x.o(sb, "/file/", str, "/resumeDownloadURL"), map, ShareTarget.METHOD_GET, false);
    }

    public final g2 y(int i, int i6, String str) {
        HashMap map = new HashMap();
        map.put("page[limit]", String.valueOf(i));
        map.put("page[offset]", String.valueOf(i6));
        map.putAll(g());
        g2 g2VarK = k(androidx.lifecycle.l.w("https://www.uptodown.app:443/eapi/user/", str, "/comments"), map, ShareTarget.METHOD_GET, false);
        g2VarK.f11206d = i(g2VarK, "/eapi/user/userID/comments");
        return g2VarK;
    }

    public final String z() {
        synchronized (f6711b) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String str = f6712c;
            if (str != null && jCurrentTimeMillis < f6713d - 60) {
                return str;
            }
            return d();
        }
    }

    public v(Context context, int i) {
        context.getClass();
        this.f6714a = context;
    }
}
