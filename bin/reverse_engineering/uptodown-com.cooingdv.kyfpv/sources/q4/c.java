package q4;

import com.google.android.gms.internal.measurement.i5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import k0.k;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static c f8682s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8685c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Process f8687e;
    public final BufferedReader f;
    public final BufferedReader g;
    public final OutputStreamWriter h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8686d = "";
    public final ArrayList i = new ArrayList();
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8688k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8689l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8690m = 5000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8691n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8692o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8693p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8694q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8695r = false;

    public c(int i) throws p4.a, TimeoutException, IOException {
        String str;
        this.f8683a = 25000;
        this.f8684b = 0;
        this.f8685c = 1;
        a aVar = new a(this, 0);
        a aVar2 = new a(this, 1);
        i5.C("Starting shell: su");
        switch (1) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "u:r:shell:s0";
                break;
            case 3:
                str = "u:r:system_server:s0";
                break;
            case 4:
                str = "u:r:system_app:s0";
                break;
            case 5:
                str = "u:r:platform_app:s0";
                break;
            case 6:
                str = "u:r:untrusted_app:s0";
                break;
            case 7:
                str = "u:r:recovery:s0";
                break;
            default:
                throw null;
        }
        i5.C("Context: ".concat(str));
        i5.C("Timeout: " + i);
        this.f8684b = 2;
        i = i <= 0 ? 25000 : i;
        this.f8683a = i;
        this.f8685c = 1;
        Process processExec = Runtime.getRuntime().exec("su");
        this.f8687e = processExec;
        this.f = new BufferedReader(new InputStreamReader(processExec.getInputStream(), "UTF-8"));
        this.g = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), "UTF-8"));
        this.h = new OutputStreamWriter(processExec.getOutputStream(), "UTF-8");
        b bVar = new b();
        bVar.f8680a = -911;
        bVar.f8681b = this;
        bVar.start();
        try {
            bVar.join(i);
            int i6 = bVar.f8680a;
            if (i6 == -911) {
                try {
                    processExec.destroy();
                } catch (Exception unused) {
                }
                c(this.f);
                c(this.g);
                b(this.h);
                throw new TimeoutException(this.f8686d);
            }
            if (i6 == -42) {
                try {
                    processExec.destroy();
                } catch (Exception unused2) {
                }
                c(this.f);
                c(this.g);
                b(this.h);
                throw new p4.a("Root Access Denied");
            }
            Thread thread = new Thread(aVar, "Shell Input");
            thread.setPriority(5);
            thread.start();
            Thread thread2 = new Thread(aVar2, "Shell Output");
            thread2.setPriority(5);
            thread2.start();
        } catch (InterruptedException unused3) {
            bVar.interrupt();
            Thread.currentThread().interrupt();
            throw new TimeoutException();
        }
    }

    public static void a(c cVar) {
        ArrayList arrayList = cVar.i;
        cVar.f8695r = true;
        int i = cVar.f8690m;
        int iAbs = Math.abs(i - (i / 4));
        i5.C("Cleaning up: " + iAbs);
        for (int i6 = 0; i6 < iAbs; i6++) {
            arrayList.remove(0);
        }
        cVar.f8691n = arrayList.size() - 1;
        cVar.f8692o = arrayList.size() - 1;
        cVar.f8695r = false;
    }

    public static void b(OutputStreamWriter outputStreamWriter) {
        if (outputStreamWriter != null) {
            try {
                outputStreamWriter.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void d() {
        i5.C("Request to close root shell!");
        c cVar = f8682s;
        if (cVar == null) {
            return;
        }
        i5.C("Request to close shell!");
        int i = 0;
        while (cVar.f8688k) {
            i5.C("Waiting on shell to finish executing before closing...");
            i++;
            if (i > 10000) {
                break;
            }
        }
        synchronized (cVar.i) {
            cVar.j = true;
            new c0.c(cVar, 1).start();
        }
        i5.C("Shell Closed!");
        if (cVar == f8682s) {
            f8682s = null;
        }
    }

    public static c e(int i) {
        int i6;
        c cVar = f8682s;
        if (cVar == null) {
            i5.C("Starting Root Shell!");
            int i10 = 0;
            while (f8682s == null) {
                try {
                    i5.C("Trying to open Root Shell, attempt #" + i10);
                    f8682s = new c(i);
                } catch (IOException e10) {
                    i6 = i10 + 1;
                    if (i10 >= 3) {
                        i5.C("IOException, could not start shell");
                        throw e10;
                    }
                    i10 = i6;
                } catch (TimeoutException e11) {
                    i6 = i10 + 1;
                    if (i10 >= 3) {
                        i5.C("TimeoutException, could not start shell");
                        throw e11;
                    }
                    i10 = i6;
                } catch (p4.a e12) {
                    i6 = i10 + 1;
                    if (i10 >= 3) {
                        i5.C("RootDeniedException, could not start shell");
                        throw e12;
                    }
                    i10 = i6;
                }
            }
        } else if (cVar.f8685c != 1) {
            try {
                i5.C("Context is different than open shell, switching context... " + k.n(f8682s.f8685c) + " VS " + k.n(1));
                f8682s.f();
            } catch (IOException | TimeoutException | p4.a unused) {
            }
        } else {
            i5.C("Using Existing Root Shell!");
        }
        return f8682s;
    }

    public final void f() {
        if (this.f8684b != 2) {
            i5.C("Can only switch context on a root shell!");
            return;
        }
        try {
            i5.C("Request to close root shell!");
            c cVar = f8682s;
            if (cVar != null) {
                i5.C("Request to close shell!");
                int i = 0;
                while (cVar.f8688k) {
                    i5.C("Waiting on shell to finish executing before closing...");
                    i++;
                    if (i > 10000) {
                        break;
                    }
                }
                synchronized (cVar.i) {
                    cVar.j = true;
                    new c0.c(cVar, 1).start();
                }
                i5.C("Shell Closed!");
                if (cVar == f8682s) {
                    f8682s = null;
                }
            }
        } catch (Exception unused) {
            i5.C("Problem closing shell while trying to switch context...");
        }
        e(this.f8683a);
    }
}
