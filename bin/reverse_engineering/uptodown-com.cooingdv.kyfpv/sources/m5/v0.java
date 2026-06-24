package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f7615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7616b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f7619n;

    public v0(View view, w4.b bVar) {
        super(view);
        this.f7615a = bVar;
        View viewFindViewById = view.findViewById(R.id.tv_name_rollback_item);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7616b = textView;
        View viewFindViewById2 = view.findViewById(R.id.tv_version_rollback_item);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f7617l = textView2;
        View viewFindViewById3 = view.findViewById(R.id.tv_size_rollback_item);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f7618m = textView3;
        View viewFindViewById4 = view.findViewById(R.id.iv_icon_rollback_item);
        viewFindViewById4.getClass();
        this.f7619n = (ImageView) viewFindViewById4;
        view.setOnClickListener(new u0(this, 0));
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4883w);
    }
}
