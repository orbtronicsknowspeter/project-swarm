package l7;

import a4.x;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f7177a;

    public k(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.f7177a = patternCompile;
    }

    public static k7.d a(k kVar, String str) {
        if (str.length() >= 0) {
            return new k7.d(new androidx.work.impl.utils.c(10, kVar, str), j.f7176a);
        }
        com.google.gson.internal.a.g(str.length(), x.p(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    public final String b(CharSequence charSequence, d7.l lVar) {
        charSequence.getClass();
        Matcher matcher = this.f7177a.matcher(charSequence);
        matcher.getClass();
        int i = 0;
        i iVar = !matcher.find(0) ? null : new i(matcher, charSequence);
        if (iVar == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, iVar.b().f5696a);
            sb.append((CharSequence) lVar.invoke(iVar));
            i = iVar.b().f5697b + 1;
            iVar = iVar.c();
            if (i >= length) {
                break;
            }
        } while (iVar != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String c(String str) {
        String strReplaceAll = this.f7177a.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f7177a.toString();
        string.getClass();
        return string;
    }

    public k(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f7177a = patternCompile;
    }
}
