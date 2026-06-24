package s5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.l;
import p9.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9332b;

    public /* synthetic */ b(c cVar, int i) {
        this.f9331a = i;
        this.f9332b = cVar;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        int i = this.f9331a;
        Fragment fragmentFindFragmentByTag = null;
        c cVar = this.f9332b;
        switch (i) {
            case 0:
                o oVar = cVar.P;
                if (oVar == null) {
                    l.i("stacksAdapter");
                    throw null;
                }
                d dVar = cVar.O;
                if (dVar == null) {
                    l.i("viewModel");
                    throw null;
                }
                oVar.f8551a = dVar.e();
                oVar.notifyDataSetChanged();
                return;
            case 1:
                FragmentActivity activity = cVar.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("f");
                }
                BottomSheetDialogFragment bottomSheetDialogFragment = (BottomSheetDialogFragment) fragmentFindFragmentByTag;
                if (bottomSheetDialogFragment != null) {
                    bottomSheetDialogFragment.dismiss();
                }
                FragmentActivity activity2 = cVar.getActivity();
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            default:
                FragmentActivity activity3 = cVar.getActivity();
                if (activity3 != null && (supportFragmentManager2 = activity3.getSupportFragmentManager()) != null) {
                    fragmentFindFragmentByTag = supportFragmentManager2.findFragmentByTag("f");
                }
                BottomSheetDialogFragment bottomSheetDialogFragment2 = (BottomSheetDialogFragment) fragmentFindFragmentByTag;
                if (bottomSheetDialogFragment2 != null) {
                    bottomSheetDialogFragment2.dismiss();
                }
                FragmentActivity activity4 = cVar.getActivity();
                if (activity4 == null) {
                    return;
                }
                activity4.finish();
                return;
        }
    }
}
