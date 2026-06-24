package x;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b5.m;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import q.g0;
import q.h0;
import q.j0;
import q.l;
import q.n;
import q.p;
import q.q;
import q.r;
import q.s;
import q.t;
import q.v;
import q.z;
import r.i;
import r.j;
import r.o;
import t4.n0;
import y.h;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.d f11029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.d f11030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f11031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f11032e;
    public final z.c f;
    public final q2.e g;
    public final q2.e h;
    public final y.c i;

    public g(Context context, s.d dVar, y.d dVar2, n0 n0Var, Executor executor, z.c cVar, q2.e eVar, q2.e eVar2, y.c cVar2) {
        this.f11028a = context;
        this.f11029b = dVar;
        this.f11030c = dVar2;
        this.f11031d = n0Var;
        this.f11032e = executor;
        this.f = cVar;
        this.g = eVar;
        this.h = eVar2;
        this.i = cVar2;
    }

    public final void a(j jVar, int i) {
        byte[] bArr;
        long j;
        s.a aVar;
        String str;
        int i6;
        p.b bVarA;
        String str2;
        Integer numValueOf;
        g2.e eVar;
        ArrayList arrayList;
        final g gVar = this;
        final j jVar2 = jVar;
        byte[] bArr2 = jVar2.f8832b;
        s.e eVarA = gVar.f11029b.a(jVar2.f8831a);
        long jMax = 0;
        while (true) {
            final int i10 = 0;
            z.b bVar = new z.b(gVar) { // from class: x.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f11026b;

                {
                    this.f11026b = gVar;
                }

                @Override // z.b
                public final Object execute() {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            j jVar3 = jVar2;
                            h hVar = (h) this.f11026b.f11030c;
                            SQLiteDatabase sQLiteDatabaseB = hVar.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lC = h.c(sQLiteDatabaseB, jVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseB.endTransaction();
                            }
                        default:
                            h hVar2 = (h) this.f11026b.f11030c;
                            hVar2.getClass();
                            return (Iterable) hVar2.d(new a3.e(8, hVar2, jVar2));
                    }
                }
            };
            h hVar = (h) gVar.f;
            if (!((Boolean) hVar.h(bVar)).booleanValue()) {
                hVar.h(new v1.a(jMax, gVar, jVar2));
                return;
            }
            final int i11 = 1;
            Iterable iterable = (Iterable) hVar.h(new z.b(gVar) { // from class: x.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f11026b;

                {
                    this.f11026b = gVar;
                }

                @Override // z.b
                public final Object execute() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            j jVar3 = jVar2;
                            h hVar2 = (h) this.f11026b.f11030c;
                            SQLiteDatabase sQLiteDatabaseB = hVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lC = h.c(sQLiteDatabaseB, jVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseB.endTransaction();
                            }
                        default:
                            h hVar22 = (h) this.f11026b.f11030c;
                            hVar22.getClass();
                            return (Iterable) hVar22.d(new a3.e(8, hVar22, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                a.a.u("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                aVar = new s.a(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((y.b) it.next()).f11581c);
                }
                if (bArr2 != null) {
                    y.c cVar = gVar.i;
                    Objects.requireNonNull(cVar);
                    u.a aVar2 = (u.a) hVar.h(new v4.a(cVar, 1));
                    r.h hVar2 = new r.h();
                    hVar2.f8823r = new HashMap();
                    hVar2.f8821p = Long.valueOf(gVar.g.f());
                    hVar2.f8822q = Long.valueOf(gVar.h.f());
                    hVar2.f8816b = "GDT_CLIENT_METRICS";
                    o.c cVar2 = new o.c("proto");
                    aVar2.getClass();
                    m mVar = o.f8844a;
                    mVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        mVar.B(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar2.f8820o = new r.m(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList2.add(((p.c) eVarA).a(hVar2.b()));
                }
                p.c cVar3 = (p.c) eVarA;
                HashMap map = new HashMap();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    i iVar = (i) obj;
                    String str3 = iVar.f8826a;
                    if (map.containsKey(str3)) {
                        arrayList = arrayList2;
                        ((List) map.get(str3)).add(iVar);
                    } else {
                        arrayList = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(iVar);
                        map.put(str3, arrayList3);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    i iVar2 = (i) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.f8593a;
                    long jF = cVar3.f.f();
                    long jF2 = cVar3.f8402e.f();
                    n nVar = new n(new l(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (i iVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        r.m mVar2 = iVar3.f8828c;
                        byte[] bArr4 = iVar3.j;
                        o.c cVar4 = mVar2.f8841a;
                        byte[] bArr5 = mVar2.f8842b;
                        long j6 = jMax;
                        if (cVar4.equals(new o.c("proto"))) {
                            eVar = new g2.e();
                            eVar.f5122o = bArr5;
                        } else if (cVar4.equals(new o.c("json"))) {
                            String str4 = new String(bArr5, Charset.forName("UTF-8"));
                            g2.e eVar2 = new g2.e();
                            eVar2.f5123p = str4;
                            eVar = eVar2;
                        } else {
                            String strD = a.a.D("CctTransportBackend");
                            if (Log.isLoggable(strD, 5)) {
                                Log.w(strD, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            jMax = j6;
                        }
                        eVar.f5118b = Long.valueOf(iVar3.f8829d);
                        eVar.f5121n = Long.valueOf(iVar3.f8830e);
                        String str5 = (String) iVar3.f.get("tz-offset");
                        eVar.f5124q = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        eVar.f5125r = new v((h0) h0.f8581a.get(iVar3.b("net-type")), (g0) g0.f8577a.get(iVar3.b("mobile-subtype")));
                        Integer num = iVar3.f8827b;
                        if (num != null) {
                            eVar.f5119l = num;
                        }
                        Integer num2 = iVar3.g;
                        if (num2 != null) {
                            r rVar = new r(new q(num2));
                            z zVar = z.f8627a;
                            eVar.f5120m = new q.o(rVar);
                        }
                        byte[] bArr6 = iVar3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            eVar.f5126s = new p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat = ((Long) eVar.f5118b) == null ? " eventTimeMs" : "";
                        if (((Long) eVar.f5121n) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) eVar.f5124q) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            androidx.privacysandbox.ads.adservices.customaudience.a.i("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList5.add(new s(((Long) eVar.f5118b).longValue(), (Integer) eVar.f5119l, (q.o) eVar.f5120m, ((Long) eVar.f5121n).longValue(), (byte[]) eVar.f5122o, (String) eVar.f5123p, ((Long) eVar.f5124q).longValue(), (v) eVar.f5125r, (p) eVar.f5126s));
                            bArr2 = bArr3;
                            jMax = j6;
                        }
                    }
                    arrayList4.add(new t(jF, jF2, nVar, numValueOf, str2, arrayList5));
                }
                bArr = bArr2;
                j = jMax;
                q.m mVar3 = new q.m(arrayList4);
                URL urlB = cVar3.f8401d;
                if (bArr != null) {
                    try {
                        p.a aVarA = p.a.a(bArr);
                        str = aVarA.f8394b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f8393a;
                        if (str6 != null) {
                            urlB = p.c.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new s.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i13 = 19;
                    m mVar4 = new m(urlB, mVar3, str, i13);
                    androidx.core.view.inputmethod.a aVar3 = new androidx.core.view.inputmethod.a(cVar3, 24);
                    int i14 = 5;
                    do {
                        bVarA = aVar3.a(mVar4);
                        URL url = (URL) bVarA.f8397c;
                        if (url != null) {
                            a.a.u("CctTransportBackend", "Following redirect to: %s", url);
                            mVar4 = new m(url, (q.m) mVar4.f1062l, (String) mVar4.f1063m, i13);
                        } else {
                            mVar4 = null;
                        }
                        if (mVar4 == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = bVarA.f8396b;
                    if (i15 == 200) {
                        aVar = new s.a(1, bVarA.f8395a);
                    } else if (i15 >= 500 || i15 == 404) {
                        aVar = new s.a(2, -1L);
                    } else if (i15 == 400) {
                        try {
                            aVar = new s.a(4, -1L);
                        } catch (IOException e10) {
                            e = e10;
                            a.a.v("CctTransportBackend", "Could not make request to the backend", e);
                            i6 = 2;
                            aVar = new s.a(2, -1L);
                        }
                    } else {
                        aVar = new s.a(3, -1L);
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i6 = 2;
            int i16 = aVar.f9104a;
            if (i16 == i6) {
                hVar.h(new t1.b(this, iterable, jVar, j));
                this.f11031d.e(jVar, i + 1, true);
                return;
            }
            gVar = this;
            jVar2 = jVar;
            long j10 = j;
            hVar.h(new a3.e(6, gVar, iterable));
            if (i16 == 1) {
                jMax = Math.max(j10, aVar.f9105b);
                if (bArr != null) {
                    hVar.h(new v4.a(gVar, 3));
                }
            } else {
                if (i16 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str7 = ((y.b) it2.next()).f11581c.f8826a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    hVar.h(new a3.e(7, gVar, map2));
                }
                jMax = j10;
            }
            bArr2 = bArr;
        }
    }
}
