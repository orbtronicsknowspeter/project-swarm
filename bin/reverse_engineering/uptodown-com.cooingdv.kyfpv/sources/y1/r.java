package y1;

import android.content.Context;
import b2.s0;
import b2.t0;
import b2.u0;
import b2.w0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static final HashMap f;
    public static final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f11671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.support.v4.media.g f11673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2.e f11674e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.4";
    }

    public r(Context context, x xVar, a aVar, android.support.v4.media.g gVar, g2.e eVar) {
        this.f11670a = context;
        this.f11671b = xVar;
        this.f11672c = aVar;
        this.f11673d = gVar;
        this.f11674e = eVar;
    }

    public static t0 c(y2.s sVar, int i) {
        String str = (String) sVar.f11757l;
        String str2 = (String) sVar.f11756b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.f11758m;
        int i6 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        y2.s sVar2 = (y2.s) sVar.f11759n;
        if (i >= 8) {
            y2.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (y2.s) sVar3.f11759n;
                i6++;
            }
        }
        int i10 = i6;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            com.google.gson.internal.a.i("Null frames");
            return null;
        }
        byte b7 = (byte) (0 | 1);
        t0 t0VarC = null;
        if (sVar2 != null && i10 == 0) {
            t0VarC = c(sVar2, i + 1);
        }
        if (b7 == 1) {
            return new t0(str, str2, listD, t0VarC, i10);
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" overflowCount");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f968e = i;
            w0Var.f = (byte) (w0Var.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f964a = jMax;
            byte b7 = (byte) (w0Var.f | 1);
            w0Var.f965b = str;
            w0Var.f966c = fileName;
            w0Var.f967d = lineNumber;
            w0Var.f = (byte) (b7 | 2);
            arrayList.add(w0Var.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b7 = (byte) 1;
        if (b7 == 1) {
            return new u0(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b7 == 0) {
            sb.append(" address");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }

    public final List a() {
        byte b7 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f11672c;
        String str = aVar.f11604e;
        if (str == null) {
            com.google.gson.internal.a.i("Null name");
            return null;
        }
        String str2 = aVar.f11601b;
        if (b7 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b7 & 2) == 0) {
            sb.append(" size");
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i(k0.k.h("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b2.b1 b(int r17) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.r.b(int):b2.b1");
    }
}
