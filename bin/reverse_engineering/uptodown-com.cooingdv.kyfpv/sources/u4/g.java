package u4;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10494b;

    public /* synthetic */ g(f0 f0Var, int i) {
        this.f10493a = i;
        this.f10494b = f0Var;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f10493a) {
            case 0:
                this.f10494b.y();
                break;
            case 1:
                f0 f0Var = this.f10494b;
                FragmentActivity fragmentActivityRequireActivity = f0Var.requireActivity();
                fragmentActivityRequireActivity.getClass();
                f0Var.p(fragmentActivityRequireActivity);
                Context contextRequireContext = f0Var.requireContext();
                contextRequireContext.getClass();
                f0Var.p0(contextRequireContext);
                break;
            case 2:
                this.f10494b.y();
                break;
            default:
                f0 f0Var2 = this.f10494b;
                FragmentActivity fragmentActivityRequireActivity2 = f0Var2.requireActivity();
                fragmentActivityRequireActivity2.getClass();
                f0Var2.p(fragmentActivityRequireActivity2);
                Context contextRequireContext2 = f0Var2.requireContext();
                contextRequireContext2.getClass();
                f0Var2.p0(contextRequireContext2);
                break;
        }
        return p6.x.f8464a;
    }
}
