package a;

import a4.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.storage.StorageManager;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.HtmlCompat;
import b2.t1;
import b8.b;
import b8.e;
import c4.j1;
import com.inmobi.cmp.core.model.Vector;
import d7.p;
import d8.w0;
import e1.c0;
import g4.z;
import j5.g;
import j7.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l4.o;
import l7.k;
import l7.m;
import l7.u;
import m8.q;
import n4.i;
import org.json.JSONArray;
import org.json.JSONObject;
import t6.f;
import t6.h;
import x4.g2;
import x4.j;
import x4.j0;
import x4.n;
import x4.o2;
import x4.p2;
import x4.q2;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f0a = true;

    public static final c A(e eVar) {
        eVar.getClass();
        if (eVar instanceof b) {
            return ((b) eVar).f1104b;
        }
        if (eVar instanceof w0) {
            return A(((w0) eVar).f3719a);
        }
        return null;
    }

    public static ArrayList B(String str) {
        File[] fileArrListFiles;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        File file = new File(x.k(Environment.getExternalStorageDirectory().getAbsolutePath(), "/Android/Obb/", str));
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            int i = 0;
            while (i < fileArrListFiles.length) {
                int i6 = i + 1;
                try {
                    File file2 = fileArrListFiles[i];
                    if (file2.isFile()) {
                        String name = file2.getName();
                        name.getClass();
                        if (u.k0(name, ".obb", false)) {
                            arrayList.add(file2);
                        }
                    }
                    i = i6;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                    return null;
                }
            }
        }
        return arrayList;
    }

    public static String C(String str) {
        int iA0;
        str.getClass();
        if (!u.p0(str, "uptodown-", false) || m.G0(str, new String[]{"-"}).size() != 2) {
            return null;
        }
        int iY0 = m.y0(str, " ", 0, false, 6);
        if (iY0 > 0) {
            str = str.substring(0, iY0).concat(".apk");
        }
        if (m.q0(str, "(", false) && u.k0(str, ").apk", true)) {
            return str.substring(0, m.y0(str, "(", 0, false, 6)).substring(9);
        }
        if (u.k0(str, ".apk", true) && (iA0 = m.A0(".apk", str, 6)) > 0 && str.length() == iA0 + 4) {
            return str.substring(0, iA0).substring(9);
        }
        return null;
    }

    public static String D(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static ArrayList E(Context context) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (externalStoragePublicDirectory.exists() && externalStoragePublicDirectory.canRead() && externalStoragePublicDirectory.isDirectory()) {
            Iterator it = c0.m(context, externalStoragePublicDirectory).iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                File file = (File) next;
                String name = file.getName();
                name.getClass();
                if (u.k0(name, ".apk", true)) {
                    packageManager.getClass();
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    PackageInfo packageInfoD = i.d(packageManager, absolutePath, 128);
                    if (packageInfoD != null && packageInfoD.packageName.equals("com.uptodown")) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return arrayList;
    }

    public static long F(Context context, File file) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        g gVarL = g.D.l(context);
        gVarL.b();
        Iterator it = gVarL.P().iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            r rVar = (r) next;
            if (rVar.m()) {
                arrayList.add(rVar);
            }
        }
        gVarL.c();
        int size = arrayList.size();
        long jK = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jK += ((r) obj).k();
        }
        return file.getUsableSpace() - jK;
    }

    public static ArrayList G(Context context) {
        Object objInvoke;
        context.getClass();
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getSystemService("storage");
        systemService.getClass();
        StorageManager storageManager = (StorageManager) systemService;
        try {
            Method method = StorageManager.class.getMethod("getVolumeList", (Class[]) Arrays.copyOf(new Class[0], 0));
            method.setAccessible(true);
            Object objInvoke2 = method.invoke(storageManager, Arrays.copyOf(new Object[0], 0));
            objInvoke2.getClass();
            for (Object obj : (Object[]) objInvoke2) {
                if (obj != null) {
                    try {
                        objInvoke = obj.getClass().getMethod("getPath", null).invoke(obj, null);
                    } catch (NoSuchMethodException unused) {
                    }
                    String absolutePath = objInvoke != null ? (String) objInvoke : null;
                    if (absolutePath == null) {
                        try {
                            Object objInvoke3 = obj.getClass().getMethod("getDirectory", null).invoke(obj, null);
                            if (objInvoke3 != null) {
                                absolutePath = ((File) objInvoke3).getAbsolutePath();
                            }
                        } catch (NoSuchMethodException unused2) {
                        }
                    }
                    if (absolutePath != null) {
                        o oVar = new o();
                        oVar.f7125a = absolutePath;
                        File file = new File(absolutePath);
                        if (file.exists() && file.isDirectory()) {
                            oVar.f7128d = file.getUsableSpace();
                            try {
                                Object objInvoke4 = StorageManager.class.getMethod("getVolumeState", String.class).invoke(storageManager, absolutePath);
                                objInvoke4.getClass();
                                oVar.f7126b = (String) objInvoke4;
                            } catch (Exception unused3) {
                            }
                            try {
                                Object objInvoke5 = obj.getClass().getMethod("isRemovable", null).invoke(obj, null);
                                objInvoke5.getClass();
                                oVar.f7127c = ((Boolean) objInvoke5).booleanValue();
                            } catch (Exception unused4) {
                            }
                            arrayList.add(oVar);
                        }
                    }
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused5) {
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static List H(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static ArrayList I(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayListG = G(context);
            int size = arrayListG.size();
            for (int i = 0; i < size; i++) {
                if (!m.q0(((o) arrayListG.get(i)).f7125a, "/emulated/", false) && ((o) arrayListG.get(i)).f7127c && "mounted".equals(((o) arrayListG.get(i)).f7126b)) {
                    String str = "/Android/data/" + context.getPackageName();
                    File file = new File(((o) arrayListG.get(i)).f7125a + str);
                    if (file.exists()) {
                        if (file.canWrite()) {
                            arrayList.add(arrayListG.get(i));
                        }
                    } else if (file.mkdirs()) {
                        arrayList.add(arrayListG.get(i));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static p2 J(g2 g2Var, j jVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        jVar.getClass();
        p2 p2Var = new p2(null, null, 7);
        p2Var.f11329a = jVar;
        JSONObject jSONObject = g2Var.f11206d;
        if (jSONObject != null) {
            int iOptInt = !jSONObject.isNull("success") ? jSONObject.optInt("success") : 0;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject3 != null) {
                if (!jSONObjectOptJSONObject3.isNull("category") && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("category")) != null && !jSONObjectOptJSONObject2.isNull("description")) {
                    p2Var.f11329a.f11226l = jSONObjectOptJSONObject2.optString("description");
                }
                if (!jSONObjectOptJSONObject3.isNull("title")) {
                    p2Var.f11329a.f11225b = jSONObjectOptJSONObject3.optString("title");
                }
                if (!jSONObjectOptJSONObject3.isNull("description")) {
                    p2Var.f11329a.f11226l = jSONObjectOptJSONObject3.optString("description");
                }
                if (jVar.f11227m) {
                    o2 o2Var = new o2();
                    o2Var.f11307a = -1L;
                    o2Var.f11308b = -1;
                    o2Var.f11309c = -1;
                    o2Var.f11310d = null;
                    o2Var.f11311e = null;
                    o2Var.f = null;
                    o2Var.g = null;
                    p2Var.f11332d = o2Var;
                    if (!jSONObjectOptJSONObject3.isNull("lastUpdate")) {
                        o2 o2Var2 = p2Var.f11332d;
                        o2Var2.getClass();
                        o2Var2.f11307a = jSONObjectOptJSONObject3.optLong("lastUpdate");
                    }
                    if (!jSONObjectOptJSONObject3.isNull("totalApps")) {
                        o2 o2Var3 = p2Var.f11332d;
                        o2Var3.getClass();
                        o2Var3.f11308b = jSONObjectOptJSONObject3.optInt("totalApps");
                    }
                    if (!jSONObjectOptJSONObject3.isNull("url")) {
                        o2 o2Var4 = p2Var.f11332d;
                        o2Var4.getClass();
                        o2Var4.g = jSONObjectOptJSONObject3.optString("url");
                    }
                    if (!jSONObjectOptJSONObject3.isNull("editor") && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("editor")) != null) {
                        if (!jSONObjectOptJSONObject.isNull("editorID")) {
                            o2 o2Var5 = p2Var.f11332d;
                            o2Var5.getClass();
                            o2Var5.f11309c = jSONObjectOptJSONObject.optInt("editorID");
                        }
                        if (!jSONObjectOptJSONObject.isNull("name")) {
                            o2 o2Var6 = p2Var.f11332d;
                            o2Var6.getClass();
                            o2Var6.f11310d = jSONObjectOptJSONObject.optString("name");
                        }
                        if (!jSONObjectOptJSONObject.isNull("avatar")) {
                            o2 o2Var7 = p2Var.f11332d;
                            o2Var7.getClass();
                            o2Var7.f11311e = jSONObjectOptJSONObject.optString("avatar");
                        }
                        if (!jSONObjectOptJSONObject.isNull("jobTitle")) {
                            o2 o2Var8 = p2Var.f11332d;
                            o2Var8.getClass();
                            o2Var8.f = jSONObjectOptJSONObject.optString("jobTitle");
                        }
                    }
                }
                if (!jSONObjectOptJSONObject3.isNull("floatingCategoryRelated") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("floatingCategoryRelated")) != null) {
                    p2Var.f11333e = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                        jSONObjectOptJSONObject4.getClass();
                        j jVar2 = new j(0, (String) null, 7);
                        if (!jSONObjectOptJSONObject4.isNull("id")) {
                            jVar2.f11224a = jSONObjectOptJSONObject4.optInt("id");
                        }
                        if (!jSONObjectOptJSONObject4.isNull("name")) {
                            jVar2.f11225b = jSONObjectOptJSONObject4.optString("name");
                        }
                        jVar2.f11227m = true;
                        ArrayList arrayList = p2Var.f11333e;
                        arrayList.getClass();
                        arrayList.add(jVar2);
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("apps");
                if (jSONArrayOptJSONArray2 != null && iOptInt == 1 && jSONArrayOptJSONArray2.length() > 0) {
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray2.optJSONObject(i6);
                        jSONObjectOptJSONObject5.getClass();
                        x4.g gVar = new x4.g();
                        gVar.a(null, jSONObjectOptJSONObject5);
                        p2Var.f11330b.add(gVar);
                    }
                }
            }
        }
        return p2Var;
    }

    public static h K(f fVar, t6.g gVar) {
        gVar.getClass();
        return l.a(fVar.getKey(), gVar) ? t6.i.f10314a : fVar;
    }

    public static h L(f fVar, h hVar) {
        hVar.getClass();
        return hVar == t6.i.f10314a ? fVar : (h) hVar.fold(fVar, new j1(14));
    }

    public static SpannableStringBuilder M(String str, Context context, w4.f fVar) {
        str.getClass();
        fVar.getClass();
        int i = 0;
        String strO0 = u.o0(u.o0(str, "<br />", "\n", false), "<br/>", "\n", false);
        List<x4.o> listW = w(strO0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strO0);
        int length = 0;
        for (x4.o oVar : listW) {
            int i6 = oVar.f11300a;
            String str2 = oVar.f11304e;
            String str3 = oVar.f11303d;
            int i10 = i6 - length;
            int length2 = str3.length() + i10;
            str2.getClass();
            spannableStringBuilder = spannableStringBuilder.replace(i10, str2.length() + i10, (CharSequence) str3);
            spannableStringBuilder.getClass();
            String str4 = oVar.f11301b;
            int iHashCode = str4.hashCode();
            int i11 = 1;
            if (iHashCode != 98) {
                if (iHashCode != 105) {
                    if (iHashCode != 117) {
                        if (iHashCode != 93028092) {
                            if (iHashCode != 1524339519) {
                                if (iHashCode != 3274) {
                                    if (iHashCode == 3275 && str4.equals("h3")) {
                                        float dimension = context.getResources().getDimension(2131166539);
                                        Typeface typeface = f4.c.f4882w;
                                        typeface.getClass();
                                        spannableStringBuilder.setSpan(new j5.e(dimension, typeface, ContextCompat.getColor(context, 2131100787)), i10, length2, 33);
                                    }
                                } else if (str4.equals("h2")) {
                                    float dimension2 = context.getResources().getDimension(2131166538);
                                    Typeface typeface2 = f4.c.f4882w;
                                    typeface2.getClass();
                                    spannableStringBuilder.setSpan(new j5.e(dimension2, typeface2, ContextCompat.getColor(context, 2131100787)), i10, length2, 33);
                                }
                            } else if (str4.equals("floatingCategoryID")) {
                                spannableStringBuilder.setSpan(new n(oVar, fVar, context, i11), i10, length2, 33);
                            }
                        } else if (str4.equals("appID")) {
                            spannableStringBuilder.setSpan(new n(oVar, fVar, context, i), i10, length2, 33);
                        }
                    } else if (str4.equals("u")) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length2, 33);
                    }
                } else if (str4.equals("i")) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, length2, 33);
                }
            } else if (str4.equals("b")) {
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length2, 33);
            }
            length = (str2.length() + length) - str3.length();
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int N(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
        L12:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 == r2) goto L2b
            goto L12
        L2b:
            int r0 = r7 + 1
            boolean r4 = b2.t1.A(r0, r8)
            if (r4 == 0) goto L12
            r7 = r0
            goto L12
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L79
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L75
            r5 = 32
            if (r4 == r5) goto L75
            if (r4 == r2) goto L69
            r6 = 40
            if (r4 == r6) goto L64
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L72
            if (r3 == r7) goto L78
            goto L77
        L5e:
            if (r0 != 0) goto L61
            goto L77
        L61:
            int r0 = r0 + (-1)
            goto L72
        L64:
            int r0 = r0 + 1
            if (r0 <= r5) goto L72
            goto L78
        L69:
            int r4 = r3 + 1
            boolean r5 = b2.t1.A(r4, r8)
            if (r5 == 0) goto L72
            r3 = r4
        L72:
            int r3 = r3 + 1
            goto L3b
        L75:
            if (r3 == r7) goto L78
        L77:
            return r3
        L78:
            return r1
        L79:
            int r7 = r8.length()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.N(int, java.lang.CharSequence):int");
    }

    public static int O(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i6 = i + 1;
                    if (t1.A(i6, charSequence)) {
                        i = i6;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int P(java.lang.CharSequence r3, int r4, char r5) {
        /*
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L28
            char r0 = r3.charAt(r4)
            r1 = 92
            if (r0 != r1) goto L18
            int r1 = r4 + 1
            boolean r2 = b2.t1.A(r1, r3)
            if (r2 == 0) goto L18
            r4 = r1
            goto L25
        L18:
            if (r0 != r5) goto L1b
            return r4
        L1b:
            r1 = 41
            if (r5 != r1) goto L25
            r1 = 40
            if (r0 != r1) goto L25
            r3 = -1
            return r3
        L25:
            int r4 = r4 + 1
            goto L0
        L28:
            int r3 = r3.length()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.P(java.lang.CharSequence, int, char):int");
    }

    public static void Q(int i, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeBundle(bundle);
        a0(parcel, iY);
    }

    public static void R(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeStrongBinder(iBinder);
        a0(parcel, iY);
    }

    public static void S(Parcel parcel, int i, Parcelable parcelable, int i6) {
        if (parcelable == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcelable.writeToParcel(parcel, i6);
        a0(parcel, iY);
    }

    public static void T(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeString(str);
        a0(parcel, iY);
    }

    public static void U(Parcel parcel, int i, Parcelable[] parcelableArr, int i6) {
        if (parcelableArr == null) {
            return;
        }
        int iY = Y(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i6);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        a0(parcel, iY);
    }

    public static void V(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iY = Y(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            Parcelable parcelable = (Parcelable) list.get(i6);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        a0(parcel, iY);
    }

    public static int W(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static void X(Parcel parcel, int i, int i6) {
        parcel.writeInt(i | (i6 << 16));
    }

    public static int Y(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Object Z(Class cls, String str, q... qVarArr) {
        int length = qVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < qVarArr.length; i++) {
            q qVar = qVarArr[i];
            qVar.getClass();
            clsArr[i] = (Class) qVar.f7780b;
            objArr[i] = qVarArr[i].f7781l;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static final Spanned a(String str) {
        str.getClass();
        Spanned spannedFromHtml = HtmlCompat.fromHtml(u.o0(u.o0(u.o0(u.o0(u.o0(u.o0(str, "<ul>", "<customUl>", true), "</ul>", "</customUl>", true), "<ol>", "<customOl>", true), "<ol>", "</customOl>", true), "<li>", "<customLi>", true), "</li>", "</customLi>", true), 0, null, new i8.a());
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }

    public static void a0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Vector b(int i, String str) throws w5.e {
        if (str.length() != i) {
            throw new w5.e(l.g(": bitfield encoding length mismatch", "h.e"));
        }
        int i6 = 1;
        Vector vector = new Vector(null, i6, 0 == true ? 1 : 0);
        if (1 <= i) {
            while (true) {
                int i10 = i6 + 1;
                String strValueOf = String.valueOf(str.charAt(i6 - 1));
                strValueOf.getClass();
                if (strValueOf.equals("1")) {
                    vector.set(i6);
                }
                if (i6 == i) {
                    break;
                }
                i6 = i10;
            }
        }
        vector.setBitLength(str.length());
        return vector;
    }

    public static boolean b0(byte b7) {
        return b7 > -65;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "FEATURE";
            case 2:
                return "NON_IAB";
            case 3:
                return "PURPOSES";
            case 4:
                return "LEGITIMATE_PURPOSES";
            case 5:
                return "LEGITIMATE_VENDORS";
            case 6:
                return "SPECIAL_PURPOSES";
            case 7:
                return "SPECIAL_FEATURES";
            case 8:
                return "VENDORS";
            case 9:
                return "STACKS";
            case 10:
                return "GOOGLE";
            default:
                return "null";
        }
    }

    public static void d(int i, String str, String str2, Throwable th, Boolean bool) {
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            throw null;
        }
        if (l.a(bool, Boolean.TRUE)) {
            if (i == 0) {
                throw null;
            }
            int i6 = i - 1;
            if (i6 == 0) {
                Log.v(str, str2, th);
                return;
            }
            if (i6 == 1) {
                Log.d(str, str2, th);
                return;
            }
            if (i6 == 2) {
                Log.i(str, str2, th);
            } else if (i6 == 3) {
                Log.w(str, str2, th);
            } else {
                if (i6 != 4) {
                    return;
                }
                Log.e(str, str2, th);
            }
        }
    }

    public static void e(ImageView imageView, Context context) {
        Bitmap bitmapDecodeFile;
        imageView.getClass();
        File file = new File(context.getCacheDir(), "im_cmp_image_cache");
        file.mkdirs();
        File file2 = new File(file, l.g(".bin", "inmobi_branding_logo"));
        if (!file2.exists() || file2.length() == 0) {
            h("ImageLoader", l.g("inmobi_branding_logo", "Slot file missing or empty: "), null, 12);
            bitmapDecodeFile = null;
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath());
        }
        if (bitmapDecodeFile != null) {
            h("ImageLoader", l.g("inmobi_branding_logo", "Loaded image from slot: "), null, 12);
            imageView.setImageBitmap(bitmapDecodeFile);
        } else {
            h("ImageLoader", l.g("inmobi_branding_logo", "Falling back to resource for slot: "), null, 12);
            imageView.setImageResource(2131230981);
        }
    }

    public static void f(String str) {
        d(2, "FontManager", str, null, Boolean.FALSE);
    }

    public static void g(String str, String str2) {
        str2.getClass();
        d(3, str, str2, null, Boolean.FALSE);
    }

    public static void h(String str, String str2, Exception exc, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            str = "Inmobi Cmp";
        }
        if ((i & 4) != 0) {
            exc = null;
        }
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        }
        str2.getClass();
        d(5, str, str2, exc, bool);
    }

    public static void i(StringBuilder sb, Object obj, d7.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static float j(float f) {
        float f10 = f / 2.0f;
        if (f10 < 0.5d) {
            return 0.5f;
        }
        return f10;
    }

    public static final boolean k(byte[] bArr, int i, byte[] bArr2, int i6, int i10) {
        bArr.getClass();
        bArr2.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11 + i] != bArr2[i11 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static String l(int i, int i6, String str) {
        if (i < 0) {
            return t1.F("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i6 >= 0) {
            return t1.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i6));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    public static r6.c m(r6.c cVar) {
        cVar.k();
        cVar.f8922l = true;
        return cVar.f8921b > 0 ? cVar : r6.c.f8919m;
    }

    public static void n(int i, int i6) {
        String strF;
        if (i < 0 || i >= i6) {
            if (i < 0) {
                strF = t1.F("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i6 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i6);
                    throw new IllegalArgumentException(sb.toString());
                }
                strF = t1.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static final void o(long j, long j6, long j10) {
        if ((j6 | j10) < 0 || j6 > j || j - j6 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j6 + " byteCount=" + j10);
        }
    }

    public static void p(int i, int i6) {
        if (i < 0 || i > i6) {
            com.google.gson.internal.a.r(l(i, i6, "index"));
        }
    }

    public static void q(int i, int i6, int i10) {
        if (i < 0 || i6 < i || i6 > i10) {
            throw new IndexOutOfBoundsException((i < 0 || i > i10) ? l(i, i10, "start index") : (i6 < 0 || i6 > i10) ? l(i6, i10, "end index") : t1.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i)));
        }
    }

    public static void r(Context context) {
        File externalFilesDir;
        r rVar;
        context.getClass();
        g gVarL = g.D.l(context);
        gVarL.b();
        ArrayList arrayListA0 = gVarL.a0();
        gVarL.c();
        h4.a aVar = new h4.a(context);
        if (aVar.d()) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalFilesDir = externalFilesDirs[1];
            } else {
                File externalFilesDir2 = context.getExternalFilesDir(null);
                aVar.g();
                aVar.f();
                externalFilesDir = externalFilesDir2;
            }
        } else {
            externalFilesDir = context.getExternalFilesDir(null);
        }
        File file = new File(externalFilesDir, "Updates");
        if (!file.exists()) {
            file.mkdirs();
        }
        Iterator it = c0.m(context, file).iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            File file2 = (File) next;
            Iterator it2 = arrayListA0.iterator();
            it2.getClass();
            boolean z9 = false;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                q2 q2Var = (q2) next2;
                if (!q2Var.c() && (rVar = q2Var.f11352s) != null && !rVar.F.isEmpty()) {
                    r rVar2 = q2Var.f11352s;
                    rVar2.getClass();
                    Iterator it3 = rVar2.F.iterator();
                    it3.getClass();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            if (u.m0(((j0) next3).f11240q, file2.getAbsolutePath(), false)) {
                                z9 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (!z9) {
                file2.delete();
            }
        }
    }

    public static s1.a s(String str, String str2) {
        a3.a aVar = new a3.a(str, str2);
        j9.u uVarA = s1.a.a(a3.a.class);
        uVarA.f6816b = 1;
        uVarA.f = new androidx.core.view.inputmethod.a(aVar, 25);
        return uVarA.d();
    }

    public static r6.c t() {
        return new r6.c(10);
    }

    public static void u(String str, String str2, Object obj) {
        String strD = D(str);
        if (Log.isLoggable(strD, 3)) {
            Log.d(strD, String.format(str2, obj));
        }
    }

    public static void v(String str, String str2, Exception exc) {
        String strD = D(str);
        if (Log.isLoggable(strD, 6)) {
            Log.e(strD, str2, exc);
        }
    }

    public static List w(String str) {
        ArrayList arrayList = new ArrayList();
        k7.e eVar = new k7.e(k.a(new k("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]"), str));
        while (eVar.hasNext()) {
            l7.i iVar = (l7.i) eVar.next();
            int i = iVar.b().f5695a;
            String str2 = (String) ((l7.h) iVar.a()).get(1);
            long j = Long.parseLong((String) ((l7.h) iVar.a()).get(2));
            String str3 = (String) ((l7.h) iVar.a()).get(3);
            Long lValueOf = Long.valueOf(j);
            String strGroup = iVar.f7172a.group();
            strGroup.getClass();
            arrayList.add(new x4.o(i, str2, lValueOf, str3, strGroup));
        }
        k7.e eVar2 = new k7.e(k.a(new k("\\[url=([^\\]]+)](.*?)\\[/url]"), str));
        while (eVar2.hasNext()) {
            l7.i iVar2 = (l7.i) eVar2.next();
            int i6 = iVar2.b().f5695a;
            String str4 = (String) ((l7.h) iVar2.a()).get(0);
            String str5 = (String) ((l7.h) iVar2.a()).get(1);
            String str6 = (String) ((l7.h) iVar2.a()).get(2);
            String strGroup2 = iVar2.f7172a.group();
            strGroup2.getClass();
            x4.o oVar = new x4.o(str4, str6, strGroup2, i6);
            oVar.f = str5;
            arrayList.add(oVar);
        }
        k7.e eVar3 = new k7.e(k.a(new k("<(\\w+)>(.*?)</(\\w+)>"), str));
        while (eVar3.hasNext()) {
            l7.i iVar3 = (l7.i) eVar3.next();
            int i10 = iVar3.b().f5695a;
            String str7 = (String) ((l7.h) iVar3.a()).get(1);
            String str8 = (String) ((l7.h) iVar3.a()).get(2);
            String strGroup3 = iVar3.f7172a.group();
            strGroup3.getClass();
            arrayList.add(new x4.o(str7, str8, strGroup3, i10));
        }
        return q6.l.C0(arrayList, new z(12));
    }

    public static Object x(f fVar, Object obj, p pVar) {
        pVar.getClass();
        return pVar.invoke(obj, fVar);
    }

    public static s1.a y(String str, com.google.gson.internal.a aVar) {
        j9.u uVarA = s1.a.a(a3.a.class);
        uVarA.f6816b = 1;
        uVarA.c(s1.i.a(Context.class));
        uVarA.f = new a3.e(0, str, aVar);
        return uVarA.d();
    }

    public static f z(f fVar, t6.g gVar) {
        gVar.getClass();
        if (l.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }
}
