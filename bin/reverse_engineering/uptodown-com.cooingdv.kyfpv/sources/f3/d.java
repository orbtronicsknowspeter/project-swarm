package f3;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3.b f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.h f4845b;

    public d(c3.b bVar, t6.h hVar) {
        bVar.getClass();
        hVar.getClass();
        this.f4844a = bVar;
        this.f4845b = hVar;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        c3.b bVar = dVar.f4844a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f1193a).appendPath("settings");
        c3.a aVar = bVar.f1194b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f1187c).appendQueryParameter("display_version", aVar.f1186b).build().toString());
    }
}
