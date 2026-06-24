package x4;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable {
    public static Parcelable.Creator<e> CREATOR = new i0.l(9);
    public long A;
    public String B;
    public int C;
    public w1 D;
    public boolean E;
    public long F;
    public int G;
    public ArrayList I;
    public ArrayList J;
    public boolean K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11123b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11124l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f11126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11127o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11133u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f11135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11136y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f11137z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11122a = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11125m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f11128p = d.f11089b;
    public int H = -1;

    public static void a(String str, ArrayList arrayList, j5.g gVar, e eVar, ArrayList arrayList2) {
        arrayList2.getClass();
        e1 e1Var = new e1();
        e1Var.f11140b = new File(str).length();
        e1Var.f11141c = str;
        Iterator it = arrayList.iterator();
        int i = -1;
        int i6 = 0;
        while (it.hasNext()) {
            int i10 = i6 + 1;
            e1 e1Var2 = (e1) it.next();
            if (l7.u.m0(e1Var2.f11141c, e1Var.f11141c, false) && e1Var2.f11140b == e1Var.f11140b) {
                String str2 = e1Var2.f11139a;
                if (str2 != null) {
                    e1Var.f11139a = str2;
                }
                i = i6;
            }
            i6 = i10;
        }
        if (i != -1) {
            arrayList.remove(i);
            arrayList2.add(e1Var);
            return;
        }
        long j = eVar.f11122a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", String.valueOf(j));
        contentValues.put("sha256", e1Var.f11139a);
        contentValues.put("size", String.valueOf(e1Var.f11140b));
        contentValues.put("path", e1Var.f11141c);
        SQLiteDatabase sQLiteDatabase = gVar.f6674a;
        sQLiteDatabase.getClass();
        if (sQLiteDatabase.insert("app_files", null, contentValues) >= 0) {
            arrayList2.add(e1Var);
        }
    }

    public final boolean b(Context context) {
        context.getClass();
        if (this.f11124l == null) {
            return false;
        }
        if (d()) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("show_system_services")) {
                    return sharedPreferences.getBoolean("show_system_services", false);
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        if (!c()) {
            return true;
        }
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences2.contains("show_system_apps")) {
                return sharedPreferences2.getBoolean("show_system_apps", false);
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public final boolean c() {
        return this.f11129q == 1;
    }

    public final boolean d() {
        return this.f11130r == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final void e(j5.g gVar) {
        this.J = new ArrayList();
        String str = this.f11124l;
        str.getClass();
        ArrayList arrayListB = a.a.B(str);
        if (arrayListB.isEmpty()) {
            return;
        }
        String str2 = this.f11124l;
        str2.getClass();
        e eVarB = gVar.B(str2);
        if (eVarB != null) {
            ArrayList arrayListC = gVar.C(eVarB.f11122a);
            Iterator it = arrayListB.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                File file = (File) next;
                if (file.isFile()) {
                    String name = file.getName();
                    name.getClass();
                    if (l7.u.k0(name, ".obb", false)) {
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        ArrayList arrayList = this.J;
                        arrayList.getClass();
                        a(absolutePath, arrayListC, gVar, eVarB, arrayList);
                    }
                }
            }
        }
    }

    public final void f(ApplicationInfo applicationInfo, j5.g gVar) {
        applicationInfo.getClass();
        this.I = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            String str = this.f11124l;
            str.getClass();
            e eVarB = gVar.B(str);
            if (eVarB != null) {
                ArrayList arrayListC = gVar.C(eVarB.f11122a);
                int i = 0;
                while (i < strArr.length) {
                    int i6 = i + 1;
                    try {
                        String str2 = strArr[i];
                        str2.getClass();
                        if (l7.u.k0(str2, ".apk", false)) {
                            ArrayList arrayList = this.I;
                            arrayList.getClass();
                            a(str2, arrayListC, gVar, eVarB, arrayList);
                        }
                        i = i6;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                        return;
                    }
                }
                if (arrayListC.isEmpty()) {
                    return;
                }
                Iterator it = arrayListC.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    gVar.h((e1) next);
                }
            }
        }
    }

    public final void g(boolean z9, boolean z10) {
        if (c()) {
            if (z9) {
                this.f11136y = 0;
            } else {
                this.f11136y = 1;
            }
        }
        if (d()) {
            if (z10) {
                this.f11136y = 0;
            } else {
                this.f11136y = 1;
            }
        }
    }

    public final String toString() {
        return "{id='" + this.f11122a + "', name='" + this.f11123b + "', packagename='" + this.f11124l + "', versionCode=" + this.f11125m + ", versionName='" + this.f11126n + "', urlFicha='" + this.f11127o + "', status=" + this.f11128p + ", isSystemApp=" + this.f11129q + ", isSystemService=" + this.f11130r + ", minSdkVersion=" + this.f11131s + ", targetSdkVersion=" + this.f11132t + ", md5signature='" + this.f11133u + "', exclude=" + this.v + ", size=" + this.f11134w + ", lastUpdateTime=" + this.f11135x + ", excludeFromTracking=" + this.f11136y + ", defaultName='" + this.f11137z + "', firstInstallTime=" + this.A + ", sha256='" + this.B + "', appID=" + this.F + ", hasOldVersions=" + this.G + ", trackInfoRegistered=" + this.H + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11122a);
        parcel.writeString(this.f11123b);
        parcel.writeString(this.f11124l);
        parcel.writeLong(this.f11125m);
        parcel.writeString(this.f11126n);
        parcel.writeString(this.f11127o);
        int iOrdinal = this.f11128p.ordinal();
        if (iOrdinal == 0) {
            parcel.writeInt(0);
        } else if (iOrdinal != 1) {
            parcel.writeInt(2);
        } else {
            parcel.writeInt(1);
        }
        parcel.writeInt(this.f11129q);
        parcel.writeInt(this.f11130r);
        parcel.writeInt(this.f11131s);
        parcel.writeInt(this.f11132t);
        parcel.writeString(this.f11133u);
        parcel.writeInt(this.v);
        parcel.writeLong(this.f11134w);
        parcel.writeLong(this.f11135x);
        parcel.writeInt(this.f11136y);
        parcel.writeString(this.f11137z);
        parcel.writeLong(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.K ? 1 : 0);
    }
}
