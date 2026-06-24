package a4;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Window;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.Predicate;
import androidx.fragment.app.Fragment;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x {
    public static void A(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
    }

    public static void B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static String C(String str, String str2) {
        return str + str2;
    }

    public static androidx.core.util.a a(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new androidx.core.util.a(predicate, predicate2, 1);
    }

    public static androidx.core.util.a b(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new androidx.core.util.a(predicate, predicate2, 0);
    }

    public static int c(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return TypedValues.AttributesType.TYPE_EASING;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "target":
                return TypedValues.TYPE_TARGET;
            case "elevation":
                return 307;
            case "alpha":
                return 303;
            case "frame":
                return 100;
            case "curveFit":
                return 301;
            case "pathRotate":
                return TypedValues.AttributesType.TYPE_PATH_ROTATE;
            case "pivotTarget":
                return TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            case "visibility":
                return 302;
            default:
                return -1;
        }
    }

    public static int d(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return TypedValues.CycleType.TYPE_EASING;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "alpha":
                return TypedValues.CycleType.TYPE_ALPHA;
            case "curveFit":
                return TypedValues.CycleType.TYPE_CURVE_FIT;
            case "pathRotate":
                return TypedValues.CycleType.TYPE_PATH_ROTATE;
            case "visibility":
                return TypedValues.CycleType.TYPE_VISIBILITY;
            default:
                return -1;
        }
    }

    public static double e(double d10, double d11, double d12) {
        return (Math.sin(d10) * d11) + d12;
    }

    public static float f(float f, float f10, float f11, float f12) {
        return ((f - f10) * f11) + f12;
    }

    public static String g(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c9) {
        sb.append(str);
        sb.append(c9);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder p(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, d7.p pVar, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        pVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence4);
        return sb;
    }

    public static StringBuilder r(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, d7.p pVar) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        pVar.getClass();
        return new StringBuilder();
    }

    public static StringBuilder s(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence5);
        return sb;
    }

    public static StringBuilder t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder u(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static ArrayList w(Object obj) {
        p6.a.e(obj);
        return new ArrayList();
    }

    public static void x(int i, int i6, d7.l lVar) {
        lVar.invoke(Integer.valueOf(i + i6));
    }

    public static void y(Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            androidx.core.provider.b.d((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            s1.o.n();
        }
    }
}
