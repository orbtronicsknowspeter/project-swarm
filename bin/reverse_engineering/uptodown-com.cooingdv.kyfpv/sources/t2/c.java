package t2;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import b2.t1;
import j1.p;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k0.y;
import m8.q;
import org.json.JSONException;
import org.json.JSONObject;
import s1.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f9542m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.f f9543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2.c f9544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f9546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f9547e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final t1.i i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f9548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f9549l;

    static {
        new AtomicInteger(1);
    }

    public c(n1.f fVar, s2.b bVar, ExecutorService executorService, t1.i iVar) {
        fVar.a();
        v2.c cVar = new v2.c(fVar.f7909a, bVar);
        q qVar = new q(fVar);
        if (q1.a.f8635l == null) {
            q1.a.f8635l = new q1.a(12);
        }
        q1.a aVar = q1.a.f8635l;
        if (j.f9556c == null) {
            j.f9556c = new j(aVar);
        }
        j jVar = j.f9556c;
        m mVar = new m(new s1.c(fVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.f9548k = new HashSet();
        this.f9549l = new ArrayList();
        this.f9543a = fVar;
        this.f9544b = cVar;
        this.f9545c = qVar;
        this.f9546d = jVar;
        this.f9547e = mVar;
        this.f = hVar;
        this.h = executorService;
        this.i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.g) {
            this.f9549l.add(iVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        u2.b bVarO;
        synchronized (f9542m) {
            try {
                n1.f fVar = this.f9543a;
                fVar.a();
                q qVarB = q.b(fVar.f7909a);
                try {
                    bVarO = this.f9545c.o();
                    int i = bVarO.f10406b;
                    boolean z9 = true;
                    if (i != 2 && i != 1) {
                        z9 = false;
                    }
                    if (z9) {
                        String strH = h(bVarO);
                        q qVar = this.f9545c;
                        u2.a aVarA = bVarO.a();
                        aVarA.f10400a = strH;
                        aVarA.f10401b = 3;
                        bVarO = aVarA.a();
                        qVar.l(bVarO);
                    }
                    if (qVarB != null) {
                        qVarB.r();
                    }
                } catch (Throwable th) {
                    if (qVarB != null) {
                        qVarB.r();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(bVarO);
        this.i.execute(new b(this, 2));
    }

    public final u2.b c(u2.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        v2.b bVarF;
        n1.f fVar = this.f9543a;
        fVar.a();
        String str2 = fVar.f7911c.f7919a;
        String str3 = bVar.f10405a;
        fVar.a();
        String str4 = fVar.f7911c.g;
        String str5 = bVar.f10408d;
        v2.c cVar = this.f9544b;
        p.b bVar2 = cVar.f10806c;
        if (!bVar2.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = v2.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str2);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(ShareTarget.METHOD_POST);
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    httpURLConnectionC.setDoOutput(true);
                    v2.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    bVar2.d(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = httpURLConnectionC;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVarF = v2.c.f(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    v2.c.b(httpURLConnectionC, null, str2, str4);
                    httpURLConnection = httpURLConnectionC;
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        str = null;
                        v2.b bVar3 = new v2.b(null, 3, 0L);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar3;
                    } else {
                        if (responseCode == 429) {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            v2.b bVar4 = new v2.b(null, 2, 0L);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVarF = bVar4;
                            str = null;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int iC = c.j.c(bVarF.f10801c);
                if (iC != 0) {
                    if (iC == 1) {
                        u2.a aVarA = bVar.a();
                        aVarA.g = "BAD CONFIG";
                        aVarA.f10401b = 5;
                        return aVarA.a();
                    }
                    if (iC != 2) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    l(str);
                    u2.a aVarA2 = bVar.a();
                    aVarA2.f10401b = 2;
                    return aVarA2.a();
                }
                String str6 = bVarF.f10799a;
                long j = bVarF.f10800b;
                this.f9546d.f9557a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                u2.a aVarA3 = bVar.a();
                aVarA3.f10402c = str6;
                aVarA3.f10404e = j;
                byte b7 = (byte) (aVarA3.h | 1);
                aVarA3.f = jCurrentTimeMillis;
                aVarA3.h = (byte) (b7 | 2);
                return aVarA3.a();
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionC;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final p d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return t1.x(str);
        }
        j1.i iVar = new j1.i();
        a(new g(iVar));
        p pVar = iVar.f6540a;
        this.h.execute(new b(this, 0));
        return pVar;
    }

    public final p e() {
        g();
        j1.i iVar = new j1.i();
        a(new f(this.f9546d, iVar));
        this.h.execute(new b(this, 1));
        return iVar.f6540a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(u2.b bVar) {
        synchronized (f9542m) {
            try {
                n1.f fVar = this.f9543a;
                fVar.a();
                q qVarB = q.b(fVar.f7909a);
                try {
                    this.f9545c.l(bVar);
                    if (qVarB != null) {
                        qVarB.r();
                    }
                } catch (Throwable th) {
                    if (qVarB != null) {
                        qVarB.r();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        n1.f fVar = this.f9543a;
        fVar.a();
        y.e(fVar.f7911c.f7920b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.e(fVar.f7911c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.e(fVar.f7911c.f7919a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f7911c.f7920b;
        Pattern pattern = j.f9555b;
        y.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fVar.a();
        y.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f9555b.matcher(fVar.f7911c.f7919a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(u2.b r3) {
        /*
            r2 = this;
            n1.f r0 = r2.f9543a
            r0.a()
            java.lang.String r0 = r0.f7910b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            n1.f r0 = r2.f9543a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f7910b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            int r3 = r3.f10406b
            r0 = 1
            if (r3 != r0) goto L50
            s1.m r3 = r2.f9547e
            java.lang.Object r3 = r3.get()
            u2.c r3 = (u2.c) r3
            android.content.SharedPreferences r0 = r3.f10411a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            t2.h r3 = r2.f
            r3.getClass()
            java.lang.String r3 = t2.h.a()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            t2.h r3 = r2.f
            r3.getClass()
            java.lang.String r3 = t2.h.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c.h(u2.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [v2.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [v2.a] */
    public final u2.b i(u2.b bVar) throws e {
        int responseCode;
        String str = bVar.f10405a;
        String string = null;
        if (str != null && str.length() == 11) {
            u2.c cVar = (u2.c) this.f9547e.get();
            synchronized (cVar.f10411a) {
                try {
                    String[] strArr = u2.c.f10410c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = cVar.f10411a.getString("|T|" + cVar.f10412b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        v2.c cVar2 = this.f9544b;
        n1.f fVar = this.f9543a;
        fVar.a();
        String str3 = fVar.f7911c.f7919a;
        String str4 = bVar.f10405a;
        n1.f fVar2 = this.f9543a;
        fVar2.a();
        String str5 = fVar2.f7911c.g;
        n1.f fVar3 = this.f9543a;
        fVar3.a();
        String str6 = fVar3.f7911c.f7920b;
        p.b bVar2 = cVar2.f10806c;
        if (!bVar2.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = v2.c.a("projects/" + str5 + "/installations");
        int i6 = 0;
        v2.a aVar = cVar2;
        while (i6 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(ShareTarget.METHOD_POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    v2.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    bVar2.d(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                v2.a aVarE = v2.c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                aVar = aVarE;
            } else {
                try {
                    v2.c.b(httpURLConnectionC, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                if (responseCode == 429) {
                    throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    v2.a aVar2 = new v2.a(null, null, null, null, 2);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = aVar2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i6++;
                    aVar = aVar;
                }
            }
            int iC = c.j.c(aVar.f10798e);
            if (iC != 0) {
                if (iC != 1) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                u2.a aVarA = bVar.a();
                aVarA.g = "BAD CONFIG";
                aVarA.f10401b = 5;
                return aVarA.a();
            }
            String str7 = aVar.f10795b;
            String str8 = aVar.f10796c;
            this.f9546d.f9557a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            v2.b bVar3 = aVar.f10797d;
            String str9 = bVar3.f10799a;
            long j = bVar3.f10800b;
            u2.a aVarA2 = bVar.a();
            aVarA2.f10400a = str7;
            aVarA2.f10401b = 4;
            aVarA2.f10402c = str9;
            aVarA2.f10403d = str8;
            aVarA2.f10404e = j;
            byte b7 = (byte) (aVarA2.h | 1);
            aVarA2.f = jCurrentTimeMillis;
            aVarA2.h = (byte) (b7 | 2);
            return aVarA2.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f9549l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(u2.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.f9549l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(u2.b bVar, u2.b bVar2) {
        try {
            if (this.f9548k.size() != 0 && !TextUtils.equals(bVar.f10405a, bVar2.f10405a)) {
                Iterator it = this.f9548k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
