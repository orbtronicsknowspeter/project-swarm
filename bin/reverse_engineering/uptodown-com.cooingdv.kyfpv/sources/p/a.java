package p;

import com.google.android.gms.internal.measurement.z3;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f8392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8393e;
    public static final a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8395b;

    static {
        String strE = z3.E("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8391c = strE;
        String strE2 = z3.E("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strE3 = z3.E("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8392d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new o.c("proto"), new o.c("json"))));
        f8393e = new a(strE, null);
        f = new a(strE2, strE3);
    }

    public a(String str, String str2) {
        this.f8394a = str;
        this.f8395b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            com.google.gson.internal.a.p("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            com.google.gson.internal.a.p("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            com.google.gson.internal.a.p("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
