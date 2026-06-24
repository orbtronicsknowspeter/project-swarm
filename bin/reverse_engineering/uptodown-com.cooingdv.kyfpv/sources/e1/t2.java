package e1;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4277b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f4278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f4279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f4280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f4281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b3 f4283q;

    public t2(b3 b3Var, String str, String str2, long j, Bundle bundle, boolean z9, boolean z10, boolean z11) {
        this.f4276a = str;
        this.f4277b = str2;
        this.f4278l = j;
        this.f4279m = bundle;
        this.f4280n = z9;
        this.f4281o = z10;
        this.f4282p = z11;
        this.f4283q = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4283q.p(this.f4276a, this.f4277b, this.f4278l, this.f4279m, this.f4280n, this.f4281o, this.f4282p);
    }
}
