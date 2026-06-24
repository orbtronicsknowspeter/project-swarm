package c4;

import android.view.View;
import com.uptodown.activities.RepliesActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RepliesActivity f1764b;

    public /* synthetic */ j8(RepliesActivity repliesActivity, int i) {
        this.f1763a = i;
        this.f1764b = repliesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1763a;
        RepliesActivity repliesActivity = this.f1764b;
        switch (i) {
            case 0:
                int i6 = RepliesActivity.S;
                repliesActivity.getOnBackPressedDispatcher().onBackPressed();
                break;
            case 1:
                int i10 = RepliesActivity.S;
                long jLongValue = ((Number) repliesActivity.z0().f2223p.getValue()).longValue();
                if (jLongValue == 0) {
                    x4.k2 k2Var = (x4.k2) repliesActivity.z0().f2220m.getValue();
                    jLongValue = k2Var != null ? k2Var.f11262n : 0L;
                }
                repliesActivity.j0(jLongValue, (String) repliesActivity.z0().f2224q.getValue());
                break;
            case 2:
                int i11 = RepliesActivity.S;
                repliesActivity.A0();
                break;
            case 3:
                int i12 = RepliesActivity.S;
                repliesActivity.B0();
                break;
            default:
                int i13 = RepliesActivity.S;
                repliesActivity.w0();
                break;
        }
    }
}
