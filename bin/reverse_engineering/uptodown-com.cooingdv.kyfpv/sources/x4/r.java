package x4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.activities.MyDownloads;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Parcelable {
    public static Parcelable.Creator<r> CREATOR = new i0.l(12);
    public int A;
    public int B;
    public Drawable E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11356b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11357l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11361p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f11364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f11365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11366u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f11368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f11369y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11355a = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11358m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11359n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f11362q = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f11370z = -1;
    public long C = -1;
    public long D = -1;
    public ArrayList F = new ArrayList();

    public final void a(g gVar) {
        gVar.getClass();
        this.f11356b = gVar.F;
        this.f11362q = gVar.f11159a;
        this.f11367w = gVar.f11160b;
        if (this.f11364s == null) {
            this.f11364s = gVar.M;
        }
        if (gVar.F0.isEmpty()) {
            j0 j0Var = new j0();
            if (j0Var.f11240p == null) {
                j0Var.f11240p = gVar.P;
            }
            j0Var.f11236l = gVar.J;
            String str = gVar.f11178p;
            if (str != null && str.length() != 0) {
                try {
                    String str2 = gVar.f11178p;
                    str2.getClass();
                    j0Var.f11238n = Long.parseLong(str2);
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
            }
            ArrayList arrayList = new ArrayList();
            this.F = arrayList;
            arrayList.add(j0Var);
        } else {
            this.F = gVar.F0;
        }
        this.v = gVar.h();
        this.f11369y = gVar.S;
        if (!z3.f) {
            this.f11363r = 1;
        }
        if (this.f11359n <= 0) {
            long j = gVar.K;
            if (j > 0) {
                this.f11359n = j;
            } else {
                long j6 = gVar.f11173m;
                if (j6 > 0) {
                    this.f11359n = j6;
                }
            }
        }
        this.f11360o = gVar.f11171l;
        this.f11365t = null;
        ArrayList arrayList2 = gVar.T;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = gVar.T;
            arrayList3.getClass();
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                String str3 = this.f11365t;
                ArrayList arrayList4 = gVar.T;
                if (str3 == null) {
                    arrayList4.getClass();
                    this.f11365t = (String) arrayList4.get(i);
                } else {
                    arrayList4.getClass();
                    this.f11365t = String.format("%s,%s", Arrays.copyOf(new Object[]{str3, arrayList4.get(i)}, 2));
                }
            }
        }
        String str4 = gVar.I;
        if (str4 != null) {
            try {
                this.f11366u = Integer.parseInt(str4);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void b(g gVar, t1 t1Var) {
        gVar.getClass();
        t1Var.getClass();
        this.f11356b = gVar.F;
        this.f11362q = gVar.f11159a;
        this.f11367w = gVar.f11160b;
        this.v = gVar.f11188u;
        this.f11364s = gVar.M;
        this.f11359n = t1Var.f11400m;
        this.f11360o = t1Var.f11397a;
        this.B = 1;
        if (!l7.u.m0(t1Var.f11402o, "apk", true)) {
            this.F = t1Var.f11405r;
            return;
        }
        this.F = new ArrayList();
        j0 j0Var = new j0();
        String str = t1Var.f11403p;
        str.getClass();
        j0Var.f11236l = Long.parseLong(str);
        j0Var.f11238n = t1Var.f11398b;
        this.F.add(j0Var);
    }

    public final boolean c() {
        return this.f11358m == 0;
    }

    public final void d() {
        if (this.F.isEmpty()) {
            return;
        }
        Iterator it = this.F.iterator();
        it.getClass();
        File parentFile = null;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            j0 j0Var = (j0) next;
            String str = j0Var.f11241q;
            if (str != null) {
                try {
                    File file = new File(str);
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            String str2 = j0Var.f11241q;
            if (str2 != null && str2.length() != 0 && parentFile == null) {
                String str3 = j0Var.f11241q;
                str3.getClass();
                parentFile = new File(str3).getParentFile();
            }
        }
        if ((parentFile != null ? parentFile.getAbsolutePath() : null) != null && parentFile.exists() && parentFile.isDirectory()) {
            String[] list = parentFile.list();
            if (list == null || list.length == 0) {
                parentFile.delete();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final int e() {
        return this.f11363r;
    }

    public final File f() {
        String str = !this.F.isEmpty() ? ((j0) this.F.get(0)).f11241q : null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final File g() {
        if (this.F.size() == 1 && ((j0) this.F.get(0)).f11241q != null) {
            String str = ((j0) this.F.get(0)).f11241q;
            str.getClass();
            return new File(str);
        }
        if (this.F.size() <= 1 || ((j0) this.F.get(0)).f11241q == null) {
            return null;
        }
        String str2 = ((j0) this.F.get(0)).f11241q;
        str2.getClass();
        return new File(str2).getParentFile();
    }

    public final void h(MyDownloads myDownloads, File file) {
        if (this.f11356b != null) {
            long j = this.f11359n;
            if (j > 0) {
                this.C = j;
                q(myDownloads);
                return;
            }
            String name = file.getName();
            name.getClass();
            if (l7.u.k0(name, ".apk", false)) {
                try {
                    PackageManager packageManager = myDownloads.getPackageManager();
                    packageManager.getClass();
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    PackageInfo packageInfoD = n4.i.d(packageManager, absolutePath, 128);
                    if (packageInfoD != null) {
                        this.C = n4.d.d(packageInfoD);
                    }
                    if (packageInfoD == null || !l7.u.m0(this.f11356b, packageInfoD.packageName, false)) {
                        return;
                    }
                    q(myDownloads);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final int i() {
        long j;
        long j6;
        if (this.F.isEmpty()) {
            j = 0;
            j6 = 0;
        } else {
            Iterator it = this.F.iterator();
            it.getClass();
            j = 0;
            j6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                j0 j0Var = (j0) next;
                j += j0Var.f11238n;
                j6 += j0Var.f11239o;
            }
        }
        if (j6 <= 0 || j <= 0) {
            return 0;
        }
        return (int) ((j6 * 100.0d) / j);
    }

    public final long j() {
        long j = 0;
        if (!this.F.isEmpty()) {
            Iterator it = this.F.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                j += ((j0) next).f11239o;
            }
        }
        return j;
    }

    public final long k() {
        long j = 0;
        if (!this.F.isEmpty()) {
            Iterator it = this.F.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                j += ((j0) next).f11238n;
            }
        }
        return j;
    }

    public final void l(Context context) {
        context.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        this.f11361p++;
        this.f11368x = System.currentTimeMillis() + 1800000;
        gVarL.j(this);
        if (this.f11361p >= 4) {
            t(context);
        } else {
            gVarL.b0(this);
        }
        gVarL.c();
    }

    public final boolean m() {
        return this.f11356b != null && p() && !c() && this.f11364s != null && this.f11359n > 0 && this.f11361p < 4 && System.currentTimeMillis() > this.f11368x;
    }

    public final boolean n() {
        String str;
        l4.a aVarC = f4.a.f4870a.c();
        return this.f11359n > 0 && (str = this.f11356b) != null && aVarC != null && l7.u.m0(aVarC.f7096a, str, true) && aVarC.f7097b == this.f11359n;
    }

    public final int o() {
        return this.B;
    }

    public final boolean p() {
        return this.f11370z == -1;
    }

    public final void q(MyDownloads myDownloads) {
        PackageInfo packageInfoE;
        try {
            PackageManager packageManager = myDownloads.getPackageManager();
            if (packageManager != null) {
                String str = this.f11356b;
                str.getClass();
                packageInfoE = n4.i.e(packageManager, str, 0);
            } else {
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.D = n4.d.d(packageInfoE);
            }
        } catch (Exception unused) {
        }
    }

    public final int r(Context context) {
        context.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        String str = this.f11356b;
        str.getClass();
        r rVarL = gVarL.L(this.f11359n, str);
        if (rVarL == null) {
            gVarL.b0(this);
            rVarL = this;
        }
        gVarL.c();
        return rVarL.f11355a;
    }

    public final void s(Context context) {
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        gVarL.j(this);
        gVarL.c();
    }

    public final void t(Context context) {
        File parentFile;
        context.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        this.f11358m = 1;
        gVarL.q0(this);
        if (this.F.isEmpty()) {
            parentFile = null;
        } else {
            Iterator it = this.F.iterator();
            it.getClass();
            parentFile = null;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                j0 j0Var = (j0) next;
                String str = j0Var.f11241q;
                if (str != null) {
                    try {
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                String str2 = j0Var.f11241q;
                if (str2 != null && str2.length() != 0 && parentFile == null) {
                    String str3 = j0Var.f11241q;
                    str3.getClass();
                    parentFile = new File(str3).getParentFile();
                }
                if (this.f11370z > 0) {
                    j0Var.f11239o = 0L;
                    j0Var.f11242r = 0;
                    j0Var.f11243s = 0L;
                    gVarL.r0(j0Var);
                }
            }
        }
        gVarL.c();
        if ((parentFile != null ? parentFile.getAbsolutePath() : null) != null && parentFile.exists() && parentFile.isDirectory()) {
            String[] list = parentFile.list();
            if (list == null || list.length == 0) {
                parentFile.delete();
            }
        }
    }

    public final String toString() {
        int i = this.f11355a;
        String str = this.f11356b;
        int i6 = this.f11357l;
        int i10 = this.f11358m;
        long j = this.f11359n;
        String str2 = this.f11360o;
        int i11 = this.f11361p;
        long j6 = this.f11362q;
        int i12 = this.f11363r;
        String str3 = this.f11364s;
        String str4 = this.f11365t;
        int i13 = this.f11366u;
        String str5 = this.v;
        String str6 = this.f11367w;
        long j10 = this.C;
        long j11 = this.D;
        long j12 = this.f11368x;
        long j13 = this.f11370z;
        int i14 = this.A;
        int i15 = this.B;
        ArrayList arrayList = this.F;
        StringBuilder sb = new StringBuilder("{id='");
        sb.append(i);
        sb.append("', packagename='");
        sb.append(str);
        sb.append("', checkedByUser=");
        sb.append(i6);
        sb.append(", incomplete=");
        sb.append(i10);
        sb.append(", versioncode='");
        sb.append(j);
        sb.append("', versionname='");
        sb.append(str2);
        sb.append("', attempts=");
        sb.append(i11);
        sb.append(", appId=");
        sb.append(j6);
        sb.append(", downloadAnyway=");
        sb.append(i12);
        a4.x.B(sb, ", md5signature='", str3, "', supportedAbis='", str4);
        sb.append("', minsdk=");
        sb.append(i13);
        sb.append(", urlIcon='");
        sb.append(str5);
        sb.append("', appName='");
        sb.append(str6);
        sb.append("', versioncodeFile=");
        sb.append(j10);
        sb.append(", versioncodeInstalled=");
        sb.append(j11);
        sb.append(", nextAttemptTimeStamp=");
        sb.append(j12);
        sb.append(", updateId=");
        sb.append(j13);
        sb.append(", isDeepLink=");
        sb.append(i14);
        sb.append(", isRollback=");
        sb.append(i15);
        sb.append(", files=");
        sb.append(arrayList);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f11355a);
        parcel.writeString(this.f11356b);
        parcel.writeInt(this.f11357l);
        parcel.writeInt(this.f11358m);
        parcel.writeLong(this.f11359n);
        parcel.writeString(this.f11360o);
        parcel.writeInt(this.f11361p);
        parcel.writeLong(this.f11362q);
        parcel.writeInt(this.f11363r);
        parcel.writeString(this.f11364s);
        parcel.writeString(this.f11365t);
        parcel.writeInt(this.f11366u);
        parcel.writeString(this.v);
        parcel.writeString(this.f11367w);
        parcel.writeLong(this.f11368x);
        parcel.writeStringList(this.f11369y);
        parcel.writeTypedList(this.F);
        parcel.writeLong(this.f11370z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
    }
}
