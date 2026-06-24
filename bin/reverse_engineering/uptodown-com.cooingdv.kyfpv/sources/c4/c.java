package c4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.FeedActivity;
import com.uptodown.activities.PublicProfileActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1443b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1445m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, long j, t6.c cVar, int i) {
        super(2, cVar);
        this.f1442a = i;
        this.f1445m = obj;
        this.f1444l = j;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1442a) {
            case 0:
                return new c((AppDetailActivity) this.f1445m, this.f1444l, cVar, 0);
            case 1:
                return new c((FeedActivity) this.f1445m, this.f1444l, cVar, 1);
            default:
                return new c((u4.f1) this.f1445m, this.f1444l, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1442a) {
        }
        return ((c) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String message;
        Object objA2;
        Object objA3;
        int i = this.f1442a;
        p6.x xVar = p6.x.f8464a;
        long j = this.f1444l;
        u6.a aVar = u6.a.f10763a;
        Object obj2 = this.f1445m;
        switch (i) {
            case 0:
                AppDetailActivity appDetailActivity = (AppDetailActivity) obj2;
                int i6 = this.f1443b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    e1.s0 s0Var = new e1.s0(appDetailActivity, j);
                    this.f1443b = 1;
                    objA = s0Var.a(this);
                    if (objA == aVar) {
                    }
                } else if (i6 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA = ((p6.k) obj).f8445a;
                }
                if (!(objA instanceof p6.j)) {
                    appDetailActivity.y0((x4.g) objA);
                }
                Throwable thA = p6.k.a(objA);
                if (thA != null && (message = thA.getMessage()) != null && message.length() != 0) {
                    String message2 = thA.getMessage();
                    message2.getClass();
                    appDetailActivity.A(message2);
                    break;
                }
                break;
            case 1:
                FeedActivity feedActivity = (FeedActivity) obj2;
                int i10 = this.f1443b;
                if (i10 == 0) {
                    p6.a.e(obj);
                    s4.x xVar2 = new s4.x(feedActivity);
                    String strValueOf = String.valueOf(j);
                    this.f1443b = 1;
                    objA2 = xVar2.a(strValueOf, this);
                    if (objA2 == aVar) {
                    }
                } else if (i10 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA2 = ((p6.k) obj).f8445a;
                }
                if (!(objA2 instanceof p6.j)) {
                    int i11 = FeedActivity.S;
                    feedActivity.y0().f9898b.setVisibility(8);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "feed");
                    new android.support.v4.media.g(feedActivity, 20).E(bundle, "profile-open");
                    Intent intent = new Intent(feedActivity, (Class<?>) PublicProfileActivity.class);
                    intent.putExtra("user", (x4.w2) objA2);
                    float f = UptodownApp.I;
                    feedActivity.startActivity(intent, b4.d.a(feedActivity));
                }
                if (p6.k.a(objA2) != null) {
                    int i12 = FeedActivity.S;
                    feedActivity.y0().f9898b.setVisibility(8);
                }
                break;
            default:
                u4.f1 f1Var = (u4.f1) obj2;
                int i13 = this.f1443b;
                if (i13 == 0) {
                    p6.a.e(obj);
                    Context contextRequireContext = f1Var.requireContext();
                    contextRequireContext.getClass();
                    s4.x xVar3 = new s4.x(contextRequireContext);
                    String strValueOf2 = String.valueOf(j);
                    this.f1443b = 1;
                    objA3 = xVar3.a(strValueOf2, this);
                    if (objA3 == aVar) {
                    }
                } else if (i13 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                    objA3 = ((p6.k) obj).f8445a;
                }
                if (!(objA3 instanceof p6.j)) {
                    f1Var.a().f9932o.setVisibility(8);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "feed");
                    new android.support.v4.media.g(f1Var.requireContext(), 20).E(bundle2, "profile-open");
                    Intent intent2 = new Intent(f1Var.requireContext(), (Class<?>) PublicProfileActivity.class);
                    intent2.putExtra("user", (x4.w2) objA3);
                    float f10 = UptodownApp.I;
                    FragmentActivity fragmentActivityRequireActivity = f1Var.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    f1Var.startActivity(intent2, b4.d.a(fragmentActivityRequireActivity));
                }
                if (p6.k.a(objA3) != null) {
                    f1Var.a().f9932o.setVisibility(8);
                }
                break;
        }
        return xVar;
    }
}
