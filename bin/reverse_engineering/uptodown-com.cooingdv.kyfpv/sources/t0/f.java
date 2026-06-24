package t0;

import a4.x;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.sqlite.SQLiteStatement;
import b2.t1;
import c4.w6;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.t;
import com.inmobi.cmp.model.ChoiceError;
import com.uptodown.R;
import d7.p;
import d8.m0;
import g4.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.l;
import o7.c0;
import o7.u;
import org.json.JSONArray;
import org.json.JSONObject;
import s1.o;
import t7.r;
import x4.n2;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f9499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f9500b;

    public static boolean A() {
        HashSet<String> hashSet = new HashSet();
        try {
            i5.C("Checking for Root access");
            o4.a aVar = new o4.a(new String[]{"id"}, hashSet);
            q4.c cVarE = q4.c.e(0);
            if (cVarE.j) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("Unable to add commands to a closed shell");
            } else if (aVar.f8166d) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("This command has already been executed. (Don't re-use command instances.)");
            } else {
                while (cVarE.f8695r) {
                }
                cVarE.i.add(aVar);
                new c0.c(cVarE, 1).start();
            }
            i5.j(q4.c.e(0), aVar);
        } catch (Exception unused) {
        }
        for (String str : hashSet) {
            i5.C(str);
            if (str.toLowerCase().contains("uid=0")) {
                i5.C("Access Given");
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean B(String str) {
        return (str.equals(ShareTarget.METHOD_GET) || str.equals("HEAD")) ? false : true;
    }

    public static boolean C(Parcel parcel, int i) {
        P(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder D(Parcel parcel, int i) {
        int iG = G(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iG);
        return strongBinder;
    }

    public static int E(Parcel parcel, int i) {
        P(parcel, i, 4);
        return parcel.readInt();
    }

    public static long F(Parcel parcel, int i) {
        P(parcel, i, 8);
        return parcel.readLong();
    }

    public static int G(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void H(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + G(parcel, i));
    }

    public static void I(ProgressBar progressBar, ImageView imageView) {
        progressBar.getClass();
        imageView.getClass();
        if (progressBar.getVisibility() == 8) {
            progressBar.setVisibility(0);
            progressBar.getContext().getClass();
            k kVar = new k(18);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.6f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new n5.h(imageView, 1));
            valueAnimatorOfFloat.addListener(new n5.i(1, kVar));
            valueAnimatorOfFloat.start();
        }
    }

    public static final Object J(r rVar, r rVar2, p pVar) throws Throwable {
        Object uVar;
        Object objR;
        try {
            if (pVar instanceof v6.a) {
                a0.b(2, pVar);
                uVar = pVar.invoke(rVar2, rVar);
            } else {
                uVar = d0.b.Q(pVar, rVar2, rVar);
            }
        } catch (Throwable th) {
            uVar = new u(false, th);
        }
        u6.a aVar = u6.a.f10763a;
        if (uVar == aVar || (objR = rVar.R(uVar)) == c0.f8248e) {
            return aVar;
        }
        if (objR instanceof u) {
            throw ((u) objR).f8316a;
        }
        return c0.A(objR);
    }

    public static i7.d K(int i, int i6) {
        if (i6 > Integer.MIN_VALUE) {
            return new i7.d(i, i6 - 1, 1);
        }
        i7.d dVar = i7.d.f5703m;
        return i7.d.f5703m;
    }

    public static int L(Parcel parcel) {
        int i = parcel.readInt();
        int iG = G(parcel, i);
        char c9 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c9 != 20293) {
            throw new l0.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i6 = iG + iDataPosition;
        if (i6 >= iDataPosition && i6 <= parcel.dataSize()) {
            return i6;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i6).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i6);
        throw new l0.b(sb.toString(), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader M() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.f.M():java.lang.ClassLoader");
    }

    public static String N(a5 a5Var) {
        StringBuilder sb = new StringBuilder(a5Var.d());
        for (int i = 0; i < a5Var.d(); i++) {
            byte b7 = a5Var.b(i);
            if (b7 == 34) {
                sb.append("\\\"");
            } else if (b7 == 39) {
                sb.append("\\'");
            } else if (b7 != 92) {
                switch (b7) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b7 < 32 || b7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b7 >>> 6) & 3) + 48));
                            sb.append((char) (((b7 >>> 3) & 7) + 48));
                            sb.append((char) ((b7 & 7) + 48));
                        } else {
                            sb.append((char) b7);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void O(int i, Object[] objArr) {
        for (int i6 = 0; i6 < i; i6++) {
            if (objArr[i6] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 9);
                sb.append("at index ");
                sb.append(i6);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void P(Parcel parcel, int i, int i6) {
        int iG = G(parcel, i);
        if (iG == i6) {
            return;
        }
        String hexString = Integer.toHexString(iG);
        int length = String.valueOf(i6).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iG).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i6);
        sb.append(" got ");
        sb.append(iG);
        throw new l0.b(x.o(sb, " (0x", hexString, ")"), parcel);
    }

    public static n Q(com.google.android.gms.internal.measurement.d dVar, s sVar, ArrayList arrayList, boolean z9) {
        n nVarA;
        t1.U("reduce", 1, arrayList);
        t1.V(2, "reduce", arrayList);
        n nVarC = ((t) sVar.f11757l).c(sVar, (n) arrayList.get(0));
        if (!(nVarC instanceof com.google.android.gms.internal.measurement.h)) {
            com.google.gson.internal.a.p("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            nVarA = ((t) sVar.f11757l).c(sVar, (n) arrayList.get(1));
            if (nVarA instanceof com.google.android.gms.internal.measurement.f) {
                com.google.gson.internal.a.p("Failed to parse initial value");
                return null;
            }
        } else {
            if (dVar.o() == 0) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("Empty array with no initial value error");
                return null;
            }
            nVarA = null;
        }
        com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) nVarC;
        int iO = dVar.o();
        int i = z9 ? 0 : iO - 1;
        int i6 = z9 ? iO - 1 : 0;
        int i10 = true == z9 ? 1 : -1;
        if (nVarA == null) {
            nVarA = dVar.p(i);
            i += i10;
        }
        while ((i6 - i) * i10 >= 0) {
            if (dVar.r(i)) {
                nVarA = hVar.a(sVar, Arrays.asList(nVarA, dVar.p(i), new com.google.android.gms.internal.measurement.g(Double.valueOf(i)), dVar));
                if (nVarA instanceof com.google.android.gms.internal.measurement.f) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("Reduce operation failed");
                    return null;
                }
                i += i10;
            } else {
                i += i10;
            }
        }
        return nVarA;
    }

    public static void R(Parcel parcel, int i, int i6) {
        if (i == i6) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i6).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i6);
        sb.append(" got ");
        sb.append(i);
        throw new l0.b(x.o(sb, " (0x", hexString, ")"), parcel);
    }

    public static com.google.android.gms.internal.measurement.d S(com.google.android.gms.internal.measurement.d dVar, s sVar, m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator itN = dVar.n();
        while (itN.hasNext()) {
            int iIntValue = ((Integer) itN.next()).intValue();
            if (dVar.r(iIntValue)) {
                n nVarA = mVar.a(sVar, Arrays.asList(dVar.p(iIntValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(iIntValue)), dVar));
                if (nVarA.e().equals(bool)) {
                    break;
                }
                if (bool2 == null || nVarA.e().equals(bool2)) {
                    dVar2.q(iIntValue, nVarA);
                }
            }
        }
        return dVar2;
    }

    public static long a(int i, String str) throws w5.e {
        long j;
        if (i != str.length()) {
            throw new w5.e(l.g(": invalid bit length", "h.b"));
        }
        if (i != str.length()) {
            a.a.h(null, ChoiceError.ENCODE_INVALID_BIT_LENGTH.getMessage(), null, 5);
            j = -1;
        } else {
            d0.b.v(2);
            j = Long.parseLong(str, 2);
        }
        return j * ((long) 100);
    }

    public static void b(FragmentActivity fragmentActivity, d7.a aVar) {
        View viewInflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.item_opt_out_confirmation, (ViewGroup) null);
        Button button = (Button) viewInflate.findViewById(R.id.btn_opt_out_confirmation_ok);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_opt_out_confirmation_message);
        h9.d dVar = m9.c.f7861d;
        if (dVar != null) {
            Integer num = dVar.g;
            if (num != null) {
                viewInflate.setBackgroundColor(num.intValue());
            }
            Integer num2 = dVar.i;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            }
            Integer num3 = dVar.f5503m;
            if (num3 != null) {
                button.setTextColor(num3.intValue());
            }
        }
        t1.f(o6.e.f8228d, textView);
        t1.f(o6.e.f8229e, button);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(fragmentActivity).setView(viewInflate).setCancelable(false).create();
        button.setOnClickListener(new b0(alertDialogCreate, aVar));
        alertDialogCreate.show();
    }

    public static final boolean c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (l.c(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static int d(int i, int i6) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i6 << 24);
    }

    public static Context e(Context context) {
        context.getClass();
        String string = null;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains("language")) {
                string = sharedPreferences.getString("language", null);
            }
        } catch (Exception unused) {
        }
        if (string == null) {
            return context;
        }
        Locale locale = new Locale(string);
        int i = n4.a.f7938a;
        return j4.b(context, locale);
    }

    public static void f(Context context, String str) {
        context.getClass();
        File file = new File(context.getExternalFilesDir(null), "tmp");
        if (!file.exists()) {
            file.mkdirs();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < fileArrListFiles.length)) {
                return;
            }
            int i6 = i + 1;
            try {
                File file2 = fileArrListFiles[i];
                if (!l7.u.m0(file2.getAbsolutePath(), str, true) && file2.lastModified() < System.currentTimeMillis() - ((long) 3600000)) {
                    i5.l(file2);
                }
                i = i6;
            } catch (ArrayIndexOutOfBoundsException e10) {
                androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(SQLiteStatement sQLiteStatement, Throwable th) throws Exception {
        if (sQLiteStatement != 0) {
            if (th != null) {
                try {
                    androidx.lifecycle.l.B(sQLiteStatement);
                    return;
                } catch (Throwable th2) {
                    p6.a.a(th, th2);
                    return;
                }
            }
            if (sQLiteStatement instanceof AutoCloseable) {
                sQLiteStatement.close();
                return;
            }
            if (sQLiteStatement instanceof ExecutorService) {
                androidx.core.provider.b.d((ExecutorService) sQLiteStatement);
                return;
            }
            if (sQLiteStatement instanceof TypedArray) {
                ((TypedArray) sQLiteStatement).recycle();
                return;
            }
            if (sQLiteStatement instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) sQLiteStatement).release();
                return;
            }
            if (sQLiteStatement instanceof MediaDrm) {
                ((MediaDrm) sQLiteStatement).release();
                return;
            }
            if (sQLiteStatement instanceof DrmManagerClient) {
                ((DrmManagerClient) sQLiteStatement).release();
            } else if (sQLiteStatement instanceof ContentProviderClient) {
                ((ContentProviderClient) sQLiteStatement).release();
            } else {
                o.n();
            }
        }
    }

    public static void h(Context context, EditText editText) {
        Object systemService = context.getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static float i(float f, float f10, float f11) {
        if (f10 <= f11) {
            return f < f10 ? f10 : f > f11 ? f11 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int j(int i, int i6, int i10) {
        if (i6 <= i10) {
            return i < i6 ? i6 : i > i10 ? i10 : i;
        }
        com.google.gson.internal.a.j("Cannot coerce value to an empty range: maximum ", i10, " is less than minimum ", i6, 46);
        return 0;
    }

    public static long k(long j, long j6, long j10) {
        if (j6 <= j10) {
            return j < j6 ? j6 : j > j10 ? j10 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j6 + '.');
    }

    public static int l(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void m(int i, int i6) {
        if (i <= i6) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i6 + ").");
    }

    public static Bundle n(Parcel parcel, int i) {
        int iG = G(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iG);
        return bundle;
    }

    public static Parcelable o(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = G(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG);
        return parcelable;
    }

    public static String p(Parcel parcel, int i) {
        int iG = G(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iG);
        return string;
    }

    public static Object[] q(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = G(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iG);
        return objArrCreateTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = G(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iG);
        return arrayListCreateTypedArrayList;
    }

    public static void s(ProgressBar progressBar, ImageView imageView) {
        progressBar.getClass();
        imageView.getClass();
        if (progressBar.getVisibility() == 0) {
            progressBar.getContext().getClass();
            w6 w6Var = new w6(progressBar, 20);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
            valueAnimatorOfFloat.setStartDelay(200L);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new n5.h(imageView, 0));
            valueAnimatorOfFloat.addListener(new n5.i(0, w6Var));
            valueAnimatorOfFloat.start();
        }
    }

    public static void t(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new l0.b(sb.toString(), parcel);
    }

    public static final w6.b u(Enum[] enumArr) {
        enumArr.getClass();
        return new w6.b(enumArr);
    }

    public static n2 v(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("title");
        String str = strOptString.length() == 0 ? null : strOptString;
        String strOptString2 = jSONObject.optString("body");
        String str2 = strOptString2.length() == 0 ? null : strOptString2;
        String strOptString3 = jSONObject.optString("url");
        String str3 = strOptString3.length() == 0 ? null : strOptString3;
        String strOptString4 = jSONObject.optString("actionButtonText");
        return new n2(0L, str, str2, str3, strOptString4.length() == 0 ? null : strOptString4);
    }

    public static ArrayList w(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                int iOptInt = jSONObjectOptJSONObject.optInt("id");
                x4.j jVar = new x4.j(0, (String) null, 7);
                jVar.a(jSONObjectOptJSONObject, iOptInt);
                if (iOptInt == 831) {
                    jVar.f11232q = new ArrayList();
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("children");
                    if (jSONArrayOptJSONArray2 != null) {
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i6 = 0; i6 < length2; i6++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i6);
                            x4.j jVar2 = new x4.j(0, (String) null, 7);
                            jSONObjectOptJSONObject2.getClass();
                            jVar2.a(jSONObjectOptJSONObject2, iOptInt);
                            ArrayList arrayList2 = jVar.f11232q;
                            arrayList2.getClass();
                            arrayList2.add(jVar2);
                        }
                    }
                }
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static ArrayList x(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                x4.j jVar = new x4.j(0, (String) null, 7);
                jSONObjectOptJSONObject.getClass();
                if (!jSONObjectOptJSONObject.isNull("id")) {
                    jVar.f11225a = jSONObjectOptJSONObject.optInt("id");
                }
                if (!jSONObjectOptJSONObject.isNull("name")) {
                    jVar.f11226b = jSONObjectOptJSONObject.optString("name");
                }
                if (!jSONObjectOptJSONObject.isNull(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                    if (l.a(jSONObjectOptJSONObject.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY), "floatingCategory")) {
                        jVar.f11228m = true;
                    } else {
                        jVar.f11229n = true;
                    }
                }
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static final z7.b y(z7.b bVar) {
        bVar.getClass();
        return bVar.getDescriptor().c() ? bVar : new m0(bVar);
    }

    public static boolean z(String str) {
        return str.equals(ShareTarget.METHOD_POST) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }
}
