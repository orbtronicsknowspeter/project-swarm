package q4;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f8681b;

    public final void a() {
        Field declaredField;
        c cVar = this.f8681b;
        try {
            Class<?> cls = cVar.f8687e.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(cVar.f8687e)).intValue();
            cVar.h.write("(echo -17 > /proc/" + iIntValue + "/oom_adj) &> /dev/null\n");
            cVar.h.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            cVar.h.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        c cVar = this.f8681b;
        try {
            cVar.h.write("echo Started\n");
            cVar.h.flush();
            while (true) {
                String line = cVar.f.readLine();
                if (line == null) {
                    throw new EOFException();
                }
                if (!"".equals(line)) {
                    if ("Started".equals(line)) {
                        this.f8680a = 1;
                        a();
                        return;
                    }
                    cVar.f8686d = "unknown error occurred.";
                }
            }
        } catch (IOException e10) {
            this.f8680a = -42;
            if (e10.getMessage() != null) {
                cVar.f8686d = e10.getMessage();
            } else {
                cVar.f8686d = "RootAccess denied?.";
            }
        }
    }
}
