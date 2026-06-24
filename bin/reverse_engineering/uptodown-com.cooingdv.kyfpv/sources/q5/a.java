package q5;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.m;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends m implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i) {
        super(0);
        this.f8696a = i;
        this.f8697b = dVar;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f8696a) {
            case 0:
                d dVar = this.f8697b;
                dVar.dismiss();
                FragmentActivity activity = dVar.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            default:
                d dVar2 = this.f8697b;
                dVar2.dismiss();
                FragmentActivity activity2 = dVar2.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                break;
        }
        return x.f8464a;
    }
}
