package g9;

import d7.l;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5389b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f5390l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5391a;

    static {
        int i = 1;
        f5389b = new a(i, 0);
        f5390l = new a(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i6) {
        super(i);
        this.f5391a = i6;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        String strValueOf;
        switch (this.f5391a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() <= 0) {
                    return lowerCase;
                }
                StringBuilder sb = new StringBuilder();
                char cCharAt = lowerCase.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String strValueOf2 = String.valueOf(cCharAt);
                    strValueOf2.getClass();
                    strValueOf = strValueOf2.toUpperCase(locale2);
                    strValueOf.getClass();
                    if (strValueOf.length() <= 1) {
                        String strValueOf3 = String.valueOf(cCharAt);
                        strValueOf3.getClass();
                        String upperCase = strValueOf3.toUpperCase(locale);
                        upperCase.getClass();
                        if (strValueOf.equals(upperCase)) {
                            strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                        }
                    } else if (cCharAt != 329) {
                        char cCharAt2 = strValueOf.charAt(0);
                        String lowerCase2 = strValueOf.substring(1).toLowerCase(locale);
                        lowerCase2.getClass();
                        strValueOf = cCharAt2 + lowerCase2;
                    }
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                sb.append(lowerCase.substring(1));
                return sb.toString();
            default:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        }
    }
}
