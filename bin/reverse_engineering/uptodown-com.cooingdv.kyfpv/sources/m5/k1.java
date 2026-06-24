package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f7445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7446b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7451p;

    public k1(View view, w4.b bVar) {
        super(view);
        this.f7445a = bVar;
        View viewFindViewById = view.findViewById(R.id.iv_icon_installed_app_item);
        viewFindViewById.getClass();
        this.f7446b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_installed_app_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7447l = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_version_installed_app_item);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7448m = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_size_installed_app_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7449n = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_last_update_installed_app_item);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7450o = textView4;
        View viewFindViewById6 = view.findViewById(R.id.tv_excluded_installed_app_item);
        viewFindViewById6.getClass();
        TextView textView5 = (TextView) viewFindViewById6;
        this.f7451p = textView5;
        View viewFindViewById7 = view.findViewById(R.id.rl_installed_app_item);
        viewFindViewById7.getClass();
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4883w);
        ((RelativeLayout) viewFindViewById7).setOnClickListener(new u0(this, 1));
    }
}
