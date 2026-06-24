package c4;

import com.uptodown.activities.PasswordRecoveryActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y6 extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.v f2347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.x f2348b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.x f2349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.x f2350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f2351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PasswordRecoveryActivity f2352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2353p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(PasswordRecoveryActivity passwordRecoveryActivity, v6.c cVar) {
        super(cVar);
        this.f2352o = passwordRecoveryActivity;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f2351n = obj;
        this.f2353p |= Integer.MIN_VALUE;
        return PasswordRecoveryActivity.y0(this.f2352o, this);
    }
}
