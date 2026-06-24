package o8;

import a2.t;
import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.l;
import com.google.android.gms.internal.measurement.i5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import u8.h;
import w8.a0;
import w8.i0;
import w8.x;
import w8.z;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Closeable, Flushable {
    public static final Pattern D = Pattern.compile("[a-z0-9_-]{1,120}");
    public final ThreadPoolExecutor B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f8357b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final File f8358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final File f8359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final File f8360n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8362p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f8365s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8367u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8370y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8371z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8364r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f8366t = new LinkedHashMap(0, 0.75f, true);
    public long A = 0;
    public final a4.f C = new a4.f(this, 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t8.a f8356a = t8.a.f10369a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8361o = 201105;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8363q = 2;

    public f(File file, long j, ThreadPoolExecutor threadPoolExecutor) {
        this.f8357b = file;
        this.f8358l = new File(file, "journal");
        this.f8359m = new File(file, "journal.tmp");
        this.f8360n = new File(file, "journal.bkp");
        this.f8362p = j;
        this.B = threadPoolExecutor;
    }

    public static void z(String str) {
        if (D.matcher(str).matches()) {
            return;
        }
        com.google.gson.internal.a.p(l.w("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final synchronized void b() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c(t tVar, boolean z9) {
        d dVar = (d) tVar.f53b;
        if (dVar.f != tVar) {
            throw new IllegalStateException();
        }
        if (z9 && !dVar.f8351e) {
            for (int i = 0; i < this.f8363q; i++) {
                if (!((boolean[]) tVar.f54c)[i]) {
                    tVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                t8.a aVar = this.f8356a;
                File file = dVar.f8350d[i];
                aVar.getClass();
                if (!file.exists()) {
                    tVar.a();
                    return;
                }
            }
        }
        for (int i6 = 0; i6 < this.f8363q; i6++) {
            File file2 = dVar.f8350d[i6];
            t8.a aVar2 = this.f8356a;
            if (z9) {
                aVar2.getClass();
                if (file2.exists()) {
                    File file3 = dVar.f8349c[i6];
                    this.f8356a.c(file2, file3);
                    long j = dVar.f8348b[i6];
                    this.f8356a.getClass();
                    long length = file3.length();
                    dVar.f8348b[i6] = length;
                    this.f8364r = (this.f8364r - j) + length;
                }
            } else {
                aVar2.a(file2);
            }
        }
        this.f8367u++;
        dVar.f = null;
        if (dVar.f8351e || z9) {
            dVar.f8351e = true;
            z zVar = this.f8365s;
            zVar.m("CLEAN");
            zVar.writeByte(32);
            this.f8365s.m(dVar.f8347a);
            z zVar2 = this.f8365s;
            for (long j6 : dVar.f8348b) {
                zVar2.writeByte(32);
                zVar2.c(j6);
            }
            this.f8365s.writeByte(10);
            if (z9) {
                long j10 = this.A;
                this.A = 1 + j10;
                dVar.g = j10;
            }
        } else {
            this.f8366t.remove(dVar.f8347a);
            z zVar3 = this.f8365s;
            zVar3.m("REMOVE");
            zVar3.writeByte(32);
            this.f8365s.m(dVar.f8347a);
            this.f8365s.writeByte(10);
        }
        this.f8365s.flush();
        if (this.f8364r > this.f8362p || h()) {
            this.B.execute(this.C);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f8368w && !this.f8369x) {
                for (d dVar : (d[]) this.f8366t.values().toArray(new d[this.f8366t.size()])) {
                    t tVar = dVar.f;
                    if (tVar != null) {
                        tVar.a();
                    }
                }
                y();
                this.f8365s.close();
                this.f8365s = null;
                this.f8369x = true;
                return;
            }
            this.f8369x = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized t d(long j, String str) {
        f();
        b();
        z(str);
        d dVar = (d) this.f8366t.get(str);
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar != null && dVar.f != null) {
            return null;
        }
        if (!this.f8370y && !this.f8371z) {
            z zVar = this.f8365s;
            zVar.m("DIRTY");
            zVar.writeByte(32);
            zVar.m(str);
            zVar.writeByte(10);
            this.f8365s.flush();
            if (this.v) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str);
                this.f8366t.put(str, dVar);
            }
            t tVar = new t(this, dVar);
            dVar.f = tVar;
            return tVar;
        }
        this.B.execute(this.C);
        return null;
    }

    public final synchronized e e(String str) {
        f();
        b();
        z(str);
        d dVar = (d) this.f8366t.get(str);
        if (dVar != null && dVar.f8351e) {
            e eVarA = dVar.a();
            if (eVarA == null) {
                return null;
            }
            this.f8367u++;
            z zVar = this.f8365s;
            zVar.m("READ");
            zVar.writeByte(32);
            zVar.m(str);
            zVar.writeByte(10);
            if (h()) {
                this.B.execute(this.C);
            }
            return eVarA;
        }
        return null;
    }

    public final synchronized void f() {
        try {
            if (this.f8368w) {
                return;
            }
            t8.a aVar = this.f8356a;
            File file = this.f8360n;
            aVar.getClass();
            if (file.exists()) {
                t8.a aVar2 = this.f8356a;
                File file2 = this.f8358l;
                aVar2.getClass();
                boolean zExists = file2.exists();
                t8.a aVar3 = this.f8356a;
                File file3 = this.f8360n;
                if (zExists) {
                    aVar3.a(file3);
                } else {
                    aVar3.c(file3, this.f8358l);
                }
            }
            t8.a aVar4 = this.f8356a;
            File file4 = this.f8358l;
            aVar4.getClass();
            if (file4.exists()) {
                try {
                    n();
                    j();
                    this.f8368w = true;
                    return;
                } catch (IOException e10) {
                    h.f10784a.k(5, "DiskLruCache " + this.f8357b + " is corrupt: " + e10.getMessage() + ", removing", e10);
                    try {
                        close();
                        this.f8356a.b(this.f8357b);
                        this.f8369x = false;
                        s();
                        this.f8368w = true;
                    } catch (Throwable th) {
                        this.f8369x = false;
                        throw th;
                    }
                }
            }
            s();
            this.f8368w = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f8368w) {
            b();
            y();
            this.f8365s.flush();
        }
    }

    public final boolean h() {
        int i = this.f8367u;
        return i >= 2000 && i >= this.f8366t.size();
    }

    public final z i() {
        w8.b bVar;
        File file = this.f8358l;
        this.f8356a.getClass();
        int i = 1;
        try {
            Logger logger = x.f11004a;
            file.getClass();
            bVar = new w8.b(i, new FileOutputStream(file, true), new i0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = x.f11004a;
            bVar = new w8.b(i, new FileOutputStream(file, true), new i0());
        }
        return new z(new c(this, bVar, 0));
    }

    public final synchronized boolean isClosed() {
        return this.f8369x;
    }

    public final void j() {
        File file = this.f8359m;
        t8.a aVar = this.f8356a;
        aVar.a(file);
        Iterator it = this.f8366t.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            t tVar = dVar.f;
            int i = this.f8363q;
            int i6 = 0;
            if (tVar == null) {
                while (i6 < i) {
                    this.f8364r += dVar.f8348b[i6];
                    i6++;
                }
            } else {
                dVar.f = null;
                while (i6 < i) {
                    aVar.a(dVar.f8349c[i6]);
                    aVar.a(dVar.f8350d[i6]);
                    i6++;
                }
                it.remove();
            }
        }
    }

    public final void n() {
        this.f8356a.getClass();
        a0 a0Var = new a0(i5.L(this.f8358l));
        try {
            String strK = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            String strK2 = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            String strK3 = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            String strK4 = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            String strK5 = a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL);
            if (!"libcore.io.DiskLruCache".equals(strK) || !"1".equals(strK2) || !Integer.toString(this.f8361o).equals(strK3) || !Integer.toString(this.f8363q).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    r(a0Var.k(LocationRequestCompat.PASSIVE_INTERVAL));
                    i++;
                } catch (EOFException unused) {
                    this.f8367u = i - this.f8366t.size();
                    if (a0Var.b()) {
                        this.f8365s = i();
                    } else {
                        s();
                    }
                    n8.c.c(a0Var);
                    return;
                }
            }
        } catch (Throwable th) {
            n8.c.c(a0Var);
            throw th;
        }
    }

    public final void r(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            com.google.gson.internal.a.n("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f8366t;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = (d) linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new t(this, dVar);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                com.google.gson.internal.a.n("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f8351e = true;
        dVar.f = null;
        if (strArrSplit.length != dVar.h.f8363q) {
            androidx.core.content.pm.a.k(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            try {
                dVar.f8348b[i6] = Long.parseLong(strArrSplit[i6]);
            } catch (NumberFormatException unused) {
                androidx.core.content.pm.a.k(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void s() {
        w8.b bVar;
        try {
            z zVar = this.f8365s;
            if (zVar != null) {
                zVar.close();
            }
            t8.a aVar = this.f8356a;
            File file = this.f8359m;
            aVar.getClass();
            int i = 1;
            try {
                Logger logger = x.f11004a;
                file.getClass();
                bVar = new w8.b(i, new FileOutputStream(file, false), new i0());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = x.f11004a;
                bVar = new w8.b(i, new FileOutputStream(file, false), new i0());
            }
            z zVar2 = new z(bVar);
            try {
                zVar2.m("libcore.io.DiskLruCache");
                zVar2.writeByte(10);
                zVar2.m("1");
                zVar2.writeByte(10);
                zVar2.c(this.f8361o);
                zVar2.writeByte(10);
                zVar2.c(this.f8363q);
                zVar2.writeByte(10);
                zVar2.writeByte(10);
                for (d dVar : this.f8366t.values()) {
                    if (dVar.f != null) {
                        zVar2.m("DIRTY");
                        zVar2.writeByte(32);
                        zVar2.m(dVar.f8347a);
                        zVar2.writeByte(10);
                    } else {
                        zVar2.m("CLEAN");
                        zVar2.writeByte(32);
                        zVar2.m(dVar.f8347a);
                        for (long j : dVar.f8348b) {
                            zVar2.writeByte(32);
                            zVar2.c(j);
                        }
                        zVar2.writeByte(10);
                    }
                }
                zVar2.close();
                t8.a aVar2 = this.f8356a;
                File file2 = this.f8358l;
                aVar2.getClass();
                if (file2.exists()) {
                    this.f8356a.c(this.f8358l, this.f8360n);
                }
                this.f8356a.c(this.f8359m, this.f8358l);
                this.f8356a.a(this.f8360n);
                this.f8365s = i();
                this.v = false;
                this.f8371z = false;
            } catch (Throwable th) {
                zVar2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void u(d dVar) {
        t tVar = dVar.f;
        String str = dVar.f8347a;
        if (tVar != null) {
            tVar.e();
        }
        for (int i = 0; i < this.f8363q; i++) {
            this.f8356a.a(dVar.f8349c[i]);
            long j = this.f8364r;
            long[] jArr = dVar.f8348b;
            this.f8364r = j - jArr[i];
            jArr[i] = 0;
        }
        this.f8367u++;
        z zVar = this.f8365s;
        zVar.m("REMOVE");
        zVar.writeByte(32);
        zVar.m(str);
        zVar.writeByte(10);
        this.f8366t.remove(str);
        if (h()) {
            this.B.execute(this.C);
        }
    }

    public final void y() {
        while (this.f8364r > this.f8362p) {
            u((d) this.f8366t.values().iterator().next());
        }
        this.f8370y = false;
    }
}
