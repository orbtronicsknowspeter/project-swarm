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
    public static final Object f9541m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.f f9542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2.c f9543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f9545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f9546e;
    public final h f;
    public final Object g;
    public final ExecutorService h;
    public final t1.i i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f9547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f9548l;

    static {
        new AtomicInteger(1);
    }

    public c(n1.f fVar, s2.b bVar, ExecutorService executorService, t1.i iVar) {
        fVar.a();
        v2.c cVar = new v2.c(fVar.f7908a, bVar);
        q qVar = new q(fVar);
        if (q1.a.f8634l == null) {
            q1.a.f8634l = new q1.a(12);
        }
        q1.a aVar = q1.a.f8634l;
        if (j.f9555c == null) {
            j.f9555c = new j(aVar);
        }
        j jVar = j.f9555c;
        m mVar = new m(new s1.c(fVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.f9547k = new HashSet();
        this.f9548l = new ArrayList();
        this.f9542a = fVar;
        this.f9543b = cVar;
        this.f9544c = qVar;
        this.f9545d = jVar;
        this.f9546e = mVar;
        this.f = hVar;
        this.h = executorService;
        this.i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.g) {
            this.f9548l.add(iVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        u2.b bVarO;
        synchronized (f9541m) {
            try {
                n1.f fVar = this.f9542a;
                fVar.a();
                q qVarB = q.b(fVar.f7908a);
                try {
                    bVarO = this.f9544c.o();
                    int i = bVarO.f10405b;
                    boolean z9 = true;
                    if (i != 2 && i != 1) {
                        z9 = false;
                    }
                    if (z9) {
                        String strH = h(bVarO);
                        q qVar = this.f9544c;
                        u2.a aVarA = bVarO.a();
                        aVarA.f10399a = strH;
                        aVarA.f10400b = 3;
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
        n1.f fVar = this.f9542a;
        fVar.a();
        String str2 = fVar.f7910c.f7918a;
        String str3 = bVar.f10404a;
        fVar.a();
        String str4 = fVar.f7910c.g;
        String str5 = bVar.f10407d;
        v2.c cVar = this.f9543b;
        p.b bVar2 = cVar.f10805c;
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
                int iC = c.j.c(bVarF.f10800c);
                if (iC != 0) {
                    if (iC == 1) {
                        u2.a aVarA = bVar.a();
                        aVarA.g = "BAD CONFIG";
                        aVarA.f10400b = 5;
                        return aVarA.a();
                    }
                    if (iC != 2) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    l(str);
                    u2.a aVarA2 = bVar.a();
                    aVarA2.f10400b = 2;
                    return aVarA2.a();
                }
                String str6 = bVarF.f10798a;
                long j = bVarF.f10799b;
                this.f9545d.f9556a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                u2.a aVarA3 = bVar.a();
                aVarA3.f10401c = str6;
                aVarA3.f10403e = j;
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
        p pVar = iVar.f6539a;
        this.h.execute(new b(this, 0));
        return pVar;
    }

    public final p e() {
        g();
        j1.i iVar = new j1.i();
        a(new f(this.f9545d, iVar));
        this.h.execute(new b(this, 1));
        return iVar.f6539a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(u2.b bVar) {
        synchronized (f9541m) {
            try {
                n1.f fVar = this.f9542a;
                fVar.a();
                q qVarB = q.b(fVar.f7908a);
                try {
                    this.f9544c.l(bVar);
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
        n1.f fVar = this.f9542a;
        fVar.a();
        y.e(fVar.f7910c.f7919b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.e(fVar.f7910c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.e(fVar.f7910c.f7918a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f7910c.f7919b;
        Pattern pattern = j.f9554b;
        y.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fVar.a();
        y.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f9554b.matcher(fVar.f7910c.f7918a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(u2.b r3) {
        /*
            r2 = this;
            n1.f r0 = r2.f9542a
            r0.a()
            java.lang.String r0 = r0.f7909b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            n1.f r0 = r2.f9542a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f7909b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            int r3 = r3.f10405b
            r0 = 1
            if (r3 != r0) goto L50
            s1.m r3 = r2.f9546e
            java.lang.Object r3 = r3.get()
            u2.c r3 = (u2.c) r3
            android.content.SharedPreferences r0 = r3.f10410a
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
        String str = bVar.f10404a;
        String string = null;
        if (str != null && str.length() == 11) {
            u2.c cVar = (u2.c) this.f9546e.get();
            synchronized (cVar.f10410a) {
                try {
                    String[] strArr = u2.c.f10409c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = cVar.f10410a.getString("|T|" + cVar.f10411b + "|" + str2, null);
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
        v2.c cVar2 = this.f9543b;
        n1.f fVar = this.f9542a;
        fVar.a();
        String str3 = fVar.f7910c.f7918a;
        String str4 = bVar.f10404a;
        n1.f fVar2 = this.f9542a;
        fVar2.a();
        String str5 = fVar2.f7910c.g;
        n1.f fVar3 = this.f9542a;
        fVar3.a();
        String str6 = fVar3.f7910c.f7919b;
        p.b bVar2 = cVar2.f10805c;
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
            int iC = c.j.c(aVar.f10797e);
            if (iC != 0) {
                if (iC != 1) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                u2.a aVarA = bVar.a();
                aVarA.g = "BAD CONFIG";
                aVarA.f10400b = 5;
                return aVarA.a();
            }
            String str7 = aVar.f10794b;
            String str8 = aVar.f10795c;
            this.f9545d.f9556a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            v2.b bVar3 = aVar.f10796d;
            String str9 = bVar3.f10798a;
            long j = bVar3.f10799b;
            u2.a aVarA2 = bVar.a();
            aVarA2.f10399a = str7;
            aVarA2.f10400b = 4;
            aVarA2.f10401c = str9;
            aVarA2.f10402d = str8;
            aVarA2.f10403e = j;
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
                Iterator it = this.f9548l.iterator();
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
                Iterator it = this.f9548l.iterator();
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
            if (this.f9547k.size() != 0 && !TextUtils.equals(bVar.f10404a, bVar2.f10404a)) {
                Iterator it = this.f9547k.iterator();
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
