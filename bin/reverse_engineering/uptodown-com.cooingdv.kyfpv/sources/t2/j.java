package t2;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f9555b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j f9556c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.a f9557a;

    public j(q1.a aVar) {
        this.f9557a = aVar;
    }

    public final boolean a(u2.b bVar) {
        if (TextUtils.isEmpty(bVar.f10407c)) {
            return true;
        }
        long j = bVar.f + bVar.f10409e;
        this.f9557a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
