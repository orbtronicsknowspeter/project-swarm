package y1;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f11626b;

    public i(t tVar, e2.d dVar) {
        this.f11625a = tVar;
        this.f11626b = new h(dVar);
    }

    public final String a(String str) {
        String strSubstring;
        h hVar = this.f11626b;
        synchronized (hVar) {
            if (Objects.equals(hVar.f11623b, str)) {
                return hVar.f11624c;
            }
            e2.d dVar = hVar.f11622a;
            e2.a aVar = h.f11620d;
            File file = new File((File) dVar.f4469n, str);
            file.mkdirs();
            List listN = e2.d.n(file.listFiles(aVar));
            if (listN.isEmpty()) {
                strSubstring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                strSubstring = ((File) Collections.min(listN, h.f11621e)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    public final void b(String str) {
        h hVar = this.f11626b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f11623b, str)) {
                h.a(hVar.f11622a, str, hVar.f11624c);
                hVar.f11623b = str;
            }
        }
    }
}
