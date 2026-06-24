package d0;

import a4.x;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.l;
import androidx.viewbinding.ViewBindings;
import b2.t1;
import c3.w;
import c4.c0;
import c4.k0;
import c4.o;
import c4.t;
import c8.f;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.measurement.z3;
import com.inmobi.cmp.core.model.Vector;
import d7.p;
import f8.y;
import g4.v;
import j$.time.Year;
import j5.g;
import j5.k;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e;
import l7.m;
import l7.u;
import o7.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.y0;
import t6.h;
import t6.i;
import x4.b3;
import x4.d;
import x4.j0;
import x4.q2;
import x4.r;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3533b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3534a;

    public /* synthetic */ b(int i) {
        this.f3534a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b.A(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t6.c B(p pVar, t6.c cVar, t6.c cVar2) {
        pVar.getClass();
        if (pVar instanceof v6.a) {
            return ((v6.a) pVar).create(cVar, cVar2);
        }
        h context = cVar2.getContext();
        return context == i.f10314a ? new u6.b(pVar, cVar2, cVar) : new u6.c(cVar2, context, pVar, cVar);
    }

    public static boolean C() {
        if (!m9.c.e().f7236k.f7185c.equals(Boolean.TRUE)) {
            return false;
        }
        ArrayList arrayList = m9.c.e().f7239n.v.f7181a;
        String upperCase = t1.f947c.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return arrayList.contains(upperCase);
    }

    public static final boolean D(char c9, char c10, boolean z9) {
        if (c9 == c10) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static x4.i E(JSONObject jSONObject) {
        x4.i iVar = new x4.i();
        if (!jSONObject.isNull("id")) {
            iVar.f11214a = jSONObject.optLong("id");
        }
        if (!jSONObject.isNull("sha256")) {
            jSONObject.optString("sha256");
        }
        if (!jSONObject.isNull("active")) {
            iVar.f11215b = jSONObject.optInt("active");
        }
        if (!jSONObject.isNull("url")) {
            iVar.f11216c = jSONObject.optString("url");
        }
        if (!jSONObject.isNull("isTurbo")) {
            jSONObject.optInt("isTurbo");
        }
        return iVar;
    }

    public static final Class F(j7.c cVar) {
        cVar.getClass();
        Class clsA = ((e) cVar).a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class G(j7.c cVar) {
        cVar.getClass();
        Class clsA = ((e) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static String H(Context context) {
        context.getClass();
        String string = null;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("Language")) {
                string = sharedPreferences.getString("Language", null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return u.o0("https://www.uptodown.com/turbo?platform=android", "www", A(string), false);
    }

    public static t6.c I(t6.c cVar) {
        t6.c cVarIntercepted;
        cVar.getClass();
        v6.c cVar2 = cVar instanceof v6.c ? (v6.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static boolean J(Throwable th) {
        y0 y0Var = th instanceof y0 ? (y0) th : null;
        return y0Var != null && y0Var.f9324a == 451;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean K(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case 3121:
                return str.equals("ar");
            case 3179:
                return str.equals("cn");
            case 3201:
                return str.equals("de");
            case 3241:
                return str.equals("en");
            case 3246:
                return str.equals("es");
            case 3276:
                return str.equals("fr");
            case 3329:
                return str.equals("hi");
            case 3355:
                return str.equals("id");
            case 3365:
                return str.equals("in");
            case 3371:
                return str.equals("it");
            case 3383:
                return str.equals("ja");
            case 3428:
                return str.equals("ko");
            case 3431:
                return str.equals("kr");
            case 3588:
                return str.equals("pt");
            case 3645:
                return str.equals("ro");
            case 3651:
                return str.equals("ru");
            case 3700:
                return str.equals("th");
            case 3710:
                return str.equals("tr");
            case 3763:
                return str.equals("vi");
            case 3886:
                return str.equals("zh");
            default:
                return false;
        }
    }

    public static final boolean L(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    public static void M(Context context, x4.e eVar, Bundle bundle) {
        context.getClass();
        int i = 0;
        if (eVar != null) {
            g gVarL = g.D.l(context);
            gVarL.b();
            String str = eVar.f11123l;
            if (str != null && str.length() != 0) {
                String str2 = eVar.f11123l;
                str2.getClass();
                r rVarL = gVarL.L(eVar.f11124m, str2);
                if (rVarL != null && rVarL.B == 1) {
                    eVar.v = 1;
                    eVar.f11127p = d.f11088b;
                    gVarL.m0(eVar);
                    String str3 = eVar.f11123l;
                    str3.getClass();
                    gVarL.s(str3);
                    a.a.r(context);
                    i = 1;
                }
            }
            gVarL.c();
        }
        bundle.putInt("rollback", i);
    }

    public static final ArrayList N(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : new k7.a(new a7.e(bufferedReader, 0))) {
                str.getClass();
                arrayList.add(str);
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static final String O(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final void P(Context context, k0 k0Var, w4.g gVar, x4.g gVar2, boolean z9) {
        SharedPreferences sharedPreferences;
        k kVar = new k(z9, gVar2, k0Var, gVar);
        if (k0Var.T()) {
            if (!z3.f) {
                try {
                    sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                boolean z10 = sharedPreferences.contains("warning_no_wifi") ? sharedPreferences.getBoolean("warning_no_wifi", true) : true;
                if (z10) {
                    if (k0Var.isFinishing()) {
                        return;
                    }
                    AlertDialog alertDialog = k0Var.F;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    e2.d dVarJ = e2.d.j(k0Var.getLayoutInflater());
                    CheckBox checkBox = (CheckBox) dVarJ.f4467l;
                    TextView textView = (TextView) dVarJ.f4470o;
                    TextView textView2 = (TextView) dVarJ.f4468m;
                    TextView textView3 = (TextView) dVarJ.f4471p;
                    ((TextView) dVarJ.f4472q).setTypeface(f4.c.f4882w);
                    ((TextView) dVarJ.f4469n).setTypeface(f4.c.f4883x);
                    textView3.setTypeface(f4.c.f4882w);
                    textView2.setTypeface(f4.c.f4882w);
                    textView.setTypeface(f4.c.f4882w);
                    checkBox.setVisibility(0);
                    checkBox.setTypeface(f4.c.f4883x);
                    textView3.setVisibility(8);
                    textView2.setOnClickListener(new o(k0Var, 10));
                    textView.setOnClickListener(new t(dVarJ, k0Var, kVar));
                    AlertDialog.Builder builder = new AlertDialog.Builder(k0Var);
                    builder.setView((RelativeLayout) dVarJ.f4466b);
                    builder.setCancelable(true);
                    AlertDialog alertDialog2 = k0Var.F;
                    if (alertDialog2 == null || !alertDialog2.isShowing()) {
                        AlertDialog alertDialogCreate = builder.create();
                        k0Var.F = alertDialogCreate;
                        alertDialogCreate.getClass();
                        Window window = alertDialogCreate.getWindow();
                        if (window != null) {
                            x.y(window, 0);
                        }
                        AlertDialog alertDialog3 = k0Var.F;
                        alertDialog3.getClass();
                        alertDialog3.show();
                        return;
                    }
                    return;
                }
            }
            kVar.invoke();
        }
    }

    public static Object Q(p pVar, Object obj, t6.c cVar) {
        pVar.getClass();
        h context = cVar.getContext();
        Object dVar = context == i.f10314a ? new u6.d(cVar) : new u6.e(cVar, context);
        a0.b(2, pVar);
        return pVar.invoke(obj, dVar);
    }

    public static int R(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long S(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    public static int a() {
        int i;
        ?? r02 = m9.c.d().f6719d;
        if (r02 == 0) {
            i = 0;
        } else if (r02.isEmpty()) {
            i = 1;
        } else {
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                if (!((j8.b) it.next()).f6721b.equals(Boolean.FALSE)) {
                    if (r02.isEmpty()) {
                        i = 3;
                    } else {
                        Iterator it2 = r02.iterator();
                        while (it2.hasNext()) {
                            if (!((j8.b) it2.next()).f6721b.equals(Boolean.TRUE)) {
                                i = 2;
                                break;
                            }
                        }
                        i = 3;
                    }
                }
            }
            i = 1;
        }
        if (i == 0) {
            return 4;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Vector b(String str) {
        Vector vector = new Vector(null, 1, 0 == true ? 1 : 0);
        int i = 0;
        int i6 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            i++;
            i6++;
            if (cCharAt == '1') {
                vector.set(i6);
            }
        }
        return vector;
    }

    public static String c(Vector vector) {
        vector.getClass();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f7024a = u.n0(vector.getMaxId());
        vector.forEach(new w5.b(xVar, 0));
        return (String) xVar.f7024a;
    }

    public static String d(f9.d dVar, l9.a aVar) {
        aVar.getClass();
        SharedPreferences sharedPreferences = aVar.f7262a;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            return (sharedPreferences.getBoolean("CCPAShown", false) && sharedPreferences.getBoolean("CCPAConsentGivenExplicitly", false) && aVar.a(2, 3).equals("Y")) ? "Reject" : "All";
        }
        if (iOrdinal == 1) {
            String strJ = aVar.j(76);
            return strJ.length() == 0 ? sharedPreferences.getBoolean("GDPRShown", false) ? "Bounce" : "NA" : strJ;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return j8.e.f6734d ? sharedPreferences.getBoolean("MSPAConsentGivenExplicitly", false) ? aVar.j(73) : l.k(a()) : l.k(a());
    }

    public static final ArrayList e(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    int i6 = i + 1;
                    int iOptInt = jSONArray.optInt(i);
                    Integer numValueOf = Integer.valueOf(iOptInt);
                    if (iOptInt == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList.add(Integer.valueOf(numValueOf.intValue()));
                    }
                    i = i6;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static p9.k f(String str, String str2, String str3, String str4, String str5, int i, int i6, boolean z9, int i10) {
        String str6;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (i6 == 0 || i10 == 0) {
            throw null;
        }
        p9.k kVar = new p9.k();
        Bundle bundleF = k0.k.f("title", str, "description", str2);
        bundleF.putString("legal_description", str3);
        bundleF.putString("legal_description_label", str4);
        bundleF.putString("close_button_label", str5);
        bundleF.putBoolean("legitimate_interest", z9);
        if (i10 == 1) {
            str6 = "ALL_VENDORS";
        } else if (i10 == 2) {
            str6 = "IAB_VENDORS";
        } else if (i10 == 3) {
            str6 = "NON_IAB_VENDORS";
        } else {
            if (i10 != 4) {
                throw null;
            }
            str6 = "GOOGLE_VENDORS";
        }
        bundleF.putString("vendor_type_selected", str6);
        p9.k.L = i;
        p9.k.M = i6;
        kVar.setArguments(bundleF);
        return kVar;
    }

    public static Object g(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void h(int i, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
    }

    public static final void i(f fVar) {
        fVar.getClass();
        if ((fVar instanceof y ? (y) fVar : null) != null) {
            return;
        }
        com.google.gson.internal.a.h(kotlin.jvm.internal.y.a(fVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final void j(Context context, k0 k0Var, w4.g gVar, x4.g gVar2, boolean z9) {
        gVar2.getClass();
        gVar.getClass();
        String str = gVar2.O;
        PackageInfo packageInfoE = null;
        Integer numH0 = str != null ? l7.t.h0(str) : null;
        int i = context.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
        int value = Year.now().getValue();
        if (numH0 != null && numH0.intValue() >= 18) {
            String str2 = gVar2.F;
            if (str2 != null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        packageInfoE = n4.i.e(packageManager, str2, 0);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (packageInfoE == null) {
                int i6 = 9;
                if (i < 0) {
                    String str3 = gVar2.O;
                    c0 c0Var = new c0(context, k0Var, gVar, gVar2, z9);
                    int i10 = k0.N;
                    k0Var.K(str3, c0Var, new androidx.lifecycle.k(i6));
                    return;
                }
                if (value - i >= 18) {
                    k(context, k0Var, gVar, gVar2, z9);
                    return;
                } else {
                    k0Var.L(new androidx.lifecycle.k(i6));
                    return;
                }
            }
        }
        k(context, k0Var, gVar, gVar2, z9);
    }

    public static final void k(Context context, k0 k0Var, w4.g gVar, x4.g gVar2, boolean z9) {
        String str;
        r rVarK;
        r rVarK2;
        SharedPreferences sharedPreferences;
        String str2;
        if (z9 && (str2 = gVar2.F) != null && str2.length() != 0) {
            g gVarL = g.D.l(context);
            gVarL.b();
            String str3 = gVar2.F;
            str3.getClass();
            x4.e eVarB = gVarL.B(str3);
            String str4 = gVar2.F;
            str4.getClass();
            q2 q2VarY = gVarL.Y(str4);
            if (q2VarY == null || q2VarY.c() || (eVarB != null && eVarB.v == 1)) {
                PackageManager packageManager = context.getPackageManager();
                String str5 = gVar2.F;
                str5.getClass();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    try {
                        k0Var.startActivity(launchIntentForPackage);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        String string = context.getString(2131952004, gVar2.f11159b);
                        string.getClass();
                        gVar.A(string);
                        return;
                    } catch (SecurityException unused2) {
                        String string2 = context.getString(2131952004, gVar2.f11159b);
                        string2.getClass();
                        gVar.A(string2);
                        return;
                    }
                }
            }
        }
        String str6 = gVar2.F;
        File fileG = null;
        if (str6 != null && str6.length() != 0) {
            try {
                sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused3) {
            }
            boolean z10 = sharedPreferences.contains("is_device_tracking_registered") ? sharedPreferences.getBoolean("is_device_tracking_registered", false) : false;
            if (!z10) {
                g gVarL2 = g.D.l(context);
                gVarL2.b();
                long j = gVar2.K;
                String str7 = gVar2.F;
                if (j > 0) {
                    str7.getClass();
                    rVarK2 = gVarL2.L(gVar2.K, str7);
                } else {
                    str7.getClass();
                    rVarK2 = gVarL2.K(str7);
                }
                gVarL2.c();
                if (rVarK2 != null && rVarK2.c()) {
                    fileG = rVarK2.g();
                }
                if (fileG != null && rVarK2 != null) {
                    gVar.g(rVarK2);
                    return;
                }
                String str8 = gVar2.N;
                if (str8 != null && str8.length() != 0) {
                    P(context, k0Var, gVar, gVar2, z9);
                    return;
                }
                String string3 = context.getString(2131951967);
                string3.getClass();
                gVar.A(string3);
                return;
            }
        }
        if (gVar2.j() && gVar2.k()) {
            g gVarL3 = g.D.l(context);
            gVarL3.b();
            long j6 = gVar2.K;
            String str9 = gVar2.F;
            if (j6 > 0) {
                str9.getClass();
                rVarK = gVarL3.L(gVar2.K, str9);
            } else {
                str9.getClass();
                rVarK = gVarL3.K(str9);
            }
            gVarL3.c();
            if (rVarK != null && rVarK.c()) {
                fileG = rVarK.g();
            }
            if (fileG == null || !fileG.exists()) {
                P(context, k0Var, gVar, gVar2, z9);
                return;
            } else {
                rVarK.getClass();
                gVar.g(rVarK);
                return;
            }
        }
        if (!kotlin.jvm.internal.l.a(gVar2.W, "ExternalDownload") || (str = gVar2.f11167i0) == null || str.length() == 0) {
            String str10 = gVar2.f11174n;
            if (str10 != null && str10.length() != 0) {
                t1.u(k0Var, gVar2.f11174n);
                return;
            }
            String string4 = context.getString(2131951967);
            string4.getClass();
            gVar.A(string4);
            return;
        }
        w2 w2VarH = u2.h(context);
        if (w2VarH == null || !w2VarH.d()) {
            String str11 = gVar2.f11167i0;
            str11.getClass();
            gVar.p(str11);
            return;
        }
        androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(9, gVar, gVar2);
        k0Var.Q();
        View viewInflate = k0Var.getLayoutInflater().inflate(2131558506, (ViewGroup) null, false);
        int i = 2131362323;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362323);
        if (imageView != null) {
            i = 2131363617;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363617);
            if (textView != null) {
                i = 2131363787;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363787);
                if (textView2 != null) {
                    i = 2131364383;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364383);
                    if (textView3 != null) {
                        textView3.setTypeface(f4.c.f4882w);
                        textView2.setTypeface(f4.c.f4883x);
                        textView2.setText(gVar2.f11168j0);
                        imageView.setOnClickListener(new o(k0Var, 4));
                        textView.setTypeface(f4.c.f4882w);
                        textView.setOnClickListener(new c.e(3, k0Var, cVar));
                        AlertDialog.Builder builder = new AlertDialog.Builder(k0Var);
                        builder.setView((RelativeLayout) viewInflate);
                        builder.setCancelable(true);
                        k0Var.F = builder.create();
                        k0Var.u0();
                        return;
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static b3 l(JSONObject jSONObject) {
        b3 b3Var = new b3();
        if (!jSONObject.isNull("id")) {
            b3Var.f11065a = jSONObject.optLong("id");
        }
        if (!jSONObject.isNull("name")) {
            b3Var.f11066b = jSONObject.optString("name");
        }
        if (!jSONObject.isNull("isInstalled")) {
            b3Var.f11068m = jSONObject.optInt("isInstalled");
        }
        if (!jSONObject.isNull("isCompatible")) {
            b3Var.f11069n = jSONObject.optInt("isCompatible");
        }
        if (!jSONObject.isNull("isCurrentDevice")) {
            b3Var.f11067l = jSONObject.optInt("isCurrentDevice");
        }
        if (!jSONObject.isNull("isLinked")) {
            b3Var.f11070o = jSONObject.optInt("isLinked");
        }
        return b3Var;
    }

    public static final e8.i m(c8.e eVar) {
        eVar.getClass();
        e8.i iVar = eVar instanceof e8.i ? (e8.i) eVar : null;
        if (iVar != null) {
            return iVar;
        }
        com.google.gson.internal.a.h(kotlin.jvm.internal.y.a(eVar.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final Object n(j1.p pVar, w wVar) throws Exception {
        if (!pVar.h()) {
            o7.l lVar = new o7.l(1, I(wVar));
            lVar.s();
            pVar.a(y7.a.f11808a, new g5.f(lVar, 19));
            return lVar.r();
        }
        Exception excF = pVar.f();
        if (excF != null) {
            throw excF;
        }
        if (!pVar.f6563d) {
            return pVar.g();
        }
        throw new CancellationException("Task " + pVar + " was cancelled normally.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(q7.s r4, d7.a r5, v6.c r6) {
        /*
            boolean r0 = r6 instanceof q7.p
            if (r0 == 0) goto L13
            r0 = r6
            q7.p r0 = (q7.p) r0
            int r1 = r0.f8777l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8777l = r1
            goto L18
        L13:
            q7.p r0 = new q7.p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8776b
            int r1 = r0.f8777l
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            d7.a r5 = r0.f8775a
            p6.a.e(r6)     // Catch: java.lang.Throwable -> L27
            goto L62
        L27:
            r4 = move-exception
            goto L68
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            r4 = 0
            return r4
        L30:
            p6.a.e(r6)
            t6.h r6 = r0.getContext()
            o7.x r1 = o7.x.f8327b
            t6.f r6 = r6.get(r1)
            if (r6 != r4) goto L6c
            r0.f8775a = r5     // Catch: java.lang.Throwable -> L27
            r0.f8777l = r2     // Catch: java.lang.Throwable -> L27
            o7.l r6 = new o7.l     // Catch: java.lang.Throwable -> L27
            t6.c r0 = I(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.s()     // Catch: java.lang.Throwable -> L27
            q7.q r0 = new q7.q     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            q7.r r4 = (q7.r) r4     // Catch: java.lang.Throwable -> L27
            r4.g0(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L27
            u6.a r6 = u6.a.f10762a
            if (r4 != r6) goto L62
            return r6
        L62:
            r5.invoke()
            p6.x r4 = p6.x.f8463a
            return r4
        L68:
            r5.invoke()
            throw r4
        L6c:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b.o(q7.s, d7.a, v6.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    public static String p() {
        String str = f3533b;
        if (str != null) {
            return str;
        }
        String lowerCase = m9.c.e().f;
        if (kotlin.jvm.internal.l.a(lowerCase, "autoDetectedLanguage")) {
            Locale localeA = m9.c.a();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) localeA.getLanguage());
            sb.append('-');
            sb.append((Object) localeA.getCountry());
            lowerCase = sb.toString().toLowerCase(localeA);
            lowerCase.getClass();
            ?? r12 = m9.c.e().f7245t;
            String lowerCase2 = ((String) q6.l.q0(m.G0(lowerCase, new String[]{"-"}))).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (!r12.contains(lowerCase)) {
                lowerCase = r12.contains(lowerCase2) ? lowerCase2 : "en";
            }
        }
        lowerCase.getClass();
        f3533b = lowerCase;
        return lowerCase;
    }

    public static final ArrayList q(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    int i6 = i + 1;
                    String strOptString = jSONArray.optString(i);
                    strOptString.getClass();
                    if (strOptString.length() <= 0) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        arrayList.add(strOptString);
                    }
                    i = i6;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static boolean s() {
        return m9.c.e().f7236k.f7184b.equals(Boolean.TRUE);
    }

    public static final void t(long j, Context context, String str) {
        context.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (a5.b.c(j) || a5.c.b(j) || a5.b.e(j)) {
            r rVarB = a5.b.b();
            if (kotlin.jvm.internal.l.a(rVarB != null ? rVarB.f11355b : null, str)) {
                a5.b.f();
            } else {
                a5.c.d();
            }
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(261);
            return;
        }
        g gVarL = g.D.l(context);
        gVarL.b();
        r rVarK = gVarL.K(str);
        if (rVarK != null) {
            if (rVarK.p()) {
                gVarL.j(rVarK);
            } else {
                Iterator it = rVarK.F.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    j0 j0Var = (j0) next;
                    j0Var.f11238o = 0L;
                    j0Var.f11241r = 0;
                    gVarL.r0(j0Var);
                }
            }
        }
        gVarL.c();
    }

    public static void u(int i, Object[] objArr) {
        for (int i6 = 0; i6 < i; i6++) {
            if (objArr[i6] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i6);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void v(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbP = x.p(i, "radix ", " was not in valid range ");
            sbP.append(new i7.d(2, 36, 1));
            throw new IllegalArgumentException(sbP.toString());
        }
    }

    public static void w(int i, boolean z9) {
        q qVar = (q) n4.h.f7966c.get(Integer.valueOf(i));
        if (qVar != null) {
            ((o7.r) qVar).Q(Boolean.valueOf(z9));
        }
    }

    public static void x(int i, boolean z9) {
        q qVar = (q) n4.h.f7967d.get(Integer.valueOf(i));
        if (qVar != null) {
            ((o7.r) qVar).Q(Boolean.valueOf(z9));
        }
    }

    public static byte[] y(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] bytes = str.getBytes(l7.a.f7151a);
        bytes.getClass();
        gZIPOutputStream.write(bytes);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        byteArray.getClass();
        return byteArray;
    }

    public static final double z(double d10, m7.c cVar, m7.c cVar2) {
        long jConvert = cVar2.f7667a.convert(1L, cVar.f7667a);
        return jConvert > 0 ? d10 * jConvert : d10 / r8.convert(1L, r9);
    }

    public i0.b r(Context context, Looper looper, v vVar, Object obj, i0.e eVar, i0.f fVar) {
        switch (this.f3534a) {
            case 0:
                return new w0.d(context, looper, vVar, (c) obj, (j0.m) eVar, (j0.m) fVar);
            case 1:
                return new f0.e(context, looper, vVar, (GoogleSignInOptions) obj, (j0.m) eVar, (j0.m) fVar);
            case 2:
                vVar.getClass();
                Integer num = (Integer) vVar.f5280p;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new h1.a(context, looper, vVar, bundle, eVar, fVar);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            default:
                j0.m mVar = (j0.m) eVar;
                j0.m mVar2 = (j0.m) fVar;
                switch (this.f3534a) {
                    case 4:
                        return new m0.c(context, looper, vVar, (k0.o) obj, mVar, mVar2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
