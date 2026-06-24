package g5;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.PageRow;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends BrowseSupportFragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f5356l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BackgroundManager f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayObjectAdapter f5358b;

    @Override // androidx.leanback.app.BrowseSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BackgroundManager backgroundManager;
        super.onCreate(bundle);
        setHeadersState(1);
        setHeaderPresenterSelector(new s());
        setBadgeDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_uptodown_app_store_white));
        setHeadersTransitionOnBackEnabled(true);
        setBrandColor(ContextCompat.getColor(requireContext(), R.color.tv_background_gradient_end));
        setSearchAffordanceColor(ContextCompat.getColor(requireContext(), R.color.transparent));
        setOnSearchClickedListener(new c4.d(this, 20));
        prepareEntranceTransition();
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        this.f5358b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        PageRow pageRow = new PageRow(new c5.a(R.drawable.vector_tv_header_home, 1L));
        ArrayObjectAdapter arrayObjectAdapter2 = this.f5358b;
        arrayObjectAdapter2.getClass();
        arrayObjectAdapter2.add(pageRow);
        PageRow pageRow2 = new PageRow(new c5.a(R.drawable.vector_tv_header_games, 2L));
        ArrayObjectAdapter arrayObjectAdapter3 = this.f5358b;
        arrayObjectAdapter3.getClass();
        arrayObjectAdapter3.add(pageRow2);
        PageRow pageRow3 = new PageRow(new c5.a(R.drawable.vector_tv_header_top, 3L));
        ArrayObjectAdapter arrayObjectAdapter4 = this.f5358b;
        arrayObjectAdapter4.getClass();
        arrayObjectAdapter4.add(pageRow3);
        PageRow pageRow4 = new PageRow(new c5.a(R.drawable.vector_tv_header_management, 4L));
        ArrayObjectAdapter arrayObjectAdapter5 = this.f5358b;
        arrayObjectAdapter5.getClass();
        arrayObjectAdapter5.add(pageRow4);
        startEntranceTransition();
        BackgroundManager backgroundManager2 = BackgroundManager.getInstance(getActivity());
        this.f5357a = backgroundManager2;
        if (backgroundManager2 != null && !backgroundManager2.isAttached() && (backgroundManager = this.f5357a) != null) {
            backgroundManager.attach(requireActivity().getWindow());
        }
        getMainFragmentRegistry().registerFragment(PageRow.class, new r());
    }
}
