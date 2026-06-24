package m5;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f7314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f7315b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RelativeLayout f7316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7317m;

    public b0(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rl_old_versions_footer);
        viewFindViewById.getClass();
        this.f7314a = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rl_back_versions);
        viewFindViewById2.getClass();
        this.f7315b = (RelativeLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rl_forward_versions);
        viewFindViewById3.getClass();
        this.f7316l = (RelativeLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_current_page_versions);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f7317m = textView;
        textView.setTypeface(f4.c.f4883w);
    }
}
