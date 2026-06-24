package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f7500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7501b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7503m;

    public p(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_name_app_fn);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7500a = textView;
        View viewFindViewById2 = view.findViewById(R.id.tv_desc_app_fn);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f7501b = textView2;
        View viewFindViewById3 = view.findViewById(R.id.iv_logo_app_fn);
        viewFindViewById3.getClass();
        this.f7502l = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_install_fn);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7503m = textView3;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4883w);
    }
}
