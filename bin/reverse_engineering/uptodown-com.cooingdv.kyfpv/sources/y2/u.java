package y2;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f11764d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11767c;

    public u(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f11764d.matcher(strSubstring).matches()) {
            com.google.gson.internal.a.p(androidx.lifecycle.l.w("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.f11765a = strSubstring;
        this.f11766b = str;
        this.f11767c = a4.x.k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f11765a.equals(uVar.f11765a) && this.f11766b.equals(uVar.f11766b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11766b, this.f11765a});
    }
}
