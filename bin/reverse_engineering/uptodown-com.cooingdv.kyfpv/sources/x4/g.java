package x4;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable {
    public static Parcelable.Creator<g> CREATOR = new i0.l(10);
    public int A;
    public boolean A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public ArrayList D0;
    public int E;
    public transient ArrayList E0;
    public String F;
    public ArrayList F0;
    public j G;
    public y1 G0;
    public int H;
    public String H0;
    public String I;
    public int I0;
    public long J;
    public String J0;
    public long K;
    public int L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public ArrayList S;
    public ArrayList T;
    public ArrayList U;
    public String V;
    public String W;
    public ArrayList X;
    public ArrayList Y;
    public f2 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11159a;
    public String a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11160b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f11161b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f11162c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f11163d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f11164e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f11165f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f11166g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f11167h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f11168i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f11169j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f11170k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11171l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f11172l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11173m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f11174m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11175n;
    public String n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11176o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f11177o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11178p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f11179p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f11180q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f11181q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11182r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f11183r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11184s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public f f11185s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f11186t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public HashMap f11187t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11188u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f11189u0;
    public String v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f11190v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11191w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f11192w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11193x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f11194x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11195y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f11196y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11197z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f11198z0;

    public g(Parcel parcel) {
        this.f11173m = -1L;
        this.J = -1L;
        this.K = -1L;
        this.f11185s0 = f.f11149o;
        this.f11187t0 = new HashMap();
        this.F0 = new ArrayList();
        this.I0 = 1;
        this.f11159a = parcel.readLong();
        this.f11160b = parcel.readString();
        this.f11171l = parcel.readString();
        this.f11173m = parcel.readLong();
        this.f11175n = parcel.readString();
        this.f11176o = parcel.readString();
        this.f11178p = parcel.readString();
        this.f11180q = parcel.readString();
        this.f11182r = parcel.readInt();
        this.f11184s = parcel.readInt();
        this.f11186t = parcel.readString();
        this.f11188u = parcel.readString();
        this.v = parcel.readString();
        this.f11191w = parcel.readString();
        this.f11193x = parcel.readString();
        this.f11195y = parcel.readInt();
        this.f11197z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readString();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.G = (j) parcel.readParcelable(j.class.getClassLoader(), j.class);
        } else {
            this.G = (j) parcel.readParcelable(j.class.getClassLoader());
        }
        this.H = parcel.readInt();
        this.I = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.J = parcel.readLong();
        this.L = parcel.readInt();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        this.S = parcel.createStringArrayList();
        this.T = parcel.createStringArrayList();
        this.U = parcel.createStringArrayList();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.O = parcel.readString();
        this.f11163d0 = parcel.readInt();
        this.f11166g0 = parcel.readString();
        HashMap hashMap = parcel.readHashMap(ClassLoader.getSystemClassLoader());
        hashMap.getClass();
        this.f11187t0 = hashMap;
        this.f11167h0 = parcel.readString();
        this.f11168i0 = parcel.readString();
        this.f11169j0 = parcel.readString();
        this.f11170k0 = parcel.readLong();
        this.f11172l0 = parcel.readString();
        this.f11177o0 = parcel.readInt();
        this.f11164e0 = parcel.readString();
        this.f11162c0 = parcel.readString();
        this.a0 = parcel.readString();
        this.f11161b0 = parcel.readString();
        this.f11174m0 = parcel.readString();
        this.n0 = parcel.readString();
        this.f11179p0 = parcel.readString();
        this.f11181q0 = parcel.readInt();
        this.f11196y0 = parcel.readInt();
        this.f11198z0 = parcel.readInt();
        this.B0 = parcel.readInt();
        this.D0 = parcel.createStringArrayList();
        this.C0 = parcel.readInt();
        this.f11189u0 = parcel.readInt();
        this.f11190v0 = parcel.readString();
        this.f11192w0 = parcel.readInt();
        parcel.readTypedList(this.F0, j0.CREATOR);
        if (i >= 34) {
            this.G0 = (y1) parcel.readParcelable(y1.class.getClassLoader(), y1.class);
        } else {
            this.G0 = (y1) parcel.readParcelable(y1.class.getClassLoader());
        }
        this.H0 = parcel.readString();
        this.I0 = parcel.readInt();
        this.J0 = parcel.readString();
    }

    public static long c(g2 g2Var) {
        JSONObject jSONObject;
        try {
            if (g2Var.b() || (jSONObject = g2Var.f11207d) == null) {
                return 0L;
            }
            int iOptInt = !jSONObject.isNull("success") ? jSONObject.optInt("success") : 0;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (iOptInt != 1 || jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("appID")) {
                return 0L;
            }
            return jSONObjectOptJSONObject.optLong("appID");
        } catch (JSONException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public final void a(Context context, JSONObject jSONObject) {
        if (jSONObject.has("app")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("app");
            if (jSONObjectOptJSONObject != null) {
                n(context, jSONObjectOptJSONObject);
            }
        } else {
            n(context, jSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("videos");
        if (jSONArrayOptJSONArray != null) {
            this.Y = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                if (jSONArrayOptJSONArray.get(i) instanceof JSONObject) {
                    Object obj = jSONArrayOptJSONArray.get(i);
                    obj.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj;
                    d3 d3Var = new d3();
                    if (!jSONObject2.isNull("youtubeID")) {
                        d3Var.f11120a = jSONObject2.optString("youtubeID");
                    }
                    if (!jSONObject2.isNull("image")) {
                        d3Var.f11121b = jSONObject2.optString("image");
                    }
                    ArrayList arrayList = this.Y;
                    arrayList.getClass();
                    arrayList.add(d3Var);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("screenshots");
        if (jSONArrayOptJSONArray2 != null) {
            this.X = new ArrayList();
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i6 = 0; i6 < length2; i6++) {
                if (jSONArrayOptJSONArray2.get(i6) instanceof JSONObject) {
                    Object obj2 = jSONArrayOptJSONArray2.get(i6);
                    obj2.getClass();
                    JSONObject jSONObject3 = (JSONObject) obj2;
                    l2 l2Var = new l2();
                    if (!jSONObject3.isNull("screenshotURL")) {
                        l2Var.f11278a = jSONObject3.optString("screenshotURL");
                    }
                    if (!jSONObject3.isNull("isVertical")) {
                        l2Var.f11281m = jSONObject3.optInt("isVertical");
                    }
                    ArrayList arrayList2 = this.X;
                    if (arrayList2 != null) {
                        arrayList2.add(l2Var);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return (kotlin.jvm.internal.l.a(this.W, "ReadingMode") || kotlin.jvm.internal.l.a(this.W, "ExternalDownload") || this.f11177o0 <= 1 || kotlin.jvm.internal.l.a(this.W, "AppNotAvailableInThisCountry") || l()) ? false : true;
    }

    public final String d() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        int i = UptodownApp.U;
        if (i <= 0) {
            return e();
        }
        return str + ":" + i + ":webp";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String e() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.L, ":webp");
    }

    public final String f() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.N, ":webp");
    }

    public final String g(int i) {
        if (this.f11188u == null) {
            return null;
        }
        return a4.x.k(this.f11188u, androidx.lifecycle.l.u(i, ":"), ":webp");
    }

    public final String h() {
        String str = this.f11188u;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.K, ":webp");
    }

    public final String i() {
        String str = this.f11188u;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.J, ":webp");
    }

    public final boolean j() {
        return this.J >= 0;
    }

    public final boolean k() {
        String str = this.W;
        return (str == null || str.equals("PreRegister") || str.equals("Discontinued") || str.equals("ExternalDownload") || str.equals("ReadingMode") || str.equals("AppNotAvailableInThisCountry")) ? false : true;
    }

    public final boolean l() {
        return kotlin.jvm.internal.l.a(this.W, "PreRegister");
    }

    public final boolean m() {
        return this.f11189u0 == 1;
    }

    public final void n(Context context, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        ArrayList arrayList;
        if (!jSONObject.isNull("appID")) {
            this.f11159a = jSONObject.optLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f11160b = jSONObject.optString("name");
        }
        if (!jSONObject.isNull("license")) {
            this.f11180q = jSONObject.optString("license");
        }
        if (!jSONObject.isNull("lastVersionCode")) {
            this.f11173m = jSONObject.optLong("lastVersionCode");
        }
        if (!jSONObject.isNull("shortDescription")) {
            this.f11176o = jSONObject.optString("shortDescription");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f11188u = jSONObject.optString("iconURL");
        } else if (!jSONObject.isNull("icon")) {
            this.f11188u = jSONObject.optString("icon");
        }
        if (!jSONObject.isNull("feature")) {
            this.v = jSONObject.optString("feature");
        } else if (!jSONObject.isNull("imageURL")) {
            this.v = jSONObject.optString("imageURL");
        }
        if (!jSONObject.isNull("author")) {
            this.f11191w = jSONObject.optString("author");
        }
        if (!jSONObject.isNull("size")) {
            this.f11178p = jSONObject.optString("size");
        }
        if (!jSONObject.isNull("downloads")) {
            this.f11182r = jSONObject.optInt("downloads");
        }
        if (!jSONObject.isNull("weeklyDownloads")) {
            this.f11184s = jSONObject.optInt("weeklyDownloads");
        }
        if (!jSONObject.isNull("lastUpdate")) {
            this.f11186t = jSONObject.optString("lastUpdate");
        }
        if (!jSONObject.isNull("urlShare")) {
            this.f11175n = jSONObject.optString("urlShare");
        } else if (!jSONObject.isNull("url")) {
            this.f11175n = jSONObject.optString("url");
        }
        if (!jSONObject.isNull("description")) {
            String strOptString = jSONObject.optString("description");
            strOptString.getClass();
            this.f11193x = l7.u.o0(strOptString, "\n", "<br />", false);
        }
        if (!jSONObject.isNull("rating")) {
            this.f11195y = jSONObject.optInt("rating");
        }
        if (!jSONObject.isNull("ratingCount")) {
            this.f11197z = jSONObject.optInt("ratingCount");
        }
        if (!jSONObject.isNull("ratingCount1")) {
            this.A = jSONObject.optInt("ratingCount1");
        }
        if (!jSONObject.isNull("ratingCount2")) {
            this.B = jSONObject.optInt("ratingCount2");
        }
        if (!jSONObject.isNull("ratingCount3")) {
            this.C = jSONObject.optInt("ratingCount3");
        }
        if (!jSONObject.isNull("ratingCount4")) {
            this.D = jSONObject.optInt("ratingCount4");
        }
        if (!jSONObject.isNull("ratingCount5")) {
            this.E = jSONObject.optInt("ratingCount5");
        }
        if (!jSONObject.isNull("packagename")) {
            this.F = jSONObject.optString("packagename");
        } else if (!jSONObject.isNull("packageName")) {
            this.F = jSONObject.optString("packageName");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("categoryData");
        if (jSONObjectOptJSONObject2 != null) {
            j jVar = new j(0, (String) null, 7);
            this.G = jVar;
            if (!jSONObjectOptJSONObject2.isNull("name")) {
                jVar.f11226b = jSONObjectOptJSONObject2.optString("name");
            }
            if (!jSONObjectOptJSONObject2.isNull("id")) {
                jVar.f11225a = jSONObjectOptJSONObject2.optInt("id");
            }
            if (!jSONObjectOptJSONObject2.isNull("isGame")) {
                jVar.f11231p = jSONObjectOptJSONObject2.optInt("isGame");
            }
        }
        if (!jSONObject.isNull("permissionCount")) {
            this.H = jSONObject.optInt("permissionCount");
        }
        if (!jSONObject.isNull("md5Signature")) {
            this.M = jSONObject.optString("md5Signature");
        }
        if (!jSONObject.isNull("activeADEX")) {
            this.L = jSONObject.optInt("activeADEX");
        }
        if (!jSONObject.isNull("pegi")) {
            this.O = jSONObject.optString("pegi");
        }
        if (!jSONObject.isNull("technicalData")) {
            this.Q = jSONObject.optString("technicalData");
        }
        if (!jSONObject.isNull("versionRequired")) {
            this.R = jSONObject.optString("versionRequired");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("compatibleFile");
        if (jSONObjectOptJSONObject3 != null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("densities");
            if (jSONArrayOptJSONArray != null) {
                this.S = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    ArrayList arrayList2 = this.S;
                    if (arrayList2 != null) {
                        arrayList2.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("abis");
            if (jSONArrayOptJSONArray2 != null) {
                this.T = new ArrayList();
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i6 = 0; i6 < length2; i6++) {
                    ArrayList arrayList3 = this.T;
                    if (arrayList3 != null) {
                        arrayList3.add(jSONArrayOptJSONArray2.optString(i6));
                    }
                }
            }
            if (!jSONObjectOptJSONObject3.isNull("fileID")) {
                this.J = jSONObjectOptJSONObject3.optLong("fileID");
            }
            if (!jSONObjectOptJSONObject3.isNull("minSDK")) {
                this.I = jSONObjectOptJSONObject3.optString("minSDK");
            }
            if (!jSONObjectOptJSONObject3.isNull("fileType")) {
                this.H0 = jSONObjectOptJSONObject3.optString("fileType");
            }
            if (!jSONObjectOptJSONObject3.isNull("version")) {
                this.f11171l = jSONObjectOptJSONObject3.optString("version");
            }
            if (!jSONObjectOptJSONObject3.isNull("versionCode")) {
                this.K = jSONObjectOptJSONObject3.optLong("versionCode");
            }
            if (!jSONObjectOptJSONObject3.isNull("sha256")) {
                this.P = jSONObjectOptJSONObject3.optString("sha256");
            }
            if (!jSONObjectOptJSONObject3.isNull("url_apk")) {
                this.N = jSONObjectOptJSONObject3.optString("url_apk");
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject3.optJSONArray("requiredFeatures");
            if (jSONArrayOptJSONArray3 != null) {
                this.U = new ArrayList();
                int length3 = jSONArrayOptJSONArray3.length();
                int i10 = 0;
                while (true) {
                    arrayList = this.U;
                    if (i10 >= length3) {
                        break;
                    }
                    if (arrayList != null) {
                        arrayList.add(jSONArrayOptJSONArray3.optString(i10));
                    }
                    i10++;
                }
                arrayList.getClass();
                if (!arrayList.isEmpty() && context != null) {
                    ArrayList arrayList4 = this.U;
                    arrayList4.getClass();
                    ArrayList arrayListC = p.c(context, arrayList4);
                    if (!arrayListC.isEmpty()) {
                        Iterator it = arrayListC.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putInt("update", 0);
                            bundle.putString("feature", (String) next);
                            new android.support.v4.media.g(context, 20).E(bundle, "required_features_not_supported");
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray("containedFiles");
            if (jSONArrayOptJSONArray4 != null) {
                this.F0 = new ArrayList();
                int length4 = jSONArrayOptJSONArray4.length();
                for (int i11 = 0; i11 < length4; i11++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray4.getJSONObject(i11);
                    jSONObject2.getClass();
                    j0 j0Var = new j0();
                    if (!jSONObject2.isNull("fileID")) {
                        j0Var.f11236l = jSONObject2.optLong("fileID");
                    }
                    if (!jSONObject2.isNull(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                        j0Var.f11237m = jSONObject2.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                    }
                    if (!jSONObject2.isNull("size")) {
                        j0Var.f11238n = jSONObject2.optLong("size");
                    }
                    if (!jSONObject2.isNull("sha256")) {
                        j0Var.f11240p = jSONObject2.optString("sha256");
                    }
                    this.F0.add(j0Var);
                }
            }
        }
        if (!jSONObject.isNull("website")) {
            this.V = jSONObject.optString("website");
        }
        if (!jSONObject.isNull("downloadStatus")) {
            String strOptString2 = jSONObject.optString("downloadStatus");
            this.W = strOptString2;
            if (l7.u.m0(strOptString2, "PreRegister", false) && (jSONObjectOptJSONObject = jSONObject.optJSONObject("preRegister")) != null) {
                if (!jSONObjectOptJSONObject.isNull("date")) {
                    this.a0 = jSONObjectOptJSONObject.optString("date");
                }
                if (!jSONObjectOptJSONObject.isNull("countPreRegistered")) {
                    this.f11161b0 = jSONObjectOptJSONObject.optString("countPreRegistered");
                }
            }
        }
        if (!jSONObject.isNull("newFeatures")) {
            this.f11162c0 = jSONObject.optString("newFeatures");
        }
        if (!jSONObject.isNull("onBoard")) {
            this.f11163d0 = jSONObject.optInt("onBoard");
        }
        if (!jSONObject.isNull("responsibilities")) {
            this.f11164e0 = jSONObject.optString("responsibilities");
        }
        if (!jSONObject.isNull(TypedValues.CycleType.S_WAVE_PHASE)) {
            this.f11165f0 = jSONObject.optString(TypedValues.CycleType.S_WAVE_PHASE);
        }
        if (!jSONObject.isNull("deviceType")) {
            this.f11166g0 = jSONObject.optString("deviceType");
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("translations");
        if (jSONObjectOptJSONObject4 != null) {
            this.f11187t0 = new HashMap();
            if (!jSONObjectOptJSONObject4.isNull("try")) {
                HashMap map = this.f11187t0;
                map.getClass();
                map.put("try", jSONObjectOptJSONObject4.optString("try"));
            }
            if (!jSONObjectOptJSONObject4.isNull("supportedDevice")) {
                HashMap map2 = this.f11187t0;
                map2.getClass();
                map2.put("supportedDevice", jSONObjectOptJSONObject4.optString("supportedDevice"));
            }
        }
        if (!jSONObject.isNull("readingModeText")) {
            this.f11167h0 = jSONObject.optString("readingModeText");
        }
        if (!jSONObject.isNull("externalDownloadURL")) {
            this.f11168i0 = jSONObject.optString("externalDownloadURL");
        }
        if (!jSONObject.isNull("externalDownloadText")) {
            this.f11169j0 = jSONObject.optString("externalDownloadText");
        }
        if (!jSONObject.isNull("organizationID")) {
            this.f11170k0 = jSONObject.optLong("organizationID");
        }
        if (!jSONObject.isNull("editorNameNew")) {
            this.f11172l0 = jSONObject.optString("editorNameNew");
        }
        if (!jSONObject.isNull("editorAvatar")) {
            this.f11174m0 = jSONObject.optString("editorAvatar");
        }
        if (!jSONObject.isNull("showReviewedBy")) {
            this.f11181q0 = jSONObject.optInt("showReviewedBy");
        }
        if (!jSONObject.isNull("editorJobTitle")) {
            this.n0 = jSONObject.optString("editorJobTitle");
        }
        if (!jSONObject.isNull("totalVersions")) {
            this.f11177o0 = jSONObject.optInt("totalVersions");
        }
        if (!jSONObject.isNull("disclaimerText")) {
            this.f11179p0 = jSONObject.optString("disclaimerText");
        }
        if (!jSONObject.isNull("tagID")) {
            int iOptInt = jSONObject.optInt("tagID");
            if (iOptInt == 0) {
                this.f11185s0 = f.f11149o;
            } else if (iOptInt == 1) {
                this.f11185s0 = f.f11148n;
            } else if (iOptInt == 2) {
                this.f11185s0 = f.f11146l;
            } else if (iOptInt == 3) {
                this.f11185s0 = f.f11144a;
            } else if (iOptInt == 4) {
                this.f11185s0 = f.f11145b;
            } else if (iOptInt == 5) {
                this.f11185s0 = f.f11147m;
            }
            if (!jSONObject.isNull("tag")) {
                this.f11183r0 = jSONObject.optString("tag");
            }
        }
        if (!jSONObject.isNull("promoted")) {
            this.f11189u0 = jSONObject.optInt("promoted");
        }
        if (this.f11189u0 == 1 && !jSONObject.isNull("positionPromoted")) {
            this.f11192w0 = jSONObject.optInt("positionPromoted");
        }
        if (!jSONObject.isNull("containsAds")) {
            this.f11196y0 = jSONObject.optInt("containsAds");
        }
        if (!jSONObject.isNull("hasAlternatives")) {
            if (jSONObject.optBoolean("hasAlternatives")) {
                this.f11198z0 = 1;
            } else {
                this.f11198z0 = 0;
            }
        }
        if (!jSONObject.isNull("wishlist")) {
            this.B0 = jSONObject.optInt("wishlist");
        }
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("userSays");
        if (jSONArrayOptJSONArray5 != null) {
            this.D0 = new ArrayList();
            int length5 = jSONArrayOptJSONArray5.length();
            for (int i12 = 0; i12 < length5; i12++) {
                ArrayList arrayList5 = this.D0;
                arrayList5.getClass();
                arrayList5.add(jSONArrayOptJSONArray5.getString(i12));
            }
        }
        if (!jSONObject.isNull("recommended-apps")) {
            this.C0 = jSONObject.optInt("recommended-apps");
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("ranking");
        if (jSONObjectOptJSONObject5 != null) {
            y1 y1Var = new y1();
            if (!jSONObjectOptJSONObject5.isNull("text")) {
                y1Var.f11468a = jSONObjectOptJSONObject5.optString("text");
            }
            if (!jSONObjectOptJSONObject5.isNull("floatingCategoryID")) {
                y1Var.f11469b = jSONObjectOptJSONObject5.optInt("floatingCategoryID");
            }
            if (!jSONObjectOptJSONObject5.isNull("categoryID")) {
                y1Var.f11470l = jSONObjectOptJSONObject5.optInt("categoryID");
            }
            if (!jSONObjectOptJSONObject5.isNull("name")) {
                y1Var.f11471m = jSONObjectOptJSONObject5.optString("name");
            }
            if (!jSONObjectOptJSONObject5.isNull("parentCategoryID")) {
                y1Var.f11472n = jSONObjectOptJSONObject5.optInt("parentCategoryID");
            }
            this.G0 = y1Var;
        }
        if (!jSONObject.isNull("ads")) {
            if (jSONObject.optBoolean("ads")) {
                this.I0 = 1;
            } else {
                this.I0 = 0;
            }
        }
        if (jSONObject.isNull("isForYouIf")) {
            return;
        }
        this.J0 = jSONObject.optString("isForYouIf");
    }

    public final String toString() {
        long j = this.f11159a;
        String str = this.f11160b;
        String str2 = this.f11171l;
        long j6 = this.f11173m;
        String str3 = this.f11175n;
        String str4 = this.f11176o;
        String str5 = this.f11178p;
        String str6 = this.f11180q;
        int i = this.f11182r;
        int i6 = this.f11184s;
        String str7 = this.f11186t;
        String str8 = this.f11188u;
        String str9 = this.v;
        String str10 = this.f11191w;
        String str11 = this.f11193x;
        int i10 = this.f11195y;
        int i11 = this.f11197z;
        int i12 = this.A;
        int i13 = this.B;
        int i14 = this.C;
        int i15 = this.D;
        int i16 = this.E;
        String str12 = this.F;
        ArrayList arrayList = this.X;
        j jVar = this.G;
        int i17 = this.H;
        String str13 = this.I;
        String str14 = this.H0;
        String str15 = this.M;
        String str16 = this.N;
        long j10 = this.J;
        ArrayList arrayList2 = this.E0;
        int i18 = this.L;
        String str17 = this.P;
        String str18 = this.Q;
        String str19 = this.R;
        String str20 = this.V;
        String str21 = this.W;
        int i19 = this.f11163d0;
        String str22 = this.f11164e0;
        String str23 = this.f11165f0;
        String str24 = this.f11167h0;
        String str25 = this.f11168i0;
        String str26 = this.f11162c0;
        String str27 = this.a0;
        String str28 = this.f11161b0;
        String str29 = this.f11174m0;
        String str30 = this.n0;
        int i20 = this.f11181q0;
        int i21 = this.f11196y0;
        int i22 = this.f11198z0;
        int i23 = this.B0;
        String str31 = this.f11166g0;
        HashMap map = this.f11187t0;
        ArrayList arrayList3 = this.S;
        ArrayList arrayList4 = this.T;
        ArrayList arrayList5 = this.U;
        String str32 = this.O;
        String str33 = this.f11169j0;
        long j11 = this.f11170k0;
        String str34 = this.f11172l0;
        int i24 = this.f11177o0;
        String str35 = this.f11179p0;
        int i25 = this.f11189u0;
        int i26 = this.I0;
        String str36 = this.f11190v0;
        String str37 = this.J0;
        StringBuilder sb = new StringBuilder("AppInfo(appID=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        sb.append(", versionName=");
        sb.append(str2);
        sb.append(", lastVersionCode=");
        sb.append(j6);
        sb.append(", urlShare=");
        sb.append(str3);
        a4.x.B(sb, ", shortDescription=", str4, ", size=", str5);
        sb.append(", license=");
        sb.append(str6);
        sb.append(", downloads=");
        sb.append(i);
        sb.append(", weeklyDownloads=");
        sb.append(i6);
        sb.append(", lastUpdate=");
        sb.append(str7);
        a4.x.B(sb, ", icon=", str8, ", feature=", str9);
        a4.x.B(sb, ", author=", str10, ", description=", str11);
        sb.append(", rating=");
        sb.append(i10);
        sb.append(", ratingCount=");
        sb.append(i11);
        sb.append(", ratingCount1=");
        sb.append(i12);
        sb.append(", ratingCount2=");
        sb.append(i13);
        sb.append(", ratingCount3=");
        sb.append(i14);
        sb.append(", ratingCount4=");
        sb.append(i15);
        sb.append(", ratingCount5=");
        sb.append(i16);
        sb.append(", packagename=");
        sb.append(str12);
        sb.append(", screenShots=");
        sb.append(arrayList);
        sb.append(", category=");
        sb.append(jVar);
        sb.append(", permissionCount=");
        sb.append(i17);
        sb.append(", minsdk=");
        sb.append(str13);
        a4.x.B(sb, ", fileType=", str14, ", md5signature=", str15);
        sb.append(", downloadUrl=");
        sb.append(str16);
        sb.append(", fileID=");
        sb.append(j10);
        sb.append(", oldVersions=");
        sb.append(arrayList2);
        sb.append(", activeADEX=");
        sb.append(i18);
        sb.append(", sha256=");
        sb.append(str17);
        a4.x.B(sb, ", technicalData=", str18, ", versionRequired=", str19);
        a4.x.B(sb, ", webAuthor=", str20, ", downloadStatus=", str21);
        sb.append(", devOnBoard=");
        sb.append(i19);
        sb.append(", responsibilities=");
        sb.append(str22);
        a4.x.B(sb, ", phase=", str23, ", readingModeText=", str24);
        a4.x.B(sb, ", externalDownloadUrl=", str25, ", newFeatures=", str26);
        a4.x.B(sb, ", preRegisterDate=", str27, ", preRegistersCount=", str28);
        a4.x.B(sb, ", editorAvatar=", str29, ", editorJobTitle=", str30);
        sb.append(", showReviewedBy=");
        sb.append(i20);
        sb.append(", containAds=");
        sb.append(i21);
        sb.append(", hasAlternatives=");
        sb.append(i22);
        sb.append(", wishlist=");
        sb.append(i23);
        sb.append(", deviceType=");
        sb.append(str31);
        sb.append(", translations=");
        sb.append(map);
        sb.append(", supportedDensities=");
        sb.append(arrayList3);
        sb.append(", supportedAbis=");
        sb.append(arrayList4);
        sb.append(", requiredFeatures=");
        sb.append(arrayList5);
        sb.append(", pegi=");
        sb.append(str32);
        sb.append(", externalDownloadText=");
        sb.append(str33);
        sb.append(", organizationID=");
        sb.append(j11);
        sb.append(", editorName=");
        sb.append(str34);
        sb.append(", totalVersions=");
        sb.append(i24);
        sb.append(", disclaimerText=");
        sb.append(str35);
        sb.append(", promoted=");
        sb.append(i25);
        sb.append(", showAds=");
        sb.append(i26);
        a4.x.B(sb, ", promotedFrom=", str36, ", isForYouIf=", str37);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11159a);
        parcel.writeString(this.f11160b);
        parcel.writeString(this.f11171l);
        parcel.writeLong(this.f11173m);
        parcel.writeString(this.f11175n);
        parcel.writeString(this.f11176o);
        parcel.writeString(this.f11178p);
        parcel.writeString(this.f11180q);
        parcel.writeInt(this.f11182r);
        parcel.writeInt(this.f11184s);
        parcel.writeString(this.f11186t);
        parcel.writeString(this.f11188u);
        parcel.writeString(this.v);
        parcel.writeString(this.f11191w);
        parcel.writeString(this.f11193x);
        parcel.writeInt(this.f11195y);
        parcel.writeInt(this.f11197z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeParcelable(this.G, i);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeLong(this.J);
        parcel.writeInt(this.L);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeStringList(this.S);
        parcel.writeStringList(this.T);
        parcel.writeStringList(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeString(this.O);
        parcel.writeInt(this.f11163d0);
        parcel.writeString(this.f11166g0);
        parcel.writeMap(this.f11187t0);
        parcel.writeString(this.f11167h0);
        parcel.writeString(this.f11168i0);
        parcel.writeString(this.f11169j0);
        parcel.writeLong(this.f11170k0);
        parcel.writeString(this.f11172l0);
        parcel.writeInt(this.f11177o0);
        parcel.writeString(this.f11164e0);
        parcel.writeString(this.f11162c0);
        parcel.writeString(this.a0);
        parcel.writeString(this.f11161b0);
        parcel.writeString(this.f11174m0);
        parcel.writeString(this.n0);
        parcel.writeString(this.f11179p0);
        parcel.writeInt(this.f11181q0);
        parcel.writeInt(this.f11196y0);
        parcel.writeInt(this.f11198z0);
        parcel.writeInt(this.B0);
        parcel.writeStringList(this.D0);
        parcel.writeInt(this.C0);
        parcel.writeInt(this.f11189u0);
        parcel.writeString(this.f11190v0);
        parcel.writeInt(this.f11192w0);
        parcel.writeTypedList(this.F0);
        parcel.writeParcelable(this.G0, i);
        parcel.writeString(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeString(this.J0);
    }

    public g() {
        this.f11173m = -1L;
        this.J = -1L;
        this.K = -1L;
        this.f11185s0 = f.f11149o;
        this.f11187t0 = new HashMap();
        this.F0 = new ArrayList();
        this.I0 = 1;
    }
}
