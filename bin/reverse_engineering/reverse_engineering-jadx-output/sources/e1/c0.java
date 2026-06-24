package e1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.k8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.y7;
import com.google.firebase.components.ComponentRegistrar;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements v, w4.f, h2.a, p2.a, c.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile c0 f3840r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c0 f3833b = new c0(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ c0 f3834l = new c0(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c0 f3835m = new c0(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c0 f3836n = new c0(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ c0 f3837o = new c0(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c0 f3838p = new c0(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ c0 f3839q = new c0(6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ c0 f3841s = new c0(28);

    public c0(TvAppDetailFragment tvAppDetailFragment) {
        this.f3842a = 10;
    }

    public static boolean g(File file) {
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(file).entries();
            while (enumerationEntries.hasMoreElements()) {
                String name = enumerationEntries.nextElement().getName();
                name.getClass();
                if (l7.u.k0(name, ".obb", false)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static Object h(Context context, String str, n4.c cVar) throws Throwable {
        v7.e eVar = o7.m0.f8288a;
        Object objC = o7.c0.C(new j5.i(context, str, null, 1), t7.n.f10348a, cVar);
        return objC == u6.a.f10762a ? objC : p6.x.f8463a;
    }

    public static g2.d j(q1.a aVar) {
        return new g2.d(System.currentTimeMillis() + ((long) 3600000), new g2.c(8), new g2.b(true, false, false), 10.0d, 1.2d, 60);
    }

    public static long k(File file) {
        File[] fileArrListFiles;
        file.getClass();
        if (!file.isDirectory()) {
            return file.length();
        }
        try {
            fileArrListFiles = file.listFiles();
        } catch (SecurityException e10) {
            e10.printStackTrace();
            fileArrListFiles = null;
        }
        long jK = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        int i = 0;
        while (true) {
            if (!(i < fileArrListFiles.length)) {
                return jK;
            }
            int i6 = i + 1;
            try {
                jK += k(fileArrListFiles[i]);
                i = i6;
            } catch (ArrayIndexOutOfBoundsException e11) {
                androidx.privacysandbox.ads.adservices.customaudience.a.s(e11.getMessage());
                return 0L;
            }
        }
    }

    public static ArrayList m(Context context, File file) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            String packageName = context.getPackageName();
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    String absolutePath = file2.getAbsolutePath();
                    absolutePath.getClass();
                    if (!l7.u.k0(absolutePath, "Android/data/" + packageName, false)) {
                        String name = file2.getName();
                        name.getClass();
                        if (!l7.m.q0(name, "Backups", true)) {
                            arrayList.addAll(m(context, file2));
                        }
                    }
                } else {
                    String name2 = file2.getName();
                    name2.getClass();
                    if ((l7.u.k0(name2, ".apk", false) || l7.u.k0(name2, ".xapk", true) || l7.u.k0(name2, ".apks", true) || l7.u.k0(name2, ".apkm", true) || l7.u.k0(name2, ".zip", true)) && !l7.u.p0(name2, ".", false)) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean n(File file) {
        int i;
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(file).entries();
            i = 0;
            while (enumerationEntries.hasMoreElements()) {
                try {
                    String name = enumerationEntries.nextElement().getName();
                    name.getClass();
                    if (l7.u.k0(name, ".apk", false)) {
                        i++;
                    }
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            }
        } catch (Exception e11) {
            e = e11;
            i = 0;
        }
        return i > 0;
    }

    public static ArrayList t(Context context) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListG = a.a.G(context);
        if (arrayListG.size() > 0) {
            Iterator it = arrayListG.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                File file = new File(((l4.o) next).f7125a);
                if (file.exists() && file.isDirectory()) {
                    arrayList2.addAll(m(context, file));
                }
            }
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            externalStorageDirectory.getClass();
            arrayList2.addAll(m(context, externalStorageDirectory));
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            File file2 = (File) next2;
            String name = file2.getName();
            name.getClass();
            boolean z9 = false;
            if (!l7.u.p0(name, ".", false)) {
                String name2 = file2.getName();
                name2.getClass();
                if (l7.u.k0(name2, ".apk", false)) {
                    String absolutePath = file2.getAbsolutePath();
                    absolutePath.getClass();
                    PackageInfo packageInfoD = n4.i.d(packageManager, absolutePath, 128);
                    if (packageInfoD != null) {
                        try {
                            ApplicationInfo applicationInfo = packageInfoD.applicationInfo;
                            if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                                applicationInfo.getClass();
                                if (applicationInfo.metaData.containsKey("com.android.vending.splits.required")) {
                                    ApplicationInfo applicationInfo2 = packageInfoD.applicationInfo;
                                    applicationInfo2.getClass();
                                    z9 = applicationInfo2.metaData.getBoolean("com.android.vending.splits.required");
                                }
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (!z9) {
                            arrayList3.add(file2);
                        }
                    } else {
                        String name3 = file2.getName();
                        name3.getClass();
                        if (!l7.u.p0(name3, "split_config", false)) {
                            arrayList3.add(file2);
                        }
                    }
                } else {
                    String name4 = file2.getName();
                    name4.getClass();
                    if (l7.u.k0(name4, ".xapk", true) || l7.u.k0(name4, ".apks", true) || l7.u.k0(name4, ".apkm", true) || l7.u.k0(name4, ".zip", true)) {
                        arrayList3.add(file2);
                    }
                }
            }
        }
        return arrayList3;
    }

    public static boolean u(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                name.getClass();
                if (l7.u.k0(name, ".apk", false)) {
                    if (zipEntryNextElement.getSize() >= file2.getUsableSpace()) {
                        return false;
                    }
                    File file3 = new File(file2, name);
                    InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                    inputStream.getClass();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                        } finally {
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // e1.v
    public Object a() {
        switch (this.f3842a) {
            case 0:
                List list = f0.f3913a;
                Boolean bool = (Boolean) k8.f2694a.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = f0.f3913a;
                f7.f2585b.get();
                return Integer.valueOf((int) ((Long) g7.n0.b()).longValue());
            case 2:
                List list3 = f0.f3913a;
                f7.f2585b.get();
                Long l10 = (Long) g7.f2604a.b();
                l10.getClass();
                return l10;
            case 3:
                return new Boolean(((Boolean) y7.f2920a.b()).booleanValue());
            case 4:
                return new Boolean(((Boolean) a8.f2504a.b()).booleanValue());
            case 5:
                return new Boolean(((Boolean) i8.f2666a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) q8.f2770a.b()).booleanValue());
        }
    }

    @Override // w4.f
    public void b(long j) {
        int i = this.f3842a;
    }

    @Override // w4.f
    public void c(x4.j jVar) {
        int i = this.f3842a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // h2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StackTraceElement[] d(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            int r0 = r14.f3842a
            switch(r0) {
                case 13: goto L70;
                default: goto L5;
            }
        L5:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        L12:
            int r7 = r15.length
            if (r4 >= r7) goto L66
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L54
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L2b
            goto L54
        L2b:
            r11 = r2
        L2c:
            if (r11 >= r10) goto L40
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L3d
            goto L54
        L3d:
            int r11 = r11 + 1
            goto L2c
        L40:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L50
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L50:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L5c
        L54:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L5c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto L12
        L66:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6f
            r15 = r0
        L6f:
            return r15
        L70:
            int r0 = r15.length
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 > r1) goto L76
            goto L84
        L76:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            r1 = 0
            r2 = 512(0x200, float:7.17E-43)
            java.lang.System.arraycopy(r15, r1, r0, r1, r2)
            int r1 = r15.length
            int r1 = r1 - r2
            java.lang.System.arraycopy(r15, r1, r0, r2, r2)
            r15 = r0
        L84:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.c0.d(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r14 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (h(r19, r0, r7) == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (h(r19, r0, r7) == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        if (r14 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        if (h(r19, r0, r7) == r9) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.Object r17, java.lang.String r18, android.content.Context r19, final d7.a r20, v6.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.c0.i(java.lang.Object, java.lang.String, android.content.Context, d7.a, v6.c):java.lang.Object");
    }

    public synchronized j5.g l(Context context) {
        j5.g gVar;
        try {
            context.getClass();
            if (j5.g.E == null) {
                j5.g.E = new j5.g(context.getApplicationContext());
            }
            gVar = j5.g.E;
            gVar.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }

    public List s(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (s1.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f9113a;
            if (str != null) {
                aVar = new s1.a(str, aVar.f9114b, aVar.f9115c, aVar.f9116d, aVar.f9117e, new a3.e(3, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public /* synthetic */ c0(int i) {
        this.f3842a = i;
    }

    private final void o(long j) {
    }

    private final void p(long j) {
    }

    private final void q(x4.j jVar) {
    }

    private final void r(x4.j jVar) {
    }

    @Override // c.b
    public void e(c.i iVar) {
    }

    @Override // c.b
    public void f(c.i iVar) {
    }
}
