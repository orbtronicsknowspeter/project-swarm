package e1;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4233a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4234b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4238o;

    public r2(b3 b3Var, AtomicReference atomicReference, String str, String str2, boolean z9) {
        this.f4237n = atomicReference;
        this.f4234b = str;
        this.f4235l = str2;
        this.f4236m = z9;
        Objects.requireNonNull(b3Var);
        this.f4238o = b3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0105 A[Catch: RuntimeException -> 0x00df, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x00df, blocks: (B:53:0x0105, B:55:0x0110, B:58:0x011d, B:60:0x0123, B:62:0x013d, B:64:0x0146, B:67:0x014e, B:70:0x0167, B:72:0x0176, B:71:0x016e, B:73:0x0189, B:75:0x018f, B:77:0x0195, B:79:0x019b, B:81:0x01a1, B:83:0x01a9, B:85:0x01b1, B:87:0x01b7, B:88:0x01c9, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e6, B:50:0x00f4), top: B:104:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e A[Catch: RuntimeException -> 0x00df, TryCatch #2 {RuntimeException -> 0x00df, blocks: (B:53:0x0105, B:55:0x0110, B:58:0x011d, B:60:0x0123, B:62:0x013d, B:64:0x0146, B:67:0x014e, B:70:0x0167, B:72:0x0176, B:71:0x016e, B:73:0x0189, B:75:0x018f, B:77:0x0195, B:79:0x019b, B:81:0x01a1, B:83:0x01a9, B:85:0x01b1, B:87:0x01b7, B:88:0x01c9, B:26:0x0090, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00c2, B:42:0x00ca, B:44:0x00d2, B:48:0x00e6, B:50:0x00f4), top: B:104:0x0090 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.r2.run():void");
    }

    public r2(x2 x2Var, boolean z9, Uri uri, String str, String str2) {
        this.f4236m = z9;
        this.f4237n = uri;
        this.f4234b = str;
        this.f4235l = str2;
        this.f4238o = x2Var;
    }

    public r2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.m0 m0Var, String str, String str2, boolean z9) {
        this.f4237n = m0Var;
        this.f4234b = str;
        this.f4235l = str2;
        this.f4236m = z9;
        this.f4238o = appMeasurementDynamiteService;
    }

    public r2(w3 w3Var, c5 c5Var, boolean z9, t tVar, Bundle bundle) {
        this.f4237n = c5Var;
        this.f4236m = z9;
        this.f4234b = tVar;
        this.f4235l = bundle;
        Objects.requireNonNull(w3Var);
        this.f4238o = w3Var;
    }
}
