package e1;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f4117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.u0 f4119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4120e;
    public final Long f;
    public final String g;

    public m2(Context context, com.google.android.gms.internal.measurement.u0 u0Var, Long l10) {
        this.f4120e = true;
        k0.y.g(context);
        Context applicationContext = context.getApplicationContext();
        k0.y.g(applicationContext);
        this.f4116a = applicationContext;
        this.f = l10;
        if (u0Var != null) {
            this.f4119d = u0Var;
            this.f4120e = u0Var.f2816l;
            this.f4118c = u0Var.f2815b;
            this.g = u0Var.f2818n;
            Bundle bundle = u0Var.f2817m;
            if (bundle != null) {
                this.f4117b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
