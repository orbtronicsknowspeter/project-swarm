package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n4 {
    public static final Object g = new Object();
    public static volatile d4 h;
    public static final AtomicInteger i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.i f2721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f2724d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2725e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ n4(a2.i iVar, String str, Object obj, int i6) {
        this.f = i6;
        if (((Uri) iVar.f23b) == null) {
            com.google.gson.internal.a.p("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.f2721a = iVar;
        this.f2722b = str;
        this.f2723c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.f2722b;
                    StringBuilder sb = new StringBuilder(str.length() + 25 + string.length());
                    sb.append("Invalid long value for ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(string);
                    Log.e("PhenotypeFlag", sb.toString());
                }
                break;
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!y3.f2910b.matcher(str2).matches()) {
                            if (y3.f2911c.matcher(str2).matches()) {
                            }
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.f2722b;
                    StringBuilder sb2 = new StringBuilder(str3.length() + 28 + string2.length());
                    sb2.append("Invalid boolean value for ");
                    sb2.append(str3);
                    sb2.append(": ");
                    sb2.append(string2);
                    Log.e("PhenotypeFlag", sb2.toString());
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.f2722b;
                        StringBuilder sb3 = new StringBuilder(str4.length() + 27 + string3.length());
                        sb3.append("Invalid double value for ");
                        sb3.append(str4);
                        sb3.append(": ");
                        sb3.append(string3);
                        Log.e("PhenotypeFlag", sb3.toString());
                    }
                }
                break;
            default:
                if (obj instanceof String) {
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 k1.b) = (r2v0 k1.b), (r2v5 k1.b), (r2v5 k1.b) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n4.b():java.lang.Object");
    }
}
