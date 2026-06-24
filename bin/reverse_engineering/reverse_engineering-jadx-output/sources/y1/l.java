package y1;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import b2.a0;
import b2.b0;
import b2.h1;
import b2.i0;
import b2.j0;
import b2.k0;
import b2.k1;
import b2.l1;
import b2.m0;
import b2.m1;
import b2.m2;
import b2.n1;
import b2.n2;
import b2.t1;
import e1.p2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e2.a f11634r = new e2.a(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Charset f11635s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f11637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.q f11638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2.d f11639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1.e f11640e;
    public final x f;
    public final e2.d g;
    public final a h;
    public final a2.f i;
    public final v1.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w1.a f11641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f11642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e2.d f11643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f11644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j1.i f11645o = new j1.i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j1.i f11646p = new j1.i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j1.i f11647q = new j1.i();

    public l(Context context, x xVar, t tVar, e2.d dVar, m8.q qVar, a aVar, e2.d dVar2, a2.f fVar, e2.d dVar3, v1.b bVar, w1.a aVar2, i iVar, z1.e eVar) {
        new AtomicBoolean(false);
        this.f11636a = context;
        this.f = xVar;
        this.f11637b = tVar;
        this.g = dVar;
        this.f11638c = qVar;
        this.h = aVar;
        this.f11639d = dVar2;
        this.i = fVar;
        this.j = bVar;
        this.f11641k = aVar2;
        this.f11642l = iVar;
        this.f11643m = dVar3;
        this.f11640e = eVar;
    }

    public static j1.p a(l lVar) {
        j1.p pVarQ;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : e2.d.n(((File) lVar.g.f4468m).listFiles(f11634r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    pVarQ = t1.x(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    pVarQ = t1.q(new ScheduledThreadPoolExecutor(1), new k(lVar, j));
                }
                arrayList.add(pVarQ);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return t1.Q(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05f2  */
    /* JADX WARN: Type inference failed for: r0v7, types: [y1.i] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [int] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r32, g2.e r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l.b(boolean, g2.e, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strJ = a4.x.j("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strJ, null);
        }
        Locale locale = Locale.US;
        x xVar = this.f;
        a aVar = this.h;
        l1 l1Var = new l1(xVar.f11691c, aVar.f, aVar.g, xVar.c().f11607a, k0.k.d(aVar.f11602d != null ? 4 : 1), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.f11636a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        f fVar = f.f11616a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            f fVar2 = (f) f.f11617b.get(str8.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = fVar.ordinal();
        String str9 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new k1(l1Var, n1Var, new m1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            e2.d dVar = this.f11639d;
            synchronized (((String) dVar.f4466b)) {
                dVar.f4466b = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i = 4;
                ((z1.e) dVar.f4468m).f11909b.a(new a2.r(dVar, str, ((a2.e) ((AtomicMarkableReference) ((a2.t) dVar.f4469n).f53b).getReference()).a(), ((a2.q) dVar.f4471p).a(), 0));
            }
        }
        a2.f fVar3 = this.i;
        ((a2.d) fVar3.f19b).b();
        fVar3.f19b = a2.f.f17c;
        if (str != null) {
            fVar3.f19b = new a2.o(((e2.d) fVar3.f18a).h(str, "userlog"));
        }
        this.f11642l.b(str);
        e2.d dVar2 = this.f11643m;
        r rVar = (r) dVar2.f4466b;
        Charset charset = n2.f887a;
        a0 a0Var = new a0();
        a0Var.f715a = "20.0.4";
        a aVar2 = rVar.f11671c;
        String str12 = aVar2.f11599a;
        if (str12 == null) {
            com.google.gson.internal.a.i("Null gmpAppId");
            return;
        }
        a0Var.f716b = str12;
        x xVar2 = rVar.f11670b;
        String str13 = xVar2.c().f11607a;
        if (str13 == null) {
            com.google.gson.internal.a.i("Null installationUuid");
            return;
        }
        a0Var.f718d = str13;
        a0Var.f719e = xVar2.c().f11608b;
        a0Var.f = xVar2.c().f11609c;
        String str14 = aVar2.f;
        if (str14 == null) {
            com.google.gson.internal.a.i("Null buildVersion");
            return;
        }
        a0Var.h = str14;
        String str15 = aVar2.g;
        if (str15 == null) {
            com.google.gson.internal.a.i("Null displayVersion");
            return;
        }
        a0Var.i = str15;
        a0Var.f717c = i;
        a0Var.f722m = (byte) (a0Var.f722m | 1);
        i0 i0Var = new i0();
        i0Var.f = false;
        byte b7 = (byte) (i0Var.f817m | 2);
        i0Var.f813d = jCurrentTimeMillis;
        i0Var.f817m = (byte) (b7 | 1);
        if (str == null) {
            com.google.gson.internal.a.i("Null identifier");
            return;
        }
        i0Var.f811b = str;
        String str16 = r.g;
        if (str16 == null) {
            com.google.gson.internal.a.i("Null generator");
            return;
        }
        i0Var.f810a = str16;
        String str17 = xVar2.f11691c;
        if (str17 == null) {
            com.google.gson.internal.a.i("Null identifier");
            return;
        }
        String str18 = xVar2.c().f11607a;
        m8.q qVar = aVar2.h;
        if (((m8.q) qVar.f7781l) == null) {
            qVar.f7781l = new m8.q(qVar);
        }
        m8.q qVar2 = (m8.q) qVar.f7781l;
        String str19 = (String) qVar2.f7780b;
        if (qVar2 == null) {
            qVar.f7781l = new m8.q(qVar);
        }
        i0Var.g = new k0(str17, str14, str15, str18, str19, (String) ((m8.q) qVar.f7781l).f7781l);
        h1 h1Var = new h1();
        h1Var.f800a = 3;
        h1Var.f804e = (byte) (h1Var.f804e | 1);
        if (str6 == null) {
            com.google.gson.internal.a.i("Null version");
            return;
        }
        h1Var.f801b = str6;
        if (str2 == null) {
            com.google.gson.internal.a.i("Null buildVersion");
            return;
        }
        h1Var.f802c = str2;
        h1Var.f803d = g.g();
        h1Var.f804e = (byte) (h1Var.f804e | 2);
        i0Var.i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) r.f.get(str8.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(rVar.f11669a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = g.f();
        int iC2 = g.c();
        m0 m0Var = new m0();
        m0Var.f866a = iIntValue;
        byte b10 = (byte) (m0Var.j | 1);
        m0Var.j = b10;
        if (str5 == null) {
            com.google.gson.internal.a.i("Null model");
            return;
        }
        m0Var.f867b = str5;
        m0Var.f868c = iAvailableProcessors2;
        m0Var.f869d = jA2;
        m0Var.f870e = blockCount2;
        m0Var.f = zF2;
        m0Var.g = iC2;
        m0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            com.google.gson.internal.a.i("Null manufacturer");
            return;
        }
        m0Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            com.google.gson.internal.a.i("Null modelClass");
            return;
        }
        m0Var.i = str21;
        i0Var.j = m0Var.a();
        i0Var.f816l = 3;
        i0Var.f817m = (byte) (i0Var.f817m | 4);
        a0Var.j = i0Var.a();
        b0 b0VarA = a0Var.a();
        e2.d dVar3 = ((e2.b) dVar2.f4467l).f4461b;
        m2 m2Var = b0VarA.f737k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((j0) m2Var).f831b;
        try {
            e2.b.g.getClass();
            e2.b.f(dVar3.h(str22, "report"), c2.c.f1184a.z(b0VarA));
            File fileH = dVar3.h(str22, "start-time");
            long j = ((j0) m2Var).f833d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileH), e2.b.f4459e);
            try {
                outputStreamWriter.write("");
                fileH.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String strJ2 = a4.x.j("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strJ2, e10);
            }
        }
    }

    public final boolean d(g2.e eVar) throws Throwable {
        z1.e.a();
        s sVar = this.f11644n;
        if (sVar != null && sVar.f11678e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, eVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((e2.b) this.f11643m.f4467l).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Context context = this.f11636a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", TypedValues.Custom.S_STRING);
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f11635s), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = resourceAsStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                resourceAsStream.close();
                return strEncodeToString;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            resourceAsStream.close();
            throw th;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    ((a2.t) this.f11639d.f4470o).l("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f11636a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final void h(j1.p pVar) {
        j1.p pVar2;
        j1.p pVarA;
        j1.i iVar = this.f11645o;
        e2.d dVar = ((e2.b) this.f11643m.f4467l).f4461b;
        if (e2.d.n(((File) dVar.f4470o).listFiles()).isEmpty() && e2.d.n(((File) dVar.f4471p).listFiles()).isEmpty() && e2.d.n(((File) dVar.f4472q).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            iVar.c(Boolean.FALSE);
            return;
        }
        v1.c cVar = v1.c.f10791a;
        cVar.c("Crash reports are available to be sent.");
        t tVar = this.f11637b;
        if (tVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            iVar.c(Boolean.FALSE);
            pVarA = t1.x(Boolean.TRUE);
        } else {
            cVar.b("Automatic data collection is disabled.");
            cVar.c("Notifying that unsent reports are available.");
            iVar.c(Boolean.TRUE);
            synchronized (tVar.f11681c) {
                pVar2 = tVar.f11682d.f6539a;
            }
            q1.a aVar = new q1.a(18);
            pVar2.getClass();
            p2 p2Var = j1.j.f6540a;
            j1.p pVar3 = new j1.p();
            pVar2.f6561b.e(new j1.m(p2Var, aVar, pVar3));
            pVar2.p();
            cVar.b("Waiting for send/deleteUnsentReports to be called.");
            pVarA = z1.a.a(pVar3, this.f11646p.f6539a);
        }
        pVarA.j(this.f11640e.f11908a, new m8.q(this, pVar));
    }
}
