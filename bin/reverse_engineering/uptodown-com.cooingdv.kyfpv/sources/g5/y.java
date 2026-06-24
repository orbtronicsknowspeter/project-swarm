package g5;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c4.ya;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements OnItemViewClickedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TvMyAppsFragment f5365a;

    public y(TvMyAppsFragment tvMyAppsFragment) {
        this.f5365a = tvMyAppsFragment;
    }

    @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
    public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        boolean z9;
        viewHolder.getClass();
        obj.getClass();
        if (obj instanceof x4.e) {
            TvMyAppsFragment tvMyAppsFragment = this.f5365a;
            int i = 2;
            t6.c cVar = null;
            if (tvMyAppsFragment.f3436n) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(tvMyAppsFragment);
                v7.e eVar = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new ya(tvMyAppsFragment, (x4.e) obj, cVar, 12), 2);
                return;
            }
            if (tvMyAppsFragment.f3435m) {
                long j = ((x4.e) obj).F;
                LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(tvMyAppsFragment);
                v7.e eVar2 = o7.m0.f8289a;
                o7.c0.s(lifecycleScope2, t7.n.f10349a, null, new z(tvMyAppsFragment, j, viewHolder, null), 2);
                return;
            }
            x4.e eVar3 = (x4.e) obj;
            if (tvMyAppsFragment.getParentFragmentManager().isDestroyed()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(tvMyAppsFragment.requireContext());
            LayoutInflater layoutInflater = tvMyAppsFragment.getLayoutInflater();
            layoutInflater.getClass();
            int i6 = 0;
            View viewInflate = layoutInflater.inflate(R.layout.tv_dialog_app_selected, (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title_das);
            textView.setTypeface(f4.c.f4883w);
            textView.setText(eVar3.f11123b);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_see_on_uptodown);
            int i10 = 1;
            if (eVar3.F > 0) {
                textView2.setTypeface(f4.c.f4884x);
                textView2.setOnClickListener(new c4.t(tvMyAppsFragment, eVar3, viewHolder, 13));
                z9 = true;
            } else {
                textView2.setVisibility(8);
                z9 = false;
            }
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_open);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_uninstall);
            if (tvMyAppsFragment.getContext() == null || l7.u.m0(tvMyAppsFragment.requireContext().getPackageName(), eVar3.f11124l, true)) {
                textView3.setVisibility(8);
                textView4.setVisibility(8);
            } else {
                textView3.setTypeface(f4.c.f4884x);
                textView3.setOnClickListener(new w(eVar3, tvMyAppsFragment, i6));
                if (eVar3.c()) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setTypeface(f4.c.f4884x);
                    textView4.setOnClickListener(new w(eVar3, tvMyAppsFragment, i10));
                }
                z9 = true;
            }
            float f = UptodownApp.I;
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_old_versions);
            if (tvMyAppsFragment.getContext() == null || l7.u.m0(tvMyAppsFragment.requireContext().getPackageName(), eVar3.f11124l, true)) {
                textView5.setVisibility(8);
            } else {
                textView5.setTypeface(f4.c.f4884x);
                textView5.setOnClickListener(new w(tvMyAppsFragment, eVar3, i));
            }
            TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_exclude);
            if (eVar3.v == 0) {
                textView6.setText(tvMyAppsFragment.getString(R.string.not_offer_updates));
            } else {
                textView6.setText(tvMyAppsFragment.getString(R.string.offer_updates_again));
            }
            textView6.setTypeface(f4.c.f4884x);
            textView6.setOnClickListener(new w(tvMyAppsFragment, eVar3, 3));
            if (z9) {
                builder.setView(viewInflate);
                AlertDialog alertDialogCreate = builder.create();
                tvMyAppsFragment.f3434l = alertDialogCreate;
                alertDialogCreate.getClass();
                alertDialogCreate.show();
            }
        }
    }
}
