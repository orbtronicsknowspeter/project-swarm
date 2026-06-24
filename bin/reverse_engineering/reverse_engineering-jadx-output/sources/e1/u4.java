package e1;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.t5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 implements f2 {
    public static volatile u4 T;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public FileLock F;
    public FileChannel G;
    public ArrayList H;
    public ArrayList I;
    public final HashMap K;
    public final HashMap L;
    public final HashMap M;
    public j3 O;
    public String P;
    public d4 Q;
    public long R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f4305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f4306b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f4307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c1 f4308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k4 f4309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f4310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a1 f4311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a1 f4312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y3 f4313r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i1 f4315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t1 f4316u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f4319y;
    public final AtomicBoolean v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedList f4320z = new LinkedList();
    public final HashMap N = new HashMap();
    public final f0.i S = new f0.i(this, 23);
    public long J = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r4 f4314s = new r4(this);

    public u4(v4 v4Var) {
        this.f4316u = t1.s(v4Var.f4332b, null, null);
        a1 a1Var = new a1(this, 2);
        a1Var.i();
        this.f4311p = a1Var;
        a1 a1Var2 = new a1(this, 0);
        a1Var2.i();
        this.f4306b = a1Var2;
        m1 m1Var = new m1(this);
        m1Var.i();
        this.f4305a = m1Var;
        this.K = new HashMap();
        this.L = new HashMap();
        this.M = new HashMap();
        b().p(new a4.f(this, v4Var));
    }

    public static u4 C(Context context) {
        k0.y.g(context);
        k0.y.g(context.getApplicationContext());
        if (T == null) {
            synchronized (u4.class) {
                try {
                    if (T == null) {
                        T = new u4(new v4(context, 0));
                    }
                } finally {
                }
            }
        }
        return T;
    }

    public static final void D(com.google.android.gms.internal.measurement.a3 a3Var, int i, String str) {
        List listG = a3Var.g();
        for (int i6 = 0; i6 < listG.size(); i6++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.e3) listG.get(i6)).p())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.d3 d3VarA = com.google.android.gms.internal.measurement.e3.A();
        d3VarA.g("_err");
        d3VarA.i(i);
        com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) d3VarA.d();
        com.google.android.gms.internal.measurement.d3 d3VarA2 = com.google.android.gms.internal.measurement.e3.A();
        d3VarA2.g("_ev");
        d3VarA2.h(str);
        com.google.android.gms.internal.measurement.e3 e3Var2 = (com.google.android.gms.internal.measurement.e3) d3VarA2.d();
        a3Var.j(e3Var);
        a3Var.j(e3Var2);
    }

    public static final void E(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        List listG = a3Var.g();
        for (int i = 0; i < listG.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.e3) listG.get(i)).p())) {
                a3Var.l(i);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(c5 c5Var) {
        return !TextUtils.isEmpty(c5Var.f3851b);
    }

    public static final void U(p4 p4Var) {
        if (p4Var == null) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Upload Component not created");
        } else {
            if (p4Var.f4192l) {
                return;
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Component not initialized: ".concat(String.valueOf(p4Var.getClass())));
        }
    }

    public static final Boolean V(c5 c5Var) {
        Boolean bool = c5Var.f3864y;
        String str = c5Var.L;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((g2) a3.d.I(str).f63b).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void B() {
        b().g();
        l0();
        if (this.f4317w) {
            return;
        }
        this.f4317w = true;
        b().g();
        FileLock fileLock = this.F;
        t1 t1Var = this.f4316u;
        if (fileLock == null || !fileLock.isValid()) {
            this.f4307l.f3875a.getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(t1Var.f4259a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.G = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.F = fileLockTryLock;
                if (fileLockTryLock == null) {
                    a().f4339o.b("Storage concurrent data access panic");
                    return;
                }
                a().f4346w.b("Storage concurrent access okay");
            } catch (FileNotFoundException e10) {
                a().f4339o.c(e10, "Failed to acquire storage lock");
                return;
            } catch (IOException e11) {
                a().f4339o.c(e11, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e12) {
                a().f4342r.c(e12, "Storage lock already acquired");
                return;
            }
        } else {
            a().f4346w.b("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.G;
        b().g();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().f4339o.b("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i6 = fileChannel.read(byteBufferAllocate);
                if (i6 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i6 != -1) {
                    a().f4342r.c(Integer.valueOf(i6), "Unexpected data length. Bytes read");
                }
            } catch (IOException e13) {
                a().f4339o.c(e13, "Failed to read from channel");
            }
        }
        n0 n0VarR = t1Var.r();
        n0VarR.h();
        int i10 = n0VarR.f4143n;
        b().g();
        if (i > i10) {
            a().f4339o.d(Integer.valueOf(i), "Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10));
            return;
        }
        if (i < i10) {
            FileChannel fileChannel2 = this.G;
            b().g();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().f4339o.b("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i10);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().f4339o.c(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().f4346w.d(Integer.valueOf(i), "Storage version upgraded. Previous, current version", Integer.valueOf(i10));
                    return;
                } catch (IOException e14) {
                    a().f4339o.c(e14, "Failed to write to channel");
                }
            }
            a().f4339o.d(Integer.valueOf(i), "Storage version upgrade failed. Previous, current version", Integer.valueOf(i10));
        }
    }

    public final int F(String str, f0.i iVar) {
        g2 g2VarK;
        m1 m1Var = this.f4305a;
        com.google.android.gms.internal.measurement.a2 a2VarB = m1Var.B(str);
        i2 i2Var = i2.AD_PERSONALIZATION;
        if (a2VarB == null) {
            iVar.A(i2Var, h.FAILSAFE);
            return 1;
        }
        m mVar = this.f4307l;
        U(mVar);
        b1 b1VarI0 = mVar.i0(str);
        if (b1VarI0 == null || ((g2) a3.d.I(b1VarI0.s()).f63b) != g2.POLICY || (g2VarK = m1Var.k(str, i2Var)) == g2.UNINITIALIZED) {
            iVar.A(i2Var, h.REMOTE_DEFAULT);
            if (m1Var.A(str, i2Var)) {
                return 0;
            }
        } else {
            iVar.A(i2Var, h.REMOTE_ENFORCED_DEFAULT);
            if (g2VarK == g2.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(com.google.android.gms.internal.measurement.b3 b3Var) {
        Serializable serializableV;
        HashMap map = new HashMap();
        j0();
        HashMap map2 = new HashMap();
        for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.o()) {
            if (e3Var.p().startsWith("gad_") && (serializableV = a1.v(e3Var)) != null) {
                map2.put(e3Var.p(), serializableV);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        b().g();
        if (this.f4320z.isEmpty()) {
            return;
        }
        if (this.Q == null) {
            this.Q = new d4(this, this.f4316u, 2);
        }
        if (this.Q.f4140c != 0) {
            return;
        }
        f().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) f0.C0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.R));
        a().f4346w.c(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.Q == null) {
            this.Q = new d4(this, this.f4316u, 2);
        }
        this.Q.b(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(3:9|10|(4:12|13|(4:15|(1:22)|25|471)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:476)(2:59|473)|60|51)|472))|61|62|(4:64|65|(0)(1:71)|(7:117|(5:121|(2:123|487)(2:124|(2:126|486)(1:488))|127|118|119)|485|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:504)|143)|503))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|490)(1:492))(5:202|(5:205|(2:208|206)|494|209|203)|493|210|491)|214|196)|489|215|(4:218|(3:496|220|499)(1:498)|497|216)|495|221|(1:223)|500)(1:224)|225|470))|160|193|(0)(0)|225|470)(7:161|162|192|193|(0)(0)|225|470))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|225|470))|173|193|(0)(0)|225|470)|162|192|193|(0)(0)|225|470)(7:174|(2:185|(2:186|(2:188|(2:502|190)(1:191))(1:501)))(0)|192|193|(0)(0)|225|470)))(3:136|149|(0)(0)))(1:72)|70|(3:73|74|(3:76|(2:78|479)(2:79|(2:81|480)(2:82|478))|83)(1:477))|84|(1:87)|(1:89)|90|(1:92)(1:93)|94|(4:99|(4:102|(2:104|483)(2:105|(2:107|482)(1:484))|108|100)|481|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0))))|(0)(0))|226)(1:469))|227|(3:229|(2:231|(2:233|507)(2:234|(1:508)(3:236|(1:238)(1:239)|(1:510)(2:243|506))))(0)|244)|505|245|(3:246|247|(1:511)(2:249|(2:512|251)(1:513)))|252|(1:254)(2:255|(1:257))|258|(1:260)(1:261)|262|(1:264)(1:265)|266|(6:269|(1:271)|272|(2:274|515)(1:516)|275|267)|514|276|(2:281|(1:285))(1:280)|286|(1:288)|289|(1:291)|292|(2:294|(1:300))|301|(8:303|(8:307|308|(4:310|(2:312|(1:314))|(1:331)(5:318|(1:322)|324|(1:329)(1:328)|330)|332)(3:334|(4:465|336|341|(6:343|(3:346|(3:521|348|(3:350|354|(1:356)(6:357|(1:361)|362|(1:364)(1:366)|365|(3:368|(1:376)|377)(4:378|(3:380|(1:382)|383)(4:384|(1:386)(1:387)|388|(3:390|(1:392)|393)(2:394|(1:396)))|397|518)))(2:351|(0)(0)))(1:352)|344)|520|353|354|(0)(0))(3:353|354|(0)(0)))(3:340|341|(0)(0))|398)|333|519|398|304|305)|517|399|(1:401)|402|(2:405|403)|522)(1:406)|407|(1:409)(13:411|(9:413|(1:415)(1:416)|417|(1:419)(1:420)|421|(1:423)(1:424)|425|(1:427)(1:428)|429)|430|(3:432|(2:438|(1:440)(1:441))(1:437)|442)|443|(3:(2:447|524)(1:525)|448|444)|523|449|(1:451)|452|467|453|457)|410|430|(0)|443|(1:444)|523|449|(0)|452|467|453|457) */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0f1c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0f1d, code lost:
    
        r2.f3875a.a().k().d(e1.w0.o(r1), "Failed to remove unused event metadata. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x074e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b16 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0b4a A[PHI: r2
      0x0b4a: PHI (r2v53 long) = (r2v52 long), (r2v76 long) binds: [B:342:0x0b14, B:520:0x0b4a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b62 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b85 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0e31 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0ebe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0eef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d19, B:334:0x0abd, B:336:0x0adb, B:341:0x0af6, B:343:0x0b16, B:344:0x0b1e, B:346:0x0b24, B:348:0x0b36, B:354:0x0b4c, B:356:0x0b62, B:357:0x0b85, B:359:0x0b91, B:361:0x0ba7, B:362:0x0be7, B:368:0x0c03, B:370:0x0c0e, B:372:0x0c12, B:374:0x0c16, B:376:0x0c1a, B:377:0x0c26, B:378:0x0c2b, B:380:0x0c31, B:382:0x0c49, B:383:0x0c4e, B:397:0x0d16, B:384:0x0c8d, B:386:0x0c92, B:390:0x0ca6, B:392:0x0cc5, B:393:0x0ccc, B:396:0x0d0a, B:387:0x0c97, B:339:0x0ae1, B:399:0x0d24, B:401:0x0d31, B:402:0x0d45, B:403:0x0d4d, B:405:0x0d53, B:407:0x0d69, B:409:0x0d7b, B:430:0x0e2b, B:432:0x0e31, B:434:0x0e46, B:437:0x0e4d, B:442:0x0e90, B:438:0x0e5c, B:440:0x0e6a, B:441:0x0e77, B:443:0x0e9f, B:444:0x0eb8, B:447:0x0ec0, B:448:0x0ec5, B:449:0x0ed5, B:451:0x0eef, B:452:0x0f0a, B:453:0x0f12, B:457:0x0f30, B:456:0x0f1d, B:411:0x0d97, B:413:0x0d9d, B:415:0x0dad, B:417:0x0db4, B:423:0x0dca, B:425:0x0dd1, B:427:0x0e1c, B:429:0x0e23, B:428:0x0e20, B:424:0x0dce, B:416:0x0db1, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f39), top: B:464:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(long r47, java.lang.String r49) {
        /*
            Method dump skipped, instruction units count: 3921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.I(long, java.lang.String):boolean");
    }

    public final void J(com.google.android.gms.internal.measurement.i3 i3Var, long j, boolean z9) {
        y4 y4Var;
        Object obj;
        String str = true != z9 ? "_lte" : "_se";
        m mVar = this.f4307l;
        U(mVar);
        y4 y4VarA0 = mVar.a0(i3Var.n(), str);
        if (y4VarA0 == null || (obj = y4VarA0.f4429e) == null) {
            String strN = i3Var.n();
            f().getClass();
            y4Var = new y4(strN, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strN2 = i3Var.n();
            f().getClass();
            y4Var = new y4(strN2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.google.android.gms.internal.measurement.r3 r3VarZ = com.google.android.gms.internal.measurement.s3.z();
        r3VarZ.b();
        ((com.google.android.gms.internal.measurement.s3) r3VarZ.f2687b).B(str);
        f().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r3VarZ.b();
        ((com.google.android.gms.internal.measurement.s3) r3VarZ.f2687b).A(jCurrentTimeMillis);
        Object obj2 = y4Var.f4429e;
        long jLongValue = ((Long) obj2).longValue();
        r3VarZ.b();
        ((com.google.android.gms.internal.measurement.s3) r3VarZ.f2687b).E(jLongValue);
        com.google.android.gms.internal.measurement.s3 s3Var = (com.google.android.gms.internal.measurement.s3) r3VarZ.d();
        int iU = a1.U(i3Var, str);
        if (iU >= 0) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).b0(iU, s3Var);
        } else {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).c0(s3Var);
        }
        if (j > 0) {
            m mVar2 = this.f4307l;
            U(mVar2);
            mVar2.Z(y4Var);
            a().f4346w.d(true != z9 ? "lifetime" : "session-scoped", "Updated engagement user property. scope, value", obj2);
        }
    }

    public final boolean K(com.google.android.gms.internal.measurement.a3 a3Var, com.google.android.gms.internal.measurement.a3 a3Var2) {
        k0.y.b("_e".equals(a3Var.m()));
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarO = a1.o((com.google.android.gms.internal.measurement.b3) a3Var.d(), "_sc");
        String strR = e3VarO == null ? null : e3VarO.r();
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarO2 = a1.o((com.google.android.gms.internal.measurement.b3) a3Var2.d(), "_pc");
        String strR2 = e3VarO2 != null ? e3VarO2.r() : null;
        if (strR2 == null || !strR2.equals(strR)) {
            return false;
        }
        k0.y.b("_e".equals(a3Var.m()));
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarO3 = a1.o((com.google.android.gms.internal.measurement.b3) a3Var.d(), "_et");
        if (e3VarO3 == null || !e3VarO3.s() || e3VarO3.t() <= 0) {
            return true;
        }
        long jT = e3VarO3.t();
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarO4 = a1.o((com.google.android.gms.internal.measurement.b3) a3Var2.d(), "_et");
        if (e3VarO4 != null && e3VarO4.t() > 0) {
            jT += e3VarO4.t();
        }
        j0();
        a1.m(a3Var2, "_et", Long.valueOf(jT));
        j0();
        a1.m(a3Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        b().g();
        l0();
        m mVar = this.f4307l;
        U(mVar);
        if (mVar.Q("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        m mVar2 = this.f4307l;
        U(mVar2);
        return !TextUtils.isEmpty(mVar2.o());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.N():void");
    }

    public final void O() {
        b().g();
        if (this.C || this.D || this.E) {
            a().f4346w.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.E));
            return;
        }
        a().f4346w.b("Stopping uploading service(s)");
        ArrayList arrayList = this.f4319y;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f4319y;
        k0.y.g(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(b1 b1Var) {
        try {
            long jP = b1Var.P();
            t1 t1Var = this.f4316u;
            if (jP != -2147483648L) {
                if (b1Var.P() == r0.c.a(t1Var.f4259a).b(0, b1Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = r0.c.a(t1Var.f4259a).b(0, b1Var.D()).versionName;
                String strN = b1Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final c5 Q(String str) {
        m mVar = this.f4307l;
        U(mVar);
        b1 b1VarI0 = mVar.i0(str);
        if (b1VarI0 != null) {
            t1 t1Var = b1VarI0.f3784a;
            if (!TextUtils.isEmpty(b1VarI0.N())) {
                Boolean boolP = P(b1VarI0);
                if (boolP != null && !boolP.booleanValue()) {
                    a().f4339o.c(w0.o(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = b1VarI0.G();
                String strN = b1VarI0.N();
                long jP = b1VarI0.P();
                q1 q1Var = t1Var.f4265p;
                t1.m(q1Var);
                q1Var.g();
                String str2 = b1VarI0.f3790l;
                q1 q1Var2 = t1Var.f4265p;
                t1.m(q1Var2);
                q1Var2.g();
                long j = b1VarI0.f3791m;
                q1 q1Var3 = t1Var.f4265p;
                t1.m(q1Var3);
                q1Var3.g();
                long j6 = b1VarI0.f3792n;
                q1 q1Var4 = t1Var.f4265p;
                t1.m(q1Var4);
                q1Var4.g();
                boolean z9 = b1VarI0.f3793o;
                String strJ = b1VarI0.J();
                q1 q1Var5 = t1Var.f4265p;
                t1.m(q1Var5);
                q1Var5.g();
                boolean z10 = b1VarI0.f3794p;
                Boolean boolW = b1VarI0.w();
                long jB = b1VarI0.b();
                q1 q1Var6 = t1Var.f4265p;
                t1.m(q1Var6);
                q1Var6.g();
                ArrayList arrayList = b1VarI0.f3797s;
                String strG2 = d(str).g();
                boolean zY = b1VarI0.y();
                q1 q1Var7 = t1Var.f4265p;
                t1.m(q1Var7);
                q1Var7.g();
                long j10 = b1VarI0.v;
                int i = d(str).f4056b;
                String str3 = o0(str).f4168b;
                q1 q1Var8 = t1Var.f4265p;
                t1.m(q1Var8);
                q1Var8.g();
                int i6 = b1VarI0.f3801x;
                q1 q1Var9 = t1Var.f4265p;
                t1.m(q1Var9);
                q1Var9.g();
                return new c5(str, strG, strN, jP, str2, j, j6, (String) null, z9, false, strJ, 0L, 0, z10, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j10, i, str3, i6, b1VarI0.B, b1VarI0.C(), b1VarI0.s(), 0L, b1VarI0.t());
            }
        }
        a().v.c(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        m mVar = this.f4307l;
        U(mVar);
        r rVarE = mVar.E("events", str, str2);
        return rVarE == null || rVarE.f4225c < 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(e1.x4 r24, e1.c5 r25) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.W(e1.x4, e1.c5):void");
    }

    public final void X(String str, c5 c5Var) {
        b().g();
        l0();
        boolean zT = T(c5Var);
        String str2 = c5Var.f3850a;
        if (zT) {
            if (!c5Var.f3857q) {
                c0(c5Var);
                return;
            }
            Boolean boolV = V(c5Var);
            if ("_npa".equals(str) && boolV != null) {
                a().v.b("Falling back to manifest metadata value for ad personalization");
                f().getClass();
                W(new x4(System.currentTimeMillis(), Long.valueOf(true != boolV.booleanValue() ? 0L : 1L), "_npa", "auto"), c5Var);
                return;
            }
            u0 u0Var = a().v;
            t1 t1Var = this.f4316u;
            u0Var.c(t1Var.f4268s.c(str), "Removing user property");
            m mVar = this.f4307l;
            U(mVar);
            mVar.S();
            try {
                c0(c5Var);
                if ("_id".equals(str)) {
                    m mVar2 = this.f4307l;
                    U(mVar2);
                    k0.y.g(str2);
                    mVar2.Y(str2, "_lair");
                }
                m mVar3 = this.f4307l;
                U(mVar3);
                k0.y.g(str2);
                mVar3.Y(str2, str);
                m mVar4 = this.f4307l;
                U(mVar4);
                mVar4.T();
                a().v.c(t1Var.f4268s.c(str), "User property removed");
                m mVar5 = this.f4307l;
                U(mVar5);
                mVar5.U();
            } catch (Throwable th) {
                m mVar6 = this.f4307l;
                U(mVar6);
                mVar6.U();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0420 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [e1.c5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [e1.u4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [e1.u4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(e1.c5 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.Y(e1.c5):void");
    }

    public final void Z(e eVar, c5 c5Var) {
        u uVar;
        k0.y.d(eVar.f3882a);
        k0.y.g(eVar.f3883b);
        k0.y.g(eVar.f3884l);
        k0.y.d(eVar.f3884l.f4402b);
        b().g();
        l0();
        if (T(c5Var)) {
            if (!c5Var.f3857q) {
                c0(c5Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z9 = false;
            eVar2.f3886n = false;
            m mVar = this.f4307l;
            U(mVar);
            mVar.S();
            try {
                m mVar2 = this.f4307l;
                U(mVar2);
                String str = eVar2.f3882a;
                k0.y.g(str);
                e eVarE0 = mVar2.e0(str, eVar2.f3884l.f4402b);
                t1 t1Var = this.f4316u;
                if (eVarE0 != null && !eVarE0.f3883b.equals(eVar2.f3883b)) {
                    a().f4342r.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", t1Var.f4268s.c(eVar2.f3884l.f4402b), eVar2.f3883b, eVarE0.f3883b);
                }
                if (eVarE0 != null && eVarE0.f3886n) {
                    eVar2.f3883b = eVarE0.f3883b;
                    eVar2.f3885m = eVarE0.f3885m;
                    eVar2.f3889q = eVarE0.f3889q;
                    eVar2.f3887o = eVarE0.f3887o;
                    eVar2.f3890r = eVarE0.f3890r;
                    eVar2.f3886n = true;
                    x4 x4Var = eVar2.f3884l;
                    eVar2.f3884l = new x4(eVarE0.f3884l.f4403l, x4Var.c(), x4Var.f4402b, eVarE0.f3884l.f4406o);
                } else if (TextUtils.isEmpty(eVar2.f3887o)) {
                    x4 x4Var2 = eVar2.f3884l;
                    eVar2.f3884l = new x4(eVar2.f3885m, x4Var2.c(), x4Var2.f4402b, eVar2.f3884l.f4406o);
                    eVar2.f3886n = true;
                    z9 = true;
                }
                if (eVar2.f3886n) {
                    x4 x4Var3 = eVar2.f3884l;
                    String str2 = eVar2.f3882a;
                    k0.y.g(str2);
                    String str3 = eVar2.f3883b;
                    String str4 = x4Var3.f4402b;
                    long j = x4Var3.f4403l;
                    Object objC = x4Var3.c();
                    k0.y.g(objC);
                    y4 y4Var = new y4(str2, str3, str4, j, objC);
                    Object obj = y4Var.f4429e;
                    String str5 = y4Var.f4427c;
                    m mVar3 = this.f4307l;
                    U(mVar3);
                    if (mVar3.Z(y4Var)) {
                        a().v.e("User property updated immediately", eVar2.f3882a, t1Var.f4268s.c(str5), obj);
                    } else {
                        a().f4339o.e("(2)Too many active user properties, ignoring", w0.o(eVar2.f3882a), t1Var.f4268s.c(str5), obj);
                    }
                    if (z9 && (uVar = eVar2.f3890r) != null) {
                        l(new u(uVar, eVar2.f3885m), c5Var);
                    }
                }
                m mVar4 = this.f4307l;
                U(mVar4);
                if (mVar4.d0(eVar2)) {
                    a().v.e("Conditional property added", eVar2.f3882a, t1Var.f4268s.c(eVar2.f3884l.f4402b), eVar2.f3884l.c());
                } else {
                    a().f4339o.e("Too many conditional properties, ignoring", w0.o(eVar2.f3882a), t1Var.f4268s.c(eVar2.f3884l.f4402b), eVar2.f3884l.c());
                }
                m mVar5 = this.f4307l;
                U(mVar5);
                mVar5.T();
                m mVar6 = this.f4307l;
                U(mVar6);
                mVar6.U();
            } catch (Throwable th) {
                m mVar7 = this.f4307l;
                U(mVar7);
                mVar7.U();
                throw th;
            }
        }
    }

    @Override // e1.f2
    public final w0 a() {
        t1 t1Var = this.f4316u;
        k0.y.g(t1Var);
        w0 w0Var = t1Var.f4264o;
        t1.m(w0Var);
        return w0Var;
    }

    public final void a0(e eVar, c5 c5Var) {
        k0.y.d(eVar.f3882a);
        k0.y.g(eVar.f3884l);
        k0.y.d(eVar.f3884l.f4402b);
        b().g();
        l0();
        if (T(c5Var)) {
            if (!c5Var.f3857q) {
                c0(c5Var);
                return;
            }
            m mVar = this.f4307l;
            U(mVar);
            mVar.S();
            try {
                c0(c5Var);
                String str = eVar.f3882a;
                k0.y.g(str);
                m mVar2 = this.f4307l;
                U(mVar2);
                e eVarE0 = mVar2.e0(str, eVar.f3884l.f4402b);
                t1 t1Var = this.f4316u;
                if (eVarE0 != null) {
                    a().v.d(eVar.f3882a, "Removing conditional user property", t1Var.f4268s.c(eVar.f3884l.f4402b));
                    m mVar3 = this.f4307l;
                    U(mVar3);
                    mVar3.f0(str, eVar.f3884l.f4402b);
                    if (eVarE0.f3886n) {
                        m mVar4 = this.f4307l;
                        U(mVar4);
                        mVar4.Y(str, eVar.f3884l.f4402b);
                    }
                    u uVar = eVar.f3892t;
                    if (uVar != null) {
                        t tVar = uVar.f4290b;
                        u uVarJ = k0().J(uVar.f4289a, tVar != null ? tVar.g() : null, eVarE0.f3883b, uVar.f4292m, true);
                        k0.y.g(uVarJ);
                        l(uVarJ, c5Var);
                    }
                } else {
                    a().f4342r.d(w0.o(eVar.f3882a), "Conditional user property doesn't exist", t1Var.f4268s.c(eVar.f3884l.f4402b));
                }
                m mVar5 = this.f4307l;
                U(mVar5);
                mVar5.T();
                m mVar6 = this.f4307l;
                U(mVar6);
                mVar6.U();
            } catch (Throwable th) {
                m mVar7 = this.f4307l;
                U(mVar7);
                mVar7.U();
                throw th;
            }
        }
    }

    @Override // e1.f2
    public final q1 b() {
        t1 t1Var = this.f4316u;
        k0.y.g(t1Var);
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        return q1Var;
    }

    public final void b0(c5 c5Var, long j) throws Throwable {
        m mVar = this.f4307l;
        U(mVar);
        String str = c5Var.f3850a;
        k0.y.g(str);
        b1 b1VarI0 = mVar.i0(str);
        if (b1VarI0 != null) {
            k0();
            String str2 = c5Var.f3851b;
            String strG = b1VarI0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                k0.y.g(str2);
                if (!str2.equals(strG)) {
                    a().f4342r.c(w0.o(b1VarI0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    m mVar2 = this.f4307l;
                    U(mVar2);
                    t1 t1Var = mVar2.f3875a;
                    String strD = b1VarI0.D();
                    mVar2.h();
                    mVar2.g();
                    k0.y.d(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseV = mVar2.V();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseV.delete("events", "app_id=?", strArr) + sQLiteDatabaseV.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseV.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseV.delete("apps", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseV.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseV.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseV.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseV.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseV.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseV.delete("trigger_uris", "app_id=?", strArr);
                        if (t1Var.f4262m.q(null, f0.f3932i1)) {
                            iDelete += sQLiteDatabaseV.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            w0 w0Var = t1Var.f4264o;
                            t1.m(w0Var);
                            w0Var.f4346w.d(strD, "Deleted application data. app, records", Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e10) {
                        w0 w0Var2 = t1Var.f4264o;
                        t1.m(w0Var2);
                        w0Var2.f4339o.d(w0.o(strD), "Error deleting application data. appId, error", e10);
                    }
                    b1VarI0 = null;
                }
            }
        }
        if (b1VarI0 != null) {
            boolean z9 = (b1VarI0.P() == -2147483648L || b1VarI0.P() == c5Var.f3859s) ? false : true;
            String strN = b1VarI0.N();
            if (z9 || ((b1VarI0.P() != -2147483648L || strN == null || strN.equals(c5Var.f3852l)) ? false : true)) {
                u uVar = new u("_au", new t(k0.k.e("_pv", strN)), "auto", j);
                if (e0().q(null, f0.d1)) {
                    i(uVar, c5Var);
                } else {
                    j(uVar, c5Var);
                }
            }
        }
    }

    @Override // e1.f2
    public final q2.e c() {
        return this.f4316u.f4261l;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e1.b1 c0(e1.c5 r13) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.c0(e1.c5):e1.b1");
    }

    public final j2 d(String str) {
        j2 j2Var = j2.f4054c;
        b().g();
        l0();
        HashMap map = this.K;
        j2 j2VarZ = (j2) map.get(str);
        if (j2VarZ == null) {
            m mVar = this.f4307l;
            U(mVar);
            j2VarZ = mVar.z(str);
            if (j2VarZ == null) {
                j2VarZ = j2.f4054c;
            }
            b().g();
            l0();
            map.put(str, j2VarZ);
            m mVar2 = this.f4307l;
            U(mVar2);
            mVar2.B(str, j2VarZ);
        }
        return j2VarZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, c5 c5Var) {
        int[] iArr;
        b().g();
        f8.a();
        g gVarE0 = e0();
        String str = c5Var.f3850a;
        if (!gVarE0.q(str, f0.Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().f4339o.b("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        m mVar = this.f4307l;
                        U(mVar);
                        t1 t1Var = mVar.f3875a;
                        int i6 = intArray[i];
                        long j = longArray[i];
                        k0.y.d(str);
                        mVar.g();
                        mVar.h();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = mVar.V().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i6), String.valueOf(j)});
                                w0 w0Var = t1Var.f4264o;
                                t1.m(w0Var);
                                u0 u0Var = w0Var.f4346w;
                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(iDelete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                u0Var.e(sb.toString(), str, Integer.valueOf(i6), Long.valueOf(j));
                            } catch (SQLiteException e10) {
                                e = e10;
                                w0 w0Var2 = t1Var.f4264o;
                                t1.m(w0Var2);
                                w0Var2.f4339o.d(w0.o(str), "Error pruning trigger URIs. appId", e);
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        m mVar2 = this.f4307l;
        U(mVar2);
        String str2 = c5Var.f3850a;
        k0.y.d(str2);
        mVar2.g();
        mVar2.h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar2.V().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new j4(string, cursorQuery.getInt(2), cursorQuery.getLong(1)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            w0 w0Var3 = mVar2.f3875a.f4264o;
            t1.m(w0Var3);
            w0Var3.f4339o.d(w0.o(str2), "Error querying trigger uris. appId", e12);
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // e1.f2
    public final Context e() {
        return this.f4316u.f4259a;
    }

    public final g e0() {
        t1 t1Var = this.f4316u;
        k0.y.g(t1Var);
        return t1Var.f4262m;
    }

    @Override // e1.f2
    public final p0.a f() {
        t1 t1Var = this.f4316u;
        k0.y.g(t1Var);
        return t1Var.f4269t;
    }

    public final m1 f0() {
        m1 m1Var = this.f4305a;
        U(m1Var);
        return m1Var;
    }

    public final long g() {
        f().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        y3 y3Var = this.f4313r;
        y3Var.h();
        y3Var.g();
        e1 e1Var = y3Var.f4424s;
        long jA = e1Var.a();
        if (jA == 0) {
            a5 a5Var = y3Var.f3875a.f4267r;
            t1.k(a5Var);
            jA = ((long) a5Var.e0().nextInt(86400000)) + 1;
            e1Var.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final m g0() {
        m mVar = this.f4307l;
        U(mVar);
        return mVar;
    }

    public final void h(u uVar, String str) {
        m mVar = this.f4307l;
        U(mVar);
        b1 b1VarI0 = mVar.i0(str);
        if (b1VarI0 != null) {
            t1 t1Var = b1VarI0.f3784a;
            if (!TextUtils.isEmpty(b1VarI0.N())) {
                Boolean boolP = P(b1VarI0);
                if (boolP == null) {
                    if (!"_ui".equals(uVar.f4289a)) {
                        a().f4342r.c(w0.o(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    a().f4339o.c(w0.o(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = b1VarI0.G();
                String strN = b1VarI0.N();
                long jP = b1VarI0.P();
                q1 q1Var = t1Var.f4265p;
                t1.m(q1Var);
                q1Var.g();
                String str2 = b1VarI0.f3790l;
                q1 q1Var2 = t1Var.f4265p;
                t1.m(q1Var2);
                q1Var2.g();
                long j = b1VarI0.f3791m;
                q1 q1Var3 = t1Var.f4265p;
                t1.m(q1Var3);
                q1Var3.g();
                long j6 = b1VarI0.f3792n;
                q1 q1Var4 = t1Var.f4265p;
                t1.m(q1Var4);
                q1Var4.g();
                boolean z9 = b1VarI0.f3793o;
                String strJ = b1VarI0.J();
                q1 q1Var5 = t1Var.f4265p;
                t1.m(q1Var5);
                q1Var5.g();
                boolean z10 = b1VarI0.f3794p;
                Boolean boolW = b1VarI0.w();
                long jB = b1VarI0.b();
                q1 q1Var6 = t1Var.f4265p;
                t1.m(q1Var6);
                q1Var6.g();
                ArrayList arrayList = b1VarI0.f3797s;
                String strG2 = d(str).g();
                boolean zY = b1VarI0.y();
                q1 q1Var7 = t1Var.f4265p;
                t1.m(q1Var7);
                q1Var7.g();
                long j10 = b1VarI0.v;
                int i = d(str).f4056b;
                String str3 = o0(str).f4168b;
                q1 q1Var8 = t1Var.f4265p;
                t1.m(q1Var8);
                q1Var8.g();
                int i6 = b1VarI0.f3801x;
                q1 q1Var9 = t1Var.f4265p;
                t1.m(q1Var9);
                q1Var9.g();
                i(uVar, new c5(str, strG, strN, jP, str2, j, j6, (String) null, z9, false, strJ, 0L, 0, z10, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j10, i, str3, i6, b1VarI0.B, b1VarI0.C(), b1VarI0.s(), 0L, b1VarI0.t()));
                return;
            }
        }
        a().v.c(str, "No app data available; dropping event");
    }

    public final c1 h0() {
        c1 c1Var = this.f4308m;
        if (c1Var != null) {
            return c1Var;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Network broadcast receiver not created");
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:127), block:B:18:0x007e */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(e1.u r11, e1.c5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.i(e1.u, e1.c5):void");
    }

    public final c i0() {
        c cVar = this.f4310o;
        U(cVar);
        return cVar;
    }

    public final void j(u uVar, c5 c5Var) {
        u uVar2;
        List listH0;
        t1 t1Var;
        List listH02;
        List<e> listH03;
        String str;
        k0.y.g(c5Var);
        String str2 = c5Var.f3850a;
        k0.y.d(str2);
        b().g();
        l0();
        long j = uVar.f4292m;
        x0 x0VarM = x0.m(uVar);
        b().g();
        a5.Y((this.O == null || (str = this.P) == null || !str.equals(str2)) ? null : this.O, (Bundle) x0VarM.f4391e, false);
        u uVarN = x0VarM.n();
        j0();
        if (TextUtils.isEmpty(c5Var.f3851b)) {
            return;
        }
        if (!c5Var.f3857q) {
            c0(c5Var);
            return;
        }
        List list = c5Var.A;
        if (list != null) {
            String str3 = uVarN.f4289a;
            if (!list.contains(str3)) {
                a().v.e("Dropping non-safelisted event. appId, event name, origin", str2, uVarN.f4289a, uVarN.f4291l);
                return;
            } else {
                Bundle bundleG = uVarN.f4290b.g();
                bundleG.putLong("ga_safelisted", 1L);
                uVar2 = new u(str3, new t(bundleG), uVarN.f4291l, uVarN.f4292m);
            }
        } else {
            uVar2 = uVarN;
        }
        m mVar = this.f4307l;
        U(mVar);
        mVar.S();
        try {
            String str4 = uVar2.f4289a;
            if ("_s".equals(str4)) {
                m mVar2 = this.f4307l;
                U(mVar2);
                if (!mVar2.v(str2, "_s") && uVar2.f4290b.f4251a.getLong("_sid") != 0) {
                    m mVar3 = this.f4307l;
                    U(mVar3);
                    if (mVar3.v(str2, "_f")) {
                        m mVar4 = this.f4307l;
                        U(mVar4);
                        mVar4.y(str2, null, "_sid", k(uVar2, str2));
                    } else {
                        m mVar5 = this.f4307l;
                        U(mVar5);
                        if (mVar5.v(str2, "_v")) {
                            m mVar42 = this.f4307l;
                            U(mVar42);
                            mVar42.y(str2, null, "_sid", k(uVar2, str2));
                        } else {
                            m mVar6 = this.f4307l;
                            U(mVar6);
                            f().getClass();
                            mVar6.y(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(uVar2, str2));
                        }
                    }
                }
            }
            m mVar7 = this.f4307l;
            U(mVar7);
            k0.y.d(str2);
            mVar7.g();
            mVar7.h();
            if (j < 0) {
                w0 w0Var = mVar7.f3875a.f4264o;
                t1.m(w0Var);
                w0Var.f4342r.d(w0.o(str2), "Invalid time querying timed out conditional properties", Long.valueOf(j));
                listH0 = Collections.EMPTY_LIST;
            } else {
                listH0 = mVar7.h0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listH0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                t1Var = this.f4316u;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    a().f4346w.e("User property timed out", eVar.f3882a, t1Var.f4268s.c(eVar.f3884l.f4402b), eVar.f3884l.c());
                    u uVar3 = eVar.f3888p;
                    if (uVar3 != null) {
                        l(new u(uVar3, j), c5Var);
                    }
                    m mVar8 = this.f4307l;
                    U(mVar8);
                    mVar8.f0(str2, eVar.f3884l.f4402b);
                }
            }
            m mVar9 = this.f4307l;
            U(mVar9);
            k0.y.d(str2);
            mVar9.g();
            mVar9.h();
            if (j < 0) {
                w0 w0Var2 = mVar9.f3875a.f4264o;
                t1.m(w0Var2);
                w0Var2.f4342r.d(w0.o(str2), "Invalid time querying expired conditional properties", Long.valueOf(j));
                listH02 = Collections.EMPTY_LIST;
            } else {
                listH02 = mVar9.h0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listH02.size());
            Iterator it2 = listH02.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    a().f4346w.e("User property expired", eVar2.f3882a, t1Var.f4268s.c(eVar2.f3884l.f4402b), eVar2.f3884l.c());
                    m mVar10 = this.f4307l;
                    U(mVar10);
                    mVar10.Y(str2, eVar2.f3884l.f4402b);
                    u uVar4 = eVar2.f3892t;
                    if (uVar4 != null) {
                        arrayList.add(uVar4);
                    }
                    m mVar11 = this.f4307l;
                    U(mVar11);
                    mVar11.f0(str2, eVar2.f3884l.f4402b);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(new u((u) obj, j), c5Var);
            }
            m mVar12 = this.f4307l;
            U(mVar12);
            k0.y.d(str2);
            k0.y.d(str4);
            mVar12.g();
            mVar12.h();
            if (j < 0) {
                t1 t1Var2 = mVar12.f3875a;
                w0 w0Var3 = t1Var2.f4264o;
                t1.m(w0Var3);
                w0Var3.f4342r.e("Invalid time querying triggered conditional properties", w0.o(str2), t1Var2.f4268s.a(str4), Long.valueOf(j));
                listH03 = Collections.EMPTY_LIST;
            } else {
                listH03 = mVar12.h0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listH03.size());
            for (e eVar3 : listH03) {
                if (eVar3 != null) {
                    x4 x4Var = eVar3.f3884l;
                    String str5 = eVar3.f3882a;
                    k0.y.g(str5);
                    String str6 = eVar3.f3883b;
                    String str7 = x4Var.f4402b;
                    Object objC = x4Var.c();
                    k0.y.g(objC);
                    y4 y4Var = new y4(str5, str6, str7, j, objC);
                    Object obj2 = y4Var.f4429e;
                    String str8 = y4Var.f4427c;
                    m mVar13 = this.f4307l;
                    U(mVar13);
                    if (mVar13.Z(y4Var)) {
                        a().f4346w.e("User property triggered", eVar3.f3882a, t1Var.f4268s.c(str8), obj2);
                    } else {
                        a().f4339o.e("Too many active user properties, ignoring", w0.o(eVar3.f3882a), t1Var.f4268s.c(str8), obj2);
                    }
                    u uVar5 = eVar3.f3890r;
                    if (uVar5 != null) {
                        arrayList2.add(uVar5);
                    }
                    eVar3.f3884l = new x4(y4Var);
                    eVar3.f3886n = true;
                    m mVar14 = this.f4307l;
                    U(mVar14);
                    mVar14.d0(eVar3);
                }
            }
            l(uVar2, c5Var);
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj3 = arrayList2.get(i6);
                i6++;
                l(new u((u) obj3, j), c5Var);
            }
            m mVar15 = this.f4307l;
            U(mVar15);
            mVar15.T();
            m mVar16 = this.f4307l;
            U(mVar16);
            mVar16.U();
        } catch (Throwable th) {
            m mVar17 = this.f4307l;
            U(mVar17);
            mVar17.U();
            throw th;
        }
    }

    public final a1 j0() {
        a1 a1Var = this.f4311p;
        U(a1Var);
        return a1Var;
    }

    public final Bundle k(u uVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", uVar.f4290b.f4251a.getLong("_sid"));
        m mVar = this.f4307l;
        U(mVar);
        y4 y4VarA0 = mVar.a0(str, "_sno");
        if (y4VarA0 != null) {
            Object obj = y4VarA0.f4429e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final a5 k0() {
        t1 t1Var = this.f4316u;
        k0.y.g(t1Var);
        a5 a5Var = t1Var.f4267r;
        t1.k(a5Var);
        return a5Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:74|(12:76|(0)(1:79)|80|87|(1:89)|91|(0)(0)|94|102|(0)(0)|157|158)|78|81|396|82|86|80|87|(0)(0)|91|(0)(0)|94|102|(0)(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02fe, code lost:
    
        r10.f3875a.a().k().d(e1.w0.o(r13), "Error pruning currencies. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e3 A[Catch: all -> 0x01eb, TryCatch #8 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036a, B:102:0x03a7, B:104:0x03e3, B:106:0x03e8, B:107:0x03ff, B:109:0x040a, B:111:0x0424, B:113:0x042a, B:114:0x0441, B:117:0x0460, B:121:0x0482, B:122:0x0499, B:123:0x04a2, B:126:0x04bf, B:127:0x04d3, B:129:0x04db, B:131:0x04e5, B:133:0x04eb, B:134:0x04f2, B:136:0x04ff, B:138:0x0507, B:140:0x050f, B:142:0x0517, B:143:0x0523, B:144:0x0530, B:150:0x0574, B:151:0x0589, B:153:0x05b6, B:156:0x05e0, B:160:0x0630, B:163:0x065e, B:165:0x068b, B:166:0x068e, B:168:0x0694, B:170:0x069c, B:172:0x06a2, B:174:0x06aa, B:176:0x06b0, B:180:0x06bf, B:183:0x06ce, B:185:0x06d7, B:187:0x06df, B:190:0x0710, B:192:0x0719, B:196:0x072e, B:201:0x073b, B:236:0x07b6, B:237:0x07bd, B:239:0x07e0, B:242:0x07e9, B:246:0x07f4, B:247:0x080e, B:249:0x0814, B:251:0x082e, B:253:0x083a, B:255:0x0847, B:262:0x0878, B:266:0x0882, B:267:0x0885, B:269:0x0892, B:270:0x0895, B:281:0x08d9, B:260:0x0866, B:240:0x07e3, B:204:0x0744, B:208:0x0751, B:212:0x075f, B:216:0x076d, B:220:0x077b, B:224:0x0789, B:228:0x0795, B:232:0x07a3, B:162:0x0651, B:147:0x055b, B:95:0x037c, B:96:0x0388, B:98:0x038e, B:100:0x039c, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032c, B:89:0x0336, B:81:0x02d2, B:82:0x02eb, B:86:0x0311, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:395:0x01cc, inners: #0, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0882 A[Catch: all -> 0x01eb, TryCatch #8 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036a, B:102:0x03a7, B:104:0x03e3, B:106:0x03e8, B:107:0x03ff, B:109:0x040a, B:111:0x0424, B:113:0x042a, B:114:0x0441, B:117:0x0460, B:121:0x0482, B:122:0x0499, B:123:0x04a2, B:126:0x04bf, B:127:0x04d3, B:129:0x04db, B:131:0x04e5, B:133:0x04eb, B:134:0x04f2, B:136:0x04ff, B:138:0x0507, B:140:0x050f, B:142:0x0517, B:143:0x0523, B:144:0x0530, B:150:0x0574, B:151:0x0589, B:153:0x05b6, B:156:0x05e0, B:160:0x0630, B:163:0x065e, B:165:0x068b, B:166:0x068e, B:168:0x0694, B:170:0x069c, B:172:0x06a2, B:174:0x06aa, B:176:0x06b0, B:180:0x06bf, B:183:0x06ce, B:185:0x06d7, B:187:0x06df, B:190:0x0710, B:192:0x0719, B:196:0x072e, B:201:0x073b, B:236:0x07b6, B:237:0x07bd, B:239:0x07e0, B:242:0x07e9, B:246:0x07f4, B:247:0x080e, B:249:0x0814, B:251:0x082e, B:253:0x083a, B:255:0x0847, B:262:0x0878, B:266:0x0882, B:267:0x0885, B:269:0x0892, B:270:0x0895, B:281:0x08d9, B:260:0x0866, B:240:0x07e3, B:204:0x0744, B:208:0x0751, B:212:0x075f, B:216:0x076d, B:220:0x077b, B:224:0x0789, B:228:0x0795, B:232:0x07a3, B:162:0x0651, B:147:0x055b, B:95:0x037c, B:96:0x0388, B:98:0x038e, B:100:0x039c, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032c, B:89:0x0336, B:81:0x02d2, B:82:0x02eb, B:86:0x0311, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:395:0x01cc, inners: #0, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0892 A[Catch: all -> 0x01eb, TryCatch #8 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036a, B:102:0x03a7, B:104:0x03e3, B:106:0x03e8, B:107:0x03ff, B:109:0x040a, B:111:0x0424, B:113:0x042a, B:114:0x0441, B:117:0x0460, B:121:0x0482, B:122:0x0499, B:123:0x04a2, B:126:0x04bf, B:127:0x04d3, B:129:0x04db, B:131:0x04e5, B:133:0x04eb, B:134:0x04f2, B:136:0x04ff, B:138:0x0507, B:140:0x050f, B:142:0x0517, B:143:0x0523, B:144:0x0530, B:150:0x0574, B:151:0x0589, B:153:0x05b6, B:156:0x05e0, B:160:0x0630, B:163:0x065e, B:165:0x068b, B:166:0x068e, B:168:0x0694, B:170:0x069c, B:172:0x06a2, B:174:0x06aa, B:176:0x06b0, B:180:0x06bf, B:183:0x06ce, B:185:0x06d7, B:187:0x06df, B:190:0x0710, B:192:0x0719, B:196:0x072e, B:201:0x073b, B:236:0x07b6, B:237:0x07bd, B:239:0x07e0, B:242:0x07e9, B:246:0x07f4, B:247:0x080e, B:249:0x0814, B:251:0x082e, B:253:0x083a, B:255:0x0847, B:262:0x0878, B:266:0x0882, B:267:0x0885, B:269:0x0892, B:270:0x0895, B:281:0x08d9, B:260:0x0866, B:240:0x07e3, B:204:0x0744, B:208:0x0751, B:212:0x075f, B:216:0x076d, B:220:0x077b, B:224:0x0789, B:228:0x0795, B:232:0x07a3, B:162:0x0651, B:147:0x055b, B:95:0x037c, B:96:0x0388, B:98:0x038e, B:100:0x039c, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032c, B:89:0x0336, B:81:0x02d2, B:82:0x02eb, B:86:0x0311, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:395:0x01cc, inners: #0, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09a6 A[Catch: all -> 0x093a, TryCatch #6 {all -> 0x093a, blocks: (B:273:0x08ab, B:275:0x08b6, B:277:0x08c4, B:279:0x08ce, B:282:0x08e2, B:284:0x08ec, B:286:0x08f8, B:288:0x0902, B:290:0x0910, B:292:0x0928, B:296:0x0941, B:298:0x094f, B:299:0x0958, B:301:0x0963, B:303:0x09a6, B:306:0x09b1, B:307:0x09bb, B:308:0x09bc, B:310:0x09c6, B:276:0x08bb), top: B:392:0x08ab }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09c6 A[Catch: all -> 0x093a, TRY_LEAVE, TryCatch #6 {all -> 0x093a, blocks: (B:273:0x08ab, B:275:0x08b6, B:277:0x08c4, B:279:0x08ce, B:282:0x08e2, B:284:0x08ec, B:286:0x08f8, B:288:0x0902, B:290:0x0910, B:292:0x0928, B:296:0x0941, B:298:0x094f, B:299:0x0958, B:301:0x0963, B:303:0x09a6, B:306:0x09b1, B:307:0x09bb, B:308:0x09bc, B:310:0x09c6, B:276:0x08bb), top: B:392:0x08ab }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a37 A[Catch: all -> 0x09f4, TryCatch #1 {all -> 0x09f4, blocks: (B:312:0x09cf, B:314:0x09e6, B:318:0x09f7, B:320:0x0a2f, B:322:0x0a37, B:324:0x0a41, B:325:0x0a4b, B:327:0x0a55, B:328:0x0a5f, B:329:0x0a68, B:331:0x0a6e, B:333:0x0ab8, B:335:0x0aca, B:339:0x0ae9, B:341:0x0af9, B:338:0x0ad9, B:345:0x0b0c, B:346:0x0b4e, B:347:0x0b59, B:348:0x0b6c, B:350:0x0b72, B:359:0x0bb9, B:360:0x0c01, B:362:0x0c12, B:376:0x0c73, B:367:0x0c2a, B:368:0x0c2d, B:353:0x0b80, B:355:0x0ba6, B:373:0x0c46, B:374:0x0c5d, B:375:0x0c5e), top: B:384:0x09cf, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a55 A[Catch: all -> 0x09f4, TryCatch #1 {all -> 0x09f4, blocks: (B:312:0x09cf, B:314:0x09e6, B:318:0x09f7, B:320:0x0a2f, B:322:0x0a37, B:324:0x0a41, B:325:0x0a4b, B:327:0x0a55, B:328:0x0a5f, B:329:0x0a68, B:331:0x0a6e, B:333:0x0ab8, B:335:0x0aca, B:339:0x0ae9, B:341:0x0af9, B:338:0x0ad9, B:345:0x0b0c, B:346:0x0b4e, B:347:0x0b59, B:348:0x0b6c, B:350:0x0b72, B:359:0x0bb9, B:360:0x0c01, B:362:0x0c12, B:376:0x0c73, B:367:0x0c2a, B:368:0x0c2d, B:353:0x0b80, B:355:0x0ba6, B:373:0x0c46, B:374:0x0c5d, B:375:0x0c5e), top: B:384:0x09cf, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a6e A[Catch: all -> 0x09f4, TryCatch #1 {all -> 0x09f4, blocks: (B:312:0x09cf, B:314:0x09e6, B:318:0x09f7, B:320:0x0a2f, B:322:0x0a37, B:324:0x0a41, B:325:0x0a4b, B:327:0x0a55, B:328:0x0a5f, B:329:0x0a68, B:331:0x0a6e, B:333:0x0ab8, B:335:0x0aca, B:339:0x0ae9, B:341:0x0af9, B:338:0x0ad9, B:345:0x0b0c, B:346:0x0b4e, B:347:0x0b59, B:348:0x0b6c, B:350:0x0b72, B:359:0x0bb9, B:360:0x0c01, B:362:0x0c12, B:376:0x0c73, B:367:0x0c2a, B:368:0x0c2d, B:353:0x0b80, B:355:0x0ba6, B:373:0x0c46, B:374:0x0c5d, B:375:0x0c5e), top: B:384:0x09cf, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b72 A[Catch: all -> 0x09f4, TryCatch #1 {all -> 0x09f4, blocks: (B:312:0x09cf, B:314:0x09e6, B:318:0x09f7, B:320:0x0a2f, B:322:0x0a37, B:324:0x0a41, B:325:0x0a4b, B:327:0x0a55, B:328:0x0a5f, B:329:0x0a68, B:331:0x0a6e, B:333:0x0ab8, B:335:0x0aca, B:339:0x0ae9, B:341:0x0af9, B:338:0x0ad9, B:345:0x0b0c, B:346:0x0b4e, B:347:0x0b59, B:348:0x0b6c, B:350:0x0b72, B:359:0x0bb9, B:360:0x0c01, B:362:0x0c12, B:376:0x0c73, B:367:0x0c2a, B:368:0x0c2d, B:353:0x0b80, B:355:0x0ba6, B:373:0x0c46, B:374:0x0c5d, B:375:0x0c5e), top: B:384:0x09cf, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c12 A[Catch: all -> 0x09f4, SQLiteException -> 0x0c26, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0c26, blocks: (B:360:0x0c01, B:362:0x0c12), top: B:385:0x0c01, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b80 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0336 A[Catch: all -> 0x01eb, TryCatch #8 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036a, B:102:0x03a7, B:104:0x03e3, B:106:0x03e8, B:107:0x03ff, B:109:0x040a, B:111:0x0424, B:113:0x042a, B:114:0x0441, B:117:0x0460, B:121:0x0482, B:122:0x0499, B:123:0x04a2, B:126:0x04bf, B:127:0x04d3, B:129:0x04db, B:131:0x04e5, B:133:0x04eb, B:134:0x04f2, B:136:0x04ff, B:138:0x0507, B:140:0x050f, B:142:0x0517, B:143:0x0523, B:144:0x0530, B:150:0x0574, B:151:0x0589, B:153:0x05b6, B:156:0x05e0, B:160:0x0630, B:163:0x065e, B:165:0x068b, B:166:0x068e, B:168:0x0694, B:170:0x069c, B:172:0x06a2, B:174:0x06aa, B:176:0x06b0, B:180:0x06bf, B:183:0x06ce, B:185:0x06d7, B:187:0x06df, B:190:0x0710, B:192:0x0719, B:196:0x072e, B:201:0x073b, B:236:0x07b6, B:237:0x07bd, B:239:0x07e0, B:242:0x07e9, B:246:0x07f4, B:247:0x080e, B:249:0x0814, B:251:0x082e, B:253:0x083a, B:255:0x0847, B:262:0x0878, B:266:0x0882, B:267:0x0885, B:269:0x0892, B:270:0x0895, B:281:0x08d9, B:260:0x0866, B:240:0x07e3, B:204:0x0744, B:208:0x0751, B:212:0x075f, B:216:0x076d, B:220:0x077b, B:224:0x0789, B:228:0x0795, B:232:0x07a3, B:162:0x0651, B:147:0x055b, B:95:0x037c, B:96:0x0388, B:98:0x038e, B:100:0x039c, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032c, B:89:0x0336, B:81:0x02d2, B:82:0x02eb, B:86:0x0311, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:395:0x01cc, inners: #0, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037c A[Catch: all -> 0x01eb, TryCatch #8 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036a, B:102:0x03a7, B:104:0x03e3, B:106:0x03e8, B:107:0x03ff, B:109:0x040a, B:111:0x0424, B:113:0x042a, B:114:0x0441, B:117:0x0460, B:121:0x0482, B:122:0x0499, B:123:0x04a2, B:126:0x04bf, B:127:0x04d3, B:129:0x04db, B:131:0x04e5, B:133:0x04eb, B:134:0x04f2, B:136:0x04ff, B:138:0x0507, B:140:0x050f, B:142:0x0517, B:143:0x0523, B:144:0x0530, B:150:0x0574, B:151:0x0589, B:153:0x05b6, B:156:0x05e0, B:160:0x0630, B:163:0x065e, B:165:0x068b, B:166:0x068e, B:168:0x0694, B:170:0x069c, B:172:0x06a2, B:174:0x06aa, B:176:0x06b0, B:180:0x06bf, B:183:0x06ce, B:185:0x06d7, B:187:0x06df, B:190:0x0710, B:192:0x0719, B:196:0x072e, B:201:0x073b, B:236:0x07b6, B:237:0x07bd, B:239:0x07e0, B:242:0x07e9, B:246:0x07f4, B:247:0x080e, B:249:0x0814, B:251:0x082e, B:253:0x083a, B:255:0x0847, B:262:0x0878, B:266:0x0882, B:267:0x0885, B:269:0x0892, B:270:0x0895, B:281:0x08d9, B:260:0x0866, B:240:0x07e3, B:204:0x0744, B:208:0x0751, B:212:0x075f, B:216:0x076d, B:220:0x077b, B:224:0x0789, B:228:0x0795, B:232:0x07a3, B:162:0x0651, B:147:0x055b, B:95:0x037c, B:96:0x0388, B:98:0x038e, B:100:0x039c, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032c, B:89:0x0336, B:81:0x02d2, B:82:0x02eb, B:86:0x0311, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:395:0x01cc, inners: #0, #7, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(e1.u r60, e1.c5 r61) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.l(e1.u, e1.c5):void");
    }

    public final void l0() {
        if (this.v.get()) {
            return;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("UploadController is not initialized");
    }

    public final void m(b1 b1Var, com.google.android.gms.internal.measurement.i3 i3Var) {
        f0.i iVar;
        com.google.android.gms.internal.measurement.s3 s3Var;
        h hVar;
        b().g();
        l0();
        String strA0 = ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).A0();
        EnumMap enumMap = new EnumMap(i2.class);
        int length = strA0.length();
        int length2 = i2.values().length;
        h hVar2 = h.UNSET;
        int i = 0;
        if (length < length2 || strA0.charAt(0) != '1') {
            iVar = new f0.i(20);
        } else {
            i2[] i2VarArrValues = i2.values();
            int length3 = i2VarArrValues.length;
            int i6 = 0;
            int i10 = 1;
            while (i6 < length3) {
                i2 i2Var = i2VarArrValues[i6];
                int i11 = i10 + 1;
                char cCharAt = strA0.charAt(i10);
                h[] hVarArrValues = h.values();
                int length4 = hVarArrValues.length;
                int i12 = i;
                while (true) {
                    if (i12 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = hVarArrValues[i12];
                    if (hVar.f4013a == cCharAt) {
                        break;
                    } else {
                        i12++;
                    }
                }
                enumMap.put(i2Var, hVar);
                i6++;
                i10 = i11;
                i = 0;
            }
            iVar = new f0.i(enumMap);
        }
        String strD = b1Var.D();
        b().g();
        l0();
        j2 j2VarD = d(strD);
        EnumMap enumMap2 = j2VarD.f4055a;
        i2 i2Var2 = i2.AD_STORAGE;
        g2 g2Var = (g2) enumMap2.get(i2Var2);
        g2 g2Var2 = g2.UNINITIALIZED;
        if (g2Var == null) {
            g2Var = g2Var2;
        }
        int i13 = j2VarD.f4056b;
        int iOrdinal = g2Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (iOrdinal == 1) {
            iVar.A(i2Var2, hVar3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            iVar.y(i2Var2, i13);
        } else {
            iVar.A(i2Var2, hVar4);
        }
        i2 i2Var3 = i2.ANALYTICS_STORAGE;
        g2 g2Var3 = (g2) enumMap2.get(i2Var3);
        if (g2Var3 != null) {
            g2Var2 = g2Var3;
        }
        int iOrdinal2 = g2Var2.ordinal();
        if (iOrdinal2 == 1) {
            iVar.A(i2Var3, hVar3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            iVar.y(i2Var3, i13);
        } else {
            iVar.A(i2Var3, hVar4);
        }
        String strD2 = b1Var.D();
        b().g();
        l0();
        o oVarQ0 = q0(strD2, o0(strD2), d(strD2), iVar);
        String str = oVarQ0.f4170d;
        Boolean bool = oVarQ0.f4169c;
        k0.y.g(bool);
        boolean zBooleanValue = bool.booleanValue();
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).e1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).f1(str);
        }
        b().g();
        l0();
        Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).T1()).iterator();
        while (true) {
            if (it.hasNext()) {
                s3Var = (com.google.android.gms.internal.measurement.s3) it.next();
                if ("_npa".equals(s3Var.q())) {
                    break;
                }
            } else {
                s3Var = null;
                break;
            }
        }
        if (s3Var != null) {
            EnumMap enumMap3 = (EnumMap) iVar.f4811b;
            i2 i2Var4 = i2.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(i2Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                m mVar = this.f4307l;
                U(mVar);
                y4 y4VarA0 = mVar.a0(b1Var.D(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (y4VarA0 != null) {
                    String str2 = y4VarA0.f4426b;
                    if ("tcf".equals(str2)) {
                        iVar.A(i2Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        iVar.A(i2Var4, hVar7);
                    } else {
                        iVar.A(i2Var4, hVar6);
                    }
                } else {
                    Boolean boolW = b1Var.w();
                    if (boolW == null || ((boolW.booleanValue() && s3Var.u() != 1) || !(boolW.booleanValue() || s3Var.u() == 0))) {
                        iVar.A(i2Var4, hVar7);
                    } else {
                        iVar.A(i2Var4, hVar6);
                    }
                }
            }
        } else {
            int iF = F(b1Var.D(), iVar);
            com.google.android.gms.internal.measurement.r3 r3VarZ = com.google.android.gms.internal.measurement.s3.z();
            r3VarZ.b();
            ((com.google.android.gms.internal.measurement.s3) r3VarZ.f2687b).B("_npa");
            f().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            r3VarZ.b();
            ((com.google.android.gms.internal.measurement.s3) r3VarZ.f2687b).A(jCurrentTimeMillis);
            r3VarZ.b();
            ((com.google.android.gms.internal.measurement.s3) r3VarZ.f2687b).E(iF);
            com.google.android.gms.internal.measurement.s3 s3Var2 = (com.google.android.gms.internal.measurement.s3) r3VarZ.d();
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).c0(s3Var2);
            a().f4346w.d("non_personalized_ads(_npa)", "Setting user property", Integer.valueOf(iF));
        }
        String string = iVar.toString();
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).d1(string);
        String strD3 = b1Var.D();
        m1 m1Var = this.f4305a;
        m1Var.g();
        m1Var.m(strD3);
        com.google.android.gms.internal.measurement.a2 a2VarB = m1Var.B(strD3);
        boolean z9 = a2VarB == null || !a2VarB.r() || a2VarB.s();
        List listT = i3Var.T();
        for (int i14 = 0; i14 < listT.size(); i14++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.b3) listT.get(i14)).r())) {
                com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.b3) listT.get(i14)).h();
                List listG = a3Var.g();
                int i15 = 0;
                while (true) {
                    if (i15 >= listG.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.e3) listG.get(i15)).p())) {
                        String strR = ((com.google.android.gms.internal.measurement.e3) listG.get(i15)).r();
                        if (z9 && strR.length() > 4) {
                            char[] charArray = strR.toCharArray();
                            int i16 = 1;
                            while (true) {
                                if (i16 >= 64) {
                                    i16 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16 | 1);
                            strR = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.d3 d3VarA = com.google.android.gms.internal.measurement.e3.A();
                        d3VarA.g("_tcfd");
                        d3VarA.h(strR);
                        a3Var.b();
                        ((com.google.android.gms.internal.measurement.b3) a3Var.f2687b).z(i15, (com.google.android.gms.internal.measurement.e3) d3VarA.d());
                    } else {
                        i15++;
                    }
                }
                i3Var.V(i14, a3Var);
                return;
            }
        }
    }

    public final void m0(c5 c5Var) {
        b().g();
        l0();
        String str = c5Var.f3850a;
        k0.y.d(str);
        j2 j2VarC = j2.c(c5Var.G, c5Var.B);
        d(str);
        a().f4346w.d(str, "Setting storage consent for package", j2VarC);
        b().g();
        l0();
        this.K.put(str, j2VarC);
        m mVar = this.f4307l;
        U(mVar);
        mVar.B(str, j2VarC);
    }

    public final void n(b1 b1Var, com.google.android.gms.internal.measurement.i3 i3Var) {
        Serializable serializableV;
        b().g();
        l0();
        com.google.android.gms.internal.measurement.l2 l2VarN = com.google.android.gms.internal.measurement.o2.N();
        t1 t1Var = b1Var.f3784a;
        q1 q1Var = t1Var.f4265p;
        t1.m(q1Var);
        q1Var.g();
        byte[] bArr = b1Var.H;
        if (bArr != null) {
            try {
                l2VarN = (com.google.android.gms.internal.measurement.l2) a1.T(l2VarN, bArr);
            } catch (t5 unused) {
                a().f4342r.c(w0.o(b1Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = i3Var.T().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) it.next();
            if (b3Var.r().equals("_cmp")) {
                com.google.android.gms.internal.measurement.e3 e3VarO = a1.o(b3Var, "gclid");
                Serializable serializableV2 = e3VarO == null ? null : a1.v(e3VarO);
                if (serializableV2 == null) {
                    serializableV2 = "";
                }
                String str = (String) serializableV2;
                com.google.android.gms.internal.measurement.e3 e3VarO2 = a1.o(b3Var, "gbraid");
                Serializable serializableV3 = e3VarO2 == null ? null : a1.v(e3VarO2);
                if (serializableV3 == null) {
                    serializableV3 = "";
                }
                String str2 = (String) serializableV3;
                com.google.android.gms.internal.measurement.e3 e3VarO3 = a1.o(b3Var, "gad_source");
                Serializable serializableV4 = e3VarO3 == null ? null : a1.v(e3VarO3);
                String str3 = (String) (serializableV4 != null ? serializableV4 : "");
                String[] strArrSplit = ((String) f0.f3930h1.a(null)).split(",");
                j0();
                HashMap map = new HashMap();
                for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.o()) {
                    if (Arrays.asList(strArrSplit).contains(e3Var.p()) && (serializableV = a1.v(e3Var)) != null) {
                        map.put(e3Var.p(), serializableV);
                    }
                }
                if (!map.isEmpty()) {
                    com.google.android.gms.internal.measurement.e3 e3VarO4 = a1.o(b3Var, "click_timestamp");
                    Serializable serializableV5 = e3VarO4 == null ? null : a1.v(e3VarO4);
                    long jLongValue = ((Long) (serializableV5 != null ? serializableV5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = b3Var.t();
                    }
                    com.google.android.gms.internal.measurement.e3 e3VarO5 = a1.o(b3Var, "_cis");
                    if ("referrer API v2".equals(e3VarO5 != null ? a1.v(e3VarO5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).M()) {
                            if (str.isEmpty()) {
                                l2VarN.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).p();
                            } else {
                                l2VarN.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).o(str);
                            }
                            if (str2.isEmpty()) {
                                l2VarN.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).r();
                            } else {
                                l2VarN.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).q(str2);
                            }
                            if (str3.isEmpty()) {
                                l2VarN.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).t();
                            } else {
                                l2VarN.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).s(str3);
                            }
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).u(jLongValue);
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).w().clear();
                            HashMap mapG = G(b3Var);
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).w().putAll(mapG);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).E()) {
                        if (str.isEmpty()) {
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).Q();
                        } else {
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).P(str);
                        }
                        if (str2.isEmpty()) {
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).S();
                        } else {
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).R(str2);
                        }
                        if (str3.isEmpty()) {
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).U();
                        } else {
                            l2VarN.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).T(str3);
                        }
                        l2VarN.b();
                        ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).V(jLongValue);
                        l2VarN.b();
                        ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).v().clear();
                        HashMap mapG2 = G(b3Var);
                        l2VarN.b();
                        ((com.google.android.gms.internal.measurement.o2) l2VarN.f2687b).v().putAll(mapG2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.o2) l2VarN.d()).equals(com.google.android.gms.internal.measurement.o2.O())) {
            com.google.android.gms.internal.measurement.o2 o2Var = (com.google.android.gms.internal.measurement.o2) l2VarN.d();
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).j1(o2Var);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.o2) l2VarN.d()).a();
        q1 q1Var2 = t1Var.f4265p;
        t1.m(q1Var2);
        q1Var2.g();
        b1Var.Q |= b1Var.H != bArrA;
        b1Var.H = bArrA;
        if (b1Var.o()) {
            m mVar = this.f4307l;
            U(mVar);
            mVar.j0(b1Var, false);
        }
        if (e0().q(null, f0.f3928g1)) {
            m mVar2 = this.f4307l;
            U(mVar2);
            mVar2.Y(b1Var.D(), "_lgclid");
        }
    }

    public final void n0(c5 c5Var) {
        b().g();
        l0();
        String str = c5Var.f3850a;
        k0.y.d(str);
        o oVarB = o.b(c5Var.H);
        a().f4346w.d(str, "Setting DMA consent for package", oVarB);
        b().g();
        l0();
        g2 g2VarA = o.c(100, p0(str)).a();
        this.L.put(str, oVarB);
        m mVar = this.f4307l;
        U(mVar);
        k0.y.g(str);
        k0.y.g(oVarB);
        mVar.g();
        mVar.h();
        j2 j2VarZ = mVar.z(str);
        j2 j2Var = j2.f4054c;
        if (j2VarZ == j2Var) {
            mVar.B(str, j2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", oVarB.f4168b);
        mVar.D(contentValues);
        g2 g2VarA2 = o.c(100, p0(str)).a();
        b().g();
        l0();
        g2 g2Var = g2.GRANTED;
        g2 g2Var2 = g2.DENIED;
        boolean z9 = g2VarA == g2Var2 && g2VarA2 == g2Var;
        boolean z10 = g2VarA == g2Var && g2VarA2 == g2Var2;
        if (z9 || z10) {
            a().f4346w.c(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            m mVar2 = this.f4307l;
            U(mVar2);
            if (mVar2.k0(g(), str, false, false, false, false).f < e0().o(str, f0.n0)) {
                bundle.putLong("_r", 1L);
                m mVar3 = this.f4307l;
                U(mVar3);
                a().f4346w.d(str, "_dcu realtime event count", Long.valueOf(mVar3.k0(g(), str, false, false, true, false).f));
            }
            this.S.a(str, "_dcu", bundle);
        }
    }

    public final String o(j2 j2Var) {
        if (!j2Var.i(i2.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().e0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final o o0(String str) {
        b().g();
        l0();
        HashMap map = this.L;
        o oVar = (o) map.get(str);
        if (oVar != null) {
            return oVar;
        }
        m mVar = this.f4307l;
        U(mVar);
        k0.y.g(str);
        mVar.g();
        mVar.h();
        o oVarB = o.b(mVar.C("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, oVarB);
        return oVarB;
    }

    public final void p(ArrayList arrayList) {
        k0.y.b(!arrayList.isEmpty());
        if (this.H != null) {
            a().f4339o.b("Set uploading progress before finishing the previous upload");
        } else {
            this.H = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle p0(String str) {
        b().g();
        l0();
        m1 m1Var = this.f4305a;
        U(m1Var);
        if (m1Var.B(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        j2 j2VarD = d(str);
        Bundle bundle2 = new Bundle();
        Iterator it = j2VarD.f4055a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((g2) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((i2) entry.getKey()).f4038a, str2);
            }
        }
        bundle.putAll(bundle2);
        o oVarQ0 = q0(str, o0(str), j2VarD, new f0.i(20));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : oVarQ0.f4171e.entrySet()) {
            int iOrdinal2 = ((g2) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((i2) entry2.getKey()).f4038a, str3);
            }
        }
        Boolean bool = oVarQ0.f4169c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = oVarQ0.f4170d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        m mVar = this.f4307l;
        U(mVar);
        y4 y4VarA0 = mVar.a0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (y4VarA0 != null ? y4VarA0.f4429e.equals(1L) : F(str, new f0.i(20))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5 A[Catch: all -> 0x0028, TryCatch #3 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:55:0x0179, B:71:0x019f, B:73:0x01a5, B:75:0x01b0, B:79:0x01bb, B:80:0x01be, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:86:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb A[Catch: all -> 0x0028, DONT_GENERATE, TRY_ENTER, TryCatch #3 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:55:0x0179, B:71:0x019f, B:73:0x01a5, B:75:0x01b0, B:79:0x01bb, B:80:0x01be, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:86:0x000e, inners: #0 }] */
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
    public final void q() {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.q():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e1.o q0(java.lang.String r12, e1.o r13, e1.j2 r14, f0.i r15) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.q0(java.lang.String, e1.o, e1.j2, f0.i):e1.o");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[PHI: r0 r11 r24
      0x006d: PHI (r0v113 java.util.List) = (r0v7 java.util.List), (r0v136 java.util.List) binds: [B:108:0x0221, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r11v55 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v57 android.database.Cursor) binds: [B:108:0x0221, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r24v19 long) = (r24v2 long), (r24v20 long) binds: [B:108:0x0221, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x07f2 A[EDGE_INSN: B:436:0x07f2->B:313:0x07f2 BREAK  A[LOOP:4: B:259:0x0649->B:312:0x07e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r32, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.r(long, java.lang.String):void");
    }

    public final boolean s(String str, String str2) {
        m mVar = this.f4307l;
        U(mVar);
        b1 b1VarI0 = mVar.i0(str);
        HashMap map = this.N;
        if (b1VarI0 != null && k0().H(str, b1VarI0.C())) {
            map.remove(str2);
            return true;
        }
        t4 t4Var = (t4) map.get(str2);
        if (t4Var != null) {
            t4Var.f4286a.f().getClass();
            if (System.currentTimeMillis() < t4Var.f4288c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        b().g();
        l0();
        this.E = true;
        try {
            t1 t1Var = this.f4316u;
            t1Var.getClass();
            Boolean bool = t1Var.p().f4360n;
            if (bool == null) {
                a().f4342r.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().f4339o.b("Upload called in the client side when service should be used");
            } else if (this.f4318x > 0) {
                N();
            } else {
                a1 a1Var = this.f4306b;
                U(a1Var);
                if (a1Var.A()) {
                    m mVar = this.f4307l;
                    U(mVar);
                    if (mVar.m(str)) {
                        m mVar2 = this.f4307l;
                        U(mVar2);
                        k0.y.d(str);
                        mVar2.g();
                        mVar2.h();
                        List listL = mVar2.l(str, n4.c(i3.GOOGLE_SIGNAL), 1);
                        w4 w4Var = listL.isEmpty() ? null : (w4) listL.get(0);
                        if (w4Var != null) {
                            com.google.android.gms.internal.measurement.h3 h3Var = w4Var.f4367b;
                            a().f4346w.e("[sgtm] Uploading data from upload queue. appId, type, url", str, w4Var.f4370e, w4Var.f4368c);
                            byte[] bArrA = h3Var.a();
                            if (Log.isLoggable(a().q(), 2)) {
                                a1 a1Var2 = this.f4311p;
                                U(a1Var2);
                                a().f4346w.e("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), a1Var2.J(h3Var));
                            }
                            q4 q4Var = new q4(w4Var.f4368c, w4Var.f4369d, w4Var.f4370e, null);
                            this.D = true;
                            a1 a1Var3 = this.f4306b;
                            U(a1Var3);
                            a1Var3.F(str, q4Var, h3Var, new b5.m(this, str, (Object) w4Var, 11));
                        }
                    } else {
                        a().f4346w.c(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().f4346w.b("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.E = false;
            O();
        } catch (Throwable th) {
            this.E = false;
            O();
            throw th;
        }
    }

    public final void u(String str, boolean z9, Long l10, Long l11) {
        m mVar = this.f4307l;
        U(mVar);
        b1 b1VarI0 = mVar.i0(str);
        if (b1VarI0 != null) {
            t1 t1Var = b1VarI0.f3784a;
            q1 q1Var = t1Var.f4265p;
            t1.m(q1Var);
            q1Var.g();
            b1VarI0.Q |= b1VarI0.f3802y != z9;
            b1VarI0.f3802y = z9;
            q1 q1Var2 = t1Var.f4265p;
            t1.m(q1Var2);
            q1Var2.g();
            b1VarI0.Q |= !Objects.equals(b1VarI0.f3803z, l10);
            b1VarI0.f3803z = l10;
            q1 q1Var3 = t1Var.f4265p;
            t1.m(q1Var3);
            q1Var3.g();
            b1VarI0.Q |= !Objects.equals(b1VarI0.A, l11);
            b1VarI0.A = l11;
            if (b1VarI0.o()) {
                m mVar2 = this.f4307l;
                U(mVar2);
                mVar2.j0(b1VarI0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.android.gms.internal.measurement.i3 r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.v(com.google.android.gms.internal.measurement.i3, java.lang.String):void");
    }

    public final void w(com.google.android.gms.internal.measurement.i3 i3Var, f1 f1Var) {
        String strZ;
        String strZ2;
        for (int i = 0; i < i3Var.U(); i++) {
            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).S1(i).h();
            Iterator it = a3Var.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.e3) it.next()).p())) {
                    if (((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).F0() >= e0().o(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), f0.f3942m0)) {
                        int iO = e0().o(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), f0.f3966z0);
                        LinkedList linkedList = this.f4320z;
                        a1 a1Var = this.f4311p;
                        if (iO > 0) {
                            m mVar = this.f4307l;
                            U(mVar);
                            if (mVar.k0(g(), ((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), false, false, false, true).g > iO) {
                                com.google.android.gms.internal.measurement.d3 d3VarA = com.google.android.gms.internal.measurement.e3.A();
                                d3VarA.g("_tnr");
                                d3VarA.i(1L);
                                a3Var.j((com.google.android.gms.internal.measurement.e3) d3VarA.d());
                            } else {
                                if (e0().q(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), f0.S0)) {
                                    strZ2 = k0().Z();
                                    com.google.android.gms.internal.measurement.d3 d3VarA2 = com.google.android.gms.internal.measurement.e3.A();
                                    d3VarA2.g("_tu");
                                    d3VarA2.h(strZ2);
                                    a3Var.j((com.google.android.gms.internal.measurement.e3) d3VarA2.d());
                                } else {
                                    strZ2 = null;
                                }
                                com.google.android.gms.internal.measurement.d3 d3VarA3 = com.google.android.gms.internal.measurement.e3.A();
                                d3VarA3.g("_tr");
                                d3VarA3.i(1L);
                                a3Var.j((com.google.android.gms.internal.measurement.e3) d3VarA3.d());
                                U(a1Var);
                                j4 j4VarH = a1Var.H(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), i3Var, a3Var, strZ2);
                                if (j4VarH != null) {
                                    a().f4346w.d(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), "Generated trigger URI. appId, uri", j4VarH.f4062a);
                                    m mVar2 = this.f4307l;
                                    U(mVar2);
                                    mVar2.A(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), j4VarH);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o());
                                    }
                                }
                            }
                        } else {
                            if (e0().q(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), f0.S0)) {
                                strZ = k0().Z();
                                com.google.android.gms.internal.measurement.d3 d3VarA4 = com.google.android.gms.internal.measurement.e3.A();
                                d3VarA4.g("_tu");
                                d3VarA4.h(strZ);
                                a3Var.j((com.google.android.gms.internal.measurement.e3) d3VarA4.d());
                            } else {
                                strZ = null;
                            }
                            com.google.android.gms.internal.measurement.d3 d3VarA5 = com.google.android.gms.internal.measurement.e3.A();
                            d3VarA5.g("_tr");
                            d3VarA5.i(1L);
                            a3Var.j((com.google.android.gms.internal.measurement.e3) d3VarA5.d());
                            U(a1Var);
                            j4 j4VarH2 = a1Var.H(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), i3Var, a3Var, strZ);
                            if (j4VarH2 != null) {
                                a().f4346w.d(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), "Generated trigger URI. appId, uri", j4VarH2.f4062a);
                                m mVar3 = this.f4307l;
                                U(mVar3);
                                mVar3.A(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o(), j4VarH2);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.j3) f1Var.f3968b).o());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) a3Var.d();
                    i3Var.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var.f2687b).W(i, b3Var);
                }
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.d3 d3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (a5.F(((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).p()) || a5.F(str)) {
            g gVarE0 = e0();
            gVarE0.getClass();
            iMax = Math.max(Math.max(Math.min(gVarE0.o(str2, f0.f3931i0), 500), 100), 256);
        } else {
            g gVarE02 = e0();
            gVarE02.getClass();
            iMax = Math.max(Math.min(gVarE02.o(str2, f0.f3931i0), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).r().codePointCount(0, ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).r().length());
        k0();
        String strP = ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).p();
        e0();
        String strL = a5.l(40, strP, true);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).p())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).p())) {
            k0();
            String strR = ((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).r();
            g gVarE03 = e0();
            gVarE03.getClass();
            bundle.putString("_ev", a5.l(Math.max(Math.max(Math.min(gVarE03.o(str2, f0.f3931i0), 500), 100), 256), strR, true));
            return;
        }
        a().f4344t.d(strL, "Param value is too long; discarded. Name, value length", Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strL);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.e3) d3Var.f2687b).p());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0153 A[EDGE_INSN: B:105:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:107:0x00f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x0018, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
      0x008f: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u4.y(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(b1 b1Var) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        b().g();
        if (TextUtils.isEmpty(b1Var.G())) {
            String strD = b1Var.D();
            k0.y.g(strD);
            A(strD, 204, null, null, null);
            return;
        }
        String strD2 = b1Var.D();
        k0.y.g(strD2);
        a().f4346w.c(strD2, "Fetching remote configuration");
        m1 m1Var = this.f4305a;
        U(m1Var);
        com.google.android.gms.internal.measurement.f2 f2VarS = m1Var.s(strD2);
        U(m1Var);
        m1Var.g();
        String str = (String) m1Var.v.get(strD2);
        if (f2VarS != null) {
            if (TextUtils.isEmpty(str)) {
                arrayMap2 = null;
            } else {
                arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", str);
            }
            U(m1Var);
            m1Var.g();
            String str2 = (String) m1Var.f4114w.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (arrayMap2 == null) {
                    arrayMap2 = new ArrayMap();
                }
                arrayMap2.put("If-None-Match", str2);
            }
            arrayMap = arrayMap2;
        } else {
            arrayMap = null;
        }
        this.C = true;
        a1 a1Var = this.f4306b;
        U(a1Var);
        a3.d dVar = new a3.d(this, 26);
        t1 t1Var = a1Var.f3875a;
        a1Var.g();
        a1Var.h();
        r4 r4Var = a1Var.f4092b.f4314s;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) f0.f.a(null)).encodedAuthority((String) f0.g.a(null)).path("config/app/".concat(String.valueOf(b1Var.G()))).appendQueryParameter("platform", "android");
        r4Var.f3875a.f4262m.l();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            q1 q1Var = t1Var.f4265p;
            t1.m(q1Var);
            q1Var.s(new z0(a1Var, b1Var.D(), url, (byte[]) null, arrayMap, dVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            w0 w0Var = t1Var.f4264o;
            t1.m(w0Var);
            w0Var.f4339o.d(w0.o(b1Var.D()), "Failed to parse config URL. Not fetching. appId", string);
        }
    }
}
