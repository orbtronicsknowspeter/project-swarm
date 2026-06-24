package e2;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.l;
import b2.j2;
import g2.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import y1.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f4460e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final c2.c g = new c2.c();
    public static final androidx.constraintlayout.core.utils.a h = new androidx.constraintlayout.core.utils.a(2);
    public static final a i = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4461a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f4464d;

    public b(d dVar, e eVar, i iVar) {
        this.f4462b = dVar;
        this.f4463c = eVar;
        this.f4464d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i6 = fileInputStream.read(bArr);
                if (i6 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f4460e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f4460e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.f4462b;
        arrayList.addAll(d.n(((File) dVar.f4472p).listFiles()));
        arrayList.addAll(d.n(((File) dVar.f4473q).listFiles()));
        androidx.constraintlayout.core.utils.a aVar = h;
        Collections.sort(arrayList, aVar);
        List listN = d.n(((File) dVar.f4471o).listFiles());
        Collections.sort(listN, aVar);
        arrayList.addAll(listN);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(d.n(((File) this.f4462b.f4470n).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z9) {
        d dVar = this.f4462b;
        int i6 = this.f4463c.b().f5113a.f5112a;
        g.getClass();
        try {
            f(dVar.h(str, l.w(NotificationCompat.CATEGORY_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.f4461a.getAndIncrement())), z9 ? "_" : "")), c2.c.f1184a.z(j2Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a(1);
        dVar.getClass();
        File file = new File((File) dVar.f4470n, str);
        file.mkdirs();
        List<File> listN = d.n(file.listFiles(aVar));
        Collections.sort(listN, new androidx.constraintlayout.core.utils.a(3));
        int size = listN.size();
        for (File file2 : listN) {
            if (size <= i6) {
                return;
            }
            d.m(file2);
            size--;
        }
    }
}
